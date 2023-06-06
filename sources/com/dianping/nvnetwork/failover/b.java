package com.dianping.nvnetwork.failover;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.g;
import com.dianping.nvnetwork.h;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;
    volatile a b;
    volatile a c;
    int d;
    private final Request e;

    public b(Request request) {
        Object[] objArr = {request};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008e9818016f0169627dec3f90964aee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008e9818016f0169627dec3f90964aee");
            return;
        }
        this.b = new a();
        this.c = new a();
        this.e = request;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, long j, int i2, String str, Throwable th) {
        com.dianping.monitor.e d;
        String str2;
        String a2;
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2), str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31bcfdf48853573882f5d92cc68c58e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31bcfdf48853573882f5d92cc68c58e9");
        } else if (!h.h().s || this.e == null || this.e.h() <= 0) {
        } else {
            try {
                String command = g.d().getCommand(this.e.d);
                if (!h.h().z.contains(command) || (d = g.d()) == null) {
                    return;
                }
                long a3 = f.a();
                if (a3 > j) {
                    int i3 = (int) (a3 - j);
                    if (th != null) {
                        com.dianping.nvnetwork.util.g.d(a(th));
                        str2 = "exception:" + th.getClass() + ",errorMessage:" + URLEncoder.encode(a2) + " , url: " + this.e.d;
                    } else {
                        str2 = "";
                    }
                    d.pv4(0L, "failover://" + command, 0, i, i2, 0, 0, i3, str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8a01b4aaabafb7b9e69d13d1f7fcb63", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8a01b4aaabafb7b9e69d13d1f7fcb63");
        }
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d90320ca121b1548b26e0fdd04890f59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d90320ca121b1548b26e0fdd04890f59");
        } else {
            f.a(str, str2, this.d);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public long b;
        public int c;
        public Throwable d;
        public q e;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e845b8a770667b2d4669349078b94032", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e845b8a770667b2d4669349078b94032");
            }
            return "CatInfo{startTime=" + this.b + ", end=" + f.a() + ", status=" + this.c + '}';
        }
    }
}
