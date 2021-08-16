package com.example.angular.springbootcrudapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String Name;
    private int TangalLahir;
    private String Jabatan;
    private int NIP;
    private String JenisKelamin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getTangalLahir() {
        return TangalLahir;
    }

    public void setTangalLahir(int tangallahir) {
        this.TangalLahir = tangallahir;
    }
    
    public String getJabatan() {
        return Jabatan;
    }

    public void setJabatan(String jabatan) {
        this.Jabatan = jabatan;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int nip) {
        this.NIP = nip;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String jeniskelamin) {
        this.JenisKelamin = jeniskelamin;
    }
}
