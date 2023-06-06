package com.meituan.android.ptcommonim.pageadapter.message.item;

import android.app.Activity;
import com.meituan.android.ptcommonim.pageadapter.message.item.b;
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
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd8e496113a292f96a39831d9580fd48", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd8e496113a292f96a39831d9580fd48") : new d(anonymousClass2, eVar, mach, activity, machViewGroup);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e21fe88ece0e92f027c6f600ddc79d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e21fe88ece0e92f027c6f600ddc79d4");
        } else {
            b.AnonymousClass2.a(this.b, this.c, this.d, this.e, this.f);
        }
    }
}
