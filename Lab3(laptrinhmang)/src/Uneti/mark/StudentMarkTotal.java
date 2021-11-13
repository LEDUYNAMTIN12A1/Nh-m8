/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Uneti.mark;

/**
 *
 * @author Nam
 */
public class StudentMarkTotal extends StudentMark{
    private int totalExamSubject;
    private float everageMark;

    public StudentMarkTotal(int totalExamSubject, float everageMark) {
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }

    public StudentMarkTotal(int totalExamSubject, float everageMark, String StuId, String className, String subjectName, int semester, float mark) {
        super(StuId, className, subjectName, semester, mark);
        this.totalExamSubject = totalExamSubject;
        this.everageMark = everageMark;
    }
    
    public int getTotalExamSubject(StudentMarkTotal[] arr) {
        return arr.length;
    }
    public void calculateEverageMark(StudentMarkTotal[] arr) {
        for (int i = 0; i < arr.length; i++) {
        everageMark+=arr[i].getMark();
        }
    }

    public int getTotalExamSubject() {
        return totalExamSubject;
    }

    public void setTotalExamSubject(int totalExamSubject) {
        this.totalExamSubject = totalExamSubject;
    }

    public float getEverageMark() {
        return everageMark;
    }

    public void setEverageMark(float everageMark) {
        this.everageMark = everageMark;
    }
    
}
