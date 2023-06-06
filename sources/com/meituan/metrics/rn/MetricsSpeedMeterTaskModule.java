package com.meituan.metrics.rn;

import android.text.TextUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsSpeedMeterTaskModule extends ReactContextBaseJavaModule {
    public static final int FAILED = 0;
    public static final String MODULE_NAME = "MetricsSpeedMeterTaskModule";
    public static final int SUCCESS = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public MetricsSpeedMeterTaskModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7c802d9c7d0501fb691b1601a1c5f02", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7c802d9c7d0501fb691b1601a1c5f02");
        }
    }

    @ReactMethod
    public void createCustomSpeedTask(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cab8ba10a02b0203bd4232379aa751d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cab8ba10a02b0203bd4232379aa751d2");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            MetricsSpeedMeterTask.createCustomSpeedMeterTask(str, true);
        }
    }

    @ReactMethod
    public void recordStep(ReadableMap readableMap, Promise promise) {
        String str;
        int i = 0;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ac44bf110d5fb8f6671fdc0f8bb5b8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ac44bf110d5fb8f6671fdc0f8bb5b8e");
            return;
        }
        if (readableMap == null) {
            str = "缺少identifier、stepName";
        } else {
            String string = readableMap.hasKey("identifier") ? readableMap.getString("identifier") : null;
            String string2 = readableMap.hasKey("stepName") ? readableMap.getString("stepName") : null;
            int i2 = readableMap.hasKey("timeout") ? readableMap.getInt("timeout") : -1;
            if (TextUtils.isEmpty(string)) {
                str = "缺少identifier";
            } else if (TextUtils.isEmpty(string2)) {
                str = "缺少stepName";
            } else {
                MetricsSpeedMeterTask customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(string);
                if (customSpeedMeterTask != null) {
                    if (i2 > 0) {
                        customSpeedMeterTask.recordStep(string2, i2);
                    } else {
                        customSpeedMeterTask.recordStep(string2);
                    }
                    str = "Success";
                    i = 1;
                } else {
                    str = string + "不存在，请先创建task";
                }
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i);
        createMap.putString("message", str);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void report(ReadableMap readableMap, Promise promise) {
        String str;
        int i = 0;
        Object[] objArr = {readableMap, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c3b1ed450d4c1d56c00a935f5ad2eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c3b1ed450d4c1d56c00a935f5ad2eb");
            return;
        }
        if (readableMap == null) {
            str = "缺少identifier、stepName";
        } else {
            String string = readableMap.hasKey("identifier") ? readableMap.getString("identifier") : null;
            ReadableMap map = readableMap.hasKey("tags") ? readableMap.getMap("tags") : null;
            String string2 = readableMap.hasKey("raw") ? readableMap.getString("raw") : null;
            if (TextUtils.isEmpty(string)) {
                str = "缺少identifier";
            } else {
                MetricsSpeedMeterTask customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(string);
                if (customSpeedMeterTask != null) {
                    h.a(customSpeedMeterTask, map != null ? map.toHashMap() : null, string2);
                    str = "Success";
                    MetricsSpeedMeterTask.removeCustomSpeedMeterTask(string);
                    i = 1;
                } else {
                    str = string + "不存在，请先创建task";
                }
            }
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", i);
        createMap.putString("message", str);
        promise.resolve(createMap);
    }
}
