package com.dianping.picassocontroller.vc;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.dianping.jscore.Value;
import com.dianping.picassocontroller.jse.h;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e implements b {
    public static ChangeQuickRedirect a = null;
    private static final String m = "e";
    private static AtomicInteger p = new AtomicInteger();
    public final Handler b;
    public final Handler c;
    public String d;
    public com.dianping.picassocontroller.jse.c e;
    protected com.dianping.picassocontroller.monitor.d f;
    protected com.dianping.picassocontroller.monitor.a g;
    public a h;
    public String i;
    public final JSONObject j;
    public final JSONObject k;
    public f l;
    private Map<String, Object> n;
    private final WeakReference<Context> o;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    public e(@NonNull Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, boolean z, a aVar) {
        this(context, new f(str2, str, null), jSONObject, jSONObject2, z, aVar);
        Object[] objArr = {context, str, jSONObject, jSONObject2, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5beefe82ce70b6dde6a585e2b2802d5a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5beefe82ce70b6dde6a585e2b2802d5a");
        }
    }

    private e(@NonNull Context context, @NonNull f fVar, JSONObject jSONObject, JSONObject jSONObject2, boolean z, a aVar) {
        Object[] objArr = {context, fVar, jSONObject, jSONObject2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1da9b6fc2b4ee501c95d6068bcb2fdb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1da9b6fc2b4ee501c95d6068bcb2fdb");
            return;
        }
        this.n = new ConcurrentHashMap();
        this.e = null;
        this.i = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        if (context == null) {
            throw new RuntimeException("Context can not be null");
        }
        this.h = aVar;
        this.d = "host_" + p.getAndIncrement();
        com.dianping.picassocontroller.jse.f a2 = com.dianping.picassocontroller.jse.f.a(context);
        if (z) {
            this.e = a2.b();
        } else {
            this.e = com.dianping.picassocontroller.jse.f.a();
        }
        com.dianping.picassocontroller.jse.c cVar = this.e;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassocontroller.jse.c.a;
        this.g = PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "d029d3c8a21cfce4c6f88c961bc72430", RobustBitConfig.DEFAULT_VALUE) ? (com.dianping.picassocontroller.monitor.a) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "d029d3c8a21cfce4c6f88c961bc72430") : new com.dianping.picassocontroller.monitor.a(cVar.e);
        this.b = new Handler(this.e.b.getLooper());
        this.c = new Handler(context.getMainLooper());
        c.a(this, this.d);
        this.j = jSONObject;
        this.l = fVar;
        this.k = jSONObject2;
        this.o = new WeakReference<>(context);
        if (!TextUtils.isEmpty(fVar.a)) {
            this.i = fVar.a;
        }
        a(fVar.b, jSONObject2, jSONObject);
    }

    public final com.dianping.picassocontroller.monitor.f c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c1ec3b2943c2918a41eb341c309c635", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.picassocontroller.monitor.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c1ec3b2943c2918a41eb341c309c635");
        }
        if (this.g != null) {
            return this.g.d;
        }
        return null;
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1244dd42909d19ac7c8e27539f0f92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1244dd42909d19ac7c8e27539f0f92");
        } else {
            a("dispatchOnLoad", new Object[0]);
        }
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60549f3bbbd9d0ee74dd842f5a0b2244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60549f3bbbd9d0ee74dd842f5a0b2244");
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.b.removeCallbacksAndMessages(null);
        a("dispatchOnDestroy", new Object[0]);
        try {
            g();
            com.dianping.picassocontroller.jse.b.a(this);
            a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.e.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfe57adb1ddd7c9f6ec26b7d5e08fac6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfe57adb1ddd7c9f6ec26b7d5e08fac6");
                    } else {
                        c.a(e.this);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.picassocontroller.vc.b
    public final String a() {
        return this.d;
    }

    @NonNull
    public final com.dianping.picassocontroller.monitor.a f() {
        return this.g;
    }

    @Override // com.dianping.picassocontroller.vc.b
    public final Object a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534c0c4d473f2d3b4530190f23ef7b2c", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534c0c4d473f2d3b4530190f23ef7b2c");
        }
        String name = cls.getName();
        if (this.n.containsKey(name)) {
            return this.n.get(name);
        }
        try {
            Object newInstance = cls.newInstance();
            if (newInstance instanceof com.dianping.picassocontroller.module.a) {
                ((com.dianping.picassocontroller.module.a) newInstance).host = this;
                ((com.dianping.picassocontroller.module.a) newInstance).init();
            }
            this.n.put(name, newInstance);
            return newInstance;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1751c249207cf1b2dd9c8dc205701634", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1751c249207cf1b2dd9c8dc205701634");
        } else {
            a(this, new Runnable() { // from class: com.dianping.picassocontroller.vc.e.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7012809e39872268c8dcf2d1a10c3e9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7012809e39872268c8dcf2d1a10c3e9b");
                        return;
                    }
                    for (Object obj : e.this.n.values()) {
                        if (obj instanceof com.dianping.picassocontroller.module.a) {
                            ((com.dianping.picassocontroller.module.a) obj).destroy();
                        }
                    }
                    e.this.n.clear();
                }
            });
        }
    }

    @Override // com.dianping.picassocontroller.vc.b
    public final Context b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bd8a67fa84a620095dc55cdabe8778d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bd8a67fa84a620095dc55cdabe8778d");
        }
        if (this.o != null) {
            return this.o.get();
        }
        return null;
    }

    public final void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "6cfccb5d2ffec436808d5ea4cf474fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "6cfccb5d2ffec436808d5ea4cf474fec");
        } else {
            com.dianping.picassocontroller.jse.b.a(this, str, objArr);
        }
    }

    @WorkerThread
    public final Value b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "309425f5d4c3fd68d066a76e5f09059a", RobustBitConfig.DEFAULT_VALUE) ? (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "309425f5d4c3fd68d066a76e5f09059a") : com.dianping.picassocontroller.jse.b.b(this, str, objArr);
    }

    public void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        Object[] objArr = {str, jSONObject, jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18bd8e7149d022ff0a5df5edcd5a649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18bd8e7149d022ff0a5df5edcd5a649");
        } else {
            com.dianping.picassocontroller.jse.b.a(this, str, jSONObject, jSONObject2);
        }
    }

    @Deprecated
    public final void a(@NonNull Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c74908f259e58bf885096a06d44d810a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c74908f259e58bf885096a06d44d810a");
        } else {
            h.b(this.c, runnable);
        }
    }

    public final void a(@NonNull e eVar, @NonNull Runnable runnable) {
        Object[] objArr = {eVar, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1c67b600fba1c3dd17d9b6c046a520", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1c67b600fba1c3dd17d9b6c046a520");
        } else {
            h.a(eVar, runnable);
        }
    }

    public final com.dianping.picassocontroller.monitor.d h() {
        return this.f;
    }
}
