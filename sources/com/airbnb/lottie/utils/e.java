package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.animation.content.j;
import com.airbnb.lottie.model.content.l;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void a(l lVar, Path path) {
        path.reset();
        PointF pointF = lVar.b;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        for (int i = 0; i < lVar.a.size(); i++) {
            com.airbnb.lottie.model.a aVar = lVar.a.get(i);
            PointF pointF3 = aVar.a;
            PointF pointF4 = aVar.b;
            PointF pointF5 = aVar.c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
            } else {
                path.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
        }
        if (lVar.c) {
            path.close();
        }
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(0, Math.min(255, i));
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void a(com.airbnb.lottie.model.e eVar, int i, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2, j jVar) {
        if (eVar.c(jVar.b(), i)) {
            list.add(eVar2.a(jVar.b()).a(jVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
