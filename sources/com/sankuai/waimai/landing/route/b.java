package com.sankuai.waimai.landing.route;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.landing.a;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960ef4d7be2b7ea72cc06dc3dd39a7be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960ef4d7be2b7ea72cc06dc3dd39a7be");
            return;
        }
        if (jVar != null && jVar.d != null) {
            try {
                String b = af.b(jVar.d, "ad_slot", "");
                String b2 = af.b(jVar.d, "ad_channel", "");
                if (TextUtils.isEmpty(b) && TextUtils.isEmpty(b2) && com.sankuai.waimai.landing.util.a.a(jVar.d) == a.EnumC0984a.H5) {
                    String b3 = af.b(jVar.d, "inner_url", "");
                    Uri parse = TextUtils.isEmpty(b3) ? Uri.EMPTY : Uri.parse(b3);
                    String b4 = af.b(parse, "ad_slot", "");
                    b2 = af.b(parse, "ad_channel", "");
                    b = b4;
                }
                if (!TextUtils.isEmpty(b) && !TextUtils.isEmpty(b2)) {
                    Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                    if (bundle == null) {
                        com.sankuai.waimai.landing.report.b.a(b, b2, "route_start_bundle_null");
                        bundle = new Bundle();
                    }
                    bundle.putString("ad_slot", b);
                    bundle.putString("ad_channel", b2);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
                    com.sankuai.waimai.foundation.utils.log.a.b("AdUriInterceptor", "ad uri intercept: has slot and channel.", new Object[0]);
                    com.sankuai.waimai.landing.a aVar = new com.sankuai.waimai.landing.a();
                    aVar.b = b;
                    aVar.c = b2;
                    aVar.e = com.sankuai.waimai.landing.util.a.a(jVar.d);
                    aVar.j = jVar.d.getPath();
                    com.sankuai.waimai.landing.b.a().a(com.sankuai.waimai.landing.state.b.ROUTE_START, aVar);
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
        gVar.a();
    }
}
