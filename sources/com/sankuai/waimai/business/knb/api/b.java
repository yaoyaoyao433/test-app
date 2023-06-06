package com.sankuai.waimai.business.knb.api;

import android.content.Context;
import android.content.Intent;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;

    public static void a(Context context, UserCenter.d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6bd4ce98125947908dac8d71742183d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6bd4ce98125947908dac8d71742183d7");
        } else if (context == null) {
        } else {
            Intent intent = new Intent();
            intent.setAction("com.sankuai.meituan.login.action");
            intent.setPackage(context.getPackageName());
            intent.putExtra("type", dVar);
            com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent);
            com.sankuai.waimai.foundation.utils.log.a.b(b.class.getSimpleName(), "send a loginevent broadcast", new Object[0]);
        }
    }
}
