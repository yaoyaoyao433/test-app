package com.sankuai.waimai.store.pagingload;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad54da1ead1b3aabc7b27ec7b455efff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad54da1ead1b3aabc7b27ec7b455efff");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            AgileLoadErrorType agileLoadErrorType = AgileLoadErrorType.DataSrcEmpty;
            com.sankuai.waimai.store.util.monitor.c.a(agileLoadErrorType, null, str + CommonConstant.Symbol.MINUS + str2);
        }
    }

    public static void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59bba21137c7187b515cdfc23136ccc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59bba21137c7187b515cdfc23136ccc7");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.sankuai.waimai.store.util.monitor.c.a(AgileLoadErrorType.DeserializeError, th != null ? th.getMessage() : null, str);
        }
    }
}
