/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package entity;

/**
 * Kelas    : PBO C
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. I Made Wisnu Dharmapranaya    (210711352)
 * 3. Kevin Edgard Halim            (210711376)
 */
public class Mahasiswa {
    private String npm;
    private String namaMhs;
    private Prodi prodi;
    
    public Mahasiswa(String npm,String namaMhs, Prodi prodi) {
        this.npm = npm;
        this.namaMhs = namaMhs;
        this.prodi = prodi;
    }

    public String getNPM() {
        return npm;
    }
    public String getNamaMahasiswa() {
        return namaMhs;
    }
    public Prodi getProdi() {
        return prodi;
    }

}
