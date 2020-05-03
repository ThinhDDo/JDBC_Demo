/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thinhdo.jdbc_demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.Student;

/**
 *
 * @author doduy
 */
public class StudentDbAccess {
    
    /**
     * Trả về danh sách sinh viên 
     * @return List<Student>
     */
    public static List<Student> getStudents() {
        
        StringBuilder query = new StringBuilder("Select * from sinhvien");
        Connection connection = DatabaseHelper.getConnection();
        List<Student> students = new ArrayList<Student>();
        
        try(Statement sm = connection.createStatement()) {
            try(ResultSet rs = sm.executeQuery(query.toString())) {
                while(rs.next()) {
                    students.add(
                            new Student(rs.getInt("id"), 
                                        rs.getString("hoten"), 
                                        rs.getString("namsinh"), 
                                        rs.getString("sodienthoai")));
                }
            }
            
            connection.close();
        } catch(SQLException sqle) {
            System.out.println("Truy vấn thất bại");
        }
       
        return students;
    }
    
    /**
     * Trả về sinh viên với id phù hợp
     * @param id
     * @return student
     */
    public static Student getStudentById(int id) {
        StringBuilder query = new StringBuilder("Select * from sinhvien where id = ").append(id);
        Connection connection = DatabaseHelper.getConnection();
        Student student = new Student();
        
        try(Statement sm = connection.createStatement()) {
            try(ResultSet rs = sm.executeQuery(query.toString())) {
                while(rs.next()) {
                    student = new Student(rs.getInt("id"), 
                                        rs.getString("hoten"), 
                                        rs.getString("namsinh"), 
                                        rs.getString("sodienthoai"));
                }
            }
            
            connection.close();
        } catch(SQLException sqle) {
            System.out.println("Truy vấn thất bại");
        }
       
        return student;
    }
    
    /**
     * Thêm sinh viên mới 
     * @param student 
     */
    public static void addStudent(Student student) {
        StringBuilder query = 
                new StringBuilder("insert into sinhvien(hoten, namsinh, sodienthoai) values ('")
                        .append(student.hoten + "','")
                        .append(student.ngaysinh + "','")
                        .append(student.sodienthoai + "')");
        Connection connection = DatabaseHelper.getConnection();
        
        try(Statement sm = connection.createStatement()) {
            sm.executeUpdate(query.toString());
            System.out.println("Them sinh vien THANH CONG");
            connection.close();
        } catch(SQLException sqle) {
            System.out.println("Them sinh vien THAT BAI" + sqle.toString());
        }
    }
    
    /**
     * Xoá nhân viên với id phù hợp
     * @param student 
     */
    public static void deleteStudent(int id) {
        StringBuilder query = new StringBuilder("delete from sinhvien where id = ").append(id);
        Connection connection = DatabaseHelper.getConnection();
        
        try(Statement sm = connection.createStatement()) {
            sm.executeUpdate(query.toString());
            System.out.println("Xoa sinh vien THANH CONG");
            connection.close();
        } catch(SQLException sqle) {
            System.out.println("Xoa sinh vien THAT BAI" + sqle.toString());
        }
    }
    
    /**
     * Cập nhật thông tin sinh viên
     * @param student 
     */
    public static void updateStudent(Student student) {
        StringBuilder query = 
                new StringBuilder("update sinhvien set hoten = '")
                        .append(student.hoten + "', namsinh = '")
                        .append(student.ngaysinh + "', sodienthoai = '")
                        .append(student.sodienthoai + "' where id = ").append(student.getId());
        Connection connection = DatabaseHelper.getConnection();
        
        try(Statement sm = connection.createStatement()) {
            sm.executeUpdate(query.toString());
            System.out.println("Cap nhat sinh vien THANH CONG");
            connection.close();
        } catch(SQLException sqle) {
            System.out.println("Cap nhat sinh vien THAT BAI" + sqle.toString());
        }
    }
}
