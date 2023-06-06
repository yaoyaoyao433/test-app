package com.dianping.picassocontroller.jse;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import com.dianping.jscore.JSRuntimeException;
import com.dianping.jscore.JavaScriptInterface;
import com.dianping.jscore.SOLibraryLoader;
import com.dianping.jscore.Value;
import com.dianping.jscore.model.Encoding;
import com.dianping.picasso.ParsingJSHelper;
import com.dianping.picasso.Picasso;
import com.dianping.picasso.PicassoEnvironment;
import com.dianping.picasso.PicassoManager;
import com.dianping.picasso.PicassoTextUtils;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picasso.PicassoViewWrapperUtil;
import com.dianping.picasso.SizeToFitListJavaScriptInterface;
import com.dianping.picasso.model.params.TextViewParams;
import com.dianping.picasso.view.command.ViewCommandJSI;
import com.dianping.picassocontroller.debug.j;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static final String g = "c";
    private static AtomicInteger i = new AtomicInteger();
    public final Handler b;
    com.dianping.picassocontroller.jse.a c;
    public j d;
    public com.dianping.picassocontroller.monitor.a e;
    a f;
    private String h;
    private Context j;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ String a(c cVar, String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "1464d535cba07c26a204635361011eed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "1464d535cba07c26a204635361011eed") : String.format("Picasso.registerModule('%s',(function(__module){return (function(module,exports,require){\n%s;\nreturn module.exports;})(__module,__module.exports,Picasso.require)})({exports:{}}))", str, str2);
    }

    public static /* synthetic */ void a(c cVar, Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c9def1232b09219634c8201f8cc10b69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c9def1232b09219634c8201f8cc10b69");
            return;
        }
        byte b = PicassoEnvironment.getPicassoEnvironment(context).appID < 0 ? (byte) 0 : (byte) 1;
        long e = cVar.e.e("init_all");
        Object[] objArr2 = {context, new Long(e), Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = com.dianping.picassocontroller.monitor.h.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ce27cde3e4bab62962627382793794d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ce27cde3e4bab62962627382793794d4");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("PicassoEngineInitTime", Float.valueOf((float) e));
        hashMap.put("PicassoEngineInitSuccess", Float.valueOf(b != 0 ? 1.0f : 0.0f));
        com.dianping.picassocontroller.monitor.h.a(context, (Map<String, String>) null, hashMap);
    }

    public static /* synthetic */ void a(c cVar, final com.dianping.picassocontroller.jse.a aVar, final Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "8e43a1ff5edd6686de310ba928b9cd20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "8e43a1ff5edd6686de310ba928b9cd20");
            return;
        }
        cVar.b(aVar, context);
        Object[] objArr2 = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "25f54aebd15c7b8ee574596a1ab55cec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "25f54aebd15c7b8ee574596a1ab55cec");
        } else {
            aVar.a("picassoLog", new JavaScriptInterface() { // from class: com.dianping.picassocontroller.jse.c.10
                public static ChangeQuickRedirect a;

                @Override // com.dianping.jscore.JavaScriptInterface
                public final Value exec(Value[] valueArr) {
                    Object[] objArr3 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d4663a7a448a56aba1761bbb348ffc5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d4663a7a448a56aba1761bbb348ffc5");
                    }
                    try {
                        String string = valueArr[0].string();
                        int intValue = valueArr[1].number().intValue();
                        if (intValue == 0) {
                            Log.e(ParsingJSHelper.PICASSO_LOG_TAG, string);
                        }
                        com.dianping.picassocontroller.debug.c.a().a(string, intValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return new Value();
                }
            });
            aVar.a("nativeSetTimeout", new JavaScriptInterface() { // from class: com.dianping.picassocontroller.jse.c.11
                public static ChangeQuickRedirect a;

                @Override // com.dianping.jscore.JavaScriptInterface
                public final Value exec(Value[] valueArr) {
                    Object[] objArr3 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "108e05fdabf8fd0c90a2388f2106a1b7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "108e05fdabf8fd0c90a2388f2106a1b7");
                    }
                    try {
                        long longValue = valueArr[0].number().longValue();
                        final long longValue2 = valueArr[1].number().longValue();
                        String str = "setTimeout";
                        String str2 = "setTimeout";
                        final com.dianping.picassocontroller.vc.e eVar = com.dianping.picassocontroller.vc.c.b != null ? com.dianping.picassocontroller.vc.c.b.get() : null;
                        if (eVar != null) {
                            str = eVar.l.b;
                            str2 = eVar.i;
                        }
                        final String str3 = str;
                        final String str4 = str2;
                        c.this.b.postDelayed(new Runnable() { // from class: com.dianping.picassocontroller.jse.c.11.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f2b617dedb7cb98b57798160b8009142", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f2b617dedb7cb98b57798160b8009142");
                                    return;
                                }
                                try {
                                    c.this.a(eVar, "callTimerCallback", Long.valueOf(longValue2));
                                } catch (Exception e) {
                                    Log.e(c.g, PicassoUtils.reportException(e, str3, str4, null));
                                }
                            }
                        }, longValue);
                        return new Value(longValue2);
                    } catch (Exception e) {
                        e.printStackTrace();
                        return new Value();
                    }
                }
            });
            aVar.a("nativeRequire", new JavaScriptInterface() { // from class: com.dianping.picassocontroller.jse.c.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.jscore.JavaScriptInterface
                public final Value exec(Value[] valueArr) {
                    String str;
                    String a2;
                    String str2;
                    Object[] objArr3 = {valueArr};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e482bbc153f12f927fc867fbfba049c", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Value) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e482bbc153f12f927fc867fbfba049c");
                    }
                    String str3 = "";
                    try {
                        str = valueArr[0].string();
                        try {
                            com.dianping.picassocontroller.monitor.a aVar2 = c.this.e;
                            aVar2.b("require_" + str);
                            if (!com.dianping.picassocontroller.a.b(str)) {
                                Object[] objArr4 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = com.dianping.picassocontroller.b.a;
                                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "a06cdd7b50fcaccbdefeab7744e92ea9", RobustBitConfig.DEFAULT_VALUE)) {
                                    str2 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "a06cdd7b50fcaccbdefeab7744e92ea9");
                                } else {
                                    if (!TextUtils.isEmpty(str)) {
                                        if (str.contains("@")) {
                                            String[] split = str.split("/");
                                            if (split.length > 1) {
                                                str2 = split[split.length - 1];
                                            }
                                        } else {
                                            str2 = str;
                                        }
                                    }
                                    str2 = "";
                                }
                                if (!TextUtils.isEmpty(str2)) {
                                    com.dianping.picassocontroller.monitor.a aVar3 = c.this.e;
                                    aVar3.b("load" + str);
                                    Context context2 = context;
                                    com.dianping.picassocontroller.b.a(str, PicassoUtils.readAssetFile(context2, str2 + ".js"));
                                    com.dianping.picassocontroller.monitor.a aVar4 = c.this.e;
                                    aVar4.c("load" + str);
                                }
                            }
                            a2 = com.dianping.picassocontroller.a.a(str);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = "";
                    }
                    try {
                        if (TextUtils.isEmpty(a2)) {
                            com.dianping.codelog.b.b(c.class, "JSBundle is null while module name is " + str);
                        }
                        aVar.a(c.a(c.this, str, a2), str);
                        com.dianping.picassocontroller.monitor.a aVar5 = c.this.e;
                        aVar5.c("require_" + str);
                        return new Value(true);
                    } catch (Exception e3) {
                        e = e3;
                        str3 = a2;
                        Log.e(c.g, PicassoUtils.reportException(e, str3, str, null));
                        return new Value(false);
                    }
                }
            });
            aVar.a("nativeBridge", new com.dianping.picassocontroller.bridge.a());
            aVar.a("nativeSizeToFit", new Picasso(context).sizeToFitFunction);
            aVar.a("nativeSizeToFitList", new SizeToFitListJavaScriptInterface());
            aVar.a("nativeCommandViewDirectly", new ViewCommandJSI());
        }
        cVar.a(aVar, context);
        Object[] objArr3 = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "5b0b195c7df78f7027144aaa17ee6d2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "5b0b195c7df78f7027144aaa17ee6d2e");
        } else {
            cVar.e.b("init_matrix_js");
            String readAssetFile = PicassoUtils.readAssetFile(context, "picasso-matrix.js");
            try {
                aVar.a(readAssetFile, "picasso-matrix");
            } catch (JSRuntimeException e) {
                Log.e(g, PicassoUtils.reportException(e, readAssetFile, "picasso-matrix", null));
            }
            cVar.e.c("init_matrix_js");
        }
        Object[] objArr4 = {context};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "b3b1c3762c27cf00cd62392c08e1400f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "b3b1c3762c27cf00cd62392c08e1400f");
            return;
        }
        cVar.e.b("init_module_js");
        com.dianping.picassocontroller.b.a("@dp/picasso-controller", PicassoUtils.readAssetFile(context, "picasso-controller-bundle.js"));
        com.dianping.picassocontroller.b.a("@dp/picasso", PicassoUtils.readAssetFile(context, "picassojs-bundle.js"));
        cVar.e.c("init_module_js");
    }

    public static /* synthetic */ void a(c cVar, com.dianping.picassocontroller.jse.a aVar, final JSONObject jSONObject) {
        Object[] objArr = {aVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "049dbe10b882537524616a67bd2b32eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "049dbe10b882537524616a67bd2b32eb");
            return;
        }
        if (aVar == null) {
            aVar = cVar.c;
        }
        aVar.a("__pcs_bridges", new Encoding() { // from class: com.dianping.picassocontroller.jse.c.7
            @Override // com.dianping.jscore.model.Encoding
            public final JSONObject encode() {
                return jSONObject;
            }

            @Override // com.dianping.jscore.model.Encoding
            public final String[] getFunctionNames() {
                return new String[0];
            }

            @Override // com.dianping.jscore.model.Encoding
            public final JavaScriptInterface[] getFunctions() {
                return new JavaScriptInterface[0];
            }
        });
    }

    public c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f668b5ee42a26e4a6087ad5ca0d805a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f668b5ee42a26e4a6087ad5ca0d805a");
            return;
        }
        this.e = new com.dianping.picassocontroller.monitor.a();
        this.h = "dp_js_engine_";
        this.e.a("init_all");
        i.getAndIncrement();
        this.j = context.getApplicationContext();
        HandlerThread handlerThread = new HandlerThread(this.h + i);
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.dianping.picassocontroller.jse.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                Object[] objArr2 = {thread, th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1df83dcca3f020cf64dde892d85894fd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1df83dcca3f020cf64dde892d85894fd");
                    return;
                }
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                String stringWriter2 = stringWriter.toString();
                com.dianping.codelog.b.b(c.class, "JSThread error", stringWriter2);
                Log.e("JSThread error", stringWriter2);
            }
        });
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        final Context context2 = this.j;
        Object[] objArr2 = {context2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "200a1bb10170a59c0bad6c3051018deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "200a1bb10170a59c0bad6c3051018deb");
        } else {
            this.b.post(new Runnable() { // from class: com.dianping.picassocontroller.jse.c.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30d7ccf95912b93229075fcbebecdb42", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30d7ccf95912b93229075fcbebecdb42");
                        return;
                    }
                    c.this.e.b("init_all");
                    PicassoEnvironment.globalContext = context2;
                    ParsingJSHelper.sContext = context2;
                    if (SOLibraryLoader.sContext == null) {
                        SOLibraryLoader.sContext = context2;
                    }
                    if (SOLibraryLoader.sLogger == null) {
                        SOLibraryLoader.sLogger = new SOLibraryLoader.Logger() { // from class: com.dianping.picassocontroller.jse.c.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.dianping.jscore.SOLibraryLoader.Logger
                            public final void log(String str, String str2) {
                                Object[] objArr4 = {str, str2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b6c0cc33c6bd7ac82a2fdf5a692c51a6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b6c0cc33c6bd7ac82a2fdf5a692c51a6");
                                } else {
                                    com.dianping.codelog.b.b(SOLibraryLoader.class, str, str2);
                                }
                            }
                        };
                    }
                    k.a(context2, false);
                    c.this.c = new g();
                    c.a(c.this, c.this.c, context2);
                    c.this.e.c("init_all");
                    c.a(c.this, context2);
                    if (c.this.f != null) {
                        c.this.f.a();
                    }
                }
            });
        }
        if (PicassoTextUtils.defaultTypeFace == null) {
            PicassoTextUtils.defaultTypeFace = new TextView(this.j).getTypeface();
            for (Map.Entry<Integer, Integer> entry : TextViewParams.typefaceIntMap.entrySet()) {
                PicassoTextUtils.typefaceModeMap.put(entry.getKey(), Typeface.create(PicassoTextUtils.defaultTypeFace, entry.getValue().intValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.dianping.picassocontroller.jse.a a(@Nullable com.dianping.picassocontroller.vc.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0910a73857b597b2ad0475d2b69a4249", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.picassocontroller.jse.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0910a73857b597b2ad0475d2b69a4249");
        }
        if (eVar != null && this.d != null && eVar.i.toLowerCase().startsWith(com.dianping.picassocontroller.debug.g.d.toLowerCase())) {
            return this.d;
        }
        return this.c;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.dianping.picassocontroller.jse.c$5  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {
        public static ChangeQuickRedirect a;

        public AnonymousClass5() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114851e046d802b0fea7d6539437feed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114851e046d802b0fea7d6539437feed");
                return;
            }
            com.dianping.picassocontroller.debug.g.a().g = new com.dianping.picassocontroller.debug.a() { // from class: com.dianping.picassocontroller.jse.c.5.1
                public static ChangeQuickRedirect a;

                @Override // com.dianping.picassocontroller.debug.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40b9aa7335502607a4f252120199400e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40b9aa7335502607a4f252120199400e");
                    } else {
                        c.class.getSimpleName();
                    }
                }

                @Override // com.dianping.picassocontroller.debug.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "840cbbbf26f583fccde5422fcdc9b3c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "840cbbbf26f583fccde5422fcdc9b3c4");
                    } else {
                        c.this.b.post(new Runnable() { // from class: com.dianping.picassocontroller.jse.c.5.1.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d21eb7460537d64a71da8aa239964feb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d21eb7460537d64a71da8aa239964feb");
                                    return;
                                }
                                c.a(c.this, c.this.d, PicassoEnvironment.globalContext);
                                Iterator<String[]> it = com.dianping.picassocontroller.debug.g.f.iterator();
                                while (it.hasNext()) {
                                    String[] next = it.next();
                                    c.this.d.a(c.a(c.this, next[0], com.dianping.picassocontroller.a.a(next[0])), next[1]);
                                }
                            }
                        });
                    }
                }
            };
            c.i.getAndIncrement();
            HandlerThread handlerThread = new HandlerThread(c.this.h + c.i);
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.dianping.picassocontroller.jse.c.5.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    Object[] objArr2 = {thread, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5927558b644b198e1393c63da0cfe0c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5927558b644b198e1393c63da0cfe0c0");
                        return;
                    }
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    Log.e("DebugJSThread error", stringWriter.toString());
                }
            });
            handlerThread.start();
            c.this.d = new j(com.dianping.picassocontroller.debug.g.b, new Handler(handlerThread.getLooper()));
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b82fdcf5712639fad93615f5331e3b02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b82fdcf5712639fad93615f5331e3b02");
        } else {
            this.b.post(new AnonymousClass5());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54a9bd27e612797c837595f385cbd76", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54a9bd27e612797c837595f385cbd76")).booleanValue() : Looper.myLooper() == this.b.getLooper();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull final com.dianping.picassocontroller.jse.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe15555d15564c5b509209a244fee574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe15555d15564c5b509209a244fee574");
            return;
        }
        this.e.b("init_mapping");
        com.dianping.picassocontroller.annotation.c.a(context);
        PicassoViewWrapperUtil.loadViewMapping(context);
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75a2d3032ac127ce5a6db4f9c8033339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75a2d3032ac127ce5a6db4f9c8033339");
        } else {
            h.a(this.b, new Runnable() { // from class: com.dianping.picassocontroller.jse.c.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf65994e9b72e986d10f0368cb101a39", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf65994e9b72e986d10f0368cb101a39");
                    } else {
                        c.a(c.this, aVar, com.dianping.picassocontroller.annotation.c.a());
                    }
                }
            });
        }
        this.e.c("init_mapping");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(@NonNull com.dianping.picassocontroller.jse.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8d9aea9cd4da1a6b3596d91134cd50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8d9aea9cd4da1a6b3596d91134cd50");
            return;
        }
        this.e.b("init_inject");
        aVar.a("PCSEnvironment", PicassoEnvironment.getPicassoEnvironment(context));
        this.e.c("init_inject");
    }

    @WorkerThread
    public final Value a(@Nullable final com.dianping.picassocontroller.vc.e eVar, final String str, Object... objArr) throws Exception {
        Object[] objArr2 = {eVar, str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "a6d3298463145d6128c4f462751e6a5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Value) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "a6d3298463145d6128c4f462751e6a5a");
        }
        final ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj == null) {
                arrayList.add(new Value());
            } else if (obj instanceof JSONObject) {
                arrayList.add(new Value((JSONObject) obj));
            } else if (obj instanceof String) {
                arrayList.add(new Value((String) obj));
            } else if (obj instanceof Integer) {
                arrayList.add(new Value(((Integer) obj).intValue()));
            } else if (obj instanceof Double) {
                arrayList.add(new Value(((Double) obj).doubleValue()));
            } else if (obj instanceof Boolean) {
                arrayList.add(new Value(((Boolean) obj).booleanValue()));
            } else if (obj instanceof Value) {
                arrayList.add((Value) obj);
            } else {
                arrayList.add(new Value(String.valueOf(obj)));
            }
        }
        if (!b()) {
            if (PicassoManager.isDebuggable()) {
                com.dianping.codelog.b.b(b.class, "method:" + str + "callJSMethod() should be called in jsThread!!!");
                throw new JSRuntimeException("JS Must be evaluated on js thread,please check the stack,Current thread name is " + Thread.currentThread().getName() + ",current looper = " + String.valueOf(Looper.myLooper()) + ",js looper = " + String.valueOf(this.b.getLooper()));
            }
            this.b.post(new Runnable() { // from class: com.dianping.picassocontroller.jse.c.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "7103001c4df553f167839a81ae83318a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "7103001c4df553f167839a81ae83318a");
                    } else {
                        c.this.a(eVar).a("Picasso", str, (Value[]) arrayList.toArray(new Value[arrayList.size()]));
                    }
                }
            });
            return new Value();
        }
        return a(eVar).a("Picasso", str, (Value[]) arrayList.toArray(new Value[arrayList.size()]));
    }
}
