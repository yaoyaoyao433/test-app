package com.sankuai.waimai.bussiness.order.confirm.pgablock.additionalbargain;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public b b;

    public a(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151cc3353fe7b95fcdc156f83196abde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151cc3353fe7b95fcdc156f83196abde");
        } else {
            this.b = new b((Activity) context, null, null);
        }
    }
}
