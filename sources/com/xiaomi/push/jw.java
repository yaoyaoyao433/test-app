package com.xiaomi.push;

import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.HashMap;
/* loaded from: classes6.dex */
public final class jw {
    private static final HashMap<String, String> a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        a = hashMap;
        hashMap.put("FFD8FF", CommonConstant.File.JPG);
        a.put("89504E47", "png");
        a.put("47494638", CommonConstant.File.GIF);
        a.put("474946", CommonConstant.File.GIF);
        a.put("424D", "bmp");
    }

    public static long a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
        }
        return j;
    }
}
