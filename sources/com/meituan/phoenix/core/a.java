package com.meituan.phoenix.core;

import com.meituan.phoenix.monitor.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    protected final String b;
    public c c;
    protected boolean d;
    protected String e;

    public a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "373fc400368cfd29a2519a7ad13df7a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "373fc400368cfd29a2519a7ad13df7a7");
            return;
        }
        this.d = false;
        this.b = str;
    }

    public final a a(c cVar) {
        if (cVar != null) {
            this.c = cVar;
        }
        return this;
    }

    public final a a(String str) {
        this.e = str;
        return this;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.d;
    }

    public final b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e19d2d3552b3da5a8389df049cf9d2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e19d2d3552b3da5a8389df049cf9d2d");
        }
        this.d = true;
        return new b(this);
    }

    public final void a(com.meituan.phoenix.base_interface.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e4ac669f7b7acfac9b1ff3a3d84eb40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e4ac669f7b7acfac9b1ff3a3d84eb40");
            return;
        }
        com.meituan.phoenix.data.b.a().a(this.b, this.e);
        cVar.a(this);
    }

    public final Object a(com.meituan.phoenix.base_interface.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c3f0f0ccbc659ef697265a8f93633fe", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c3f0f0ccbc659ef697265a8f93633fe");
        }
        com.meituan.phoenix.data.b.a().a(this.b, this.e);
        return bVar.a(this);
    }
}
