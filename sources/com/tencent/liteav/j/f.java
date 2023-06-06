package com.tencent.liteav.j;

import android.content.Context;
import com.unionpay.tsmservice.data.Constant;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class f {
    public static String a(Context context, int i) {
        File externalFilesDir;
        String str = null;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return null;
        }
        File file = new File(externalFilesDir + File.separator + "txrtmp");
        if (!file.exists()) {
            file.mkdirs();
        }
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String format = simpleDateFormat.format(new Date(Long.valueOf(valueOf + Constant.DEFAULT_CVN2).longValue()));
        if (i == 0) {
            str = String.format("TXVideo_%s_reverse.mp4", format);
        } else if (i == 1) {
            str = String.format("TXVideo_%s_process.mp4", format);
        }
        return file + "/" + str;
    }
}
