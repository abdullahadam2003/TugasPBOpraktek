/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adam.abdullah.dao;
import Adam.abdullah.model.Buku;
import java.util.List;
/**
 *
 * @author Adam
 */
public interface BukuDao {
     void insert(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    List<Buku> getAll();
}
