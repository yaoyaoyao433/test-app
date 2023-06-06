package com.sankuai.meituan.kernel.net.msi.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.c;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public boolean a;
    public a.InterfaceC0637a b;
    public c c;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.msi.config.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0590a {
        public static ChangeQuickRedirect a;
        private boolean b;
        private a.InterfaceC0637a c;
        private c d;

        public C0590a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b963fdef1caa0a99613150005a19f45c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b963fdef1caa0a99613150005a19f45c");
            } else {
                this.b = true;
            }
        }

        public final C0590a a(a.InterfaceC0637a interfaceC0637a) {
            this.c = interfaceC0637a;
            return this;
        }

        public final C0590a a(c cVar) {
            this.d = cVar;
            return this;
        }

        public final a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7c1cb29c156a3e79b7600a822ec0d06", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7c1cb29c156a3e79b7600a822ec0d06");
            }
            a aVar = new a();
            aVar.a = this.b;
            aVar.b = this.c;
            aVar.c = this.d;
            return aVar;
        }
    }
}
