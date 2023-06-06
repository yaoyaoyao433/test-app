package com.sankuai.waimai.store;

import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.StoreException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<S, W> {
    public static ChangeQuickRedirect a;
    protected Map<S, W> b;

    @NonNull
    public abstract W c(S s);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fb167bc7da52451f9c67843c079c985", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fb167bc7da52451f9c67843c079c985");
        } else {
            this.b = new HashMap();
        }
    }

    public final W a(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9322f20fdce3cbed4d6c159dfa50a9", RobustBitConfig.DEFAULT_VALUE)) {
            return (W) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9322f20fdce3cbed4d6c159dfa50a9");
        }
        if (this.b.containsKey(s)) {
            return this.b.get(s);
        }
        if (s != null) {
            this.b.put(s, c(s));
        }
        return this.b.get(s);
    }

    public final void b(S s) {
        Object[] objArr = {s};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbfbed65e7cb46e00277a587fa5a31e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbfbed65e7cb46e00277a587fa5a31e2");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5af8cc188beb526ecc6d6e54cffcac4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5af8cc188beb526ecc6d6e54cffcac4f");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            com.sankuai.waimai.store.util.monitor.c.a(StoreException.UserManagerMultiException, "remove", "");
        }
        this.b.remove(s);
    }
}
