package com.meituan.android.ptcommonim.pageadapter.message.item;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.widget.MachViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final b b;
    private final Activity c;
    private final MachViewGroup d;

    private c(b bVar, Activity activity, MachViewGroup machViewGroup) {
        this.b = bVar;
        this.c = activity;
        this.d = machViewGroup;
    }

    public static View.OnClickListener a(b bVar, Activity activity, MachViewGroup machViewGroup) {
        Object[] objArr = {bVar, activity, machViewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "73ebe05bdf7e7f27c81f01b0975fe425", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "73ebe05bdf7e7f27c81f01b0975fe425") : new c(bVar, activity, machViewGroup);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f13f22bc6d0c326e6921668848c1825e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f13f22bc6d0c326e6921668848c1825e");
        } else {
            b.a(this.b, this.c, this.d, view);
        }
    }
}
