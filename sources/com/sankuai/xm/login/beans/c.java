package com.sankuai.xm.login.beans;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.trace.annotation.TraceStatus;
import com.sankuai.xm.base.trace.j;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public long b;
    public String c;
    public String d;
    public String e;
    public HashMap<Short, Integer> f;
    public a g;
    private int h;

    public static c a(int i, long j, String str, String str2, String str3, HashMap<Short, Integer> hashMap) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, str3, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "83d8536d0e86440cc1c740e71d62075d", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "83d8536d0e86440cc1c740e71d62075d");
        }
        c cVar = new c();
        cVar.h = i;
        cVar.b = j;
        cVar.c = str;
        cVar.d = str2;
        cVar.e = str3;
        cVar.f = hashMap;
        return cVar;
    }

    @TraceStatus
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5c3b760fe74cf9032081c7a7aaf67b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5c3b760fe74cf9032081c7a7aaf67b")).intValue();
        }
        int i = this.h;
        j.a(new Integer(i), (String[]) null, new int[]{0}, (String[]) null, (int[]) null, (int[]) null);
        return i;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d7862f41eb3246814757aea9af9da34", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d7862f41eb3246814757aea9af9da34");
        }
        return "AuthResult{mResultCode=" + this.h + ", mUid=" + this.b + ", mBusinessInfo='" + this.d + "', mChannelMap=" + this.f + '}';
    }
}
