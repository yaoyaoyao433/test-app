package com.meituan.android.ptcommonim.mach;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final Mach c;
    private final Activity d;
    private final MachViewGroup e;

    private c(b bVar, Mach mach, Activity activity, MachViewGroup machViewGroup) {
        this.b = bVar;
        this.c = mach;
        this.d = activity;
        this.e = machViewGroup;
    }

    public static Runnable a(b bVar, Mach mach, Activity activity, MachViewGroup machViewGroup) {
        Object[] objArr = {bVar, mach, activity, machViewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd9f3410ba484d5c55371fc194152f14", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd9f3410ba484d5c55371fc194152f14") : new c(bVar, mach, activity, machViewGroup);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "332409a5d4010ad49d6911567a9c1f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "332409a5d4010ad49d6911567a9c1f4f");
            return;
        }
        b bVar = this.b;
        Mach mach = this.c;
        Activity activity = this.d;
        MachViewGroup machViewGroup = this.e;
        Object[] objArr2 = {bVar, mach, activity, machViewGroup};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "47be253b3f4a0afcea75f01290ff79d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "47be253b3f4a0afcea75f01290ff79d7");
            return;
        }
        try {
            mach.initWithBundle(activity, machViewGroup, bVar.f);
            mach.render(bVar.c);
        } catch (Throwable unused) {
        }
    }
}
