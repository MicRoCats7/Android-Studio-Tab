package com.example.tab;

import java.util.ArrayList;

public class KenmaData {

    private static int[] gambarKarya = {
            R.drawable.kenma11,
            R.drawable.kenma11,
            R.drawable.kenma11,
            R.drawable.kenma11,
            R.drawable.kenma9,
            R.drawable.kenma10,
            R.drawable.kenma9,
            R.drawable.kenma10
    };

    public static ArrayList<Kenma> getListData() {
        ArrayList<Kenma> list = new ArrayList<>();
        for (int position = 0; position < gambarKarya.length; position++) {
            Kenma kenma = new Kenma();
            kenma.setGambarKenma(gambarKarya[position]);
            list.add(kenma);
        }
        return list;
    }
}
