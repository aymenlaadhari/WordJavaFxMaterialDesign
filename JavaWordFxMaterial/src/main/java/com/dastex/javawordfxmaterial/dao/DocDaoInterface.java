/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dastex.javawordfxmaterial.dao;



import com.dastex.javawordfxmaterial.model.Artikel;
import com.dastex.javawordfxmaterial.model.Kunden;
import java.util.List;

/**
 *
 * @author aladhari
 */
public interface DocDaoInterface {
    public List<Kunden> getListKunden();
    public Kunden getKundenByCriteria();
    public List<Artikel> getListArtikel();
    public Artikel getArtikle(String artNummer);
 
    
}
