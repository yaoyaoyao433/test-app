package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.util.Log;
import com.dianping.titans.js.JsHost;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.meituan.android.knb.util.LocationManagerProvider;
import com.sankuai.titans.result.IRequestPermissionCallback;
import com.sankuai.titans.result.PermissionResultCode;
import com.sankuai.titans.result.TitansPermissionUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class RequestPermissionJsHandler extends BaseJsHandler {
    private static final String PERMISSION_TYPE = "type";
    private static final int REQUEST_CODE_ALERT_WINDOW = 1002;
    private static final int REQUEST_CODE_NOTIFICATION = 1001;
    private static final int SERVICE_OFF = 547;
    private static final String TYPE_ALERT_WINDOW = "alertWindow";
    private static final String TYPE_CAMERA = "camera";
    private static final String TYPE_CONTACT = "contact";
    private static final String TYPE_LOCATION_CONTINUOUS = "locationContinuous";
    private static final String TYPE_LOCATION_ONCE = "location";
    private static final String TYPE_MICROPHONE = "microphone";
    private static final String TYPE_NOTIFICATION = "notification";
    private static final String TYPE_PHONE = "phone";
    private static final String TYPE_REMINDER = "reminder";
    private static final String TYPE_STORAGE = "storage";
    private static final String TYPE_STORAGE_READ = "storageRead";
    private static final String TYPE_STORAGE_WRITE = "storageWrite";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final int PERMISSION_GRANTED = PermissionResultCode.getResultCode(2);
    private static final int PERMISSION_DENIED = PermissionResultCode.getResultCode(-7);
    private static final int PERMISSION_UNKNOWN = PermissionResultCode.getResultCode(-4);

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec0a583be77fa5a0f169322d13801887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec0a583be77fa5a0f169322d13801887");
            return;
        }
        try {
            JsHost jsHost = jsHost();
            if (!jsHost.isActivated()) {
                jsCallbackErrorMsg("not alive");
                return;
            }
            Activity activity = jsHost.getActivity();
            if (activity != null && !activity.isFinishing()) {
                String optString = jsBean().argsJson.optString("type", null);
                if (TextUtils.isEmpty(optString)) {
                    jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "type must not be null!");
                    return;
                }
                requestPermission(activity, getSceneToken(), optString, jsBean().argsJson.optBoolean("readonly", false));
                return;
            }
            jsCallbackError(KNBJsErrorInfo.Error_521_Params_Miss_or_Invalid.getErrorCode(), "context is valid!");
        } catch (Throwable th) {
            jsCallbackError(-1, Log.getStackTraceString(th));
        }
    }

    private void requestPermission(Activity activity, final String str, final String str2, boolean z) {
        String str3;
        Object[] objArr = {activity, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a1217f1496ebd59631dc3dcd0d0f7a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a1217f1496ebd59631dc3dcd0d0f7a8");
            return;
        }
        char c = 65535;
        switch (str2.hashCode()) {
            case -1884274053:
                if (str2.equals(TYPE_STORAGE)) {
                    c = 6;
                    break;
                }
                break;
            case -1367751899:
                if (str2.equals("camera")) {
                    c = '\b';
                    break;
                }
                break;
            case -844309396:
                if (str2.equals(TYPE_ALERT_WINDOW)) {
                    c = 1;
                    break;
                }
                break;
            case -525641039:
                if (str2.equals(TYPE_STORAGE_READ)) {
                    c = '\n';
                    break;
                }
                break;
            case -518602638:
                if (str2.equals("reminder")) {
                    c = 2;
                    break;
                }
                break;
            case 106642798:
                if (str2.equals(TYPE_PHONE)) {
                    c = '\t';
                    break;
                }
                break;
            case 595233003:
                if (str2.equals("notification")) {
                    c = 0;
                    break;
                }
                break;
            case 890010148:
                if (str2.equals(TYPE_STORAGE_WRITE)) {
                    c = 11;
                    break;
                }
                break;
            case 951185572:
                if (str2.equals(TYPE_LOCATION_CONTINUOUS)) {
                    c = 4;
                    break;
                }
                break;
            case 951526432:
                if (str2.equals(TYPE_CONTACT)) {
                    c = 5;
                    break;
                }
                break;
            case 1370921258:
                if (str2.equals(TYPE_MICROPHONE)) {
                    c = 7;
                    break;
                }
                break;
            case 1901043637:
                if (str2.equals("location")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                notificationDetect(activity, z);
                return;
            case 1:
                alertWindowHandle(activity, z);
                return;
            case 2:
                str3 = PermissionGuard.PERMISSION_CALENDAR_READ;
                break;
            case 3:
                if (!LocationManagerProvider.isLocationServiceEnable(jsHost().getContext(), str, true)) {
                    callback(false, 547);
                    return;
                } else {
                    str3 = "Locate.once";
                    break;
                }
            case 4:
                if (!LocationManagerProvider.isLocationServiceEnable(jsHost().getContext(), str, true)) {
                    callback(false, 547);
                    return;
                } else {
                    str3 = PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
                    break;
                }
            case 5:
                str3 = PermissionGuard.PERMISSION_CONTACTS_READ;
                break;
            case 6:
                str3 = PermissionGuard.PERMISSION_STORAGE;
                break;
            case 7:
                str3 = PermissionGuard.PERMISSION_MICROPHONE;
                break;
            case '\b':
                str3 = PermissionGuard.PERMISSION_CAMERA;
                break;
            case '\t':
                str3 = PermissionGuard.PERMISSION_PHONE_READ;
                break;
            case '\n':
                str3 = PermissionGuard.PERMISSION_STORAGE_READ;
                break;
            case 11:
                str3 = PermissionGuard.PERMISSION_STORAGE_WRITE;
                break;
            default:
                jsCallbackError(521, "not support type: " + str2);
                return;
        }
        TitansPermissionUtil.checkAndRequestPermission(activity, str3, str, z, new IRequestPermissionCallback() { // from class: com.dianping.titans.js.jshandler.RequestPermissionJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.result.IRequestPermissionCallback
            public void onResult(boolean z2, int i) {
                Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "72a8b7e6df987f929b33b98e108c8cab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "72a8b7e6df987f929b33b98e108c8cab");
                } else if (z2) {
                    RequestPermissionJsHandler.this.callback(true, i);
                } else {
                    RequestPermissionJsHandler requestPermissionJsHandler = RequestPermissionJsHandler.this;
                    requestPermissionJsHandler.jsCallbackError(i, "requestPermission error sceneToken is " + str + "type is " + str2);
                }
            }
        });
    }

    private void alertWindowHandle(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6dfb0befb5c5d6d7f8a032512a4e6d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6dfb0befb5c5d6d7f8a032512a4e6d59");
        } else if (z) {
            if (hasAlertWindowPermission(activity)) {
                callback(true, PERMISSION_GRANTED);
            } else {
                callback(false, PERMISSION_DENIED);
            }
        } else if (hasAlertWindowPermission(activity)) {
            callback(true, PERMISSION_GRANTED);
        } else if (requestAlertWindowPermission(activity, 1002)) {
        } else {
            callback(false, PERMISSION_UNKNOWN);
        }
    }

    private void notificationDetect(Activity activity, boolean z) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "268fee90ec97a58d36aa29a4a4a356e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "268fee90ec97a58d36aa29a4a4a356e4");
            return;
        }
        boolean areNotificationsEnabled = NotificationManagerCompat.from(activity).areNotificationsEnabled();
        if (areNotificationsEnabled || z) {
            callback(areNotificationsEnabled, areNotificationsEnabled ? PERMISSION_GRANTED : PERMISSION_DENIED);
        } else {
            goApplicationDetailsSettings(activity, 1001);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ef265dc48e9f9a85b781c408ec75f6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ef265dc48e9f9a85b781c408ec75f6a");
            return;
        }
        super.onActivityResult(i, i2, intent);
        JsHost jsHost = jsHost();
        if (!jsHost.isActivated()) {
            jsCallbackErrorMsg("not alive");
        } else if (i == 1001) {
            notificationDetect(jsHost.getActivity(), true);
        } else if (i == 1002) {
            if (hasAlertWindowPermission(jsHost.getActivity())) {
                callback(true, PERMISSION_GRANTED);
            } else {
                callback(false, PERMISSION_DENIED);
            }
        }
    }

    private void goApplicationDetailsSettings(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9733c49c5b97977b0d358665993f5b40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9733c49c5b97977b0d358665993f5b40");
            return;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        activity.startActivityForResult(intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void callback(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b310c46ddee98e42cadcfa01c6e12098", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b310c46ddee98e42cadcfa01c6e12098");
        } else if (z) {
            jsCallback();
        } else {
            jsCallbackError(i, "not enabled");
        }
    }

    private boolean hasAlertWindowPermission(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8f72be859587bfce0701e09f78d30d6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8f72be859587bfce0701e09f78d30d6c")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return hasAlertWindowPermissionBelowM(context, "android.permission.SYSTEM_ALERT_WINDOW");
    }

    private boolean hasAlertWindowPermissionBelowM(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92d1da94cfa9ecb38f5049cc9340c2c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92d1da94cfa9ecb38f5049cc9340c2c2")).booleanValue();
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
        } catch (Exception unused) {
        }
        return false;
    }

    private boolean requestAlertWindowPermission(Activity activity, int i) {
        Intent intent;
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ec0817e824a075263257e2f03c9517d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ec0817e824a075263257e2f03c9517d")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                } else {
                    intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activity.getPackageName()));
                }
                activity.startActivityForResult(intent, i);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
