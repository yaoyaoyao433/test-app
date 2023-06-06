package com.meituan.android.neohybrid.util;

import android.app.Activity;
import android.os.Build;
import android.support.v4.graphics.ColorUtils;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    private static final Map<Activity, j> c = new WeakHashMap();
    public boolean b;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private WeakReference<Activity> h;

    public static j a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a0eff8476a9ed0023809c6466bc45e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a0eff8476a9ed0023809c6466bc45e7");
        }
        j jVar = c.get(activity);
        if (jVar == null) {
            jVar = new j(activity);
            c.put(activity, jVar);
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, jVar, changeQuickRedirect2, false, "10f4426bda08ed19099ec80eb270774b", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr2, jVar, changeQuickRedirect2, false, "10f4426bda08ed19099ec80eb270774b");
        }
        if (activity != null) {
            jVar.d = Integer.valueOf(activity.getWindow().getDecorView().getSystemUiVisibility());
            jVar.f = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        return jVar;
    }

    private j(Activity activity) {
        Integer valueOf;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08fcd9909af1b951ff6dfefc2a837a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08fcd9909af1b951ff6dfefc2a837a1");
            return;
        }
        this.h = new WeakReference<>(activity);
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        Integer num = null;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cbfc3d937da097126674640ac6c97b9", RobustBitConfig.DEFAULT_VALUE)) {
            valueOf = (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cbfc3d937da097126674640ac6c97b9");
        } else {
            valueOf = activity != null ? Integer.valueOf(activity.getWindow().getStatusBarColor()) : null;
        }
        this.g = valueOf;
        Object[] objArr3 = {activity};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e8d4e54ad27de1de7f2b523ccc41853e", RobustBitConfig.DEFAULT_VALUE)) {
            num = (Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e8d4e54ad27de1de7f2b523ccc41853e");
        } else if (activity != null) {
            num = Integer.valueOf(activity.getWindow().getDecorView().getSystemUiVisibility());
        }
        this.e = num;
    }

    public final j a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7256b694b7e55ea677936df11a3d046c", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7256b694b7e55ea677936df11a3d046c");
        }
        this.f = Integer.valueOf(i);
        return this;
    }

    public final j a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f9dbb268c5dd4b4d872b4f29de0e1c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f9dbb268c5dd4b4d872b4f29de0e1c7");
        }
        if (this.f == null || Build.VERSION.SDK_INT < 23) {
            return this;
        }
        if (ColorUtils.calculateLuminance(this.f.intValue()) > 0.5d) {
            this.d = Integer.valueOf(this.d.intValue() | 8192);
        } else {
            this.d = Integer.valueOf((this.d.intValue() | 8192) ^ 8192);
        }
        return this;
    }

    public final j b(boolean z) {
        int intValue;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373e334fd35e59a2939dc641ccbe9ca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373e334fd35e59a2939dc641ccbe9ca4");
        }
        if (this.b || z) {
            if (z) {
                intValue = this.d.intValue() | 1024;
            } else {
                intValue = (this.d.intValue() | 1024) ^ 1024;
            }
            this.d = Integer.valueOf(intValue);
            return this;
        }
        return this;
    }

    public final j c(boolean z) {
        int intValue;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3552b1afe3430731ce6a2cb6da3c414c", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3552b1afe3430731ce6a2cb6da3c414c");
        }
        if (this.b || z) {
            if (z) {
                intValue = this.d.intValue() | 4;
            } else {
                intValue = (this.d.intValue() | 4) ^ 4;
            }
            this.d = Integer.valueOf(intValue);
            return this;
        }
        return this;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4feea0a77ff23760a474db9992365cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4feea0a77ff23760a474db9992365cda");
            return;
        }
        Activity b = b();
        if (b == null) {
            return;
        }
        Window window = b.getWindow();
        if (this.d != null) {
            window.getDecorView().setSystemUiVisibility(this.d.intValue());
        }
        if (this.f != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(this.f.intValue());
        }
    }

    private Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4dfcdc59183dd079538269e74e4baa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4dfcdc59183dd079538269e74e4baa4");
        }
        if (this.h != null) {
            return this.h.get();
        }
        return null;
    }
}
