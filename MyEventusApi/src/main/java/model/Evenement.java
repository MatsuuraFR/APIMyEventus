package model;

import java.util.Date;

public class Evenement {


    private int uid;
    private String lien;
    private String Information_Pratiques;
    private String image;
    private String langue;
    private String titre;
    private String description;
    private String details;
    private String mots_cles;
    private String latlong;
    private String place;
    private String adresse;
    private String departement;
    private String region;
    private String ville;
    private Date dateDebut;
    private Date dateFin;
    private String timeTable;
    private String tarif;
    private Date datMiseAJour;

    
    public Evenement(int uid, String lien, String information_Pratiques, String image, String langue, String titre,
            String description, String details, String mots_cles, String latlong, String place, String adresse,
            String departement, String region, String ville, Date dateDebut, Date dateFin, String timeTable,
            String tarif, Date datMiseAJour) {
        this.uid = uid;
        this.lien = lien;
        Information_Pratiques = information_Pratiques;
        this.image = image;
        this.langue = langue;
        this.titre = titre;
        this.description = description;
        this.details = details;
        this.mots_cles = mots_cles;
        this.latlong = latlong;
        this.place = place;
        this.adresse = adresse;
        this.departement = departement;
        this.region = region;
        this.ville = ville;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.timeTable = timeTable;
        this.tarif = tarif;
        this.datMiseAJour = datMiseAJour;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getLien() {
        return lien;
    }
    public void setLien(String lien) {
        this.lien = lien;
    }
    public String getInformation_Pratiques() {
        return Information_Pratiques;
    }
    public void setInformation_Pratiques(String information_Pratiques) {
        Information_Pratiques = information_Pratiques;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getMots_cles() {
        return mots_cles;
    }
    public void setMots_cles(String mots_cles) {
        this.mots_cles = mots_cles;
    }
    public String getLatlong() {
        return latlong;
    }
    public void setLatlong(String latlong) {
        this.latlong = latlong;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getDepartement() {
        return departement;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public Date getDateDebut() {
        return dateDebut;
    }
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }
    public Date getDateFin() {
        return dateFin;
    }
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    public String getTimeTable() {
        return timeTable;
    }
    public void setTimeTable(String timeTable) {
        this.timeTable = timeTable;
    }
    public String getTarif() {
        return tarif;
    }
    public void setTarif(String tarif) {
        this.tarif = tarif;
    }
    public Date getDatMiseAJour() {
        return datMiseAJour;
    }
    public void setDatMiseAJour(Date datMiseAJour) {
        this.datMiseAJour = datMiseAJour;
    }


    
}
