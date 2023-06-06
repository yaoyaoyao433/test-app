package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lv {
    private static final int a = 7;
    private static Canvas b;
    private static int c;
    private static Bitmap[] d;
    private static Bitmap e;

    static {
        Bitmap[] bitmapArr = new Bitmap[7];
        d = bitmapArr;
        bitmapArr[0] = Bitmap.createBitmap(64, 32, Bitmap.Config.ARGB_8888);
        d[1] = Bitmap.createBitmap(128, 32, Bitmap.Config.ARGB_8888);
        d[2] = Bitmap.createBitmap(128, 64, Bitmap.Config.ARGB_8888);
        d[3] = Bitmap.createBitmap(256, 32, Bitmap.Config.ARGB_8888);
        d[4] = Bitmap.createBitmap(256, 128, Bitmap.Config.ARGB_8888);
        d[5] = Bitmap.createBitmap(32, 128, Bitmap.Config.ARGB_8888);
        d[6] = Bitmap.createBitmap(32, 256, Bitmap.Config.ARGB_8888);
        b = new Canvas(d[1]);
        c = 1;
        e = null;
    }

    private static Canvas a(float f, float f2) {
        int i = 0;
        while (i < 7 && (d[i].getWidth() < f || d[i].getHeight() < f2)) {
            i++;
        }
        if (i < 7) {
            c = i;
            b.setBitmap(d[i]);
            d[i].eraseColor(0);
            return b;
        }
        c = d.length;
        int i2 = 1;
        int i3 = 1;
        while (i3 < f) {
            i3 <<= 1;
        }
        while (i2 < f2) {
            i2 <<= 1;
        }
        e = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
        b.setBitmap(e);
        e.eraseColor(0);
        return b;
    }

    private static void a(float f, float f2, Point point) {
        for (int i = 0; i < 7; i++) {
            if (d[i].getWidth() >= f && d[i].getHeight() >= f2) {
                point.set(d[i].getWidth(), d[i].getHeight());
                return;
            }
        }
        int i2 = 1;
        int i3 = 1;
        while (i3 < f) {
            i3 <<= 1;
        }
        while (i2 < f2) {
            i2 <<= 1;
        }
        point.set(i3, i2);
    }

    private static void a() {
        if (e != null) {
            e.recycle();
            e = null;
        }
    }

    private static Bitmap b() {
        if (c < 7) {
            return d[c];
        }
        return e;
    }
}
