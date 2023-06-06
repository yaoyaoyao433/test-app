package com.meituan.itc.android.mtnn;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.knbbridge.PredictMLModelJsHandler;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static String d = "-1";
    private static g e;
    protected String b;
    protected float c;
    private long f;
    private e g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a = c.FORWARD_CPU.g;
        public int b = 1;
        public String[] c = null;
        public int d = h.PRECISION_NORMAL.e;
    }

    public static void a(int i, Context context) {
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b8e90c2e5867f0b922fd03ae361d20a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b8e90c2e5867f0b922fd03ae361d20a");
        } else if (e == null) {
            d = Integer.toString(i);
            Object[] objArr2 = {427, context};
            ChangeQuickRedirect changeQuickRedirect2 = g.a;
            e = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e9cbd03dff679894aeeb969af9261ef2", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e9cbd03dff679894aeeb969af9261ef2") : new g(427, context);
        }
    }

    public static d a(String str, a aVar) throws Exception {
        long nativeCreateNetFromFile;
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a87bf9e4ac46114e26a97f1698da488", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a87bf9e4ac46114e26a97f1698da488");
        }
        long nanoTime = System.nanoTime();
        if (str.endsWith(".mtnn")) {
            nativeCreateNetFromFile = MTNNNetNative.nativeCreateNetFromMtnnFile(str);
        } else {
            nativeCreateNetFromFile = MTNNNetNative.nativeCreateNetFromFile(str);
        }
        if (0 == nativeCreateNetFromFile) {
            throw new RuntimeException("Predictor::createPredictor error, due to the interpreter pointer is null, maybe the modelFilePath is illegal!");
        }
        long nativeCreateSession = MTNNNetNative.nativeCreateSession(nativeCreateNetFromFile, aVar.a, aVar.b, aVar.c, aVar.d);
        if (0 == nativeCreateSession) {
            throw new RuntimeException("Predictor::createPredictor error, due to the session pointer is null, maybe the session config is illegal!");
        }
        float nanoTime2 = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
        String[] split = str.split("/");
        String str2 = split[split.length - 1];
        if (str2.length() == 0) {
            str2 = "unknown";
        }
        d dVar = new d(nativeCreateNetFromFile, nativeCreateSession, str2, nanoTime2);
        if (e != null) {
            e.a(dVar.e(), "MTNN_INIT_TIME", nanoTime2);
        }
        return dVar;
    }

    private d(long j, long j2, String str, float f) {
        Object[] objArr = {new Long(j), new Long(j2), str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6574f2f7e91a57b6c655b7b9a852ed4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6574f2f7e91a57b6c655b7b9a852ed4f");
            return;
        }
        this.f = 0L;
        this.g = null;
        this.f = j;
        this.g = new e(j2, this.f);
        this.b = str;
        this.c = f;
    }

    public final void a() {
        long j;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34e4261c5ddddd4cb6a07b526fa6f31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34e4261c5ddddd4cb6a07b526fa6f31f");
            return;
        }
        long nanoTime = System.nanoTime();
        if (this.g != null) {
            e eVar = this.g;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "974e2409db61596ee134bcdd35d990d8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "974e2409db61596ee134bcdd35d990d8");
                j = 0;
            } else {
                j = 0;
                if (eVar.b != 0) {
                    MTNNNetNative.nativeReleaseSession(eVar.c, eVar.b);
                    eVar.b = 0L;
                }
            }
            this.g = null;
        } else {
            j = 0;
        }
        if (this.f != j) {
            MTNNNetNative.nativeReleaseNet(this.f);
            this.f = j;
        }
        float nanoTime2 = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
        this.c += nanoTime2;
        if (e != null) {
            Map<String, String> e2 = e();
            e.a(e2, "MTNN_RELEASE_TIME", nanoTime2);
            e.a(e2, "MTNN_STAY_TIME", this.c);
            this.c = 0.0f;
        }
    }

    public final f a(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8f58185f1f9ac158feb1efd10522fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8f58185f1f9ac158feb1efd10522fc");
        }
        d();
        return this.g.a(str);
    }

    public final f b(String str) throws Exception {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c49e048e99aba2a4b68b1433ee7a4111", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c49e048e99aba2a4b68b1433ee7a4111");
        }
        d();
        return this.g.b(str);
    }

    public final b b() throws Exception {
        b a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab34e6ce51f9f85a8803fd51e985673e", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab34e6ce51f9f85a8803fd51e985673e");
        }
        long nanoTime = System.nanoTime();
        d();
        e eVar = this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "a9bbe1e365d4aa7f31e31ed717ccb659", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (b) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "a9bbe1e365d4aa7f31e31ed717ccb659");
        } else {
            eVar.b();
            a2 = b.a(MTNNNetNative.nativeRunSession(eVar.c, eVar.b));
        }
        float nanoTime2 = ((float) (System.nanoTime() - nanoTime)) / 1000000.0f;
        this.c += nanoTime2;
        String str = a2 != b.NO_ERROR ? "failed" : "success";
        if (e != null) {
            e.a(e(), "MTNN_INFER_TIME", nanoTime2, str);
        }
        return a2;
    }

    public final void c() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88bf8597b1256b040425a17097689723", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88bf8597b1256b040425a17097689723");
            return;
        }
        d();
        this.g.a();
    }

    private void d() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "934fb5fb2a1ffb5293b1de251a9f7658", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "934fb5fb2a1ffb5293b1de251a9f7658");
        } else if (this.f == 0) {
            throw new RuntimeException("MTNNBasePredictor native pointer is null, it may has been released");
        }
    }

    private Map<String, String> e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152f98a1a05e4c7b66ef67b6f4562150", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152f98a1a05e4c7b66ef67b6f4562150");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_ver", "0.3.5");
        hashMap.put(PredictMLModelJsHandler.PARAM_NAME_MODEL_ID, this.b);
        hashMap.put("app_id", d);
        return hashMap;
    }
}
