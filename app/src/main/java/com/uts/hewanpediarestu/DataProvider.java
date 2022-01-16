package com.uts.hewanpediarestu;

import android.content.Context;

import com.uts.hewanpediarestu.model.Hewan;
import com.uts.hewanpediarestu.model.Kucing;
import com.uts.hewanpediarestu.model.Katak;
import com.uts.hewanpediarestu.model.Anjing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing(ctx.getString(R.string.Anggora), ctx.getString(R.string.Turki),
                ctx.getString(R.string.Aslinya), R.drawable.cat_angora));
        kucings.add(new Kucing(ctx.getString(R.string.bengal), ctx.getString(R.string.inggris),
                ctx.getString(R.string.merupakan), R.drawable.cat_bengal));
        kucings.add(new Kucing(ctx.getString(R.string.birmani), ctx.getString(R.string.birmanmyanmar),
                ctx.getString(R.string.konon), R.drawable.cat_birman));
        kucings.add(new Kucing(ctx.getString(R.string.persia), "Iran",
                ctx.getString(R.string.dariiran), R.drawable.cat_persia));
        kucings.add(new Kucing(ctx.getString(R.string.Siam), ctx.getString(R.string.Thailand),
                ctx.getString(R.string.Kucingan), R.drawable.cat_siam));
        kucings.add(new Kucing(ctx.getString(R.string.siberia), ctx.getString(R.string.rusia),
                ctx.getString(R.string.kucingdomestik), R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing(ctx.getString(R.string.buldog), ctx.getString(R.string.inggris),
                ctx.getString(R.string.anjinh), R.drawable.dog_bulldog));
        anjings.add(new Anjing(ctx.getString(R.string.husky), ctx.getString(R.string.alaska),
                ctx.getString(R.string.awalnya), R.drawable.dog_husky));
        anjings.add(new Anjing(ctx.getString(R.string.kintami), ctx.getString(R.string.Indonesia),
                ctx.getString(R.string.Rasanjing), R.drawable.dog_kintamani));
        anjings.add(new Anjing(ctx.getString(R.string.samoyed), ctx.getString(R.string.Rusia),
                ctx.getString(R.string.Anjijgberasal), R.drawable.dog_samoyed));
        anjings.add(new Anjing(ctx.getString(R.string.shpered), ctx.getString(R.string.jerman),
                ctx.getString(R.string.anjingpintar), R.drawable.dog_shepherd));
        anjings.add(new Anjing(ctx.getString(R.string.shiba), ctx.getString(R.string.jepang),
                ctx.getString(R.string.anjinggawal), R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak(ctx.getString(R.string.katakpanah), ctx.getString(R.string.barazil),
                ctx.getString(R.string.Katakini), R.drawable.katak1));
        kataks.add(new Katak(ctx.getString(R.string.raskatak), ctx.getString(R.string.ekuador),
                ctx.getString(R.string.melansir), R.drawable.katak2));
        kataks.add(new Katak(ctx.getString(R.string.katakstroberiy), ctx.getString(R.string.nikaragua),
                ctx.getString(R.string.yaituraipu), R.drawable.katak3));
        kataks.add(new Katak(ctx.getString(R.string.katakracungolf), ctx.getString(R.string.Amerikatengah),
                ctx.getString(R.string.dikomsumsi), R.drawable.katak4));
        kataks.add(new Katak(ctx.getString(R.string.racunkokoe), ctx.getString(R.string.kolombia),
                ctx.getString(R.string.efeknya), R.drawable.katak5));
        kataks.add(new Katak(ctx.getString(R.string.rarcunmerah), ctx.getString(R.string.ecuadorperu),
                ctx.getString(R.string.Racunnya), R.drawable.katak6));
        return kataks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKatak(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
