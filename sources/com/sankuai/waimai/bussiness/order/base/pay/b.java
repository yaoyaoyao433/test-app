package com.sankuai.waimai.bussiness.order.base.pay;

import android.app.Activity;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.pay.f;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements OrderPayResultManager.a {
    public static ChangeQuickRedirect a;
    private final ArrayMap b;
    private final f c;
    private final Activity d;
    private final String e;

    public b(ArrayMap arrayMap, f fVar, Activity activity, String str) {
        this.b = arrayMap;
        this.c = fVar;
        this.d = activity;
        this.e = str;
    }

    @Override // com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e159e6757ae3244113cf705c0920d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e159e6757ae3244113cf705c0920d4");
        } else {
            OrderPayResultManager.lambda$handleResult$1(this.b, this.c, this.d, this.e, str);
        }
    }
}
