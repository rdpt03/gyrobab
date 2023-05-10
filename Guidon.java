/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyro.bab;

import java.util.Date;

/**
 *
 * @author rlarralde
 */
public class Guidon extends Gyropode{

    
    private double hauterGuidon;
    private double volCoffreLateral;
    private double volCoffreAvant;
    private double surfacePorteBagage;
    

    public double getHauterGuidon() {
        return hauterGuidon;
    }

    public void setHauterGuidon(double hauterGuidon) {
        this.hauterGuidon = hauterGuidon;
    }

    public double getVolCoffreLateral() {
        return volCoffreLateral;
    }

    public void setVolCoffreLateral(double volCoffreLateral) {
        this.volCoffreLateral = volCoffreLateral;
    }

    public double getVolCoffreAvant() {
        return volCoffreAvant;
    }

    public void setVolCoffreAvant(double volCoffreAvant) {
        this.volCoffreAvant = volCoffreAvant;
    }

    public double getSurfacePorteBagage() {
        return surfacePorteBagage;
    }

    public void setSurfacePorteBagage(double surfacePorteBagage) {
        this.surfacePorteBagage = surfacePorteBagage;
    }
    
    public Guidon(double hauterGuidon, double volCoffreLateral, double volCoffreAvant, double surfacePorteBagage, String nRference, String nSerieConstructeur, String couleur, Date dateAchat, int nUtilisations, double nKmEffectue, double nHeureRoule, double latitude, double longitude, double niveauBatterie, double dureeRouageRestant, double tempsRechargeEstime, boolean bloque, boolean enMaintenance, int nUtilisationsTotal, double nKmTotal, double nHeuresTotal) {
        super(nRference, nSerieConstructeur, couleur, dateAchat, nUtilisations, nKmEffectue, nHeureRoule, latitude, longitude, niveauBatterie, dureeRouageRestant, tempsRechargeEstime, bloque, enMaintenance);
        this.hauterGuidon = hauterGuidon;
        this.volCoffreLateral = volCoffreLateral;
        this.volCoffreAvant = volCoffreAvant;
        this.surfacePorteBagage = surfacePorteBagage;
    }

    @Override
    public String toString() {
        return super.toString()+"Guidon{" + "hauterGuidon=" + hauterGuidon + ", volCoffreLateral=" + volCoffreLateral + ", volCoffreAvant=" + volCoffreAvant + ", surfacePorteBagage=" + surfacePorteBagage + '}';
    }
    
    
}
