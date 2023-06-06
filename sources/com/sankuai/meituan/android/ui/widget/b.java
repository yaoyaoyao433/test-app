package com.sankuai.meituan.android.ui.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static b f;
    final Object b;
    final Handler c;
    C0584b d;
    C0584b e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f2151d82e626ec840bf17599e2adac8", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f2151d82e626ec840bf17599e2adac8");
        }
        if (f == null) {
            f = new b();
        }
        return f;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2826899d16d207f75e45579e23ec59c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2826899d16d207f75e45579e23ec59c0");
            return;
        }
        this.b = new Object();
        this.c = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.sankuai.meituan.android.ui.widget.b.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e22f1be5964a2d8416373911366d36ca", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e22f1be5964a2d8416373911366d36ca")).booleanValue();
                }
                if (message.what != 0) {
                    return false;
                }
                b bVar = b.this;
                C0584b c0584b = (C0584b) message.obj;
                Object[] objArr3 = {c0584b};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d0959dc4dd6637bd029a5c6a8a9db6ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d0959dc4dd6637bd029a5c6a8a9db6ce");
                } else {
                    synchronized (bVar.b) {
                        if (bVar.d == c0584b || bVar.e == c0584b) {
                            bVar.a(c0584b);
                        }
                    }
                }
                return true;
            }
        });
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64175d976e24ce89b65bf97504083ba8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64175d976e24ce89b65bf97504083ba8");
            return;
        }
        synchronized (this.b) {
            if (e(aVar)) {
                a(this.d);
            } else if (f(aVar)) {
                a(this.e);
            }
        }
    }

    public final void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "661f228a1c73ac581c7e6cb45bf91817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "661f228a1c73ac581c7e6cb45bf91817");
            return;
        }
        synchronized (this.b) {
            if (e(aVar)) {
                this.d = null;
                if (this.e != null) {
                    b();
                }
            }
        }
    }

    public final void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2101c9a9a246c33ab5b8c0c629b49b08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2101c9a9a246c33ab5b8c0c629b49b08");
            return;
        }
        synchronized (this.b) {
            if (e(aVar)) {
                b(this.d);
            }
        }
    }

    public final boolean d(a aVar) {
        boolean z = true;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88affb22adab967181d31a267c69c186", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88affb22adab967181d31a267c69c186")).booleanValue();
        }
        synchronized (this.b) {
            if (!e(aVar) && !f(aVar)) {
                z = false;
            }
        }
        return z;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.android.ui.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0584b {
        public static ChangeQuickRedirect a;
        public WeakReference<a> b;
        public int c;

        public C0584b(int i, a aVar) {
            Object[] objArr = {Integer.valueOf(i), aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ad332933d4d2f585e2c6c403e9b7aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ad332933d4d2f585e2c6c403e9b7aa");
                return;
            }
            this.b = new WeakReference<>(aVar);
            this.c = i;
        }

        public final boolean a(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfc8808a73723c1aa6b46c50fccd9319", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfc8808a73723c1aa6b46c50fccd9319")).booleanValue() : aVar != null && this.b.get() == aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09223a2faf93b067b26f6e045cd8cc79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09223a2faf93b067b26f6e045cd8cc79");
        } else if (this.e != null) {
            this.d = this.e;
            this.e = null;
            a aVar = this.d.b.get();
            if (aVar != null) {
                aVar.a();
            } else {
                this.d = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(C0584b c0584b) {
        Object[] objArr = {c0584b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28a45359a869f6efcab2863c813f99e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28a45359a869f6efcab2863c813f99e7")).booleanValue();
        }
        a aVar = c0584b.b.get();
        if (aVar != null) {
            this.c.removeCallbacksAndMessages(c0584b);
            aVar.b();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee0ae050c5edb43b13a388885207dfa0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee0ae050c5edb43b13a388885207dfa0")).booleanValue() : this.d != null && this.d.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dfa5f7a8426c0448dc367d7cd108768", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dfa5f7a8426c0448dc367d7cd108768")).booleanValue() : this.e != null && this.e.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(C0584b c0584b) {
        int i;
        Object[] objArr = {c0584b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be3e63c5b5f97ebe0711c156f3ed3bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be3e63c5b5f97ebe0711c156f3ed3bef");
        } else if (c0584b.c == -2) {
        } else {
            if (c0584b.c == -1) {
                i = 2000;
            } else {
                i = c0584b.c == 0 ? 3500 : c0584b.c;
            }
            this.c.removeCallbacksAndMessages(c0584b);
            this.c.sendMessageDelayed(Message.obtain(this.c, 0, c0584b), i);
        }
    }
}
