package com.meituan.android.ptcommonim.mach;

import android.app.Activity;
import com.meituan.android.ptcommonim.mach.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final b.AnonymousClass2 b;
    private final com.sankuai.waimai.mach.manager.cache.e c;
    private final Mach d;
    private final Activity e;
    private final MachViewGroup f;

    private d(b.AnonymousClass2 anonymousClass2, com.sankuai.waimai.mach.manager.cache.e eVar, Mach mach, Activity activity, MachViewGroup machViewGroup) {
        this.b = anonymousClass2;
        this.c = eVar;
        this.d = mach;
        this.e = activity;
        this.f = machViewGroup;
    }

    public static Runnable a(b.AnonymousClass2 anonymousClass2, com.sankuai.waimai.mach.manager.cache.e eVar, Mach mach, Activity activity, MachViewGroup machViewGroup) {
        Object[] objArr = {anonymousClass2, eVar, mach, activity, machViewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f27871e4adff36281ca0340cae5ea0f5", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f27871e4adff36281ca0340cae5ea0f5") : new d(anonymousClass2, eVar, mach, activity, machViewGroup);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae9c69ad15f5f4d88dee5d9d8252a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae9c69ad15f5f4d88dee5d9d8252a2b");
            return;
        }
        b.AnonymousClass2 anonymousClass2 = this.b;
        com.sankuai.waimai.mach.manager.cache.e eVar = this.c;
        Mach mach = this.d;
        Activity activity = this.e;
        MachViewGroup machViewGroup = this.f;
        Object[] objArr2 = {anonymousClass2, eVar, mach, activity, machViewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = b.AnonymousClass2.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b31ff772cb202bde874d15f12fdfe46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b31ff772cb202bde874d15f12fdfe46");
            return;
        }
        try {
            b.this.f = eVar;
            mach.initWithBundle(activity, machViewGroup, eVar);
            mach.render(b.this.c);
        } catch (Throwable unused) {
        }
    }
}
