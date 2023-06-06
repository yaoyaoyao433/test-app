package com.meituan.android.mtplayer.video.sniffer;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static String a(String str, StackTraceElement[] stackTraceElementArr, Throwable th) {
        Object[] objArr = {str, stackTraceElementArr, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce3777cb9361736f2f80c18904fb5a6b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce3777cb9361736f2f80c18904fb5a6b");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append("Message:");
            sb.append(str);
            sb.append(StringUtil.CRLF_STRING);
        }
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            sb.append("StackTrace:");
            sb.append(stackTraceElementArr[0]);
            sb.append(StringUtil.CRLF_STRING);
        }
        if (th != null) {
            sb.append("Cause mesage:");
            sb.append(th.toString());
        }
        return sb.toString();
    }
}
