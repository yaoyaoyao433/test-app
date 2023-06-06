package com.meituan.android.mrn.services;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.jshandler.JsHandler;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.utils.g;
import com.meituan.android.mrn.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBInitCallback;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.util.ProcessUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static Map<Activity, Map<ReactContext, a>> c = Collections.synchronizedMap(new WeakHashMap());
    private static Application.ActivityLifecycleCallbacks d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.mrn.services.b.1
        public static ChangeQuickRedirect a;
        private boolean b = false;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62c74c3a5f50796f0f2c6564260e956", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62c74c3a5f50796f0f2c6564260e956");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d064e37485ffe808dadf22fe0af46c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d064e37485ffe808dadf22fe0af46c");
            } else if (this.b) {
                Map map = (Map) b.c.get(activity);
                if (map != null) {
                    for (a aVar : map.values()) {
                        if (aVar != null) {
                            aVar.a("foreground");
                        }
                    }
                }
                this.b = false;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Map map;
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06bb1ee50cf0e453bb06aa0b23311c9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06bb1ee50cf0e453bb06aa0b23311c9d");
                return;
            }
            this.b = ProcessUtil.isBackground(activity);
            if (!this.b || (map = (Map) b.c.get(activity)) == null) {
                return;
            }
            for (a aVar : map.values()) {
                if (aVar != null) {
                    aVar.a("background");
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff96bf19a13b3126ac9ef7346e89e5f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff96bf19a13b3126ac9ef7346e89e5f9");
                return;
            }
            Map map = (Map) b.c.get(activity);
            if (map != null) {
                for (a aVar : map.values()) {
                    if (aVar != null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3c769bca0fa92a03e43ea53c84358b90", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3c769bca0fa92a03e43ea53c84358b90");
                        } else {
                            for (BridgeManager bridgeManager : aVar.c) {
                                bridgeManager.destory();
                            }
                            aVar.c.clear();
                        }
                    }
                }
                b.c.remove(activity);
            }
        }
    };

    public static void a(Activity activity, final ReactContext reactContext, final String str, final String str2, final String str3, final Callback callback, final boolean z) {
        Object[] objArr = {activity, reactContext, str, str2, str3, callback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dbacf9ab46e35f06e78360cea6588336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dbacf9ab46e35f06e78360cea6588336");
        } else if (activity == null) {
            com.facebook.common.logging.a.b("[KNBBridgeInvoker@invoke]", "activity is null " + str);
        } else {
            String format = String.format("%s.invoke: getInitCallback null, method:%s params:%s callbackId:%s ", "KNBBridgeInvoker", str, str2, str3);
            String format2 = String.format("%s.invoke: KNBBridge init success,", "KNBBridgeInvoker");
            if (BridgeManager.getJSBPerformer() == null) {
                KNBInitCallback initCallback = KNBWebManager.getInitCallback();
                if (initCallback != null) {
                    p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format2, Boolean.valueOf(b)));
                    initCallback.init(activity);
                    KNBWebManager.setInitCallback(null);
                } else {
                    p.a("[KNBBridgeStrategy@invoke]", String.format("%s hasRegistered:%s", format, Boolean.valueOf(b)));
                }
            }
            Map<ReactContext, a> map = c.get(activity);
            if (map == null) {
                Context applicationContext = activity.getApplicationContext();
                Object[] objArr2 = {applicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "58fecd133cb565393caa7021dd0f0a9a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "58fecd133cb565393caa7021dd0f0a9a");
                } else if (!b) {
                    synchronized (b.class) {
                        if (!b) {
                            KNBInitCallback initCallback2 = KNBWebManager.getInitCallback();
                            if (initCallback2 != null) {
                                initCallback2.init(applicationContext);
                                KNBWebManager.setInitCallback(null);
                            }
                            ((Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(d);
                            b = true;
                        }
                    }
                }
                map = new HashMap<>();
                c.put(activity, map);
            }
            a aVar = map.get(reactContext);
            if (aVar == null) {
                aVar = new a(activity);
                map.put(reactContext, aVar);
            }
            Object[] objArr3 = {reactContext, str, str2, str3, callback, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "861c652116b3a5cc7d0f52de14fc3ae8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "861c652116b3a5cc7d0f52de14fc3ae8");
                return;
            }
            final a aVar2 = aVar;
            BridgeManager bridgeManager = new BridgeManager(aVar.b, new JsCallback() { // from class: com.meituan.android.mrn.services.a.2
                public static ChangeQuickRedirect a;

                @Override // com.dianping.titans.js.JsCallback
                public final void jsCallback(JSONObject jSONObject) {
                    Object[] objArr4 = {jSONObject};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cfdafc4f4808ba6d7c057e8f3dec9947", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cfdafc4f4808ba6d7c057e8f3dec9947");
                        return;
                    }
                    Object[] objArr5 = new Object[4];
                    objArr5[0] = str;
                    objArr5[1] = str2;
                    objArr5[2] = str3;
                    objArr5[3] = jSONObject == null ? "" : jSONObject.toString();
                    String format3 = String.format("method:%s invokeParams:%s callbackId:%s jsCallbackResult:%s", objArr5);
                    if (z) {
                        if (reactContext == null) {
                            p.a("[KNBBridgeStrategy@jsCallback]", "reactContext is null");
                            return;
                        }
                        WritableNativeMap writableNativeMap = new WritableNativeMap();
                        writableNativeMap.putString("callbackId", str3);
                        try {
                            writableNativeMap.putMap("result", g.a(jSONObject));
                        } catch (Throwable th) {
                            com.facebook.common.logging.a.d("[KNBBridgeHost@jsCallback]", "KNBBridgeHost", th);
                        }
                        boolean a2 = n.a(reactContext, "MRNKNBEvent", writableNativeMap);
                        p.a("[KNBBridgeStrategy@jsCallback]", "emitDeviceEventMessage :" + a2);
                    } else if (callback != null && jSONObject != null) {
                        callback.invoke(str3, jSONObject.toString());
                    } else {
                        if (callback == null) {
                            p.a("[KNBBridgeStrategy@jsCallback]", "callback is null, " + format3);
                        }
                        if (jSONObject == null) {
                            p.a("[KNBBridgeStrategy@jsCallback]", "result is null, " + format3);
                        }
                    }
                }
            });
            aVar.c.add(bridgeManager);
            bridgeManager.invoke(str, str2, str3, JsHandler.Source.MRN);
        }
    }

    public static synchronized void a(Activity activity, int i, int i2, Intent intent) {
        synchronized (b.class) {
            Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e7d948d36952516ea3fb04137338c42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e7d948d36952516ea3fb04137338c42");
                return;
            }
            Map<ReactContext, a> map = c.get(activity);
            if (map != null) {
                for (a aVar : map.values()) {
                    if (aVar != null) {
                        aVar.a(i, i2, intent);
                    }
                }
            }
        }
    }
}
