package com.meituan.msi.lib.map.utils;

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
public final class g {
    public static ChangeQuickRedirect a;
    final Marker b;
    public AnimatorSet c;
    private final LinkedList<a> d;

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

    public static i a(LatLng latLng) {
        double log;
        Object[] objArr = {latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3b5576456461562fc87aef034a6dd56b", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3b5576456461562fc87aef034a6dd56b");
        }
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        if (sin == 1.0d) {
            log = 37.42994775023705d;
        } else {
            log = sin == -1.0d ? -37.42994775023705d : Math.log((sin + 1.0d) / (1.0d - sin));
        }
        return new i(d * 4.007501668557849E7d, (((log * 0.5d) / (-6.283185307179586d)) + 0.5d) * 4.007501668557849E7d);
    }

    public g(LinkedList<a> linkedList, Marker marker, com.meituan.msi.lib.map.view.map.b bVar) {
        Object[] objArr = {linkedList, marker, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e516857e9667e99eab79ddac18199e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e516857e9667e99eab79ddac18199e");
            return;
        }
        this.d = linkedList;
        this.b = marker;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d41bf1eb3d92c767c77b9736cab38380", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d41bf1eb3d92c767c77b9736cab38380");
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

    public static double a(LatLng latLng, LatLng latLng2) {
        Object[] objArr = {latLng, latLng2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "753f8e92b72ccb589c662118b06b846a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "753f8e92b72ccb589c662118b06b846a")).doubleValue();
        }
        double d = latLng.longitude * 0.01745329251994329d;
        double d2 = latLng.latitude * 0.01745329251994329d;
        double sin = Math.sin(d);
        double sin2 = Math.sin(d2);
        double cos = Math.cos(d);
        double cos2 = Math.cos(d2);
        double d3 = latLng2.longitude * 0.01745329251994329d;
        double d4 = latLng2.latitude * 0.01745329251994329d;
        double sin3 = Math.sin(d3);
        double sin4 = Math.sin(d4);
        double cos3 = Math.cos(d3);
        double cos4 = Math.cos(d4);
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, sin4};
        return Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d;
    }

    private ValueAnimator a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebe9b2f08e420ee9bfa925b77c634212", RobustBitConfig.DEFAULT_VALUE)) {
            return (ValueAnimator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebe9b2f08e420ee9bfa925b77c634212");
        }
        LatLng[] latLngArr = {new LatLng(aVar.b, aVar.c), new LatLng(aVar.d, aVar.e)};
        final i a2 = a(latLngArr[0]);
        final i a3 = a(latLngArr[1]);
        final double[] dArr = new double[1];
        double d = 0.0d;
        for (int i = 0; i <= 0; i++) {
            dArr[0] = a(latLngArr[0], latLngArr[1]);
            d = dArr[0] + 0.0d;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) ((aVar.a * dArr[0]) / d));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues((float) dArr[0]);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msi.lib.map.utils.g.1
            public static ChangeQuickRedirect a;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Object[] objArr2 = {valueAnimator2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a8391a5f6229460b0f4bfc4280de5416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a8391a5f6229460b0f4bfc4280de5416");
                } else if (a2.equals(a3)) {
                } else {
                    double parseDouble = Double.parseDouble(String.valueOf(valueAnimator2.getAnimatedValue()));
                    double d2 = a2.b + (((a3.b - a2.b) * parseDouble) / dArr[0]);
                    double d3 = ((parseDouble * (a3.c - a2.c)) / dArr[0]) + a2.c;
                    Marker marker = g.this.b;
                    i iVar = new i(d2, d3);
                    marker.setPosition(new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (iVar.c / 4.007501668557849E7d))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((iVar.b / 4.007501668557849E7d) - 0.5d) * 360.0d));
                }
            }
        });
        return valueAnimator;
    }
}
