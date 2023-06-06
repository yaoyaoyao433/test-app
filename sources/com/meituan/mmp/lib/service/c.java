package com.meituan.mmp.lib.service;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.os.Trace;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.ValueCallback;
import com.dianping.jscore.JSExecutor;
import com.dianping.jscore.JSHeapStatistics;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.ArchiveException;
import com.dianping.jscore.model.Encoding;
import com.meituan.dio.easy.DioFile;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.engine.v;
import com.meituan.mmp.lib.p;
import com.meituan.mmp.lib.service.b;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.trace.h;
import com.meituan.mmp.lib.utils.at;
import com.meituan.mmp.lib.utils.r;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.lib.web.f;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.mmp.main.ab;
import com.meituan.mmp.main.annotation.NeedDependency;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@NeedDependency({JavaScriptInterface.class})
/* loaded from: classes3.dex */
public class c implements com.meituan.mmp.lib.devtools.d, IServiceEngine, b {
    public static ChangeQuickRedirect a;
    public long b;
    private Handler c;
    private JSExecutor d;
    private com.meituan.mmp.lib.web.d e;
    private com.meituan.mmp.lib.web.e f;
    private HandlerThread g;
    private Handler h;
    private volatile boolean i;
    private f j;
    private h k;
    private WeakReference<Thread.UncaughtExceptionHandler> l;
    private com.meituan.mmp.lib.devtools.b m;
    private Map<String, List<String>> n;
    private Map<String, List<String>> o;
    private Runnable p;
    private final Runnable q;

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setMiniApp(m mVar) {
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d611f9a9ef340e78b0f92951f685dd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d611f9a9ef340e78b0f92951f685dd");
            return;
        }
        this.i = false;
        this.q = new Runnable() { // from class: com.meituan.mmp.lib.service.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11b9da1da6dbdf421092126d9dded4a9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11b9da1da6dbdf421092126d9dded4a9");
                    return;
                }
                long c = c.this.c();
                b.a.b("MMP AppEngine used memory heap size: " + c + " bytes,interval");
                p.b(c / 1024);
                c.this.c.postDelayed(this, com.meituan.mmp.lib.config.b.Q());
            }
        };
    }

    public static /* synthetic */ f a(c cVar, f fVar) {
        cVar.j = null;
        return null;
    }

    public static /* synthetic */ void a(c cVar, String str, String str2, String str3, ValueCallback valueCallback, v vVar) {
        String substring;
        Object[] objArr = {str, str2, str3, valueCallback, vVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "b130d88bdbaffdf51ab9e61a9e930daf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "b130d88bdbaffdf51ab9e61a9e930daf");
            return;
        }
        try {
            if ("event: onAppRoute".equals(str)) {
                cVar.k.b.b("service.app.route");
            }
            Trace.beginSection(ab.e(str));
            cVar.e();
            long currentTimeMillis = System.currentTimeMillis();
            String execJS = cVar.d.execJS(str2, str3);
            if (!"unknown".equals(str3)) {
                Object[] objArr2 = {str3};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.update.p.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6d2ef01d985430634ee5ee8028019b54", RobustBitConfig.DEFAULT_VALUE)) {
                    substring = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6d2ef01d985430634ee5ee8028019b54");
                } else {
                    String substring2 = str3.substring(str3.indexOf("pkgsource") + 9 + 1);
                    substring = substring2.substring(substring2.indexOf("/") + 1);
                }
                cVar.d.execJS("if (typeof __mmp_file_timing === 'undefined') {var __mmp_file_timing = {};}__mmp_file_timing['" + substring + "']  = " + currentTimeMillis, null);
            }
            if ("event: onAppRoute".equals(str)) {
                cVar.k.b.a("service.app.route");
            }
            if (valueCallback != null) {
                valueCallback.onReceiveValue(execJS);
            }
        } catch (Exception e) {
            if (vVar != null) {
                com.meituan.mmp.lib.trace.b.a("evaluateJsException", e);
                vVar.a(e);
                return;
            }
            throw e;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void evaluateJavascript(final String str, final String str2, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {str, str2, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5581da824d734332fc05dfa4aa1084de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5581da824d734332fc05dfa4aa1084de");
        } else if (this.i) {
        } else {
            this.c.post(new Runnable() { // from class: com.meituan.mmp.lib.service.c.10
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7296e307d1f3aefcfa6ac1cf03633b06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7296e307d1f3aefcfa6ac1cf03633b06");
                    } else {
                        c.a(c.this, str, str2, "unknown", valueCallback, null);
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.a
    public final void a(final Collection<DioFile> collection, final String str, @Nullable final ValueCallback<String> valueCallback) {
        Object[] objArr = {collection, str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd532f6332938927efe56f76b08971b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd532f6332938927efe56f76b08971b");
        } else if (this.i || collection == null) {
        } else {
            Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.service.c.11
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4af2129482b3fbd5e3b82db1655ccd69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4af2129482b3fbd5e3b82db1655ccd69");
                        return;
                    }
                    final String a2 = d.a(collection, valueCallback);
                    Runnable runnable2 = new Runnable() { // from class: com.meituan.mmp.lib.service.c.11.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b766a1ac57d76adc37572df10e22f4d8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b766a1ac57d76adc37572df10e22f4d8");
                            } else if (c.this.i) {
                            } else {
                                c cVar = c.this;
                                c.a(cVar, "loadFile: combo " + collection.size() + ", " + str, a2, str, valueCallback, valueCallback instanceof v ? (v) valueCallback : null);
                            }
                        }
                    };
                    if (Thread.currentThread() != c.this.g) {
                        c.this.c.post(runnable2);
                    } else {
                        runnable2.run();
                    }
                }
            };
            if (Thread.currentThread() == this.g) {
                runnable.run();
            } else {
                com.meituan.mmp.lib.executor.a.a(runnable);
            }
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void evaluateJsFile(DioFile dioFile, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {dioFile, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1196d341f36b26cac70af2b9298da22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1196d341f36b26cac70af2b9298da22");
        } else {
            a(com.meituan.mmp.lib.utils.h.a(dioFile), dioFile.h(), valueCallback);
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "075e464a7b4910407a70834344f2b4c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "075e464a7b4910407a70834344f2b4c9");
            return;
        }
        Trace.beginSection("prepareJSExecutor");
        this.d = JSExecutor.create();
        this.d.injectGlobalJSObject("HeraJSCore", new Value(new Encoding() { // from class: com.meituan.mmp.lib.service.c.12
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.model.Encoding
            public final JSONObject encode() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed2755540629a816486470143d804f9e", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed2755540629a816486470143d804f9e") : new JSONObject();
            }

            @Override // com.dianping.jscore.model.Encoding
            public final String[] getFunctionNames() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc79462477d159ec0e466cfde3981445", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc79462477d159ec0e466cfde3981445") : new String[]{"publishHandler", "invokeHandler"};
            }

            @Override // com.dianping.jscore.model.Encoding
            public final JavaScriptInterface[] getFunctions() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3eac106ef756bb896a1cc496ac307e32", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptInterface[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3eac106ef756bb896a1cc496ac307e32") : new JavaScriptInterface[]{new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.12.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.jscore.JavaScriptInterface
                    public final Value exec(Value[] valueArr) {
                        Object[] objArr3 = {valueArr};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6128349ab678b3419bb30f23ba7e775b", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6128349ab678b3419bb30f23ba7e775b");
                        }
                        if (valueArr.length != 3 || c.this.e == null) {
                            return null;
                        }
                        try {
                            c.this.e.publishHandler(valueArr[0].string(), valueArr[1].string(), valueArr[2].string());
                            return null;
                        } catch (ArchiveException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }, new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.12.2
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.jscore.JavaScriptInterface
                    public final Value exec(Value[] valueArr) {
                        Object[] objArr3 = {valueArr};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c5acb231ebfec4e2a91678165a442b12", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c5acb231ebfec4e2a91678165a442b12");
                        }
                        if (valueArr.length != 3 || c.this.e == null) {
                            return null;
                        }
                        try {
                            String invokeHandler = c.this.e.invokeHandler(valueArr[0].string(), valueArr[1].string(), valueArr[2].string());
                            if (TextUtils.isEmpty(invokeHandler)) {
                                return null;
                            }
                            return new Value(invokeHandler);
                        } catch (ArchiveException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }};
            }
        }));
        this.d.injectGlobalJSObject("MMPBridge", new Value(new Encoding() { // from class: com.meituan.mmp.lib.service.c.13
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.model.Encoding
            public final JSONObject encode() {
                JSONObject jSONObject;
                JSONObject jSONObject2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fafe7405c4af678dee97c75984a3e41", RobustBitConfig.DEFAULT_VALUE)) {
                    return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fafe7405c4af678dee97c75984a3e41");
                }
                if (c.this.n != null) {
                    jSONObject = new JSONObject(c.this.n);
                } else {
                    jSONObject = new JSONObject();
                }
                if (c.this.o != null) {
                    jSONObject2 = new JSONObject(c.this.o);
                } else {
                    jSONObject2 = new JSONObject();
                }
                com.meituan.mmp.lib.trace.b.b("MMPMsi", "MMPBridge.allowList = " + jSONObject.toString());
                com.meituan.mmp.lib.trace.b.b("MMPMsi", "MMPBridge.forbidList = " + jSONObject2.toString());
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("allowList", jSONObject);
                    jSONObject3.put("forbidList", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject3;
            }

            @Override // com.dianping.jscore.model.Encoding
            public final String[] getFunctionNames() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e80b0ef3fc490617521715c008112b8", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e80b0ef3fc490617521715c008112b8") : new String[]{"syncInvoke", "asyncInvoke"};
            }

            @Override // com.dianping.jscore.model.Encoding
            public final JavaScriptInterface[] getFunctions() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9591c427e5182fae22c0b612d35d2b4c", RobustBitConfig.DEFAULT_VALUE) ? (JavaScriptInterface[]) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9591c427e5182fae22c0b612d35d2b4c") : new JavaScriptInterface[]{new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.13.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.jscore.JavaScriptInterface
                    public final Value exec(Value[] valueArr) {
                        Object[] objArr3 = {valueArr};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "72cf531f636d448e20b80b21d888d693", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "72cf531f636d448e20b80b21d888d693");
                        }
                        if (valueArr.length != 1 || c.this.f == null) {
                            return null;
                        }
                        try {
                            String syncInvoke = c.this.f.syncInvoke(valueArr[0].string());
                            if (TextUtils.isEmpty(syncInvoke)) {
                                return null;
                            }
                            return new Value(syncInvoke);
                        } catch (ArchiveException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }, new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.13.2
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.jscore.JavaScriptInterface
                    public final Value exec(Value[] valueArr) {
                        Object[] objArr3 = {valueArr};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b63d3af500c3e33ff00a295309fe2c4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b63d3af500c3e33ff00a295309fe2c4");
                        }
                        if (valueArr.length != 1 || c.this.f == null) {
                            return null;
                        }
                        try {
                            String asyncInvoke = c.this.f.asyncInvoke(valueArr[0].string());
                            if (TextUtils.isEmpty(asyncInvoke)) {
                                return null;
                            }
                            return new Value(asyncInvoke);
                        } catch (ArchiveException e) {
                            e.printStackTrace();
                            return null;
                        }
                    }
                }};
            }
        }));
        this.d.addJavaScriptInterface("importScripts", new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.14
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.JavaScriptInterface
            public final Value exec(Value[] valueArr) {
                Object[] objArr2 = {valueArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57ee17451961153643d8a01087c894b2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57ee17451961153643d8a01087c894b2");
                }
                try {
                    if (valueArr.length > 0) {
                        String[] readStringArray = valueArr[0].getUnarchived().readStringArray();
                        String readString = valueArr.length == 2 ? valueArr[1].getUnarchived().readString() : null;
                        if (c.this.e != null) {
                            c.this.e.importScripts(readStringArray, readString);
                        }
                    }
                } catch (ArchiveException e) {
                    com.meituan.mmp.lib.trace.b.a("importScriptsException", e);
                }
                return null;
            }
        });
        this.d.addJavaScriptInterface("console_log", new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.15
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.JavaScriptInterface
            public final Value exec(Value[] valueArr) {
                Object[] objArr2 = {valueArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64af33637d473ed526d5429e08f47347", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64af33637d473ed526d5429e08f47347");
                }
                if (valueArr.length == 1) {
                    try {
                        Log.e("console_log", valueArr[0].string());
                        return null;
                    } catch (ArchiveException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        });
        this.d.injectGlobalJSObject("platform", new Value("Android"));
        this.d.execJS("function _toConsumableArray(arr) { return _arrayWithoutHoles(arr) || _iterableToArray(arr) || _nonIterableSpread(); }\n\nfunction _nonIterableSpread() { throw new TypeError(\"Invalid attempt to spread non-iterable instance\"); }\n\nfunction _iterableToArray(iter) { if (Symbol.iterator in Object(iter) || Object.prototype.toString.call(iter) === \"[object Arguments]\") return Array.from(iter); }\n\nfunction _arrayWithoutHoles(arr) { if (Array.isArray(arr)) { for (var i = 0, arr2 = new Array(arr.length); i < arr.length; i++) { arr2[i] = arr[i]; } return arr2; } }\n\nvar inject_method_map = {};\nvar inject_method_id = 0;\n\nvar __setTimer = function __setTimer(is_loop, code, millisec) {\n  if (arguments.length > 3 && typeof code == 'function') {\n    var src_code = code;\n\n    code = function code() {\n      src_code.apply(void 0, _toConsumableArray(Array.prototype.slice.call(arguments, 2)));\n    };\n  }\n\n  inject_method_id = inject_method_id + 1;\n  inject_method_map[inject_method_id] = code;\n  jsc_setTimer(is_loop, inject_method_id, millisec);\n  return inject_method_id;\n};\n\nvar setTimeout = function setTimeout() {\n  return __setTimer.apply(void 0, [false].concat(Array.prototype.slice.call(arguments)));\n};\n\nvar setInterval = function setInterval() {\n  return __setTimer.apply(void 0, [true].concat(Array.prototype.slice.call(arguments)));\n};\n\nvar clearTimeout = function clearTimeout(id_of_settimeout) {\n  delete inject_method_map[id_of_settimeout];\n  jsc_clearTimer(id_of_settimeout);\n};\n\nvar clearInterval = clearTimeout;\n\nvar jsc_runTimer = function jsc_runTimer(id_of_method, is_loop) {\n  var code = inject_method_map[id_of_method];\n\n  if (typeof code === 'function') {\n    code();\n  } else if (typeof code === 'string') {\n    eval(code);\n  }\n\n  if (!is_loop) {\n    delete inject_method_map[id_of_method];\n  }\n};", "unknown");
        this.d.addJavaScriptInterface("jsc_setTimer", new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.16
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.JavaScriptInterface
            public final Value exec(Value[] valueArr) {
                Object[] objArr2 = {valueArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e57ceba68917f5370545b407dfe77f0", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e57ceba68917f5370545b407dfe77f0");
                }
                if (valueArr.length == 3) {
                    try {
                        final boolean bool = valueArr[0].bool();
                        final int intValue = valueArr[1].number().intValue();
                        final long longValue = valueArr[2].number().longValue();
                        Message obtain = Message.obtain(c.this.h, intValue);
                        obtain.obj = new Runnable() { // from class: com.meituan.mmp.lib.service.c.16.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30159ce3da3ffa257db785ee05505c62", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30159ce3da3ffa257db785ee05505c62");
                                    return;
                                }
                                Trace.beginSection("runTimer");
                                JSExecutor jSExecutor = c.this.d;
                                jSExecutor.execJS("jsc_runTimer(" + intValue + ", " + bool + CommonConstant.Symbol.BRACKET_RIGHT, "unknown");
                                Trace.endSection();
                                if (bool) {
                                    Message obtain2 = Message.obtain(c.this.h, intValue);
                                    obtain2.obj = this;
                                    c.this.h.sendMessageDelayed(obtain2, longValue);
                                }
                            }
                        };
                        c.this.h.sendMessageDelayed(obtain, longValue);
                        return null;
                    } catch (ArchiveException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
                return null;
            }
        });
        this.d.addJavaScriptInterface("jsc_clearTimer", new JavaScriptInterface() { // from class: com.meituan.mmp.lib.service.c.17
            public static ChangeQuickRedirect a;

            @Override // com.dianping.jscore.JavaScriptInterface
            public final Value exec(Value[] valueArr) {
                Object[] objArr2 = {valueArr};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "427381400685022db95bd5268a6ee15e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "427381400685022db95bd5268a6ee15e");
                }
                try {
                    if (valueArr.length == 1 && valueArr[0].isNumber()) {
                        c.this.h.removeMessages(valueArr[0].number().intValue());
                        return null;
                    }
                    return null;
                } catch (ArchiveException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        });
        Trace.endSection();
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void launch(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfad3ca7da113cdbff3170503bd01e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfad3ca7da113cdbff3170503bd01e97");
            return;
        }
        this.k.b.b("service.load");
        this.k.b.b("service.engine.init");
        w.a().e.a("native_js_engine_init_begin");
        this.g = new at("JSC_Runtime", -2);
        this.g.start();
        this.g.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.meituan.mmp.lib.service.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
                Object[] objArr2 = {thread, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "be036760138b75800a784a8016e2d071", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "be036760138b75800a784a8016e2d071");
                } else if (c.this.l == null || (uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) c.this.l.get()) == null) {
                } else {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        });
        this.c = new Handler(this.g.getLooper());
        this.h = new Handler(this.g.getLooper()) { // from class: com.meituan.mmp.lib.service.c.3
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efe5f6f20ac50c095d482134e162f8ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efe5f6f20ac50c095d482134e162f8ac");
                } else if (message.obj instanceof Runnable) {
                    ((Runnable) message.obj).run();
                }
            }
        };
        this.c.post(new Runnable() { // from class: com.meituan.mmp.lib.service.c.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ed4c15acafb407fbd3ed497fc4cbb0da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ed4c15acafb407fbd3ed497fc4cbb0da");
                    return;
                }
                try {
                    Process.setThreadPriority(0);
                    c.this.b();
                } catch (Exception e) {
                    if (c.this.j != null) {
                        c.this.j.a(e);
                    }
                    c.this.release();
                }
                if (c.this.e()) {
                    com.meituan.mmp.lib.devtools.b unused = c.this.m;
                }
                w.a().e.a("native_js_engine_init_end");
                c.this.k.b.a("service.engine.init");
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "df2f5f2a390d6b9bc5d1d7cec49db4a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "df2f5f2a390d6b9bc5d1d7cec49db4a5");
        } else {
            a(new b.a() { // from class: com.meituan.mmp.lib.service.c.5
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.service.b.a
                public final void a(long j) {
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cce90173686585495345bae216b4d91c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cce90173686585495345bae216b4d91c");
                        return;
                    }
                    c.this.b = j;
                    p.a(j);
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setReporter(h hVar) {
        this.k = hVar;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void relaunch() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67aa302f6111c2884077f1cf42638367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67aa302f6111c2884077f1cf42638367");
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        final JSExecutor jSExecutor = this.d;
        this.c.post(new Runnable() { // from class: com.meituan.mmp.lib.service.c.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d8a8379d0efbcf9739c794abed6f1e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d8a8379d0efbcf9739c794abed6f1e8");
                    return;
                }
                c.this.b();
                if (jSExecutor != null) {
                    jSExecutor.destroy();
                }
            }
        });
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setJsHandler(com.meituan.mmp.lib.interfaces.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "428b3e484e29faa8e01c8e28b0915389", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "428b3e484e29faa8e01c8e28b0915389");
            return;
        }
        this.e = new com.meituan.mmp.lib.web.d(bVar);
        this.f = new com.meituan.mmp.lib.web.e(bVar);
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setSupportMsiApis(Map<String, List<String>> map, Map<String, List<String>> map2) {
        this.n = map;
        this.o = map2;
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dfbf5c4ec110554bd7a24344e01e7d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dfbf5c4ec110554bd7a24344e01e7d2");
        } else if (this.i) {
        } else {
            this.i = true;
            e();
            this.c.postDelayed(new Runnable() { // from class: com.meituan.mmp.lib.service.c.7
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae6313c39a686ac29073aaaa89cb2dba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae6313c39a686ac29073aaaa89cb2dba");
                        return;
                    }
                    if (c.this.d != null) {
                        c.this.d.destroy();
                    }
                    c.this.g.quit();
                    c.this.setJsHandler(null);
                    c.a(c.this, null);
                }
            }, 0L);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a4faff108261233ad2ff3b0f65d196f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a4faff108261233ad2ff3b0f65d196f");
            } else {
                if (this.p != null) {
                    this.c.removeCallbacks(this.p);
                }
                this.c.removeCallbacks(this.q);
            }
            this.h.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setOnJsUncaughtErrorHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Object[] objArr = {uncaughtExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d633945f23e1fbe857f5a7539d55108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d633945f23e1fbe857f5a7539d55108");
        } else {
            this.l = new WeakReference<>(uncaughtExceptionHandler);
        }
    }

    public final long c() {
        JSHeapStatistics heapStatistics;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89542895a436ee2aa154bcefaa92e042", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89542895a436ee2aa154bcefaa92e042")).longValue();
        }
        if (this.d == null || (heapStatistics = this.d.getHeapStatistics()) == null) {
            return 0L;
        }
        return heapStatistics.getUsed_heap_size();
    }

    @Override // com.meituan.mmp.lib.service.b
    public final void a(final b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde5be6ac0a839cf94b3c41d34e6e053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde5be6ac0a839cf94b3c41d34e6e053");
            return;
        }
        this.p = new Runnable() { // from class: com.meituan.mmp.lib.service.c.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03e4fcc75d6109743de336b308eda28e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03e4fcc75d6109743de336b308eda28e");
                    return;
                }
                long c = c.this.c();
                b.a.b("MMP AppEngine used memory heap size: " + c + " bytes");
                long j = c / 1024;
                if (aVar != null) {
                    aVar.a(j);
                }
            }
        };
        this.c.post(this.p);
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdbcf650457d7285a530413e447903e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdbcf650457d7285a530413e447903e6");
            return;
        }
        this.c.removeCallbacks(this.q);
        if (com.meituan.mmp.lib.config.b.P()) {
            com.meituan.mmp.lib.trace.b.b("JSCServiceEngine", "disableGetJsMemSizeInterval is true");
            return;
        }
        String format = String.format("%s:%s", p.b(), p.c());
        com.meituan.mmp.lib.trace.b.b("JSCServiceEngine", "startLoopGetJSMemSize currentPagePath:" + format);
        if (com.meituan.mmp.lib.config.b.i(format)) {
            com.meituan.mmp.lib.trace.b.b("JSCServiceEngine", "startLoopGetJSMemSize page in blacklist");
        } else if (com.meituan.mmp.lib.config.b.h(format)) {
            this.c.postDelayed(this.q, 0L);
        } else {
            com.meituan.mmp.lib.trace.b.b("JSCServiceEngine", "startLoopGetJSMemSize page not in whitelist");
        }
    }

    @Override // com.meituan.mmp.lib.service.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e5d0f1382f293a44e5666a675c090b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e5d0f1382f293a44e5666a675c090b");
        } else {
            this.c.post(new Runnable() { // from class: com.meituan.mmp.lib.service.c.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "897a2671274b3aa387b698d960c76ae1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "897a2671274b3aa387b698d960c76ae1");
                    } else if (c.this.d != null) {
                        long c = c.this.c();
                        c.this.d.garbageCollect();
                        long c2 = c - c.this.c();
                        b.a.b("MMP AppEngine performing V8 GC, memory released: " + r.a(c2));
                    }
                }
            });
        }
    }

    @Override // com.meituan.mmp.lib.service.IServiceEngine
    public void setOnEngineInitFailedListener(f fVar) {
        this.j = fVar;
    }

    @Override // com.meituan.mmp.lib.devtools.d
    public final void a(com.meituan.mmp.lib.devtools.b bVar) {
        this.m = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55a7e1b511b6cf6dce9db42067dfb1da", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55a7e1b511b6cf6dce9db42067dfb1da")).booleanValue() : (!MMPEnvHelper.isInited() || MMPEnvHelper.getEnvInfo().isProdEnv() || this.m == null) ? false : true;
    }
}
