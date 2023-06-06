package com.meituan.android.customerservice.kit.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.mapsdk.internal.y;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b072abcb25a494e112373cbe77c4562", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b072abcb25a494e112373cbe77c4562")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return Build.VERSION.SDK_INT < 19 || a(context, 24);
    }

    private static boolean a(Context context, Intent intent, int i) {
        Object[] objArr = {context, intent, 16};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5b3e56458967f988f948edae353c1a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5b3e56458967f988f948edae353c1a5")).booleanValue();
        }
        try {
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 16);
            } else {
                intent.setFlags(y.a);
                context.startActivity(intent);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            b.a("SettingsCompat", "activity not found ,exc " + e.toString());
            return false;
        } catch (SecurityException e2) {
            b.a("SettingsCompat", "SecurityException permission denial ,exc " + e2.toString());
            return false;
        }
    }

    @TargetApi(19)
    private static boolean a(Context context, int i) {
        Object[] objArr = {context, 24};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ca16524f7f7cee6f27fe2cf7eed18c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ca16524f7f7cee6f27fe2cf7eed18c8")).booleanValue();
        }
        try {
            return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
        } catch (Exception e) {
            Log.e("SettingsCompat", Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean a(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fa61811bd25506c0d9484a6b35c57fd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fa61811bd25506c0d9484a6b35c57fd")).booleanValue();
        }
        try {
            return a(context, intent, 16);
        } catch (Exception e) {
            Log.e("SettingsCompat", "StartSafely Exception: " + e.getMessage());
            return false;
        }
    }

    public static boolean b(Context context) {
        boolean a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3c4c7f88a502edd55c4c511c3f1c1e7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3c4c7f88a502edd55c4c511c3f1c1e7c")).booleanValue();
        }
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.putExtra("packageName", context.getPackageName());
            intent.setFlags(y.a);
            a2 = a(context, intent);
        } catch (Exception e) {
            try {
                Log.e("SettingsCompat", "获取悬浮窗权限, 打开AppSecActivity失败, " + Log.getStackTraceString(e));
                Object[] objArr2 = {context};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5dca25d6bf41b62877e680dc24db19a9", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5dca25d6bf41b62877e680dc24db19a9")).booleanValue();
                } else {
                    Intent intent2 = new Intent(Settings.class.getDeclaredField("ACTION_MANAGE_OVERLAY_PERMISSION").get(null).toString());
                    intent2.setFlags(y.a);
                    intent2.setData(Uri.parse("package:" + context.getPackageName()));
                    a2 = a(context, intent2);
                }
            } catch (Exception e2) {
                Log.e("SettingsCompat", "获取悬浮窗权限失败, 通用获取方法失败, " + Log.getStackTraceString(e2));
                return false;
            }
        }
        return a2;
    }
}
