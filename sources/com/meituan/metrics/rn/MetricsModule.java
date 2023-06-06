package com.meituan.metrics.rn;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.metrics.sampler.MetricSampleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MetricsModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ReactContext mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MTPerfMonitor";
    }

    public MetricsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f48946872074c7ee6e2b6ce8ca656c3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f48946872074c7ee6e2b6ce8ca656c3b");
        } else {
            this.mReactContext = reactApplicationContext;
        }
    }

    @ReactMethod
    public void recordJSFps() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09b1cd436eb9d70fd70c328bf3de9157", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09b1cd436eb9d70fd70c328bf3de9157");
        } else {
            MetricSampleManager.getInstance().addRNSample(new MetricsJSFPSSamplerImpl(this.mReactContext));
        }
    }

    @ReactMethod
    public void startCustomRecordFps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab40c76cb00ee7e35ecd45769b5dea62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab40c76cb00ee7e35ecd45769b5dea62");
        } else {
            MetricSampleManager.getInstance().startRNCustomFPS(str);
        }
    }

    @ReactMethod
    public void stopCustomRecordFps(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4df9e759461e89060382247849b54b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4df9e759461e89060382247849b54b7");
        } else {
            MetricSampleManager.getInstance().stopRNCustomFPS(str);
        }
    }

    public static void requestPermission(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f4656f98e74881e8f19cb85bcf2ad0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f4656f98e74881e8f19cb85bcf2ad0b");
        } else if (Build.VERSION.SDK_INT < 23 || Settings.canDrawOverlays(context)) {
        } else {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(y.a);
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    private static boolean permissionCheck(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3605d56e4e24e7a16b5602ca691867cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3605d56e4e24e7a16b5602ca691867cf")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return hasPermission(context, "android.permission.SYSTEM_ALERT_WINDOW");
    }

    private static boolean hasPermission(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "048cf7a030a90554ccf458ddfc008ee9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "048cf7a030a90554ccf458ddfc008ee9")).booleanValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String str2 : packageInfo.requestedPermissions) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "edfbd5155a3f7ee80f5cf894816dd331", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "edfbd5155a3f7ee80f5cf894816dd331")).booleanValue() : intent.resolveActivity(context.getPackageManager()) != null;
    }
}
