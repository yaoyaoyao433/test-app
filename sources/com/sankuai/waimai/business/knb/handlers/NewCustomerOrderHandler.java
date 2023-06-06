package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.c;
import com.sankuai.waimai.business.knb.utils.OrderSchemeFactory;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.domain.manager.user.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NewCustomerOrderHandler extends TakeoutBaseJsHandler {
    private static final String KEY_LOGIN_OBSERVER = "com.sankuai.waimai.business.knb.handlers.NewCustomerOrderHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final b loginObserver;

    public NewCustomerOrderHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f9e0c546b952491c23161ff4658b3dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f9e0c546b952491c23161ff4658b3dc");
        } else {
            this.loginObserver = new b() { // from class: com.sankuai.waimai.business.knb.handlers.NewCustomerOrderHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onChanged(b.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18ed93c691d36ace140f12c900a683d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18ed93c691d36ace140f12c900a683d3");
                    } else if (aVar == b.a.LOGIN) {
                        NewCustomerOrderHandler.this.openOrderConfirmActivity();
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                    Object[] objArr2 = {enumC0948b};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "095bebf8bc3ab3cab3f97a056284fcaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "095bebf8bc3ab3cab3f97a056284fcaf");
                    } else if (enumC0948b == b.EnumC0948b.PHONE) {
                        NewCustomerOrderHandler.this.openOrderConfirmActivity();
                    }
                }
            };
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7931e531420c22ed934fd9abd3eef48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7931e531420c22ed934fd9abd3eef48");
        } else if (validateArgs()) {
            Activity activity = jsHost().getActivity();
            if (activity instanceof c) {
                ((c) activity).a(KEY_LOGIN_OBSERVER, this.loginObserver);
            }
            openOrderConfirmActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openOrderConfirmActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c9f8856b72b71489e049d3944cdb8af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c9f8856b72b71489e049d3944cdb8af");
            return;
        }
        final Activity activity = jsHost().getActivity();
        if (activity == null) {
            return;
        }
        final String w = activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "";
        final long optLong = jsBean().argsJson.optLong("poi_id");
        final String optString = jsBean().argsJson.optString(FoodDetailNetWorkPreLoader.URI_POI_STR);
        final List<WmOrderedFood> fromJsonArray = WmOrderedFood.fromJsonArray(jsBean().argsJson.optJSONArray("food"));
        final String json = new Gson().toJson(fromJsonArray);
        a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.knb.handlers.NewCustomerOrderHandler.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "28f4bbfcc084fd0d97caf3855f23daf4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "28f4bbfcc084fd0d97caf3855f23daf4");
                } else if (com.sankuai.waimai.business.order.api.confirm.a.a()) {
                    com.sankuai.waimai.foundation.router.a.a(activity, OrderSchemeFactory.a(optLong, optString, false).a(3).a(json).d(0).e(1).d("from_h5_order").c(w).a());
                } else {
                    com.sankuai.waimai.business.order.api.submit.c.a().h5CommonOrderPreOrder(activity, optLong, optString, 3, fromJsonArray, (String) null, w, 0);
                }
            }
        });
    }
}
