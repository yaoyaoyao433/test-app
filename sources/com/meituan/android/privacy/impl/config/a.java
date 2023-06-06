package com.meituan.android.privacy.impl.config;

import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final int c;
    private final AtomicInteger d;

    public a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "342a4deee00c88c36b5b1d78426dbe87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "342a4deee00c88c36b5b1d78426dbe87");
            return;
        }
        this.d = new AtomicInteger(0);
        this.b = str;
        this.c = i;
    }

    public final void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e5428c9afe1fe928e5d9cbf7cd0947", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e5428c9afe1fe928e5d9cbf7cd0947");
            return;
        }
        th.printStackTrace();
        if (this.d.addAndGet(1) <= this.c) {
            StringWriter stringWriter = new StringWriter();
            stringWriter.write(th.getMessage());
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            com.dianping.networklog.c.a("Privacy-CatchException: (" + this.b + ") " + stringWriter2, 3);
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.b);
            hashMap.put("stacktrace", stringWriter2);
            Babel.logRT(new Log.Builder("").generalChannelStatus(true).tag("privacy-catch-exception").optional(hashMap).build());
        }
    }
}
