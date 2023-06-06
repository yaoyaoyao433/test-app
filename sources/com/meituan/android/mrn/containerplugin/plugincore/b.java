package com.meituan.android.mrn.containerplugin.plugincore;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.android.mrn.router.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public d d;
    public Bundle e;
    private WeakReference<com.meituan.android.mrn.container.b> f;
    private WeakReference<Activity> g;
    private int h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07c6a22cc0f0f34eb24c54e61e32b3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07c6a22cc0f0f34eb24c54e61e32b3b");
        } else {
            this.h = -1;
        }
    }

    public final b a(com.meituan.android.mrn.container.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0266645e6a6e8ee151e69034ea8d48d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0266645e6a6e8ee151e69034ea8d48d9");
        }
        this.f = new WeakReference<>(bVar);
        return this;
    }

    public final b a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1f0fc4a82825bcfe0c5a0585b9ab6c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1f0fc4a82825bcfe0c5a0585b9ab6c");
        }
        this.g = new WeakReference<>(activity);
        return this;
    }
}
