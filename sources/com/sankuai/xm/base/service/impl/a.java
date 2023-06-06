package com.sankuai.xm.base.service.impl;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.service.c;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.service.a implements com.sankuai.xm.base.service.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.service.c
    @NonNull
    public final <T> c.a<T> a_(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cad44cc891606dd71a2c28c7e18cef26", 6917529027641081856L)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cad44cc891606dd71a2c28c7e18cef26");
        }
        String name = cls.getName();
        Object[] objArr2 = {name};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c39d4891e30962b8034fa38ff1ecf650", 6917529027641081856L) ? (c.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c39d4891e30962b8034fa38ff1ecf650") : new C1375a(name);
    }

    @Override // com.sankuai.xm.base.service.c
    @NonNull
    public final <T> c.b<T> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26f4edf34cae69de27076d08b9bae453", 6917529027641081856L) ? (c.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26f4edf34cae69de27076d08b9bae453") : new b(str);
    }

    @Override // com.sankuai.xm.base.service.c
    public final <T> void a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6192bec5f0da0842c5704d78777e432c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6192bec5f0da0842c5704d78777e432c");
        } else {
            a(t.getClass().getName()).a(t);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.service.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1375a<T> implements c.a<T> {
        public static ChangeQuickRedirect a;
        private final String b;
        private Context c;
        private boolean d;

        private C1375a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b04e702d674b4c25cbe36b72e481c13", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b04e702d674b4c25cbe36b72e481c13");
                return;
            }
            this.d = false;
            this.b = str;
        }

        @Override // com.sankuai.xm.base.service.c.InterfaceC1374c
        public final void a(com.sankuai.xm.base.callback.c<T> cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa582924b4b0c4c7c82d67c7f5bb08a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa582924b4b0c4c7c82d67c7f5bb08a");
                return;
            }
            l.a<T> a2 = ((l) m.a(l.class)).a(this.b);
            if (this.d) {
                a2 = a2.a();
            }
            a2.a(this.c).a((l.a<T>) cVar);
        }

        @Override // com.sankuai.xm.base.service.c.InterfaceC1374c
        public final void b(com.sankuai.xm.base.callback.c<T> cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5019aea674d90bb1a3c3303c7eb8efaf", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5019aea674d90bb1a3c3303c7eb8efaf");
            } else {
                ((l) m.a(l.class)).a(this.b).b(cVar);
            }
        }

        @Override // com.sankuai.xm.base.service.c.InterfaceC1374c
        public final boolean b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1343700d13709615f1729f02a411d3a2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1343700d13709615f1729f02a411d3a2")).booleanValue() : ((l) m.a(l.class)).a(this.b).d();
        }

        @Override // com.sankuai.xm.base.service.c.a
        public final c.a<T> a(Context context) {
            this.c = context;
            return this;
        }

        @Override // com.sankuai.xm.base.service.c.a
        public final c.a<T> a() {
            this.d = true;
            return this;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class b<T> implements c.b<T> {
        public static ChangeQuickRedirect a;
        private final String b;

        private b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a692a8c902c183abc27356bf6d9cc3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a692a8c902c183abc27356bf6d9cc3");
            } else {
                this.b = str;
            }
        }

        @Override // com.sankuai.xm.base.service.c.b
        public final void a(final T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c2ce2b2c424abd3d16ff24f3a637fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c2ce2b2c424abd3d16ff24f3a637fa");
            } else {
                ((l) m.a(l.class)).b(this.b).a((b.a<com.sankuai.xm.base.callback.c<T>>) new b.a<com.sankuai.xm.base.callback.c<T>>() { // from class: com.sankuai.xm.base.service.impl.a.b.1
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.sankuai.xm.base.util.b.a
                    public final /* synthetic */ boolean a(Object obj) {
                        com.sankuai.xm.base.callback.c cVar = (com.sankuai.xm.base.callback.c) obj;
                        Object[] objArr2 = {cVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac83cf1538ea843f1e330e3e1c1a52b0", 6917529027641081856L)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac83cf1538ea843f1e330e3e1c1a52b0")).booleanValue();
                        }
                        if (cVar != 0) {
                            cVar.a(t);
                        }
                        return false;
                    }
                });
            }
        }
    }
}
