package com.dianping.video.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class d {
    public static ChangeQuickRedirect a = null;
    private static d d = null;
    private static int e = 1;
    private StringBuffer b;
    private Map<String, String> c;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "797ce8af6f0018af8841bd07a94b7bc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "797ce8af6f0018af8841bd07a94b7bc3");
            return;
        }
        this.b = new StringBuffer();
        this.c = new HashMap();
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "03224792dfd5bac7466f5908748c4451", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "03224792dfd5bac7466f5908748c4451");
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

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "281f49cbc8332611eaf824daba4a72d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "281f49cbc8332611eaf824daba4a72d9");
            return;
        }
        if (this.b == null || this.b.length() > 4000) {
            this.b = new StringBuffer();
        }
        this.b.append("\n");
        StringBuffer stringBuffer = this.b;
        stringBuffer.append("step index " + e + " : " + str);
        e = e + 1;
    }

    public String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20e45b554c1ea6f4ca2833438543f36d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20e45b554c1ea6f4ca2833438543f36d");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        StringBuffer buffer = stringWriter.getBuffer();
        try {
            printWriter.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            stringWriter.close();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return buffer.toString();
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f008e55ee172637acd53522f9349049c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f008e55ee172637acd53522f9349049c");
        } else {
            this.c.put(str, str2);
        }
    }
}
