package week01;

public class methodParameters {
    static String ogrenciSistemi(String ad,int numara,int not) {
        return "Öğrenci: " + ad + " " + " - No: " + numara + " - Sınav Notu: " + not;
        }

    static void main() {
        String[] isimler = {"Alp", "İsmet", "Bora"};
        int[] numaralar = {2021067, 2021007, 2021034};
        int[] notlar = {95, 100, 90};

        System.out.println("ÖĞRENCİ NOT LİSTESİ");

        for (int i = 0; i < isimler.length; i++) {

            System.out.println(ogrenciSistemi(isimler[i], numaralar[i], notlar[i]));
        }
    }
    }


