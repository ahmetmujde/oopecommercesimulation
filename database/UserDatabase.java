package database;

import element.User;

public class UserDatabase {

    private static User user = null;

    private UserDatabase() {

    }

    public static User getUser() {
        return user;
    }

    public static void setUser(User createdUser) {
        user = createdUser;
    }
}
