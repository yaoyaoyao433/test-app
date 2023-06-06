package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.knb.c;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.domain.manager.user.a;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PostOrderHandler extends TakeoutBaseJsHandler {
    private static final String KEY_LOGIN_OBSERVER = "com.sankuai.waimai.business.knb.handlers.PostOrderHandler";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final b loginObserver;

    public PostOrderHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c46fac8c5f2f35f59b8e2299f0e201", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c46fac8c5f2f35f59b8e2299f0e201");
        } else {
            this.loginObserver = new b() { // from class: com.sankuai.waimai.business.knb.handlers.PostOrderHandler.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onChanged(b.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "20452a2d1fe3790fcf3e38d7547bb3a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "20452a2d1fe3790fcf3e38d7547bb3a4");
                    } else if (aVar == b.a.LOGIN) {
                        PostOrderHandler.this.openOrderConfirmActivity();
                    }
                }

                @Override // com.sankuai.waimai.foundation.core.service.user.b
                public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
                    Object[] objArr2 = {enumC0948b};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ae8c581c1c8e028b1b761839b1c1a49d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ae8c581c1c8e028b1b761839b1c1a49d");
                    } else if (enumC0948b == b.EnumC0948b.PHONE) {
                        PostOrderHandler.this.openOrderConfirmActivity();
                    }
                }
            };
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "910d134d02ded04ebd724e457e91b9db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "910d134d02ded04ebd724e457e91b9db");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c02256d25296730edf47304be612f361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c02256d25296730edf47304be612f361");
            return;
        }
        final Activity activity = jsHost().getActivity();
        if (activity == null) {
            return;
        }
        final String w = activity instanceof BaseActivity ? ((BaseActivity) activity).w() : "";
        final long a = r.a(jsBean().argsJson.optString("poi_id"), 0L);
        final int optInt = jsBean().argsJson.optInt("business_type");
        final List<WmOrderedFood> fromJsonArray = WmOrderedFood.fromJsonArray(jsBean().argsJson.optJSONArray("food"));
        a.a(activity, new Runnable() { // from class: com.sankuai.waimai.business.knb.handlers.PostOrderHandler.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "08c57c2764cca5e5581d3f721d9a3d48", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "08c57c2764cca5e5581d3f721d9a3d48");
                } else {
                    com.sankuai.waimai.business.order.api.submit.c.a().postOrderDirectly(activity, a, fromJsonArray, w, 0, optInt);
                }
            }
        });
    }
}
