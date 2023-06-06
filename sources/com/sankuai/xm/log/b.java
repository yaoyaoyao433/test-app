package com.sankuai.xm.log;

import android.util.Log;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd");

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41ce80a017c1a005f0d6de588737d6db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41ce80a017c1a005f0d6de588737d6db");
            return;
        }
        try {
            b.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        } catch (Exception e) {
            Log.e("LoganWriter", "init error", e);
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "304c6af5bd268bb6916a016b9300cbb9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "304c6af5bd268bb6916a016b9300cbb9");
            return;
        }
        try {
            com.dianping.networklog.c.a(str + Constants.SPACE + str2 + Constants.SPACE + str3 + '\n', 20);
        } catch (Exception e) {
            Log.e("LoganWriter", "writeLogToFile error", e);
        }
    }

    public final void a(String str, Date date) {
        String[] strArr;
        Object[] objArr = {str, date};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "451dee3fffb0271c8886a25b5e354b7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "451dee3fffb0271c8886a25b5e354b7f");
            return;
        }
        try {
            if (date == null) {
                strArr = new String[7];
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < 7; i++) {
                    strArr[i] = b.format(Long.valueOf(currentTimeMillis));
                    currentTimeMillis -= 86400000;
                }
            } else {
                strArr = new String[]{b.format(date)};
            }
            com.dianping.networklog.c.a(strArr, str, "imsdk_report");
        } catch (Exception e) {
            Log.e("LoganWriter", "uploadLoganFiles error", e);
        }
    }
}
