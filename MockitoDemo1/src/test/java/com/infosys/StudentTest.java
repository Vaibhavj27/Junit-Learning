package com.infosys;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class StudentTest {

    StudentService studentService= Mockito.mock(StudentService.class);
    Student student=new Student(studentService);


    @Test
    void testAverage() {
        int expected = 50;
        Mockito.when(studentService.getTotalMarks()).thenReturn(500); //stubbing
        Mockito.when(studentService.getTotalStudents()).thenReturn(10);//stubbing

        Assertions.assertEquals(expected, student.getAverageMarks());

    }
}
