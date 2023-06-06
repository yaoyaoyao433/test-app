package com.sankuai.common.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UniqueDeviceId {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Deprecated
    public static String getDeviceId(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7c0cadc862806bec1c22d6eb7b044478", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7c0cadc862806bec1c22d6eb7b044478") : getDeviceId("", context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:16|(1:18)|19|(12:43|44|22|23|24|25|(4:28|(2:30|31)(1:33)|32|26)|34|35|(1:37)|38|39)|21|22|23|24|25|(1:26)|34|35|(0)|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0118, code lost:
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
        r13.printStackTrace();
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135 A[Catch: Throwable -> 0x0175, TryCatch #1 {Throwable -> 0x0175, blocks: (B:6:0x0021, B:8:0x0030, B:10:0x0036, B:12:0x003c, B:14:0x0042, B:16:0x0047, B:18:0x00e9, B:19:0x00ed, B:24:0x00f9, B:25:0x0111, B:29:0x011d, B:32:0x0135, B:34:0x013b, B:35:0x014c, B:36:0x0162, B:38:0x016c, B:39:0x0170, B:28:0x0119), top: B:46:0x0021, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c A[Catch: Throwable -> 0x0175, TryCatch #1 {Throwable -> 0x0175, blocks: (B:6:0x0021, B:8:0x0030, B:10:0x0036, B:12:0x003c, B:14:0x0042, B:16:0x0047, B:18:0x00e9, B:19:0x00ed, B:24:0x00f9, B:25:0x0111, B:29:0x011d, B:32:0x0135, B:34:0x013b, B:35:0x014c, B:36:0x0162, B:38:0x016c, B:39:0x0170, B:28:0x0119), top: B:46:0x0021, inners: #0 }] */
    @android.annotation.SuppressLint({"HardwareIds, MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDeviceId(java.lang.String r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.common.utils.UniqueDeviceId.getDeviceId(java.lang.String, android.content.Context):java.lang.String");
    }
}
