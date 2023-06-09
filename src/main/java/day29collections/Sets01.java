package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
 /* Hashset==> setlerin en hızlısı (speedyGonzales) ...

LinkedHashSet==>insertion (Ekleme sırasına göre diziyor . çaba var . sıraya koyacak o yüzden yavaş.
 TreeSet  ==>Natural Order'a göre diziyor .Alphabetik ve Numeric . işte bu yüzden çok yavaş.*/


    /*
    1)Setler tekrarsiz eleman(unique) depolamak icin kullanilir
    2)3 tane set class vardir
      a)HashSet Class:
           "Hash" benzersiz bir id olusturma teknigidir. Bu teknige "Hashing Technique" denir
           "HashSet" elemanlari rastgele siralar
           "HashSet" elemanlari siralamadigindan cok hizli calisir.
           "HashSet" ler "null" i eleman olarak kabul eder
           "HashSet" ler tekrarsiz eleman depolamak icindir. bu yüzden null bile olsa sadece bi defa kullanilir

      b)LinkedHashSet Class:
           "LinkedHashSet" elemanlari sizin verdiginiz siraya göre dizdiklerinden(insertion order)
            "HashSet" lere göre yavastirlar
           "LinkedHashSet" ler tekrarsiz eleman depolamak icindir

      c)TreeSet Class
           "TreeSet" ler elemanlari natural order ile (kücükten büyüge yada alfabetik siraya göre) dizerler
           "TreeSet" ler elemanlari natural order a göre dizdiklerinden cok yavastirlar,hatta en yavas settirler.
           En yavas set "TreeSet" tir.

     3)"TreeSet" cook yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisir */


        HashSet<String> hs = new HashSet<>();
        hs.add("Mustafa");
        hs.add("Suat");
        hs.add("Saadet");
        hs.add("Fevzi");
        hs.add("Ali");
        hs.add("Veli");
        hs.add("Can");
        hs.add(null);
        System.out.println(hs);//[[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]

        hs.add("Mustafa");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler
        System.out.println(hs);//[null, Can, Mustafa, Suat, Veli, Saadet, Fevzi, Ali]
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(19);
        lhs.add(13);
        lhs.add(-35);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[7, 19, 13, -35, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(7);
        ls.add(119);
        ls.add(13);
        ls.add(353);
        ls.add(313);


        lhs.retainAll(ls);
        System.out.println(lhs);//[7, 13]
        System.out.println(ls);//[7, 119, 13, 353, 313]



        TreeSet<Character> ts = new TreeSet<>();
        ts.add('E');
        ts.add('G');
        ts.add('B');
        ts.add('A');
        ts.add('L');
        ts.add('T');
        ts.add('Z');
        //ts.add(null); //Treeset lere nul eklenmez , hata verir
        System.out.println(ts);
        System.out.println(ts.first()); //A
        System.out.println(ts.last());  //Z

        System.out.println(ts.lower('E')); //B==> Verilen eleman olan E den bbir önceki elemani verir
        System.out.println(ts.lower('F')); //E==>Verilen eleman olan F olmadigi icin olsaydi nerede olurduyu bulup bi oncekini yazar
        System.out.println(ts.lower('A')); //null

        System.out.println(ts.higher('L')); //T==> Verilen eleman olan B den bbir sonraki elemani verir
        System.out.println(ts.higher('N')); //T

        System.out.println(ts.headSet('G')); //[A,B,E]
        System.out.println(ts.headSet('G', true)); // [A,B,E,G]

        System.out.println(ts.tailSet('L')); // [L, T, Z]
        System.out.println(ts.tailSet('L', false)); // [T,Z]

        System.out.println(ts.ceiling('T'));// T ==> Eleman set in icinde varsa elemanin kendisini verir.
        System.out.println(ts.ceiling('O'));//T ==> Eleman set in icinde yoksa sonraki elemani return eder.

        System.out.println(ts.floor('B'));//B ==> Eleman set in icinde varsa elemanin kendisini verir.
        System.out.println(ts.floor('D'));//B ==>  Eleman set in icinde yoksa onceki elemani return eder.

        System.out.println(ts.subSet('B', 'L'));//[B, E, G]
        System.out.println(ts.subSet('B',false, 'L',true));//[E , G, L]





    }
}
