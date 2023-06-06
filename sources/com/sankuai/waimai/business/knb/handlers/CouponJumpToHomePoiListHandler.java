package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.foundation.router.interfaces.c;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CouponJumpToHomePoiListHandler extends TakeoutBaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2398bea76df164e60f5abf68235f4087", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2398bea76df164e60f5abf68235f4087");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fragment_id", 0);
        bundle.putCharSequence("from", "coupon");
        Activity activity = jsHost().getActivity();
        if (activity == null) {
            return;
        }
        a.a(activity, c.B, bundle);
    }
}
