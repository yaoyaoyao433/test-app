package com.meituan.android.mrn.engine;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.views.text.f;
import com.meituan.android.mrn.update.h;
import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;
    protected static com.meituan.dio.easy.a b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public String i;
    public String j;
    public String k;
    public long l;
    public String m;
    public List<a> n;
    public String o;
    public boolean p;
    public String q;
    public String r;
    private Map<String, String> s;

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3362e05159c85ac724485987ec9b4490", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3362e05159c85ac724485987ec9b4490");
        } else {
            this.n = new ArrayList(3);
        }
    }

    public static synchronized void a(Context context) {
        synchronized (e.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c2876a3aeb1675f8d564db61b894efa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c2876a3aeb1675f8d564db61b894efa");
            } else if (b != null) {
            } else {
                b = new com.meituan.dio.easy.a(com.meituan.android.cipstorage.q.a(context, "mrn_default", "dio_cache", com.meituan.android.cipstorage.u.b));
            }
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b2113d854fbf646bb1afc3e5cb347b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b2113d854fbf646bb1afc3e5cb347b");
            return;
        }
        com.meituan.android.mrn.utils.p.a("[MRNBundle@install]", this, Boolean.valueOf(z));
        m();
        if (z) {
            return;
        }
        k();
        l();
    }

    @Deprecated
    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79c2ed90ea8f4c050cc93b1f9fa8b1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79c2ed90ea8f4c050cc93b1f9fa8b1f9");
            return;
        }
        com.meituan.android.mrn.config.c.a();
        com.meituan.android.mrn.utils.p.a("[MRNBundle@createCodeCache]", this, "不在白名单内");
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcad13c886775aa3f3f97d602bab435c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcad13c886775aa3f3f97d602bab435c");
        } else if (com.meituan.android.mrn.codecache.c.a().c(this.c)) {
            com.meituan.android.mrn.codecache.c.a().a(this);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7751fdc151de74dd2031f19da0957fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7751fdc151de74dd2031f19da0957fc");
        } else if (this.s != null) {
            com.meituan.android.mrn.utils.p.a("[MRNBundle@cacheFontFiles]", this);
            for (Map.Entry<String, String> entry : this.s.entrySet()) {
                if (entry.getValue() != null) {
                    c(com.meituan.android.mrn.utils.l.a(entry.getValue()));
                }
            }
        }
    }

    private File c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "502887d03bed4224f24e83d8e28409b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "502887d03bed4224f24e83d8e28409b9");
        }
        if (b != null) {
            return b.a(new DioFile(this.m, str));
        }
        return null;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4311fafbf14f2f482f03ae1e6d9f339a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4311fafbf14f2f482f03ae1e6d9f339a");
        } else if (this.s != null) {
            for (Map.Entry<String, String> entry : this.s.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    File c = c(com.meituan.android.mrn.utils.l.a(entry.getValue()));
                    Object[] objArr2 = {key, c};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.mrn.utils.l.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "011bc31977316d5d629e2c03b0b6b751", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "011bc31977316d5d629e2c03b0b6b751");
                    } else if (!TextUtils.isEmpty(key) && c != null && c.isFile() && c.exists() && c.canRead()) {
                        com.meituan.android.mrn.utils.p.a("[FontsUtils@registerFont]", String.format("fontName: %s fontPath: %s", key, c.getAbsolutePath()));
                        try {
                            Typeface createFromFile = Typeface.createFromFile(c);
                            com.facebook.react.views.text.f a2 = com.facebook.react.views.text.f.a();
                            if (a2 != null) {
                                int style = createFromFile.getStyle();
                                if (createFromFile != null) {
                                    f.a aVar = a2.a.get(key);
                                    if (aVar == null) {
                                        aVar = new f.a();
                                        a2.a.put(key, aVar);
                                    }
                                    aVar.a(style, createFromFile);
                                }
                            }
                        } catch (Throwable th) {
                            com.meituan.android.mrn.utils.p.a("[FontsUtils@registerFont]", th, new Object[0]);
                        }
                    }
                }
            }
        }
    }

    public final InputStream a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f3aceedb0fb2061b126fdbd0936b8c", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f3aceedb0fb2061b126fdbd0936b8c");
        }
        try {
            return b(str).b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final DioFile b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "357a4d2fc7de17ce5a8c6b0d5045f681", RobustBitConfig.DEFAULT_VALUE) ? (DioFile) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "357a4d2fc7de17ce5a8c6b0d5045f681") : new DioFile(this.m, str);
    }

    public final InputStream c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f083837cdc790acd411c08c38d19e9a9", RobustBitConfig.DEFAULT_VALUE) ? (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f083837cdc790acd411c08c38d19e9a9") : a("index.js");
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ea9132505f098a8990f84b7d031041", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ea9132505f098a8990f84b7d031041")).booleanValue();
        }
        if (TextUtils.isEmpty("index.js")) {
            return false;
        }
        return b("index.js").k();
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdd48739ed2bd9b0c81eb75853d9923", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdd48739ed2bd9b0c81eb75853d9923") : d("index.js");
    }

    public final JSBundleLoader f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70680d487c39b991a55b8c35e34fc936", RobustBitConfig.DEFAULT_VALUE) ? (JSBundleLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70680d487c39b991a55b8c35e34fc936") : a((Runnable) null);
    }

    public final JSBundleLoader a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cebb4f2216f1c6057ff2297119f69228", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSBundleLoader) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cebb4f2216f1c6057ff2297119f69228");
        }
        File h = h();
        if (h != null && h.exists()) {
            com.meituan.android.mrn.config.c.a();
        }
        File a2 = com.meituan.android.mrn.codecache.c.a().a(i());
        if (com.meituan.android.mrn.codecache.c.a().a(this, a2)) {
            com.facebook.common.logging.a.b("[MRNBundle@getJSBundleLoader]", "exists codecache 2");
            return q.a(this.m, "index.js", e(), a2.toString(), new t(this), false, runnable);
        }
        com.facebook.common.logging.a.b("[MRNBundle@getJSBundleLoader]", "no codecache");
        return q.a(this.m, "index.js", e(), false, runnable);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "998be61ea73989c32d9f69d820b17786", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "998be61ea73989c32d9f69d820b17786")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.c == null ? eVar.c == null : this.c.equals(eVar.c)) {
            return this.f != null ? this.f.equals(eVar.f) : eVar.f == null;
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9774348b056b36b45898cb5d720cf94", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9774348b056b36b45898cb5d720cf94")).intValue();
        }
        return ((this.c != null ? this.c.hashCode() : 0) * 31) + (this.f != null ? this.f.hashCode() : 0);
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "598da2a3b2ad722e54b1ee60a5c41c3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "598da2a3b2ad722e54b1ee60a5c41c3f")).booleanValue();
        }
        if (com.meituan.android.mrn.debug.a.a() || !com.meituan.android.mrn.debug.a.c()) {
            com.meituan.android.mrn.debug.interfaces.b.a();
            return false;
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ad579abb1797bd5576f78c5e81e5034", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ad579abb1797bd5576f78c5e81e5034");
        }
        return "MRNBundle{name='" + this.c + "', version='" + this.f + "', location='" + e() + "'}";
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        public String b;
        public String c;

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d202cf54caa4d8601026422223f7e9c8", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d202cf54caa4d8601026422223f7e9c8")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == null ? aVar.b == null : this.b.equals(aVar.b)) {
                return this.c != null ? this.c.equals(aVar.c) : aVar.c == null;
            }
            return false;
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f17398cc559e7c6e3fc9e87afa699555", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f17398cc559e7c6e3fc9e87afa699555")).intValue();
            }
            return ((this.b != null ? this.b.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0084 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.meituan.android.mrn.engine.e a(java.io.File r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mrn.engine.e.a(java.io.File):com.meituan.android.mrn.engine.e");
    }

    @Deprecated
    public final File h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1538c1f49b7e3363f90136f2ad27ee43", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1538c1f49b7e3363f90136f2ad27ee43") : new File(n(), "code.cache").getAbsoluteFile();
    }

    private File n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0692135c4c8ec85b7dff8c791fdacb67", RobustBitConfig.DEFAULT_VALUE) ? (File) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0692135c4c8ec85b7dff8c791fdacb67") : x.a(com.meituan.android.mrn.common.a.a()).c(this.c, this.f);
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7df48d3c918675c05d4f60e747146fb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7df48d3c918675c05d4f60e747146fb") : a(this.c, this.f);
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2ea35023d0f91b4b2a4032c240c8f07", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2ea35023d0f91b4b2a4032c240c8f07");
        }
        return str + CommonConstant.Symbol.UNDERLINE + str2;
    }

    public static e a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fbafbff19207f6aeb139b1e77f2a58a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fbafbff19207f6aeb139b1e77f2a58a5");
        }
        e eVar = new e();
        eVar.c = str;
        eVar.f = str2;
        eVar.q = str3;
        eVar.r = str4;
        return eVar;
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9e7609fd2c59bfe6674722a3ba00d99", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9e7609fd2c59bfe6674722a3ba00d99")).booleanValue() : !TextUtils.isEmpty(this.q);
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53f22dd46566d62d932e1fd1ce593da2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53f22dd46566d62d932e1fd1ce593da2")).booleanValue();
        }
        MRNBundleManager.deleteBundleFile(this.m);
        if (j()) {
            File file = new File(this.q);
            if (file.exists()) {
                com.meituan.android.mrn.utils.k.b(file);
            }
        } else {
            com.meituan.dio.easy.a aVar = b;
            File file2 = new File(this.m);
            Object[] objArr2 = {file2};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.dio.easy.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a50c282da315da8322dce22c45f85f1d", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a50c282da315da8322dce22c45f85f1d")).booleanValue();
            } else {
                com.meituan.dio.utils.b.a(aVar.a(file2));
            }
        }
        try {
            com.meituan.android.mrn.update.k a2 = com.meituan.android.mrn.update.k.a();
            String str = this.c;
            String str2 = this.f;
            Object[] objArr3 = {str, str2};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.mrn.update.k.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "6ae3db806d8213a62c3506c28363273c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "6ae3db806d8213a62c3506c28363273c");
            } else if (a2.f != null) {
                h.a aVar2 = a2.f;
                Object[] objArr4 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect4 = h.a.a;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "8931b568e35c1d5025697ebd921842a3", RobustBitConfig.DEFAULT_VALUE)) {
                    com.meituan.android.mrn.update.h hVar = (com.meituan.android.mrn.update.h) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "8931b568e35c1d5025697ebd921842a3");
                } else {
                    aVar2.b.remove(h.a.a(str, str2));
                }
            }
        } catch (Throwable unused) {
        }
        com.meituan.android.mrn.utils.k.c(n());
        com.meituan.android.mrn.codecache.c.a().a(this.c, this.f, 3);
        return true;
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bb159a7e53ee001cbff90a135c5562e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bb159a7e53ee001cbff90a135c5562e") : com.meituan.dio.utils.e.a(this.m, str);
    }
}
