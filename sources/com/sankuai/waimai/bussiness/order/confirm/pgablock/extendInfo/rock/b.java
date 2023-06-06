package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a b;

    public b(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e05b635491b41768155198fd917f57b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e05b635491b41768155198fd917f57b4");
        } else {
            this.b = new com.sankuai.waimai.bussiness.order.confirm.pgablock.remarkinfo.a((Activity) context, aVar, null);
        }
    }
}
