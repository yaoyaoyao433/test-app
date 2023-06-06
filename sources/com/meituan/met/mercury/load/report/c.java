package com.meituan.met.mercury.load.report;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    public static ChangeQuickRedirect a;
    private static volatile c b;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39d70fc4fe1b4915209434ee45a006bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39d70fc4fe1b4915209434ee45a006bd");
        }
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a(Map map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0e335cbcf5a242677cd114996871067", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0e335cbcf5a242677cd114996871067");
        }
        map.put("sdk_version", com.meituan.met.mercury.load.core.e.f());
        map.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.met.mercury.load.core.e.d());
        map.put("os_platform", "android");
        map.put("device_model", Build.MODEL);
        map.put(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_SYS_VERSION, Build.VERSION.RELEASE);
        map.put("env", "release");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a(Map map, String str, String str2, String str3) {
        Object[] objArr = {map, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0800b73a9aa586490f5000332229466c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0800b73a9aa586490f5000332229466c");
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("bundle_biz", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put("bundle_name", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map.put("bundle_version", str3);
        }
        return map;
    }
}
