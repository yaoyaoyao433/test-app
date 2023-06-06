package com.sankuai.xm.im.cache;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.alipay.sdk.app.PayTask;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import com.sankuai.xm.base.db.BaseDBProxy;
import com.sankuai.xm.base.db.DBCorruptException;
import com.sankuai.xm.base.db.DBFullException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DBProxy extends BaseDBProxy implements com.sankuai.xm.base.db.d {
    public static ChangeQuickRedirect j;
    private static volatile com.sankuai.xm.base.db.e o = new DefaultDBErrorListener();
    public f k;
    public n l;
    public l m;
    public volatile long n;
    private volatile boolean p;
    private volatile com.sankuai.xm.base.db.c q;
    private m r;
    private i s;
    private h t;
    private d u;
    private g v;
    private com.sankuai.xm.base.lifecycle.a w;
    private volatile long x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public static final DBProxy a = (DBProxy) com.sankuai.xm.base.service.m.a(DBProxy.class);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String c() {
        return "0_message_db.db";
    }

    public DBProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5277f0067729e20c0385761d10a58175", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5277f0067729e20c0385761d10a58175");
        } else {
            this.p = false;
        }
    }

    public static /* synthetic */ void a(DBProxy dBProxy, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, dBProxy, changeQuickRedirect, false, "61f587917e2df3486efbeb4813b653aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dBProxy, changeQuickRedirect, false, "61f587917e2df3486efbeb4813b653aa");
        } else if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = com.sankuai.xm.base.e.a().getLong(dBProxy.d(), 0L);
            if (j2 != 0) {
                dBProxy.x = currentTimeMillis - j2;
            }
            com.sankuai.xm.base.e.a().a(dBProxy.d(), currentTimeMillis);
        }
    }

    public static /* synthetic */ void c(DBProxy dBProxy) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, dBProxy, changeQuickRedirect, false, "3f602a39cc056966e859d91ea4dcbe24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, dBProxy, changeQuickRedirect, false, "3f602a39cc056966e859d91ea4dcbe24");
            return;
        }
        com.sankuai.xm.im.utils.a.d("DBProxy::db closeDBThread", new Object[0]);
        com.sankuai.xm.threadpool.scheduler.a.b().d(13);
    }

    public static DBProxy l() {
        return a.a;
    }

    public static void a(com.sankuai.xm.base.db.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97357ccb2164c991085084db9f8d6539", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97357ccb2164c991085084db9f8d6539");
            return;
        }
        synchronized (DBProxy.class) {
            o = eVar;
        }
    }

    public final m m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "787abe04dc7e7939e1ebf0727ff7d7bb", 6917529027641081856L)) {
            return (m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "787abe04dc7e7939e1ebf0727ff7d7bb");
        }
        if (this.r == null) {
            this.r = new m(this);
        }
        return this.r;
    }

    public final h n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ed5e4da6b97010d9d39d29867ceee2", 6917529027641081856L)) {
            return (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ed5e4da6b97010d9d39d29867ceee2");
        }
        if (this.t == null) {
            this.t = new h(this);
        }
        return this.t;
    }

    public final d o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93bbe54f98a37836b0ccd96e36a0e297", 6917529027641081856L)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93bbe54f98a37836b0ccd96e36a0e297");
        }
        if (this.u == null) {
            this.u = new d(this);
        }
        return this.u;
    }

    public final g p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0fa42a55435a2920b20a3bb93a854f5", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0fa42a55435a2920b20a3bb93a854f5");
        }
        if (this.v == null) {
            this.v = new g();
        }
        return this.v;
    }

    @Override // com.sankuai.xm.base.service.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d918bbb509820cd10256c2b1995dbd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d918bbb509820cd10256c2b1995dbd")).intValue();
        }
        Context g = com.sankuai.xm.base.f.m().g();
        final long b = com.sankuai.xm.base.f.m().b();
        Object[] objArr2 = {g, new Long(b)};
        ChangeQuickRedirect changeQuickRedirect2 = j;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0795ed681f389345b950553b36fec580", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0795ed681f389345b950553b36fec580");
        } else {
            com.sankuai.xm.base.db.a aVar = new com.sankuai.xm.base.db.a(23, new k());
            aVar.g = this;
            aVar.d = 13;
            this.p = false;
            this.n = b;
            a(g, aVar, this.n + "_message_db.db", false);
            if (b > 0) {
                c.a(b);
                b(this.e, new Callback<Boolean>() { // from class: com.sankuai.xm.im.cache.DBProxy.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final /* synthetic */ void onSuccess(Boolean bool) {
                        Object[] objArr3 = {bool};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07ce3c5290ef9d86e11ab7716e73d42a", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07ce3c5290ef9d86e11ab7716e73d42a");
                            return;
                        }
                        DBProxy.a(DBProxy.this, true);
                        c.a(b, true, 0);
                    }

                    @Override // com.sankuai.xm.base.callback.Callback
                    public final void onFailure(int i, String str) {
                        Object[] objArr3 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f7973bd127c32fc458f8bc42b45ca1c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f7973bd127c32fc458f8bc42b45ca1c");
                        } else {
                            c.a(b, false, i);
                        }
                    }
                });
            }
        }
        return super.a();
    }

    public final void a(final long j2, boolean z, final Callback<Boolean> callback) {
        Object[] objArr = {new Long(j2), (byte) 0, callback};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60d791386f9d8a73fe7452ec4b6eb16b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60d791386f9d8a73fe7452ec4b6eb16b");
            return;
        }
        final Callback<Boolean> callback2 = new Callback<Boolean>() { // from class: com.sankuai.xm.im.cache.DBProxy.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86a25130b1f6723e961256475ae65cfd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86a25130b1f6723e961256475ae65cfd");
                    return;
                }
                DBProxy.a(DBProxy.this, bool2.booleanValue());
                long uptimeMillis = SystemClock.uptimeMillis();
                if (callback != null) {
                    callback.onSuccess(bool2);
                }
                c.a("backtime", SystemClock.uptimeMillis() - uptimeMillis);
                c.a(j2, bool2.booleanValue(), 0);
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e425c82ed3e6aea54761c03e395b394f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e425c82ed3e6aea54761c03e395b394f");
                    return;
                }
                if (callback != null) {
                    callback.onFailure(i, str);
                }
                c.a(j2, false, i);
            }
        };
        c.a(j2);
        BaseDBProxy.a aVar = new BaseDBProxy.a() { // from class: com.sankuai.xm.im.cache.DBProxy.5
            public static ChangeQuickRedirect a;
            private com.sankuai.xm.base.trace.g o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.o = com.sankuai.xm.base.trace.j.a();
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1842a389917cb357a1bd0f93b3276e9", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1842a389917cb357a1bd0f93b3276e9");
                    return;
                }
                try {
                    com.sankuai.xm.base.trace.j.a(this.o);
                    if (DBProxy.this.n == 0 || (j2 != 0 && DBProxy.this.n != j2)) {
                        DBProxy.this.n = j2;
                    }
                    DBProxy dBProxy = DBProxy.this;
                    dBProxy.a(j2 + "_message_db.db", callback2);
                    com.sankuai.xm.base.trace.j.c(this.o);
                } catch (Throwable th) {
                    com.sankuai.xm.base.trace.j.a(this.o, th);
                    throw th;
                }
            }
        };
        aVar.i = false;
        aVar.l = callback;
        a((com.sankuai.xm.base.db.j) aVar);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b(final Callback<Void> callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f5ef256f96fd2a2042093e9fd665450", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f5ef256f96fd2a2042093e9fd665450");
            return;
        }
        BaseDBProxy.a aVar = new BaseDBProxy.a() { // from class: com.sankuai.xm.im.cache.DBProxy.6
            public static ChangeQuickRedirect a;
            private com.sankuai.xm.base.trace.g d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.d = com.sankuai.xm.base.trace.j.a();
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "332ecd0fe7db487169039ace10c8d2bd", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "332ecd0fe7db487169039ace10c8d2bd");
                    return;
                }
                try {
                    com.sankuai.xm.base.trace.j.a(this.d);
                    com.sankuai.xm.im.utils.a.b("DBProxy::cleanDBCache, mUser = " + DBProxy.this.n + ",handled = " + DBProxy.this.p, new Object[0]);
                    DBProxy.c(DBProxy.this);
                    DBProxy.this.f(DBProxy.this.q);
                    DBProxy.this.b(DBProxy.this.d(), (Callback<Boolean>) null);
                    if (callback != null) {
                        callback.onSuccess(null);
                    }
                    com.sankuai.xm.base.trace.j.c(this.d);
                } catch (Throwable th) {
                    com.sankuai.xm.base.trace.j.a(this.d, th);
                    throw th;
                }
            }
        };
        aVar.i = true;
        aVar.l = callback;
        a((com.sankuai.xm.base.db.j) aVar);
    }

    private String d(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5683c4db3b1d116e1dc0f27ec361ca4a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5683c4db3b1d116e1dc0f27ec361ca4a");
        }
        if (j2 <= 0) {
            return "0_message_db.db";
        }
        return j2 + "_message_db.db";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ececc1ca8c7fc759034638b6f5bdcdbf", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ececc1ca8c7fc759034638b6f5bdcdbf") : d(this.n);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7cc899a2b897ed8f07d14fcfde680c", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7cc899a2b897ed8f07d14fcfde680c");
        }
        if (com.sankuai.xm.base.db.g.a().f()) {
            if (TextUtils.equals(d(0L), str)) {
                return com.sankuai.xm.base.db.l.b(this.c, "0");
            }
            return com.sankuai.xm.base.db.l.b(this.c, String.valueOf(this.n));
        }
        return "";
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "094db335a027147117b06a997f8ad92d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "094db335a027147117b06a997f8ad92d")).booleanValue();
        }
        if (com.sankuai.xm.login.a.a().e() <= 0 && super.e()) {
            com.sankuai.xm.im.utils.a.c("DBProxy::checkReady::uid <= 0 but db ready", new Object[0]);
            return true;
        }
        long e = com.sankuai.xm.login.a.a().e();
        return super.e() && !TextUtils.equals("0_message_db.db", d()) && (e == 0 || d().contains(Long.toString(e)));
    }

    public final boolean b(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bc6cdbf48cc45b810a85d53ef65efa1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bc6cdbf48cc45b810a85d53ef65efa1")).booleanValue() : TextUtils.equals(d(j2), d()) && e();
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c26504a76792fb89d9b6c71e07ee905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c26504a76792fb89d9b6c71e07ee905");
        } else {
            a(new Callback<Void>() { // from class: com.sankuai.xm.im.cache.DBProxy.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.xm.base.callback.Callback
                public final void onFailure(int i, String str) {
                }

                @Override // com.sankuai.xm.base.callback.Callback
                public final /* synthetic */ void onSuccess(Void r11) {
                    Object[] objArr2 = {r11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f81baefc05cf8e0a0b2f172304f89818", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f81baefc05cf8e0a0b2f172304f89818");
                    } else {
                        DBProxy.this.n = 0L;
                    }
                }
            });
        }
    }

    public final boolean a(Runnable runnable, long j2) {
        Object[] objArr = {runnable, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c660d94d2a576e7dc6613155a55731", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c660d94d2a576e7dc6613155a55731")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        return a(new com.sankuai.xm.base.db.j(j2, false, true, runnable) { // from class: com.sankuai.xm.im.cache.DBProxy.9
            public static ChangeQuickRedirect a;
            public final /* synthetic */ Runnable b;
            private com.sankuai.xm.base.trace.g d = com.sankuai.xm.base.trace.j.a();

            {
                this.b = runnable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b861573a9e2e2f2114b731616aa8c94", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b861573a9e2e2f2114b731616aa8c94");
                    return;
                }
                try {
                    com.sankuai.xm.base.trace.j.a(this.d);
                    this.b.run();
                    com.sankuai.xm.base.trace.j.c(this.d);
                } catch (Throwable th) {
                    com.sankuai.xm.base.trace.j.a(this.d, th);
                    throw th;
                }
            }
        }.a(runnable));
    }

    public final boolean b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3506c648c417354cc40c7ee40897c3d2", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3506c648c417354cc40c7ee40897c3d2")).booleanValue() : a(runnable, 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d218dcae1bd3ecf160569651589d1b3f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d218dcae1bd3ecf160569651589d1b3f")).booleanValue();
        }
        try {
            if (com.sankuai.xm.base.db.g.a().e() && g() <= 0) {
                if (bR_() == null) {
                    com.sankuai.xm.im.utils.a.b("DBProxy::::isInReadThreadRun getWritableDatabase null", new Object[0]);
                    return false;
                }
                return true;
            }
            com.sankuai.xm.im.utils.a.b("DBProxy::::isInReadThreadRun data migrate ing isDataMigrateFinish:%b size:%d", Boolean.valueOf(com.sankuai.xm.base.db.g.a().e()), Integer.valueOf(g()));
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final <T> boolean b(final Runnable runnable, final Callback<T> callback) {
        Object[] objArr = {runnable, callback};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3de4c502ec5650a5b7841a86705e42", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3de4c502ec5650a5b7841a86705e42")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        if (h()) {
            if (r()) {
                com.sankuai.xm.threadpool.scheduler.a.b().a(15, com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.im.cache.DBProxy.10
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8bd36f1c90f734dbbbf46b364f4857e8", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8bd36f1c90f734dbbbf46b364f4857e8");
                        } else if (DBProxy.this.t()) {
                            if (!DBProxy.this.e()) {
                                DBProxy dBProxy = DBProxy.this;
                                dBProxy.a(new com.sankuai.xm.base.db.f(1, "db not ready: " + DBProxy.this.d()), runnable.getClass().getName());
                                if (callback != null) {
                                    callback.onFailure(RequestIDMap.OP_TYPE_CHANNEL.OP_TYPE_WRITE_WEB_EVENT, "db not ready");
                                    return;
                                }
                                return;
                            }
                            DBProxy.this.a(runnable);
                        } else {
                            DBProxy.this.a(runnable, callback);
                        }
                    }
                }));
            } else if (t()) {
                c(runnable);
            } else {
                a(runnable, callback);
            }
            return true;
        }
        return a(runnable, callback);
    }

    public final boolean c(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa26429e1789a1705625dcc7889c7def", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa26429e1789a1705625dcc7889c7def")).booleanValue();
        }
        if (runnable == null) {
            return false;
        }
        if (h()) {
            a(runnable);
            return true;
        }
        return a(runnable, true, (Callback) null);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61fd8837efc80804681a11531fae09c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61fd8837efc80804681a11531fae09c2");
            return;
        }
        com.sankuai.xm.im.utils.a.d("DBProxy::dbErrorReportAndPrint:" + str + ",ex =" + str2, new Object[0]);
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f81e8d4ee6cd5a8e7b2c0341ab7b8da1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f81e8d4ee6cd5a8e7b2c0341ab7b8da1");
            return;
        }
        this.k = new f(this);
        this.m = new l(this);
        this.l = new n(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x014b A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:29:0x012a, B:31:0x014b, B:33:0x015d, B:35:0x019a, B:37:0x01b3, B:36:0x019e, B:32:0x014f), top: B:43:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014f A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:29:0x012a, B:31:0x014b, B:33:0x015d, B:35:0x019a, B:37:0x01b3, B:36:0x019e, B:32:0x014f), top: B:43:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019a A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:29:0x012a, B:31:0x014b, B:33:0x015d, B:35:0x019a, B:37:0x01b3, B:36:0x019e, B:32:0x014f), top: B:43:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019e A[Catch: all -> 0x01c4, TryCatch #0 {all -> 0x01c4, blocks: (B:29:0x012a, B:31:0x014b, B:33:0x015d, B:35:0x019a, B:37:0x01b3, B:36:0x019e, B:32:0x014f), top: B:43:0x012a }] */
    @Override // com.sankuai.xm.base.db.BaseDBProxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.sankuai.xm.base.db.c r21) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.im.cache.DBProxy.d(com.sankuai.xm.base.db.c):void");
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy, com.sankuai.xm.base.db.d
    public final void g(com.sankuai.xm.base.db.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f289868636731c9cef61b2c13a96ce5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f289868636731c9cef61b2c13a96ce5");
            return;
        }
        com.sankuai.xm.im.utils.a.d("DBProxy::IMDatabaseErrorHandler::onCorruption, " + cVar, new Object[0]);
        this.q = cVar;
        throw new DBCorruptException(new Exception());
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void a(Throwable th, String str) {
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "870a332b77199546bc2b1822d713d491", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "870a332b77199546bc2b1822d713d491");
            return;
        }
        com.sankuai.xm.im.utils.a.a(th, "DBProxy::handleDBException, db name = " + this.e + ", mUser = " + this.n + ", handled = " + this.p + ", func = " + str, new Object[0]);
        if ((th instanceof DBCorruptException) || (th instanceof DBFullException)) {
            a((com.sankuai.xm.base.db.f) th);
        } else if (th instanceof com.sankuai.xm.base.db.f) {
            if ((th.getCause() instanceof DBCorruptException) || (th.getCause() instanceof DBFullException)) {
                a((com.sankuai.xm.base.db.f) th.getCause());
            }
        }
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46eb93e70703ed95f7d0310fd2125ded", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46eb93e70703ed95f7d0310fd2125ded")).intValue() : (str == null || !str.contains("message_db.db")) ? -1 : 23;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final com.sankuai.xm.base.db.i i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee7db371c876af2f2ca506f7c91b368a", 6917529027641081856L) ? (com.sankuai.xm.base.db.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee7db371c876af2f2ca506f7c91b368a") : new k();
    }

    private void a(final com.sankuai.xm.base.db.f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4536ff8cf627612290ac9b7fdf6be7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4536ff8cf627612290ac9b7fdf6be7c");
        } else if (this.p) {
        } else {
            this.p = o != null;
            if (this.p) {
                com.sankuai.xm.im.notifier.b bVar = new com.sankuai.xm.im.notifier.b(com.sankuai.xm.base.db.e.class) { // from class: com.sankuai.xm.im.cache.DBProxy.11
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.xm.im.notifier.b
                    public final void a() {
                        com.sankuai.xm.base.db.e eVar;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5fd14b87a558d212db43ff27e7434fce", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5fd14b87a558d212db43ff27e7434fce");
                            return;
                        }
                        synchronized (DBProxy.class) {
                            eVar = DBProxy.o != null ? DBProxy.o : null;
                        }
                        if (eVar != null) {
                            eVar.a(fVar);
                        }
                    }
                };
                bVar.f = 1;
                com.sankuai.xm.im.notifier.a.a(bVar, (long) PayTask.j);
            }
        }
    }

    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = j;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69988c38dc005d2f718a7f09e901c11e", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69988c38dc005d2f718a7f09e901c11e")).booleanValue() : Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void a(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7e225e21ed60c2ac73327815f3336d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7e225e21ed60c2ac73327815f3336d4");
            return;
        }
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        super.a(runnable);
        long currentThreadTimeMillis2 = SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis;
        if (currentThreadTimeMillis2 > 500) {
            String name = runnable.getClass().getName();
            if (runnable instanceof com.sankuai.xm.base.db.j) {
                name = ((com.sankuai.xm.base.db.j) runnable).k.getName();
            }
            c.a("DBExecuteTime::" + name, currentThreadTimeMillis2, 0, -1);
        }
    }

    public final long c(long j2) {
        Object[] objArr = {new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "556de0437e689a438eb7bec038dbb6c4", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "556de0437e689a438eb7bec038dbb6c4")).longValue();
        }
        if (j2 == this.n) {
            return this.x;
        }
        return 0L;
    }

    @Override // com.sankuai.xm.base.db.BaseDBProxy
    public final void e(com.sankuai.xm.base.db.c cVar) {
        i iVar;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = j;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe40dd761195764e902c10009ebb89ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe40dd761195764e902c10009ebb89ec");
            return;
        }
        f fVar = this.k;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "92225aeb40b7d3dabeed9077aa7adc12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "92225aeb40b7d3dabeed9077aa7adc12");
        } else {
            synchronized (fVar.b) {
                fVar.e.clear();
            }
            synchronized (fVar.c) {
                if (fVar.f != null) {
                    fVar.f.clear();
                }
                if (fVar.g != null) {
                    fVar.g.clear();
                }
            }
            fVar.i = 0L;
            fVar.j = 0;
            fVar.l = 0L;
            fVar.h = false;
        }
        l lVar = this.m;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = l.a;
        if (PatchProxy.isSupport(objArr3, lVar, changeQuickRedirect3, false, "25dba06b75a85a37b48c1b9625fa74b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr3, lVar, changeQuickRedirect3, false, "25dba06b75a85a37b48c1b9625fa74b2");
        } else {
            synchronized (lVar.b) {
                lVar.d.clear();
            }
            lVar.e.getAndSet(false);
        }
        m m = m();
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = m.a;
        if (PatchProxy.isSupport(objArr4, m, changeQuickRedirect4, false, "e18973cdf272c31e02bdb1b0b8423c6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr4, m, changeQuickRedirect4, false, "e18973cdf272c31e02bdb1b0b8423c6b");
        } else {
            synchronized (m.b) {
                m.d.clear();
            }
            m.e.set(false);
        }
        n nVar = this.l;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = n.a;
        if (PatchProxy.isSupport(objArr5, nVar, changeQuickRedirect5, false, "508895540b6b31312c456a36df47f997", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr5, nVar, changeQuickRedirect5, false, "508895540b6b31312c456a36df47f997");
        } else {
            synchronized (nVar.b) {
                nVar.d.clear();
            }
            nVar.e.set(false);
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = j;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6ebabcb1994b12dfb400b17795304ae1", 6917529027641081856L)) {
            iVar = (i) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6ebabcb1994b12dfb400b17795304ae1");
        } else {
            if (this.s == null) {
                this.s = new i(this);
            }
            iVar = this.s;
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = i.a;
        if (PatchProxy.isSupport(objArr7, iVar, changeQuickRedirect7, false, "091207739510554ab2d1695b0ed0da13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr7, iVar, changeQuickRedirect7, false, "091207739510554ab2d1695b0ed0da13");
        } else {
            synchronized (iVar.b) {
                iVar.c.clear();
            }
            iVar.d = false;
        }
        h n = n();
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = h.a;
        if (PatchProxy.isSupport(objArr8, n, changeQuickRedirect8, false, "0752af0ffde3b7007e50340195597e33", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr8, n, changeQuickRedirect8, false, "0752af0ffde3b7007e50340195597e33");
        } else {
            n.a();
        }
        d o2 = o();
        Object[] objArr9 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect9 = d.a;
        if (PatchProxy.isSupport(objArr9, o2, changeQuickRedirect9, false, "66fd4034c1f88be21d5c018f370bbde1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr9, o2, changeQuickRedirect9, false, "66fd4034c1f88be21d5c018f370bbde1");
        } else {
            o2.a();
        }
        this.p = false;
        if (this.w != null) {
            com.sankuai.xm.base.lifecycle.d.d().b(this.w);
            this.w = null;
        }
    }
}
