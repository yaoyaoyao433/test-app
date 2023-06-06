package com.meituan.android.common.weaver.impl;

import android.support.annotation.NonNull;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ErrorReporter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final AtomicInteger mCurrent;
    private final int mMax;
    private final String mName;

    public void log(@NonNull String str) {
    }

    public ErrorReporter(@NonNull String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "530b4a40abdcde3ac60b7cc782aa66dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "530b4a40abdcde3ac60b7cc782aa66dd");
            return;
        }
        this.mCurrent = new AtomicInteger();
        this.mName = str;
        this.mMax = i;
    }

    public void report(@NonNull Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6172a4a29ee43761338fe68b53fd243", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6172a4a29ee43761338fe68b53fd243");
        } else {
            report(th, null);
        }
    }

    public void report(@NonNull Throwable th, Map<String, Object> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0b6c19f8fd430ed3f7028b7d268568f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0b6c19f8fd430ed3f7028b7d268568f4");
            return;
        }
        th.printStackTrace();
        if (this.mCurrent.addAndGet(1) <= this.mMax) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            HashMap hashMap = new HashMap();
            hashMap.put("stacktrace", stringWriter2);
            hashMap.put("errType", th.toString());
            hashMap.put("errMsg", th.getMessage());
            hashMap.put("mName", this.mName);
            if (map != null && map.size() > 0) {
                hashMap.putAll(map);
            }
            Babel.logRT(new Log.Builder("").tag("ffp-error").generalChannelStatus(true).optional(hashMap).build());
        }
    }
}
