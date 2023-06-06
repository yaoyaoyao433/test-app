package com.sankuai.waimai.bussiness.order.confirm.request.preview;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse;
import com.sankuai.waimai.bussiness.order.confirm.request.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends b {
    public static ChangeQuickRedirect q;
    Dialog r;
    protected View s;

    public static /* synthetic */ void a(c cVar, long j, String str, String str2, String str3) {
        Object[] objArr = {new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "1f9b1aaaf99120b50f2bcb2583352766", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "1f9b1aaaf99120b50f2bcb2583352766");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("poiName", str2);
        bundle.putString("sputag_id", str3);
        com.sankuai.waimai.foundation.router.a.a(cVar.b, com.sankuai.waimai.foundation.router.interfaces.c.b, bundle);
    }

    public c(Activity activity, @NonNull b.C0904b c0904b, com.sankuai.waimai.platform.domain.manager.order.a aVar, View view) {
        super(activity, c0904b, aVar);
        Object[] objArr = {activity, c0904b, aVar, view};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00f94c4188aa3f8a1a2014f3fd5691c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00f94c4188aa3f8a1a2014f3fd5691c");
            return;
        }
        this.r = null;
        this.s = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0346  */
    @Override // com.sankuai.waimai.bussiness.order.confirm.request.preview.a.InterfaceC0905a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse r34) {
        /*
            Method dump skipped, instructions count: 2064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.request.preview.c.a(com.sankuai.waimai.bussiness.order.confirm.request.OrderResponse):boolean");
    }

    private void a(Activity activity, OrderResponse orderResponse, String str, long j, String str2, String str3, String str4) {
        Object[] objArr = {activity, orderResponse, str, new Long(j), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d610f63901b20bfdcb133cbb532aac41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d610f63901b20bfdcb133cbb532aac41");
        } else {
            i.a(this.b, str, orderResponse.e, orderResponse.i, d.a(this, activity, j, str2, str3, str4));
        }
    }

    public static /* synthetic */ void a(c cVar, Activity activity, long j, String str, String str2, String str3, View view) {
        Object[] objArr = {cVar, activity, new Long(j), str, str2, str3, view};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "74383d15c23fc110333298d966632a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "74383d15c23fc110333298d966632a6b");
        } else if (com.sankuai.waimai.business.order.api.submit.constants.a.e(cVar.h)) {
        } else {
            if (!com.sankuai.waimai.business.order.api.submit.constants.a.a(cVar.h)) {
                activity.finish();
            }
            cVar.a(activity, j, str, str2, str3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, long j, String str, String str2, String str3) {
        Object[] objArr = {context, new Long(j), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = q;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53db4673cd1672bee22495b045e9ece9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53db4673cd1672bee22495b045e9ece9");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("poiId", j);
        bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, str);
        bundle.putString("poiName", str2);
        if (com.sankuai.waimai.business.order.api.submit.constants.a.b(this.h)) {
            com.sankuai.waimai.foundation.router.a.a(context, com.sankuai.waimai.business.order.api.store.f.a(this.h), bundle);
        } else {
            com.sankuai.waimai.business.order.submit.b.a(context, bundle, this.k);
        }
    }
}
