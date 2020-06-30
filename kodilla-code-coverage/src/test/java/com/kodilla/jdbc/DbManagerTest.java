package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTest {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String dropForeignKey = "ALTER TABLE POSTS\n" +
                "DROP FOREIGN KEY posts_ibfk_1";
        String deletePostsQuery = "TRUNCATE TABLE POSTS";
        String deleteUsersQuery = "TRUNCATE TABLE USERS";
        String createForeignKeyQuery = "ALTER TABLE POSTS\n" +
                "ADD FOREIGN KEY (USER_ID)\n" +
                "REFERENCES USERS(ID)";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(dropForeignKey);
        statement.executeUpdate(deletePostsQuery);
        statement.executeUpdate(deleteUsersQuery);
        statement.executeUpdate(createForeignKeyQuery);
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('John', 'Smith')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Stephanie', 'Kovalsky')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Thomas', 'Landgren')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('John', 'Thomson')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (1, 'This is my first post on this forum!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (2, 'This is my first post too!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (2, 'How are you?')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (1, 'Quite good, thanks bro!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS(USER_ID, BODY) VALUES (4, 'Yo all! Here is Thomas!')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1\n" +
                "ORDER BY U.LASTNAME, U.FIRSTNAME";
        statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }

        Assert.assertEquals(2, counter);
        rs.close();
        statement.close();
    }

}
