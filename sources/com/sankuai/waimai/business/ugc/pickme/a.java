package com.sankuai.waimai.business.ugc.pickme;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73dd281e4d3b75a751bb7374d166641f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73dd281e4d3b75a751bb7374d166641f");
            return;
        }
        String uri = jVar.d.toString();
        if (uri != null && uri.contains("/pickme")) {
            long currentTimeMillis = System.currentTimeMillis();
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putLong("routerStartTime", currentTimeMillis);
            bundle.putString("source_id", jVar.d.getQueryParameter("source_id"));
            jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
        }
        gVar.a();
    }
}
