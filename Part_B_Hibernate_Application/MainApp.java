package com.example.hibernatecrud;

public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Create
        dao.create(new Student("Alice", "Spring Boot"));
        dao.create(new Student("Bob", "Hibernate ORM"));

        // Read
        System.out.println(dao.read(1));

        // Update
        Student s = dao.read(1);
        s.setCourse("Advanced Spring Boot");
        dao.update(s);

        // Delete
        dao.delete(2);
    }
}
