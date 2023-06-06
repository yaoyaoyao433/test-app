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
import com.sankuai.waimai.router.core.e;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbd2b14be0f0cb61ff33de2e4b0c8015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbd2b14be0f0cb61ff33de2e4b0c8015");
        } else if (jVar == null || jVar.d == null) {
        } else {
            try {
                if (jVar.d.isOpaque()) {
                    return;
                }
                String b = af.b(jVar.d, "ad_slot", "");
                String b2 = af.b(jVar.d, "ad_channel", "");
                if (TextUtils.isEmpty(b) && TextUtils.isEmpty(b2) && com.sankuai.waimai.landing.util.a.a(jVar.d) == a.EnumC0984a.H5) {
                    String b3 = af.b(jVar.d, "inner_url", "");
                    Uri parse = TextUtils.isEmpty(b3) ? Uri.EMPTY : Uri.parse(b3);
                    String b4 = af.b(parse, "ad_slot", "");
                    b2 = af.b(parse, "ad_channel", "");
                    b = b4;
                }
                if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("AdRouteOnCompleteListener", "onSuccess", new Object[0]);
                com.sankuai.waimai.landing.a aVar = new com.sankuai.waimai.landing.a();
                aVar.b = b;
                aVar.c = b2;
                aVar.e = com.sankuai.waimai.landing.util.a.a(jVar.d);
                aVar.j = jVar.d.getPath();
                com.sankuai.waimai.landing.b.a().a(com.sankuai.waimai.landing.state.b.ROUTE_SUCCESS, aVar);
                Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                if (bundle != null) {
                    String string = bundle.getString("ad_slot");
                    String string2 = bundle.getString("ad_channel");
                    if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                        com.sankuai.waimai.landing.report.b.a(b, b2, "route_success_no_intent");
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d37fc3328b110cf8386a534c38ee1730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d37fc3328b110cf8386a534c38ee1730");
        } else if (jVar == null || jVar.d == null) {
        } else {
            try {
                if (jVar.d.isOpaque()) {
                    return;
                }
                String b = af.b(jVar.d, "ad_slot", "");
                String b2 = af.b(jVar.d, "ad_channel", "");
                if (TextUtils.isEmpty(b) && TextUtils.isEmpty(b2) && com.sankuai.waimai.landing.util.a.a(jVar.d) == a.EnumC0984a.H5) {
                    String b3 = af.b(jVar.d, "inner_url", "");
                    Uri parse = TextUtils.isEmpty(b3) ? Uri.EMPTY : Uri.parse(b3);
                    String b4 = af.b(parse, "ad_slot", "");
                    b2 = af.b(parse, "ad_channel", "");
                    b = b4;
                }
                if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
                    return;
                }
                com.sankuai.waimai.foundation.utils.log.a.b("AdRouteOnCompleteListener", "onError", new Object[0]);
                com.sankuai.waimai.landing.a aVar = new com.sankuai.waimai.landing.a();
                aVar.b = b;
                aVar.c = b2;
                aVar.f = i;
                aVar.e = com.sankuai.waimai.landing.util.a.a(jVar.d);
                aVar.j = jVar.d.getPath();
                com.sankuai.waimai.landing.b.a().a(com.sankuai.waimai.landing.state.b.ROUTE_FAILED, aVar);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
        }
    }
}
