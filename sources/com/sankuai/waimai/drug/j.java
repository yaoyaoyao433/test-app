package com.sankuai.waimai.drug;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class j extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.shopping.cart.contract.a b;
    public com.sankuai.waimai.store.platform.domain.manager.poi.a c;
    public Activity d;
    public SCPageConfig e;
    public String f;
    public String g;

    public abstract void a();

    public void a(boolean z) {
    }

    public j(@NonNull Activity activity, @NonNull com.sankuai.waimai.store.shopping.cart.contract.a aVar) {
        super(activity);
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ae59b7b7d67af1bd5b7f9637c88055e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ae59b7b7d67af1bd5b7f9637c88055e");
            return;
        }
        this.d = activity;
        this.b = aVar;
        this.c = aVar.g();
        this.e = aVar.h();
        this.f = aVar.l();
        this.g = aVar.n();
    }
}
