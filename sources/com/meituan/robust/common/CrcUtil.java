package com.meituan.robust.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CrcUtil {
    private CrcUtil() {
    }

    public static void main(String[] strArr) {
        try {
            System.err.println(computeFileCrc32(new File("/Users/hedingxu/robust-github/Robust/app/build/outputs/robust/old/resources.arsc")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static long computeFileCrc32(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        CRC32 crc32 = new CRC32();
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                crc32.update(read);
            } else {
                return crc32.getValue();
            }
        }
    }
}
