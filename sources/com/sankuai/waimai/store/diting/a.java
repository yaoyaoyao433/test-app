package com.sankuai.waimai.store.diting;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.monitor.b;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static com.sankuai.waimai.monitor.a a(ErrorCode errorCode, Context context) {
        Object[] objArr = {errorCode, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e2a155b78c2f09e646aab6d6f20ac580", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.monitor.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e2a155b78c2f09e646aab6d6f20ac580");
        }
        if (!p.a(context)) {
            errorCode.setContext(context);
        }
        return com.sankuai.waimai.monitor.a.a(errorCode);
    }

    public static void a(ErrorCode errorCode) {
        Object[] objArr = {errorCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95104261ed3cfbb58a9532fa85797608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95104261ed3cfbb58a9532fa85797608");
        } else {
            b.a(errorCode, "com.sankuai.wmcustomfront.diting.report");
        }
    }
}
