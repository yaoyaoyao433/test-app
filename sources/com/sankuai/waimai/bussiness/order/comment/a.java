package com.sankuai.waimai.bussiness.order.comment;

import android.app.Activity;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.h;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends h {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.h
    public final void a(@NonNull j jVar, @NonNull g gVar) {
        Object[] objArr = {jVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63102626a3293ba402a63c139131b130", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63102626a3293ba402a63c139131b130");
            return;
        }
        Uri uri = jVar.d;
        com.sankuai.waimai.business.order.api.orderlist.a.a((Activity) jVar.c, "", uri.getQueryParameter("orderid"), "", "", gVar, !TextUtils.isEmpty(uri.getQueryParameter("source_page_type")) ? uri.getQueryParameter("source_page_type") : "1");
    }
}
