package com.sankuai.common.utils.shortcut;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.b;
import com.sankuai.waimai.platform.utils.f;
import com.tencent.mapsdk.internal.y;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ShortcutUtils {
    public static final String COMMON_SHORTCUT_ACTION = "com.sankuai.common.SHORTCUT";
    private static final int ERROR_CODE_EXCEED_MAX_COUNT = 203;
    private static final int ERROR_CODE_INVALID_PARAM = 202;
    private static final int ERROR_CODE_UNKNOWN = 204;
    private static final int ERROR_CODE_UNSUPPORTED = 201;
    public static final String EXTRA_DUPLICATE = "duplicate";
    public static final String EXTRA_SHORTCUT_ANDROID_TYPE = "extra_shortcut_android_type";
    public static final String EXTRA_SHORTCUT_NAME_KEY = "extra_shortcut_name_key";
    private static final int MAX_DYNAMIC_SHORTCUT_COUNT = 4;
    public static final int SHORTCUT_TYPE_ADD = 1;
    public static final int SHORTCUT_TYPE_DELETE = 256;
    public static final int SHORTCUT_TYPE_DISABLE = 257;
    public static final int SHORTCUT_TYPE_DYNAMIC = 1;
    public static final int SHORTCUT_TYPE_ENABLE = 272;
    public static final int SHORTCUT_TYPE_PINNED = 2;
    public static final int SHORTCUT_TYPE_QUERY = 16;
    public static final int SHORTCUT_TYPE_UPDATE = 17;
    public static final int SHORTCUT_TYPE_WIDGET = 3;
    public static final int SUCCEED = 200;
    private static final String TAG = "ShortcutUtils";
    public static final int TYPE_SHORTCUT_BEFOREV26 = 1;
    public static final int TYPE_SHORTCUT_SINCEV26 = 2;
    public static final int TYPE_WIDGET_SINCEV26 = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static BroadcastReceiver mReceiver;

    private static String getSelection() {
        return "title=? and intent=?";
    }

    public static boolean isSupported(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "445fc55fd666cfbde1324f846f88dcfb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "445fc55fd666cfbde1324f846f88dcfb")).booleanValue() : SupportUtils.isSupported(context, i, i2);
    }

    public static ShortcutResult addShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, int i) {
        Object[] objArr = {context, shortcutInfoCompat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e9ec7d285b0845bfbebd03724016cf0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e9ec7d285b0845bfbebd03724016cf0");
        }
        if (context == null || shortcutInfoCompat == null) {
            return new ShortcutResult(202, "非法参数");
        }
        if (!isSupported(context, i, 1)) {
            return new ShortcutResult(201, "unsupported add shortcut, shortcutType " + i);
        } else if (SupportUtils.isDynamicType(i)) {
            return addDynamicShortcuts(context, shortcutInfoCompat.getShortcutInfoSinceV25());
        } else {
            if (SupportUtils.isPinnedType(i)) {
                if (Build.VERSION.SDK_INT > 25) {
                    return addPinnedShortcutSinceV26(context, shortcutInfoCompat.getShortcutInfoSinceV25());
                }
                return addPinnedShortcutBeforeV26(context, shortcutInfoCompat.getShortcutInfoBeforeV25());
            } else if (SupportUtils.isWidgetType(i)) {
                return addWidgetShortcut(context, shortcutInfoCompat.getShortcutWidgetInfo());
            } else {
                return new ShortcutResult(201, "unsupported add shortcut, shortcutType " + i);
            }
        }
    }

    private static ShortcutResult addDynamicShortcuts(Context context, ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        boolean z;
        Object[] objArr = {context, shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3b2da1d1def0e5fc492e2cf5b7f9a8a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3b2da1d1def0e5fc492e2cf5b7f9a8a");
        }
        if (shortcutInfoSinceV25 == null) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getApplicationContext().getSystemService("shortcut");
            if (isFull(context)) {
                return new ShortcutResult(203, "动态快捷方式已达到最大数量，无法再次添加");
            }
            ArrayList arrayList = new ArrayList();
            ShortcutInfo convert = ShortcutInfoSinceV25.convert(context, shortcutInfoSinceV25);
            if (convert != null) {
                arrayList.add(convert);
            }
            try {
                z = shortcutManager.addDynamicShortcuts(arrayList);
            } catch (Exception e) {
                Log.e(TAG, "addDynamicShortcuts Exception:" + e.toString());
                z = false;
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "add shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not add dynamic shortcut before android 25");
    }

    @RequiresApi(api = 25)
    private static boolean isFull(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "78c1c1e647dff2f90be5d48f80edd722", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "78c1c1e647dff2f90be5d48f80edd722")).booleanValue();
        }
        ShortcutManager shortcutManager = (ShortcutManager) context.getApplicationContext().getSystemService("shortcut");
        try {
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            List<ShortcutInfo> manifestShortcuts = shortcutManager.getManifestShortcuts();
            return (dynamicShortcuts == null ? 0 : dynamicShortcuts.size()) + (manifestShortcuts == null ? 0 : manifestShortcuts.size()) >= 4;
        } catch (Exception unused) {
            return false;
        }
    }

    private static ShortcutResult addPinnedShortcutSinceV26(Context context, ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        boolean z;
        Object[] objArr = {context, shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8fe81c4af5ec736b866631e7781a253b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8fe81c4af5ec736b866631e7781a253b");
        }
        if (shortcutInfoSinceV25 == null) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT > 25) {
            if (!ShortcutManagerCompat.isRequestPinShortcutSupported(context.getApplicationContext())) {
                return new ShortcutResult(201, "不支持添加固定类型的快捷方式");
            }
            try {
                z = ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).requestPinShortcut(ShortcutInfoSinceV25.convert(context, shortcutInfoSinceV25), getShortcutSuccessPendingIntent(context, shortcutInfoSinceV25.getId(), 2).getIntentSender());
            } catch (Exception e) {
                Log.e(TAG, "addPinnedShortcutSinceV26 Exception:" + e.toString());
                z = false;
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "addPinnedShortcut失败,请检查一下应用是否开启桌面快捷方式权限");
        }
        return new ShortcutResult(201, "Android O 以下版本使用 addPinnedShortcut before AndroidO");
    }

    private static ShortcutResult addPinnedShortcutBeforeV26(Context context, ShortcutInfoBeforeV25 shortcutInfoBeforeV25) {
        Object[] objArr = {context, shortcutInfoBeforeV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b1be508d3af6a26bf5e6d8758ae5df1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b1be508d3af6a26bf5e6d8758ae5df1b");
        }
        if (!ShortcutInfoBeforeV25.isValid(shortcutInfoBeforeV25)) {
            return new ShortcutResult(202, "非法参数");
        }
        if (!LauncherUtils.isSupportedAddBeforeV26(context)) {
            return new ShortcutResult(201, "当前机型不支持添加快捷方式");
        }
        if (RomUtils.isNubia() && f.a(shortcutInfoBeforeV25.getLaunchIntent(), "profile", 0L) == 0) {
            shortcutInfoBeforeV25.getLaunchIntent().putExtra("profile", 0L);
        }
        try {
            Intent installShortcutIntent = ShortcutInfoBeforeV25.getInstallShortcutIntent(context, shortcutInfoBeforeV25);
            installShortcutIntent.setAction(LauncherUtils.getInstallShortcutAction());
            final IntentSender intentSender = getShortcutSuccessPendingIntent(context, shortcutInfoBeforeV25.getShortcutName(), 1).getIntentSender();
            b.a(context, installShortcutIntent, null, new BroadcastReceiver() { // from class: com.sankuai.common.utils.shortcut.ShortcutUtils.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    Object[] objArr2 = {context2, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "78c6a83638dd8c22f1c6fda133caf3b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "78c6a83638dd8c22f1c6fda133caf3b4");
                        return;
                    }
                    try {
                        intentSender.sendIntent(context2, 0, null, null, null);
                    } catch (IntentSender.SendIntentException unused) {
                    }
                }
            }, null, -1, null, null);
            return new ShortcutResult(200, "addPinnedShortcutBeforeV26 Succeed");
        } catch (Exception e) {
            Log.e(TAG, "addPinnedShortcutBeforeV26 Exception:" + e.toString());
            return new ShortcutResult(204, "can not add pinned shortcut before android 26");
        }
    }

    private static ShortcutResult addWidgetShortcut(Context context, ShortcutWidgetInfo shortcutWidgetInfo) {
        boolean z = false;
        Object[] objArr = {context, shortcutWidgetInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "11f83a14b8380a76ea06a5d0cabdf3ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "11f83a14b8380a76ea06a5d0cabdf3ef");
        }
        if (!ShortcutWidgetInfo.isValidForAdding(shortcutWidgetInfo)) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager appWidgetManager = (AppWidgetManager) context.getApplicationContext().getSystemService(AppWidgetManager.class);
            if (appWidgetManager != null) {
                try {
                    z = appWidgetManager.requestPinAppWidget(new ComponentName(context, shortcutWidgetInfo.getProvider()), null, getShortcutSuccessPendingIntent(context, shortcutWidgetInfo.getName(), 3));
                } catch (Exception e) {
                    Log.e(TAG, "addWidgetShortcut Exception:" + e);
                }
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "add widget failed with unknown reason");
        }
        return new ShortcutResult(201, "Android O 以下版本不支持 Widget");
    }

    private static PendingIntent getShortcutSuccessPendingIntent(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9c037c97c89fa06d857163139528038", RobustBitConfig.DEFAULT_VALUE)) {
            return (PendingIntent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9c037c97c89fa06d857163139528038");
        }
        Intent intent = new Intent(COMMON_SHORTCUT_ACTION);
        intent.putExtra(EXTRA_SHORTCUT_NAME_KEY, str);
        intent.putExtra(EXTRA_SHORTCUT_ANDROID_TYPE, i);
        return PendingIntent.getBroadcast(context, 0, intent, y.a);
    }

    public static void registerShortcutReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84ef42be40f2d3a377937c0004a71f09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84ef42be40f2d3a377937c0004a71f09");
        } else if (context != null) {
            try {
                context.registerReceiver(broadcastReceiver, new IntentFilter(COMMON_SHORTCUT_ACTION));
            } catch (Exception unused) {
            }
        }
    }

    public static void unregisterShortcutReceiver(Context context, BroadcastReceiver broadcastReceiver) {
        Object[] objArr = {context, broadcastReceiver};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f741edd98bd83cd189101a4fdaf3bbe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f741edd98bd83cd189101a4fdaf3bbe4");
        } else if (context == null || broadcastReceiver == null) {
        } else {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        }
    }

    @Nullable
    public static Intent getPermissionSettingPageIntent(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e29b2c6af0068a4fd47e818a3e4bfe48", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e29b2c6af0068a4fd47e818a3e4bfe48");
        }
        if (context == null) {
            return null;
        }
        Intent intent = new Intent();
        if (RomUtils.isMiui()) {
            intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
            intent.putExtra("extra_pkgname", context.getPackageName());
        } else if (RomUtils.isOppo()) {
            intent.setComponent(new ComponentName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity"));
            intent.setAction("coloros.intent.action.launcher.SHORTCUT_SETTINGS");
        } else if (RomUtils.isVivo()) {
            intent.setComponent(new ComponentName("com.bbk.launcher2", "com.bbk.launcher2.installshortcut.PurviewActivity"));
        } else if (RomUtils.isFlyme()) {
            intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", context.getPackageName());
        } else {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.queryIntentActivities(intent, 65536).size() <= 0) {
            return null;
        }
        return intent;
    }

    public static boolean startPermissionSettingPageActivity(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9ec93a4f68040bbd5d7ce1294e68b761", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9ec93a4f68040bbd5d7ce1294e68b761")).booleanValue();
        }
        Intent permissionSettingPageIntent = getPermissionSettingPageIntent(context);
        if (permissionSettingPageIntent == null) {
            return false;
        }
        try {
            context.startActivity(permissionSettingPageIntent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static ShortcutResult updateShortcut(Context context, ShortcutInfoCompat shortcutInfoCompat, int i) {
        Object[] objArr = {context, shortcutInfoCompat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d94382ebc8007d003d6b1111b2ca6d00", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d94382ebc8007d003d6b1111b2ca6d00");
        }
        if (context == null || shortcutInfoCompat == null) {
            return new ShortcutResult(202, "非法参数");
        }
        if (!isSupported(context, i, 17)) {
            return new ShortcutResult(201, "can not update shortcut");
        }
        if (SupportUtils.isDynamicType(i)) {
            if (shortcutInfoCompat.getShortcutInfoSinceV25() == null) {
                return new ShortcutResult(202, "updateParamSinceV25 不能为空");
            }
            return updateDynamicShortcut(context, shortcutInfoCompat.getShortcutInfoSinceV25());
        } else if (SupportUtils.isPinnedType(i)) {
            if (Build.VERSION.SDK_INT > 25) {
                return updatePinnedShortcutSinceV26(context, shortcutInfoCompat.getShortcutInfoSinceV25());
            }
            return updatePinnedShortcutBeforeV26(context, shortcutInfoCompat);
        } else if (SupportUtils.isWidgetType(i)) {
            return updateWidgetShortcut(context, shortcutInfoCompat.getShortcutWidgetInfo());
        } else {
            return new ShortcutResult(201, "can not update dynamic shortcut before android 25");
        }
    }

    private static ShortcutResult updatePinnedShortcutBeforeV26(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Object[] objArr = {context, shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2433a7e3ee0fad7ba42a656401092d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2433a7e3ee0fad7ba42a656401092d0f");
        }
        removePinnedShortcutBeforeV26(context, shortcutInfoCompat, true);
        return addPinnedShortcutBeforeV26(context, shortcutInfoCompat.getShortcutInfoBeforeV25());
    }

    private static ShortcutResult updatePinnedShortcutSinceV26(Context context, ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        boolean z;
        Object[] objArr = {context, shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1072dc261cb5c6b6897dacf32c457fc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1072dc261cb5c6b6897dacf32c457fc9");
        }
        if (!ShortcutInfoSinceV25.isValid(shortcutInfoSinceV25)) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT > 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getApplicationContext().getSystemService("shortcut");
            ArrayList arrayList = new ArrayList();
            ShortcutInfo convert = ShortcutInfoSinceV25.convert(context, shortcutInfoSinceV25);
            if (convert != null) {
                arrayList.add(convert);
            }
            try {
                z = shortcutManager.updateShortcuts(arrayList);
            } catch (Exception e) {
                Log.e(TAG, "updatePinnedShortcutSinceV26 Exception:" + e.toString());
                z = false;
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "update shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not update Pinned shortcut before android 25");
    }

    private static ShortcutResult updateDynamicShortcut(Context context, ShortcutInfoSinceV25 shortcutInfoSinceV25) {
        boolean z;
        Object[] objArr = {context, shortcutInfoSinceV25};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd93a277fd4e55701f8f7ab01df6f07e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd93a277fd4e55701f8f7ab01df6f07e");
        }
        if (!ShortcutInfoSinceV25.isValid(shortcutInfoSinceV25)) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getApplicationContext().getSystemService("shortcut");
            ArrayList arrayList = new ArrayList();
            ShortcutInfo convert = ShortcutInfoSinceV25.convert(context, shortcutInfoSinceV25);
            if (convert != null) {
                arrayList.add(convert);
            }
            try {
                z = shortcutManager.addDynamicShortcuts(arrayList);
            } catch (Exception e) {
                Log.e(TAG, "updateDynamicShortcut Exception:" + e.toString());
                z = false;
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "update shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not update dynamic shortcut before android 25");
    }

    private static ShortcutResult updateWidgetShortcut(Context context, ShortcutWidgetInfo shortcutWidgetInfo) {
        boolean z = false;
        Object[] objArr = {context, shortcutWidgetInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9a0cffe6c4477f7b567cde26e1eab44d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9a0cffe6c4477f7b567cde26e1eab44d");
        }
        if (!ShortcutWidgetInfo.isValidForUpdating(shortcutWidgetInfo)) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager appWidgetManager = (AppWidgetManager) context.getApplicationContext().getSystemService(AppWidgetManager.class);
            if (appWidgetManager != null) {
                try {
                    appWidgetManager.updateAppWidget(new ComponentName(context, shortcutWidgetInfo.getProvider()), shortcutWidgetInfo.getRemoteViews());
                    z = true;
                } catch (Exception e) {
                    Log.e(TAG, "updateWidgetShortcut Exception:", e);
                }
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "update widget failed with unknown reason");
        }
        return new ShortcutResult(201, "Android O 以下版本不支持 Widget");
    }

    public static ShortcutResult removeShortcuts(Context context, ShortcutInfoCompat shortcutInfoCompat, int i) {
        Object[] objArr = {context, shortcutInfoCompat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98726525eb40130a460d087120b52f16", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98726525eb40130a460d087120b52f16");
        }
        if (!isSupported(context, i, 256)) {
            return new ShortcutResult(201, "can not remove shortcut,shortcutType: " + i);
        } else if (context == null || shortcutInfoCompat == null) {
            return new ShortcutResult(202, "非法参数");
        } else {
            if (SupportUtils.isDynamicType(i)) {
                if (TextUtils.isEmpty(shortcutInfoCompat.getShortcutIdSinceV26())) {
                    return new ShortcutResult(202, "shortcut id should not be null");
                }
                return removeDynamicShortcuts(context, getRemovedIdList(shortcutInfoCompat));
            } else if (SupportUtils.isPinnedType(i)) {
                if (Build.VERSION.SDK_INT <= 25) {
                    return removePinnedShortcutBeforeV26(context, shortcutInfoCompat, false);
                }
                return new ShortcutResult(201, "can not remove pinned shortcut since Android 26");
            } else {
                return new ShortcutResult(201, "can not remove  shortcut");
            }
        }
    }

    private static List<String> getRemovedIdList(ShortcutInfoCompat shortcutInfoCompat) {
        Object[] objArr = {shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2dee60ec4e6653e997e939da9b98062", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2dee60ec4e6653e997e939da9b98062");
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(shortcutInfoCompat.getShortcutIdSinceV26())) {
            arrayList.add(shortcutInfoCompat.getShortcutIdSinceV26());
        }
        return arrayList;
    }

    private static ShortcutResult removeDynamicShortcuts(Context context, List<String> list) {
        boolean z = false;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9762303bada89d64985c8d37f751f081", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9762303bada89d64985c8d37f751f081");
        }
        if (context == null || list == null || list.size() == 0) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).removeDynamicShortcuts(list);
                z = true;
            } catch (Exception e) {
                Log.e(TAG, "removeDynamicShortcut Exception:" + e.toString());
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "remove shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not remove dynamic shortcut before android 25");
    }

    public static ShortcutResult removeAllDynamicShortcuts(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a5d7f846b8b6d8cd9cbd59ca4745ca4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a5d7f846b8b6d8cd9cbd59ca4745ca4");
        }
        if (context == null) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            try {
                ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).removeAllDynamicShortcuts();
            } catch (Exception e) {
                Log.e(TAG, "removeAllDynamicShortcuts Exception:" + e.toString());
                z = false;
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "remove shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not remove dynamic shortcut before android 25");
    }

    private static ShortcutResult removePinnedShortcutBeforeV26(Context context, ShortcutInfoCompat shortcutInfoCompat, boolean z) {
        Object[] objArr = {context, shortcutInfoCompat, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96f41f527ba242ea71931f2d81a42df6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96f41f527ba242ea71931f2d81a42df6");
        }
        if (!ShortcutManagerCompat.isRequestPinShortcutSupported(context)) {
            return new ShortcutResult(201, "请检查launcher 读写权限");
        }
        if (TextUtils.isEmpty(LauncherUtils.getUninstallShortcutAction(context))) {
            return new ShortcutResult(201, "不支持删除操作");
        }
        String shortcutNameBeforeV25 = shortcutInfoCompat.getShortcutNameBeforeV25();
        Intent oldLaunchIntentBeforeV25 = z ? shortcutInfoCompat.getOldLaunchIntentBeforeV25() : shortcutInfoCompat.getLauncherIntentBeforeV25();
        boolean isAllowDuplicate = shortcutInfoCompat.isAllowDuplicate();
        if (TextUtils.isEmpty(shortcutNameBeforeV25) || oldLaunchIntentBeforeV25 == null) {
            return new ShortcutResult(202, "Intent,ShortcutName,MtShortcutInfoBeforeV25 都不能为空");
        }
        Intent intent = new Intent();
        intent.putExtra(EXTRA_DUPLICATE, isAllowDuplicate);
        intent.putExtra("android.intent.extra.shortcut.NAME", shortcutNameBeforeV25);
        intent.putExtra("android.intent.extra.shortcut.INTENT", oldLaunchIntentBeforeV25);
        if (RomUtils.isNubia() && f.a(oldLaunchIntentBeforeV25, "profile", 0L) == 0) {
            oldLaunchIntentBeforeV25.putExtra("profile", 0L);
        }
        intent.setAction(LauncherUtils.getUninstallShortcutAction(context));
        b.a(context, intent);
        return new ShortcutResult(200);
    }

    public static ShortcutResult disablePinnedShortcut(Context context, List<String> list, String str) {
        boolean z = false;
        Object[] objArr = {context, list, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c40235244608c491d906927211528748", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c40235244608c491d906927211528748");
        }
        if (context == null || list == null || list.size() == 0) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT > 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getApplicationContext().getSystemService("shortcut");
            try {
                if (TextUtils.isEmpty(str)) {
                    shortcutManager.disableShortcuts(list);
                } else {
                    shortcutManager.disableShortcuts(list, str);
                }
                z = true;
            } catch (Exception e) {
                Log.e(TAG, "disablePinnedShortcut Exception:" + e.toString());
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "disable shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not disable shortcut before android 25");
    }

    public static ShortcutResult disablePinnedShortcut(Context context, List<String> list) {
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dba2346ac136ef14bf14bacb351277f8", RobustBitConfig.DEFAULT_VALUE) ? (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dba2346ac136ef14bf14bacb351277f8") : disablePinnedShortcut(context, list, null);
    }

    public static ShortcutResult enablePinnedShortcut(Context context, List<String> list) {
        boolean z = false;
        Object[] objArr = {context, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ddefe92c3f2aeb68da532b526b7f6ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShortcutResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ddefe92c3f2aeb68da532b526b7f6ba");
        }
        if (context == null || list == null || list.size() == 0) {
            return new ShortcutResult(202, "非法参数");
        }
        if (Build.VERSION.SDK_INT > 25) {
            try {
                ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).enableShortcuts(list);
                z = true;
            } catch (Exception e) {
                Log.e(TAG, "enablePinnedShortcut Exception:" + e.toString());
            }
            if (z) {
                return new ShortcutResult(200);
            }
            return new ShortcutResult(204, "enable shortcut failed with unknown reason");
        }
        return new ShortcutResult(201, "can not enable shortcut before android 26");
    }

    public static boolean isShortcutExist(Context context, ShortcutInfoCompat shortcutInfoCompat, int i) {
        Object[] objArr = {context, shortcutInfoCompat, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68b8f3b5754d84fcbf755fbcb493bded", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68b8f3b5754d84fcbf755fbcb493bded")).booleanValue();
        }
        if (context == null || shortcutInfoCompat == null || !isSupported(context, i, 16)) {
            return false;
        }
        if (SupportUtils.isDynamicType(i)) {
            return isDynamicExist(context, shortcutInfoCompat);
        }
        if (SupportUtils.isPinnedType(i)) {
            return isPinnedExist(context, shortcutInfoCompat);
        }
        if (SupportUtils.isWidgetType(i)) {
            return isWidgetExist(context, shortcutInfoCompat);
        }
        StringBuilder sb = new StringBuilder("isShortcutExist type: ");
        sb.append(i);
        sb.append(" is not supported");
        return false;
    }

    private static boolean isPinnedExist(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Object[] objArr = {context, shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1604e1bbdffab926a14fd54579acf7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1604e1bbdffab926a14fd54579acf7e")).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 25) {
            return isPinnedExistSinceV26(context, shortcutInfoCompat);
        }
        return isShortCutExistBeforeV26(context, shortcutInfoCompat.getShortcutNameBeforeV25(), shortcutInfoCompat.getLauncherIntentBeforeV25());
    }

    @RequiresApi(api = 25)
    private static boolean isPinnedExistSinceV26(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        List<ShortcutInfo> pinnedShortcuts;
        Object[] objArr = {context, shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49eae60589565339d8fc9c3068f007ec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49eae60589565339d8fc9c3068f007ec")).booleanValue();
        }
        if (TextUtils.isEmpty(shortcutInfoCompat.getShortcutIdSinceV26())) {
            return false;
        }
        try {
            pinnedShortcuts = ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).getPinnedShortcuts();
        } catch (Exception e) {
            Log.e(TAG, "isPinnedExistSinceV26 Exception:" + e.toString());
        }
        if (pinnedShortcuts != null && pinnedShortcuts.size() != 0) {
            for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
                if (shortcutInfoCompat.getShortcutIdSinceV26().equals(shortcutInfo.getId())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean isDynamicExist(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Object[] objArr = {context, shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9511687d394517061c69f3a6a16904d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9511687d394517061c69f3a6a16904d6")).booleanValue();
        }
        if (!TextUtils.isEmpty(shortcutInfoCompat.getShortcutIdSinceV26()) && Build.VERSION.SDK_INT >= 25) {
            try {
                List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).getDynamicShortcuts();
                if (dynamicShortcuts == null) {
                    return false;
                }
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfoCompat.getShortcutIdSinceV26().equals(shortcutInfo.getId())) {
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.e(TAG, "isDynamicExist Exception:" + e.toString());
            }
        }
        return false;
    }

    private static boolean isShortCutExistBeforeV26(Context context, String str, Intent intent) {
        boolean z = false;
        Object[] objArr = {context, str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d6dc5bad703e732e40afcc99938c46b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d6dc5bad703e732e40afcc99938c46b")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || intent == null) {
            return false;
        }
        if (RomUtils.isNubia() && f.a(intent, "profile", 0L) == 0) {
            intent.putExtra("profile", 0L);
        }
        try {
            Cursor query = context.getContentResolver().query(LauncherUtils.getFavoritesUri(context), new String[]{"title", "intent"}, getSelection(), getSelectionArgs(str, intent), null);
            if (query != null && query.getCount() > 0) {
                z = true;
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "isShortCutExistBeforeV26 Exception:" + e.toString());
        }
        return z;
    }

    private static boolean isWidgetExist(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        AppWidgetManager appWidgetManager;
        Object[] objArr = {context, shortcutInfoCompat};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24f213d9c1446aabba620f4ab18dfcdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24f213d9c1446aabba620f4ab18dfcdd")).booleanValue();
        }
        ShortcutWidgetInfo shortcutWidgetInfo = shortcutInfoCompat.getShortcutWidgetInfo();
        if (ShortcutWidgetInfo.isValidForQuerying(shortcutWidgetInfo) && Build.VERSION.SDK_INT >= 26 && (appWidgetManager = (AppWidgetManager) context.getApplicationContext().getSystemService(AppWidgetManager.class)) != null) {
            try {
                if (appWidgetManager.getAppWidgetIds(new ComponentName(context, shortcutWidgetInfo.getProvider())).length > 0) {
                    return true;
                }
            } catch (Exception e) {
                Log.e(TAG, "isWidgetExist Exception:", e);
            }
        }
        return false;
    }

    public static Uri getFavoritesUri(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ef422680dd3135482f856df2c0ee564", RobustBitConfig.DEFAULT_VALUE) ? (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ef422680dd3135482f856df2c0ee564") : LauncherUtils.getFavoritesUri(context);
    }

    private static String[] getSelectionArgs(String str, Intent intent) {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "112b3fafb9fbcdc1174243fc39e94615", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "112b3fafb9fbcdc1174243fc39e94615") : new String[]{str, intent.toUri(0)};
    }
}
