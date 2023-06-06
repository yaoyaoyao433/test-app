package com.hhmedic.android.sdk.uikit.utils;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHBitmapUtils {
    private static String targetPath;

    public static void saveBitmap(String str, Bitmap bitmap, Context context) {
        String str2 = context.getFilesDir().getAbsolutePath() + "/bitmap/";
        targetPath = str2;
        if (HHFileUtils.fileIsExist(str2)) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(targetPath, str));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getContextFilePath(Context context, String str) {
        if (existContextFile(context, str)) {
            return targetPath + str;
        }
        return "";
    }

    public static boolean existContextFile(Context context, String str) {
        return new File(targetPath + str).exists();
    }

    public static void deleteContextFile(Context context, String str) {
        context.deleteFile(str);
    }
}
