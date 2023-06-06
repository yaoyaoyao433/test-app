package com.dianping.base.push.medusa;

import android.content.Context;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import com.dianping.base.push.medusa.f;
import com.dianping.base.push.pushservice.util.h;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.sdkmanager.SDKInfoManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b implements a, f.a {
    public static ChangeQuickRedirect a;
    private static volatile b g;
    Context b;
    e c;
    private d d;
    private boolean e;
    private f f;
    private volatile boolean h;
    private ReentrantLock i;
    private com.dianping.base.push.pushservice.e j;

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.h = true;
        return true;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be24b07bdb2e125556cd9202a095d45f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be24b07bdb2e125556cd9202a095d45f");
            return;
        }
        this.e = false;
        this.f = new f(this);
        this.h = false;
        this.i = new ReentrantLock();
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "139cfce5833f7ccb625591e30746a38c", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "139cfce5833f7ccb625591e30746a38c");
        }
        if (g == null) {
            synchronized (b.class) {
                if (g == null) {
                    g = new b();
                }
            }
        }
        return g;
    }

    public final b a(@NonNull final Context context, @NonNull d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dff5e6147c6dee77d6eaceac1db62aa", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dff5e6147c6dee77d6eaceac1db62aa");
        }
        if (this.b != null) {
            com.dianping.base.push.pushservice.c.a("Medusa", "medusa already initialized!");
            return this;
        }
        com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.medusa.b.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c781f741e1ae023f77ceb5261cead5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c781f741e1ae023f77ceb5261cead5c");
                } else {
                    SDKInfoManager.a("medusa").a(context, "4.5.20.1", 1, new SDKInfoManager.a() { // from class: com.dianping.base.push.medusa.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                        public final boolean a(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fa227266f73b825eab1dc28c138144a", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fa227266f73b825eab1dc28c138144a")).booleanValue();
                            }
                            com.dianping.base.push.pushservice.c.d("Medusa", "interceptForceManage");
                            b.this.i.lock();
                            b.a(b.this, true);
                            b.this.f.a();
                            c a2 = c.a();
                            b bVar = b.this;
                            Object[] objArr4 = {bVar};
                            ChangeQuickRedirect changeQuickRedirect4 = c.a;
                            if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "3cb01cf9041f37c9466d6e7a5827a7d6", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "3cb01cf9041f37c9466d6e7a5827a7d6");
                            } else {
                                a2.b.remove(bVar);
                            }
                            b.this.i.unlock();
                            return true;
                        }

                        @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                        public final boolean b(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f6a847921041f55ff16c2f7972e807d", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f6a847921041f55ff16c2f7972e807d")).booleanValue();
                            }
                            com.dianping.base.push.pushservice.c.d("Medusa", "interceptNormanManage");
                            return true;
                        }

                        @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                        public final void c(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e67ce216acb3d02869ac016b90e326e2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e67ce216acb3d02869ac016b90e326e2");
                            } else {
                                super.c(str);
                            }
                        }

                        @Override // com.meituan.android.sdkmanager.SDKInfoManager.a
                        public final void d(String str) {
                            Object[] objArr3 = {str};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3a3491c6768dce1cf3d31b2d06db7228", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3a3491c6768dce1cf3d31b2d06db7228");
                            } else {
                                super.d(str);
                            }
                        }
                    });
                }
            }
        });
        this.b = context.getApplicationContext();
        this.d = dVar;
        this.c = new e(context, this.d);
        this.d.d();
        this.d.e();
        this.d.f();
        d dVar2 = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar2, changeQuickRedirect2, false, "1450532ace1768a1e4e575bc08ca2e64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar2, changeQuickRedirect2, false, "1450532ace1768a1e4e575bc08ca2e64");
        } else {
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.dianping.dpmtpush.RECEIVE_TOKEN");
                c().b.registerReceiver(dVar2.b, intentFilter);
            } catch (Exception e) {
                com.dianping.base.push.pushservice.c.d("MedusaConfig", e.getMessage());
            }
        }
        this.i.lock();
        try {
            if (!this.h) {
                c a2 = c.a();
                Object[] objArr3 = {this};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d0234a06f477ca4517e8afaa4cc447d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d0234a06f477ca4517e8afaa4cc447d0");
                } else {
                    a2.b.add(this);
                }
            }
            this.i.unlock();
            com.sankuai.waimai.launcher.util.aop.b.a(h.a(), new Runnable() { // from class: com.dianping.base.push.medusa.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "855cd8214e3438751589b2542e8ef761", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "855cd8214e3438751589b2542e8ef761");
                        return;
                    }
                    b.this.i.lock();
                    try {
                        if (!b.this.h) {
                            b.this.d();
                        }
                    } finally {
                        b.this.i.unlock();
                    }
                }
            });
            Horn.register("medusa_report_interval", new HornCallback() { // from class: com.dianping.base.push.medusa.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.horn.HornCallback
                public final void onChanged(boolean z, String str) {
                    Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b30cf2786d71f88b01e8264e8ccf4118", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b30cf2786d71f88b01e8264e8ccf4118");
                        return;
                    }
                    com.dianping.base.push.pushservice.c.a("Medusa", "Horn onChanged " + str);
                    try {
                        if (b.this.j == null) {
                            b.this.j = com.dianping.base.push.pushservice.e.a(context, "medusa");
                        }
                        long optLong = new JSONObject(str).optLong("medusa_report_interval", 0L);
                        long a3 = b.this.j.a("last_report_interval", 1440L);
                        if (optLong <= 0 || a3 == optLong) {
                            return;
                        }
                        b.this.j.b("last_report_interval", optLong);
                    } catch (Exception e2) {
                        com.dianping.base.push.pushservice.c.d("Medusa", e2.toString());
                    }
                }
            });
            return this;
        } catch (Throwable th) {
            this.i.unlock();
            throw th;
        }
    }

    @Override // com.dianping.base.push.medusa.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c90f1e39e3484548e6e1975636afea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c90f1e39e3484548e6e1975636afea");
            return;
        }
        com.dianping.base.push.pushservice.c.a("Medusa", "onBackground");
        synchronized (this) {
            this.f.a();
            this.e = false;
        }
    }

    @Override // com.dianping.base.push.medusa.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f0b723299f57589c386f0c41310289f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f0b723299f57589c386f0c41310289f");
            return;
        }
        com.dianping.base.push.pushservice.c.a("Medusa", "onForeground");
        d();
    }

    @Override // com.dianping.base.push.medusa.f.a
    public final void a(int i, Object... objArr) {
        Object[] objArr2 = {1, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "ad29ca08b07337037ed45cd82703565f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "ad29ca08b07337037ed45cd82703565f");
        } else if (this.c != null) {
            this.c.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02aa7bea781468489f0a0c8cc2ea5bea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02aa7bea781468489f0a0c8cc2ea5bea");
            return;
        }
        if (!this.e) {
            com.dianping.base.push.pushservice.c.a("Medusa", "realStartPolling");
            final f fVar = this.f;
            Object[] objArr2 = {0L, new Long(180000L)};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "e7c31bf64198ee1a6f92fc2eedb3b4dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "e7c31bf64198ee1a6f92fc2eedb3b4dc");
            } else {
                if (fVar.c != null) {
                    fVar.c.shutdown();
                }
                fVar.c = com.sankuai.android.jarvis.c.b("dppush-medusa", 1);
                fVar.c.scheduleAtFixedRate(new Runnable() { // from class: com.dianping.base.push.medusa.f.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ae8c1e1085ac7a72727d236626efd56f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ae8c1e1085ac7a72727d236626efd56f");
                        } else if (fVar.b != null) {
                            fVar.b.a(1, Long.valueOf(r2));
                        }
                    }
                }, 0L, 180000L, TimeUnit.MILLISECONDS);
            }
            this.e = true;
        }
    }
}
