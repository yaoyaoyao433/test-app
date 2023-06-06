package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;
    private final Activity c;
    private final long d;
    private final String e;
    private final String f;
    private final String g;

    private d(c cVar, Activity activity, long j, String str, String str2, String str3) {
        this.b = cVar;
        this.c = activity;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public static View.OnClickListener a(c cVar, Activity activity, long j, String str, String str2, String str3) {
        Object[] objArr = {cVar, activity, new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55f8b38c4dfb6265ef8ad918f5684873", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55f8b38c4dfb6265ef8ad918f5684873") : new d(cVar, activity, j, str, str2, str3);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "829a8429dd8554d8ed739eb912437444", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "829a8429dd8554d8ed739eb912437444");
        } else {
            c.a(this.b, this.c, this.d, this.e, this.f, this.g, view);
        }
    }
}
