package com.sankuai.xm.login.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.login.e;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;
    private String c;
    private boolean d;
    private long e;
    private int f;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdf501e3963ec01c2950f65bb3b50b24", 6917529027641081856L)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdf501e3963ec01c2950f65bb3b50b24");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e68be6001b7b9da3fc56c78c59f722d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e68be6001b7b9da3fc56c78c59f722d");
            return;
        }
        this.c = "";
        this.d = false;
        this.e = 1000L;
        this.f = 500;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "766486db09b05900b6a59c84f63cf919", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "766486db09b05900b6a59c84f63cf919");
            return;
        }
        try {
            synchronized (this) {
                String a2 = m.c().a(e.a.a);
                if (ac.a(a2, this.c)) {
                    return;
                }
                if (ac.a(a2)) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9815e06c6aa4ab7bbce21788540589be", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9815e06c6aa4ab7bbce21788540589be");
                    } else {
                        synchronized (this) {
                            this.c = "";
                            this.d = false;
                            this.e = 1000L;
                            this.f = 500;
                        }
                    }
                } else {
                    JSONObject jSONObject = new JSONObject(a2);
                    this.d = jSONObject.optInt("isopen", 0) == 1;
                    this.e = jSONObject.optLong("time", 1000L);
                    this.f = jSONObject.optInt("count", 500);
                    if (this.f <= 0) {
                        this.f = 500;
                    }
                    if (((int) this.e) / this.f > 10) {
                        com.sankuai.xm.login.d.d("LinkSpeedLimitConfig::loadConfigData frequency is slow", new Object[0]);
                        this.e = 1000L;
                        this.f = 500;
                    }
                    com.sankuai.xm.login.d.b("LinkSpeedLimitConfig::loadConfigData open=%b time=%d count=%d", Boolean.valueOf(this.d), Long.valueOf(this.e), Integer.valueOf(this.f));
                }
                this.c = a2;
            }
        } catch (Exception e) {
            com.sankuai.xm.login.d.a(e, "LinkSpeedLimitConfig::loadConfigData", new Object[0]);
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }

    public final long d() {
        long j;
        synchronized (this) {
            j = this.e;
        }
        return j;
    }

    public final int e() {
        int i;
        synchronized (this) {
            i = this.f;
        }
        return i;
    }
}
