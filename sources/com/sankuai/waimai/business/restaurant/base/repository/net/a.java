package com.sankuai.waimai.business.restaurant.base.repository.net;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a {
    public static ChangeQuickRedirect c;
    protected Context d;
    protected rx.subscriptions.b e;
    protected ShopApiService f;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcba9b76e2f8600084d5811fffc2a5d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcba9b76e2f8600084d5811fffc2a5d3");
            return;
        }
        this.f = (ShopApiService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopApiService.class);
        this.e = new rx.subscriptions.b();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69adfba86089fa97fe8d3799169ca39d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69adfba86089fa97fe8d3799169ca39d");
            return;
        }
        if (this.e != null && !this.e.isUnsubscribed()) {
            this.e.unsubscribe();
        }
        if (this.e == null || !this.e.b()) {
            return;
        }
        this.e.a();
    }
}
