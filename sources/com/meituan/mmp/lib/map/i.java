package com.meituan.mmp.lib.map;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    Marker b;
    public AnimatorSet c;
    private LinkedList<a> d;
    private e e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public double b;
        public double c;
        public double d;
        public double e;
        public float f;
    }

    private static b a(LatLng latLng) {
        double log;
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bfa750db16514840cf63d2c57e92158", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bfa750db16514840cf63d2c57e92158");
        }
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        if (sin == 1.0d) {
            log = 37.42994775023705d;
        } else {
            log = sin == -1.0d ? -37.42994775023705d : Math.log((sin + 1.0d) / (1.0d - sin));
        }
        return new b(d * 4.007501668557849E7d, (((log * 0.5d) / (-6.283185307179586d)) + 0.5d) * 4.007501668557849E7d);
    }

    public i(LinkedList<a> linkedList, Marker marker, e eVar) {
        Object[] objArr = {linkedList, marker, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf01d5679ed64560712a5d7420003b59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf01d5679ed64560712a5d7420003b59");
            return;
        }
        this.d = linkedList;
        this.b = marker;
        this.e = eVar;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd39c78c7bb7284770f05f6cdb43aa8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd39c78c7bb7284770f05f6cdb43aa8b");
            return;
        }
        this.c = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.d.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        this.c.playSequentially(arrayList);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        public final double b;
        public final double c;

        public b(double d, double d2) {
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d2b40a48ffe13f73c8a4156b04ea27a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d2b40a48ffe13f73c8a4156b04ea27a");
                return;
            }
            this.b = d;
            this.c = d2;
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c551bec7685cf0ec63dc63836dcfbb32", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c551bec7685cf0ec63dc63836dcfbb32")).booleanValue();
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c;
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v10 */
    private ValueAnimator a(a aVar) {
        int i;
        LatLng[] latLngArr;
        b bVar;
        double asin;
        char c;
        ?? r9 = 1;
        char c2 = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495324052783139b2814347d1abe1978", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495324052783139b2814347d1abe1978");
        }
        int i2 = 2;
        LatLng[] latLngArr2 = {new LatLng(aVar.b, aVar.c), new LatLng(aVar.d, aVar.e)};
        b a2 = a(latLngArr2[0]);
        final b a3 = a(latLngArr2[1]);
        final double[] dArr = new double[1];
        this.e.getMap().getProjection();
        int i3 = 0;
        double d = 0.0d;
        while (i3 <= 0) {
            LatLng latLng = latLngArr2[c2];
            LatLng latLng2 = latLngArr2[r9];
            Object[] objArr2 = new Object[i2];
            objArr2[c2] = latLng;
            objArr2[r9] = latLng2;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8fd93bd71794b0cdb599a35745ab4b94", RobustBitConfig.DEFAULT_VALUE)) {
                latLngArr = latLngArr2;
                bVar = a2;
                asin = ((Double) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, r9, "8fd93bd71794b0cdb599a35745ab4b94")).doubleValue();
                i = i3;
                c = 0;
            } else {
                double d2 = latLng.longitude * 0.01745329251994329d;
                i = i3;
                double d3 = latLng.latitude * 0.01745329251994329d;
                double sin = Math.sin(d2);
                double sin2 = Math.sin(d3);
                double cos = Math.cos(d2);
                double cos2 = Math.cos(d3);
                double d4 = latLng2.longitude * 0.01745329251994329d;
                latLngArr = latLngArr2;
                double d5 = latLng2.latitude * 0.01745329251994329d;
                double sin3 = Math.sin(d4);
                double sin4 = Math.sin(d5);
                double cos3 = Math.cos(d4);
                double cos4 = Math.cos(d5);
                bVar = a2;
                double[] dArr2 = {cos * cos2, cos2 * sin, sin2};
                double[] dArr3 = {cos3 * cos4, cos4 * sin3, sin4};
                asin = Math.asin(Math.sqrt((((dArr2[0] - dArr3[0]) * (dArr2[0] - dArr3[0])) + ((dArr2[1] - dArr3[1]) * (dArr2[1] - dArr3[1]))) + ((dArr2[2] - dArr3[2]) * (dArr2[2] - dArr3[2]))) / 2.0d) * 1.27420015798544E7d;
                c = 0;
            }
            dArr[c] = asin;
            d = dArr[c] + 0.0d;
            i3 = i + 1;
            latLngArr2 = latLngArr;
            a2 = bVar;
            i2 = 2;
            r9 = 1;
            c2 = 0;
        }
        final b bVar2 = a2;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) ((aVar.a * dArr[0]) / d));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues((float) dArr[0]);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.mmp.lib.map.i.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Object[] objArr3 = {valueAnimator2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "17fe413217ac12c58a818933ad91e92d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "17fe413217ac12c58a818933ad91e92d");
                } else if (bVar2.equals(a3)) {
                } else {
                    double parseDouble = Double.parseDouble(String.valueOf(valueAnimator2.getAnimatedValue()));
                    double d6 = bVar2.b + (((a3.b - bVar2.b) * parseDouble) / dArr[0]);
                    double d7 = ((parseDouble * (a3.c - bVar2.c)) / dArr[0]) + bVar2.c;
                    Marker marker = i.this.b;
                    b bVar3 = new b(d6, d7);
                    marker.setPosition(new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar3.c / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((bVar3.b / 4.007501668557849E7d) - 0.5d) * 360.0d));
                }
            }
        });
        return valueAnimator;
    }
}
