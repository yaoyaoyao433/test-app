package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    Context b;
    private final String c;
    private final int d;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406a6fff221a85d1c58ef61b25678445", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406a6fff221a85d1c58ef61b25678445");
            return;
        }
        this.c = "http://msstest-ajksdjkansdkajhaksvkacorp.sankuai.com/v1/mss_f190a74094a84922984c0d9546bd02c9/freegom/video/%E7%BE%8E%E5%9B%A2%E4%BE%BF%E5%88%A9%E8%B4%ADBCOPY%E4%BF%AE%E6%94%B90503-20180504.mp4";
        this.b = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.restaurant.cdn.a.a;
        this.d = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ab5a766cc382c150ddea783de5eba18e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ab5a766cc382c150ddea783de5eba18e")).intValue() : com.sankuai.waimai.platform.restaurant.cdn.a.a().c;
    }
}
