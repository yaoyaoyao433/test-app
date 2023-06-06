package com.meituan.mmp.lib.api;

import android.content.SharedPreferences;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class p {
    public static ChangeQuickRedirect a = null;
    private static boolean b = true;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab18ad9be5e62e3b946b3984c32b9cdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab18ad9be5e62e3b946b3984c32b9cdd")).booleanValue();
        }
        if (!b || str == null) {
            return true;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "50a991ae064a0feceea8cf0713e29097", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "50a991ae064a0feceea8cf0713e29097")).booleanValue();
        }
        SharedPreferences sharedPreferences = MMPEnvHelper.getSharedPreferences("mmp_pip_interval");
        String str2 = "last_request_time" + str;
        long j = sharedPreferences.getLong(str2, 0L);
        long currentTimeMillis = System.currentTimeMillis();
        if (j == 0 || currentTimeMillis - j > DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION) {
            sharedPreferences.edit().putLong(str2, currentTimeMillis).apply();
            return true;
        }
        return false;
    }
}
