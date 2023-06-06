package com.meituan.crashreporter.crash;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static volatile d d;
    public boolean b;
    public c c;

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "423f033febae1d782f0611fe9cf88226", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "423f033febae1d782f0611fe9cf88226");
        }
        if (d == null) {
            synchronized (d.class) {
                if (d == null) {
                    d = new d();
                }
            }
        }
        return d;
    }

    public final void a(Throwable th, String str, boolean z) {
        Object[] objArr = {th, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc18eeca5845f280c88486b1ebe3713", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc18eeca5845f280c88486b1ebe3713");
        } else if (!this.b || this.c == null || th == null) {
        } else {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            this.c.a(stringWriter.toString(), com.meituan.crashreporter.c.b(), str, z, true);
        }
    }
}
