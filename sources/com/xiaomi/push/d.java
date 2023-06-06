package com.xiaomi.push;

import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
/* loaded from: classes6.dex */
public final class d {
    public static boolean a() {
        try {
            return Environment.getExternalStorageState().equals("removed");
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return true;
        }
    }

    public static boolean b() {
        try {
            return !Environment.getExternalStorageState().equals("mounted");
        } catch (Exception e) {
            Log.e("XMPush-", "check SDCard is busy: " + e);
            return true;
        }
    }

    private static long d() {
        File externalStorageDirectory;
        if (!b() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null && !TextUtils.isEmpty(externalStorageDirectory.getPath())) {
            try {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                return statFs.getBlockSize() * (statFs.getAvailableBlocks() - 4);
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public static boolean c() {
        if (!b()) {
            if (!(d() <= 102400) && !a()) {
                return true;
            }
        }
        return false;
    }
}
