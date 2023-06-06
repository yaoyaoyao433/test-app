package com.meituan.android.mrn.container;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.services.c;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    public static ChangeQuickRedirect a = null;
    private static WeakHashMap<Activity, Object> c = null;
    private static Application.ActivityLifecycleCallbacks d = null;
    private static boolean e = false;
    protected WeakReference<Activity> b;

    static {
        a();
        d();
    }

    @Deprecated
    private static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c799f25377afbf9964a49bb2ad4da6ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c799f25377afbf9964a49bb2ad4da6ab");
        } else {
            c = new WeakHashMap<>();
        }
    }

    @Deprecated
    private static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70397ff0dd8dcc0540560193b74dbee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70397ff0dd8dcc0540560193b74dbee5");
        } else {
            d = new Application.ActivityLifecycleCallbacks() { // from class: com.meituan.android.mrn.container.c.1
                public static ChangeQuickRedirect a;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Object[] objArr2 = {activity, bundle};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62677301281424a30453988955100173", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62677301281424a30453988955100173");
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
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c553575dbd7da4d8dfd60e0e17fc4d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c553575dbd7da4d8dfd60e0e17fc4d4");
                    } else if (activity == null || c.c == null || !c.c.containsKey(activity)) {
                    } else {
                        c.c.remove(activity);
                    }
                }
            };
        }
    }

    @Deprecated
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da355d2c29ac862f04773ea4b814f13a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da355d2c29ac862f04773ea4b814f13a");
            return;
        }
        try {
            Activity b = b();
            if (b == null || c == null || !c.containsKey(b)) {
                return;
            }
            Object obj = c.get(b);
            if (obj instanceof Promise) {
                WritableMap createMap = Arguments.createMap();
                if (intent != null) {
                    if (intent.hasExtra("resultData") && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "resultData"))) {
                        createMap.putString("resultData", com.sankuai.waimai.platform.utils.f.a(intent, "resultData"));
                    } else if (intent.getExtras() != null) {
                        createMap.putMap("resultData", Arguments.fromBundle(intent.getExtras()));
                    }
                }
                if (!createMap.hasKey(Constant.KEY_RESULT_CODE)) {
                    createMap.putInt(Constant.KEY_RESULT_CODE, i2);
                }
                if (!createMap.hasKey(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                    createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
                }
                ((Promise) obj).resolve(createMap);
            } else if (obj instanceof c.a) {
                JSONObject jSONObject = new JSONObject();
                if (intent != null) {
                    if (intent.hasExtra("resultData") && !TextUtils.isEmpty(com.sankuai.waimai.platform.utils.f.a(intent, "resultData"))) {
                        jSONObject.put("resultData", com.sankuai.waimai.platform.utils.f.a(intent, "resultData"));
                    } else if (intent.getExtras() != null) {
                        jSONObject.put("resultData", intent.getExtras().toString());
                    }
                }
                if (!jSONObject.has(Constant.KEY_RESULT_CODE)) {
                    jSONObject.put(Constant.KEY_RESULT_CODE, i2);
                }
                if (!jSONObject.has(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY)) {
                    jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
                }
                c.a aVar = (c.a) obj;
                if (aVar.a != null) {
                    aVar.a.invoke(aVar.b, jSONObject.toString());
                }
            }
        } catch (Throwable th) {
            com.facebook.common.logging.a.a("MRNBaseDelegate", (String) null, th);
        }
    }

    @Deprecated
    public static void a(Activity activity, c.a aVar) {
        Object[] objArr = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e542bb43e40e2f0a0995bd470eff361e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e542bb43e40e2f0a0995bd470eff361e");
            return;
        }
        Object[] objArr2 = {activity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04176b183d1c57fe41da99a43525b349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04176b183d1c57fe41da99a43525b349");
        } else if (activity == null || aVar == null) {
        } else {
            if (c == null) {
                a();
            }
            if (d == null) {
                d();
            }
            if (!e) {
                activity.getApplication().registerActivityLifecycleCallbacks(d);
                e = true;
            }
            c.put(activity, aVar);
        }
    }

    public final void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19626e6e6822e2308b8ce81693f75844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19626e6e6822e2308b8ce81693f75844");
        } else {
            this.b = new WeakReference<>(activity);
        }
    }

    public final Activity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12bc61f7cde3e2509c223bfc8fa64df", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12bc61f7cde3e2509c223bfc8fa64df");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.get();
    }
}
