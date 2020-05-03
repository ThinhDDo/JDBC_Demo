/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author doduy
 */
public class Student {
    public int id;
    public String hoten;
    public String ngaysinh;
    public String sodienthoai;

    /**
     * Empty Constructor
     */
    public Student(){}
    
    /**
     * Tạo đối tượng Student
     * @param id
     * @param hoten
     * @param ngaysinh
     * @param sodienthoai 
     */
    public Student(int id, String hoten, String ngaysinh, String sodienthoai) {
        this.id = id;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sodienthoai = sodienthoai;
    }
    
    /**
     * Tạo đối tượng Student
     * @param hoten
     * @param ngaysinh
     * @param sodienthoai 
     */
    public Student(String hoten, String ngaysinh, String sodienthoai) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.sodienthoai = sodienthoai;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", sodienthoai=" + sodienthoai + '}';
    }
}
