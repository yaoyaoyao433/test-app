package com.huawei.hms.framework.common;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class PowerMode {
        static int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static int POWER_SAVER_MODE = 4;
        static String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                PowerManager powerManager = (PowerManager) systemService;
                if (Build.VERSION.SDK_INT >= 20) {
                    try {
                        return powerManager.isInteractive();
                    } catch (RuntimeException e) {
                        Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
                    }
                }
            }
        }
        return false;
    }

    public static int readPowerSaverMode(Context context) {
        int i;
        if (context != null) {
            int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), PowerMode.SMART_MODE_STATUS, PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE);
            if (systemInt == PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE) {
                Object systemService = ContextCompat.getSystemService(context, "power");
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                if (powerManager != null) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            if (powerManager.isPowerSaveMode()) {
                                i = PowerMode.POWER_SAVER_MODE;
                            } else {
                                i = PowerMode.POWER_MODE_DEFAULT_RETURN_VALUE;
                            }
                            return i;
                        } catch (RuntimeException e) {
                            Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                            return systemInt;
                        }
                    }
                    Logger.i(TAG, "readPowerSaverMode is control by version!");
                    return systemInt;
                }
                return systemInt;
            }
            return systemInt;
        }
        Logger.i(TAG, "readPowerSaverMode Context is null!");
        return 0;
    }

    public static boolean isWhilteList(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            String packageName = context.getPackageName();
            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                try {
                    return powerManager.isIgnoringBatteryOptimizations(packageName);
                } catch (RuntimeException e) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                }
            }
        }
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
            if (powerManager != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        return powerManager.isDeviceIdleMode();
                    } catch (RuntimeException e) {
                        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                    }
                } else {
                    Logger.i(TAG, "isDozeIdleMode is version control state!");
                    return false;
                }
            } else {
                Logger.i(TAG, "isDozeIdleMode powerManager is null!");
                return false;
            }
        } else {
            Logger.i(TAG, "isDozeIdleMode Context is null!");
        }
        return false;
    }
}
