package com.sankuai.waimai.launcher.provider.scheme.interceptor;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.platform.schemereplace.SchemeReplaceRule;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import com.sankuai.waimai.router.core.j;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;
    private List<SchemeReplaceRule> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ac89ead3249ec16f0858799ff425bb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ac89ead3249ec16f0858799ff425bb3");
        } else {
            this.b = com.sankuai.waimai.router.a.a(SchemeReplaceRule.class);
        }
    }

    private void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847440c9378ff81c75e9d2cd43ca2dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847440c9378ff81c75e9d2cd43ca2dd1");
        } else if (!d.a(this.b)) {
            for (SchemeReplaceRule schemeReplaceRule : this.b) {
                if (schemeReplaceRule != null && schemeReplaceRule.shouldReplace(jVar.d)) {
                    schemeReplaceRule.schemeReplace(jVar);
                    return;
                }
            }
        }
    }

    @Override // com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebebcd21c78fa3a707c07927ef942e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebebcd21c78fa3a707c07927ef942e2a");
            return;
        }
        Uri uri = jVar.d;
        if (TextUtils.equals(uri.getScheme(), "wm_router") && TextUtils.equals(uri.getHost(), "page")) {
            a(jVar);
        }
        if (TextUtils.equals(uri.getScheme(), com.sankuai.waimai.foundation.router.interfaces.b.a) && TextUtils.equals(uri.getHost(), com.sankuai.waimai.foundation.router.interfaces.b.b)) {
            a(jVar);
        }
        gVar.a();
    }
}
