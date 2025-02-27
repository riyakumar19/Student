package com.example.demo.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


import lombok.Getter;
import lombok.Setter;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="Student")
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
        private int id;
        private int age;
        private String name;
        private int standard; // Fixed naming
        private int noOfCourses;

        // Default Constructor (Required by JPA)
        public Student() {}
        public Student(int id, int age, String name, int standard, int noOfCourses) {
                this.id = id;
                this.age = age;
                this.name = name;
                this.standard = standard;
                this.noOfCourses = noOfCourses;
        }


        // Parameterized Constructor

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getStandard() {
                return standard;
        }

        public void setStandard(int standard) {
                this.standard = standard;
        }

        public int getNoOfCourses() {
                return noOfCourses;
        }

        public void setNoOfCourses(int noOfCourses) {
                this.noOfCourses = noOfCourses;
        }


        // Getters



    }

