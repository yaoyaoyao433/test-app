package com.alipay.sdk.util;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.mapsdk.internal.jw;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static Drawable a(String str, Context context) {
        return a(str, context, jw.g);
    }

    private static Drawable a(String str, Context context, int i) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(com.alipay.sdk.encrypt.a.a(str));
        } catch (Throwable unused) {
            byteArrayInputStream = null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDensity = jw.g;
            options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), com.sankuai.waimai.launcher.util.image.a.a(byteArrayInputStream, (Rect) null, options));
            a(byteArrayInputStream);
            return bitmapDrawable;
        } catch (Throwable unused2) {
            a(byteArrayInputStream);
            return null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
