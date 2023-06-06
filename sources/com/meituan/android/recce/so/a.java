package com.meituan.android.recce.so;

import android.os.Build;
import com.dianping.networklog.c;
import com.meituan.android.recce.exception.RecceException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static AtomicBoolean b = new AtomicBoolean(false);

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4b86c91d76e3b8ed0cf388ffbc1ace5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4b86c91d76e3b8ed0cf388ffbc1ace5");
            return;
        }
        Object[] objArr2 = {"wasai_platform"};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d308d3d794fca8fa8913dc66e65c6567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d308d3d794fca8fa8913dc66e65c6567");
            return;
        }
        try {
            if (ProcessUtils.is64Bit()) {
                long a2 = com.meituan.android.recce.reporter.a.a();
                System.loadLibrary("wasai_platform");
                b.set(true);
                com.meituan.android.recce.reporter.a.a("recce_load_so_time", (float) com.meituan.android.recce.reporter.a.a(a2));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("cpu_abi", c());
            hashMap.put("app_abi", "32");
            com.meituan.android.recce.reporter.a.a(RecceException.SO_LOAD_FAILED.errorName(), "32bit app", (HashMap<String, Object>) hashMap);
        } catch (Exception e) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("cpu_abi", c());
            hashMap2.put("app_abi", ProcessUtils.is64Bit() ? "64" : "32");
            com.meituan.android.recce.reporter.a.a(RecceException.SO_LOAD_FAILED.errorName(), e.getMessage(), (HashMap<String, Object>) hashMap2);
            c.a("RecceSoManager: loadSo  " + e.getMessage(), 3, new String[]{"Recce-Android"});
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14c55fdcd0c308d2b5b96cee483ae005", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14c55fdcd0c308d2b5b96cee483ae005")).booleanValue() : b.get() && ProcessUtils.is64Bit();
    }

    private static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f3f87c0e99b36fc53ce9839910ac846", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f3f87c0e99b36fc53ce9839910ac846");
        }
        String[] strArr = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }
}
