package com.sankuai.meituan.kernel.net.msi.log;

import android.text.TextUtils;
import com.dianping.networklog.c;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.context.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static final Random b = new Random();

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7a26707571b285af5084bad51ea0cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7a26707571b285af5084bad51ea0cda");
            return;
        }
        b(str);
        c.a(str, 32, new String[]{"MSI"});
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54d736ef0970fad4d4d44e5d65915e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54d736ef0970fad4d4d44e5d65915e5e");
        } else if (!com.meituan.msi.a.i() || TextUtils.isEmpty(str)) {
        } else {
            PrintStream printStream = System.out;
            printStream.println("MSILog " + str);
        }
    }

    public static void a(Map<String, Object> map, ApiRequest apiRequest, String str, int i, float f) {
        Map map2;
        Object[] objArr = {map, apiRequest, str, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc8fbd93e4ac889dabc7b7a292f16aa6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc8fbd93e4ac889dabc7b7a292f16aa6");
        } else if (apiRequest != null && map != null) {
            Object[] objArr2 = {apiRequest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "049c9cbd1d2fde2d5857e39b9d47ab60", RobustBitConfig.DEFAULT_VALUE)) {
                map2 = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "049c9cbd1d2fde2d5857e39b9d47ab60");
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("reportType", "native");
                hashMap.put("new_api", 1);
                if (apiRequest != null) {
                    hashMap.put("name", apiRequest.getName());
                    hashMap.put(Constants.PARAM_SCOPE, apiRequest.getScope());
                    hashMap.put("bundle_name", apiRequest.getReferrer());
                    hashMap.put("env", apiRequest.getSource());
                    h hVar = apiRequest.getContainerContext().h;
                    if (hVar != null) {
                        hashMap.put("path", hVar.b());
                    }
                }
                map2 = hashMap;
            }
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            map2.put("$sr", Float.valueOf(f));
            if (f < 1.0f) {
                if (b.nextInt(10000) <= f * 10000.0f) {
                    a(map2, str, i);
                    return;
                }
                return;
            }
            a(map2, str, i);
        }
    }

    private static void a(Map<String, Object> map, String str, int i) {
        Object[] objArr = {map, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cd8dbc6fe7e4b808a431b782abee6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cd8dbc6fe7e4b808a431b782abee6e1");
        } else if (map == null) {
        } else {
            if (com.meituan.msi.a.i()) {
                PrintStream printStream = System.out;
                printStream.println("MsiEvent " + map.toString());
            }
            Babel.logRT(new Log.Builder("").tag(str).value(i).reportChannel("prism-report-knb").optional(map).build());
        }
    }
}
