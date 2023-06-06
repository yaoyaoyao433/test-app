package com.meituan.android.recce;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.Toast;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ar;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.bridge.RecceInterface;
import com.meituan.android.recce.dev.c;
import com.meituan.android.recce.exception.RecceException;
import com.meituan.android.recce.exception.RecceExceptionHandler;
import com.meituan.android.recce.host.HostImplement;
import com.meituan.android.recce.host.HostInterface;
import com.meituan.android.recce.host.RecceBridgeHandler;
import com.meituan.android.recce.host.RecceHostHandler;
import com.meituan.android.recce.host.binary.BinWriter;
import com.meituan.android.recce.views.RecceBaseViewPackage;
import com.meituan.android.recce.views.base.RecceInstanceUtils;
import com.meituan.android.recce.views.base.rn.RecceCatalystInstance;
import com.meituan.android.recce.views.base.rn.RecceUIManagerModule;
import com.meituan.android.soloader.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public RecceUIManagerModule b;
    public final com.meituan.android.recce.b c;
    public HostInterface d;
    public h e;
    protected RecceBridgeHandler f;
    public com.meituan.android.recce.dev.b g;
    public String h;
    public String i;
    public Object j;
    protected long k;
    private List<ViewManager> l;
    private com.meituan.android.recce.bridge.a m;
    private ReccePackage n;
    private ReactQueueConfiguration o;
    private RecceExceptionHandler p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;

    static {
        com.meituan.android.recce.so.a.a();
    }

    public c(Context context, Object obj, ReccePackage reccePackage, String str, RecceExceptionHandler recceExceptionHandler) {
        int i;
        Object[] objArr = {context, obj, reccePackage, str, recceExceptionHandler};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "914158c4a5c8cbddc9ccec784573dd79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "914158c4a5c8cbddc9ccec784573dd79");
            return;
        }
        this.l = new ArrayList();
        this.h = "";
        this.i = "";
        this.q = "";
        this.r = "";
        this.s = "";
        this.t = "";
        this.k = 0L;
        this.u = str;
        this.c = new com.meituan.android.recce.b(context);
        this.j = obj;
        this.n = reccePackage;
        this.m = new com.meituan.android.recce.bridge.a(this.c);
        this.m.a("notifyError", new b());
        this.m.a("env", new a());
        for (Map.Entry<String, RecceCustomApi> entry : reccePackage.getCustomApis().entrySet()) {
            this.m.a(entry.getKey(), entry.getValue());
        }
        this.p = recceExceptionHandler;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e91387651e8344212578e56d885936f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e91387651e8344212578e56d885936f");
            i = 3;
        } else if (TextUtils.isEmpty(str)) {
            i = 3;
            com.dianping.networklog.c.a("RecceInstanceManager: initParams uri is null", 3, new String[]{"Recce-Android"});
        } else {
            i = 3;
            Uri parse = Uri.parse(str);
            if (TextUtils.equals(parse.getScheme(), KernelConfig.KERNEL_TYPE_RECCE)) {
                this.h = parse.getPath();
                this.r = parse.getQueryParameter("mock_type");
                this.s = parse.getQueryParameter("business_data");
                this.t = parse.getQueryParameter("lx_data");
                this.i = parse.getQueryParameter("wasm_version");
                this.q = parse.getQueryParameter("bundle_name");
            } else {
                com.dianping.networklog.c.a("RecceInstanceManager: initParams uri scheme error", 3, new String[]{"Recce-Android"});
            }
        }
        com.meituan.android.recce.b bVar = this.c;
        Object[] objArr3 = {bVar};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9474a5baddef9fccf972eff471e78294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9474a5baddef9fccf972eff471e78294");
        } else {
            try {
                k.a((Context) bVar, false);
            } catch (Throwable th) {
                com.dianping.networklog.c.a("RecceInstanceManager: initReactEnv SoLoader.init exception " + th.getMessage(), i, new String[]{"Recce-Android"});
                a(RecceException.INIT_SO_FAILED, th);
            }
            a(new RecceBaseViewPackage());
            if (this.n != null) {
                a(this.n);
            }
            this.b = new RecceUIManagerModule(bVar, new com.meituan.android.recce.events.d(this), this.l, 0);
            this.o = ReactQueueConfigurationImpl.create(ReactQueueConfigurationSpec.createDefault(), d.a(this));
            com.facebook.react.modules.core.g.a();
            bVar.a().initializeWithInstance(new RecceCatalystInstance(this.o, this.b));
            bVar.a().setNativeModuleCallExceptionHandler(e.a(this));
        }
        com.meituan.android.recce.bridge.a aVar = this.m;
        Object[] objArr4 = {aVar};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e4f3afbe83aeebefeb3a29ad8b8a8c43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e4f3afbe83aeebefeb3a29ad8b8a8c43");
        } else {
            this.f = new RecceBridgeHandler(aVar);
        }
        this.g = c.a.a.a;
    }

    private static String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f91a94eee5fcc6f5066b5db5faf14680", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f91a94eee5fcc6f5066b5db5faf14680");
        }
        String[] strArr = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        StringBuilder sb = new StringBuilder();
        if (strArr != null) {
            for (int i = 0; i < strArr.length; i++) {
                sb.append(strArr[i]);
                if (i != strArr.length - 1) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
        }
        return sb.toString();
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ecd1f93830b93cb3c3c8e45a1d9840e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ecd1f93830b93cb3c3c8e45a1d9840e");
            return;
        }
        try {
            if (!com.meituan.android.recce.so.a.b()) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("cpu_abi", e());
                hashMap.put("app_abi", ProcessUtils.is64Bit() ? "64" : "32");
                hashMap.put("bundle_name", this.q);
                a(RecceException.RECCE_SO_UN_AVAILABLE, new Throwable(), hashMap);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e889629a24c3d6c3ad1bd9f5aaf96d3b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e889629a24c3d6c3ad1bd9f5aaf96d3b");
                    return;
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", "so UnAvailable");
                hashMap2.put("wasai_cpu_abi", e());
                hashMap2.put("wasai_app_abi", ProcessUtils.is64Bit() ? "abi64" : "abi32");
                com.meituan.android.recce.reporter.a.a(this.j, "one_click_pay_wasai_load_error", hashMap2);
                return;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("status", "success");
            hashMap3.put("bundle_name", this.q);
            com.meituan.android.recce.reporter.a.a(this.j, "recce_so_load", hashMap3);
            this.b.addUIBlock(new ar() { // from class: com.meituan.android.recce.c.1
                public static ChangeQuickRedirect a;

                @Override // com.facebook.react.uimanager.ar
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr3 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1b9a440900d3d2c1e1c1457db36a46c3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1b9a440900d3d2c1e1c1457db36a46c3");
                        return;
                    }
                    final RecceRootView recceRootView = (RecceRootView) c.this.e;
                    recceRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.android.recce.c.1.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "41d1a9a3fb2e8c05309af38c9df2986a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "41d1a9a3fb2e8c05309af38c9df2986a");
                                return;
                            }
                            if (recceRootView.getChildCount() <= 0) {
                                recceRootView.handleException(new Exception("view render exception"));
                            } else {
                                com.meituan.android.recce.bench.a.a("All", 1);
                                com.meituan.android.recce.bench.a.b();
                                c.this.c();
                            }
                            recceRootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    });
                }
            });
            com.meituan.android.recce.reporter.a.a(this.j, "one_click_pay_wasai_so_ready", new HashMap());
            this.d = new HostImplement(new RecceHostHandler(this), str);
            String str2 = this.i;
            Object[] objArr3 = {str2};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "02b4fa3864a508bb1164bd847511e52b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "02b4fa3864a508bb1164bd847511e52b");
            } else {
                HashMap hashMap4 = new HashMap();
                hashMap4.put("wasm_version", str2);
                com.meituan.android.recce.reporter.a.a(this.j, "recce_run", hashMap4);
                com.meituan.android.recce.reporter.a.a(this.j, "recce_run_foundation_time", (float) com.meituan.android.recce.reporter.a.a(((RecceRootView) this.e).c));
                this.k = com.meituan.android.recce.reporter.a.a();
            }
            String str3 = this.r;
            String str4 = this.s;
            String str5 = this.t;
            Object[] objArr4 = {str3, str4, str5};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8194ac7ad4f8c5ed8bfb0eec43d1617c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8194ac7ad4f8c5ed8bfb0eec43d1617c");
            } else {
                BinWriter binWriter = new BinWriter();
                if (str3 == null) {
                    str3 = "";
                }
                binWriter.putString(str3);
                if (str4 == null) {
                    str4 = "";
                }
                binWriter.putString(str4);
                if (str5 == null) {
                    str5 = "";
                }
                binWriter.putString(str5);
                this.d.runStart(binWriter.asBytes());
            }
            com.meituan.android.recce.reporter.a.a(this.j, "recce_run_biz_wasm_time", (float) com.meituan.android.recce.reporter.a.a(this.k));
            com.dianping.networklog.c.a("RecceInstanceManager: initHostEnv start", 3, new String[]{"Recce-Android"});
        } catch (Throwable th) {
            a(RecceException.INIT_HOST_FAILED, th);
            com.dianping.networklog.c.a("RecceInstanceManager: initHostEnv " + th.getMessage(), 3, new String[]{"Recce-Android"});
        }
    }

    public static /* synthetic */ void b(c cVar, Exception exc) {
        Object[] objArr = {cVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6b812fa897d813909b59e921667ec30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6b812fa897d813909b59e921667ec30");
        } else {
            cVar.a(RecceException.REACT_QUEUE_EXCEPTION, exc);
        }
    }

    public static /* synthetic */ void a(c cVar, Exception exc) {
        Object[] objArr = {cVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2580a4ce0e535d24b72e0cf1df62075f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2580a4ce0e535d24b72e0cf1df62075f");
        } else {
            cVar.a(RecceException.REACT_INNER_ERROR, exc);
        }
    }

    private void a(ReccePackage reccePackage) {
        List<ViewManager> registerViewManagers;
        Object[] objArr = {reccePackage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f478955101851cf27056acc3ad0623be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f478955101851cf27056acc3ad0623be");
        } else if (reccePackage == null || (registerViewManagers = reccePackage.registerViewManagers(this.c)) == null || registerViewManagers.size() == 0) {
        } else {
            String collidedViewManager = RecceInstanceUtils.getCollidedViewManager(this.l, registerViewManagers);
            if (!TextUtils.isEmpty(collidedViewManager)) {
                com.facebook.infer.annotation.a.a("view manager '" + collidedViewManager + "' is collision");
                return;
            }
            this.l.addAll(registerViewManagers);
        }
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60432a36738031da989596cb66d69bcc", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60432a36738031da989596cb66d69bcc") : new g();
    }

    public final RecceBridgeHandler b() {
        return this.f;
    }

    private void a(RecceException recceException, Throwable th, HashMap<String, Object> hashMap) {
        Object[] objArr = {recceException, th, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e23bb49dee845ac089d0f3be06d13ac5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e23bb49dee845ac089d0f3be06d13ac5");
            return;
        }
        com.meituan.android.recce.reporter.a.a(this.j, recceException.errorName(), th.getMessage(), hashMap);
        if (this.p != null) {
            this.p.handleException(recceException.code(), recceException.errorName(), th);
        } else {
            com.dianping.networklog.c.a("RecceInstanceManager: handleException exceptionHandler is null", 3, new String[]{"Recce-Android"});
        }
    }

    public final void a(RecceException recceException, Throwable th) {
        Object[] objArr = {recceException, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b52683926656275d0305b1e40202ca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b52683926656275d0305b1e40202ca5");
        } else {
            a(recceException, th, null);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99aa9346960d2b0a1b85282e08b1b232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99aa9346960d2b0a1b85282e08b1b232");
            return;
        }
        this.d.sendSystemEvent(1);
        com.meituan.android.recce.reporter.a.a(this.j, "recce_run_biz_time", (float) com.meituan.android.recce.reporter.a.a(this.k));
        com.meituan.android.recce.reporter.a.a(this.j, "recce_run_all_time", (float) com.meituan.android.recce.reporter.a.a(((RecceRootView) this.e).c));
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf47e0eddb9601e56833848f2a349cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf47e0eddb9601e56833848f2a349cc6");
            return;
        }
        if (this.d != null) {
            this.d.drop();
        }
        if (this.o != null) {
            this.o.destroy();
        }
        if (this.b != null) {
            this.b.destroy();
        }
        this.l = null;
        this.f = null;
        this.m = null;
        this.p = null;
        this.j = null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b extends RecceCustomApi {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @RecceInterface
        public final byte[] onReceivedError(int i, String str, String str2) {
            Object[] objArr = {Integer.valueOf(i), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5fd32e727a6a9b98ce9764dca415434", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5fd32e727a6a9b98ce9764dca415434");
            }
            if (c.this.p != null) {
                c.this.p.handleException(i, str, null);
            }
            if (com.meituan.android.recce.utils.a.a(c.this.c)) {
                com.meituan.android.recce.b bVar = c.this.c;
                Toast.makeText(bVar, "code:" + i + ", message:" + str + ", extraData:" + str2, 1).show();
            }
            return new byte[0];
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends RecceCustomApi {
        public static ChangeQuickRedirect a;

        @RecceInterface
        public final byte[] getEnv() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0615f6cdb88498c19beb1475db6165ad", RobustBitConfig.DEFAULT_VALUE)) {
                return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0615f6cdb88498c19beb1475db6165ad");
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 200);
                jSONObject.put("msg", "");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("code", 0);
                jSONObject2.put("message", "");
                jSONObject2.put("data", new com.meituan.android.recce.bridge.env.a().a());
                jSONObject.put("data", jSONObject2.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject.toString().getBytes();
        }
    }
}
