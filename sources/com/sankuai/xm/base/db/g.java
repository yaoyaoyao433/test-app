package com.sankuai.xm.base.db;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static g c;
    public ConcurrentHashMap<String, Object> b;
    private HashMap<BaseDBProxy, c> d;
    private volatile Context e;
    private AtomicInteger f;
    private volatile Boolean g;
    private volatile boolean h;
    private volatile int i;
    private List<b> j;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a();

        void b();
    }

    public static /* synthetic */ void a(g gVar, boolean z, boolean z2) {
        boolean z3;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "e5f2bf33e1bf196e627983cb13376d25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "e5f2bf33e1bf196e627983cb13376d25");
            return;
        }
        com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue sp migrate version:%d", "DBManager", Integer.valueOf(gVar.k()));
        if (gVar.i()) {
            com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue isSPDataMigrateFinish:true", "DBManager");
        } else if (gVar.f.compareAndSet(1, gVar.f.get()) || gVar.f.compareAndSet(2, gVar.f.get())) {
            com.sankuai.xm.log.c.d("DBManager", "%s::dataMigrateByDBNameOnQueue repeat invoke mMigrateFinish:true", "DBManager");
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue start", "DBManager");
                gVar.f.getAndSet(1);
                gVar.m();
                z3 = gVar.a(z, z2, true);
                try {
                    gVar.f.getAndSet(2);
                    gVar.l();
                    gVar.g();
                    com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue end", "DBManager");
                    gVar.b.put("db_migrate_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    gVar.b.put("db_migrate_result", Integer.valueOf(z3 ? 0 : -1));
                    gVar.a(z3);
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.sankuai.xm.log.c.a("DBManager", th);
                        com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue end", "DBManager");
                        gVar.b.put("db_migrate_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        gVar.b.put("db_migrate_result", -1);
                        gVar.a(false);
                        gVar.f.getAndSet(2);
                        gVar.l();
                        gVar.n();
                    } catch (Throwable th2) {
                        com.sankuai.xm.log.c.b("DBManager", "%s::dataMigrateByDBNameOnQueue end", "DBManager");
                        gVar.b.put("db_migrate_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        gVar.b.put("db_migrate_result", Integer.valueOf(z3 ? 0 : -1));
                        gVar.a(z3);
                        gVar.f.getAndSet(2);
                        gVar.l();
                        gVar.n();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = true;
            }
            gVar.f.getAndSet(2);
            gVar.l();
            gVar.n();
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8f09e64a4c73d928a49a5bcebe75d61d", 6917529027641081856L)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8f09e64a4c73d928a49a5bcebe75d61d");
        }
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g();
                }
            }
        }
        return c;
    }

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4592f7fff098a80a780bb9f445670110", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4592f7fff098a80a780bb9f445670110");
            return;
        }
        this.f = new AtomicInteger(0);
        this.g = null;
        this.h = false;
        this.i = -999;
        this.d = new HashMap<>();
        this.b = new ConcurrentHashMap<>();
        this.j = new ArrayList();
        this.e = com.sankuai.xm.base.f.m().g();
    }

    public final void a(BaseDBProxy baseDBProxy, Context context) {
        Object[] objArr = {baseDBProxy, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34fbb7a6572a4bf4b2cb5114b42b0cb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34fbb7a6572a4bf4b2cb5114b42b0cb0");
            return;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = context;
            }
            if (this.d.containsKey(baseDBProxy)) {
                return;
            }
            this.d.put(baseDBProxy, new c());
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95764eb66017bd56d47db33e96e75e1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95764eb66017bd56d47db33e96e75e1")).booleanValue();
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.d);
        }
        if (hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((c) entry.getValue()).b != 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void a(final boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fbf819a6e344f6d903a3fe9fe6bf49a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fbf819a6e344f6d903a3fe9fe6bf49a");
        } else {
            com.sankuai.xm.threadpool.scheduler.a.b().a(13, new Runnable() { // from class: com.sankuai.xm.base.db.g.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1d239281e2d14030b3c10055d44264e", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1d239281e2d14030b3c10055d44264e");
                    } else if (!g.this.b()) {
                        com.sankuai.xm.log.c.b("DBManager", "%s::startDataMigrateByDBName data migrate finish", "DBManager");
                    } else if (g.this.f.compareAndSet(1, g.this.f.get())) {
                        com.sankuai.xm.log.c.d("DBManager", "%s::startDataMigrateByDBName data migrating", "DBManager");
                    } else {
                        if (g.this.i == -999) {
                            g.this.i = g.this.k();
                        }
                        g.this.f.getAndSet(0);
                        g.this.b(g.this.i);
                        g.a(g.this, z, r3);
                    }
                }
            }, 0L);
        }
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1e741b22b99101d7d55e52becc2d6e", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1e741b22b99101d7d55e52becc2d6e") : this.b.get(str);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ce965112d15f2518af1f490a7fce50a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ce965112d15f2518af1f490a7fce50a");
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.d);
        }
        if (hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((BaseDBProxy) entry.getKey()).g() > 0) {
                    ((BaseDBProxy) entry.getKey()).a(new j(true) { // from class: com.sankuai.xm.base.db.g.2
                        @Override // java.lang.Runnable
                        public final void run() {
                        }

                        {
                            super(true);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:7:0x0033, B:9:0x0045, B:14:0x004f, B:16:0x0057, B:23:0x00ae), top: B:40:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.sankuai.xm.base.db.g.a r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.db.g.a(com.sankuai.xm.base.db.g$a, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0163, code lost:
        if (r23.b.containsKey("db_upgrade_time") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0165, code lost:
        r0 = r0 + ((java.lang.Long) r23.b.get("db_upgrade_time")).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0174, code lost:
        r23.b.put("db_upgrade_time", java.lang.Long.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0180, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d3, code lost:
        if (r23.b.containsKey("db_upgrade_time") != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(com.sankuai.xm.base.db.g.a r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.db.g.b(com.sankuai.xm.base.db.g$a, boolean):boolean");
    }

    private Map.Entry<BaseDBProxy, c> a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57bd91c39b485a90cf3a239964fb3e24", 6917529027641081856L)) {
            return (Map.Entry) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57bd91c39b485a90cf3a239964fb3e24");
        }
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.d);
        }
        if (hashMap.size() > 0) {
            for (Map.Entry<BaseDBProxy, c> entry : hashMap.entrySet()) {
                if (entry.getKey().b(aVar.a) > 0) {
                    return entry;
                }
            }
        }
        com.sankuai.xm.log.c.d("DBManager", "%s::getDBItem db:%s not found", "DBManager", aVar.a);
        return null;
    }

    private void a(int i) {
        Object[] objArr = {2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cfd7ab6bb18da1b5d8650028efa6de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cfd7ab6bb18da1b5d8650028efa6de");
            return;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.d);
        }
        if (hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((c) entry.getValue()).b = 2;
            }
        }
    }

    private i b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ab108d182f077c1780edfed4edd41f3", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ab108d182f077c1780edfed4edd41f3");
        }
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        synchronized (this) {
            hashMap.putAll(this.d);
        }
        if (hashMap.size() > 0) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (((BaseDBProxy) entry.getKey()).b(aVar.a) > 0) {
                    return ((BaseDBProxy) entry.getKey()).i();
                }
            }
        }
        com.sankuai.xm.log.c.d("DBManager", "%s::getDBVersion db:%s open listener not found", "DBManager", aVar.a);
        return null;
    }

    private boolean a(boolean z, boolean z2, boolean z3) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e982ab201b2ddc95baf13ca2470f363f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e982ab201b2ddc95baf13ca2470f363f")).booleanValue();
        }
        try {
            List<a> h = h();
            if (!h.isEmpty()) {
                com.sankuai.xm.log.c.b("DBManager", "%s::migrateDBData begin list size:%d bCryptDeleteDB:%b bUpgradeDeleteDB:%b bNotify:%b", "DBManager", Integer.valueOf(h.size()), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.TRUE);
                boolean z4 = true;
                for (int i = 0; i < h.size(); i++) {
                    a aVar = h.get(i);
                    com.sankuai.xm.log.c.a("DBManager", "%s::migrateDBData dbName:%s id:%s pwd:%s", "DBManager", aVar.a, aVar.b, aVar.c);
                    c((i * 100) / h.size());
                    b(aVar.a);
                    if (!a(aVar, z, z2)) {
                        com.sankuai.xm.log.c.b("DBManager", "%s::migrateDBData fail dbName:%s", "DBManager", aVar.a);
                        z4 = false;
                    }
                    c(aVar.a);
                }
                com.sankuai.xm.log.c.b("DBManager", "%s::migrateDBData end", "DBManager");
                return z4;
            }
            a(2);
            com.sankuai.xm.log.c.b("DBManager", "%s::migrateDBData end dir not files", "DBManager");
            return true;
        } catch (Throwable th) {
            com.sankuai.xm.log.c.a("DBManager", th);
            return false;
        }
    }

    private boolean a(a aVar, boolean z, boolean z2) {
        boolean z3;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea0966adb57aeac85e6d2acd923d6c3d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea0966adb57aeac85e6d2acd923d6c3d")).booleanValue();
        }
        if (aVar == null || aVar.a == null) {
            return false;
        }
        try {
            z3 = a(aVar, z);
            if (z3) {
                z3 = b(aVar, z2);
            }
        } catch (Throwable th) {
            com.sankuai.xm.log.c.a("DBManager", th);
            com.sankuai.xm.log.c.d("DBManager", "%s::migrateDBDataOne fail dbName:%s delete db", "DBManager", aVar.a);
            this.e.deleteDatabase(aVar.a);
            a(true, aVar);
        }
        if (!z3) {
            com.sankuai.xm.log.c.d("DBManager", "%s::migrateDBDataOne fail dbName:%s delete db", "DBManager", aVar.a);
            this.e.deleteDatabase(aVar.a);
            a(true, aVar);
            z3 = false;
        }
        Object[] objArr2 = {aVar, 2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2ca45f63945c51118f43163ad7d169b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2ca45f63945c51118f43163ad7d169b");
        } else {
            Map.Entry<BaseDBProxy, c> a2 = a(aVar);
            if (a2 != null) {
                a2.getValue().b = 2;
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0129, code lost:
        if (r18.e != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0168, code lost:
        if (r18.e == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
        r18.e.deleteDatabase(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x016f, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.sankuai.xm.base.db.g.a> h() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.db.g.h():java.util.List");
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed32e81663336d1b438c1bbc83031a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed32e81663336d1b438c1bbc83031a4");
        } else {
            com.sankuai.xm.base.e.a(com.sankuai.xm.base.e.a().edit().putBoolean("dx_sdk_data_migrate_have_suc", z));
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94bc5fc85713e71eb388d8b895f09c43", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94bc5fc85713e71eb388d8b895f09c43")).booleanValue();
        }
        g a2 = a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return !(PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b055a97659c29ec196d34a9a411ccdcd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b055a97659c29ec196d34a9a411ccdcd")).booleanValue() : com.sankuai.xm.base.e.a().getBoolean("dx_sdk_data_migrate_have_suc", true)) || a().h;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "921cc3310636bb7f67207d3be93fd72a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "921cc3310636bb7f67207d3be93fd72a");
            return;
        }
        a(true);
        this.h = false;
    }

    private void a(boolean z, a aVar) {
        Object[] objArr = {(byte) 1, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03637a820ad34e4e8166f187ec409553", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03637a820ad34e4e8166f187ec409553");
            return;
        }
        if (!this.h) {
            this.h = true;
        }
        if (aVar != null) {
            this.b.put(aVar.b, aVar.a);
        }
    }

    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "436b0ead317e98f7dade678d3db9179a", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "436b0ead317e98f7dade678d3db9179a")).booleanValue() : i();
    }

    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32594beba67739b25f119843d8ad267f", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32594beba67739b25f119843d8ad267f")).booleanValue() : k() > 0 && j();
    }

    private boolean j() {
        boolean z;
        List<a> h;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb0d2319143e1e966db0d7e8a534fb8", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb0d2319143e1e966db0d7e8a534fb8")).booleanValue();
        }
        if (this.g != null) {
            return this.g.booleanValue();
        }
        try {
            h = h();
        } catch (Throwable th) {
            com.sankuai.xm.log.c.a("DBManager", th);
        }
        if (!h.isEmpty()) {
            for (a aVar : h) {
                if (l.a(this.e, aVar.a) != l.b(this.e)) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        com.sankuai.xm.log.c.b("DBManager", "%s::isDBFileAgreeWithDBEngine ret:%b", "DBManager", Boolean.valueOf(z));
        this.g = Boolean.valueOf(z);
        return this.g.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "705c698824109db905d6e1c9df1472f4", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "705c698824109db905d6e1c9df1472f4")).intValue() : com.sankuai.xm.base.e.a().getInt("dx_sdk_data_migrate_version", -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79759336c94deb45f3395b7523f6a7a8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79759336c94deb45f3395b7523f6a7a8");
        } else {
            com.sankuai.xm.base.e.a(com.sankuai.xm.base.e.a().edit().putInt("dx_sdk_data_migrate_version", i));
        }
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27869fdacead13f1cd2e8c523495f6d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27869fdacead13f1cd2e8c523495f6d1");
            return;
        }
        b(1);
        this.g = Boolean.TRUE;
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfb47a14238e30a1eaeaa23919ea42a4", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfb47a14238e30a1eaeaa23919ea42a4")).booleanValue() : l.b(this.e);
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77a4e839495941411f0198f534207253", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77a4e839495941411f0198f534207253");
            return;
        }
        synchronized (this) {
            if (this.j.contains(bVar)) {
                return;
            }
            this.j.add(bVar);
        }
    }

    private void m() {
        ArrayList<b> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cda5a37d7d2dbdfed3bed3c07fbcc25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cda5a37d7d2dbdfed3bed3c07fbcc25");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.j);
        }
        for (b bVar : arrayList) {
            bVar.a();
        }
    }

    private void c(int i) {
        ArrayList arrayList;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f124b812272dca3875d428dd120548d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f124b812272dca3875d428dd120548d1");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.j);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void n() {
        ArrayList<b> arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8df7760a9d6f375c483387052a091a8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8df7760a9d6f375c483387052a091a8e");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.j);
        }
        for (b bVar : arrayList) {
            bVar.b();
        }
    }

    private void b(String str) {
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bccc96419506ab1337feee5ffdb7a0aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bccc96419506ab1337feee5ffdb7a0aa");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.j);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void c(String str) {
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550a390f87d51b5b45570e8c05193a6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550a390f87d51b5b45570e8c05193a6b");
            return;
        }
        synchronized (this) {
            arrayList = new ArrayList();
            arrayList.addAll(this.j);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void a(final Callback<Void> callback) {
        final HashMap hashMap;
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a748ad8b695bc51c566ff7b4aee23bce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a748ad8b695bc51c566ff7b4aee23bce");
            return;
        }
        synchronized (this) {
            hashMap = new HashMap(this.d);
        }
        if (hashMap.isEmpty()) {
            if (callback != null) {
                callback.onSuccess(null);
                return;
            }
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        Callback<Void> callback2 = new Callback<Void>() { // from class: com.sankuai.xm.base.db.g.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.callback.Callback
            public final /* synthetic */ void onSuccess(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d409d642505e5a9ad5ac1803a74359fa", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d409d642505e5a9ad5ac1803a74359fa");
                } else if (atomicInteger.incrementAndGet() < hashMap.size() || callback == null) {
                } else {
                    callback.onSuccess(null);
                }
            }

            @Override // com.sankuai.xm.base.callback.Callback
            public final void onFailure(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bf887f02499db5b394a0982260869e3", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bf887f02499db5b394a0982260869e3");
                } else if (atomicInteger.incrementAndGet() < hashMap.size() || callback == null) {
                } else {
                    callback.onSuccess(null);
                }
            }
        };
        for (BaseDBProxy baseDBProxy : hashMap.keySet()) {
            baseDBProxy.b(callback2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        public String a;
        public String b;
        public String c;
        public boolean d;

        public a() {
            this.d = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class c {
        public static ChangeQuickRedirect a;
        int b;

        public c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4620cc4e0c07ad69a4d2646993fc5bd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4620cc4e0c07ad69a4d2646993fc5bd");
            } else {
                this.b = 0;
            }
        }
    }
}
