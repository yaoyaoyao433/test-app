package com.sankuai.xm.im.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.cache.bean.DBReceipt;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i {
    public static ChangeQuickRedirect a;
    final Object b;
    HashMap<String, DBReceipt> c;
    volatile boolean d;
    private DBProxy e;

    public i(DBProxy dBProxy) {
        Object[] objArr = {dBProxy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d418be3e2580d48d9f7b0b0759303c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d418be3e2580d48d9f7b0b0759303c91");
            return;
        }
        this.e = dBProxy;
        this.c = new HashMap<>();
        this.b = new Object();
        this.d = false;
    }
}
