/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author B3229
 */
@Entity
public class Partenaires implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)  
    private int id;
    private int numPartenaire;
    private String adrMail;

    public Partenaires() {
        
    }

    public Partenaires(int numPartenaire, String adrMail) {
        this.numPartenaire = numPartenaire;
        this.adrMail = adrMail;
    }
    
    public int getId() {
        return id;
    }
    
}
