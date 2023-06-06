package com.meituan.android.mrn.knb;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.GuardedBy;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.dianping.titans.js.jshandler.JsHandler;
import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.i;
import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.android.mrn.config.p;
import com.meituan.android.mrn.config.y;
import com.meituan.android.mrn.knb.JavaModuleWrapper;
import com.meituan.android.mrn.shell.MRNReactPackageInterface;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.soloader.k;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CallNativeModuleJsHandler extends BaseJsHandler {
    private static final int ERROR_CODE_INVALID_PARAM = -1;
    private static final int ERROR_CODE_INVALID_SOURCE = -3;
    private static final int ERROR_CODE_UNKNOWN = -2;
    public static final String KEY = "MRN.callNativeModules";
    private static final String PARAM_KEY_BUNDLE_NAME = "bundleName";
    private static final String PARAM_KEY_ENV_NAME = "env";
    private static final String PARAM_KEY_METHOD = "method";
    private static final String PARAM_KEY_MODULE = "module";
    private static final String PARAM_KEY_PARAMS = "params";
    public static final String TAG = "CallNativeModuleJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static volatile boolean sDidInit = false;
    private static final Set<String> sModuleBlackList;
    @GuardedBy("sNativeModuleAdaptersLock")
    private static Map<JsHost, e> sNativeModuleAdapters = new WeakHashMap();
    private static final Object sNativeModuleAdaptersLock = new Object();

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "PIczXXdEe4EVotJn58nlF526S/KAYVqlJhHkldiCpgmFeCVLflzX/58ucClD80aH8UqhZNs+V1wd1gdWGdskGg==";
    }

    private static void init(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "82277aa223457d1a29fb756b6df8e5d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "82277aa223457d1a29fb756b6df8e5d0");
        } else if (sDidInit) {
        } else {
            synchronized (CallNativeModuleJsHandler.class) {
                if (sDidInit) {
                    return;
                }
                k.a(context, false);
                ReactBridge.staticInit();
                sDidInit = true;
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b95b8ce5780b9e89819f14758aed03f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b95b8ce5780b9e89819f14758aed03f4");
        } else if (this.mJsBean == null || this.mJsBean.argsJson == null) {
            jsCallbackError(-1, "the param is invalid");
        } else if (this.mJsBean.source != JsHandler.Source.TITANS) {
            jsCallbackError(-3, "this method must be invoked in titans");
        } else {
            try {
                init(jsHost().getContext().getApplicationContext());
                JSONObject jSONObject = this.mJsBean.argsJson;
                String optString = jSONObject.optString("module");
                String optString2 = jSONObject.optString("method");
                JSONObject optJSONObject = jSONObject.optJSONObject("env");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("bundleName");
                    if (str == null) {
                        com.facebook.common.logging.a.b(TAG, "the bundleName param is lost");
                    }
                } else {
                    str = null;
                    com.facebook.common.logging.a.b(TAG, "the env param is lost");
                }
                invokeNativeModule(str, optString, optString2, jSONObject.optJSONArray("params"), new Callback() { // from class: com.meituan.android.mrn.knb.CallNativeModuleJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.facebook.react.bridge.Callback
                    public final void invoke(Object... objArr2) {
                        String a2;
                        Object[] objArr3 = {objArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e36c515771b8274529b0dcd0ae6ed806", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e36c515771b8274529b0dcd0ae6ed806");
                        } else if (objArr2 == null || objArr2.length == 0 || objArr2[0] == null) {
                            CallNativeModuleJsHandler.this.jsCallback();
                        } else {
                            Object obj = objArr2[0];
                            if (obj instanceof ReadableMap) {
                                a2 = g.a((Object) g.a((ReadableMap) obj));
                            } else if (obj instanceof ReadableArray) {
                                a2 = g.a(g.a((ReadableArray) obj));
                            } else {
                                a2 = g.a(obj);
                            }
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("result", a2);
                                CallNativeModuleJsHandler.this.jsCallback(jSONObject2);
                            } catch (JSONException e) {
                                e.printStackTrace();
                                CallNativeModuleJsHandler.this.jsCallbackError(-2, Log.getStackTraceString(e));
                            }
                        }
                    }
                }, new Callback() { // from class: com.meituan.android.mrn.knb.CallNativeModuleJsHandler.2
                    public static ChangeQuickRedirect a;

                    @Override // com.facebook.react.bridge.Callback
                    public final void invoke(Object... objArr2) {
                        Object[] objArr3 = {objArr2};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d480053b124b6dbd9c38cd95b614933b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d480053b124b6dbd9c38cd95b614933b");
                        } else if (objArr2 != null && objArr2.length > 0 && (objArr2[0] instanceof ReadableMap)) {
                            CallNativeModuleJsHandler.this.jsCallbackErrorMsg(((ReadableMap) objArr2[0]).getString("message"));
                        } else {
                            CallNativeModuleJsHandler.this.jsCallbackError(-2, "Unknown");
                        }
                    }
                });
            } catch (Throwable th) {
                jsCallbackError(-2, Log.getStackTraceString(th));
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c225dee8475670fb5639391b2f7170f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c225dee8475670fb5639391b2f7170f3");
            return;
        }
        super.onDestroy();
        e eVar = sNativeModuleAdapters.get(this.mJsHost);
        if (eVar != null) {
            c cVar = eVar.c;
            try {
                cVar.onHostPause();
                cVar.onHostDestroy();
            } catch (Throwable th) {
                com.facebook.common.logging.a.b(KEY, "onDestroy", th);
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "34972ccf8beb44006ecbe1681833dcd6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "34972ccf8beb44006ecbe1681833dcd6");
            } else {
                for (JavaModuleWrapper javaModuleWrapper : eVar.b.values()) {
                    try {
                        javaModuleWrapper.getModule().onCatalystInstanceDestroy();
                    } catch (Throwable th2) {
                        com.facebook.common.logging.a.b("NativeModuleAdapter", "onDestroy", th2);
                    }
                }
            }
            synchronized (sNativeModuleAdaptersLock) {
                sNativeModuleAdapters.remove(this.mJsHost);
            }
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5fe691c8993967b7fd828fb399c6549", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5fe691c8993967b7fd828fb399c6549");
            return;
        }
        super.onActivityResult(i, i2, intent);
        JsHost jsHost = this.mJsHost;
        e eVar = sNativeModuleAdapters.get(jsHost);
        if (eVar != null) {
            try {
                eVar.c.onActivityResult(jsHost.getActivity(), i, i, intent);
            } catch (Throwable th) {
                com.facebook.common.logging.a.b(KEY, "onActivityResult", th);
            }
        }
    }

    private void invokeNativeModule(String str, String str2, String str3, JSONArray jSONArray, Callback callback, Callback callback2) throws Exception {
        int i;
        Object[] objArr = {str, str2, str3, jSONArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdf26183680c4b41b0be80c5b2b859dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdf26183680c4b41b0be80c5b2b859dd");
            return;
        }
        e nativeModuleAdapter = getNativeModuleAdapter(this.mJsHost, str);
        char c = 5;
        Object[] objArr2 = {str2, str3, jSONArray, callback, callback2};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, nativeModuleAdapter, changeQuickRedirect3, false, "36c70f1b191be6816492df1950070b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, nativeModuleAdapter, changeQuickRedirect3, false, "36c70f1b191be6816492df1950070b49");
        } else if (DiagnoseLog.MRN.equals(str2) && "getAllConstants".equals(str3)) {
            nativeModuleAdapter.a(jSONArray, callback, callback2);
        } else {
            JavaModuleWrapper javaModuleWrapper = nativeModuleAdapter.b.get(str2);
            if (javaModuleWrapper == null) {
                throw new f(String.format("%s is not found", javaModuleWrapper.getName()));
            }
            int i2 = 0;
            for (JavaModuleWrapper.MethodDescriptor methodDescriptor : javaModuleWrapper.getMethodDescriptors()) {
                if (methodDescriptor.name.equals(str3)) {
                    Object[] objArr3 = new Object[6];
                    objArr3[0] = javaModuleWrapper;
                    objArr3[1] = Integer.valueOf(i2);
                    objArr3[2] = methodDescriptor;
                    objArr3[3] = jSONArray;
                    objArr3[4] = callback;
                    objArr3[c] = callback2;
                    ChangeQuickRedirect changeQuickRedirect4 = e.a;
                    if (!PatchProxy.isSupport(objArr3, nativeModuleAdapter, changeQuickRedirect4, false, "d2cefb319d1f30556011e7d802a5ef77", RobustBitConfig.DEFAULT_VALUE)) {
                        String str4 = methodDescriptor.type;
                        char c2 = 65535;
                        int hashCode = str4.hashCode();
                        if (hashCode != -309216997) {
                            if (hashCode != 3545755) {
                                if (hashCode == 93127292 && str4.equals(BaseJavaModule.METHOD_TYPE_ASYNC)) {
                                    c2 = 0;
                                }
                            } else if (str4.equals(BaseJavaModule.METHOD_TYPE_SYNC)) {
                                c2 = 2;
                            }
                        } else if (str4.equals(BaseJavaModule.METHOD_TYPE_PROMISE)) {
                            c2 = 1;
                        }
                        switch (c2) {
                            case 0:
                                i = i2;
                                JSONArray a = nativeModuleAdapter.a(javaModuleWrapper, i2, jSONArray, callback, callback2);
                                javaModuleWrapper.invoke(i, (WritableNativeArray) g.a(a));
                                if (a != jSONArray) {
                                    continue;
                                } else if (callback != null) {
                                    callback.invoke(new Object[0]);
                                }
                                i2 = i + 1;
                                c = 5;
                            case 1:
                                jSONArray.put(nativeModuleAdapter.c.a(callback));
                                jSONArray.put(nativeModuleAdapter.c.a(callback2));
                                javaModuleWrapper.invoke(i2, (WritableNativeArray) g.a(jSONArray));
                                break;
                            case 2:
                                Object invoke = javaModuleWrapper.invoke(i2, (WritableNativeArray) g.a(jSONArray));
                                if (callback != null) {
                                    callback.invoke(invoke);
                                    break;
                                }
                                break;
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr3, nativeModuleAdapter, changeQuickRedirect4, false, "d2cefb319d1f30556011e7d802a5ef77");
                    }
                }
                i = i2;
                i2 = i + 1;
                c = 5;
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        sModuleBlackList = hashSet;
        hashSet.add(NativeAnimatedModule.NAME);
    }

    private static e getNativeModuleAdapter(JsHost jsHost, String str) throws f {
        Object[] objArr = {jsHost, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d2681c5619dc8bb45176cccac654be1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d2681c5619dc8bb45176cccac654be1d");
        }
        if (jsHost == null) {
            return null;
        }
        e eVar = sNativeModuleAdapters.get(jsHost);
        if (eVar == null) {
            synchronized (sNativeModuleAdaptersLock) {
                eVar = sNativeModuleAdapters.get(jsHost);
                if (eVar == null) {
                    e eVar2 = new e(jsHost, getAllReactPackages(str), sModuleBlackList);
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr2, eVar2, changeQuickRedirect3, false, "66c0c0ef662513e15adb888b37ee62de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, eVar2, changeQuickRedirect3, false, "66c0c0ef662513e15adb888b37ee62de");
                    } else {
                        for (JavaModuleWrapper javaModuleWrapper : eVar2.b.values()) {
                            javaModuleWrapper.getModule().initialize();
                        }
                    }
                    eVar2.c.onHostResume(jsHost.getActivity());
                    sNativeModuleAdapters.put(jsHost, eVar2);
                    eVar = eVar2;
                }
            }
        }
        return eVar;
    }

    private static String getBizName(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "969bb7ce002cf3bcb454c0a26a4e4b62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "969bb7ce002cf3bcb454c0a26a4e4b62");
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("rn_") || (indexOf = str.indexOf(95, 3)) <= 0) {
            return null;
        }
        return str.substring(3, indexOf);
    }

    private static String getBundleName(String str) {
        int lastIndexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88a0da60e1b6a51040eb44c96842b8cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88a0da60e1b6a51040eb44c96842b8cc");
        }
        if (TextUtils.isEmpty(str) || (lastIndexOf = str.lastIndexOf(95)) <= 0) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    private static List<i> getAllReactPackages(String str) {
        List<MRNReactPackageInterface> a;
        List<i> a2;
        List<IMRNPackageBuilder> a3;
        List<i> a4;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0578d6f34e5412bc80cbbb5e82d27848", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0578d6f34e5412bc80cbbb5e82d27848");
        }
        String bizName = getBizName(str);
        String bundleName = getBundleName(str);
        HashSet hashSet = new HashSet();
        boolean a5 = com.sankuai.meituan.serviceloader.b.a();
        hashSet.add(new d());
        IMRNPackageBuilder iMRNPackageBuilder = y.a().i;
        if (iMRNPackageBuilder != null) {
            hashSet.addAll(iMRNPackageBuilder.a());
        }
        if (a5 && (a3 = com.sankuai.meituan.serviceloader.b.a(IMRNPackageBuilder.class, (String) null)) != null && a3.size() > 0) {
            for (IMRNPackageBuilder iMRNPackageBuilder2 : a3) {
                if (iMRNPackageBuilder2 != null && (a4 = iMRNPackageBuilder2.a()) != null) {
                    hashSet.addAll(a4);
                }
            }
        }
        if (p.b() != null) {
            hashSet.addAll(p.b());
        }
        if (a5 && !TextUtils.isEmpty(bundleName) && (a = com.sankuai.meituan.serviceloader.b.a(MRNReactPackageInterface.class, bundleName)) != null && !a.isEmpty()) {
            for (MRNReactPackageInterface mRNReactPackageInterface : a) {
                if (mRNReactPackageInterface != null && (a2 = mRNReactPackageInterface.a()) != null) {
                    hashSet.addAll(a2);
                }
            }
        }
        List<i> a6 = p.a(bizName, bundleName);
        if (a6 != null) {
            hashSet.addAll(a6);
        }
        return new ArrayList(hashSet);
    }
}
