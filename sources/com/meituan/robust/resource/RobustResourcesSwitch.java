package com.meituan.robust.resource;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RobustResourcesSwitch {
    private static final String ROBUST_RESOURCES_SWITCH = "robust_resources_switch";
    private static final String ROBUST_SP = "robust_sp";
    private static boolean resourcesSwitch = true;

    public static boolean getResourcesSwitch(Context context) {
        boolean z = context.getSharedPreferences(ROBUST_SP, 0).getBoolean(ROBUST_RESOURCES_SWITCH, resourcesSwitch);
        resourcesSwitch = z;
        return z;
    }

    public static void setResourcesSwitch(Context context, boolean z) {
        context.getSharedPreferences(ROBUST_SP, 0).edit().putBoolean(ROBUST_RESOURCES_SWITCH, z).apply();
        resourcesSwitch = z;
    }
}
