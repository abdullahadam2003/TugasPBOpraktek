/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abdullahadam28042003;

/**
 *
 * @author windows
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord annaRecord = new StudentRecord();
        annaRecord.setName("Anna");
        annaRecord.setAddress ("Padang");
        annaRecord.setAge(23);
        annaRecord.setMathGrade(80);
        annaRecord.setEnglishGrade(70);
        annaRecord.setScienceGrade(80);
        
        
        //Tampilkan
        System.out.println("Nama     :"+annaRecord.getName ());
          System.out.println("Alamat     :"+annaRecord.getAddress ());
            System.out.println("Umur     :"+annaRecord.getAge ());
              System.out.println("Matematika     :"+annaRecord.getMathGrade ());
                System.out.println("B Inggriss     :"+annaRecord.getEnglishGrade ());
                  System.out.println("Ilmu Pengetahuan     :"+annaRecord.getScienceGrade());
                    System.out.println("Rata-rata Nilai     :"+annaRecord.getAverage ());
                     System.out.println("nilaiAngka       :"+annaRecord.getNilai());
                     
        StudentRecord aliRecord = new StudentRecord();
        aliRecord.setName("Ali");
        aliRecord.setAddress("Padang");
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
        StudentRecord budiRecord = new StudentRecord("Budi","Bukittinggi");
        budiRecord.print("");
        
        System.out.println("\nJumlah siswa : "+StudentRecord.getStudentCount());
        
                
    }
     
}
