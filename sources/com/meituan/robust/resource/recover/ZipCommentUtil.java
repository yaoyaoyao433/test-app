package com.meituan.robust.resource.recover;

import java.io.File;
import java.io.FileInputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ZipCommentUtil {
    private ZipCommentUtil() {
    }

    public static String getZipFileComment(String str) {
        File file = new File(str);
        if (file.exists()) {
            try {
                int length = (int) file.length();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[Math.min(length, 8192)];
                fileInputStream.skip(length - bArr.length);
                int read = fileInputStream.read(bArr);
                r1 = read > 0 ? getZipCommentFromBuffer(bArr, read) : null;
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return r1;
        }
        return null;
    }

    private static String getZipCommentFromBuffer(byte[] bArr, int i) {
        int min;
        byte[] bArr2 = {80, 75, 5, 6};
        for (int min2 = (Math.min(bArr.length, i) - 4) - 22; min2 >= 0; min2--) {
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= 4) {
                    z = true;
                    break;
                } else if (bArr[min2 + i2] != bArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return new String(bArr, min2 + 22, Math.min(bArr[min2 + 20] + (bArr[min2 + 21] * 256), (min - min2) - 22));
            }
        }
        return null;
    }
}
