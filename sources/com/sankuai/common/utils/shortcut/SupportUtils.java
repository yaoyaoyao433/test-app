package com.sankuai.common.utils.shortcut;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.pm.ShortcutManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SupportUtils {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean sHighVersionSwitch = false;

    public static boolean isDynamicType(int i) {
        return i == 1;
    }

    public static boolean isPinnedType(int i) {
        return i == 2;
    }

    public static boolean isWidgetType(int i) {
        return i == 3;
    }

    public static boolean isSupported(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cf8d2e2d050ee2f1f4323eeaf0a2226c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cf8d2e2d050ee2f1f4323eeaf0a2226c")).booleanValue();
        }
        if (!sHighVersionSwitch || Build.VERSION.SDK_INT >= 26) {
            if (isDynamicType(i)) {
                return isDynamicSupported(i2);
            }
            if (isPinnedType(i)) {
                if (Build.VERSION.SDK_INT > 25) {
                    return isPinnedSupportedSinceV26(context, i2);
                }
                return isPinnedSupportedBeforeV26(context, i2);
            } else if (isWidgetType(i)) {
                return isWidgetSupported(context, i2);
            } else {
                return false;
            }
        }
        return false;
    }

    private static boolean isPinnedSupportedBeforeV26(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a68e1d59c1d8ff862f6cf45adcc41527", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a68e1d59c1d8ff862f6cf45adcc41527")).booleanValue();
        }
        if (i != 1) {
            if (i != 256) {
                switch (i) {
                    case 16:
                        return LauncherUtils.isSupportedQueryBeforeV26(context);
                    case 17:
                        break;
                    default:
                        return false;
                }
            }
            return LauncherUtils.isSupportedDeleteBeforeV26(context);
        }
        return LauncherUtils.isSupportedAddBeforeV26(context);
    }

    private static boolean isDynamicSupported(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "71a85e2dfea0de6bebcf48f4baf06a20", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "71a85e2dfea0de6bebcf48f4baf06a20")).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 25) {
            if (i != 1 && i != 256) {
                switch (i) {
                    case 16:
                    case 17:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isPinnedSupportedSinceV26(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fc2bcf7ff14a319c27a840858929c31", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fc2bcf7ff14a319c27a840858929c31")).booleanValue();
        }
        if (isPinnedSupported(context)) {
            if (i != 1 && i != 257 && i != 272) {
                switch (i) {
                    case 16:
                    case 17:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean isPinnedSupported(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff39a7bf5a73b50a179b474ffe7213d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff39a7bf5a73b50a179b474ffe7213d7")).booleanValue();
        }
        if (context != null && Build.VERSION.SDK_INT > 25) {
            try {
                return ((ShortcutManager) context.getApplicationContext().getSystemService("shortcut")).isRequestPinShortcutSupported();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static boolean isWidgetSupported(Context context, int i) {
        AppWidgetManager appWidgetManager;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e6f3008c5ef3104ac7fcb937bfaf7eb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e6f3008c5ef3104ac7fcb937bfaf7eb")).booleanValue();
        }
        if (context != null && Build.VERSION.SDK_INT >= 26 && !RomUtils.isSamsung() && (appWidgetManager = (AppWidgetManager) context.getApplicationContext().getSystemService(AppWidgetManager.class)) != null) {
            try {
                if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                    if (i != 1) {
                        switch (i) {
                            case 16:
                            case 17:
                                break;
                            default:
                                return false;
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return false;
    }
}
