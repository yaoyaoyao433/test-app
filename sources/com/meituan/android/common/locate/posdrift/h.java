package com.meituan.android.common.locate.posdrift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class h {
    private static int a;
    private static double b;
    private static double c;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static double d;
    private ArrayList<float[]> e;
    private ArrayList<float[]> f;
    private double g;
    private double h;
    private double i;

    public h(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1701299355cd32fe7c09488012846cf9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1701299355cd32fe7c09488012846cf9");
            return;
        }
        this.g = -1.0d;
        this.h = -1.0d;
        this.i = 100000.0d;
        a = d.d;
        b = d.a;
        c = Math.pow(d.b, 2.0d);
        d = Math.pow(d.c, 2.0d);
        a();
    }

    private double a(ArrayList<float[]> arrayList, ArrayList<float[]> arrayList2) {
        Object[] objArr = {arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "315c0b69fd44831468abd141fc91ac58", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "315c0b69fd44831468abd141fc91ac58")).doubleValue();
        }
        float[] a2 = a.a(arrayList, a, 3);
        double a3 = a.a(a2, 3);
        double d2 = 0.0d;
        int i = 0;
        while (i < a) {
            double[] dArr = new double[3];
            int i2 = 0;
            while (i2 < 3) {
                dArr[i2] = arrayList.get(i)[i2] - ((b * a2[i2]) / a3);
                i2++;
                a2 = a2;
            }
            float[] fArr = a2;
            for (int i3 = 0; i3 < 3; i3++) {
                d2 += ((dArr[i3] * dArr[i3]) / c) + ((arrayList2.get(i)[i3] * arrayList2.get(i)[i3]) / d);
            }
            i++;
            a2 = fArr;
        }
        return d2 / a;
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce1a91a59585afcd7b22935757eb741", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce1a91a59585afcd7b22935757eb741");
            return;
        }
        this.e.clear();
        this.f.clear();
        this.i = 100000.0d;
        this.g = -1.0d;
        this.h = -1.0d;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c5112999c2752502a6f7f464820eef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c5112999c2752502a6f7f464820eef7");
            return;
        }
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.i = 0.0d;
    }

    public void a(long j, float[] fArr) {
        Object[] objArr = {new Long(j), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e902e2d927046518c399045d5e9e629", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e902e2d927046518c399045d5e9e629");
            return;
        }
        double d2 = j / 1.0E9d;
        if (this.g > 0.0d && d2 - this.g > 10.0d) {
            c();
        }
        this.g = d2;
        if (this.e.size() == a) {
            this.e.remove(0);
        }
        this.e.add(fArr);
        if (this.e.size() == a && this.f.size() == a) {
            this.i = a(this.e, this.f);
        }
    }

    public void b(long j, float[] fArr) {
        Object[] objArr = {new Long(j), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b1855fc74b6164829b43118057aad51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b1855fc74b6164829b43118057aad51");
            return;
        }
        double d2 = j / 1.0E9d;
        if (this.h > 0.0d && d2 - this.h > 10.0d) {
            c();
        }
        this.h = d2;
        if (this.f.size() == a) {
            this.f.remove(0);
        }
        this.f.add(fArr);
    }

    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7244da0a723833ee0d0d999843e3d15f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7244da0a723833ee0d0d999843e3d15f")).booleanValue() : this.i <= 60000.0d;
    }
}
