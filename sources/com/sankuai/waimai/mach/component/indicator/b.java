package com.sankuai.waimai.mach.component.indicator;

import android.content.Context;
import android.support.annotation.NonNull;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<IndicatorView> {
    public static ChangeQuickRedirect a;
    private c b;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(IndicatorView indicatorView) {
        IndicatorView indicatorView2 = indicatorView;
        Object[] objArr = {indicatorView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "159e2df4ee6c430ea57cf2de137611e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "159e2df4ee6c430ea57cf2de137611e2");
            return;
        }
        super.a((b) indicatorView2);
        c cVar = this.b;
        Mach mach = this.m;
        Object[] objArr2 = {cVar, mach};
        ChangeQuickRedirect changeQuickRedirect2 = IndicatorView.a;
        if (PatchProxy.isSupport(objArr2, indicatorView2, changeQuickRedirect2, false, "78c4a08e8a556ce84eb1dad190dfd01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, indicatorView2, changeQuickRedirect2, false, "78c4a08e8a556ce84eb1dad190dfd01e");
            return;
        }
        indicatorView2.d = new a(mach.getThemeProvider(), cVar);
        indicatorView2.b.setAdapter(indicatorView2.d);
        indicatorView2.c = cVar.a;
        int i = cVar.b;
        if (i <= 0 || i >= cVar.e) {
            return;
        }
        indicatorView2.d.a(i);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    @NonNull
    public final /* synthetic */ IndicatorView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25b928a39b114b387a780ca13cf8c5cd", RobustBitConfig.DEFAULT_VALUE) ? (IndicatorView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25b928a39b114b387a780ca13cf8c5cd") : new IndicatorView(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed8279cea3f034e6a93b3832a3af4ed2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed8279cea3f034e6a93b3832a3af4ed2");
            return;
        }
        String a2 = a(RemoteMessageConst.NOTIFICATION);
        String a3 = a("index");
        String a4 = a("selected-color");
        String a5 = a("unselected-color");
        String a6 = a("count");
        this.b = new c();
        this.b.a = a2;
        this.b.b = g.c(a3);
        this.b.c = a4;
        this.b.d = a5;
        this.b.e = f(a6);
        this.b.f = (int) com.sankuai.waimai.machpro.util.b.a((Object) a("dot-size"));
        this.b.g = (int) com.sankuai.waimai.machpro.util.b.a((Object) a("selected-dot-size"));
        this.b.h = (int) com.sankuai.waimai.machpro.util.b.a((Object) a("dot-spacing"));
    }
}
