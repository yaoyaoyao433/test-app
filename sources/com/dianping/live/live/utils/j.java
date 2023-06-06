package com.dianping.live.live.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j extends k {
    public static ChangeQuickRedirect a;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "30b696ef80b8fcf81e03c2cfad091709", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "30b696ef80b8fcf81e03c2cfad091709");
        } else {
            com.dianping.networklog.c.a(new String[]{k.c.format(new Date(System.currentTimeMillis()))}, GetUUID.getInstance().getUUID(com.meituan.android.singleton.b.a));
        }
    }
}
