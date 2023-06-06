package com.meituan.android.edfu.mbar.util;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageResult;
import com.meituan.android.edfu.cvlog.netservice.bean.ImageSaveRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import rx.e;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class m {
    public static ChangeQuickRedirect a = null;
    public static Map<String, String> i = null;
    public static boolean k = false;
    public static boolean l = false;
    public static boolean o = false;
    public static boolean p = false;
    public static boolean q = false;
    public static boolean r = false;
    public static boolean s = false;
    public static boolean t = false;
    public static boolean u = false;
    public static boolean v = false;
    private static final String x = "m";
    private static m z;
    private com.meituan.android.edfu.edfucamera.argorithm.e A;
    private Object B;
    private Queue<float[]> C;
    private int D;
    private int E;
    private int F;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public Context j;
    public k m;
    public boolean n;
    public boolean w;
    private String y;

    public static /* synthetic */ com.meituan.android.edfu.edfucamera.argorithm.e a(m mVar, com.meituan.android.edfu.edfucamera.argorithm.e eVar) {
        mVar.A = null;
        return null;
    }

    public static m a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd6b4b0a6ba386b9d774b56a153e0884", RobustBitConfig.DEFAULT_VALUE)) {
            return (m) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd6b4b0a6ba386b9d774b56a153e0884");
        }
        if (z == null) {
            synchronized (m.class) {
                if (z == null) {
                    z = new m();
                }
            }
        }
        return z;
    }

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ba445fbb6eb9b31a1af080657dd0ebf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ba445fbb6eb9b31a1af080657dd0ebf");
            return;
        }
        this.h = 10;
        this.y = "DEFAULT";
        this.n = true;
        this.D = 2;
        this.E = 200;
        this.F = 0;
        this.m = new k();
        this.C = new f(this.E);
    }

    public final void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d52161f546274782653d36c0a9f7bc29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d52161f546274782653d36c0a9f7bc29");
        } else if (this.j == null) {
        } else {
            try {
                com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(this.h, this.j);
                HashMap hashMap = new HashMap();
                hashMap.put(str, Float.valueOf(f));
                a(mVar, hashMap);
                HashMap hashMap2 = new HashMap();
                hashMap2.putAll(b(this.j));
                if (o) {
                    hashMap2.put("MBAR_MODE", "MBAR");
                } else {
                    hashMap2.put("MBAR_MODE", "MBAR_FAILED");
                }
                if (p) {
                    hashMap2.put("CAMERA_OP", "NEW");
                } else {
                    hashMap2.put("CAMERA_OP", "DEFAULT");
                }
                hashMap2.put("NIGHT_STRATEGY", r ? "New" : "Old");
                hashMap2.put("FOCUS_AREA", s ? "New" : "Old");
                b(mVar, hashMap2);
                mVar.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void a(Map<String, Float> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f23026a2c71d6c0b6a6f78a070555e4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f23026a2c71d6c0b6a6f78a070555e4e");
        } else if (this.j == null) {
        } else {
            try {
                com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(this.h, this.j);
                a(mVar, map);
                HashMap hashMap = new HashMap();
                hashMap.putAll(b(this.j));
                hashMap.put("MULTI_PROCESSOR", t ? "multiprocessor" : "default");
                if (o) {
                    hashMap.put("MBAR_MODE", "MBAR");
                } else {
                    hashMap.put("MBAR_MODE", "MBAR_FAILED");
                }
                if (p) {
                    hashMap.put("CAMERA_OP", "NEW");
                } else {
                    hashMap.put("CAMERA_OP", "DEFAULT");
                }
                hashMap.put("NIGHT_STRATEGY", r ? "New" : "Old");
                hashMap.put("FOCUS_AREA", s ? "New" : "Old");
                b(mVar, hashMap);
                mVar.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17036bf96b3970eb6229c8defdc55300", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17036bf96b3970eb6229c8defdc55300");
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.edfu.mbar.util.m.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "450f98b8c89b7afbeb437a8adef4b9d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "450f98b8c89b7afbeb437a8adef4b9d3");
                        return;
                    }
                    String str3 = str2;
                    com.dianping.networklog.c.a(str3, 3, new String[]{"MBAR_" + str});
                }
            });
        }
    }

    private void a(com.dianping.monitor.impl.l lVar, Map<String, Float> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a34af839737250345bf85f7de1f92f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a34af839737250345bf85f7de1f92f2");
        } else if (map != null && map.size() > 0) {
            for (Map.Entry<String, Float> entry : map.entrySet()) {
                lVar.a(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
    }

    private void b(com.dianping.monitor.impl.l lVar, Map<String, String> map) {
        Object[] objArr = {lVar, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b8d86829ee9abe19e3cd5bfcbaaced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b8d86829ee9abe19e3cd5bfcbaaced");
        } else if (map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                lVar.a(entry.getKey(), entry.getValue());
            }
        }
    }

    public final synchronized void a(com.meituan.android.edfu.edfucamera.argorithm.e eVar, Object obj) {
        this.A = eVar;
        this.B = obj;
    }

    public final synchronized void a(float f, float f2, float f3, float f4, float f5) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d4fdc19c10322b9bc1c02cd2c970fab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d4fdc19c10322b9bc1c02cd2c970fab");
            return;
        }
        StringBuilder sb = new StringBuilder("index is ");
        sb.append(f);
        sb.append(" topLeftX: ");
        sb.append(f2);
        sb.append(" topLeftY: ");
        sb.append(f3);
        sb.append(" bottomRightX: ");
        sb.append(f4);
        sb.append(" bottomRightY: ");
        sb.append(f5);
        if (this.C.isEmpty()) {
            this.C.add(new float[]{f, f2, f3, f4, f5});
            return;
        }
        this.F++;
        if (this.F == this.D) {
            this.C.add(new float[]{f, f2, f3, f4, f5});
            this.F = 0;
        }
    }

    public final void a(final CvLogRecord cvLogRecord) {
        Object[] objArr = {cvLogRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b650f42ef54d48d0fde516d4356b2643", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b650f42ef54d48d0fde516d4356b2643");
        } else if (!k && !l) {
            this.A = null;
        } else if (l && cvLogRecord.isMBarScanSuccess()) {
            this.A = null;
        } else {
            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.edfu.mbar.util.m.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    final com.meituan.android.edfu.edfucamera.argorithm.e eVar;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2480a109401fad77f80d63b9a3680906", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2480a109401fad77f80d63b9a3680906");
                        return;
                    }
                    try {
                        cvLogRecord.setCoreNum(c.b());
                        cvLogRecord.setMemInfo(c.a());
                        cvLogRecord.setMemLeft(c.a(m.this.j));
                        cvLogRecord.setMBarMode(m.o);
                        cvLogRecord.setImageWidth(m.this.A.b);
                        cvLogRecord.setImageHeight(m.this.A.c);
                        cvLogRecord.setBarRectInfos(m.this.C);
                        final com.meituan.android.edfu.cvlog.monitor.a a2 = com.meituan.android.edfu.cvlog.monitor.a.a(m.this.j);
                        com.meituan.android.edfu.edfucamera.argorithm.e eVar2 = m.this.A;
                        CvLogRecord cvLogRecord2 = cvLogRecord;
                        Object[] objArr3 = {eVar2, cvLogRecord2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.android.edfu.cvlog.monitor.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "614e2df7afa3b2e62b569ae5bde7d973", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "614e2df7afa3b2e62b569ae5bde7d973");
                        } else {
                            if (eVar2 != null) {
                                eVar = a2.a(eVar2.f, eVar2.b, eVar2.c, eVar2.d, eVar2.i, eVar2.e, eVar2.j);
                                if (eVar != null) {
                                    eVar.k = false;
                                }
                            } else {
                                eVar = null;
                            }
                            final String json = cvLogRecord2 != null ? new GsonBuilder().create().toJson(cvLogRecord2) : "";
                            com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.meituan.android.edfu.cvlog.monitor.a.3
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "33133dd2f811d171f03331ca54ae44fa", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "33133dd2f811d171f03331ca54ae44fa");
                                        return;
                                    }
                                    String unused = a.this.q;
                                    ImageSaveRequest imageSaveRequest = new ImageSaveRequest();
                                    imageSaveRequest.setProject_id(a.this.n);
                                    imageSaveRequest.setGroup_id(a.this.o);
                                    imageSaveRequest.setMeta(json);
                                    imageSaveRequest.setSession_id(a.this.m);
                                    if (eVar != null) {
                                        byte[] a3 = a.this.a(eVar.f, 17, eVar.b, eVar.c);
                                        if (a3 == null) {
                                            return;
                                        }
                                        try {
                                            imageSaveRequest.setContent(Base64.encodeToString(a3, 2));
                                        } catch (OutOfMemoryError unused2) {
                                            return;
                                        }
                                    } else {
                                        imageSaveRequest.setContent("");
                                    }
                                    a.this.k.a(imageSaveRequest).a(new e<ImageResult>() { // from class: com.meituan.android.edfu.cvlog.monitor.a.3.1
                                        public static ChangeQuickRedirect a;

                                        @Override // rx.e
                                        public final void onCompleted() {
                                        }

                                        @Override // rx.e
                                        public final void onError(Throwable th) {
                                        }

                                        @Override // rx.e
                                        public final /* synthetic */ void onNext(ImageResult imageResult) {
                                            ImageResult imageResult2 = imageResult;
                                            Object[] objArr5 = {imageResult2};
                                            ChangeQuickRedirect changeQuickRedirect5 = a;
                                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f32e2b60f8256a0b452a0a1c32c49c1c", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f32e2b60f8256a0b452a0a1c32c49c1c");
                                                return;
                                            }
                                            String unused3 = a.this.q;
                                            new StringBuilder(" GET RESULT").append(imageResult2.getMessage());
                                        }
                                    });
                                    if (eVar != null) {
                                        eVar.k = true;
                                    }
                                }
                            });
                        }
                        m.a(m.this, (com.meituan.android.edfu.edfucamera.argorithm.e) null);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static void a(Context context) {
        JsonObject asJsonObject;
        JsonObject asJsonObject2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "203f4bffc4739300bef55672e4f820ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "203f4bffc4739300bef55672e4f820ee");
            return;
        }
        try {
            String accessCache = Horn.accessCache("mbar_scan_auto_zoomer");
            if (!TextUtils.isEmpty(accessCache) && (asJsonObject2 = new JsonParser().parse(accessCache).getAsJsonObject()) != null && asJsonObject2.has("android_mbar_scan_auto_zoomer")) {
                b.d = asJsonObject2.get("android_mbar_scan_auto_zoomer").getAsBoolean();
            }
            String accessCache2 = Horn.accessCache("mbar_camera_exposure");
            if (!TextUtils.isEmpty(accessCache2) && (asJsonObject = new JsonParser().parse(accessCache2).getAsJsonObject()) != null && asJsonObject.has("android_mbar_camera_exposure")) {
                q = asJsonObject.get("android_mbar_camera_exposure").getAsBoolean();
            }
        } catch (Exception unused) {
        }
        Horn.register("mbar_scan_auto_zoomer", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.3
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
            }
        });
        Horn.register("mbar_camera_exposure", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.4
            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
            }
        });
        Horn.register("mbar_night_optimization", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
                JsonObject asJsonObject3;
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c58f4180106803b33530eff03fc2261", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c58f4180106803b33530eff03fc2261");
                } else if (TextUtils.isEmpty(str) || (asJsonObject3 = new JsonParser().parse(str).getAsJsonObject()) == null || !asJsonObject3.has("android_night_optimization")) {
                } else {
                    m.r = asJsonObject3.get("android_night_optimization").getAsBoolean();
                }
            }
        });
        Horn.register("mbar_area_focus", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
                JsonObject asJsonObject3;
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6da3125371ca18ed9860f4412d380db6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6da3125371ca18ed9860f4412d380db6");
                } else if (TextUtils.isEmpty(str) || (asJsonObject3 = new JsonParser().parse(str).getAsJsonObject()) == null || !asJsonObject3.has("android_areafocus_optimization")) {
                } else {
                    m.s = asJsonObject3.get("android_areafocus_optimization").getAsBoolean();
                }
            }
        });
        Horn.register("mbar_set_exposure", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
                JsonObject asJsonObject3;
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea2c005c2dacf50196e87c1274aeb59b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea2c005c2dacf50196e87c1274aeb59b");
                } else if (TextUtils.isEmpty(str) || (asJsonObject3 = new JsonParser().parse(str).getAsJsonObject()) == null || !asJsonObject3.has("close_set_exposure")) {
                } else {
                    m.u = asJsonObject3.get("close_set_exposure").getAsBoolean();
                }
            }
        });
        Horn.register("mbar_net_decode", new HornCallback() { // from class: com.meituan.android.edfu.mbar.util.m.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.common.horn.HornCallback
            public final void onChanged(boolean z2, String str) {
                JsonObject asJsonObject3;
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bb1adf09b5ef160b56bdc0e5757a0863", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bb1adf09b5ef160b56bdc0e5757a0863");
                } else if (TextUtils.isEmpty(str) || (asJsonObject3 = new JsonParser().parse(str).getAsJsonObject()) == null || !asJsonObject3.has("android_netdecode_optimization")) {
                } else {
                    m.v = asJsonObject3.get("android_netdecode_optimization").getAsBoolean();
                }
            }
        });
    }

    private Map<String, String> b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8be337861cde4cecc29c14d6b4fa49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8be337861cde4cecc29c14d6b4fa49");
        }
        if (i != null) {
            return i;
        }
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("APP_VERSION", com.dianping.monitor.h.b(context));
        i.put("PLATFORM", "Android");
        i.put("ALGORITHM_VERSION", b.d ? "MBar_AutoZoom" : "DEFAULT");
        return i;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5efb6e1372bc965ef835d3f1838917", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5efb6e1372bc965ef835d3f1838917");
        } else if (this.m == null || !this.w) {
        } else {
            k kVar = this.m;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "704baee84d103a83a33103fe117f08e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "704baee84d103a83a33103fe117f08e9");
            } else {
                kVar.c = j;
            }
            this.b = this.m.c - this.m.b;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ef088fa698e0090348fb5c8cf33aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ef088fa698e0090348fb5c8cf33aed");
        } else if (this.m == null || !this.w) {
        } else {
            k kVar = this.m;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "f64b553a61bd25004e9df7c4142b25da", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "f64b553a61bd25004e9df7c4142b25da");
            } else {
                kVar.d = j;
            }
            this.c = this.m.d - this.m.c;
        }
    }

    public final synchronized void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d001a4d838170e49ca72280f94b5cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d001a4d838170e49ca72280f94b5cb9");
            return;
        }
        if (this.m != null && this.w && this.m.e == 0) {
            k kVar = this.m;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "686e886a8415a50b037ef8f560732ab9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "686e886a8415a50b037ef8f560732ab9");
            } else {
                kVar.e = j;
            }
            this.d = this.m.e - this.m.d;
        }
    }

    public final synchronized void d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de9453a72857db2972587a7dfe5b95d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de9453a72857db2972587a7dfe5b95d8");
            return;
        }
        if (this.m != null && this.m.b > 0 && this.w && this.m.f == 0) {
            k kVar = this.m;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "720ecb5d14f493f39364a23f45fd866b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "720ecb5d14f493f39364a23f45fd866b");
            } else {
                kVar.f = j;
            }
            this.e = this.m.f - this.m.e;
            this.f = this.m.f - this.m.b;
            this.g = this.m.f - this.m.c;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174d9b241bf684cb7f78880e4e8e6458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174d9b241bf684cb7f78880e4e8e6458");
        } else if (this.m == null || this.m.b <= 0 || !this.w || !this.n) {
        } else {
            HashMap hashMap = new HashMap();
            if (this.b > 0) {
                hashMap.put("mbar_perf_t1", Float.valueOf((float) this.b));
            }
            if (this.c > 0) {
                hashMap.put("mbar_perf_t2", Float.valueOf((float) this.c));
            }
            if (this.d > 0) {
                hashMap.put("mbar_perf_t3", Float.valueOf((float) this.d));
            }
            if (this.e > 0) {
                hashMap.put("mbar_perf_t4", Float.valueOf((float) this.e));
            }
            if (this.f > 0) {
                hashMap.put("mbar_perf_t5", Float.valueOf((float) this.f));
            }
            if (this.g > 0) {
                hashMap.put("mbar_perf_t6", Float.valueOf((float) this.g));
            }
            new StringBuilder("detect cost is: ").append(this.m.f - this.m.c);
            a(hashMap);
            this.n = false;
            if (t) {
                a("detector", " MultiProcessor");
            }
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b10336e19a848eec906e814d50d5273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b10336e19a848eec906e814d50d5273");
            return;
        }
        if (this.m != null) {
            k kVar = this.m;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = k.a;
            if (PatchProxy.isSupport(objArr2, kVar, changeQuickRedirect2, false, "0c46545f0a60c20ee14a0d9a016ff4c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kVar, changeQuickRedirect2, false, "0c46545f0a60c20ee14a0d9a016ff4c6");
            } else {
                kVar.b = 0L;
                kVar.c = 0L;
                kVar.d = 0L;
                kVar.e = 0L;
                kVar.f = 0L;
            }
        }
        t = false;
        q = false;
        this.n = true;
    }
}
