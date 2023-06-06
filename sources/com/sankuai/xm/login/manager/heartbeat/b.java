package com.sankuai.xm.login.manager.heartbeat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements Serializable {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0613a892f2ef09ff0a1e9caecbfb5d09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0613a892f2ef09ff0a1e9caecbfb5d09");
            return;
        }
        this.b = 270;
        this.c = 600;
        this.d = 60;
        this.e = this.b;
        this.f = this.e;
        this.g = 1;
        this.h = 0L;
    }

    public final boolean a() {
        return this.g == 0;
    }

    public final boolean b() {
        return this.g == 1;
    }
}
