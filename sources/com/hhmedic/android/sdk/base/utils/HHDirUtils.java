package com.hhmedic.android.sdk.base.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDirUtils {
    private static final String TEMP = "temp";

    public static String getTempPath(Context context, String str) {
        String cacheDir = getCacheDir(context, TEMP);
        return cacheDir + File.separator + str;
    }

    private static String getCacheDir(Context context, String str) {
        File cacheDirectory = getCacheDirectory(context);
        String str2 = cacheDirectory.getAbsolutePath() + File.separator + str;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        return str2;
    }

    public static File getCacheDirectory(Context context) {
        return getCacheDirectory(context, true);
    }

    public static File getCacheDirectory(Context context, boolean z) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (IncompatibleClassChangeError unused) {
            str = "";
        } catch (NullPointerException unused2) {
            str = "";
        }
        File externalCacheDir = (z && "mounted".equals(str) && hasExternalStoragePermission(context)) ? getExternalCacheDir(context) : null;
        if (externalCacheDir == null) {
            externalCacheDir = context.getCacheDir();
        }
        if (externalCacheDir == null) {
            return new File("/data/data/" + context.getPackageName() + "/cache/");
        }
        return externalCacheDir;
    }

    private static File getExternalCacheDir(Context context) {
        File file = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), "cache");
        if (!file.exists()) {
            if (!file.mkdirs()) {
                return null;
            }
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException unused) {
            }
        }
        return file;
    }

    private static boolean hasExternalStoragePermission(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
