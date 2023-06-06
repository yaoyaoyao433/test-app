package com.sankuai.waimai.business.ugc.live.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static int a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2731837af52b7d0ba9ba86d569f9a1ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2731837af52b7d0ba9ba86d569f9a1ad")).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.matches("^rtmp://.*")) {
            return 0;
        }
        return str.matches(".*\\.flv$") ? 1 : -1;
    }
}
