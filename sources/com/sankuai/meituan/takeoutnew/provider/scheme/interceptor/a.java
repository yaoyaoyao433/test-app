package com.sankuai.meituan.takeoutnew.provider.scheme.interceptor;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.platform.net.e;
import com.sankuai.waimai.router.common.i;
import com.sankuai.waimai.router.core.j;
import com.sankuai.waimai.router.utils.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends i {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.common.i
    public final void a(@NonNull j jVar) {
        String b;
        boolean contains;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4376611f6a40528ef94fb0a80a2816fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4376611f6a40528ef94fb0a80a2816fb");
            return;
        }
        super.a(jVar);
        Uri uri = jVar.d;
        Uri.Builder buildUpon = uri.buildUpon();
        com.sankuai.waimai.platform.net.util.a a2 = com.sankuai.waimai.platform.net.util.a.a();
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.util.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "107915f54852416906eeb206ac3a043b", RobustBitConfig.DEFAULT_VALUE)) {
            contains = ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "107915f54852416906eeb206ac3a043b")).booleanValue();
        } else {
            Object[] objArr3 = {uri};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.util.a.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "eccec06608da910a43d22a1709e00ce5", RobustBitConfig.DEFAULT_VALUE)) {
                b = (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "eccec06608da910a43d22a1709e00ce5");
            } else {
                b = uri == null ? "" : a2.b(uri.getPath());
            }
            contains = b.contains("ll");
        }
        if (!contains) {
            String i = g.i();
            if (!TextUtils.isEmpty(i)) {
                if (i.length() > 30) {
                    i = i.substring(0, 30);
                }
                buildUpon.appendQueryParameter(GearsLocator.ADDRESS, i);
            }
        }
        if (!"android".equals(uri.getQueryParameter("f"))) {
            buildUpon.appendQueryParameter("f", "android");
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("version"))) {
            buildUpon.appendQueryParameter("version", String.valueOf(com.sankuai.waimai.platform.b.A().j()));
        }
        Uri build = buildUpon.build();
        Uri a3 = f.a(f.a(build, e.a(build.toString())), com.sankuai.waimai.platform.net.c.a().g());
        if (com.sankuai.waimai.business.knb.utils.c.a() != null) {
            a3 = f.a(a3, com.sankuai.waimai.business.knb.utils.c.a());
        }
        jVar.a(a3);
    }

    @Override // com.sankuai.waimai.router.common.i, com.sankuai.waimai.router.core.i
    public final void a(@NonNull j jVar, @NonNull com.sankuai.waimai.router.core.g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d905db9f355f853531630c609bbbf06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d905db9f355f853531630c609bbbf06f");
        } else if (!ProcessUtils.isMainProcess(com.meituan.android.singleton.b.a)) {
            gVar.a();
        } else {
            super.a(jVar, gVar);
        }
    }
}
