/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import DAO.AdresDAO;
import DAO.GrupDAO;
import DAO.IlDAO;
import DAO.KisiDAO;
import Entity.Adres;
import Entity.Grup;
import Entity.Il;
import Entity.Kisi;

public class test {
    public static void main(String[] args) {
        Kisi kisi = new Kisi("eminakbulut","1234");
        KisiDAO kisiDao = new KisiDAO();
        GrupDAO grupDao = new GrupDAO();
        Grup grup = grupDao.get(grupDao.create(new Grup("admin",true,true,true)));
        kisi.setGrup(grup);
        kisiDao.create(kisi);


        
    }
            
}
