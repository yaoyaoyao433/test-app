package com.hhmedic.android.sdk.module.permission.romUtils;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.RouteSelector;
import com.tencent.mapsdk.internal.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RomUtils {
    public static String getSystemProperty(String str) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return readLine;
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean checkIsHuaweiRom() {
        return Build.MANUFACTURER.contains("HUAWEI");
    }

    public static boolean checkIsMiuiRom() {
        return !TextUtils.isEmpty(getSystemProperty("ro.miui.ui.version.name"));
    }

    public static boolean checkIsMeizuRom() {
        String systemProperty = getSystemProperty("ro.build.display.id");
        if (TextUtils.isEmpty(systemProperty)) {
            return false;
        }
        return systemProperty.contains("flyme") || systemProperty.toLowerCase().contains("flyme");
    }

    public static boolean checkIs360Rom() {
        return Build.MANUFACTURER.contains("QiKU") || Build.MANUFACTURER.contains("360");
    }

    public static boolean checkIsOppoRom() {
        return Build.MANUFACTURER.toUpperCase().contains(RouteSelector.ROM_OPPO);
    }

    public static boolean checkIsVivoRom() {
        return Build.MANUFACTURER.toUpperCase().contains(RouteSelector.ROM_VIVO);
    }

    @TargetApi(19)
    public static boolean hasMiuiPermission(Context context) {
        return ((AppOpsManager) context.getSystemService("appops")).checkOp("android:fine_location", Binder.getCallingUid(), context.getPackageName()) != 1;
    }

    public static void goAppDetailSettingIntent(Context context) {
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.iqoo.secure");
            if (launchIntentForPackage != null) {
                context.startActivity(launchIntentForPackage);
                return;
            }
            Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage("com.oppo.safe");
            if (launchIntentForPackage2 != null) {
                context.startActivity(launchIntentForPackage2);
                return;
            }
            Intent intent = new Intent();
            intent.addFlags(y.a);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isIntentAvailable(Intent intent, Context context) {
        return intent != null && context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static void tryGo(Context context, Intent intent) {
        if (isIntentAvailable(intent, context)) {
            context.startActivity(intent);
        } else {
            goAppDetailSettingIntent(context);
        }
    }

    public static void toAppPermissionSetting(Context context) {
        Intent intent = new Intent();
        intent.setFlags(y.a);
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        tryGo(context, intent);
    }

    public static void applyMeizuPermission(Context context) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.putExtra("packageName", context.getPackageName());
        intent.setFlags(y.a);
        tryGo(context, intent);
    }

    public static int getMiuiVersion() {
        String systemProperty = getSystemProperty("ro.miui.ui.version.name");
        if (systemProperty != null) {
            try {
                return Integer.parseInt(systemProperty.substring(1));
            } catch (Exception unused) {
                return -1;
            }
        }
        return -1;
    }

    public static Intent goToMiuiPermissionActivity_V5(Context context) {
        String packageName = context.getPackageName();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", packageName, null));
        intent.setFlags(y.a);
        return intent;
    }

    public static Intent goToMiuiPermissionActivity_V67(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
        intent.putExtra("extra_pkgname", context.getPackageName());
        intent.setFlags(y.a);
        return intent;
    }

    public static Intent goToMiuiPermissionActivity_V8(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", context.getPackageName());
        intent.setFlags(y.a);
        if (isIntentAvailable(intent, context)) {
            context.startActivity(intent);
            return intent;
        }
        Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent2.setPackage("com.miui.securitycenter");
        intent2.putExtra("extra_pkgname", context.getPackageName());
        intent2.setFlags(y.a);
        return intent2;
    }

    public static void toPermisstionSetting(Context context) {
        Intent goToMiuiPermissionActivity_V67;
        int miuiVersion = getMiuiVersion();
        if (5 == miuiVersion) {
            goToMiuiPermissionActivity_V67 = goToMiuiPermissionActivity_V5(context);
        } else if (miuiVersion == 6 || miuiVersion == 7) {
            goToMiuiPermissionActivity_V67 = goToMiuiPermissionActivity_V67(context);
        } else {
            goToMiuiPermissionActivity_V67 = miuiVersion >= 8 ? goToMiuiPermissionActivity_V8(context) : null;
        }
        tryGo(context, goToMiuiPermissionActivity_V67);
    }

    public static void applyOppoPermission(Context context) {
        tryGo(context, null);
    }

    public static void applyQikuPermission(Context context) {
        tryGo(context, null);
    }

    public static void applyVivoPermission(Context context) {
        tryGo(context, null);
    }
}
