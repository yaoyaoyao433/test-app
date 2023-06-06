package com.sankuai.waimai.store.shopping.cart.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements Serializable {
    public static ChangeQuickRedirect a;
    public Map<String, Object> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe653de5f69f22d16efea83d6ce1b119", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe653de5f69f22d16efea83d6ce1b119");
        } else {
            this.b = new HashMap();
        }
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b36cc481f9dc265edd6aa2e868c212f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b36cc481f9dc265edd6aa2e868c212f") : this.b.get(str);
    }

    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf058cc2db1054d5d041c45d3c50ebe8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf058cc2db1054d5d041c45d3c50ebe8")).intValue();
        }
        Object obj = this.b.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public final String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7354addbd1886ca4ebc7293531a4f871", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7354addbd1886ca4ebc7293531a4f871");
        }
        Object obj = this.b.get(str);
        return obj instanceof String ? (String) obj : "";
    }
}
