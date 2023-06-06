package com.meituan.mmp.lib.engine;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.z;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static f a(String str, Intent intent, boolean z) {
        f a2;
        Object[] objArr = {str, intent, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dd175edc1b357c24f106c952a8c7270", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dd175edc1b357c24f106c952a8c7270");
        }
        boolean isProdEnv = MMPEnvHelper.getEnvInfo().isProdEnv();
        String b = z.b(intent, "checkUpdateUrl");
        String b2 = z.b(intent, "appEnvironment");
        String b3 = z.b(intent, "publishId");
        if (!isProdEnv) {
            boolean a3 = a(intent);
            String b4 = z.b(intent, "debugProxyServer");
            if (!TextUtils.isEmpty(b4) || TextUtils.equals("true", z.b(intent, "debug"))) {
                DebugHelper.d = true;
                DebugHelper.c = true;
            }
            if (!TextUtils.isEmpty(b4)) {
                a3 = true;
            }
            if (DebugHelper.d()) {
                MMPEnvHelper.setCustomServiceEngineClazz(com.meituan.mmp.lib.service.e.class);
            }
            a2 = j.a(str, a3, z);
            if (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(b4)) {
                a2.k = b;
            }
        } else {
            if (!TextUtils.isEmpty(b)) {
                bb.a("Warning：线上版本应用不支持打开测试小程序", new Object[0]);
            }
            a2 = j.a(str, false, z);
        }
        if (TextUtils.equals(b2, "preview")) {
            SharedPreferences defaultSharedPreferences = MMPEnvHelper.getDefaultSharedPreferences();
            String str2 = MMPEnvHelper.shouldCheckUpdateFromTestEnv() ? "http://ddapi.fe.test.sankuai.com" : "https://dd.meituan.com";
            if (defaultSharedPreferences.getBoolean("checkUpdateTestEnvironmentSW", false)) {
                str2 = "https://dd.sankuai.com/test";
            }
            a2.k = Uri.parse(str2).buildUpon().appendEncodedPath("test/config/preview").appendQueryParameter(DeviceInfo.USER_ID, MMPEnvHelper.getEnvInfo().getUserID()).appendQueryParameter("appId", str).appendQueryParameter("publishId", b3).build().toString();
        }
        return a2;
    }

    public static boolean a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdf8ba75748ffb156951dab15f220880", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdf8ba75748ffb156951dab15f220880")).booleanValue() : MMPEnvHelper.isInited() && !MMPEnvHelper.getEnvInfo().isProdEnv() && z.a(intent, "reload", false);
    }
}
