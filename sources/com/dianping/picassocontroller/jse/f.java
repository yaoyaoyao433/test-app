package com.dianping.picassocontroller.jse;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.dianping.picassocontroller.jse.c;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class f {
    public static ChangeQuickRedirect a;
    private static volatile f c;
    private static volatile c e;
    private static Context g;
    private static e j;
    private static d k;
    private int b;
    private Handler h;
    private boolean i;
    private c.a n;
    private static ArrayList<c> d = new ArrayList<>();
    private static int f = 0;
    private static int l = 0;
    private static boolean m = true;

    public static /* synthetic */ int a(int i) {
        l = 2;
        return 2;
    }

    private f(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc82b6e5086e6fa2d5b9ddb5b482ea8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc82b6e5086e6fa2d5b9ddb5b482ea8e");
            return;
        }
        this.b = 1;
        this.h = new Handler(Looper.getMainLooper());
        this.n = new c.a() { // from class: com.dianping.picassocontroller.jse.f.2
            public static ChangeQuickRedirect a;

            @Override // com.dianping.picassocontroller.jse.c.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "349ab7b329591c6f87342ddc7a2966bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "349ab7b329591c6f87342ddc7a2966bf");
                } else if (f.j != null) {
                    f.a(2);
                    e unused = f.j;
                }
            }
        };
        c cVar = new c(context);
        e = cVar;
        cVar.f = this.n;
        f = 0;
    }

    public static f a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79d4193e7f84583196373801f4092cac", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79d4193e7f84583196373801f4092cac");
        }
        c(context);
        if (m && k != null) {
            m = false;
            System.currentTimeMillis();
        }
        return c;
    }

    private static void c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aab68dfea4c1d2bb7ebc9493721be958", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aab68dfea4c1d2bb7ebc9493721be958");
        } else if (c == null) {
            synchronized (f.class) {
                if (c == null) {
                    g = context.getApplicationContext();
                    c = new f(context);
                }
            }
        }
    }

    public static void a(Context context, e eVar) {
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21a1b1684540641581c978f391a825db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21a1b1684540641581c978f391a825db");
            return;
        }
        j = eVar;
        l = 1;
        c(context);
    }

    public static void a(d dVar) {
        k = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d0b7fb46a8bd3f4043ca410afc1637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d0b7fb46a8bd3f4043ca410afc1637");
            return;
        }
        for (int i = 0; i < this.b; i++) {
            d.add(new c(context));
        }
    }

    public static c a() {
        return e;
    }

    public final c b() {
        ArrayList arrayList;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0690eedfd6386fb8a7d8224e933e5721", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0690eedfd6386fb8a7d8224e933e5721");
        }
        if (d.size() == 0) {
            synchronized (d) {
                if (!this.i) {
                    this.i = true;
                    this.h.postDelayed(new Runnable() { // from class: com.dianping.picassocontroller.jse.f.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c0d3d5ef3e1d75687696caec42c8280c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c0d3d5ef3e1d75687696caec42c8280c");
                            } else {
                                f.this.d(f.g);
                            }
                        }
                    }, MetricsAnrManager.ANR_THRESHOLD);
                }
            }
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16f8ecd75314b080404abb0850398b64", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (ArrayList) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16f8ecd75314b080404abb0850398b64");
        } else {
            arrayList = new ArrayList();
            arrayList.add(e);
            if (d.size() > 0) {
                arrayList.addAll(d);
            }
        }
        int size = f % arrayList.size();
        f++;
        return (c) arrayList.get(size);
    }

    public static void b(@NonNull final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d3cb019d2a03989e438705b3e2184dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d3cb019d2a03989e438705b3e2184dd");
        } else if (e != null) {
            final c cVar = e;
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "6121482ea95e0c56a8dd06acce3e29be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "6121482ea95e0c56a8dd06acce3e29be");
            } else {
                h.a(cVar.b, new Runnable() { // from class: com.dianping.picassocontroller.jse.c.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d6b3a765e4be210a1f233dc1184d98dd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d6b3a765e4be210a1f233dc1184d98dd");
                            return;
                        }
                        final c cVar2 = cVar;
                        final Context context2 = context;
                        Object[] objArr4 = {context2};
                        ChangeQuickRedirect changeQuickRedirect4 = c.a;
                        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "db58b505d451f865e0b4b34c6dbd867d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "db58b505d451f865e0b4b34c6dbd867d");
                        } else if (cVar2.c != null && cVar2.b != null) {
                            h.a(cVar2.b, new Runnable() { // from class: com.dianping.picassocontroller.jse.c.9
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2aff69aae586b96669f7016abdb823e2", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2aff69aae586b96669f7016abdb823e2");
                                    } else {
                                        cVar2.b(cVar2.c, context2);
                                    }
                                }
                            });
                        }
                        cVar.a(cVar.c, context);
                    }
                });
            }
        }
    }
}
