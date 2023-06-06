package com.meituan.msc.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"", "_bold", "_italic", "_bold_italic"};
    private static final String[] c = {".ttf", ".otf"};
    private static f d;
    private final Map<String, a> e;
    private final Map<String, Typeface> f;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf90da6b54fc85372f291b8e7dd29242", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf90da6b54fc85372f291b8e7dd29242");
            return;
        }
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32107cec060ed961964d15d0ceba1e74", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32107cec060ed961964d15d0ceba1e74");
        }
        if (d == null) {
            d = new f();
        }
        return d;
    }

    @Nullable
    public final Typeface a(String str, int i, int i2, AssetManager assetManager) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), assetManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42d2b27b5685c817457c654502cc3c59", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42d2b27b5685c817457c654502cc3c59");
        }
        if (this.f.containsKey(str)) {
            Typeface typeface = this.f.get(str);
            if (Build.VERSION.SDK_INT >= 28 && i2 >= 100 && i2 <= 1000) {
                return Typeface.create(typeface, i2, (2 & i) != 0);
            }
            return Typeface.create(typeface, i);
        }
        a aVar = this.e.get(str);
        if (aVar == null) {
            aVar = new a();
            this.e.put(str, aVar);
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        Typeface typeface2 = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0e50f4cbb5f980cbc30c3ba854ecbd0a", RobustBitConfig.DEFAULT_VALUE) ? (Typeface) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0e50f4cbb5f980cbc30c3ba854ecbd0a") : aVar.b.get(i);
        if (typeface2 == null && (typeface2 = a(str, i, assetManager)) != null) {
            Object[] objArr3 = {Integer.valueOf(i), typeface2};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "e372830b92a3a8c6c2f131203234755c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "e372830b92a3a8c6c2f131203234755c");
            } else {
                aVar.b.put(i, typeface2);
            }
        }
        return typeface2;
    }

    @Nullable
    private static Typeface a(String str, int i, AssetManager assetManager) {
        String[] strArr;
        Object[] objArr = {str, Integer.valueOf(i), assetManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ea941f27c6a19a06bd8fd1bef9a74cb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ea941f27c6a19a06bd8fd1bef9a74cb");
        }
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
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
        SparseArray<Typeface> b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c122679c98fb0063bd793a3b7e3150b3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c122679c98fb0063bd793a3b7e3150b3");
            } else {
                this.b = new SparseArray<>(4);
            }
        }
    }
}
