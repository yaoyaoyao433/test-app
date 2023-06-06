package com.airbnb.lottie.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.c;
import com.airbnb.lottie.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    private static final Object c = new Object();
    public final Context a;
    @Nullable
    public c b;
    private String d;
    private final Map<String, g> e;

    public b(Drawable.Callback callback, String str, c cVar, Map<String, g> map) {
        this.d = str;
        if (!TextUtils.isEmpty(str) && this.d.charAt(this.d.length() - 1) != '/') {
            this.d += '/';
        }
        if (!(callback instanceof View)) {
            this.e = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.e = map;
        this.b = cVar;
    }

    @Nullable
    public final Bitmap a(String str) {
        g gVar = this.e.get(str);
        if (gVar == null) {
            return null;
        }
        Bitmap bitmap = gVar.c;
        if (bitmap != null) {
            return bitmap;
        }
        if (this.b != null) {
            Bitmap a = this.b.a(gVar);
            if (a != null) {
                a(str, a);
            }
            return a;
        }
        String str2 = gVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (str2.startsWith("data:") && str2.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return a(str, com.sankuai.waimai.launcher.util.image.a.a(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.d)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            AssetManager assets = this.a.getAssets();
            return a(str, com.sankuai.waimai.launcher.util.image.a.a(assets.open(this.d + str2), (Rect) null, options));
        } catch (IOException e2) {
            Log.w("LOTTIE", "Unable to open asset.", e2);
            return null;
        }
    }

    public final void a() {
        synchronized (c) {
            for (Map.Entry<String, g> entry : this.e.entrySet()) {
                g value = entry.getValue();
                Bitmap bitmap = value.c;
                if (bitmap != null) {
                    bitmap.recycle();
                    value.c = null;
                }
            }
        }
    }

    private Bitmap a(String str, @Nullable Bitmap bitmap) {
        synchronized (c) {
            this.e.get(str).c = bitmap;
        }
        return bitmap;
    }
}
