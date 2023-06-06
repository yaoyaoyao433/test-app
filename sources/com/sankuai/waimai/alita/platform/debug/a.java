package com.sankuai.waimai.alita.platform.debug;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static e b;

    public static e a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "38960f4be4ffc45af5fff59bb0139329", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "38960f4be4ffc45af5fff59bb0139329");
        }
        if (b == null) {
            C0718a.C0719a c0719a = new C0718a.C0719a();
            c.e();
            c0719a.b = true;
            c.e();
            c0719a.c = false;
            c.e();
            c0719a.d = true;
            c.e();
            c0719a.e = false;
            b = c0719a.a();
        }
        return b;
    }

    public static void a(@Nullable e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7af25af7347cf4ce531ef151541a3a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7af25af7347cf4ce531ef151541a3a3");
        } else if (eVar != null) {
            C0718a.C0719a c0719a = new C0718a.C0719a();
            c0719a.b = eVar.a();
            c0719a.c = eVar.b();
            c0719a.d = eVar.c();
            c0719a.e = eVar.d();
            b = c0719a.a();
        } else {
            b = null;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.alita.platform.debug.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0718a implements e {
        public static ChangeQuickRedirect a;
        private boolean b;
        private boolean c;
        private boolean d;
        private boolean e;

        public C0718a(C0719a c0719a) {
            Object[] objArr = {c0719a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df584961c5d7baca450e42ba9ca7e1d1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df584961c5d7baca450e42ba9ca7e1d1");
                return;
            }
            this.b = c0719a.b;
            this.c = c0719a.c;
            this.d = c0719a.d;
            this.e = c0719a.e;
        }

        @Override // com.sankuai.waimai.alita.platform.debug.e
        public final boolean a() {
            return this.b;
        }

        @Override // com.sankuai.waimai.alita.platform.debug.e
        public final boolean b() {
            return this.c;
        }

        @Override // com.sankuai.waimai.alita.platform.debug.e
        public final boolean c() {
            return this.d;
        }

        @Override // com.sankuai.waimai.alita.platform.debug.e
        public final boolean d() {
            return this.e;
        }

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.alita.platform.debug.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0719a {
            public static ChangeQuickRedirect a;
            boolean b;
            boolean c;
            boolean d;
            boolean e;

            public final C0718a a() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca1508b2a2ba0eea17c460293a12f9e", RobustBitConfig.DEFAULT_VALUE) ? (C0718a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca1508b2a2ba0eea17c460293a12f9e") : new C0718a(this);
            }
        }
    }
}
