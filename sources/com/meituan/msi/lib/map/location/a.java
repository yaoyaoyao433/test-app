package com.meituan.msi.lib.map.location;

import android.app.Activity;
import android.content.Context;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.provider.c;
import com.meituan.msi.util.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public String c;
    public com.meituan.msi.location.b d;
    public int e;
    public boolean f;
    public InterfaceC0495a g;
    public String h;
    private final Context i;
    private boolean j;
    private final MsiContext k;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msi.lib.map.location.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0495a {
        void a(com.meituan.msi.api.location.a aVar, int i);
    }

    public a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a92b7b667685231b8fbcbd920d7d74b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a92b7b667685231b8fbcbd920d7d74b8");
            return;
        }
        this.b = false;
        this.i = com.meituan.msi.a.f();
        this.e = -1;
        this.f = false;
        this.j = false;
        this.k = msiContext;
    }

    private boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69e1715722f119b8c2586b011cb8bc4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69e1715722f119b8c2586b011cb8bc4f")).booleanValue();
        }
        if (k.a(this.i)) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a126fda37a0527de406f1c662784b7a9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a126fda37a0527de406f1c662784b7a9")).booleanValue();
            }
            this.j = com.meituan.msi.privacy.permission.a.a(this.i, PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, str);
            return com.meituan.msi.privacy.permission.a.a(this.i, "Locate.once", str) || this.j;
        }
        return false;
    }

    private boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8de360940b7def38e5f4953e327f993e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8de360940b7def38e5f4953e327f993e")).booleanValue() : activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    private synchronized com.meituan.msi.location.b a(MsiContext msiContext, c.a aVar) {
        c cVar;
        Object[] objArr = {msiContext, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1c7b0565d38502e9884c751a2d0611", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1c7b0565d38502e9884c751a2d0611");
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af41b505f924d86fe6c341e58f8bb1f3", RobustBitConfig.DEFAULT_VALUE)) {
            cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af41b505f924d86fe6c341e58f8bb1f3");
        } else {
            c cVar2 = new c();
            cVar2.b = this.c;
            cVar2.c = this.h;
            cVar2.a = aVar;
            cVar2.d = c.b.map;
            cVar = cVar2;
        }
        return msiContext.request.getMsiLocationLoaderProvider().a(msiContext.getActivity(), cVar);
    }

    public final void a(MsiContext msiContext, InterfaceC0495a interfaceC0495a) {
        Object[] objArr = {msiContext, interfaceC0495a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888f4293ea7d402bc49f0e9980d9bf66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888f4293ea7d402bc49f0e9980d9bf66");
        } else if (a(msiContext.getActivity())) {
            interfaceC0495a.a(null, 403);
        } else if (!this.b) {
            interfaceC0495a.a(null, 400);
        } else if (!a(this.c)) {
            interfaceC0495a.a(null, 401);
        } else {
            com.meituan.msi.location.b a2 = a(msiContext, c.a.normal);
            if (a2 == null) {
                interfaceC0495a.a(null, 401);
            } else {
                a(a2, interfaceC0495a);
            }
        }
    }

    private void a(com.meituan.msi.location.b bVar, final InterfaceC0495a interfaceC0495a) {
        Object[] objArr = {bVar, interfaceC0495a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29655124a1cc0aca7f87daa818d5e16e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29655124a1cc0aca7f87daa818d5e16e");
        } else {
            bVar.a(new com.meituan.msi.location.a() { // from class: com.meituan.msi.lib.map.location.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.location.a
                public final void a(int i, com.meituan.msi.api.location.a aVar, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), aVar, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40bfd6b40b184bb8005339ee71208d4d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40bfd6b40b184bb8005339ee71208d4d");
                    } else if (i != 0 || aVar == null) {
                        interfaceC0495a.a(null, i);
                    } else if (a.this.f) {
                    } else {
                        interfaceC0495a.a(aVar, 200);
                    }
                }
            }, "gcj02");
        }
    }

    public final synchronized void a(InterfaceC0495a interfaceC0495a) {
        c.a aVar;
        Object[] objArr = {interfaceC0495a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3b1499b15b3774bcd6aa6486e9aebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3b1499b15b3774bcd6aa6486e9aebd");
        } else if (a(this.k.getActivity())) {
            interfaceC0495a.a(null, 400);
        } else {
            this.g = interfaceC0495a;
            if (!a(this.c)) {
                interfaceC0495a.a(null, 401);
                return;
            }
            if (this.d != null) {
                this.d.a();
                this.d = null;
            }
            int i = this.e;
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "82b35a29fb37f8255ef12f1f370aa2df", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (c.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "82b35a29fb37f8255ef12f1f370aa2df");
            } else if (this.j && i != 1) {
                aVar = c.a.instant_forground;
            } else {
                aVar = (this.j || i != 0) ? c.a.normal : null;
            }
            if (aVar == null) {
                interfaceC0495a.a(null, 402);
                return;
            }
            this.d = a(this.k, aVar);
            if (this.d != null) {
                a(this.d, interfaceC0495a);
                this.k.onSuccess(null);
                return;
            }
            interfaceC0495a.a(null, 402);
        }
    }

    public final synchronized void a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47bcd6a65f009656aab934b16fdf7fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47bcd6a65f009656aab934b16fdf7fd");
            return;
        }
        if (this.d != null) {
            this.d.a();
            this.d = null;
            if (this.g != null) {
                this.g = null;
            }
            msiContext.onSuccess("");
        }
    }
}
