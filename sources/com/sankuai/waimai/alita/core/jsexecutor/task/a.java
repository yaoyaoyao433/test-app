package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.Value;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements Runnable {
    public static ChangeQuickRedirect a;
    g b;
    public h c;
    public com.sankuai.waimai.alita.core.jsexecutor.d d;
    public long e;
    public long f;
    public List<String> g;
    private com.sankuai.waimai.alita.core.engine.h h;
    private long i;
    private long j;
    private long k;
    private long l;

    public boolean e() {
        return false;
    }

    public abstract String f();

    public abstract Runnable g();

    public a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65ededac82be8b26b126a38ac1d833a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65ededac82be8b26b126a38ac1d833a");
            return;
        }
        this.c = h.STATUS_INIT;
        this.b = gVar;
        this.g = new ArrayList();
        this.h = gVar.h;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32fd5d1337ca1960a3f6fe5545f46e05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32fd5d1337ca1960a3f6fe5545f46e05");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.d(this.b.b + " | " + str);
        if (this.d == null || this.d.b() == null) {
            return;
        }
        this.d.b().execJS(str, this.b.b);
    }

    public final void a(String str, Value[] valueArr) {
        Object[] objArr = {str, valueArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e77e8cd9df24e3845d6eaa17df3d3ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e77e8cd9df24e3845d6eaa17df3d3ae");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.d(this.b.b + " | invokeMethod | " + str);
        if (this.d == null || this.d.b() == null) {
            return;
        }
        this.d.b().invokeMethod(this.b.b, str, valueArr);
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3323a1e0967f42fb45e7356682a3666f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3323a1e0967f42fb45e7356682a3666f") : this.b.b;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6be07622d7a0bb1f7597f27cae523eda", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6be07622d7a0bb1f7597f27cae523eda") : this.b.a();
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a10ed0268a97e673eb8600c7299e6c7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a10ed0268a97e673eb8600c7299e6c7") : this.b.b();
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b28c444018cd159c64a166beef74ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b28c444018cd159c64a166beef74ee6")).intValue();
        }
        g gVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        return PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "5e6644da1a74a90e09d5dce2ddd8fe7b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "5e6644da1a74a90e09d5dce2ddd8fe7b")).intValue() : gVar.d.d;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370ecff3d4d3ced8be8b3dc7346d2dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370ecff3d4d3ced8be8b3dc7346d2dc4");
            return;
        }
        try {
            i();
            Runnable g = g();
            if (g != null) {
                g.run();
                String a2 = this.b.a();
                List<JSONObject> list = this.b.e;
                String obj = list != null ? list.toString() : "";
                HashMap hashMap = new HashMap();
                hashMap.put("bundle_id", a2);
                hashMap.put("params", obj);
                com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "execute", (Map<String, Object>) hashMap);
            }
            if (e()) {
                return;
            }
            c("");
        } catch (Exception e) {
            a(e);
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835a0478c3affe68de7f98bed76fd377", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835a0478c3affe68de7f98bed76fd377");
            return;
        }
        this.i = System.currentTimeMillis();
        this.c = h.STATUS_PREPARE;
        d("STATUS_PREPARE");
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d805096dd55e5ee678f0be0b612462c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d805096dd55e5ee678f0be0b612462c1");
            return;
        }
        this.j = System.currentTimeMillis();
        this.c = h.STATUS_RUNNING;
        d("STATUS_RUNNING");
    }

    public void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f219757ee6324b1caf88553d8eeeeacb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f219757ee6324b1caf88553d8eeeeacb");
            return;
        }
        try {
            this.k = System.currentTimeMillis();
            this.c = h.STATUS_RESULT;
            d("STATUS_RESULT");
        } catch (Exception e) {
            a(e);
        }
    }

    public void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee6c22cd1470fb956827fc7cd6d5911e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee6c22cd1470fb956827fc7cd6d5911e");
            return;
        }
        this.l = System.currentTimeMillis();
        this.c = h.STATUS_END;
        d("STATUS_END | 正常");
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2e6cffeb3fab15674f0dd907190ba88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2e6cffeb3fab15674f0dd907190ba88");
        } else if (this.b.h != null && this.d != null) {
            com.sankuai.waimai.alita.core.jsexecutor.d dVar = this.d;
            com.sankuai.waimai.alita.core.engine.h hVar = this.b.h;
            String str2 = this.b.b;
            AlitaJSValue alitaJSValue = new AlitaJSValue(str);
            Object[] objArr3 = {hVar, str2, alitaJSValue};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.jsexecutor.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "6063be3c589a0c7281867ccb30ec57d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "6063be3c589a0c7281867ccb30ec57d0");
            } else {
                dVar.e.a(hVar, str2, alitaJSValue);
            }
        }
        j();
        String a2 = this.b.a();
        HashMap hashMap = new HashMap();
        hashMap.put("bundle_id", a2);
        hashMap.put("result", str);
        com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "end", (Map<String, Object>) hashMap);
    }

    public void a(Exception exc) {
        String message;
        String str;
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9569f95c4fca78717f10020a5ee33fce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9569f95c4fca78717f10020a5ee33fce");
            return;
        }
        this.l = System.currentTimeMillis();
        this.c = h.STATUS_END;
        d("STATUS_END | 异常");
        if (exc instanceof JSRuntimeException) {
            message = exc.getMessage();
            str = exc.getMessage();
        } else {
            message = exc.getMessage();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                exc.printStackTrace(new PrintStream(byteArrayOutputStream));
                str = new String(byteArrayOutputStream.toByteArray());
            } catch (Exception unused) {
                str = "";
            }
        }
        AlitaMonitorCenter.getCenter().getMonitor().jsExceptionLogBuilder(b(), 2).bundleVersion(c()).message(message).content(str).commit();
        Object[] objArr2 = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68893c2287b4d4a18ee8bb9b73e7a821", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68893c2287b4d4a18ee8bb9b73e7a821");
        } else if (this.b.h != null && this.d != null) {
            com.sankuai.waimai.alita.core.jsexecutor.d dVar = this.d;
            com.sankuai.waimai.alita.core.engine.h hVar = this.b.h;
            Object[] objArr3 = {hVar, exc};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.alita.core.jsexecutor.d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "81bc11ecff78679ed73dd2ed87c16e09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "81bc11ecff78679ed73dd2ed87c16e09");
            } else {
                dVar.e.a(hVar, exc);
            }
        }
        j();
        HashMap hashMap = new HashMap();
        hashMap.put("value", exc.getMessage());
        com.sankuai.waimai.alita.core.utils.c.a("alita_js", (String) null, LogMonitor.EXCEPTION_TAG, (HashMap<String, Object>) hashMap);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e588f481d723b0f265036693efe1d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e588f481d723b0f265036693efe1d52");
        } else if (this.d != null) {
            this.d.a(this);
        }
    }

    public void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d0465ba403fa513a9b98c316772e53a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d0465ba403fa513a9b98c316772e53a");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.e(a() + " | [切换任务状态] " + str + " | Record: " + this.e + " | 任务类型: " + f());
    }
}
