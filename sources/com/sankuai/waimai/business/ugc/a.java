package com.sankuai.waimai.business.ugc;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d678fda585386075cd7bf015a7603859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d678fda585386075cd7bf015a7603859");
            return;
        }
        String uri = jVar.d.toString();
        if (uri != null) {
            if (uri.contains("wmmediapreview")) {
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "352b124afe1bcf43bd03d62bdd42c1b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "352b124afe1bcf43bd03d62bdd42c1b2");
                } else {
                    Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    bundle.putInt("KEY_ROUTER_TARGET_ABILITY", 1);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
                }
            } else if (uri.contains("selectvideocover")) {
                Object[] objArr3 = {jVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c23605e6f3fb83d6ec1c9b3970ddd6b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c23605e6f3fb83d6ec1c9b3970ddd6b2");
                } else {
                    Bundle bundle2 = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    bundle2.putInt("KEY_ROUTER_TARGET_ABILITY", 2);
                    jVar.a("com.sankuai.waimai.router.activity.intent_extra", (String) bundle2);
                }
            }
        }
        gVar.a();
    }
}
