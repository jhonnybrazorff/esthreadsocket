package com.threadsocket;

public class Spettacolo {

    //variabili e costruttore
    private int capienza = 30;

    public Spettacolo(int capienza){
        this.capienza = capienza;
    }

    public int disponibilità = capienza;

    public int postiDisponibili(){

        return getDisponibilità();

    }

    public void prenotazione(int nPrenotazioni){

        if(nPrenotazioni<disponibilità && nPrenotazioni > 0){
            disponibilità -= nPrenotazioni;
            System.out.println("Prenotazione accettata: i posti disponibili sono ora " + disponibilità);
        }
        System.out.println("Prenotazione Negata");
    }


    //getters and setters

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public int getDisponibilità() {
        return disponibilità;
    }

    public void setDisponibilità(int disponibilità) {
        this.disponibilità = disponibilità;
    }

    @Override
    public String toString() {
        return "Spettacolo [capienza=" + capienza + ", disponibilità=" + disponibilità + "]";
    }

}
