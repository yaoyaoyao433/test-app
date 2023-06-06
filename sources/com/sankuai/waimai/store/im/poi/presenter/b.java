package com.sankuai.waimai.store.im.poi.presenter;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.im.poi.contract.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    b.a b;
    public String c;
    private Context d;

    public b(b.a aVar, Context context, String str) {
        Object[] objArr = {aVar, context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7c1662c97256a59ab1a50ff9b3e2ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7c1662c97256a59ab1a50ff9b3e2ea");
            return;
        }
        this.b = aVar;
        this.d = context;
        this.c = str;
    }
}
