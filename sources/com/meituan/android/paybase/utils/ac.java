package com.meituan.android.paybase.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static com.meituan.android.cipstorage.x a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aabac827098680e3e3da2f7e99985c2a", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aabac827098680e3e3da2f7e99985c2a") : af.b(context, "jinrong_sdk_data_set");
    }

    public static com.meituan.android.cipstorage.q b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b0d567564ee9cbb5241bc09aa0c4dd1", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b0d567564ee9cbb5241bc09aa0c4dd1") : af.a(context, "jinrong_sdk_data_set");
    }
}
