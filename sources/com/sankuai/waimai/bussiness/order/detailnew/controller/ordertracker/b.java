package com.sankuai.waimai.bussiness.order.detailnew.controller.ordertracker;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    @NonNull
    public static c a(@NonNull Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e1bd8ec0f59e650bf99a79c13c4e1ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e1bd8ec0f59e650bf99a79c13c4e1ab");
        }
        switch (i) {
            case 0:
                return new e(context);
            case 1:
                return new d(context);
            default:
                return new e(context);
        }
    }
}
