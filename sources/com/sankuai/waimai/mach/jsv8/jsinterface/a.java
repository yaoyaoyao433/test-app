package com.sankuai.waimai.mach.jsv8.jsinterface;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSRuntime;
import com.meituan.v8jse.JavaCallback;
import com.sankuai.waimai.mach.Mach;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements JavaCallback {
    public static ChangeQuickRedirect a;
    private WeakReference<Mach> b;
    private WeakReference<JSRuntime> c;

    public a(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faac0c96f804c31d22ea5ad99ee9aaa5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faac0c96f804c31d22ea5ad99ee9aaa5");
        } else {
            this.b = new WeakReference<>(mach);
        }
    }

    public final void a(JSRuntime jSRuntime) {
        Object[] objArr = {jSRuntime};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5958765f635fb4ab42d2c043d5bb9645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5958765f635fb4ab42d2c043d5bb9645");
        } else {
            this.c = new WeakReference<>(jSRuntime);
        }
    }

    @Nullable
    public final Mach a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58b67b0f841594f06083eed38872d8c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (Mach) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58b67b0f841594f06083eed38872d8c2");
        }
        if (this.b != null) {
            return this.b.get();
        }
        return null;
    }

    @Nullable
    public final com.sankuai.waimai.mach.jsv8.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ba7691e9ed0f22f5cc4b33e9531c7e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.mach.jsv8.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ba7691e9ed0f22f5cc4b33e9531c7e6");
        }
        Mach a2 = a();
        if (a2 != null) {
            return a2.getV8JSEngine();
        }
        return null;
    }

    @Nullable
    public final JSRuntime c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efebe041dc520a3e444b26064a4d1e40", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSRuntime) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efebe041dc520a3e444b26064a4d1e40");
        }
        if (this.c != null) {
            return this.c.get();
        }
        return null;
    }
}
