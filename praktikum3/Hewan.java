/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author muhsu
 */
public class Hewan {
    private String nama;
    private int umur;
    
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }

    void suara() {
        System.out.println("Hewan Bersuara");
    }
    void info() {
        System.out.println("Tersebut Adalah Kucing Yang Bernama " + nama + " Yang Berumur " + umur + " Tahun");
    }
    void berlari() {
        System.out.println("Hewan sedang berlari");
    }
}
