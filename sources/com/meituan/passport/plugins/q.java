package com.meituan.passport.plugins;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.RestrictTo;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.meituan.passport.UserCenterImplBroadcastReceiver;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    private static volatile q m;
    public String b;
    public final AtomicReference<v> c;
    public final AtomicReference<e> d;
    public final AtomicReference<m> e;
    public final AtomicReference<i> f;
    public final AtomicReference<g> g;
    public final AtomicReference<b> h;
    public final AtomicReference<h> i;
    public n j;
    public t k;
    public p l;
    private boolean n;
    private final AtomicReference<j> o;
    private final AtomicReference<k> p;
    private final AtomicReference<Object> q;
    private final AtomicReference<Object> r;
    private v s;
    private i t;
    private e u;
    private g v;
    private h w;

    public static q a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "287169c7c6e957283ed9d01ab76a5808", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "287169c7c6e957283ed9d01ab76a5808");
        }
        if (m == null) {
            synchronized (q.class) {
                if (m == null) {
                    m = new q();
                }
            }
        }
        return m;
    }

    public q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5007b8462123c23be206eabdfc6d5fa7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5007b8462123c23be206eabdfc6d5fa7");
            return;
        }
        this.b = "PassportPlugins:";
        this.n = false;
        this.c = new AtomicReference<>();
        this.d = new AtomicReference<>();
        this.e = new AtomicReference<>();
        this.o = new AtomicReference<>();
        this.f = new AtomicReference<>();
        this.g = new AtomicReference<>();
        this.p = new AtomicReference<>();
        this.q = new AtomicReference<>();
        this.r = new AtomicReference<>();
        this.h = new AtomicReference<>();
        this.i = new AtomicReference<>();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15645fdba598e901b93ca74ece6cfe75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15645fdba598e901b93ca74ece6cfe75");
        } else if (this.n) {
        } else {
            com.meituan.passport.utils.n.a("PassportPlugins.registerPassportBroadcastReceiver", "register passport broadcast receiver", "false");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.meituan.passport.action.init.user");
            intentFilter.addAction("com.meituan.passport.action.logout");
            intentFilter.addAction("KNB.Channel.Account.SetUserInfo");
            LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a()).registerReceiver(new UserCenterImplBroadcastReceiver(), intentFilter);
            com.meituan.passport.utils.n.a("PassportPlugins.registerPassportBroadcastReceiver", "register passport broadcast receiver: ", "init, logout, webview");
            this.n = true;
            com.meituan.passport.utils.n.a("PassportPlugins.registerPassportBroadcastReceiver", "register passport broadcast receiver", "true");
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cd9e31188887f7a269583fede68b9116", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cd9e31188887f7a269583fede68b9116");
            } else if (ProcessUtils.isMainProcess(com.meituan.android.singleton.b.a())) {
                Intent intent = new Intent("com.meituan.passport.action.init.user");
                intent.setPackage(com.meituan.android.singleton.b.a().getPackageName());
                LocalBroadcastManager.getInstance(com.meituan.android.singleton.b.a()).sendBroadcast(intent);
                com.meituan.passport.utils.n.a("PassportPlugins.sendInitUserBroadcast", "send user init broadcast", null);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final v b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf15626402d49ebbf6bf58ea13560019", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf15626402d49ebbf6bf58ea13560019");
        }
        if (this.c.get() == null) {
            if (this.s == null) {
                this.s = new v() { // from class: com.meituan.passport.plugins.q.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.passport.plugins.v
                    public final a.InterfaceC0637a a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a39952075080eddf8d15b0c050d0d696", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a39952075080eddf8d15b0c050d0d696") : new a.InterfaceC0637a() { // from class: com.meituan.passport.plugins.q.1.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
                            public final com.sankuai.meituan.retrofit2.raw.a get(final aj ajVar) {
                                Object[] objArr3 = {ajVar};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8dac6feb67c9ee39012d44b5041776b4", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8dac6feb67c9ee39012d44b5041776b4") : new com.sankuai.meituan.retrofit2.raw.a() { // from class: com.meituan.passport.plugins.q.1.1.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.meituan.retrofit2.raw.a
                                    public final void cancel() {
                                    }

                                    @Override // com.sankuai.meituan.retrofit2.raw.a
                                    public final aj request() {
                                        return ajVar;
                                    }

                                    @Override // com.sankuai.meituan.retrofit2.raw.a
                                    public final com.sankuai.meituan.retrofit2.raw.b execute() throws IOException {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "151d4c7827dd608651545d4b30e67ba7", RobustBitConfig.DEFAULT_VALUE)) {
                                            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "151d4c7827dd608651545d4b30e67ba7");
                                        }
                                        throw new com.meituan.passport.exception.c();
                                    }
                                };
                            }
                        };
                    }
                };
            }
            return this.s;
        }
        return this.c.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final e c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b91b2a8a0bdf3c48d056deb00dd18344", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b91b2a8a0bdf3c48d056deb00dd18344");
        }
        if (this.d.get() == null) {
            if (this.u == null) {
                this.u = new e() { // from class: com.meituan.passport.plugins.q.3
                    @Override // com.meituan.passport.plugins.e
                    public final String c() throws IOException {
                        return "";
                    }
                };
            }
            return this.u;
        }
        return this.d.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final m d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7926d4f4d1b95226ca3c3ce8056fdce4", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7926d4f4d1b95226ca3c3ce8056fdce4");
        }
        if (this.e.get() == null) {
            this.e.compareAndSet(null, new m() { // from class: com.meituan.passport.plugins.q.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.passport.plugins.m
                public final String a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b75b9579d51a0cdb014c35dd341b36b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b75b9579d51a0cdb014c35dd341b36b") : super.a();
                }

                @Override // com.meituan.passport.plugins.m
                public final boolean b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "535124158ca6535c337cf5667b499931", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "535124158ca6535c337cf5667b499931")).booleanValue() : super.b();
                }
            });
        }
        return this.e.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final k e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc353ebc97f5008bbf788130b753d94", RobustBitConfig.DEFAULT_VALUE) ? (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc353ebc97f5008bbf788130b753d94") : this.p.get();
    }

    public final g f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01e31216e2939047e17c000aae9e8f0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01e31216e2939047e17c000aae9e8f0c");
        }
        if (this.g.get() == null) {
            if (this.v == null) {
                this.v = new g();
            }
            return this.v;
        }
        return this.g.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final i g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a39de68112c0f1de15526df4747f37a", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a39de68112c0f1de15526df4747f37a");
        }
        if (this.f.get() == null) {
            if (this.t == null) {
                this.t = new i() { // from class: com.meituan.passport.plugins.q.6
                    @Override // com.meituan.passport.plugins.i
                    public final int a() {
                        return 0;
                    }
                };
            }
            return this.t;
        }
        return this.f.get();
    }

    public final synchronized j h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9736bc505d6d5b1ead5b6738aa9dcc41", RobustBitConfig.DEFAULT_VALUE)) {
            return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9736bc505d6d5b1ead5b6738aa9dcc41");
        }
        if (this.o.get() == null) {
            j jVar = new j();
            Object[] objArr2 = {jVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e385d803203871c8c7601c099dabbb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e385d803203871c8c7601c099dabbb0");
            } else if (!this.o.compareAndSet(null, jVar)) {
                String str = this.b;
                Log.e(str, "Another strategy was already registered: " + this.o.get());
            }
        }
        return this.o.get();
    }

    public final h i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2f567970887f8e653c21fb906be7b77", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2f567970887f8e653c21fb906be7b77");
        }
        if (this.i.get() == null) {
            if (this.w == null) {
                this.w = new h() { // from class: com.meituan.passport.plugins.q.7
                    @Override // com.meituan.passport.plugins.h
                    public final String a() {
                        return KNBWebManager.IEnvironment.WEBVIEW_URI;
                    }
                };
            }
            return this.w;
        }
        return this.i.get();
    }
}
