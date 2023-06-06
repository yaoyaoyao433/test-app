package com.meituan.android.ptcommonim.pageadapter.widget;

import android.app.Activity;
import com.meituan.android.ptcommonim.pageadapter.widget.PTFrameMachContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.widget.MachViewGroup;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public static ChangeQuickRedirect a;
    private final PTFrameMachContainer.AnonymousClass1 b;
    private final com.sankuai.waimai.mach.manager.cache.e c;
    private final Mach d;
    private final Activity e;
    private final Map f;

    private b(PTFrameMachContainer.AnonymousClass1 anonymousClass1, com.sankuai.waimai.mach.manager.cache.e eVar, Mach mach, Activity activity, Map map) {
        this.b = anonymousClass1;
        this.c = eVar;
        this.d = mach;
        this.e = activity;
        this.f = map;
    }

    public static Runnable a(PTFrameMachContainer.AnonymousClass1 anonymousClass1, com.sankuai.waimai.mach.manager.cache.e eVar, Mach mach, Activity activity, Map map) {
        Object[] objArr = {anonymousClass1, eVar, mach, activity, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e861b8f2cbc935444c40d911e4c59926", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e861b8f2cbc935444c40d911e4c59926") : new b(anonymousClass1, eVar, mach, activity, map);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MachViewGroup machViewGroup;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "590cc054975a308990f45e4a2d3427f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "590cc054975a308990f45e4a2d3427f7");
            return;
        }
        PTFrameMachContainer.AnonymousClass1 anonymousClass1 = this.b;
        com.sankuai.waimai.mach.manager.cache.e eVar = this.c;
        Mach mach = this.d;
        Activity activity = this.e;
        Map<String, Object> map = this.f;
        Object[] objArr2 = {anonymousClass1, eVar, mach, activity, map};
        ChangeQuickRedirect changeQuickRedirect2 = PTFrameMachContainer.AnonymousClass1.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2e830f8b2d630b33af80bbe80ac3e9be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2e830f8b2d630b33af80bbe80ac3e9be");
            return;
        }
        try {
            PTFrameMachContainer.this.e = eVar;
            machViewGroup = PTFrameMachContainer.this.d;
            mach.initWithBundle(activity, machViewGroup, eVar);
            mach.render(map);
        } catch (Throwable unused) {
        }
    }
}
