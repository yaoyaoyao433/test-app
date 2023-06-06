package com.sankuai.xm.monitor.statistics;

import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.xm.base.service.m;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5221863029ae44c59078211b9cafe576", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5221863029ae44c59078211b9cafe576");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put("func", str2);
        hashMap.put("msg", str3);
        m.d().a(LogMonitor.EXCEPTION_TAG, hashMap);
    }

    public static void a(final String str, final String str2, final Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06e6818f86551b2efcb2afb02cfbe11e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06e6818f86551b2efcb2afb02cfbe11e");
        } else {
            m.e().b(new Runnable() { // from class: com.sankuai.xm.monitor.statistics.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3a1dfdefb13b914a58ea194d8eea6a2", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3a1dfdefb13b914a58ea194d8eea6a2");
                        return;
                    }
                    String str3 = str + str2;
                    String string = m.b().getString(str3, "");
                    if (th != null) {
                        StringWriter stringWriter = new StringWriter();
                        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                        String stringWriter2 = stringWriter.toString();
                        String str4 = new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(Long.valueOf(System.currentTimeMillis())) + CommonConstant.Symbol.UNDERLINE + stringWriter2;
                        if (string.equals(str4)) {
                            return;
                        }
                        m.b().a(str3, str4);
                        a.a(str, str2, stringWriter2);
                    }
                }
            });
        }
    }
}
