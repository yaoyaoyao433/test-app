package com.hhmedic.android.sdk.module.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import com.hhmedic.android.sdk.module.permission.romUtils.RomUtils;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PermissionUtils {
    public static final int READ_SDCARD_REQUEST = 10001;

    public static void askForPermissions(Activity activity) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            if (ActivityCompat.checkSelfPermission(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1000);
    }

    public static void askReadForPermissions(Activity activity) {
        ArrayList arrayList = new ArrayList();
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE"};
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (ActivityCompat.checkSelfPermission(activity, str) != 0) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ActivityCompat.requestPermissions(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 10001);
    }

    public static boolean havePermission(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return haveCamera(context) && haveAudio(context);
        }
        return true;
    }

    public static boolean haveCamera(Context context) {
        return ActivityCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }

    private static boolean haveAudio(Context context) {
        return ActivityCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
    }

    public static boolean haveReadSdcard(Context context) {
        return ActivityCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public static void goPermissionSetting(Context context) {
        if (RomUtils.checkIsMeizuRom()) {
            RomUtils.applyMeizuPermission(context);
        } else if (RomUtils.checkIsHuaweiRom()) {
            RomUtils.toAppPermissionSetting(context);
        } else if (RomUtils.checkIsMiuiRom()) {
            RomUtils.toPermisstionSetting(context);
        } else if (RomUtils.checkIsOppoRom()) {
            RomUtils.applyOppoPermission(context);
        } else if (RomUtils.checkIs360Rom()) {
            RomUtils.applyQikuPermission(context);
        } else if (RomUtils.checkIsVivoRom()) {
            RomUtils.applyVivoPermission(context);
        } else {
            RomUtils.goAppDetailSettingIntent(context);
        }
    }
}
