package com.sankuai.waimai.launcher.provider.scheme;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.j;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends f {
    public static ChangeQuickRedirect a = null;
    private static final String b = "c";
    private static final String c = com.sankuai.waimai.foundation.router.interfaces.b.a;
    private static final String j = com.sankuai.waimai.foundation.router.interfaces.b.b;

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce2fc45f66b561bc3da61446e6ddb2f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce2fc45f66b561bc3da61446e6ddb2f9");
        }
    }

    @Override // com.sankuai.waimai.router.core.b, com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        Uri b2;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09ff70621ba8c1e3e2aa07f59966936b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09ff70621ba8c1e3e2aa07f59966936b")).booleanValue();
        }
        if (com.sankuai.meituan.takeoutnew.a.a) {
            String str = b;
            com.sankuai.waimai.foundation.utils.log.a.b(str, "shouldHandle() uri: " + jVar.d.toString(), new Object[0]);
        }
        Uri uri = jVar.d;
        if (a(uri) && (b2 = b(uri)) != null) {
            uri = b2;
        }
        com.sankuai.waimai.platform.urlreplace.b a2 = com.sankuai.waimai.platform.urlreplace.b.a();
        Object[] objArr2 = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.urlreplace.b.a;
        return PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "32b17cb807e726259c5c6c9ecb3b9965", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "32b17cb807e726259c5c6c9ecb3b9965")).booleanValue() : a2.a(uri) != null;
    }

    private boolean a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c89dc7ca86fde79c774c61fc117f8b1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c89dc7ca86fde79c774c61fc117f8b1")).booleanValue() : c.equals(uri.getScheme()) && j.equals(uri.getHost()) && "/browser".equals(uri.getPath());
    }

    @Nullable
    private Uri b(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f22b5ee2446a7cfe76ddda22d5a43bf4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f22b5ee2446a7cfe76ddda22d5a43bf4");
        }
        String queryParameter = uri.getQueryParameter("inner_url");
        if (queryParameter != null) {
            return Uri.parse(queryParameter);
        }
        return null;
    }

    @Override // com.sankuai.waimai.router.core.b, com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Uri c2;
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e471eec21f18cb0b61e6d4e92784d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e471eec21f18cb0b61e6d4e92784d4");
            return;
        }
        if (com.sankuai.meituan.takeoutnew.a.a) {
            String str = b;
            com.sankuai.waimai.foundation.utils.log.a.b(str, "handleInternal() uri: " + jVar.d.toString(), new Object[0]);
        }
        Uri uri = jVar.d;
        if (a(uri)) {
            c2 = c(uri);
        } else {
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            c2 = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6fe8e44153901fc4ed615039e0e0d27a", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6fe8e44153901fc4ed615039e0e0d27a") : com.sankuai.waimai.platform.urlreplace.b.a().b(uri);
        }
        if (c2 != null) {
            if (com.sankuai.meituan.takeoutnew.a.a) {
                String str2 = b;
                com.sankuai.waimai.foundation.utils.log.a.b(str2, "dest uri: " + c2.toString(), new Object[0]);
            }
            jVar.a(c2);
            gVar.a();
            return;
        }
        super.a(jVar, gVar);
    }

    @Nullable
    private Uri c(@Nullable Uri uri) {
        Uri b2;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5dbbde8f3548f19cf9363ac0e6c1edf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5dbbde8f3548f19cf9363ac0e6c1edf");
        }
        if (uri == null || (b2 = com.sankuai.waimai.platform.urlreplace.b.a().b(b(uri))) == null) {
            return null;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str : queryParameterNames) {
            if (!"inner_url".equals(str)) {
                clearQuery.appendQueryParameter(str, uri.getQueryParameter(str));
            }
        }
        clearQuery.appendQueryParameter("inner_url", b2.toString());
        return clearQuery.build();
    }
}
