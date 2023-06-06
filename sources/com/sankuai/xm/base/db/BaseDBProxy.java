package com.sankuai.xm.base.db;

import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class BaseDBProxy extends com.sankuai.xm.base.service.a implements d {
    public static ChangeQuickRedirect a;
    protected com.sankuai.xm.base.db.a b;
    protected Context c;
    protected h d;
    protected String e;
    protected b.a f;
    private List<j> j;
    private List<k> k;

    public abstract String a(String str);

    public abstract int b(String str);

    public abstract void b();

    public abstract String c();

    public abstract String d();

    public abstract void d(c cVar);

    public abstract void e(c cVar);

    public abstract i i();

    public BaseDBProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13c260928e9ec59cc7c859bf5ebb0084", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13c260928e9ec59cc7c859bf5ebb0084");
            return;
        }
        this.b = new com.sankuai.xm.base.db.a();
        this.e = c();
        this.f = b.a.UN_INIT;
        this.j = new ArrayList();
        this.k = new ArrayList();
    }

    public static /* synthetic */ void b(BaseDBProxy baseDBProxy) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, baseDBProxy, changeQuickRedirect, false, "2b9bd50403e017dafee8caf965fbce19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, baseDBProxy, changeQuickRedirect, false, "2b9bd50403e017dafee8caf965fbce19");
            return;
        }
        try {
            baseDBProxy.l();
            baseDBProxy.f(null);
            baseDBProxy.d(baseDBProxy.d());
        } catch (Exception e) {
            com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, e, "BaseDBProxy::cleanOnQueue, db name = " + baseDBProxy.e, new Object[0]);
        }
    }

    public final boolean a(Context context, @NonNull com.sankuai.xm.base.db.a aVar, String str, boolean z) {
        boolean z2;
        Object[] objArr = {context, aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cb71a19e0b1f96bbf185cfdbb872e9", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cb71a19e0b1f96bbf185cfdbb872e9")).booleanValue();
        }
        Object[] objArr2 = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dce27b786a24b65c4bec72c5fa7d8f39", 6917529027641081856L)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dce27b786a24b65c4bec72c5fa7d8f39")).booleanValue();
        } else if (context == null) {
            z2 = false;
        } else {
            if (this.f == b.a.UN_INIT) {
                g.a().a(this, context);
                this.c = context;
                this.b = aVar;
                b();
                this.f = b.a.INIT;
            }
            z2 = true;
        }
        if (z2) {
            com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::init, name = " + str, new Object[0]);
            this.e = str;
            if (!z || TextUtils.isEmpty(str)) {
                return true;
            }
            com.sankuai.xm.threadpool.scheduler.a.b().a(this.b.d, new Runnable() { // from class: com.sankuai.xm.base.db.BaseDBProxy.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "51fa1f5ade992361210daf684888e731", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "51fa1f5ade992361210daf684888e731");
                    } else {
                        BaseDBProxy.this.b(BaseDBProxy.this.e, (Callback<Boolean>) null);
                    }
                }
            });
            return true;
        }
        return false;
    }

    public final void a(final String str, final Callback<Boolean> callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ac5d8353916102ad2d14c1ec592c91", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ac5d8353916102ad2d14c1ec592c91");
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::db is not name", new Object[0]);
            com.sankuai.xm.base.callback.a.a(callback, 10019, "db is not name");
        } else {
            a aVar = new a() { // from class: com.sankuai.xm.base.db.BaseDBProxy.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd9bb03136bf1710ac60051cc3b1cea3", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd9bb03136bf1710ac60051cc3b1cea3");
                    } else if (BaseDBProxy.this.c != null) {
                        try {
                            com.sankuai.xm.base.callback.a.a(callback, Boolean.valueOf(BaseDBProxy.this.c(str)));
                        } catch (Throwable th) {
                            BaseDBProxy.this.a(b.a.NOT_READY);
                            com.sankuai.xm.base.callback.a.a(callback, 10019, "switch failed");
                            throw th;
                        }
                    } else {
                        com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::db is not init", new Object[0]);
                        com.sankuai.xm.base.callback.a.a(callback, 10019, "db is not init");
                    }
                }
            };
            aVar.l = callback;
            a((j) aVar);
        }
    }

    public final void b(final String str, final Callback<Boolean> callback) {
        Object[] objArr = {str, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1f828cc073b88c2fa63289be57df6c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1f828cc073b88c2fa63289be57df6c2");
        } else if (TextUtils.isEmpty(str) || this.c == null) {
            com.sankuai.xm.base.callback.a.a(callback, 10019, "db name is null or not init ");
        } else {
            a aVar = new a() { // from class: com.sankuai.xm.base.db.BaseDBProxy.4
                public static ChangeQuickRedirect a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9eac55c6ea1d24baa1788ad969090ef1", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9eac55c6ea1d24baa1788ad969090ef1");
                        return;
                    }
                    try {
                        BaseDBProxy.this.l();
                        BaseDBProxy.this.d(str);
                        com.sankuai.xm.base.callback.a.a(callback, Boolean.TRUE);
                    } catch (Throwable th) {
                        com.sankuai.xm.base.callback.a.a(callback, 10019, "open failed");
                        throw th;
                    }
                }
            };
            aVar.l = callback;
            a((j) aVar);
        }
    }

    public final void a(final Callback<Void> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94c3d1fcb79498a3caeb3d914970d6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94c3d1fcb79498a3caeb3d914970d6d");
            return;
        }
        a aVar = new a() { // from class: com.sankuai.xm.base.db.BaseDBProxy.5
            public static ChangeQuickRedirect a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a74fa73c23a75dee6c54bdf6d932e33", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a74fa73c23a75dee6c54bdf6d932e33");
                    return;
                }
                try {
                    BaseDBProxy.this.l();
                    com.sankuai.xm.base.callback.a.a(callback, null);
                } catch (Throwable th) {
                    com.sankuai.xm.base.callback.a.a(callback, 10019, "close failed");
                    throw th;
                }
            }
        };
        aVar.l = callback;
        a((j) aVar);
    }

    public void b(Callback<Void> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494f44216ab98aaf68a506e79fd36e40", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494f44216ab98aaf68a506e79fd36e40");
        } else {
            a(new j(true, callback) { // from class: com.sankuai.xm.base.db.BaseDBProxy.6
                public static ChangeQuickRedirect a;
                public final /* synthetic */ Callback b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(true);
                    this.b = callback;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0198f2df65f759b7fb86c9eef9464fd", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0198f2df65f759b7fb86c9eef9464fd");
                        return;
                    }
                    BaseDBProxy.b(BaseDBProxy.this);
                    if (this.b != null) {
                        this.b.onSuccess(null);
                    }
                }
            });
        }
    }

    public final boolean a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419c9ca3774909ae9953b56276c10e68", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419c9ca3774909ae9953b56276c10e68")).booleanValue();
        }
        if (jVar == null) {
            return false;
        }
        if ((this.b.d == 0 || m()) && jVar.h <= 0) {
            a((Runnable) jVar);
        } else {
            jVar.a(true);
            c(jVar);
        }
        return true;
    }

    public final void b(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49a6462c949f5fa203ce8fce249b7a8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49a6462c949f5fa203ce8fce249b7a8f");
            return;
        }
        jVar.a(true);
        c(jVar);
    }

    public final <T> boolean a(final Runnable runnable, Callback<T> callback) {
        Object[] objArr = {runnable, callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febca41739571e423d1a521dcca1bf54", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febca41739571e423d1a521dcca1bf54")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        j jVar = runnable instanceof j ? (j) runnable : new j() { // from class: com.sankuai.xm.base.db.BaseDBProxy.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1300a3570b181c0e5afeadc5664a3397", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1300a3570b181c0e5afeadc5664a3397");
                } else {
                    runnable.run();
                }
            }
        };
        jVar.a(runnable).l = callback;
        return a(jVar);
    }

    public final <T> boolean a(Runnable runnable, boolean z, Callback<T> callback) {
        Object[] objArr = {runnable, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576d8b7fc7811d6c55bdcedcb5a0cef4", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576d8b7fc7811d6c55bdcedcb5a0cef4")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        j jVar = new j(true, runnable) { // from class: com.sankuai.xm.base.db.BaseDBProxy.8
            public static ChangeQuickRedirect a;
            public final /* synthetic */ Runnable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fae508ce0caeb63a0818e78aa1677f27", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fae508ce0caeb63a0818e78aa1677f27");
                } else {
                    this.b.run();
                }
            }
        };
        jVar.i = z;
        j a2 = jVar.a(runnable);
        a2.l = callback;
        return a(a2);
    }

    public final c bR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6548408b28a17d1377eeec10c67912f", 6917529027641081856L)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6548408b28a17d1377eeec10c67912f");
        }
        if (this.d == null) {
            com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::getWritableDatabase null " + Log.getStackTraceString(new Throwable()), new Object[0]);
            return null;
        }
        return this.d.a();
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3da527c35cc291cded39b077bb02967", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3da527c35cc291cded39b077bb02967");
        } else if (cVar == null || !cVar.g()) {
        } else {
            cVar.f();
        }
    }

    public final void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea5bbc92648288e5734495ba06059b29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea5bbc92648288e5734495ba06059b29");
        } else if (cVar == null || !cVar.g()) {
        } else {
            cVar.d();
        }
    }

    public final void c(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41b0fa54da93f5f3a2b399212168e13d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41b0fa54da93f5f3a2b399212168e13d");
        } else if (cVar != null) {
            try {
                if (cVar.g() && cVar.e()) {
                    cVar.c();
                }
            } catch (f e) {
                com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::endTransaction,ex:%", e.getMessage());
            }
        }
    }

    public final synchronized void a(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2505a9296398605505a9dc5fcc63245", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2505a9296398605505a9dc5fcc63245");
        } else {
            this.k.add(kVar);
        }
    }

    public final synchronized void b(k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "108897ae855187e66f89e5531a376ce0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "108897ae855187e66f89e5531a376ce0");
        } else {
            this.k.remove(kVar);
        }
    }

    public boolean e() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befc2ecdd6f35393e1d3332e1efae6fd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befc2ecdd6f35393e1d3332e1efae6fd")).booleanValue();
        }
        synchronized (this) {
            z = this.f == b.a.READY;
        }
        return z;
    }

    public void a(@NonNull Runnable runnable) {
        boolean z = true;
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b15a291729f79b604f1dec53b0a2f9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b15a291729f79b604f1dec53b0a2f9d");
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            String name = runnable.getClass().getName();
            if (!g.a().e() && (runnable instanceof j)) {
                d((j) runnable);
                return;
            }
            if (g.a().e()) {
                n();
            }
            long j = 0;
            if (runnable instanceof j) {
                j jVar = (j) runnable;
                if (jVar.j && !e()) {
                    if (!jVar.n) {
                        a(new f(1, "db not ready: " + d()), jVar.k.getName());
                        if (jVar.l != null) {
                            jVar.l.onFailure(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "db not ready");
                            return;
                        }
                        return;
                    }
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7bca4a685900a987f65f618412c7559", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7bca4a685900a987f65f618412c7559");
                        return;
                    }
                    com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::executeWaitReady, runnable = " + jVar.k.toString() + ",db state = " + this.f, new Object[0]);
                    c(jVar);
                    return;
                }
                if (!jVar.j) {
                    z = false;
                } else if (jVar.m != 0) {
                    j = currentTimeMillis - jVar.m;
                }
                name = jVar.k.getName();
            } else {
                z = false;
            }
            runnable.run();
            long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            if (j + currentTimeMillis2 > 500 || j > 100) {
                com.sankuai.xm.log.c.c(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::executeWithCatch DB execute time: " + currentTimeMillis2 + "ms, queueTime:" + j + " ms, real time in thread:" + currentThreadTimeMillis2 + "ms, runnable name: " + name + ", entrance fun:" + z, new Object[0]);
            }
        } catch (Throwable th) {
            if (runnable instanceof j) {
                a(th, ((j) runnable).k.getName());
            } else {
                a(th, runnable.getClass().getName());
            }
        }
    }

    private void a(CountDownLatch countDownLatch) {
        Object[] objArr = {countDownLatch};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b433d99a03329e2c6657c96b1a3ee44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b433d99a03329e2c6657c96b1a3ee44");
            return;
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2fd876a91e77397ac18d5da36989ea", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2fd876a91e77397ac18d5da36989ea")).booleanValue();
        }
        if (TextUtils.isEmpty(this.e) || !TextUtils.equals(this.e, str)) {
            l();
            d(str);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.sankuai.xm.base.db.d] */
    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dba2e6bebc7101db57b4d04564ae5ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dba2e6bebc7101db57b4d04564ae5ab");
        } else if (!g.a().e()) {
            com.sankuai.xm.log.c.b("BaseDBProxy", "BaseDBProxy::openDB db data migrate", new Object[0]);
        } else {
            this.e = str;
            String str2 = this.b.c + str;
            if (this.d != null) {
                com.sankuai.xm.log.c.d("BaseDBProxy", "BaseDBProxy::openOnQueue db not close " + Log.getStackTraceString(new Throwable()), new Object[0]);
                this.d.b();
                this.d = null;
            }
            this.d = l.a(this.c);
            if (this.d == null) {
                com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::openOnQueue create db open helper fail", new Object[0]);
                throw new f(-1, "db open fail");
            }
            String a2 = a(str);
            long currentTimeMillis = System.currentTimeMillis();
            this.d.a(a2, this.c, str2, this.b.b, this.b.f, this.b.g == null ? this : this.b.g);
            if (this.b.e) {
                bR_().i();
            } else {
                bR_().j();
            }
            d(bR_());
            a(b.a.READY);
            com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::open db name:%s pwd:%s version:%d open_time:%d", str, a2, Integer.valueOf(this.b.b), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::open db name:%s version:%d open_time:%d", str, Integer.valueOf(this.b.b), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5854b7030fb93e567f37996867b2e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5854b7030fb93e567f37996867b2e2");
            return;
        }
        try {
            if (this.d != null) {
                e(bR_());
                this.d.b();
                this.d = null;
            }
        } catch (Exception e) {
            com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, e, "BaseDBProxy::closeOnQueue, db name = " + this.e, new Object[0]);
        }
        this.e = c();
        a(b.a.NOT_READY);
    }

    private boolean m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9831f4acbc9a4200458f3af9e5cff23", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9831f4acbc9a4200458f3af9e5cff23")).booleanValue();
        }
        return com.sankuai.xm.threadpool.scheduler.a.b().a(Thread.currentThread().getName(), this.b.d);
    }

    private void d(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b79c2dd15966e439d0a72bebb8006276", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b79c2dd15966e439d0a72bebb8006276");
            return;
        }
        com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::addRunnableToCache add runnable to cache " + Log.getStackTraceString(new Throwable()), new Object[0]);
        synchronized (this) {
            if (this.j.size() >= 1000) {
                com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::addRunnableToCache cache over limit", new Object[0]);
            } else {
                this.j.add(jVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480c2fdf341e8e8f6d4252b1b4b3acea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480c2fdf341e8e8f6d4252b1b4b3acea");
            return;
        }
        final ArrayList arrayList = null;
        synchronized (this) {
            if (aVar != this.f) {
                com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::setState, state = " + aVar + ", db name = " + d(), new Object[0]);
                if (!this.k.isEmpty()) {
                    arrayList = new ArrayList(this.k);
                }
            }
            this.f = aVar;
        }
        if (arrayList == null) {
            return;
        }
        com.sankuai.xm.threadpool.scheduler.a.b().a(17, new Runnable() { // from class: com.sankuai.xm.base.db.BaseDBProxy.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa958f73e1e2bb1880928884bf1e8c8f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa958f73e1e2bb1880928884bf1e8c8f");
                    return;
                }
                try {
                    for (k kVar : arrayList) {
                        kVar.a(BaseDBProxy.this.d(), BaseDBProxy.this.f);
                    }
                } catch (Exception e) {
                    com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::setState notify, error = " + e.toString(), new Object[0]);
                }
            }
        });
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66578d3177a31586a850be63398789aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66578d3177a31586a850be63398789aa");
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            if (this.j.size() > 0 && g.a().e()) {
                arrayList.addAll(this.j);
                this.j.clear();
            }
        }
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.remove();
                ((j) it.next()).run();
            }
        }
    }

    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae8f58be4c57964e63f0c7172416eaf", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae8f58be4c57964e63f0c7172416eaf")).intValue() : this.b.d;
    }

    public final synchronized int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62ce2bb402b4b02c33660c3f42f92eb3", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62ce2bb402b4b02c33660c3f42f92eb3")).intValue();
        }
        return this.j.size();
    }

    public final void f(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "980c58eddc8c9383c0b634366c1a9ed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "980c58eddc8c9383c0b634366c1a9ed3");
            return;
        }
        if (cVar != null) {
            try {
                com.sankuai.xm.log.c.b(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::deleteDBFile path: " + cVar.h(), new Object[0]);
                if (cVar.g()) {
                    cVar.a();
                }
            }
        }
        String str = "";
        String str2 = "";
        if (this.c != null) {
            str2 = this.c.getDatabasePath(d()).getAbsolutePath();
            str = this.c.getDatabasePath(c()).getAbsolutePath();
        }
        if (!TextUtils.isEmpty(str2)) {
            l.a(new File(str2));
            if (TextUtils.equals(str2, str)) {
                return;
            }
            l.a(new File(str));
            return;
        }
        com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::deleteDBFile not found path", new Object[0]);
    }

    @Override // com.sankuai.xm.base.db.d
    public void g(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "420ef1af5233f22092f98cdc01af986d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "420ef1af5233f22092f98cdc01af986d");
        } else {
            com.sankuai.xm.log.c.d(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, "BaseDBProxy::onCorruption db name = %s", this.e);
            throw new DBCorruptException(new Exception());
        }
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dcc93cb01510b0d94367b21ca126681", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dcc93cb01510b0d94367b21ca126681")).booleanValue() : this.b.e;
    }

    public void a(Throwable th, String str) {
        boolean z = true;
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "796e6b8b2c20c9566c6a475a00a915a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "796e6b8b2c20c9566c6a475a00a915a4");
            return;
        }
        com.sankuai.xm.log.c.a(PackageInfoWrapper.PACKAGE_TYPE_STR_BASE, th, "BaseDBProxy::handleDBException, db name = " + this.e + ", func = " + str, new Object[0]);
        if (!(th instanceof DBCorruptException) && !(th instanceof DBFullException) && (!(th instanceof f) || (!(th.getCause() instanceof DBCorruptException) && !(th.getCause() instanceof DBFullException)))) {
            z = false;
        }
        if (z) {
            b((Callback<Void>) null);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public abstract class a extends j {
        public static ChangeQuickRedirect e;

        public a() {
            super(true);
            a(false);
        }

        @Override // com.sankuai.xm.base.db.j
        public final j a(boolean z) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = e;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78624bfd5b7f8cc4e95b82ccdb84ce27", 6917529027641081856L) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78624bfd5b7f8cc4e95b82ccdb84ce27") : super.a(false);
        }
    }

    private void c(final j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ee40f20b159cc58ed2c3ff76030816c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ee40f20b159cc58ed2c3ff76030816c");
            return;
        }
        long j = jVar.i ? 0L : jVar.h;
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        jVar.b(System.currentTimeMillis());
        com.sankuai.xm.threadpool.scheduler.a.b().a(this.b.d, new Runnable() { // from class: com.sankuai.xm.base.db.BaseDBProxy.9
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b01a39a21d27be6772de0d64ead61243", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b01a39a21d27be6772de0d64ead61243");
                    return;
                }
                try {
                    BaseDBProxy.this.a((Runnable) jVar);
                } finally {
                    if (jVar.i) {
                        countDownLatch.countDown();
                    }
                }
            }
        }, j);
        if (jVar.i) {
            a(countDownLatch);
        }
    }
}
