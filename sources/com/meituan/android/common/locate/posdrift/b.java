package com.meituan.android.common.locate.posdrift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class b {
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

    public b(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3bbdbe446017b5788c95f102450297e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3bbdbe446017b5788c95f102450297e");
            return;
        }
        this.g = -1.0d;
        this.h = -1.0d;
        this.i = -1.0d;
        a = d.d;
        b = d.a;
        c = Math.pow(d.b, 2.0d);
        d = Math.pow(d.c, 2.0d);
        a();
    }

    private double a(ArrayList<float[]> arrayList, ArrayList<float[]> arrayList2) {
        Object[] objArr = {arrayList, arrayList2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fc411bd2b3c311ef7842e0701c990d6e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fc411bd2b3c311ef7842e0701c990d6e")).doubleValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc3c998ac90bf824a0afb71fe07fb9f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc3c998ac90bf824a0afb71fe07fb9f4");
            return;
        }
        this.e.clear();
        this.f.clear();
        this.i = -1.0d;
        this.g = -1.0d;
        this.h = -1.0d;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d218a655249b65504ff85ddcb848e116", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d218a655249b65504ff85ddcb848e116");
            return;
        }
        this.e = new ArrayList<>();
        this.f = new ArrayList<>();
        this.i = -1.0d;
    }

    public void a(long j, float[] fArr) {
        Object[] objArr = {new Long(j), fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fdaf1c71db82de0faec0c2f7f9744f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fdaf1c71db82de0faec0c2f7f9744f5");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31ba07a54ccf3fc0dadb45404ec47f25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31ba07a54ccf3fc0dadb45404ec47f25");
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

    public double[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ffe0b20d3f180fe0165176569dad5825", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ffe0b20d3f180fe0165176569dad5825");
        }
        double[] dArr = new double[5];
        if (this.i < 0.0d) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
            dArr[3] = 0.0d;
            dArr[4] = 1.0d;
        } else if (this.i < 60000.0d) {
            dArr[0] = 1.0d;
            dArr[1] = 0.0d;
            dArr[2] = 0.0d;
            dArr[3] = 0.0d;
            dArr[4] = 0.0d;
        } else {
            dArr[0] = 0.0d;
            dArr[1] = 1.0d;
            dArr[2] = 0.0d;
            dArr[3] = 0.0d;
            dArr[4] = 0.0d;
        }
        return dArr;
    }
}
