package com.sankuai.waimai.bussiness.order.confirm.pgablock.wmcard;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public a b;

    public b(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, Activity activity) {
        Object[] objArr = {context, aVar, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2db5057c639f014170ac59dbf44d0432", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2db5057c639f014170ac59dbf44d0432");
        } else {
            this.b = new a(activity, context, aVar);
        }
    }
}
