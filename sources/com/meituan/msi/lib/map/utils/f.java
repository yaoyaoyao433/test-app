package com.meituan.msi.lib.map.utils;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.meituan.msi.lib.map.view.model.m;
import com.meituan.msi.lib.map.view.model.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public Marker b;
    public m c;
    public long d;
    public LatLng[] e;
    public boolean f;
    public double[] g;
    public double h;
    public AnimatorSet i;
    public AnimatorSet j;
    public q k;
    public boolean l;

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf90e1d8f6deced37cdc074239619a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf90e1d8f6deced37cdc074239619a9");
            return;
        }
        if (this.i != null) {
            this.i.cancel();
        }
        if (this.j != null) {
            this.j.cancel();
        }
    }

    public void b() {
        ArrayList arrayList;
        int i;
        long j;
        long a2;
        ValueAnimator valueAnimator;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7baa324908008e346f48f1c9b12ad44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7baa324908008e346f48f1c9b12ad44");
            return;
        }
        if (this.j == null) {
            this.j = new AnimatorSet();
        }
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        float f = 0.0f;
        long j2 = 0;
        while (i4 < this.e.length) {
            if (this.e[i2].equals(this.e[i4])) {
                arrayList = arrayList2;
                i = i4;
            } else {
                i a3 = g.a(this.e[i3]);
                i a4 = g.a(this.e[i2]);
                i a5 = g.a(this.e[i4]);
                i = i4;
                ArrayList arrayList3 = arrayList2;
                int i5 = i2;
                int i6 = i3;
                float a6 = (float) a(a4.b - a3.b, a3.c - a4.c, a5.b - a4.b, a4.c - a5.c);
                if (arrayList3.size() == 0) {
                    f = this.b.getRotateAngle();
                    a6 = ((float) a(0.0d, 1.0d, a5.b - a4.b, a4.c - a5.c)) - f;
                    a2 = j2;
                    j = 0;
                } else {
                    long abs = (long) ((this.d * (((Math.abs(a6) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.h);
                    j = abs;
                    a2 = a(i6, i5) - (abs / 2);
                }
                float f2 = f + a6;
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), new Long(j), new Long(a2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "751e078fa512bdb017ed3fac51c06ba5", RobustBitConfig.DEFAULT_VALUE)) {
                    valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "751e078fa512bdb017ed3fac51c06ba5");
                    arrayList = arrayList3;
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                    ofFloat.setDuration(j);
                    ofFloat.setStartDelay(a2);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new b(this));
                    valueAnimator = ofFloat;
                    arrayList = arrayList3;
                }
                arrayList.add(valueAnimator);
                j2 = a2;
                f = f2;
                i2 = i;
                i3 = i5;
            }
            i4 = i + 1;
            arrayList2 = arrayList;
        }
        this.j.playSequentially(arrayList2);
    }

    private long a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6d9a973f0faeb3cbfb84f7454a964d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6d9a973f0faeb3cbfb84f7454a964d3")).longValue();
        }
        double d = 0.0d;
        while (i < i2) {
            d += this.g[i];
            i++;
        }
        return (long) ((this.d * d) / this.h);
    }

    private double a(double d, double d2, double d3, double d4) {
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5c0f4d0e4ef7aa805eb2dd8540286e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5c0f4d0e4ef7aa805eb2dd8540286e")).doubleValue();
        }
        double sqrt = ((d * d3) + (d2 * d4)) / (Math.sqrt((d * d) + (d2 * d2)) * Math.sqrt((d3 * d3) + (d4 * d4)));
        if (Double.isNaN(sqrt)) {
            return 0.0d;
        }
        double d5 = sqrt >= -1.0d ? sqrt : -1.0d;
        if (d5 > 1.0d) {
            d5 = 1.0d;
        }
        double acos = (Math.acos(d5) * 180.0d) / 3.141592653589793d;
        if ((d * d4) - (d2 * d3) > 0.0d) {
            acos = -acos;
        }
        return (float) acos;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private final f b;

        public b(f fVar) {
            Object[] objArr = {fVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eb1142f344e9c4fc06ff7de37c5fb5f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eb1142f344e9c4fc06ff7de37c5fb5f");
            } else {
                this.b = fVar;
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceede090e3013406b092939efce26ab2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceede090e3013406b092939efce26ab2");
            } else if (this.b.c.r) {
            } else {
                double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                if (this.b.b != null) {
                    this.b.b.setRotateAngle((float) parseDouble);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect a;
        private final f b;
        private final i c;
        private final i d;
        private final q e;
        private final int f;

        public a(f fVar, i iVar, i iVar2, q qVar, int i) {
            Object[] objArr = {fVar, iVar, iVar2, qVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2053f124587ebb64a8a60c4d0feab338", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2053f124587ebb64a8a60c4d0feab338");
                return;
            }
            this.b = fVar;
            this.c = iVar;
            this.d = iVar2;
            this.f = i;
            this.e = qVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Object[] objArr = {valueAnimator};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2bfdef69a4a2e172c4928bb756929f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2bfdef69a4a2e172c4928bb756929f");
            } else if (this.c.equals(this.d) || this.c.equals(this.d) || this.b.c.r) {
            } else {
                double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                double d = this.c.b + (((this.d.b - this.c.b) * parseDouble) / this.b.g[this.f]);
                double d2 = ((parseDouble * (this.d.c - this.c.c)) / this.b.g[this.f]) + this.c.c;
                Marker marker = this.b.b;
                i iVar = new i(d, d2);
                LatLng latLng = new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (iVar.c / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((iVar.b / 4.007501668557849E7d) - 0.5d) * 360.0d);
                marker.setPosition(latLng);
                if (!this.b.l || this.e.e == null) {
                    return;
                }
                this.e.e.eraseTo(this.f, latLng);
            }
        }
    }
}
