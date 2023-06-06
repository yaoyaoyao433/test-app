package com.meituan.android.yoda.monitor.log;

import android.support.annotation.NonNull;
import android.util.Log;
import com.dianping.networklog.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(@NonNull String str, @NonNull String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6069dbe15fdf4b8176e37bc23f8a9312", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6069dbe15fdf4b8176e37bc23f8a9312");
            return;
        }
        if (b) {
            Log.e("【YODA】" + str, str2);
        }
        if (z) {
            c.a("【YODA】" + str + StringUtil.SPACE + str2, 3);
        }
    }
}
