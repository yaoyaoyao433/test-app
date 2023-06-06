package com.meituan.android.mercury.msc.adaptor.utils;

import com.meituan.android.mercury.msc.adaptor.bean.MSCAdaptorLog;
import com.meituan.met.mercury.load.core.c;
import com.meituan.met.mercury.load.core.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintStream;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(MSCAdaptorLog mSCAdaptorLog) {
        Object[] objArr = {mSCAdaptorLog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c08f0a0569bc9de2c3091325cc329905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c08f0a0569bc9de2c3091325cc329905");
        } else if (c.e) {
            Set<String> tags = mSCAdaptorLog.getTags();
            if (!tags.contains("MSC-ADAPTOR")) {
                tags.add("MSC-ADAPTOR");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(mSCAdaptorLog.getMsg());
            Map<String, String> extra = mSCAdaptorLog.getExtra();
            if (extra != null && !extra.isEmpty()) {
                sb.append(", extras:");
                sb.append(extra.toString());
            }
            com.dianping.networklog.c.a(sb.toString(), 3, (String[]) tags.toArray(new String[tags.size()]));
            if (e.e) {
                PrintStream printStream = System.out;
                printStream.println("MSC-ADAPTOR:" + sb.toString());
            }
        }
    }
}
