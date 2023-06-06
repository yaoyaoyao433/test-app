package com.sankuai.waimai.business.page.common;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.reactnative.WmRNActivity;
import com.sankuai.waimai.router.activity.c;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends c {
    public static ChangeQuickRedirect a;

    public a() {
        super(KingKongActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3142fcde1365b35be59b29fb5fa9c803", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3142fcde1365b35be59b29fb5fa9c803");
        }
    }

    @Override // com.sankuai.waimai.router.activity.c, com.sankuai.waimai.router.activity.a
    @NonNull
    public final Intent b(@NonNull j jVar) {
        Uri a2;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10cde068e0667e3542d3a89754a64494", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10cde068e0667e3542d3a89754a64494");
        }
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            a2 = a(jVar.d);
            jVar.a(a2);
        } else {
            a2 = jVar.d;
        }
        long parseLong = a2.getQueryParameter("categorytype") != null ? Long.parseLong(a2.getQueryParameter("categorytype")) : 0L;
        if (com.sankuai.waimai.business.page.kingkong.utils.a.a(com.sankuai.waimai.business.page.common.second.a.a, parseLong) || (com.sankuai.waimai.business.page.kingkong.utils.a.a(com.sankuai.waimai.business.page.common.second.a.b, parseLong) && com.sankuai.waimai.foundation.core.a.b())) {
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81cb06a605860dffd2ce4c9210720bd2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Intent) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81cb06a605860dffd2ce4c9210720bd2");
            }
            Intent intent = new Intent();
            jVar.a(jVar.d.buildUpon().scheme("wm_router").authority("page").path("/mrn").appendQueryParameter("mrn_biz", "waimai").appendQueryParameter("mrn_entry", "city-delivery").appendQueryParameter("mrn_component", "cityDelivery").build());
            intent.setClass(jVar.c, WmRNActivity.class);
            return intent;
        }
        return super.b(jVar);
    }

    @Override // com.sankuai.waimai.router.activity.a, com.sankuai.waimai.router.core.h
    public final boolean a(@NonNull j jVar) {
        Uri a2;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4757b389fd1fc58cb5416fb85b3119c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4757b389fd1fc58cb5416fb85b3119c6")).booleanValue();
        }
        if (!com.sankuai.waimai.foundation.core.a.d()) {
            a2 = a(jVar.d);
        } else {
            a2 = jVar.d;
        }
        long parseLong = a2.getQueryParameter("categorytype") != null ? Long.parseLong(a2.getQueryParameter("categorytype")) : 0L;
        return (parseLong == 101712 || (parseLong == 224186 && com.sankuai.waimai.foundation.core.a.b())) ? false : true;
    }

    private Uri a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c431f75b22de4834b10daffde7b2df39", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c431f75b22de4834b10daffde7b2df39") : Uri.parse(uri.toString().replaceAll("category_type", "categorytype").replaceAll("category_text", "categorytext"));
    }
}
