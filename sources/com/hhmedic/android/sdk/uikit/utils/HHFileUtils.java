package com.hhmedic.android.sdk.uikit.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHFileUtils {
    public static List<String> copyFiles(Context context, List<Uri> list) {
        if (context == null || list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : list) {
            String copyFile = copyFile(context, uri);
            if (copyFile != null) {
                arrayList.add(copyFile);
            }
        }
        return arrayList;
    }

    public static String copyFile(Context context, Uri uri) {
        if (context == null || uri == null) {
            return null;
        }
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        try {
            File file = new File(externalFilesDir.getAbsoluteFile() + File.separator + "upload");
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file.getAbsolutePath() + File.separator + System.currentTimeMillis() + ".png");
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (-1 != read) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    openInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file2.getAbsolutePath();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteUploadFiles(Context context) {
        File externalFilesDir;
        File[] listFiles;
        if (context == null) {
            return;
        }
        try {
            if (context.getExternalFilesDir(Environment.DIRECTORY_PICTURES).exists()) {
                File file = new File(externalFilesDir.getAbsoluteFile() + File.separator + "upload");
                if (!file.exists() || (listFiles = file.listFiles()) == null) {
                    return;
                }
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean fileIsExist(String str) {
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }
}
