public class Main {
    public static void main(String[] args) {
        // MyList Sınıfının Test Edilmesi

        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        // get(int index) metodu testi
        System.out.println("2. indisteki değer : " + liste.get(2));

        // remove(int index) metodu testi
        liste.remove(2);
        System.out.println("2. indisteki değer : " + liste.get(2));

        // set(int index, T data) metodu testi
        liste.set(0, 100);
        System.out.println("0. indisteki değer : " + liste.get(0));

        // toString() metodu testi
        System.out.println("Liste: " + liste.toString());

        // indexOf(T data) ve lastIndexOf(T data) metodları testi
        System.out.println("Indeks : " + liste.indexOf(20));
        System.out.println("Son indeks : " + liste.lastIndexOf(20));

        // isEmpty() metodu testi
        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Boş" : "Dolu"));

        // toArray() metodu testi
        Object[] dizi = liste.toArray();
        System.out.println("Object dizisinin ilk elemanı : " + dizi[0]);

        // sublist(int start, int finish) metodu testi
        MyList<Integer> altListem = liste.subList(0, 3);
        System.out.println("Alt Liste: " + altListem.toString());

        // contains(T data) metodu testi
        System.out.println("Listemde 20 değeri : " + liste.contains(20));
        System.out.println("Listemde 120 değeri : " + liste.contains(120));

        // clear() metodu testi
        liste.clear();
        System.out.println("Liste temizlendi: " + liste.toString());
    }
}
/*
MyList<Integer> liste = new MyList<>();: Yeni bir MyList nesnesi oluşturur ve başlangıçta dizinin boyutunu 10 olarak ayarlar.
liste.add(10);: Listenin sonuna yeni bir eleman ekler.
liste.get(2);: İkinci indisteki elemanı döndürür.
liste.remove(2);: İkinci indisteki elemanı siler ve diğer elemanları sola kaydırır.
liste.set(0, 100);: İlk indisteki elemanı 100 olarak günceller.
liste.toString();: Listedeki tüm elemanları bir dize olarak döndürür.
liste.indexOf(20); ve liste.lastIndexOf(20);: 20 değerinin ilk ve son göründüğü indisi döndürür.
liste.isEmpty();: Listenin boş olup olmadığını kontrol eder.
liste.toArray();: Listeyi bir diziye çevirir.
liste.subList(0, 3);: Belirtilen aralıktaki elemanlardan oluşan bir alt liste döndürür.
liste.contains(20);: 20 değerinin listede olup olmadığını kontrol eder.
liste.clear();: Listeyi temizler.
 */
