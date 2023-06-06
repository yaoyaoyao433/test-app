package com.sankuai.meituan.kernel.net.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static q a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e1525ecc5a2e855934155f08746309e", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e1525ecc5a2e855934155f08746309e");
        }
        return q.a(context, context.getPackageName() + "_cipstoragecenter", 2);
    }
}
