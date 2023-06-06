package com.sankuai.xm.login.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.k;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public abstract class h extends a implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect f;
    private com.sankuai.xm.base.component.e a;
    private final ConcurrentHashMap<String, Object> b;
    private final Object c;

    private com.sankuai.xm.base.component.e a() {
        if (this.a == null) {
            synchronized (this.c) {
                if (this.a == null) {
                    this.a = new com.sankuai.xm.base.component.e(com.sankuai.xm.base.g.class, "mAccess", this);
                }
            }
        }
        return this.a;
    }

    public <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145869361dab7820cc3e5f52ddb69bb2", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145869361dab7820cc3e5f52ddb69bb2");
        }
        k kVar = ("mAccess".equals(str) && cls == com.sankuai.xm.base.g.class) ? new k() : null;
        if (cls.isInstance(kVar)) {
            return cls.cast(kVar);
        }
        return null;
    }

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7c42a1e87e65ae115148935380bf9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7c42a1e87e65ae115148935380bf9e");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new Object();
        this.a = null;
    }

    @Override // com.sankuai.xm.base.g
    public final boolean b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9db977fa0006bd212537275f5e8089", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9db977fa0006bd212537275f5e8089")).booleanValue() : ((com.sankuai.xm.base.g) a().a()).b(i);
    }

    @Override // com.sankuai.xm.base.g
    public final boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32a847d909e3fe010c771fa2b675bba", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32a847d909e3fe010c771fa2b675bba")).booleanValue() : ((com.sankuai.xm.base.g) a().a()).a(i);
    }

    public void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f92a45d179bcdb3fcacd8b7ff0a33d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f92a45d179bcdb3fcacd8b7ff0a33d");
        } else if (bVar != null) {
            a().b = bVar;
        }
    }
}
