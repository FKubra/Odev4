public class PersonelTest {

    public static void main(String[] args) {
        Personel personel1 = new Personel();
        Personel personel2 = new Personel();
        Personel personel3 = new Personel();

        personel1.ad = "Deniz";
        personel1.soyad = "Uygun";
        personel1.departman ="Satış";
        personel1.maas = 10000;

        personel2.ad = "Gökçen";
        personel2.soyad = "Araz";
        personel2.departman = "IT";
        personel2.maas = 15000;

        personel3.ad = "Ilgaz";
        personel3.soyad = "Giray";
        personel3.departman = "Muhasebe";
        personel3.maas = 12000;

        personel1.personelBilgisiniGetir();
        personel2.personelBilgisiniGetir();
        personel3.personelBilgisiniGetir();



    }
}
