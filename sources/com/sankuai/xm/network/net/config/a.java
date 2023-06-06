package com.sankuai.xm.network.net.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public long a;
    public long b;
    public boolean c = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.network.net.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1418a {
        public static ChangeQuickRedirect a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;

        public C1418a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43d308f62341a3e2d1592b231505f2b8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43d308f62341a3e2d1592b231505f2b8");
                return;
            }
            this.d = true;
            this.e = false;
            this.f = false;
            this.g = false;
            this.b = 10000L;
            this.c = 10000L;
            this.d = true;
            this.e = false;
            this.f = false;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04936146104e5dcd0b4f51125900e9e2", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04936146104e5dcd0b4f51125900e9e2");
            }
            a aVar = new a();
            aVar.b = this.c;
            aVar.a = this.b;
            aVar.e = this.f;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.f = this.g;
            return aVar;
        }
    }
}
