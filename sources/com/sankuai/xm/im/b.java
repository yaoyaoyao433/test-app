package com.sankuai.xm.im;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.db.g;
import com.sankuai.xm.im.c;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.xm.network.setting.e b;
    public long c;
    g.b d;
    Set<Short> e;
    Map<c.b, c.a> f;
    com.sankuai.xm.base.db.e g;
    Boolean h;
    Boolean i;
    long j;
    com.sankuai.xm.base.voicemail.a k;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79f567efe0d2586cfc5f37c99f6bed29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79f567efe0d2586cfc5f37c99f6bed29");
            return;
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public final com.sankuai.xm.network.setting.e a() {
        if (this.b == null) {
            this.b = com.sankuai.xm.network.setting.e.ENV_RELEASE;
        }
        return this.b;
    }
}
