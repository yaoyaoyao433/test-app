package com.meituan.msc.modules.service;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.soloader.k;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.CatalystInstance;
import com.meituan.msc.jse.bridge.CatalystInstanceImpl;
import com.meituan.msc.jse.bridge.JavaScriptExecutorFactory;
import com.meituan.msc.jse.bridge.JavaScriptModule;
import com.meituan.msc.jse.bridge.LoadJSCodeCacheCallback;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i implements com.meituan.msc.jse.modules.core.b {
    public static ChangeQuickRedirect a;
    public final String b;
    final com.meituan.msc.modules.engine.h c;
    public CatalystInstance d;
    final String e;
    private final j f;

    @Override // com.meituan.msc.jse.modules.core.b
    public final void a() {
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b300eb1942ccdff262817dcbc362b1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b300eb1942ccdff262817dcbc362b1e");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("ServiceInstance", "staticInit:" + UiThreadUtil.isOnUiThread());
        if (UiThreadUtil.isOnUiThread()) {
            com.meituan.msc.jse.modules.core.c.a();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.service.i.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3708b3edd8d0896b534ae0460a9c1a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3708b3edd8d0896b534ae0460a9c1a5");
                        return;
                    }
                    com.meituan.msc.modules.reporter.g.d("ServiceInstance", "ReactChoreographer initialize");
                    com.meituan.msc.jse.modules.core.c.a();
                }
            });
        }
    }

    public i(com.meituan.msc.modules.engine.h hVar, String str) {
        Object[] objArr = {hVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec28deda324066fe4ae9861d75d9d15a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec28deda324066fe4ae9861d75d9d15a");
            return;
        }
        this.b = "ServiceInstance" + hashCode();
        this.c = hVar;
        this.e = str;
        this.f = new j(this);
    }

    public final String a(com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "209812fa0fe70742710fe7820de4a186", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "209812fa0fe70742710fe7820de4a186");
        }
        if (MSCEnvHelper.getEnvInfo() == null || MSCEnvHelper.getEnvInfo().isProdEnv() || hVar == null) {
            return "";
        }
        String a2 = hVar.a();
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(a2)) {
            a2 = "mtv8_java_default";
        }
        sb.append(a2);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(MSCEnvHelper.getEnvInfo().isProdEnv() ? "_release" : "_debug");
        return sb.toString();
    }

    public final String a(String str, String str2, String str3, LoadJSCodeCacheCallback loadJSCodeCacheCallback) {
        Object[] objArr = {str, str2, str3, loadJSCodeCacheCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b610eb458075622dd54250a4370579b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b610eb458075622dd54250a4370579b");
        }
        if (!d()) {
            throw new RuntimeException("must on js thread");
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals("unknow", str2)) {
            com.meituan.msc.modules.reporter.g.d(this.b, "evaluateJavaScript: ", str2);
        }
        try {
            JSONObject jSONObject = new JSONObject(this.d.evaluateJavaScript(str, str2, str3, loadJSCodeCacheCallback));
            String optString = jSONObject.optString("type");
            if ("object".equals(optString)) {
                return jSONObject.optString("result");
            }
            if (Constants.BOOLEAN.equals(optString)) {
                return String.valueOf(jSONObject.optBoolean("result"));
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "324f295aa24d30cfbe90bd7ae4c03206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "324f295aa24d30cfbe90bd7ae4c03206");
        } else {
            com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.service.i.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a12891ad970e36304b468f333179c7ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a12891ad970e36304b468f333179c7ff");
                    } else {
                        i.this.d.destroy();
                    }
                }
            });
        }
    }

    public final void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97900b545d4d3e709e03df4c6e51f425", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97900b545d4d3e709e03df4c6e51f425");
        } else if (this.d == null) {
            com.meituan.msc.modules.reporter.g.b("ServiceInstance", null, "runOnJSQueueThreadSafe mCatalystInstance is null");
        } else {
            if (MSCEnvHelper.getEnvInfo() != null && !MSCEnvHelper.getEnvInfo().isProdEnv()) {
                CatalystInstance catalystInstance = this.d;
                catalystInstance.changeV8InspectorName(this.e + a(this.c));
            }
            if (((CatalystInstanceImpl) this.d).isOnJSQueueThread()) {
                runnable.run();
            } else {
                ((CatalystInstanceImpl) this.d).runOnJSQueueThread(runnable);
            }
        }
    }

    public final void b(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2deae83583ef9f2dcea43d2e743b0ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2deae83583ef9f2dcea43d2e743b0ff");
        } else {
            this.d.getReactQueueConfiguration().getNativeModulesQueueThread().runOnQueue(runnable);
        }
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "842c5a4673c6deb71ae4423994f9f3ac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "842c5a4673c6deb71ae4423994f9f3ac")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return ((CatalystInstanceImpl) this.d).isOnJSQueueThread();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JavaScriptExecutorFactory a(String str, String str2, Context context) {
        Object[] objArr = {str, str2, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5fc08ce4a449c8c7308650255473c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (JavaScriptExecutorFactory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5fc08ce4a449c8c7308650255473c9");
        }
        try {
            k.a(context, false);
            k.b("mscexecutor");
            return new com.meituan.msc.jse.jscexecutor.a(str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw e;
        }
    }

    public final <T extends JavaScriptModule> T a(Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0747427c1aa79d2ab8f39d433f221286", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0747427c1aa79d2ab8f39d433f221286");
        }
        if (this.d == null) {
            return null;
        }
        return (T) this.d.getJSModule(cls);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c87d4d7b1050df9b0563c778368af197", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c87d4d7b1050df9b0563c778368af197");
        }
        return "ServiceInstance{INSTANCE_TAG='" + this.b + ", runtime=" + this.c + '}';
    }
}
