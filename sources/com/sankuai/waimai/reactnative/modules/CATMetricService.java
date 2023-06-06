package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Keep;
import com.dianping.monitor.impl.m;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.mrn.container.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.reactnative.WmRNActivity;
import java.util.Collections;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CATMetricService extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    private String obtainCityName(Context context) {
        return "unknown";
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CATMetricService";
    }

    public CATMetricService(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7861fb5dffb5339c5c5d72666c9be9d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7861fb5dffb5339c5c5d72666c9be9d0");
        }
    }

    private String obtainAppVersion(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23a031cb8af02453ce62bac82d13b9e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23a031cb8af02453ce62bac82d13b9e0");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
        } catch (Exception unused) {
            return "";
        }
    }

    @ReactMethod
    public void sendPageLoadTime(Float f, ReadableMap readableMap) {
        Object[] objArr = {f, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0416a8cbf985c09de77a840a08b86fd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0416a8cbf985c09de77a840a08b86fd7");
            return;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity instanceof WmRNActivity) {
            WmRNActivity wmRNActivity = (WmRNActivity) currentActivity;
            if (wmRNActivity.j) {
                return;
            }
            wmRNActivity.j = true;
            g k = wmRNActivity.k();
            if (k == null) {
                return;
            }
            new m(11, com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.b.A().c()).a("WMRNPageLoadTime", Collections.singletonList(f)).a("biz", k.p() != null ? k.p().b() : "").a("component_name", k.p() != null ? k.p().d() : "").a("bundle_name", wmRNActivity.a()).a("cityName", obtainCityName(wmRNActivity)).a("platform", "android").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, obtainAppVersion(wmRNActivity)).a("system_version", Build.VERSION.RELEASE).a("mrn_version", "3.1116.213").a();
        }
    }
}
