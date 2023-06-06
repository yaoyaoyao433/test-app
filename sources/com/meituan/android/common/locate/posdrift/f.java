package com.meituan.android.common.locate.posdrift;

import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.model.Geohash;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes2.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap<String, MtLocation> a;
    public HashMap<String, Double> b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double g;
    private double h;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "02e0b4ae6b4dcce16c89ef58269ee4de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "02e0b4ae6b4dcce16c89ef58269ee4de");
            return;
        }
        this.c = 10.0d;
        this.d = 0.5d;
        this.e = 0.25d;
        this.f = 0.125d;
        this.g = 0.5d;
        this.h = -1.0d;
        a();
    }

    private ArrayList<Geohash> a(Geohash geohash) {
        Object[] objArr = {geohash};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "beaaf9baeb08dcc50a1842bdbe1c49cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "beaaf9baeb08dcc50a1842bdbe1c49cb");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Geohash> arrayList2 = new ArrayList<>();
        arrayList.add(geohash);
        arrayList.add(geohash.getWesternGeoHash());
        arrayList.add(geohash.getEasternGeoHash());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Geohash geohash2 = (Geohash) it.next();
            arrayList2.add(geohash2);
            arrayList2.add(geohash2.getNorthernGeoHash());
            arrayList2.add(geohash2.getNorthernGeoHash().getNorthernGeoHash());
            arrayList2.add(geohash2.getSouthernGeoHash());
            arrayList2.add(geohash2.getSouthernGeoHash().getSouthernGeoHash());
        }
        arrayList2.remove(geohash);
        return arrayList2;
    }

    public e a(boolean z, MtLocation mtLocation) {
        HashMap<String, Double> hashMap;
        String base32String;
        Double valueOf;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6d2bcbb8efb7d626c5aa8d823ca2087", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6d2bcbb8efb7d626c5aa8d823ca2087");
        }
        double time = (mtLocation.getTime() - this.h) / 1000.0d;
        if (this.h < 0.0d) {
            time = 0.0d;
        }
        this.h = mtLocation.getTime();
        a(z ? time * 0.125d : (time * 0.125d) + 0.5d);
        b();
        Geohash from = Geohash.from(mtLocation.getLatitude(), mtLocation.getLongitude(), 10);
        this.a.put(from.toBase32String(), mtLocation);
        Iterator<Geohash> it = a(from).iterator();
        while (it.hasNext()) {
            Geohash next = it.next();
            if (this.b.containsKey(next.toBase32String())) {
                this.b.put(next.toBase32String(), Double.valueOf(this.b.get(next.toBase32String()).doubleValue() + 0.25d));
            } else {
                this.b.put(next.toBase32String(), Double.valueOf(0.25d));
            }
        }
        if (this.b.containsKey(from.toBase32String())) {
            hashMap = this.b;
            base32String = from.toBase32String();
            valueOf = Double.valueOf(this.b.get(from.toBase32String()).doubleValue() + 0.5d);
        } else {
            hashMap = this.b;
            base32String = from.toBase32String();
            valueOf = Double.valueOf(0.5d);
        }
        hashMap.put(base32String, valueOf);
        String base32String2 = from.toBase32String();
        double doubleValue = this.b.get(base32String2).doubleValue();
        Iterator<String> it2 = this.b.keySet().iterator();
        while (true) {
            String str = base32String2;
            double d = doubleValue;
            while (it2.hasNext()) {
                base32String2 = it2.next();
                if (this.b.get(base32String2).doubleValue() <= d || !this.a.containsKey(base32String2)) {
                }
            }
            return new e(new MtLocation(this.a.get(str)), d, z, str);
            doubleValue = this.b.get(base32String2).doubleValue();
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdbad3fadb2d24271530397fab4d3226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdbad3fadb2d24271530397fab4d3226");
            return;
        }
        this.b = new HashMap<>();
        this.a = new HashMap<>();
        this.a.clear();
        this.b.clear();
        this.h = -1.0d;
    }

    public void a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db4d7b16b7b82919c57f2690d73dc88f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db4d7b16b7b82919c57f2690d73dc88f");
            return;
        }
        for (String str : this.b.keySet()) {
            this.b.put(str, Double.valueOf(this.b.get(str).doubleValue() - d));
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "008d7e3f567f31a4c120af65b93ac55f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "008d7e3f567f31a4c120af65b93ac55f");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.b.keySet()) {
            if (this.b.get(str).doubleValue() >= 10.0d) {
                this.b.put(str, Double.valueOf(10.0d));
            }
            if (this.b.get(str).doubleValue() <= 0.0d) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            this.a.remove(str2);
            this.b.remove(str2);
        }
    }
}
