public class Pracownik {
    int id;
    String imie;
    String nazwisko;
    Stanowisko stanowisko;
    int placa;
    Umowa umowa;

    public Pracownik(int id,String imie, String nazwisko, Stanowisko stanowisko, int placa, Umowa umowa) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.placa = placa;
        this.umowa = umowa;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    public int getPlaca() {
        return placa;
    }

    public Umowa getUmowa() {
        return umowa;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStanowisko(Stanowisko stanowisko) {
        this.stanowisko = stanowisko;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public void setUmowa(Umowa umowa) {
        this.umowa = umowa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id+". "+imie+" "+nazwisko+" - "+stanowisko+" - "+placa+"zł - "+umowa;
    }
}
