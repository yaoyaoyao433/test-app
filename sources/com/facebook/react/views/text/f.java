package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class f {
    private static final String[] b = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] c = {".ttf", ".otf"};
    private static f d;
    public final Map<String, a> a = new HashMap();
    private final Map<String, Typeface> e = new HashMap();

    private f() {
    }

    public static f a() {
        if (d == null) {
            d = new f();
        }
        return d;
    }

    @Nullable
    public final Typeface a(String str, int i, AssetManager assetManager) {
        return a(str, i, 0, assetManager);
    }

    @Nullable
    public final Typeface a(String str, int i, int i2, AssetManager assetManager) {
        if (this.e.containsKey(str)) {
            Typeface typeface = this.e.get(str);
            if (Build.VERSION.SDK_INT >= 28 && i2 >= 100 && i2 <= 1000) {
                return Typeface.create(typeface, i2, (i & 2) != 0);
            }
            return Typeface.create(typeface, i);
        }
        a aVar = this.a.get(str);
        if (aVar == null) {
            aVar = new a();
            this.a.put(str, aVar);
        }
        Typeface a2 = aVar.a(i);
        if (a2 == null && (a2 = b(str, i, assetManager)) != null) {
            aVar.a(i, a2);
        }
        return a2;
    }

    @Nullable
    private static Typeface b(String str, int i, AssetManager assetManager) {
        String[] strArr;
        String str2 = b[i];
        for (String str3 : c) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private SparseArray<Typeface> a;

        private a() {
            this.a = new SparseArray<>(4);
        }

        public final Typeface a(int i) {
            return this.a.get(i);
        }

        public final void a(int i, Typeface typeface) {
            this.a.put(i, typeface);
        }
    }
}
