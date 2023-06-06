package com.meituan.android.mrn.engine;

import android.content.Context;
import android.support.annotation.GuardedBy;
import android.text.TextUtils;
import com.meituan.android.mrn.engine.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class x {
    public static ChangeQuickRedirect a;
    private static volatile x f;
    private static volatile boolean g;
    Context b;
    final Object c;
    @GuardedBy("sLock")
    List<e> d;
    boolean e;
    private ExecutorService h;
    private com.meituan.android.mrn.utils.collection.c<String, g> i;

    private x(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab19a5abf9d30582ab5e78a7891bc2d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab19a5abf9d30582ab5e78a7891bc2d4");
            return;
        }
        this.c = new Object();
        this.d = new ArrayList();
        this.h = com.sankuai.android.jarvis.c.a("mrn_WriteToDisk", 1);
        this.e = false;
        this.b = context.getApplicationContext();
        this.i = new com.meituan.android.mrn.utils.collection.c<>(this.b, com.meituan.android.mrn.common.b.a(this.b), "mrn_bundle_manage_bundle_info", com.meituan.android.mrn.utils.collection.b.c, new com.meituan.android.mrn.utils.collection.b<g>() { // from class: com.meituan.android.mrn.engine.x.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ g a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "871b974df3c7296229da2916e578bf83", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "871b974df3c7296229da2916e578bf83") : (g) com.meituan.android.mrn.utils.g.a(str, g.class);
            }

            @Override // com.meituan.android.mrn.utils.collection.b
            public final /* synthetic */ String a(g gVar) {
                g gVar2 = gVar;
                Object[] objArr2 = {gVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a88f26d4917883dd374c4721512f4fd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a88f26d4917883dd374c4721512f4fd") : com.meituan.android.mrn.utils.g.a(gVar2);
            }
        });
        this.e = com.meituan.android.mrn.common.b.b(this.b, "mrn_has_managed_storage_today", 0L) + 86400000 > System.currentTimeMillis();
    }

    public static synchronized x a(Context context) {
        synchronized (x.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cd8027fe468f96d0a71777326a480389", RobustBitConfig.DEFAULT_VALUE)) {
                return (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cd8027fe468f96d0a71777326a480389");
            } else if (context == null) {
                throw new IllegalArgumentException("Invalid context argument");
            } else {
                if (f == null) {
                    f = new x(context);
                }
                g = true;
                return f;
            }
        }
    }

    public static final synchronized x a() {
        synchronized (x.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f55916e9a875af653b0a80b440555e6b", RobustBitConfig.DEFAULT_VALUE)) {
                return (x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f55916e9a875af653b0a80b440555e6b");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "09f2452f557f538e55359493fd6825a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "09f2452f557f538e55359493fd6825a7");
            } else if (!g) {
                throw new IllegalStateException("MRNStorageManager::createInstance() needs to be called before MRNStorageManager::sharedInstance()");
            }
            return f;
        }
    }

    public final e a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e74f42fc8edffb0a8487b6d676e844b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e74f42fc8edffb0a8487b6d676e844b8");
        }
        e eVar = null;
        for (e eVar2 : c()) {
            if (eVar2 != null && TextUtils.equals(eVar2.c, str)) {
                if (!com.meituan.android.mrn.debug.a.c()) {
                    com.meituan.android.mrn.debug.interfaces.b.a();
                }
                if (!eVar2.j() || com.meituan.android.mrn.config.horn.i.b.a()) {
                    if (eVar == null || com.meituan.android.mrn.utils.e.a(eVar.f, eVar2.f) < 0) {
                        eVar = eVar2;
                    }
                }
            }
        }
        return (eVar == null || !eVar.j()) ? eVar : y.a(eVar, false);
    }

    public final e a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00d81997eee289e21437b94399b0ff49", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00d81997eee289e21437b94399b0ff49");
        }
        for (e eVar : c()) {
            if (eVar != null && TextUtils.equals(eVar.c, str) && TextUtils.equals(eVar.f, str2)) {
                if (eVar.j()) {
                    if (com.meituan.android.mrn.config.horn.i.b.a()) {
                        return y.a(eVar, false);
                    }
                    return null;
                }
                return eVar;
            }
        }
        return null;
    }

    public final List<e> b(String str) {
        ArrayList arrayList;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77b67da025968f8fc10039ddbd642759", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77b67da025968f8fc10039ddbd642759");
        }
        synchronized (this.c) {
            arrayList = new ArrayList();
            if (this.d != null) {
                for (e eVar : this.d) {
                    if (eVar.c.equals(str)) {
                        if (eVar.j()) {
                            if (com.meituan.android.mrn.config.horn.i.b.a()) {
                                eVar = y.a(eVar, false);
                            }
                        }
                        arrayList.add(eVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<e> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be43b86d5d632ccfb7b1f0fada20cfc1", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be43b86d5d632ccfb7b1f0fada20cfc1") : c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<e> c() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "576f9f4812a4545ced9d7848fceeaea8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "576f9f4812a4545ced9d7848fceeaea8");
        }
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        return arrayList;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "322f565d8c2fa796e2a085cdea1a500c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "322f565d8c2fa796e2a085cdea1a500c");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNStorageManager@addBundle]", eVar);
        if (eVar != null) {
            try {
                if (TextUtils.isEmpty(eVar.c)) {
                    return;
                }
                synchronized (this.c) {
                    if (this.d.contains(eVar)) {
                        this.d.remove(eVar);
                    }
                    this.d.add(eVar);
                    f();
                }
            } catch (Throwable th) {
                com.meituan.android.mrn.utils.c.a("[MRNStorageManager@addBundle]", th);
            }
        }
    }

    public final void a(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef7b6c7d02c55e9d983a1664878eb43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef7b6c7d02c55e9d983a1664878eb43");
        } else if (list != null && !list.isEmpty()) {
            synchronized (this.c) {
                for (e eVar : list) {
                    if (eVar != null && !TextUtils.isEmpty(eVar.c)) {
                        if (this.d.contains(eVar)) {
                            this.d.remove(eVar);
                        }
                        this.d.add(eVar);
                    }
                }
                f();
            }
        }
    }

    public final void b(List<e> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8a3feb347d89e3bec0cfbff2a08077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8a3feb347d89e3bec0cfbff2a08077");
        } else if (!list.isEmpty()) {
            synchronized (this.c) {
                for (e eVar : list) {
                    if (eVar != null && !TextUtils.isEmpty(eVar.c)) {
                        com.facebook.common.logging.a.b("[MRNStorageManager@removeBundles]", eVar.c);
                        this.d.remove(eVar);
                        eVar.a();
                    }
                }
                f();
            }
        }
    }

    public final void b(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543d667433bc9fe2ab1fa3022a9291fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543d667433bc9fe2ab1fa3022a9291fe");
        } else if (eVar == null) {
        } else {
            com.facebook.common.logging.a.b("[MRNStorageManager@removeBundle]", eVar.c);
            synchronized (this.c) {
                this.d.remove(eVar);
                f();
                com.meituan.android.mrn.utils.collection.c<String, g> cVar = this.i;
                if (cVar.containsKey(eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f)) {
                    com.meituan.android.mrn.utils.collection.c<String, g> cVar2 = this.i;
                    cVar2.remove(eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f);
                }
                eVar.a();
            }
        }
    }

    public final File d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "247a10786bfdd75d0a3c2126af55c017", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "247a10786bfdd75d0a3c2126af55c017");
        }
        Context context = this.b;
        File a2 = com.meituan.android.cipstorage.q.a(context, "mrn_default", f.a(this.b) + "mrn_dio");
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    private File l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66697263983caa6dd82c97c899b81d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66697263983caa6dd82c97c899b81d7");
        }
        File a2 = com.meituan.android.cipstorage.q.a(this.b, "mrn_cache", f.a(this.b));
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public final File e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b843719a028fdaa1ce02a59a1a52449e", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b843719a028fdaa1ce02a59a1a52449e");
        }
        Context context = this.b;
        File a2 = com.meituan.android.cipstorage.q.a(context, "mrn_default", f.a(this.b) + "mrn_remove_bundles");
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public final File b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90e68405133de89c66edbf1051b8b91d", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90e68405133de89c66edbf1051b8b91d") : new File(e(), String.format("%s_%s.dio", str, str2));
    }

    private File m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71517236a4bea20844a9375c8910e68b", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71517236a4bea20844a9375c8910e68b");
        }
        Context context = this.b;
        File a2 = com.meituan.android.cipstorage.q.a(context, "mrn_default", f.a(this.b) + "mrn_attachment");
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    public final File c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c863823f2fb2f5d2cb05529712584e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c863823f2fb2f5d2cb05529712584e6");
        }
        File m = m();
        return new File(m, str + CommonConstant.Symbol.UNDERLINE + str2);
    }

    public final File d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3bf7dd413b366a8f3e1868578d20e58", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3bf7dd413b366a8f3e1868578d20e58") : new File(d(), String.format("%s_%s.dio", str, str2));
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d659e04535c10484d3070bb165a1592f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d659e04535c10484d3070bb165a1592f");
            return;
        }
        try {
            final File g2 = g();
            if (g2.exists()) {
                g2.delete();
            }
            try {
                g2.createNewFile();
            } catch (IOException unused) {
            }
            this.h.execute(new Runnable() { // from class: com.meituan.android.mrn.engine.x.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe75d3dee9ad3c0317ff48965757cd45", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe75d3dee9ad3c0317ff48965757cd45");
                        return;
                    }
                    synchronized (x.this.c) {
                        ObjectOutputStream objectOutputStream = null;
                        try {
                            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(g2));
                            try {
                                objectOutputStream2.writeObject(x.this.d);
                                objectOutputStream2.flush();
                                com.meituan.android.mrn.utils.n.a(objectOutputStream2);
                            } catch (Throwable th) {
                                th = th;
                                objectOutputStream = objectOutputStream2;
                                com.meituan.android.mrn.utils.c.a("[MRNStorageManager@asyncWriteToDisk@run]", th);
                                com.meituan.android.mrn.utils.n.a(objectOutputStream);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            });
        } catch (Throwable th) {
            com.meituan.android.mrn.utils.c.a("mrn_storage_asyncWriteToDisk_error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41589e486d6b25500907e1cea6990dff", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41589e486d6b25500907e1cea6990dff");
        }
        Context context = this.b;
        return com.meituan.android.cipstorage.q.a(context, "mrn_default", f.a(this.b) + "bundle_list");
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3145934e11f37eaf676615a97bf1517a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3145934e11f37eaf676615a97bf1517a")).booleanValue();
        }
        com.meituan.android.cipstorage.q b = b(this.b);
        return b.b(com.meituan.android.mrn.utils.b.a(this.b) + com.meituan.android.mrn.utils.b.b(this.b) + "mrn_assets_init", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02cf A[Catch: all -> 0x04da, TryCatch #1 {Throwable -> 0x04dd, blocks: (B:6:0x001b, B:8:0x0037, B:10:0x0049, B:12:0x005d, B:16:0x007c, B:18:0x00a2, B:23:0x00c2, B:25:0x00e1, B:32:0x0105, B:33:0x0107, B:26:0x00ed, B:19:0x00ad, B:13:0x0064, B:15:0x0079, B:9:0x003b, B:34:0x0108, B:35:0x0120, B:37:0x0128, B:39:0x0153, B:42:0x0162, B:43:0x0166, B:45:0x016f, B:47:0x0190, B:49:0x0197, B:51:0x01ca, B:74:0x0296, B:78:0x02c7, B:80:0x02cf, B:82:0x02dc, B:84:0x02ec, B:88:0x031c, B:85:0x02f2, B:87:0x02fa, B:52:0x01df, B:54:0x01ec, B:56:0x0207, B:60:0x0220, B:62:0x0228, B:63:0x023c, B:65:0x0257, B:69:0x0278, B:66:0x0263, B:57:0x020f, B:59:0x021b, B:40:0x015c, B:89:0x0326, B:91:0x0338, B:93:0x033d, B:94:0x0347, B:96:0x0362, B:99:0x037f, B:101:0x03c9, B:102:0x03d3, B:121:0x0439, B:133:0x04aa, B:135:0x04cf, B:136:0x04d5, B:132:0x04a3, B:115:0x041c, B:137:0x04d8, B:97:0x036e), top: B:145:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ec A[Catch: all -> 0x04da, TryCatch #1 {Throwable -> 0x04dd, blocks: (B:6:0x001b, B:8:0x0037, B:10:0x0049, B:12:0x005d, B:16:0x007c, B:18:0x00a2, B:23:0x00c2, B:25:0x00e1, B:32:0x0105, B:33:0x0107, B:26:0x00ed, B:19:0x00ad, B:13:0x0064, B:15:0x0079, B:9:0x003b, B:34:0x0108, B:35:0x0120, B:37:0x0128, B:39:0x0153, B:42:0x0162, B:43:0x0166, B:45:0x016f, B:47:0x0190, B:49:0x0197, B:51:0x01ca, B:74:0x0296, B:78:0x02c7, B:80:0x02cf, B:82:0x02dc, B:84:0x02ec, B:88:0x031c, B:85:0x02f2, B:87:0x02fa, B:52:0x01df, B:54:0x01ec, B:56:0x0207, B:60:0x0220, B:62:0x0228, B:63:0x023c, B:65:0x0257, B:69:0x0278, B:66:0x0263, B:57:0x020f, B:59:0x021b, B:40:0x015c, B:89:0x0326, B:91:0x0338, B:93:0x033d, B:94:0x0347, B:96:0x0362, B:99:0x037f, B:101:0x03c9, B:102:0x03d3, B:121:0x0439, B:133:0x04aa, B:135:0x04cf, B:136:0x04d5, B:132:0x04a3, B:115:0x041c, B:137:0x04d8, B:97:0x036e), top: B:145:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2 A[Catch: all -> 0x04da, TryCatch #1 {Throwable -> 0x04dd, blocks: (B:6:0x001b, B:8:0x0037, B:10:0x0049, B:12:0x005d, B:16:0x007c, B:18:0x00a2, B:23:0x00c2, B:25:0x00e1, B:32:0x0105, B:33:0x0107, B:26:0x00ed, B:19:0x00ad, B:13:0x0064, B:15:0x0079, B:9:0x003b, B:34:0x0108, B:35:0x0120, B:37:0x0128, B:39:0x0153, B:42:0x0162, B:43:0x0166, B:45:0x016f, B:47:0x0190, B:49:0x0197, B:51:0x01ca, B:74:0x0296, B:78:0x02c7, B:80:0x02cf, B:82:0x02dc, B:84:0x02ec, B:88:0x031c, B:85:0x02f2, B:87:0x02fa, B:52:0x01df, B:54:0x01ec, B:56:0x0207, B:60:0x0220, B:62:0x0228, B:63:0x023c, B:65:0x0257, B:69:0x0278, B:66:0x0263, B:57:0x020f, B:59:0x021b, B:40:0x015c, B:89:0x0326, B:91:0x0338, B:93:0x033d, B:94:0x0347, B:96:0x0362, B:99:0x037f, B:101:0x03c9, B:102:0x03d3, B:121:0x0439, B:133:0x04aa, B:135:0x04cf, B:136:0x04d5, B:132:0x04a3, B:115:0x041c, B:137:0x04d8, B:97:0x036e), top: B:145:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.x.i():void");
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2de3753d309e92c091f90bd4b4deebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2de3753d309e92c091f90bd4b4deebd");
            return;
        }
        synchronized (this.c) {
            if (com.meituan.android.mrn.common.b.a(this.b).b("mrn_bundle_manage_bundle_info", (String) null) == null && this.d.size() > 0) {
                for (e eVar : this.d) {
                    g a2 = g.a(eVar);
                    a2.f = a2.e;
                    com.meituan.android.mrn.utils.collection.c<String, g> cVar = this.i;
                    cVar.put(eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f, a2);
                }
            }
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ef09a4257e1c7df995d379a7f49be9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ef09a4257e1c7df995d379a7f49be9");
            return;
        }
        Iterator<Map.Entry<String, g>> it = this.i.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            int lastIndexOf = key == null ? -1 : key.lastIndexOf(CommonConstant.Symbol.UNDERLINE);
            if (lastIndexOf >= 0) {
                String substring = key.substring(0, lastIndexOf);
                String substring2 = key.substring(lastIndexOf + 1);
                e eVar = new e();
                eVar.c = substring;
                eVar.f = substring2;
                synchronized (this.c) {
                    if (!this.d.contains(eVar)) {
                        it.remove();
                    }
                }
            }
        }
    }

    private void c(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9127ec56b18502f22794319a2ead200b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9127ec56b18502f22794319a2ead200b");
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && this.i.containsKey(str)) {
                this.i.remove(str);
            }
        }
    }

    public final void c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2f1c5af6a055f423621dc54adf474d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2f1c5af6a055f423621dc54adf474d4");
            return;
        }
        a(eVar, false, 0L);
        if (eVar.h != 1 || eVar.n == null || eVar.n.size() <= 0) {
            return;
        }
        for (e.a aVar : eVar.n) {
            e eVar2 = new e();
            eVar2.c = aVar.b;
            eVar2.f = aVar.c;
            a(eVar2, false, 0L);
        }
    }

    public final void a(e eVar, boolean z, long j) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c98229f148d897f96f5a6b1922227420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c98229f148d897f96f5a6b1922227420");
            return;
        }
        String str = eVar.c + CommonConstant.Symbol.UNDERLINE + eVar.f;
        if (this.i.containsKey(str)) {
            g gVar = this.i.get(str);
            if (gVar != null) {
                gVar.e = System.currentTimeMillis();
                if (z) {
                    gVar.g = j;
                    gVar.f = gVar.e;
                }
            }
            this.i.put(str, gVar);
            return;
        }
        g a2 = g.a(eVar);
        a2.e = System.currentTimeMillis();
        if (z) {
            a2.g = j;
            a2.f = a2.e;
        }
        this.i.put(str, a2);
    }

    public final com.meituan.android.cipstorage.q b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed4798544be9dbf1f16a53c50495eed0", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed4798544be9dbf1f16a53c50495eed0") : com.meituan.android.cipstorage.q.a(context, "mrn_cache", 0);
    }
}
