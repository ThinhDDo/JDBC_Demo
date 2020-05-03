/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhdo.jdbc_demo;

import java.util.List;
import models.Student;

/**
 *
 * @author doduy
 */
public class MainClass {
    
    /**
     * Hàm in ra danh sách sinh viên
     */
    public static void print() {
        System.out.println("~~~DANH SACH SINH VIEN~~~");
        List<Student> students = StudentDbAccess.getStudents();
        for(Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        
        // IN RA DANH SÁCH SINH VIÊN
        print();
        
        // TÌM SINH VIÊN CÓ ID LÀ 4
        System.out.println("SINH VIEN CO ID = 4:");
        System.out.println("Sinh vien: " + StudentDbAccess.getStudentById(4));
        System.out.println("");
        
        // THÊM SINH VIÊN MỚI 
        /*
            HỌ TÊN: NGUYỄN VĂN A
            NGÀY SINH: 14/04/1994
            SỐ ĐIỆN THOẠI: 0909045045
        */
        System.out.println("THEM SINH VIEN MOI:");
        System.out.print("HO TEN: NGUYEN VAN A, NAM SINH: 14/04/1994");
        StudentDbAccess.addStudent(new Student("Nguyễn VAN A", "1994/04/14", "0909045045"));
        System.out.println("");
        print();
        
        // Xoá sinh viên với id là 6
        System.out.println("XOA SINH VIEN:");
        StudentDbAccess.deleteStudent(8);
        System.out.println("");
        print();
        
        // Cập nhật thông tin sinh viên
        System.out.println("Cập nhật thông tin của sinh viên NGUYEN VAN A thanh NGUYEN THI B");
        StudentDbAccess.updateStudent(new Student(11, "Nguyễn VAN B", "1994/04/14", "0909045045"));
        print();
    }
}
