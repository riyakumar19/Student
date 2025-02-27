package com.example.demo.controller;

import com.example.demo.modal.Student;
import com.example.demo.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/students")
public class Controllers
{
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> StudentInfo(){
        return studentService.getAllStudents();
    }
//    @GetMapping("/{id}")
//    public Optional<studentModal> getById(@PathVariable int id){
//        return studentService.
//    }
    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return studentService.getById(id);
    }


    @PostMapping("")
    public Student add(@RequestBody Student student){

        return studentService.add(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        return studentService.update(id, student);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        studentService.delete(id);
        return "Student deleted";
    }





}
