package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon;

import android.content.Context;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.floatcoupon.f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class FloatCouponHelper {
    public static ChangeQuickRedirect a;
    public static Pair<String[], Boolean> b;
    private g c;
    private String d;
    private Context e;
    private f.a f;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface OperationType {
    }

    public FloatCouponHelper(Context context, g gVar, String str, f.a aVar) {
        Object[] objArr = {context, gVar, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4bee0a575d15787a8b47f136665f0a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4bee0a575d15787a8b47f136665f0a9");
            return;
        }
        this.e = context;
        this.c = gVar;
        this.d = str;
        this.f = aVar;
    }
}
