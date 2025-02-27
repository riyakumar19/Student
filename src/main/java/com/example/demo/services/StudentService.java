package com.example.demo.services;

import com.example.demo.modal.Student;
import com.example.demo.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }
    public Student add(Student Student){
        return repository.save(Student);
    }
    public Student getById(int id){
        Optional<Student> opt = repository.findById(id);
        if(opt.isPresent()) {
            return opt.get();
        }
        else {
            throw new RuntimeException("Student not present in DATABASE");
        }

    }
    public Student update(int id, Student details) {
        Optional<Student> optional = repository.findById(id); // Fixed Optional declaration

        if (optional.isPresent()) {
            Student student = optional.get();
            student.setName(details.getName());
            student.setAge(details.getAge());
            student.setStandard(details.getStandard());
            student.setNoOfCourses(details.getNoOfCourses());
            return repository.save(student);
        } else {
            throw new RuntimeException("Student not found");
        }
    }

    public void delete(int id){
        repository.deleteById(id);
    }



}