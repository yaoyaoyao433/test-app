package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class o {
    private static final Interpolator a = new LinearInterpolator();
    private static SparseArrayCompat<WeakReference<Interpolator>> b;

    o() {
    }

    @Nullable
    private static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> weakReference;
        synchronized (o.class) {
            if (b == null) {
                b = new SparseArrayCompat<>();
            }
            weakReference = b.get(i);
        }
        return weakReference;
    }

    private static void a(int i, WeakReference<Interpolator> weakReference) {
        synchronized (o.class) {
            b.put(i, weakReference);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> com.airbnb.lottie.value.a<T> a(JsonReader jsonReader, com.airbnb.lottie.e eVar, float f, af<T> afVar, boolean z) throws IOException {
        if (z) {
            return a(eVar, jsonReader, f, afVar);
        }
        return new com.airbnb.lottie.value.a<>(afVar.a(jsonReader, f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static <T> com.airbnb.lottie.value.a<T> a(com.airbnb.lottie.e eVar, JsonReader jsonReader, float f, af<T> afVar) throws IOException {
        Interpolator interpolator;
        char c;
        jsonReader.beginObject();
        PointF pointF = null;
        PointF pointF2 = null;
        T t = null;
        T t2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        boolean z = false;
        float f2 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (nextName.equals("h")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 105:
                    if (nextName.equals("i")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3701:
                    if (nextName.equals("ti")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 3707:
                    if (nextName.equals(RemoteMessageConst.TO)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 1:
                    t = afVar.a(jsonReader, f);
                    break;
                case 2:
                    t2 = afVar.a(jsonReader, f);
                    break;
                case 3:
                    pointF = n.b(jsonReader, f);
                    break;
                case 4:
                    pointF2 = n.b(jsonReader, f);
                    break;
                case 5:
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 6:
                    pointF3 = n.b(jsonReader, f);
                    break;
                case 7:
                    pointF4 = n.b(jsonReader, f);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = a;
            t2 = t;
        } else if (pointF != null && pointF2 != null) {
            float f3 = -f;
            pointF.x = com.airbnb.lottie.utils.e.a(pointF.x, f3, f);
            pointF.y = com.airbnb.lottie.utils.e.a(pointF.y, -100.0f, 100.0f);
            pointF2.x = com.airbnb.lottie.utils.e.a(pointF2.x, f3, f);
            pointF2.y = com.airbnb.lottie.utils.e.a(pointF2.y, -100.0f, 100.0f);
            int a2 = com.airbnb.lottie.utils.f.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
            WeakReference<Interpolator> a3 = a(a2);
            Interpolator interpolator2 = a3 != null ? a3.get() : null;
            if (a3 == null || interpolator2 == null) {
                interpolator2 = PathInterpolatorCompat.create(pointF.x / f, pointF.y / f, pointF2.x / f, pointF2.y / f);
                try {
                    a(a2, new WeakReference(interpolator2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolator2;
        } else {
            interpolator = a;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(eVar, t, t2, interpolator, f2, null);
        aVar.g = pointF3;
        aVar.h = pointF4;
        return aVar;
    }
}
