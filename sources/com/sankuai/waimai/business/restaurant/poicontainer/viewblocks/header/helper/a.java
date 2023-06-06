package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ai.uat.b;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.poi.Poi;
import com.sankuai.waimai.platform.domain.manager.observers.a;
import com.sankuai.waimai.platform.restaurant.membercoupon.IExchangeCouponDialogNew;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    protected final Activity b;
    @NonNull
    protected final g c;
    protected final String d;
    public a.InterfaceC1050a e;

    public a(Activity activity, @NonNull g gVar, String str) {
        Object[] objArr = {activity, gVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "745b9f77a74e74ae32f706d8db9b5b67", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "745b9f77a74e74ae32f706d8db9b5b67");
            return;
        }
        this.e = new a.InterfaceC1050a() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.domain.manager.observers.a.InterfaceC1050a
            public final void b(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08a0565f450b935f864617290cf2178c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08a0565f450b935f864617290cf2178c");
                    return;
                }
                switch (i) {
                    case 1:
                    case 4:
                        ae.a(a.this.b, a.this.c.t);
                        Poi.PoiCouponItem poiCouponItem = a.this.c.v;
                        if (poiCouponItem != null) {
                            poiCouponItem.mCouponStatus = 0;
                            return;
                        }
                        return;
                    case 2:
                        ae.a(a.this.b, a.this.c.u);
                        return;
                    case 3:
                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(a.this.c.f());
                        return;
                    default:
                        ae.a(a.this.b, a.this.c.u);
                        return;
                }
            }
        };
        this.b = activity;
        this.c = gVar;
        this.d = str;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a10cb5941549219a12005206ade4db7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a10cb5941549219a12005206ade4db7b");
        } else {
            com.sankuai.waimai.platform.domain.manager.observers.a.a().a(this.e);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1650dd9e301c646388fb00bdcfd4c621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1650dd9e301c646388fb00bdcfd4c621");
        } else {
            com.sankuai.waimai.platform.domain.manager.observers.a.a().b(this.e);
        }
    }

    public final void a(@NonNull View view, @NonNull Poi.PoiCouponItem poiCouponItem, int i, final String str) {
        Object[] objArr = {view, poiCouponItem, -1, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21081f7ecf2b0e83bf457917567c415b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21081f7ecf2b0e83bf457917567c415b");
            return;
        }
        Activity activity = this.b;
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8bc8318ee8332312033704a7a87bed9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8bc8318ee8332312033704a7a87bed9d");
        } else {
            JudasManualManager.a a2 = JudasManualManager.a("b_2nedvmcz").a("c_CijEL");
            a2.b = AppUtil.generatePageInfoKey(activity);
            a2.a();
            b.a().a("EXCHANGE_RED_PACKED_KEY", Boolean.TRUE);
        }
        this.c.v = null;
        if (poiCouponItem.isCouponExchanged()) {
            return;
        }
        Context context = view.getContext();
        if (com.sankuai.waimai.platform.domain.manager.user.a.i().a()) {
            if (poiCouponItem.mCouponStatus == 2) {
                this.c.v = poiCouponItem;
            }
            IExchangeCouponDialogNew iExchangeCouponDialogNew = (IExchangeCouponDialogNew) com.sankuai.waimai.router.a.a(IExchangeCouponDialogNew.class, "/showexchangecoupondialog_new");
            if (iExchangeCouponDialogNew != null) {
                iExchangeCouponDialogNew.showExchangeCouponDialog(this.b, this.d, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1fe6075f779be22d88a554af3ca0e549", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1fe6075f779be22d88a554af3ca0e549");
                            return;
                        }
                        com.sankuai.waimai.platform.domain.manager.poi.a.a().a(a.this.c.f());
                        String f = a.this.c.f();
                        JudasManualManager.a a3 = JudasManualManager.b("b_pk6ebp1m").a(str);
                        a3.b = AppUtil.generatePageInfoKey(a.this.b);
                        if (TextUtils.isEmpty(f)) {
                            f = "";
                        }
                        a3.a("poi_id", f).a();
                    }
                }, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "22de775e1055bb5c46017ef7b6fcced2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "22de775e1055bb5c46017ef7b6fcced2");
                            return;
                        }
                        String f = a.this.c.f();
                        JudasManualManager.a a3 = JudasManualManager.b("b_ab6yt8ef").a(str);
                        a3.b = AppUtil.generatePageInfoKey(a.this.b);
                        if (TextUtils.isEmpty(f)) {
                            f = "";
                        }
                        a3.a("poi_id", f).a();
                    }
                }, com.sankuai.waimai.platform.domain.core.poi.b.a(this.c.f()), this.c.f(), 0, poiCouponItem.mCouponViewId, 1);
                return;
            }
            return;
        }
        com.sankuai.waimai.foundation.core.service.user.a.a = a.EnumC0947a.FROM_COUPON;
        com.sankuai.waimai.platform.domain.manager.user.a.a(context, new Runnable() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.helper.a.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d49189da40d534b03e3f1d0fa4181a9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d49189da40d534b03e3f1d0fa4181a9e");
                } else {
                    com.sankuai.waimai.platform.domain.manager.poi.a.a().a(a.this.c.f());
                }
            }
        });
    }

    public static void a(Activity activity, g gVar, int i) {
        Object[] objArr = {activity, gVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "336a38270744a31a2f0416f814db4a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "336a38270744a31a2f0416f814db4a92");
        } else if (i == -1) {
            ae.a(activity, gVar.t);
            JudasManualManager.a a2 = JudasManualManager.b("b_sv9wch6s").a("c_CijEL");
            a2.b = AppUtil.generatePageInfoKey(activity);
            a2.a();
            Poi.PoiCouponItem poiCouponItem = gVar.v;
            if (poiCouponItem != null) {
                poiCouponItem.mCouponStatus = 0;
            }
        } else {
            JudasManualManager.a a3 = JudasManualManager.b("b_2d7ii7rd").a("c_CijEL");
            a3.b = AppUtil.generatePageInfoKey(activity);
            a3.a();
            ae.a(activity, gVar.u);
        }
    }
}
