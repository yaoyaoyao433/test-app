package com.sankuai.xm.login;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.component.anno.Component;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Component
/* loaded from: classes6.dex */
public class a implements com.sankuai.xm.base.component.a, com.sankuai.xm.base.component.d {
    public static ChangeQuickRedirect a;
    private static volatile a m;
    public long b;
    public String c;
    public short d;
    public HashMap<Short, Integer> e;
    private com.sankuai.xm.base.component.e f;
    private String g;
    private int h;
    private String i;
    private String j;
    private String k;
    private String l;
    private final ConcurrentHashMap<String, Object> n;
    private final Object o;

    @Override // com.sankuai.xm.base.component.d
    public final <T> T a(String str, Class<T> cls, com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {str, cls, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0af1f6ba04fe7dbb408ecea1888a89aa", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0af1f6ba04fe7dbb408ecea1888a89aa");
        }
        com.sankuai.xm.base.a aVar = ("mAuthInfo".equals(str) && cls == com.sankuai.xm.base.a.class) ? new com.sankuai.xm.base.a() : null;
        if (aVar instanceof com.sankuai.xm.base.component.a) {
            ((com.sankuai.xm.base.component.a) aVar).a(bVar);
        }
        if (cls.isInstance(aVar)) {
            return cls.cast(aVar);
        }
        return null;
    }

    public final com.sankuai.xm.base.component.e s() {
        if (this.f == null) {
            synchronized (this.o) {
                if (this.f == null) {
                    this.f = new com.sankuai.xm.base.component.e(com.sankuai.xm.base.a.class, "mAuthInfo", this);
                }
            }
        }
        return this.f;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6e3988f016b0e90de4fd8c753f6921e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6e3988f016b0e90de4fd8c753f6921e");
            return;
        }
        this.n = new ConcurrentHashMap<>();
        this.o = new Object();
        this.b = 0L;
        this.g = null;
        this.h = -1;
        this.c = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.d = (short) 0;
        this.e = new HashMap<>();
        this.f = null;
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4416e3f4aff108432a85e95a0bc38c6", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4416e3f4aff108432a85e95a0bc38c6");
        }
        if (m == null) {
            synchronized (a.class) {
                if (m == null) {
                    m = new a();
                }
            }
        }
        return m;
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552e03504d01259243b33076979c0d3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552e03504d01259243b33076979c0d3a");
            return;
        }
        d.a("AccountManager::uInfoReset");
        c(0L);
        this.h = -1;
        this.g = null;
        ((com.sankuai.xm.base.a) s().a()).b();
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff531f42968952076aaa02d8bd2f95a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff531f42968952076aaa02d8bd2f95a3");
            return;
        }
        com.sankuai.xm.base.service.f b = m.b();
        b.a("xm_sdk_thirdUserId");
        b.a("xm_sdk_uid");
        b.a("xm_sdk_alToken_" + j);
    }

    public final com.sankuai.xm.base.a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f09ed33aa9f88491217b3deeefa8e405", 6917529027641081856L) ? (com.sankuai.xm.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f09ed33aa9f88491217b3deeefa8e405") : (com.sankuai.xm.base.a) s().a();
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c1bca37de6542944ee054bd142982fd", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c1bca37de6542944ee054bd142982fd")).booleanValue() : ((com.sankuai.xm.base.a) s().a()).c;
    }

    private void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6275a2def7ae23464dcc0c62b53a0f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6275a2def7ae23464dcc0c62b53a0f9");
        } else {
            ((com.sankuai.xm.base.a) s().a()).c = true;
        }
    }

    public final long e() {
        return this.b;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0e4df44d02bab13d2c589ff6012678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0e4df44d02bab13d2c589ff6012678");
            return;
        }
        if (j == 0) {
            ((com.sankuai.xm.base.a) s().a()).b();
        } else if (this.b != 0 && j != this.b) {
            ((com.sankuai.xm.base.a) s().a()).b();
        }
        a(true);
        c(j);
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1849a21b0f92f35cfae918d1f08831e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1849a21b0f92f35cfae918d1f08831e");
            return;
        }
        if (j == 0) {
            ((com.sankuai.xm.base.a) s().a()).b();
        } else if (this.b != 0 && j != this.b) {
            ((com.sankuai.xm.base.a) s().a()).b();
        }
        m.a(this.b, j);
        this.b = j;
        ((com.sankuai.xm.base.a) s().a()).a(j);
        e(j);
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9a89929b3b83fec5672d94e5bd94cc2", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9a89929b3b83fec5672d94e5bd94cc2") : ((com.sankuai.xm.base.a) s().a()).g;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4aa0e9388bbcbb61fdb9ad41166c4b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4aa0e9388bbcbb61fdb9ad41166c4b5");
        } else if (ac.a(str)) {
        } else {
            a(q(), str);
            ((com.sankuai.xm.base.a) s().a()).g = str;
        }
    }

    public final String g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a50abc93f25a9e77259e47b7e771b860", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a50abc93f25a9e77259e47b7e771b860");
        }
        if (this.b <= 0) {
            return null;
        }
        if (ac.a(this.g)) {
            try {
                com.sankuai.xm.base.service.f b = m.b();
                this.g = new String(m.a().a(b.getString("login_xm_my_nick_" + this.b, "")));
            } catch (Throwable th) {
                d.a(th);
            }
        }
        return !ac.a(this.g) ? this.g : "";
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f351921acbc9ba388ea5d216073eb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f351921acbc9ba388ea5d216073eb7");
        } else if (this.b <= 0) {
        } else {
            com.sankuai.xm.base.service.f b = m.b();
            b.a("login_my_nick_" + this.b);
            if (ac.a(str)) {
                return;
            }
            this.g = str;
            try {
                String a2 = m.a().a(str.getBytes());
                b.a("login_xm_my_nick_" + this.b, a2);
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public final String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01436ad28682aa45a25639e9682bbed", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01436ad28682aa45a25639e9682bbed") : ((com.sankuai.xm.base.a) s().a()).d;
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47476a045f9811438d5b261ab633fae9", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47476a045f9811438d5b261ab633fae9") : ((com.sankuai.xm.base.a) s().a()).f;
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e70bedb1176a3994f86fa4735ada8b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e70bedb1176a3994f86fa4735ada8b");
        } else {
            ((com.sankuai.xm.base.a) s().a()).f = str;
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1093ece9e49ce85c4bc2a764f2fd14b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1093ece9e49ce85c4bc2a764f2fd14b8");
            return;
        }
        this.c = str;
        com.sankuai.xm.base.f.m().h = str;
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce9858966c05828c7d42689dff9ba4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce9858966c05828c7d42689dff9ba4f");
            return;
        }
        this.j = str;
        com.sankuai.xm.base.f.m().i = str;
    }

    public final String j() {
        return this.j == null ? "" : this.j;
    }

    public final void f(String str) {
        this.i = str;
    }

    public final String k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b9945195152056acc04bcf39b9c6e65", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b9945195152056acc04bcf39b9c6e65");
        }
        if (ac.a(this.i)) {
            this.i = m.a().b();
        }
        return this.i;
    }

    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80c3a8342242649021d8518b60247609", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80c3a8342242649021d8518b60247609");
        }
        if (ac.a(this.l)) {
            this.l = m.a().g();
        }
        return this.l;
    }

    public final short m() {
        return this.d;
    }

    public final int a(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fec25e4568151d475e72c8131e1d778a", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fec25e4568151d475e72c8131e1d778a")).intValue();
        }
        synchronized (this) {
            if (this.e == null || !this.e.containsKey(Short.valueOf(s))) {
                return -1;
            }
            return this.e.get(Short.valueOf(s)).intValue();
        }
    }

    public final String n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2204ae08e0d84d0ba68420700fc2554", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2204ae08e0d84d0ba68420700fc2554");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", k());
            return jSONObject.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a7bce8606eb35060b3b0dda301f425", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a7bce8606eb35060b3b0dda301f425") : ((com.sankuai.xm.base.a) s().a()).i;
    }

    public final boolean p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8749f7a18d9f51f9f4cb8c1669f00906", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8749f7a18d9f51f9f4cb8c1669f00906")).booleanValue();
        }
        d.a("isDeviceChange:" + k() + "/" + ((com.sankuai.xm.base.a) s().a()).h);
        return !ac.a(k(), ((com.sankuai.xm.base.a) s().a()).h);
    }

    public final long q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "230770db0f78f279fa1a5d174ecd77a5", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "230770db0f78f279fa1a5d174ecd77a5")).longValue();
        }
        long j = this.b;
        if (j != 0) {
            return j;
        }
        long j2 = com.sankuai.xm.base.f.m().b;
        if (j2 != 0) {
            return j2;
        }
        long j3 = m.b().getLong("xm_sdk_uid", 0L);
        return j3 != 0 ? j3 : h(r());
    }

    private long h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64c1fba89d8e467d4656df5630ed38df", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64c1fba89d8e467d4656df5630ed38df")).longValue();
        }
        if (ac.a(str)) {
            return 0L;
        }
        com.sankuai.xm.base.service.f b = m.b();
        return b.getLong("xm_sdk_thirdUserId_" + str, 0L);
    }

    public final String r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8761306b5b1dfefcc8794f2caacee054", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8761306b5b1dfefcc8794f2caacee054");
        }
        if (ac.a(((com.sankuai.xm.base.a) s().a()).d)) {
            return m.b().getString("xm_sdk_thirdUserId", "");
        }
        return ((com.sankuai.xm.base.a) s().a()).d;
    }

    public final void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eed69e8368ece0d13824fdc6089335b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eed69e8368ece0d13824fdc6089335b");
        } else if (ac.a(str)) {
        } else {
            m.b().a("xm_sdk_thirdUserId", str);
        }
    }

    public final String d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "846b02014ea153ad5e8795fbd2dac657", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "846b02014ea153ad5e8795fbd2dac657");
        }
        if (((com.sankuai.xm.base.a) s().a()).b == j && !ac.a(((com.sankuai.xm.base.a) s().a()).g)) {
            d.a("getCacheAlToken: al Token: %s", ((com.sankuai.xm.base.a) s().a()).g);
            return ((com.sankuai.xm.base.a) s().a()).g;
        }
        com.sankuai.xm.base.service.f b = m.b();
        String string = b.getString("xm_sdk_alToken_" + j, "");
        if (ac.a(string)) {
            return string;
        }
        String str = new String(m.a().a(string));
        d.a("getCacheAlToken: al Token cache: %s", str);
        return str;
    }

    public void a(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf67b4bc5e9b01a00f94beaa9a9cab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf67b4bc5e9b01a00f94beaa9a9cab5");
        } else if (j == 0 || ac.a(str)) {
        } else {
            com.sankuai.xm.base.service.f b = m.b();
            b.a("xm_sdk_alToken_" + j, m.a().a(str.getBytes()));
        }
    }

    public final void e(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e67e51253267e5c8c60ef62400889a87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e67e51253267e5c8c60ef62400889a87");
        } else if (j == 0 || d()) {
        } else {
            m.b().a("xm_sdk_uid", j);
        }
    }

    @Override // com.sankuai.xm.base.component.a
    public final void a(com.sankuai.xm.base.component.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4db7547d7a439320f7fde3b4d7721c6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4db7547d7a439320f7fde3b4d7721c6a");
        } else if (bVar != null) {
            s().b = bVar;
        }
    }
}
