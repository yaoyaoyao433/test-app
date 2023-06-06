package com.sankuai.waimai.bussiness.order.confirm.pgablock.drugcard.rock;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.bussiness.order.confirm.model.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    com.sankuai.waimai.bussiness.order.confirm.a c;
    public b d;

    public a(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5141e2ae94ba8ce73b1fd5ee3127c01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5141e2ae94ba8ce73b1fd5ee3127c01");
            return;
        }
        this.b = context;
        this.c = aVar;
    }
}
