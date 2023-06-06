package com.meituan.android.mrn.codecache;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.mrn.config.t;
import com.meituan.android.mrn.utils.ab;
import com.meituan.android.mrn.utils.k;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect a;
    static final Comparator<com.meituan.android.mrn.monitor.a> b = new Comparator<com.meituan.android.mrn.monitor.a>() { // from class: com.meituan.android.mrn.codecache.c.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.meituan.android.mrn.monitor.a aVar, com.meituan.android.mrn.monitor.a aVar2) {
            com.meituan.android.mrn.monitor.a aVar3 = aVar;
            com.meituan.android.mrn.monitor.a aVar4 = aVar2;
            Object[] objArr = {aVar3, aVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbadb957639138e1dbb007e5375c1e5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbadb957639138e1dbb007e5375c1e5")).intValue() : (int) (aVar4.b - aVar3.b);
        }
    };
    private static c e;
    public final Map<String, d> c;
    final f d;
    private final Context f;
    private final com.meituan.android.mrn.utils.worker.e g;

    public static c a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5954463f5239c256d6a415f529946695", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5954463f5239c256d6a415f529946695");
        }
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (e == null) {
            synchronized (c.class) {
                if (e == null) {
                    e = new c(context);
                }
            }
        }
        return e;
    }

    public static synchronized c a() {
        synchronized (c.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53e5edb62e1c0ca4120b3e896e559c47", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53e5edb62e1c0ca4120b3e896e559c47");
            } else if (e == null) {
                throw new IllegalStateException("createInstance() needs to be called before getInstance()");
            } else {
                return e;
            }
        }
    }

    private c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f52d3157f3bea472d8ac07942424087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f52d3157f3bea472d8ac07942424087");
            return;
        }
        this.c = new ConcurrentHashMap();
        this.f = context;
        this.d = new f(context);
        this.g = new com.meituan.android.mrn.utils.worker.b("MRNCodeCacheWorker");
        this.g.a(new a(this), b.b.a() * 1000);
    }

    public final File a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9c31f44189b2b30be7e0a81b3f8bcea", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9c31f44189b2b30be7e0a81b3f8bcea") : new File(b(str), "index.js.cache").getAbsoluteFile();
    }

    public final File b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36c39b2ca0e854e932b8dd94c5084561", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36c39b2ca0e854e932b8dd94c5084561") : new File(b(), str);
    }

    private File b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aea0eef292fd290522312d42449c9c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aea0eef292fd290522312d42449c9c1");
        }
        Context context = this.f;
        return q.a(context, "mrn_cache", com.meituan.android.mrn.engine.f.a(this.f) + "code_cache");
    }

    public final boolean c(String str) {
        Collection<e> collection;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2882961dd7a70324a8453d6df25b4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2882961dd7a70324a8453d6df25b4c")).booleanValue();
        }
        f fVar = this.d;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "81f559aaf164a6f40ec9ada706c2a768", RobustBitConfig.DEFAULT_VALUE)) {
            collection = (Collection) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "81f559aaf164a6f40ec9ada706c2a768");
        } else {
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                for (e eVar : fVar.b.values()) {
                    if (str.equals(eVar.b)) {
                        arrayList.add(eVar);
                    }
                }
            }
            collection = arrayList;
        }
        if (collection.isEmpty()) {
            return false;
        }
        for (e eVar2 : collection) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (d(PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "7f333068dab614affea8c628ad47ad13", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "7f333068dab614affea8c628ad47ad13") : com.meituan.android.mrn.engine.e.a(eVar2.b, eVar2.c))) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aeb3d44e59238b8c24df839cbc20b4b8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aeb3d44e59238b8c24df839cbc20b4b8")).booleanValue();
        }
        File a2 = a(str);
        return a2 != null && a2.exists();
    }

    private boolean a(com.meituan.android.mrn.engine.e eVar, boolean z) {
        boolean z2;
        long l;
        Object[] objArr = {eVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf27088b098f316d8ead40a544d77887", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf27088b098f316d8ead40a544d77887")).booleanValue();
        }
        if (eVar == null) {
            return false;
        }
        String str = eVar.c;
        com.facebook.common.logging.a.b("[CodeCacheManager@canCreateCodeCache]", str);
        if (!b.b.a(str)) {
            this.c.put(eVar.i(), d.DISABLED);
            return false;
        }
        Object[] objArr2 = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45f2a1e49fa150c8c729fed35758c4cb", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45f2a1e49fa150c8c729fed35758c4cb")).booleanValue();
        } else {
            File h = eVar.h();
            if (h != null && h.exists()) {
                com.meituan.android.mrn.config.c.a();
            }
            File a2 = a(eVar.i());
            z2 = a2 != null && a2.exists();
        }
        if (z2) {
            com.facebook.common.logging.a.b("[CodeCacheManager@canCreateCodeCache]", "existed: " + str);
            this.c.put(eVar.i(), d.EXISTED);
            return false;
        }
        Object[] objArr3 = {eVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b5b8d78e2d777c8a4142d2766c18edc4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b5b8d78e2d777c8a4142d2766c18edc4")).booleanValue();
        }
        b bVar = b.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b.a;
        int intValue = (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e325a124f69955b6465b0e73a22b89ea", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e325a124f69955b6465b0e73a22b89ea")).intValue() : ((Integer) t.b.a("CodeCache.minJSFileSize")).intValue()) * 1024;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.meituan.android.mrn.engine.e.a;
        if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "958b3f60edb354f514a3c4758ccac9e5", RobustBitConfig.DEFAULT_VALUE)) {
            l = ((Long) PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "958b3f60edb354f514a3c4758ccac9e5")).longValue();
        } else {
            Object[] objArr6 = {"index.js"};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.android.mrn.engine.e.a;
            if (PatchProxy.isSupport(objArr6, eVar, changeQuickRedirect6, false, "6ed8655fb353aed3a673fca65eb9febb", RobustBitConfig.DEFAULT_VALUE)) {
                l = ((Long) PatchProxy.accessDispatch(objArr6, eVar, changeQuickRedirect6, false, "6ed8655fb353aed3a673fca65eb9febb")).longValue();
            } else {
                l = TextUtils.isEmpty("index.js") ? -1L : eVar.b("index.js").l();
            }
        }
        if (l < intValue) {
            this.c.put(eVar.i(), d.JS_FILE_SIZE_NOT_MEET);
            return false;
        }
        DioFile b2 = eVar.b("index.js");
        if (ab.a(b2) && ab.b(b2) < intValue) {
            this.c.put(eVar.i(), d.JS_FILE_SIZE_NOT_MEET);
            return false;
        }
        this.c.put(eVar.i(), d.WAITING_TO_CREATE);
        return true;
    }

    public final boolean a(com.meituan.android.mrn.engine.e eVar, File file) {
        Object[] objArr = {eVar, file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8234246e8ca81e8fd821789fdf8464ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8234246e8ca81e8fd821789fdf8464ad")).booleanValue();
        }
        if (file == null || !file.exists()) {
            return false;
        }
        if (b.b.a(eVar.c)) {
            return true;
        }
        a(eVar.c, eVar.f, 1);
        return false;
    }

    public final void a(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7119d3c359127e1e683116d2c5236c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7119d3c359127e1e683116d2c5236c1d");
        } else {
            a(eVar, b.b.a() * 1000);
        }
    }

    public final void a(com.meituan.android.mrn.engine.e eVar, int i) {
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84914c900d83af46df9344c23b4cfef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84914c900d83af46df9344c23b4cfef3");
        } else if (a(eVar, true)) {
            com.facebook.common.logging.a.b("[CodeCacheManager@addCreateCodeCacheTask]", eVar.c + StringUtil.SPACE + eVar.f + StringUtil.SPACE + i);
            this.g.a(new g(this, eVar), (long) i);
        }
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca874c53247fdde9dd9f4fce74f35d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca874c53247fdde9dd9f4fce74f35d9");
            return;
        }
        com.facebook.common.logging.a.b("[CodeCacheManager@removeCodeCache]", str + StringUtil.SPACE + str2 + StringUtil.SPACE + i);
        if (i == 0 || i == 1) {
            com.meituan.android.mrn.monitor.g.a().a("bundle_name", str).a("bundle_version", str2).a("reason", String.valueOf(i)).b("MRNCodeCacheRemove", 1.0f);
        }
        String a2 = com.meituan.android.mrn.engine.e.a(str, str2);
        k.a(b(a2));
        this.d.a(a2);
    }
}
