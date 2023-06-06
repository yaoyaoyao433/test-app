package com.sankuai.waimai.mach.js.knb;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.JsCallback;
import com.dianping.titans.js.jshandler.JsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBInitCallback;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.waimai.mach.jsv8.a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class KNBBridgeStrategy {
    private static WeakHashMap<Activity, List<BridgeManager>> bridgeMaintains = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean hasRegistered = false;
    private static Application.ActivityLifecycleCallbacks lifecycleCallbacks;

    static {
        initMaintains();
        initLifecycleCallback();
    }

    private static synchronized void initMaintains() {
        synchronized (KNBBridgeStrategy.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be4be8e31eacb2cef6ba4ad9a1ddc8eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be4be8e31eacb2cef6ba4ad9a1ddc8eb");
            } else {
                bridgeMaintains = new WeakHashMap<>();
            }
        }
    }

    private static void initLifecycleCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3481fe9896d2bbd01027f4431209c9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3481fe9896d2bbd01027f4431209c9d7");
        } else {
            lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.sankuai.waimai.mach.js.knb.KNBBridgeStrategy.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ecdd77966ffa50c10ddc7c19b719446d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ecdd77966ffa50c10ddc7c19b719446d");
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                    Object[] objArr2 = {activity};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "94625aaa915b59731c120e136959f806", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "94625aaa915b59731c120e136959f806");
                        return;
                    }
                    synchronized (KNBBridgeStrategy.class) {
                        if (KNBBridgeStrategy.bridgeMaintains != null && KNBBridgeStrategy.bridgeMaintains.containsKey(activity)) {
                            for (BridgeManager bridgeManager : (List) KNBBridgeStrategy.bridgeMaintains.get(activity)) {
                                if (bridgeManager != null) {
                                    bridgeManager.destory();
                                }
                            }
                            KNBBridgeStrategy.bridgeMaintains.remove(activity);
                        }
                    }
                }
            };
        }
    }

    public static void invoke(Activity activity, String str, String str2, final String str3, final a aVar) {
        Object[] objArr = {activity, str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f8b3fab88bdb6b5c65b152d86c271251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f8b3fab88bdb6b5c65b152d86c271251");
            return;
        }
        if (!hasRegistered) {
            hasRegistered = true;
            KNBInitCallback initCallback = KNBWebManager.getInitCallback();
            if (initCallback != null) {
                initCallback.init(activity);
                KNBWebManager.setInitCallback(null);
            }
            if (lifecycleCallbacks == null) {
                initLifecycleCallback();
            }
            activity.getApplication().registerActivityLifecycleCallbacks(lifecycleCallbacks);
        }
        BridgeManager bridgeManager = new BridgeManager(activity, new JsCallback() { // from class: com.sankuai.waimai.mach.js.knb.KNBBridgeStrategy.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.titans.js.JsCallback
            public final void jsCallback(JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a37e768376c5845a4647695326a65ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a37e768376c5845a4647695326a65ae1");
                } else if (a.this == null || jSONObject == null) {
                } else {
                    a.this.a(str3, jSONObject.toString());
                }
            }
        });
        bridgeManager.invoke(str, str2, str3, JsHandler.Source.MACH);
        addMaintain(activity, bridgeManager);
    }

    private static synchronized void addMaintain(Activity activity, BridgeManager bridgeManager) {
        synchronized (KNBBridgeStrategy.class) {
            Object[] objArr = {activity, bridgeManager};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "283435481ef97f02e320df40a89b7b68", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "283435481ef97f02e320df40a89b7b68");
                return;
            }
            if (bridgeManager == null) {
                initMaintains();
            }
            if (!bridgeMaintains.containsKey(activity)) {
                bridgeMaintains.put(activity, new ArrayList());
            }
            bridgeMaintains.get(activity).add(bridgeManager);
        }
    }
}
