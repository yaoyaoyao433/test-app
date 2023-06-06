package com.dianping.nvnetwork;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class x {
    public static ChangeQuickRedirect a;
    public final String b;
    public final long c;
    public final int d;
    public final v e;
    public w f;
    public long g;
    public long h;
    public int i;
    public String j;
    public List<a> k;
    public com.dianping.nvnetwork.tnold.a l;

    public x(v vVar) {
        Object[] objArr = {vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e3650c53229709c6af2ce4ce586145", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e3650c53229709c6af2ce4ce586145");
            return;
        }
        this.j = "";
        this.b = vVar.c;
        this.e = vVar;
        this.c = z.a();
        int length = vVar.d != null ? 0 + vVar.d.toString().length() : 0;
        this.d = vVar.e != null ? length + vVar.e.length : length;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cd6e1c97a0afab5e5e8bd5fd9777cd", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cd6e1c97a0afab5e5e8bd5fd9777cd");
        }
        if (this.k == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (a aVar : this.k) {
            sb.append(aVar.a);
            sb.append(CommonConstant.Symbol.COLON);
            sb.append(aVar.b);
            sb.append(";");
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }
}
