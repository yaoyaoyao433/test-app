package com.meituan.msc.modules.viewmanager;

import android.os.Build;
import android.support.annotation.Nullable;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.common.aidata.jsengine.utils.JSExecuteUtil;
import com.meituan.msc.common.config.MSCRenderConfig;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.exception.a;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.Dynamic;
import com.meituan.msc.jse.bridge.DynamicFromObject;
import com.meituan.msc.jse.bridge.MSCReadableArray;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.MSCWritableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.l;
import com.meituan.msc.uimanager.av;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = UIManagerModule.NAME)
/* loaded from: classes3.dex */
public final class h extends k {
    public static ChangeQuickRedirect a;
    private boolean A;
    private final int B;
    private final int C;
    private final c D;
    private volatile boolean E;
    public final String b;
    public final com.meituan.msc.uimanager.UIManagerModule c;
    public volatile boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public com.meituan.msc.modules.manager.h i;
    public volatile boolean j;
    public final ConcurrentLinkedQueue<Runnable> k;
    private Method l;
    private volatile boolean m;
    private volatile boolean s;
    private com.meituan.msc.exception.a t;
    private final ConcurrentLinkedQueue<b> u;
    private long v;
    private boolean w;
    private boolean x;
    private int y;
    private long z;

    public static /* synthetic */ int e(h hVar) {
        int i = hVar.f;
        hVar.f = i + 1;
        return i;
    }

    public h(ReactApplicationContext reactApplicationContext, com.meituan.msc.b bVar, av avVar, int i) {
        Object[] objArr = {reactApplicationContext, bVar, avVar, -1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edf7ab13ada8234e29b4fa76106d9676", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edf7ab13ada8234e29b4fa76106d9676");
            return;
        }
        this.b = "MSCUIManagerModule@" + Integer.toHexString(hashCode());
        this.m = false;
        this.s = false;
        this.u = new ConcurrentLinkedQueue<>();
        this.d = false;
        this.v = 0L;
        this.w = false;
        this.x = false;
        this.y = 10001;
        this.A = false;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.B = 1;
        this.C = 2;
        this.h = false;
        this.D = new c();
        this.E = false;
        this.i = new com.meituan.msc.modules.manager.h() { // from class: com.meituan.msc.modules.viewmanager.h.8
            public static ChangeQuickRedirect c;

            @Override // com.meituan.msc.modules.manager.h
            public final void a(Runnable runnable) {
                Object[] objArr2 = {runnable};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3853d72d7e5a2a2d0ff2d3be7835378e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3853d72d7e5a2a2d0ff2d3be7835378e");
                    return;
                }
                h.e(h.this);
                h.this.a(runnable, 1);
            }
        };
        this.j = false;
        this.k = new ConcurrentLinkedQueue<>();
        this.t = new com.meituan.msc.exception.a(MSCRenderConfig.d());
        this.c = new com.meituan.msc.uimanager.UIManagerModule(reactApplicationContext, bVar, avVar, -1, this.t);
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b1a1decca891f6005abb5ad552bd14", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b1a1decca891f6005abb5ad552bd14")).booleanValue() : (MSCRenderConfig.o() && this.d) || (g() && MSCRenderConfig.e());
    }

    private static boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fba8c5f2027bd60b3557415f38b67f7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fba8c5f2027bd60b3557415f38b67f7")).booleanValue() : "HUAWEI".equals(Build.MANUFACTURER) || "HONOR".equals(Build.MANUFACTURER) || "PTAC".equals(Build.MANUFACTURER);
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979145ab0bd73f46a621db2bacf7655c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979145ab0bd73f46a621db2bacf7655c");
            return;
        }
        super.a(hVar);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a99c316e3de461e63eec99a06b85b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a99c316e3de461e63eec99a06b85b9c");
        } else {
            this.c.c();
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void V_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67c2d1591049c410b82ab4b6016528f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67c2d1591049c410b82ab4b6016528f8");
            return;
        }
        super.V_();
        this.l = g("batchDidComplete");
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2009cb4b23272e3a38740fd9a786fa11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2009cb4b23272e3a38740fd9a786fa11");
            return;
        }
        super.L_();
        this.s = true;
        com.meituan.msc.modules.reporter.g.d(this.b, "[onDestroy]");
        this.t.a();
    }

    @MSCMethod(isSync = true)
    public final JSONObject getConstantsForViewManager(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430532cbec677fdcb202fa337abf4af3", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430532cbec677fdcb202fa337abf4af3");
        }
        WritableMap a2 = this.c.a(str);
        if (a2 instanceof MSCWritableMap) {
            return ((MSCWritableMap) a2).getRealData();
        }
        return null;
    }

    @MSCMethod(isSync = true)
    public final JSONObject getDefaultEventTypes() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3370a9e1c000d34ac44941cf435ef02", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3370a9e1c000d34ac44941cf435ef02");
        }
        WritableMap e = this.c.e();
        if (e instanceof MSCWritableMap) {
            return ((MSCWritableMap) e).getRealData();
        }
        return null;
    }

    public final void a(String str, JSONArray jSONArray) {
        Object[] objArr = {str, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f0df46fe719e2ca0efbcfe8e7ca036", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f0df46fe719e2ca0efbcfe8e7ca036");
        } else {
            this.t.a(str, jSONArray);
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final Object a(Method method, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        RenderPerf.a b2;
        Object obj;
        int i;
        Object[] objArr = {method, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "713cd5d654dc0c2d9b943b57e8ce69d2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "713cd5d654dc0c2d9b943b57e8ce69d2");
        }
        if (this.m || this.s) {
            com.meituan.msc.modules.reporter.g.b(this.b, null, "[invoke]", Boolean.valueOf(this.m), Boolean.valueOf(this.s), "method:", method.getName(), "params: ", jSONArray);
            return null;
        }
        com.meituan.msc.exception.a aVar2 = this.t;
        String name = method.getName();
        Object[] objArr2 = {name, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.exception.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "1b057b3c5668cbc8005a171bf06aee45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "1b057b3c5668cbc8005a171bf06aee45");
        } else if (aVar2.d && !aVar2.e) {
            if (!aVar2.i) {
                long id = Thread.currentThread().getId();
                if (aVar2.g == 0) {
                    aVar2.g = id;
                }
                if (id != aVar2.g) {
                    com.meituan.msc.modules.reporter.g.b("[MSCRenderCommandTool@logCommand]", null, Long.valueOf(id), Long.valueOf(aVar2.g));
                    aVar2.i = true;
                }
            }
            a.C0440a c0440a = new a.C0440a();
            c0440a.a = aVar2.a(name);
            c0440a.b = String.valueOf(jSONArray);
            c0440a.c = aVar2.f.getAndIncrement();
            aVar2.c.add(c0440a);
        }
        int i2 = this.y;
        long nanoTime = System.nanoTime();
        RenderPerf renderPerf = this.c.j().getRuntimeDelegate().getRenderPerf();
        if (this.l != method) {
            if (this.x) {
                i = 1;
            } else {
                renderPerf.a(i2, Math.max(this.z == 0 ? 0L : System.currentTimeMillis() - this.z, 0L));
                renderPerf.a(JSExecuteUtil.VALUE_JS_OPTIONS_EXECUTE_MODE_BATCH, i2);
                i = 1;
                this.x = true;
            }
            Object[] objArr3 = new Object[i];
            objArr3[0] = Integer.valueOf(i2);
            ChangeQuickRedirect changeQuickRedirect3 = RenderPerf.a;
            if (PatchProxy.isSupport(objArr3, renderPerf, changeQuickRedirect3, false, "c3c67b0febd70889c3eab5df0060c72f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, renderPerf, changeQuickRedirect3, false, "c3c67b0febd70889c3eab5df0060c72f");
            } else if (renderPerf.c && renderPerf.d) {
                renderPerf.b(i2).f++;
            }
        } else {
            Object[] objArr4 = {Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect4 = RenderPerf.a;
            if (PatchProxy.isSupport(objArr4, renderPerf, changeQuickRedirect4, false, "a18bc23f142f9edd739cf02055410f8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, renderPerf, changeQuickRedirect4, false, "a18bc23f142f9edd739cf02055410f8c");
            } else if (renderPerf.c) {
                renderPerf.b(i2).l++;
            }
            long j = this.v / 1000000;
            Object[] objArr5 = {new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect5 = RenderPerf.a;
            if (PatchProxy.isSupport(objArr5, renderPerf, changeQuickRedirect5, false, "7291faed65ffc1f1cfc8268b7085355a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, renderPerf, changeQuickRedirect5, false, "7291faed65ffc1f1cfc8268b7085355a");
            } else if (renderPerf.c && renderPerf.d) {
                renderPerf.b(i2).e = (int) (b2.e + j);
            }
            this.v = 0L;
            if (this.x) {
                long currentTimeMillis = System.currentTimeMillis();
                Object[] objArr6 = {Integer.valueOf(i2), new Long(currentTimeMillis)};
                ChangeQuickRedirect changeQuickRedirect6 = RenderPerf.a;
                if (PatchProxy.isSupport(objArr6, renderPerf, changeQuickRedirect6, false, "78cbf5234faa79394416aaf02e377de3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, renderPerf, changeQuickRedirect6, false, "78cbf5234faa79394416aaf02e377de3");
                } else if (renderPerf.c) {
                    RenderPerf.a b3 = renderPerf.b(i2);
                    b3.h = System.currentTimeMillis();
                    b3.n = currentTimeMillis;
                }
            }
        }
        try {
            obj = super.a(method, jSONArray, aVar);
        } catch (Exception e) {
            this.c.j().getRuntimeDelegate().handleException(e);
            obj = null;
        }
        if (this.l != method) {
            this.v += System.nanoTime() - nanoTime;
        } else if (this.x) {
            renderPerf.a(i2);
            this.x = false;
            this.z = System.currentTimeMillis();
        }
        return obj;
    }

    @MSCMethod
    public final void removeRootView(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80633931794885a8eb56fcb3676fdb73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80633931794885a8eb56fcb3676fdb73");
            return;
        }
        String str = this.b;
        com.meituan.msc.modules.reporter.g.d(str, "[removeRootView]", "rootViewTag: " + i);
        this.c.a(i);
        this.m = true;
    }

    @MSCMethod
    public final void createView(int i, String str, int i2, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a997c752f132bd8f7f93493bfc2645e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a997c752f132bd8f7f93493bfc2645e");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.w) {
            U_().o.c("receive_first_render");
            U_().o.a("render");
            this.w = true;
            com.meituan.msc.modules.reporter.g.d(this.b, "[createView]", "first createView command, tag:", Integer.valueOf(i), ",className:", str, ",rootViewTag:", Integer.valueOf(i2), ",props:", jSONObject);
        }
        this.c.a(i, str, i2, new MSCReadableMap(jSONObject));
        a("createView", System.currentTimeMillis() - currentTimeMillis);
    }

    private void a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec754ea65354ea5d10e3c53dea909f3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec754ea65354ea5d10e3c53dea909f3b");
        } else {
            this.c.j().getRuntimeDelegate().getRenderPerf().a(str, j, this.y);
        }
    }

    @MSCMethod
    public final void updateView(int i, String str, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95a1f1b140fdea1acc434ad0e78b8bf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95a1f1b140fdea1acc434ad0e78b8bf7");
        } else {
            this.c.a(i, str, new MSCReadableMap(jSONObject));
        }
    }

    @MSCMethod
    public final void manageChildren(int i, @Nullable JSONArray jSONArray, @Nullable JSONArray jSONArray2, @Nullable JSONArray jSONArray3, @Nullable JSONArray jSONArray4, @Nullable JSONArray jSONArray5) {
        Object[] objArr = {Integer.valueOf(i), jSONArray, jSONArray2, jSONArray3, jSONArray4, jSONArray5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d828c0fb7d074655340fb502422721a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d828c0fb7d074655340fb502422721a0");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(i, new MSCReadableArray(jSONArray), new MSCReadableArray(jSONArray2), new MSCReadableArray(jSONArray3), new MSCReadableArray(jSONArray4), new MSCReadableArray(jSONArray5));
        a("manageChildren", System.currentTimeMillis() - currentTimeMillis);
    }

    @MSCMethod
    public final void setChildren(int i, JSONArray jSONArray) {
        Object[] objArr = {Integer.valueOf(i), jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "022b775658b867d079324f4a1c540089", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "022b775658b867d079324f4a1c540089");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.c.a(i, new MSCReadableArray(jSONArray));
        a("setChildren", System.currentTimeMillis() - currentTimeMillis);
    }

    @MSCMethod
    @Deprecated
    public final void replaceExistingNonRootView(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ff8013b3acd09b1e53910db523c901f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ff8013b3acd09b1e53910db523c901f");
        } else {
            this.c.a(i, i2);
        }
    }

    @MSCMethod
    @Deprecated
    public final void removeSubviewsFromContainerWithID(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b80f0fd28a34124c8eb16330fdcd5ad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b80f0fd28a34124c8eb16330fdcd5ad8");
        } else {
            this.c.b(i);
        }
    }

    @MSCMethod
    public final void measure(int i, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b888a1f682968ebd3c57e18aa734e12e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b888a1f682968ebd3c57e18aa734e12e");
        } else {
            this.c.a(i, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "86adecff0aa4226fbefbc68751f0c714", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "86adecff0aa4226fbefbc68751f0c714");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void measureInWindow(int i, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7595c8b30bfb8bfa856ee9b635c4012c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7595c8b30bfb8bfa856ee9b635c4012c");
        } else {
            this.c.b(i, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "83125ae7978f38a4196cb332d4a3bf98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "83125ae7978f38a4196cb332d4a3bf98");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void measureLayout(int i, int i2, final com.meituan.msc.modules.manager.b bVar, final com.meituan.msc.modules.manager.b bVar2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2101d2efd7a64b4046b5f85d911700a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2101d2efd7a64b4046b5f85d911700a7");
        } else {
            this.c.a(i, i2, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.11
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7c9219fbe4b9b1f9764e25a57cf58163", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7c9219fbe4b9b1f9764e25a57cf58163");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            }, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.12
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "c2401334b4df1059a1c58db6b56e69c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "c2401334b4df1059a1c58db6b56e69c7");
                    } else {
                        bVar2.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    @Deprecated
    public final void measureLayoutRelativeToParent(int i, final com.meituan.msc.modules.manager.b bVar, final com.meituan.msc.modules.manager.b bVar2) {
        Object[] objArr = {Integer.valueOf(i), bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45f0d717a21c213e931dafa001f8f80a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45f0d717a21c213e931dafa001f8f80a");
        } else {
            this.c.a(i, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.13
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "57cbed11241399e178ff98a2c2f0b2a8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "57cbed11241399e178ff98a2c2f0b2a8");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            }, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.14
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "c390d905b8b1aac5a5a9441ac1ce0ce5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "c390d905b8b1aac5a5a9441ac1ce0ce5");
                    } else {
                        bVar2.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void findSubviewIn(int i, JSONArray jSONArray, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), jSONArray, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc8b1b63f7931acb9e481462d5cfc7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc8b1b63f7931acb9e481462d5cfc7ab");
        } else {
            this.c.a(i, new MSCReadableArray(jSONArray), new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.15
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "33dbdbf8ac0eed7031d14675850234e8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "33dbdbf8ac0eed7031d14675850234e8");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    @Deprecated
    public final void viewIsDescendantOf(int i, int i2, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16258b1afef1107751cc7a3c3514ef01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16258b1afef1107751cc7a3c3514ef01");
        } else {
            this.c.a(i, i2, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.16
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "fe248f3f3d900876b0fa6dbf26529227", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "fe248f3f3d900876b0fa6dbf26529227");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void setJSResponder(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ca5140a8a86a1fac99c7cd50a1ab30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ca5140a8a86a1fac99c7cd50a1ab30");
        } else {
            this.c.a(i, z);
        }
    }

    @MSCMethod
    public final void clearJSResponder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee578e240a6a16a9c99f4b43de924ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee578e240a6a16a9c99f4b43de924ab1");
        } else {
            this.c.f();
        }
    }

    @MSCMethod
    public final void dispatchViewManagerCommand(int i, Dynamic dynamic, @Nullable JSONArray jSONArray) {
        Object[] objArr = {Integer.valueOf(i), dynamic, jSONArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b39c61780f9305d479fa108fffeb9d01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b39c61780f9305d479fa108fffeb9d01");
        } else {
            this.c.a(i, dynamic, new MSCReadableArray(jSONArray));
        }
    }

    @MSCMethod
    @Deprecated
    public final void playTouchSound() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5af6708c7f35b247ab046723a393190c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5af6708c7f35b247ab046723a393190c");
        } else {
            this.c.g();
        }
    }

    @MSCMethod
    public final void showPopupMenu(int i, JSONArray jSONArray, final com.meituan.msc.modules.manager.b bVar, final com.meituan.msc.modules.manager.b bVar2) {
        Object[] objArr = {Integer.valueOf(i), jSONArray, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea420b862f6842bf20c8ce3b76b3a578", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea420b862f6842bf20c8ce3b76b3a578");
        } else {
            this.c.a(i, new MSCReadableArray(jSONArray), new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.17
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "e62993c1bccb1dc83694919a01350868", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "e62993c1bccb1dc83694919a01350868");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            }, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "0f5c6b424e32a3d66b639496df8f610e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "0f5c6b424e32a3d66b639496df8f610e");
                    } else {
                        bVar2.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void dismissPopupMenu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69b8a360b96b95e4648a198b30d11d65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69b8a360b96b95e4648a198b30d11d65");
        } else {
            this.c.h();
        }
    }

    @MSCMethod
    public final void setLayoutAnimationEnabledExperimental(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32a27651e901a7eede1acc076524218d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32a27651e901a7eede1acc076524218d");
        } else {
            this.c.a(z);
        }
    }

    @MSCMethod
    public final void configureNextLayoutAnimation(JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar, final com.meituan.msc.modules.manager.b bVar2) {
        Object[] objArr = {jSONObject, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1dc832187597fb6eed78fb751e75c1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1dc832187597fb6eed78fb751e75c1a");
        } else {
            this.c.a(new MSCReadableMap(jSONObject), new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "07712c0a81fd799e87eb380defe841af", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "07712c0a81fd799e87eb380defe841af");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            }, new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "f1cbf58ed6d33217eb1943217101133c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "f1cbf58ed6d33217eb1943217101133c");
                    } else {
                        bVar2.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void batchDidComplete(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6aed67e5871f9cee33e88484fd7754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6aed67e5871f9cee33e88484fd7754");
            return;
        }
        if (this.x && j != 0) {
            this.c.onBatchComplete(this.y);
            this.y++;
        }
        if (!this.w || this.A) {
            return;
        }
        this.A = true;
        com.meituan.msc.modules.reporter.g.d(this.b, "[batchDidComplete]", "jsTimeStamp: " + j);
    }

    @MSCMethod
    public final void sendAccessibilityEvent(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cae294d2c8ef9aa62f8f69e7d9ee1ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cae294d2c8ef9aa62f8f69e7d9ee1ff");
        } else {
            this.c.b(i, i2);
        }
    }

    @MSCMethod
    public final void query(JSONArray jSONArray, JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONArray, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38de8eba80d96b480d970cf4381a4e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38de8eba80d96b480d970cf4381a4e54");
        } else {
            this.c.a(new MSCReadableArray(jSONArray), new MSCReadableMap(jSONObject), new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "d93b5cb1d8b0f7ba7ab79ad51795954e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "d93b5cb1d8b0f7ba7ab79ad51795954e");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void queryViewport(JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3080f2da725a16734b233c7e3d891c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3080f2da725a16734b233c7e3d891c7");
        } else {
            this.c.a(new MSCReadableMap(jSONObject), new Callback() { // from class: com.meituan.msc.modules.viewmanager.h.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.jse.bridge.Callback
                public final void invoke(Object... objArr2) {
                    Object[] objArr3 = {objArr2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "595349006221407d06aec53196a70cae", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "595349006221407d06aec53196a70cae");
                    } else {
                        bVar.a(objArr2);
                    }
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final Object a(String str, String str2, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9825f7976e10ae04c79e3f1e780f53ba", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9825f7976e10ae04c79e3f1e780f53ba");
        }
        a(str, str2, jSONArray, aVar, false);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2, final JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar, boolean z) {
        Object[] objArr = {str, str2, jSONArray, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57b13eeff11f603b73641f3bad22c55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57b13eeff11f603b73641f3bad22c55d");
            return;
        }
        try {
            final int parseInt = Integer.parseInt(str);
            jSONArray.remove(0);
            com.meituan.msc.modules.reporter.g.d(this.b, "[dispatchCall]", "reactTag:", Integer.valueOf(parseInt), "moduleName:", str, "methodName:", str2);
            if (z) {
                com.meituan.msc.modules.reporter.g.d(this.b, "[dispatchViewManagerCommand]", "reactTag:", Integer.valueOf(parseInt), "moduleName:", str, "methodName:", str2);
                dispatchViewManagerCommand(parseInt, new DynamicFromObject(str2), jSONArray);
                return;
            }
            a(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.h.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91a29cc0ba15e73c19592a997f546778", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91a29cc0ba15e73c19592a997f546778");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d(h.this.b, "[dispatchViewManagerCommand]", "reactTag:", Integer.valueOf(parseInt), "moduleName:", str, "methodName:", str2);
                    h.this.dispatchViewManagerCommand(parseInt, new DynamicFromObject(str2), jSONArray);
                }
            }, 0);
        } catch (Exception unused) {
        }
    }

    public final void a(Runnable runnable, int i) {
        Object[] objArr = {runnable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9127a6d2346333edcabc039d70201638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9127a6d2346333edcabc039d70201638");
        } else if (this.j) {
            this.k.add(runnable);
        } else {
            f();
            if (i == 1) {
                this.e++;
            }
            this.c.j().runOnNativeModulesQueueThread(runnable);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e93c445537f18fc12c34ef6c82a040b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e93c445537f18fc12c34ef6c82a040b");
        } else {
            this.g++;
        }
    }

    public final void b(String str, String str2, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {str, str2, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e8f0caa74ae8918c10083bef3a53e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e8f0caa74ae8918c10083bef3a53e2");
            return;
        }
        b bVar = new b(a.TYPE_VIEW_MANAGER);
        bVar.d = str;
        bVar.f = str2;
        a(bVar, jSONArray, aVar);
    }

    public final void a(k kVar, Method method, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {kVar, method, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd14f848f8d5460d211a4138b574cf85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd14f848f8d5460d211a4138b574cf85");
            return;
        }
        b bVar = new b(a.TYPE_NORMAL);
        bVar.c = kVar;
        bVar.e = method;
        a(bVar, jSONArray, aVar);
    }

    public final void a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfb1456e28f0461c63d9501da552ae68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfb1456e28f0461c63d9501da552ae68");
            return;
        }
        b bVar = new b(a.TYPE_RLIST);
        bVar.i = runnable;
        bVar.f = str;
        a(bVar, (JSONArray) null, (com.meituan.msc.modules.manager.a) null);
    }

    private void a(b bVar, JSONArray jSONArray, com.meituan.msc.modules.manager.a aVar) {
        Object[] objArr = {bVar, jSONArray, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6292192e2539d8720cddccccf8421e48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6292192e2539d8720cddccccf8421e48");
            return;
        }
        a(bVar.f != null ? bVar.f : bVar.e.getName(), bVar.g);
        if (!this.h) {
            com.meituan.msc.modules.reporter.g.d("[MSCUIManagerModule@invokeCommandInner]", "command on HW");
            this.h = true;
        }
        this.f++;
        bVar.g = jSONArray;
        bVar.h = aVar;
        this.u.add(bVar);
        if (this.E) {
            return;
        }
        this.c.j().removeCallbacks(this.D);
        a(this.D, 2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public static ChangeQuickRedirect a;

        private c() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a07c6aea42f4b3310f226f932e3882", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a07c6aea42f4b3310f226f932e3882");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4b9cd252d91e93cead17b22eb86405", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4b9cd252d91e93cead17b22eb86405");
                return;
            }
            h.this.E = true;
            int i = 0;
            while (true) {
                try {
                    b bVar = (b) h.this.u.poll();
                    if (bVar != null) {
                        i++;
                        h.this.e();
                        switch (bVar.b) {
                            case TYPE_NORMAL:
                                l.a(bVar.c, bVar.e, bVar.g, bVar.h);
                                break;
                            case TYPE_VIEW_MANAGER:
                                h.this.a(bVar.d, bVar.f, bVar.g, bVar.h, true);
                                break;
                            case TYPE_RLIST:
                                bVar.i.run();
                                break;
                        }
                    } else {
                        com.meituan.msc.modules.reporter.g.d("[MSCRenderCommandRunnable@run]", "task queue empty", Integer.valueOf(i), Integer.valueOf(h.this.f), Integer.valueOf(h.this.g));
                        return;
                    }
                } finally {
                    h.this.E = false;
                }
            }
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final com.meituan.msc.modules.manager.h q() {
        return this.i;
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fe9882cf3cdcf3ecf194a3adbe9cb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fe9882cf3cdcf3ecf194a3adbe9cb8");
        } else if (this.k.isEmpty()) {
        } else {
            com.meituan.msc.modules.reporter.g.d(this.b, "[flushCachedTasks]");
            synchronized (this.k) {
                while (!this.k.isEmpty()) {
                    this.c.j().runOnNativeModulesQueueThread(this.k.poll());
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements Serializable {
        public static ChangeQuickRedirect a;
        public a b;
        public k c;
        public String d;
        public Method e;
        public String f;
        public JSONArray g;
        public com.meituan.msc.modules.manager.a h;
        public Runnable i;

        public b(a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cacd0391051fe8faa75f2edce2c6465b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cacd0391051fe8faa75f2edce2c6465b");
            } else {
                this.b = aVar;
            }
        }

        public final String toString() {
            String name;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2974924f6d2ee05ac1ed2ddf728e1b", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2974924f6d2ee05ac1ed2ddf728e1b");
            }
            StringBuilder sb = new StringBuilder("command{type=");
            sb.append(this.b.name());
            sb.append(", method=");
            if (this.e == null) {
                name = this.f == null ? StringUtil.NULL : this.f;
            } else {
                name = this.e.getName();
            }
            sb.append(name);
            sb.append(", params='");
            sb.append(this.g);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        TYPE_NORMAL,
        TYPE_VIEW_MANAGER,
        TYPE_RLIST;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72759f7b00b0083a813ee2fbd8dd54f4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72759f7b00b0083a813ee2fbd8dd54f4");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a1ff3cc19222d13034ec8f6661ab0b56", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a1ff3cc19222d13034ec8f6661ab0b56") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cac1e058312c179abeff8d9981581c6", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cac1e058312c179abeff8d9981581c6") : (a[]) values().clone();
        }
    }
}
