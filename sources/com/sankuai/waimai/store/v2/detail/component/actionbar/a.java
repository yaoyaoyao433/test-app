package com.sankuai.waimai.store.v2.detail.component.actionbar;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.c;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.viewblocks.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    e b;
    c.a c;
    Activity d;
    SGDetailSearchActionBarShowMoreBlock e;

    public a(Activity activity, c.a aVar, SGDetailSearchActionBarShowMoreBlock sGDetailSearchActionBarShowMoreBlock) {
        Object[] objArr = {activity, aVar, sGDetailSearchActionBarShowMoreBlock};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f610b8fecca482e6742d4332891511", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f610b8fecca482e6742d4332891511");
            return;
        }
        this.e = sGDetailSearchActionBarShowMoreBlock;
        this.d = activity;
        this.c = aVar;
    }

    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4620332b928ed3425bedee7d1c72bd8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4620332b928ed3425bedee7d1c72bd8e");
            return;
        }
        if (this.b.b()) {
            e eVar = this.b;
            Object[] objArr2 = {"b_waimai_sg_v2dfue94_mc"};
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "5501b5fec893e3f06007d24453848204", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "5501b5fec893e3f06007d24453848204");
            } else {
                b.a(eVar.b, "b_waimai_sg_v2dfue94_mc").a("is_fold", 1).a();
                eVar.a();
            }
        } else {
            this.b.a(getMenuResponse);
            this.b.b(this.e.l);
            if (ab.b().b((Context) this.d, "wm_sc_goods_details_pop_menu", -999) == 999) {
                Object[] objArr3 = {0};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b661e2dec3c3ffabf4fcf94cce47d00", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b661e2dec3c3ffabf4fcf94cce47d00");
                } else {
                    b.a(this.d, "b_waimai_sg_v2dfue94_mc").a("is_fold", 0).a();
                }
            }
        }
        ab.b().a((Context) this.d, "wm_sc_goods_details_pop_menu", 999);
    }
}
