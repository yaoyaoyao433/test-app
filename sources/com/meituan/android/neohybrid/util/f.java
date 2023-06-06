package com.meituan.android.neohybrid.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class f {
    public static ChangeQuickRedirect a = null;
    private static long b = 0;
    private static long c = -1;
    private static a d;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88ed330dab93122d2fdb8cb2fcc4f5d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88ed330dab93122d2fdb8cb2fcc4f5d0");
        } else if (com.meituan.android.neohybrid.init.a.h()) {
            if (c == -1) {
                c = System.currentTimeMillis();
            }
            b++;
            StringBuilder sb = new StringBuilder();
            sb.append(a());
            sb.append(str);
            if (d != null) {
                StringBuilder sb2 = new StringBuilder("<font color=green>");
                sb2.append(a());
                sb2.append("</font>");
                sb2.append(str);
            }
        }
    }

    private static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54e085e819b7add5c9df8aa0e28f6ceb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54e085e819b7add5c9df8aa0e28f6ceb");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss", Locale.getDefault());
        Date date = new Date(System.currentTimeMillis());
        return simpleDateFormat.format(date) + StringUtil.SPACE + Thread.currentThread().getName() + StringUtil.SPACE;
    }
}
