package com.sankuai.meituan.takeoutnew.provider.scheme.handler;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@Nullable j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final String toString() {
        return "BrowserSchemeHandler";
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eced8106a2e6728c6c889e4a4842ca67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eced8106a2e6728c6c889e4a4842ca67");
            return;
        }
        String a2 = com.sankuai.waimai.launcher.provider.scheme.d.a(jVar.d);
        if (TextUtils.isEmpty(a2) || a2.startsWith(StringUtil.SPACE)) {
            gVar.a(400);
            return;
        }
        String queryParameter = jVar.d.getQueryParameter("unpl");
        if (!TextUtils.isEmpty(queryParameter) && queryParameter.length() < 256) {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(jVar.c.getApplicationContext(), "unpl", queryParameter);
        }
        Uri parse = Uri.parse(a2);
        if (TextUtils.equals(jVar.d.getQueryParameter("future"), "1")) {
            parse = parse.buildUpon().appendQueryParameter("future", "1").build();
        }
        if (TextUtils.equals(jVar.d.getQueryParameter("notitlebar"), "1")) {
            Bundle bundle = (Bundle) jVar.a(Bundle.class, "com.sankuai.waimai.router.activity.intent_extra");
            if (bundle == null) {
                bundle = new Bundle();
                jVar.b("com.sankuai.waimai.router.activity.intent_extra", (String) bundle);
            }
            bundle.putString("notitlebar", "1");
        }
        jVar.a(parse);
        gVar.a(301);
    }
}
