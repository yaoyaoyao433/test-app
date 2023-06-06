package com.meizu.cloud.pushsdk.c.h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.c.a.c;
import com.meizu.cloud.pushsdk.c.c.k;
import com.meizu.cloud.pushsdk.c.g.g;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class b {
    private static int a(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 > min) {
                return (int) f;
            }
            f = f2;
        }
    }

    private static int a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else if (i == 0) {
            return (int) (i3 * (i2 / i4));
        } else if (i2 == 0) {
            return i;
        } else {
            double d = i4 / i3;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d2 = i2;
                return ((double) i) * d < d2 ? (int) (d2 / d) : i;
            }
            double d3 = i2;
            return ((double) i) * d > d3 ? (int) (d3 / d) : i;
        }
    }

    public static c<Bitmap> a(k kVar, int i, int i2, Bitmap.Config config, ImageView.ScaleType scaleType) {
        Bitmap bitmap;
        boolean z = false;
        byte[] bArr = new byte[0];
        try {
            bArr = g.a(kVar.b.a()).f();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            bitmap = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int a = a(i, i2, i3, i4, scaleType);
            int a2 = a(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = a(i3, i4, a, a2);
            Bitmap a3 = com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, options);
            if (a3 != null && (a3.getWidth() > a || a3.getHeight() > a2)) {
                z = true;
            }
            if (z) {
                bitmap = Bitmap.createScaledBitmap(a3, a, a2, true);
                a3.recycle();
            } else {
                bitmap = a3;
            }
        }
        return bitmap == null ? c.a(b(new com.meizu.cloud.pushsdk.c.b.a(kVar))) : c.a(bitmap);
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar) {
        aVar.c = "connectionError";
        aVar.b = 0;
        aVar.a = aVar.getMessage();
        return aVar;
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(com.meizu.cloud.pushsdk.c.b.a aVar, com.meizu.cloud.pushsdk.c.a.b bVar, int i) {
        com.meizu.cloud.pushsdk.c.b.a a = com.meizu.cloud.pushsdk.c.a.b.a(aVar);
        a.b = i;
        a.c = "responseFromServerError";
        return a;
    }

    public static com.meizu.cloud.pushsdk.c.b.a b(com.meizu.cloud.pushsdk.c.b.a aVar) {
        aVar.b = 0;
        aVar.c = "parseError";
        aVar.a = aVar.getMessage();
        return aVar;
    }

    public static com.meizu.cloud.pushsdk.c.b.a a(Exception exc) {
        com.meizu.cloud.pushsdk.c.b.a aVar = new com.meizu.cloud.pushsdk.c.b.a(exc);
        if (Build.VERSION.SDK_INT >= 11 && (exc instanceof NetworkOnMainThreadException)) {
            aVar.c = "networkOnMainThreadError";
        } else {
            aVar.c = "connectionError";
        }
        aVar.b = 0;
        return aVar;
    }
}
