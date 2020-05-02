package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgOld = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPosts)
                .mapToInt(m -> m)
                .average()
                .getAsDouble();
        System.out.println(avgOld);

        double avgYoung = UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPosts)
                .mapToInt(m -> m)
                .average()
                .getAsDouble();
        System.out.println(avgYoung);
    }
}
