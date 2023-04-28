/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abdullahadam28042003;

/**
 *
 * @author windows
 */
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private Double mathGrade;
    private Double englishGrade;
    private Double scienceGrade;
    private Double average;
    private char nilai;
    
    private static int studentCount;
    
    public StudentRecord(){
        studentCount++;
    }
    public StudentRecord(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord(String name, String address){
        this.name =name;
        this.address = address;
        studentCount++;
    }
    public StudentRecord(double mGrade, double eGrade, double sGrade){
        mathGrade =mGrade;
        englishGrade =eGrade;
        scienceGrade =sGrade;
        studentCount++;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
     
    public void setScienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }
    
    public static int getStudentCount (){
        return studentCount;
    }
     public void print(String temp){
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
    }
    
    public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name:" + name);
        System.out.println("Math Grade:" + mGrade);
        System.out.println("English Grade:" + eGrade);
        System.out.println("Science Grade:"+ sGrade);
    }

    public char getNilai(){
        if(average > 80){
            nilai ='A';
        }
        else if(average > 65){
            nilai ='B';
        }
        else if(average > 55){
            nilai ='C';
        }    
            
        else if(average > 40){
            nilai ='D';
            
        }else if(average > 0){
            nilai ='E';
            
        }
        return nilai;
    }
        
    
          
}