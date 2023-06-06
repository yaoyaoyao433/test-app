package com.meituan.android.neohybrid.debug;

import android.support.annotation.NonNull;
import android.util.Log;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.android.paybase.utils.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends d {
    public static ChangeQuickRedirect a = null;
    private static boolean d = false;
    private final Map<String, a> c;

    public static /* synthetic */ void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a4c8a257c997292d9385c809dc9e8c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a4c8a257c997292d9385c809dc9e8c4");
            return;
        }
        Log.e(KernelConfig.CONTAINER_TYPE_NEO, "error: " + exc.getMessage());
        exc.printStackTrace();
        if (d) {
            throw new IllegalStateException(exc);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fbcdb659bf01e685018d3d895993a4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fbcdb659bf01e685018d3d895993a4f");
            return;
        }
        this.c = new HashMap();
        b();
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467db8ff44e4ea55d6de1def5858d6e0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467db8ff44e4ea55d6de1def5858d6e0")).booleanValue() : Boolean.parseBoolean(String.valueOf(c(str).c));
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0716d7e556c2c35dd9db8eb59f583678", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0716d7e556c2c35dd9db8eb59f583678")).intValue();
        }
        T t = c(str).c;
        if (t instanceof Integer) {
            return ((Integer) t).intValue();
        }
        return 0;
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6866209428d519b02aca9816e2b27f2b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6866209428d519b02aca9816e2b27f2b") : String.valueOf(c(str).b((a) ""));
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab663aabfef837034f3f4d496f03e6f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab663aabfef837034f3f4d496f03e6f") : String.valueOf(c(str).b((a) str2));
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, T t, boolean z) {
        Object[] objArr = {str, t, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80092e715d72d53c287c151f119e7ca3", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80092e715d72d53c287c151f119e7ca3") : a(str, t, null, true);
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, com.meituan.android.neohybrid.base.model.c<T> cVar, boolean z) {
        Object[] objArr = {str, cVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6679345955a7c3167ce1aac852333c6c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6679345955a7c3167ce1aac852333c6c") : a(str, null, cVar, true);
    }

    @Override // com.meituan.android.neohybrid.debug.d
    public final <T> com.meituan.android.neohybrid.base.model.a<T> a(String str, T t, com.meituan.android.neohybrid.base.model.c<T> cVar, boolean z) {
        Object[] objArr = {str, t, cVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "910bb40f9ef47179a77a09f6b63efde1", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.base.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "910bb40f9ef47179a77a09f6b63efde1");
        }
        a aVar = this.c.get(str);
        if (aVar != null && aVar.b()) {
            return super.a(str, t, cVar, z);
        }
        a<T> b = b(str, z ? 2 : -2);
        if (!z || !b.c()) {
            b.a((a<T>) t);
        }
        b.a((com.meituan.android.neohybrid.base.model.c) cVar);
        return b;
    }

    @Override // com.meituan.android.neohybrid.debug.d, com.meituan.android.neohybrid.debug.a
    public final <T> com.meituan.android.neohybrid.debug.a a(String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2462d0cc344b7884b77a620f4f9e79b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.neohybrid.debug.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2462d0cc344b7884b77a620f4f9e79b");
        }
        b(str, 1).a((a<T>) t);
        return this;
    }

    private <T> a<T> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b19e85994c5015fc70e759bcb63205f4", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b19e85994c5015fc70e759bcb63205f4") : b(str, 0);
    }

    private <T> a<T> b(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938a8561a39b1f30a1f3b854a31dd51a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938a8561a39b1f30a1f3b854a31dd51a");
        }
        a<T> aVar = this.c.get(str);
        if (aVar == null) {
            aVar = new a<>(str);
            this.c.put(str, aVar);
        }
        aVar.a(i);
        return aVar;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "240db0d5f1bc0c1d2897754fd1f92c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "240db0d5f1bc0c1d2897754fd1f92c35");
            return;
        }
        for (Map.Entry<String, ?> entry : af.a("finance_neo_debug").b().entrySet()) {
            a(entry.getKey(), (String) entry.getValue());
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a67a08628059db54d9c9beb3f7e0c85", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a67a08628059db54d9c9beb3f7e0c85") : C0304b.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    @MTPaySuppressFBWarnings({"EQ_DOESNT_OVERRIDE_EQUALS"})
    /* loaded from: classes2.dex */
    public static class a<T> extends com.meituan.android.neohybrid.base.model.b<T> {
        public static ChangeQuickRedirect d;
        String e;
        private com.meituan.android.neohybrid.base.model.c<T> f;
        private int g;
        private Class<?> h;

        private a(@NonNull String str, T t) {
            super(t);
            Object[] objArr = {str, t};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e2210d0caa5c41d3385c96c904c62aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e2210d0caa5c41d3385c96c904c62aa");
                return;
            }
            Object[] objArr2 = {this};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            this.f = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dc284f79671135e4976228e80cebfe9c", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.neohybrid.base.model.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dc284f79671135e4976228e80cebfe9c") : new c(this);
            this.e = str;
            d();
        }

        @Override // com.meituan.android.neohybrid.base.model.b, com.meituan.android.neohybrid.base.model.a
        public final void a(T t) {
            boolean z = true;
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce3d6367545625b2b430dc694a7ecad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce3d6367545625b2b430dc694a7ecad");
                return;
            }
            Object[] objArr2 = {t};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1e2071ad0b12f0adf7dedc615f6c44c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1e2071ad0b12f0adf7dedc615f6c44c")).booleanValue();
            } else if (this.h != null && t != null) {
                z = this.h.isAssignableFrom(t.getClass());
            }
            if (!z) {
                b.a(new IllegalStateException("debug set class error: " + this.h + ", " + t));
                return;
            }
            super.a((a<T>) t);
            d();
        }

        boolean b() {
            return this.g == -2 || this.g == 2;
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43215cc37729a6bb73987c5a7fe3a48f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43215cc37729a6bb73987c5a7fe3a48f");
            } else if (this.h != null || this.c == null) {
            } else {
                this.h = this.c.getClass();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df68f57c454c7d91c883488acb326a97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df68f57c454c7d91c883488acb326a97");
            } else if (i == 0 || i == this.g || b()) {
            } else {
                if (i == 2 || i == 1) {
                    a((com.meituan.android.neohybrid.base.model.c) this.f);
                    this.g = i;
                } else if (i == -2 || i == -1) {
                    af.a("finance_neo_debug").b(this.e);
                    b((com.meituan.android.neohybrid.base.model.c) this.f);
                    this.g = i;
                }
            }
        }

        private boolean a(@NonNull com.meituan.android.neohybrid.base.model.c<T> cVar, T t) {
            Object[] objArr = {cVar, t};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a48da82afbfe68a8e2f269dead9023", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a48da82afbfe68a8e2f269dead9023")).booleanValue();
            }
            if (t == null) {
                return true;
            }
            try {
                cVar.a(t);
                return true;
            } catch (Exception e) {
                b.a(e);
                return false;
            }
        }

        public final T b(T t) {
            Object[] objArr = {t};
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80afac9ba0671176fec6afbdd6a28b56", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80afac9ba0671176fec6afbdd6a28b56") : this.c != null ? this.c : t;
        }

        @Override // com.meituan.android.neohybrid.base.model.b
        public final void a(com.meituan.android.neohybrid.base.model.c<T> cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6bd1be7c306398f86772c42c7643536", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6bd1be7c306398f86772c42c7643536");
            } else if (cVar == null || !a((com.meituan.android.neohybrid.base.model.c<com.meituan.android.neohybrid.base.model.c<T>>) cVar, (com.meituan.android.neohybrid.base.model.c<T>) this.c)) {
            } else {
                this.b.add(cVar);
            }
        }

        boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178ea2ff9af0c9f1add7e18326e20739", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178ea2ff9af0c9f1add7e18326e20739")).booleanValue() : this.c != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.neohybrid.debug.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0304b {
        private static final b a = new b();
    }
}
