package com.meituan.android.legwork.monitor.utils;

import android.os.Process;
import android.text.TextUtils;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cee6e928f344f3b7ddd2072fa62eb593", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cee6e928f344f3b7ddd2072fa62eb593") : a(Process.myPid());
    }

    private static String a(int i) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a24307d99b56ea94aefa8c28a0ce36dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a24307d99b56ea94aefa8c28a0ce36dc");
        }
        String str = "/proc/" + i + "/cmdline";
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0bcddde67baa13769a9812d91efdbfda", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0bcddde67baa13769a9812d91efdbfda")).booleanValue();
        } else {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            try {
                StringBuilder a2 = a.a(str, "UTF-8");
                return a2 != null ? a2.toString().split("\u0000")[0] : "";
            } catch (Exception e) {
                x.e("ProcessUtils.getProcessName()", "exception msg:", e);
                return "";
            }
        }
        return "";
    }
}
