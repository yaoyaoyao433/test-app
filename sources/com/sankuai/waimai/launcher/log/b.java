package com.sankuai.waimai.launcher.log;

import android.os.SystemClock;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(Thread thread) {
        Object[] objArr = {thread};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e099df02970744b0697a50ed8be58f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e099df02970744b0697a50ed8be58f4");
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("ThreadName=%s", thread.getName()));
            sb.append('\n');
            sb.append(String.format("Time=%s", Long.valueOf(SystemClock.currentThreadTimeMillis())));
            sb.append('\n');
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            return sb.toString();
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("dumpStacktrace with Exception:[");
            Object[] objArr2 = {th};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            sb2.append(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "be48ab2d3c7780e203bc12aa8d778ff0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "be48ab2d3c7780e203bc12aa8d778ff0") : Log.getStackTraceString(th));
            sb2.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            return sb2.toString();
        }
    }
}
