package com.hhmedic.android.sdk.module;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.hhmedic.android.sdk.base.utils.HHFileProvider;
import com.hhmedic.android.sdk.base.utils.HHImageUtils;
import com.hhmedic.android.sdk.base.utils.Logger;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SDKRoute {
    public static final int SELECT_PHOTO = 10005;
    public static final int TAKE_PHOTO = 10006;

    private SDKRoute() {
    }

    public static void pickers(Activity activity) {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            activity.startActivityForResult(intent, 10005);
        } catch (Exception e) {
            Logger.e("pickers error:" + e.getMessage());
        }
    }

    public static String onTakePhoto(Activity activity) {
        try {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            String createImagePath = HHImageUtils.createImagePath(activity);
            if (Build.VERSION.SDK_INT >= 24) {
                intent.putExtra("output", HHFileProvider.getUriForFile(activity, activity.getPackageName() + ".hhsdk.fileprovider", new File(createImagePath)));
            } else {
                intent.putExtra("output", Uri.fromFile(new File(createImagePath)));
            }
            activity.startActivityForResult(intent, 10006);
            return createImagePath;
        } catch (Exception e) {
            e.printStackTrace();
            Logger.e("onTakePhoto error:" + e.getMessage());
            return "";
        }
    }
}
