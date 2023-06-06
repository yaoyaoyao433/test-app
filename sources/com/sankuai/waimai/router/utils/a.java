package com.sankuai.waimai.router.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a<T> {
    public static ChangeQuickRedirect a;
    public final HashMap<String, T> b;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cef97addc25842077e64b3f68d76c40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cef97addc25842077e64b3f68d76c40");
        } else {
            this.b = new HashMap<>();
        }
    }

    public final T a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e347737bf6e312377f52b47130e2bbd", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e347737bf6e312377f52b47130e2bbd") : this.b.get(f.a(str));
    }
}
