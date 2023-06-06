package com.sankuai.common.utils.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.pm.ShortcutManagerCompat;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LauncherUtils {
    private static final String DELETE_KEY = "is_delete_supported";
    private static final String EMUI_UNINSTALL_ACTION = "com.huawei.android.launcher.action.UNINSTALL_SHORTCUT";
    private static final String FLYME_UNINSTALL_ACTION = "com.meizu.flyme.launcher.action.UNINSTALL_SHORTCUT";
    private static final String INSTALL_KEY = "is_add_supported";
    private static final String INSTALL_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static final String LAUNCHER_2_READ_PERMISSION = "launcher2.permission.READ_SETTINGS";
    private static final String LAUNCHER_3_READ_PERMISSION = "launcher3.permission.READ_SETTINGS";
    private static final String LAUNCHER_READ_PERMISSION = "launcher.permission.READ_SETTINGS";
    private static final String MIUI_UNINSTALL_ACTION = "com.miui.home.launcher.action.UNINSTALL_SHORTCUT";
    private static final String NUBIA_UNINSTALL_ACTION = "cn.nubia.launcher.action.UNINSTALL_SHORTCUT";
    private static final String OPPO_UNINSTALL_ACTION = "com.oppo.launcher.action.UNINSTALL_SHORTCUT";
    private static final String QUERY_KEY = "is_query_supported";
    private static final String READ_SETTINGS_PERMISSION = "com.android.launcher.permission.READ_SETTINGS";
    private static final String TAG = "LauncherUtils";
    private static final String UNINSTALL_PERMISSION = "com.android.launcher.permission.UNINSTALL_SHORTCUT";
    public static final String UNINSTALL_SHORTCUT_ACTION = "com.android.launcher.action.UNINSTALL_SHORTCUT";
    private static final String VIVO_UNINSTALL_ACTION = "com.bbk.launcher2.action.UNINSTALL_SHORTCUT";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String mUninstallShortcutAction;
    private static HashMap<String, Boolean> mSupportStates = new HashMap<>();
    public static final String INSTALL_SHORTCUT_ACTION = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static String mInstallShortcutAction = INSTALL_SHORTCUT_ACTION;
    private static ResolveInfo mLauncherResolveInfo = null;
    private static ProviderInfo mLauncherProviderInfo = null;
    private static Uri mFavoritesUri = null;

    public static String getAuthorityFromPermission(Context context, String str) {
        return "";
    }

    private static String getAuthorityFromPermissionDefault(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1abdf6790e0240f5fed4d6d7fdb57d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1abdf6790e0240f5fed4d6d7fdb57d1");
        }
        if (mLauncherProviderInfo == null) {
            mLauncherProviderInfo = getAuthorityFromPermission(context);
        }
        return mLauncherProviderInfo != null ? mLauncherProviderInfo.authority : "";
    }

    private static ProviderInfo getAuthorityFromPermission(Context context) {
        List<ProviderInfo> queryContentProviders;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9cb3a824b26744ac0e52a9da462dd408", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProviderInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9cb3a824b26744ac0e52a9da462dd408");
        }
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            if (mLauncherResolveInfo == null) {
                mLauncherResolveInfo = context.getPackageManager().resolveActivity(intent, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (mLauncherResolveInfo != null && mLauncherResolveInfo.activityInfo != null) {
            new StringBuilder("launcher packageName : ").append(mLauncherResolveInfo.activityInfo.packageName);
            if (!mLauncherResolveInfo.activityInfo.packageName.equals("android") && (queryContentProviders = context.getPackageManager().queryContentProviders(mLauncherResolveInfo.activityInfo.packageName, mLauncherResolveInfo.activityInfo.applicationInfo.uid, 131072)) != null) {
                for (ProviderInfo providerInfo : queryContentProviders) {
                    new StringBuilder("getAuthorityFromPermission provider: ").append(providerInfo.name);
                    new StringBuilder("getAuthorityFromPermission readPermission: ").append(providerInfo.readPermission);
                    if (!TextUtils.isEmpty(providerInfo.readPermission) && (providerInfo.readPermission.endsWith(LAUNCHER_READ_PERMISSION) || providerInfo.readPermission.endsWith(LAUNCHER_2_READ_PERMISSION) || providerInfo.readPermission.endsWith(LAUNCHER_3_READ_PERMISSION))) {
                        new StringBuilder("getAuthorityFromPermission authority: ").append(providerInfo.authority);
                        return providerInfo;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static Uri getFavoritesUri(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c123413f8e9fa09563be8890fce7a87c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c123413f8e9fa09563be8890fce7a87c");
        }
        if (mFavoritesUri != null) {
            return mFavoritesUri;
        }
        StringBuilder sb = new StringBuilder();
        String authorityFromPermissionDefault = getAuthorityFromPermissionDefault(context);
        if (authorityFromPermissionDefault == null || authorityFromPermissionDefault.trim().equals("")) {
            authorityFromPermissionDefault = getAuthorityFromPermission(context, getCurrentLauncherPackageName(context) + ".permission.READ_SETTINGS");
        }
        sb.append("content://");
        if (TextUtils.isEmpty(authorityFromPermissionDefault)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 8) {
                sb.append("com.android.launcher.settings");
            } else if (i < 19) {
                sb.append("com.android.launcher2.settings");
            } else {
                sb.append("com.android.launcher3.settings");
            }
        } else {
            sb.append(authorityFromPermissionDefault);
        }
        sb.append("/favorites?notify=true");
        mFavoritesUri = Uri.parse(sb.toString());
        new StringBuilder("mFavoritesUri: ").append(mFavoritesUri.toString());
        return mFavoritesUri;
    }

    private static String getCurrentLauncherPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1e8010ca9d9394db8c2f042ef485b5df", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1e8010ca9d9394db8c2f042ef485b5df");
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        return (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName.equals("android")) ? "" : resolveActivity.activityInfo.packageName;
    }

    public static String getInstallShortcutAction() {
        return mInstallShortcutAction;
    }

    public static boolean isSupportedAddBeforeV26(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02e1adbe8201d8f4004dc9232ef9303a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02e1adbe8201d8f4004dc9232ef9303a")).booleanValue();
        }
        if (mSupportStates.get(INSTALL_KEY) != null) {
            return mSupportStates.get(INSTALL_KEY).booleanValue();
        }
        boolean isRequestPinShortcutSupported = ShortcutManagerCompat.isRequestPinShortcutSupported(context);
        mSupportStates.put(INSTALL_KEY, Boolean.valueOf(isRequestPinShortcutSupported));
        return isRequestPinShortcutSupported;
    }

    public static String getUninstallShortcutAction(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75c175aef9e652fdd31216e5b66db71b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75c175aef9e652fdd31216e5b66db71b");
        }
        if (TextUtils.isEmpty(mUninstallShortcutAction)) {
            mUninstallShortcutAction = findProperUninstallAction(context);
        }
        return mUninstallShortcutAction;
    }

    private static List<ResolveInfo> getResolveReceivers(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f7711949d53cfbad6f7629bc3d89f033", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f7711949d53cfbad6f7629bc3d89f033");
        }
        try {
            new StringBuilder("launcher handle  action :").append(str);
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent(str), 0);
            if (queryBroadcastReceivers != null) {
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    new StringBuilder("launcher handle  action info's name :").append(resolveInfo.activityInfo.name);
                    new StringBuilder("launcher handle  action info.packageName:").append(resolveInfo.activityInfo.packageName);
                }
            }
            return queryBroadcastReceivers;
        } catch (Exception e) {
            String str2 = TAG;
            Log.e(str2, "getResolveReceivers e:" + e.toString());
            return null;
        }
    }

    private static String findProperUninstallAction(Context context) {
        List<ResolveInfo> resolveReceivers;
        List<ResolveInfo> resolveReceivers2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b2f8d6aef30664c030553f5070cf3d81", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b2f8d6aef30664c030553f5070cf3d81");
        }
        if (RomUtils.isFlyme()) {
            List<ResolveInfo> resolveReceivers3 = getResolveReceivers(context, FLYME_UNINSTALL_ACTION);
            if (resolveReceivers3 != null && resolveReceivers3.size() > 0) {
                str = FLYME_UNINSTALL_ACTION;
            }
        } else if (RomUtils.isVivo()) {
            List<ResolveInfo> resolveReceivers4 = getResolveReceivers(context, VIVO_UNINSTALL_ACTION);
            if (resolveReceivers4 != null && resolveReceivers4.size() > 0) {
                str = VIVO_UNINSTALL_ACTION;
            }
        } else if (RomUtils.isOppo()) {
            List<ResolveInfo> resolveReceivers5 = getResolveReceivers(context, OPPO_UNINSTALL_ACTION);
            if (resolveReceivers5 != null && resolveReceivers5.size() > 0) {
                str = OPPO_UNINSTALL_ACTION;
            }
        } else if (RomUtils.isEmui()) {
            List<ResolveInfo> resolveReceivers6 = getResolveReceivers(context, EMUI_UNINSTALL_ACTION);
            if (resolveReceivers6 != null && resolveReceivers6.size() > 0) {
                str = EMUI_UNINSTALL_ACTION;
            }
        } else if (RomUtils.isMiui()) {
            List<ResolveInfo> resolveReceivers7 = getResolveReceivers(context, MIUI_UNINSTALL_ACTION);
            if (resolveReceivers7 != null && resolveReceivers7.size() > 0) {
                str = MIUI_UNINSTALL_ACTION;
            }
        } else if (RomUtils.isNubia() && (resolveReceivers = getResolveReceivers(context, NUBIA_UNINSTALL_ACTION)) != null && resolveReceivers.size() > 0) {
            str = NUBIA_UNINSTALL_ACTION;
        }
        return (!TextUtils.isEmpty(str) || (resolveReceivers2 = getResolveReceivers(context, UNINSTALL_SHORTCUT_ACTION)) == null || resolveReceivers2.size() <= 0) ? str : UNINSTALL_SHORTCUT_ACTION;
    }

    private static List<String> findProperUninstallPermission(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        List<ResolveInfo> list = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "01b79c4ca81166ad8492d7675da83347", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "01b79c4ca81166ad8492d7675da83347");
        }
        ArrayList arrayList = new ArrayList();
        if (RomUtils.isFlyme()) {
            list = getResolveReceivers(context, FLYME_UNINSTALL_ACTION);
        } else if (RomUtils.isVivo()) {
            list = getResolveReceivers(context, VIVO_UNINSTALL_ACTION);
        } else if (RomUtils.isOppo()) {
            list = getResolveReceivers(context, OPPO_UNINSTALL_ACTION);
        } else if (RomUtils.isEmui()) {
            list = getResolveReceivers(context, EMUI_UNINSTALL_ACTION);
        } else if (RomUtils.isMiui()) {
            list = getResolveReceivers(context, MIUI_UNINSTALL_ACTION);
        } else if (RomUtils.isNubia()) {
            list = getResolveReceivers(context, NUBIA_UNINSTALL_ACTION);
        }
        if (list != null && list.size() > 0) {
            for (ResolveInfo resolveInfo : list) {
                if (resolveInfo.activityInfo != null && !TextUtils.isEmpty(resolveInfo.activityInfo.permission)) {
                    arrayList.add(resolveInfo.activityInfo.permission);
                }
            }
        }
        arrayList.add(UNINSTALL_PERMISSION);
        return arrayList;
    }

    public static String[] getRequiredPermissions(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a12ab026b46628c643feb68a577d4fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a12ab026b46628c643feb68a577d4fe");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(INSTALL_PERMISSION);
        arrayList.addAll(findProperUninstallPermission(context));
        if (mLauncherProviderInfo != null) {
            arrayList.add(mLauncherProviderInfo.readPermission);
        } else {
            arrayList.add(READ_SETTINGS_PERMISSION);
        }
        int size = arrayList.size();
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    public static boolean isSupportedDeleteBeforeV26(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d7e8083850fe3d5653b87fe736847bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d7e8083850fe3d5653b87fe736847bd")).booleanValue();
        }
        if (mSupportStates.get(DELETE_KEY) != null) {
            return mSupportStates.get(DELETE_KEY).booleanValue();
        }
        z = (RomUtils.isNubia() || TextUtils.isEmpty(getUninstallShortcutAction(context))) ? false : false;
        mSupportStates.put(DELETE_KEY, Boolean.valueOf(z));
        return z;
    }

    public static boolean isSupportedQueryBeforeV26(Context context) {
        boolean z = true;
        boolean z2 = false;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb57337a2e5a654a24be2288a9e845d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb57337a2e5a654a24be2288a9e845d3")).booleanValue();
        }
        if (mSupportStates.get(QUERY_KEY) != null) {
            return mSupportStates.get(QUERY_KEY).booleanValue();
        }
        if (!RomUtils.isOppo()) {
            try {
                Cursor query = context.getContentResolver().query(getFavoritesUri(context), null, null, null, null);
                z = (query == null || query.getCount() == 0) ? false : false;
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                z2 = z;
            } catch (Exception unused) {
            }
        }
        mSupportStates.put(QUERY_KEY, Boolean.valueOf(z2));
        return z2;
    }
}
