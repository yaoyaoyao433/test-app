package com.sankuai.waimai.mach.jsv8;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.v8jse.JSArray;
import com.meituan.v8jse.JSObject;
import com.meituan.v8jse.JSRuntime;
import com.meituan.v8jse.JSValue;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.common.f;
import com.sankuai.waimai.mach.common.i;
import com.sankuai.waimai.mach.common.j;
import com.sankuai.waimai.mach.jsv8.b;
import com.sankuai.waimai.mach.jsv8.jsinterface.d;
import com.sankuai.waimai.mach.manager.cache.e;
import com.sankuai.waimai.mach.manager.monitor.MonitorManager;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements b {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.mach.jsv8.jsexecutor.a b;
    e c;
    String d;
    volatile boolean e;
    JSObject f;
    Mach g;
    com.sankuai.waimai.mach.model.data.a h;
    private long i;
    private Handler j;
    private a k;
    private AtomicBoolean l;
    private j m;

    public static /* synthetic */ void a(c cVar, final b.InterfaceC1011b interfaceC1011b, final Object obj) {
        Object[] objArr = {interfaceC1011b, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "54a37df497711e3cebd0c1a3ab1c89bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "54a37df497711e3cebd0c1a3ab1c89bc");
        } else if (interfaceC1011b != null) {
            cVar.j.post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.c.5
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca0dbffb46a27fa1bd772cb84c582b43", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca0dbffb46a27fa1bd772cb84c582b43");
                    } else if (interfaceC1011b != null) {
                        interfaceC1011b.a(obj);
                    }
                }
            });
        }
    }

    public c(Mach mach) {
        Object[] objArr = {mach};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe99eab79b482cef8b76f858abaedf8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe99eab79b482cef8b76f858abaedf8a");
            return;
        }
        this.l = new AtomicBoolean(false);
        this.m = new j() { // from class: com.sankuai.waimai.mach.jsv8.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.common.j
            public final void M() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b33a639a3fb51729aebe95fa9cffd217", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b33a639a3fb51729aebe95fa9cffd217");
                    return;
                }
                i a2 = i.a();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = i.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "e1ab44c07e181c1e0f9c3f602990ca5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "e1ab44c07e181c1e0f9c3f602990ca5a");
                } else if (a2.d != null && a2.d.a != null) {
                    f fVar = a2.d.a;
                    fVar.k = "-1";
                    fVar.l = null;
                }
                c.this.a("env", c.this.g.getEnvParamsMap());
            }

            @Override // com.sankuai.waimai.mach.common.j
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3de3e61b7fc08504cfdeecd858aab853", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3de3e61b7fc08504cfdeecd858aab853");
                    return;
                }
                i a2 = i.a();
                Object[] objArr3 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect3 = i.a;
                if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "68145abd92b3824a4f0d9ad72b98b343", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "68145abd92b3824a4f0d9ad72b98b343");
                } else if (a2.d != null && a2.d.a != null) {
                    f fVar = a2.d.a;
                    fVar.k = str;
                    fVar.l = str2;
                }
                c.this.a("env", c.this.g.getEnvParamsMap());
            }
        };
        this.g = mach;
        this.g.setUserLoginListener(this.m);
        this.j = new Handler(Looper.getMainLooper());
        com.sankuai.waimai.mach.jsv8.jsexecutor.b a2 = com.sankuai.waimai.mach.jsv8.jsexecutor.b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.jsv8.jsexecutor.b.a;
        this.i = PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "b7f28a36e62c97ed58aa3b2b31f16a97", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "b7f28a36e62c97ed58aa3b2b31f16a97")).longValue() : a2.b.incrementAndGet();
        this.d = "defaultObject" + this.i;
        this.k = new a(this);
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a(e eVar, Activity activity, com.sankuai.waimai.mach.model.data.a aVar) {
        Object[] objArr = {eVar, activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b18df1b67ac230ca8c57be72bef9d2f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b18df1b67ac230ca8c57be72bef9d2f0");
            return;
        }
        this.c = eVar;
        this.h = aVar;
        MonitorManager.RECORD_STEP(this.h, "init_v8jse_start");
        if (!TextUtils.isEmpty(this.c.l)) {
            MonitorManager.RECORD_STEP(this.h, "create_js_executor_start");
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "492eeeb9e9c82f44f3bd81e2e2bf7c9b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "492eeeb9e9c82f44f3bd81e2e2bf7c9b");
            } else {
                this.e = true;
                if (!h()) {
                    this.b = com.sankuai.waimai.mach.jsv8.jsexecutor.b.a().a(this.i);
                    this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.3
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                        public final void a() {
                            boolean z;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "796667ee63833dce7aaceb6846c90903", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "796667ee63833dce7aaceb6846c90903");
                                return;
                            }
                            com.sankuai.waimai.mach.jsv8.jsexecutor.a aVar2 = c.this.b;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.mach.jsv8.jsexecutor.a.a;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "90f3def5cff3d001b60e702aece5500a", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "90f3def5cff3d001b60e702aece5500a")).booleanValue();
                            } else {
                                z = (aVar2.c == null || aVar2.c.isReleased()) ? false : true;
                            }
                            if (z) {
                                return;
                            }
                            if (c.this.h != null) {
                                MonitorManager.RECORD_STEP(c.this.h, "create_js_executor_real_start");
                            }
                            com.sankuai.waimai.mach.jsv8.jsexecutor.a aVar3 = c.this.b;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.mach.jsv8.jsexecutor.a.a;
                            if (PatchProxy.isSupport(objArr5, aVar3, changeQuickRedirect5, false, "be1b83d88967600a85417235795c8870", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, aVar3, changeQuickRedirect5, false, "be1b83d88967600a85417235795c8870");
                            } else {
                                aVar3.b();
                                if (aVar3.c != null) {
                                    aVar3.c.destroy();
                                }
                                aVar3.c = JSRuntime.createJSRuntime();
                                aVar3.d = aVar3.c.getGlobalObject();
                            }
                            com.sankuai.waimai.mach.jsv8.debug.a aVar4 = new com.sankuai.waimai.mach.jsv8.debug.a();
                            JSObject createJSObject = JSObject.createJSObject(c.this.b.c);
                            createJSObject.registerJavaMethod(com.sankuai.waimai.mach.jsv8.debug.a.a(), aVar4);
                            c.this.b.d.add("console", createJSObject);
                            createJSObject.close();
                        }

                        @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                        public final void a(Exception exc) {
                            Object[] objArr3 = {exc};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5928062af393c1b5797b0dd560cfd5d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5928062af393c1b5797b0dd560cfd5d");
                                return;
                            }
                            super.a(exc);
                            c.this.e = false;
                            com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | JS引擎初始化失败 | 异常信息：" + exc.getMessage());
                        }
                    });
                }
            }
            MonitorManager.RECORD_STEP(this.h, "create_js_executor_END");
            com.sankuai.waimai.mach.lifecycle.e.a().a(this.k);
            final String str = this.c.l;
            final com.sankuai.waimai.mach.model.data.a aVar2 = this.h;
            Object[] objArr3 = {str, aVar2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d17270019671fc806846c3e08193915a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d17270019671fc806846c3e08193915a");
            } else if (h() && !TextUtils.isEmpty(str)) {
                this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                    public final void a() {
                        String a2;
                        String b;
                        boolean z;
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa0bd14c137e7ba6e04475e6efc80913", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa0bd14c137e7ba6e04475e6efc80913");
                        } else if (c.this.e) {
                            if (c.this.h != null) {
                                MonitorManager.RECORD_STEP(c.this.h, "init_v8jse_real_start");
                            }
                            String str2 = str;
                            JSObject jSObject = c.this.b.d;
                            String str3 = String.format("this.customConfig = {name:'%s'};", c.this.d) + str2;
                            c cVar = c.this;
                            Object[] objArr5 = {str3};
                            ChangeQuickRedirect changeQuickRedirect5 = c.a;
                            if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "f94d18dd63a3412ee1fb117fd1a5e5bd", RobustBitConfig.DEFAULT_VALUE)) {
                                a2 = (String) PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "f94d18dd63a3412ee1fb117fd1a5e5bd");
                            } else {
                                String str4 = "global." + cVar.d + ".MachNative";
                                a2 = com.sankuai.waimai.mach.utils.e.a(com.sankuai.waimai.mach.utils.e.a(com.sankuai.waimai.mach.utils.e.a(com.sankuai.waimai.mach.utils.e.a(str3, "MachNative", str4, "invokeKNB"), "MachNative", str4, "invokeNativeBridge"), "MachNative", str4, "renderNativeUI"), "MachNative", str4, "sendEvent");
                            }
                            c cVar2 = c.this;
                            Object[] objArr6 = {a2};
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr6, cVar2, changeQuickRedirect6, false, "85c053e433f0b7623d9ea5644e409949", RobustBitConfig.DEFAULT_VALUE)) {
                                b = (String) PatchProxy.accessDispatch(objArr6, cVar2, changeQuickRedirect6, false, "85c053e433f0b7623d9ea5644e409949");
                            } else {
                                String str5 = "global." + cVar2.d + ".machTimer";
                                b = com.sankuai.waimai.mach.utils.e.b(com.sankuai.waimai.mach.utils.e.b(com.sankuai.waimai.mach.utils.e.b(com.sankuai.waimai.mach.utils.e.b(a2, "setTimeout", str5, "setTimeout"), "clearTimeout", str5, "clearTimeout"), "setInterval", str5, "setInterval"), "clearInterval", str5, "clearInterval");
                            }
                            com.sankuai.waimai.mach.jsv8.jsexecutor.a aVar3 = c.this.b;
                            Object[] objArr7 = {b, "app.js"};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.mach.jsv8.jsexecutor.a.a;
                            if (PatchProxy.isSupport(objArr7, aVar3, changeQuickRedirect7, false, "7b521fabb13fc61fe43cec5dd04ceee9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, aVar3, changeQuickRedirect7, false, "7b521fabb13fc61fe43cec5dd04ceee9");
                            } else {
                                aVar3.b();
                                aVar3.c.executeVoidScript(b, "app.js");
                            }
                            c.this.f = (JSObject) jSObject.get(c.this.d);
                            c cVar3 = c.this;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = c.a;
                            if (PatchProxy.isSupport(objArr8, cVar3, changeQuickRedirect8, false, "7f47236dcf14e2f3e968b526d90a9586", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, cVar3, changeQuickRedirect8, false, "7f47236dcf14e2f3e968b526d90a9586");
                            } else if (cVar3.g()) {
                                JSObject createJSObject = JSObject.createJSObject(cVar3.b.c);
                                createJSObject.registerJavaMethod("sendEvent", new com.sankuai.waimai.mach.jsv8.jsinterface.e(cVar3.g));
                                createJSObject.registerJavaMethod("invokeNativeBridge", new com.sankuai.waimai.mach.jsv8.jsinterface.b(cVar3.g));
                                createJSObject.registerJavaMethod("renderNativeUI", new d(cVar3.g));
                                createJSObject.registerJavaMethod("invokeKNB", new com.sankuai.waimai.mach.jsv8.jsinterface.c(cVar3.g));
                                cVar3.f.add("MachNative", createJSObject);
                                createJSObject.close();
                            }
                            c cVar4 = c.this;
                            Object[] objArr9 = {b};
                            ChangeQuickRedirect changeQuickRedirect9 = c.a;
                            if (PatchProxy.isSupport(objArr9, cVar4, changeQuickRedirect9, false, "ed6224145d6b4d14ee7c496edea0dc75", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr9, cVar4, changeQuickRedirect9, false, "ed6224145d6b4d14ee7c496edea0dc75")).booleanValue();
                            } else {
                                z = !TextUtils.isEmpty(b) && (b.contains("setTimeout") || b.contains("clearTimeout") || b.contains("setInterval") || b.contains("clearInterval"));
                            }
                            if (z) {
                                c cVar5 = c.this;
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = c.a;
                                if (PatchProxy.isSupport(objArr10, cVar5, changeQuickRedirect10, false, "0ff8a0e8cc047ac9996498e3f25de2ef", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, cVar5, changeQuickRedirect10, false, "0ff8a0e8cc047ac9996498e3f25de2ef");
                                } else if (cVar5.g()) {
                                    JSRuntime jSRuntime = cVar5.b.c;
                                    JSObject createJSObject2 = JSObject.createJSObject(jSRuntime);
                                    com.sankuai.waimai.mach.jsv8.jsinterface.timer.f fVar = new com.sankuai.waimai.mach.jsv8.jsinterface.timer.f(cVar5.g);
                                    fVar.a(jSRuntime);
                                    createJSObject2.registerJavaMethod("setTimeout", fVar);
                                    createJSObject2.registerJavaMethod("clearTimeout", new com.sankuai.waimai.mach.jsv8.jsinterface.timer.b(cVar5.g));
                                    com.sankuai.waimai.mach.jsv8.jsinterface.timer.e eVar2 = new com.sankuai.waimai.mach.jsv8.jsinterface.timer.e(cVar5.g);
                                    eVar2.a(jSRuntime);
                                    createJSObject2.registerJavaMethod("setInterval", eVar2);
                                    createJSObject2.registerJavaMethod("clearInterval", new com.sankuai.waimai.mach.jsv8.jsinterface.timer.a(cVar5.g));
                                    cVar5.f.add("machTimer", createJSObject2);
                                    createJSObject2.close();
                                }
                            }
                            MonitorManager.RECORD_STEP(aVar2, "init_v8jse_end");
                        }
                    }

                    @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                    public final void a(Exception exc) {
                        Object[] objArr4 = {exc};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b5b16ceac106239254bdb5a8a9fd7ab", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b5b16ceac106239254bdb5a8a9fd7ab");
                            return;
                        }
                        super.a(exc);
                        com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | loadBundleJs 执行异常 | " + exc.getMessage());
                    }
                });
            }
            a("env", this.g.getEnvParamsMap());
            return;
        }
        this.e = false;
        this.b = null;
    }

    private boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95d8f9537b0b55c7141c4c7cda742cf8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95d8f9537b0b55c7141c4c7cda742cf8")).booleanValue() : this.b != null && this.b.a();
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final boolean f() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da036e5fbeed01e87b6c1a0b936b903c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da036e5fbeed01e87b6c1a0b936b903c")).booleanValue();
        }
        if (this.b != null) {
            com.sankuai.waimai.mach.jsv8.jsexecutor.a aVar = this.b;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.mach.jsv8.jsexecutor.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f4b91675349d749a29e2be48855c20f0", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f4b91675349d749a29e2be48855c20f0")).booleanValue();
            } else {
                z = Thread.currentThread() == aVar.b;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void b(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a719f12e7f8f0a33a90eeb01e25948", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a719f12e7f8f0a33a90eeb01e25948");
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        if (map == null) {
            linkedList.add(new HashMap());
        } else {
            linkedList.add(map);
        }
        a("onReceiveEvent", linkedList);
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a(Map<String, Object> map, final b.a aVar, final Handler handler) {
        Object[] objArr = {map, aVar, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fddcb36d9e2499c3be0dea07639a01e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fddcb36d9e2499c3be0dea07639a01e");
            return;
        }
        if (this.h != null) {
            MonitorManager.RECORD_STEP(this.h, "v8jse_preprocessData_start");
        }
        if (TextUtils.isEmpty(this.c.l)) {
            a(map, null, aVar, handler);
            return;
        }
        a("api", map);
        if (!this.c.e()) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f17ae6259f11a6173f401c7c5c77a1ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f17ae6259f11a6173f401c7c5c77a1ef");
            } else {
                a("initProps", (List<Object>) null);
            }
            Object[] objArr3 = {aVar, handler};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d993f6420887109deb0c5412d382b39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d993f6420887109deb0c5412d382b39");
                return;
            } else if (!h()) {
                a(aVar, handler, new Exception("jsExecutor invalid"));
                return;
            } else {
                this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                    public final void a() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "48c98ed8a755d98d61e394f24b3d14ec", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "48c98ed8a755d98d61e394f24b3d14ec");
                        } else if (!c.this.g()) {
                            c.this.a(null, null, aVar, handler);
                        } else {
                            HashMap hashMap = new HashMap();
                            JSValue jSValue = c.this.f.get("api");
                            if (jSValue instanceof JSObject) {
                                JSObject jSObject = (JSObject) jSValue;
                                hashMap.putAll(com.sankuai.waimai.mach.utils.b.a(jSObject.toJson()));
                                jSObject.close();
                                HashMap hashMap2 = new HashMap();
                                JSValue jSValue2 = c.this.f.get("value");
                                if (jSValue2 instanceof JSObject) {
                                    JSObject jSObject2 = (JSObject) jSValue2;
                                    hashMap2.putAll(com.sankuai.waimai.mach.utils.b.a(jSObject2.toJson()));
                                    jSObject2.close();
                                } else if (jSValue2 != null) {
                                    jSValue2.close();
                                }
                                c.this.a(hashMap, hashMap2, aVar, handler);
                                if (c.this.h != null) {
                                    MonitorManager.RECORD_STEP(c.this.h, "v8jse_preprocessData_end");
                                    return;
                                }
                                return;
                            }
                            if (jSValue != null) {
                                jSValue.close();
                            }
                            c.this.a(aVar, handler, new Exception("apidata invalid"));
                        }
                    }

                    @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                    public final void a(Exception exc) {
                        Object[] objArr4 = {exc};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e0b701fed451060812c687eb6ee7ed6f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e0b701fed451060812c687eb6ee7ed6f");
                            return;
                        }
                        super.a(exc);
                        c.this.a(aVar, handler, exc);
                        com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | asyncGetApiAndValue 执行异常 | " + exc.getMessage());
                    }
                });
                return;
            }
        }
        a(map, null, aVar, handler);
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a(final String str, final List<Object> list, final b.InterfaceC1011b interfaceC1011b) {
        Object[] objArr = {str, list, interfaceC1011b};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b9cad0d133c806241050865edd75bf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b9cad0d133c806241050865edd75bf8");
        } else if (TextUtils.isEmpty(str) || !h()) {
        } else {
            this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6707dcdc7059bd2d862458a0d8169b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6707dcdc7059bd2d862458a0d8169b1");
                    } else if (c.this.g()) {
                        if (!c.this.f.has(str)) {
                            c.a(c.this, interfaceC1011b, (Object) null);
                            return;
                        }
                        JSValue executeFunction = c.this.f.executeFunction(str, list != null ? JSArray.createJSArray(c.this.b.c, new JSONArray((Collection) list)) : null);
                        if (executeFunction != null) {
                            c.a(c.this, interfaceC1011b, executeFunction.getValue());
                            executeFunction.close();
                            return;
                        }
                        c.a(c.this, interfaceC1011b, (Object) null);
                    }
                }

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fdbfab59bd99b9525521e6409508686e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fdbfab59bd99b9525521e6409508686e");
                        return;
                    }
                    super.a(exc);
                    c.a(c.this, interfaceC1011b, (Object) null);
                    com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | JS方法执行异常，方法名：" + str + " | 异常信息：" + exc.getMessage());
                }
            });
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final Object b(String str, List<Object> list) {
        Object obj;
        JSValue executeFunction;
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfb69781f5295e43935b6a7814d26ba", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfb69781f5295e43935b6a7814d26ba");
        }
        try {
            if (g() && this.f.has(str) && (executeFunction = this.f.executeFunction(str, JSArray.createJSArray(this.b.c, new JSONArray((Collection) list)))) != null) {
                obj = executeFunction.getValue();
                try {
                    executeFunction.close();
                    return obj;
                } catch (Exception e) {
                    e = e;
                    if (this.g != null) {
                        com.sankuai.waimai.mach.render.d.a(this.g, e);
                    }
                    HashMap hashMap = new HashMap();
                    if (this.g != null) {
                        hashMap.put("template_id", this.g.getTemplateId());
                    }
                    com.sankuai.waimai.mach.e e2 = i.a().e();
                    if (e2 != null) {
                        e2.a("mach_v8jse_js_error", "v8jse_js异常", e.getMessage(), hashMap);
                        return obj;
                    }
                    return obj;
                }
            }
            return null;
        } catch (Exception e3) {
            e = e3;
            obj = null;
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a(String str, List<Object> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64badd612e383334ecb789ac74301318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64badd612e383334ecb789ac74301318");
        } else {
            a(str, list, (b.InterfaceC1011b) null);
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a(final String str, final Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b48e274dc451f4b3a08bc0ef3bcbcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b48e274dc451f4b3a08bc0ef3bcbcd");
        } else if (TextUtils.isEmpty(str) || com.sankuai.waimai.mach.utils.e.a(map) || !h()) {
        } else {
            this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9110b89706d784d82ce51a6b65c7b7fc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9110b89706d784d82ce51a6b65c7b7fc");
                        return;
                    }
                    MonitorManager.RECORD_STEP(c.this.h, "v8jse_preprocessData_real_start");
                    if (c.this.g()) {
                        JSObject createJSObject = JSObject.createJSObject(c.this.b.c, new JSONObject(map));
                        c.this.f.add(str, createJSObject);
                        createJSObject.close();
                    }
                }

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0da59d1aae25e6d80eb218290f45dfeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0da59d1aae25e6d80eb218290f45dfeb");
                        return;
                    }
                    super.a(exc);
                    com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | bindDataToJS 执行异常 | " + exc.getMessage());
                }
            });
        }
    }

    boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96987fb30da2c2a2347c90f5406c2b9c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96987fb30da2c2a2347c90f5406c2b9c")).booleanValue() : (this.f == null || this.f.isClosed() || this.f.isNullOrUndefined()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final Map<String, Object> map, final Map<String, Object> map2, final b.a aVar, Handler handler) {
        Object[] objArr = {map, map2, aVar, handler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad9ca850f24b876653137e013e538b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad9ca850f24b876653137e013e538b5");
        } else if (aVar != null) {
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.c.9
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9d049dbc2ea75ac75d0d4a88a39062a3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9d049dbc2ea75ac75d0d4a88a39062a3");
                        } else {
                            aVar.a(map, map2, c.this.h);
                        }
                    }
                });
            } else {
                aVar.a(map, map2, this.h);
            }
        }
    }

    void a(final b.a aVar, Handler handler, final Exception exc) {
        Object[] objArr = {aVar, handler, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed349e8ec564b24a75b323b5a667e8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed349e8ec564b24a75b323b5a667e8cd");
        } else if (aVar != null) {
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.sankuai.waimai.mach.jsv8.c.10
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccd3370b4ac7d828e0279be36cc7b4bd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccd3370b4ac7d828e0279be36cc7b4bd");
                        } else {
                            aVar.a(exc);
                        }
                    }
                });
            } else {
                aVar.a(exc);
            }
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfeda8548a9757255cc659c053507494", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfeda8548a9757255cc659c053507494");
        } else if (this.l.compareAndSet(false, true)) {
            a("created", (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab8b64c6676a0bac5de169e32b66ded", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab8b64c6676a0bac5de169e32b66ded");
        } else {
            a("pageAppear", (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5951d785bb872b676d1c60a7c9d58ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5951d785bb872b676d1c60a7c9d58ca");
        } else {
            a("pageDisappear", (List<Object>) null);
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2c2705cf5b4b2bd2ec94a3cfd52400", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2c2705cf5b4b2bd2ec94a3cfd52400");
        } else {
            i();
        }
    }

    @Override // com.sankuai.waimai.mach.jsv8.b
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08c5edc40d5b2a529b93cf88089916e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08c5edc40d5b2a529b93cf88089916e8");
        } else {
            i();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb76a0e06ae27986b66cc43a4c350fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb76a0e06ae27986b66cc43a4c350fe");
            return;
        }
        com.sankuai.waimai.mach.lifecycle.e.a().b(this.k);
        this.e = false;
        this.l.set(false);
        if (h()) {
            this.b.a(new com.sankuai.waimai.mach.jsv8.jstask.a(this.g) { // from class: com.sankuai.waimai.mach.jsv8.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e7270f8f9d289cf621199c1032776ee", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e7270f8f9d289cf621199c1032776ee");
                    } else if (c.this.f == null || c.this.f.isClosed()) {
                    } else {
                        if (c.this.f.has("destroyed")) {
                            c.this.f.executeVoidFunction("destroyed", null);
                        }
                        c.this.f.close();
                        c.this.f = null;
                        c.this.b.d.delete(c.this.d);
                    }
                }

                @Override // com.sankuai.waimai.mach.jsv8.jstask.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "169aff092c12c640ed82663e33da7264", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "169aff092c12c640ed82663e33da7264");
                        return;
                    }
                    super.a(exc);
                    com.sankuai.waimai.mach.log.b.b("Mach_Js_Engine", c.this.c.j + " | destroyInternal 执行异常 | " + exc.getMessage());
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements com.sankuai.waimai.mach.lifecycle.a {
        public static ChangeQuickRedirect a;
        private WeakReference<c> b;

        public a(c cVar) {
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b78ad861f84eea7c802ea58dbc6dff2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b78ad861f84eea7c802ea58dbc6dff2");
            } else {
                this.b = new WeakReference<>(cVar);
            }
        }

        @Override // com.sankuai.waimai.mach.lifecycle.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "793672d924743114bc2a9ae605ede662", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "793672d924743114bc2a9ae605ede662");
                return;
            }
            c cVar = this.b.get();
            if (cVar != null) {
                cVar.a("applicationBecomeActive", (List<Object>) null);
                cVar.a("applicationEnterForeground", (List<Object>) null);
            }
        }

        @Override // com.sankuai.waimai.mach.lifecycle.a
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73f821a94985ebeb059a468be69eaaa7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73f821a94985ebeb059a468be69eaaa7");
                return;
            }
            c cVar = this.b.get();
            if (cVar != null) {
                cVar.a("applicationResignActive", (List<Object>) null);
                cVar.a("applicationEnterBackground", (List<Object>) null);
            }
        }
    }
}
