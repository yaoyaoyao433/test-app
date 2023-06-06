package com.sankuai.xm.base.util.net;

import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private static a c;
    private int d;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class a {
        public C1378b a;
        public C1378b b;
        public C1378b c;
        public C1378b d;
    }

    static {
        a aVar = new a();
        c = aVar;
        aVar.a = new C1378b(5000, 5000);
        c.b = new C1378b(10000, 10000);
        c.c = new C1378b(UserCenter.TYPE_LOGOUT_NEGATIVE, UserCenter.TYPE_LOGOUT_NEGATIVE);
        c.d = new C1378b(10000, 10000);
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d87fa2d9536b70e808ee39d090f60ce9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d87fa2d9536b70e808ee39d090f60ce9");
            return;
        }
        this.d = 24;
        switch (d.a()) {
            case 1:
                this.d = 21;
                return;
            case 2:
                this.d = 23;
                return;
            case 3:
            case 4:
                this.d = 22;
                return;
            default:
                this.d = 24;
                return;
        }
    }

    public final int a() {
        int i = c.d.a;
        switch (this.d) {
            case 21:
                return c.a.a;
            case 22:
                return c.b.a;
            case 23:
                return c.c.a;
            default:
                return i;
        }
    }

    public final int b() {
        int i = c.d.b;
        switch (this.d) {
            case 21:
                return c.a.b;
            case 22:
                return c.b.b;
            case 23:
                return c.c.b;
            default:
                return i;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.util.net.b$b  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static class C1378b {
        public final int a;
        public final int b;

        public C1378b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }
}
