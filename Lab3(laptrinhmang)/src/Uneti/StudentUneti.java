/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uneti;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class StudentUneti implements Imark{
      private String stuID;
      private String stuName;
      private String gender;
      private String birthday;
      private String nativePlace;

    public StudentUneti() {
    }
    
    

    public StudentUneti(String stuID, String stuName, String gender, String birthday, String nativePlace) {
        this.stuID = stuID;
        this.stuName = stuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
      
    
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên");
        this.stuID = sc.nextLine();
        System.out.println("Tên sinh viên : ");
        this.stuName = sc.nextLine();
        System.out.println("Giới tính : ");
        this.gender = sc.nextLine();
        System.out.println("Ngày sinh : ");
        this.birthday =  sc.nextLine();
        System.out.println("Quê quán : ");
        this.nativePlace= sc.nextLine();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Mã sinh viên : " + this.stuID);
        System.out.println("Tên sinh viên : " + this.stuName);
        System.out.println("Giới tính : " + this.gender);
        System.out.println("Ngày sinh : " +this.birthday);
        System.out.println("Quê Quán : "+ this.nativePlace);//To change body of generated methods, choose Tools | Templates.
    }
      
}
