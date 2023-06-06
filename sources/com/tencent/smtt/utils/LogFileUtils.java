package com.tencent.smtt.utils;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes6.dex */
public class LogFileUtils {
    private static OutputStream a;

    public static void closeOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                Log.e("LOG_FILE", "Couldn't close stream!", e);
            }
        }
    }

    public static byte[] createHeaderText(String str, String str2) {
        try {
            byte[] encryptKey = encryptKey(str, str2);
            String format = String.format("%03d", Integer.valueOf(encryptKey.length));
            byte[] bArr = new byte[encryptKey.length + 3];
            bArr[0] = (byte) format.charAt(0);
            bArr[1] = (byte) format.charAt(1);
            bArr[2] = (byte) format.charAt(2);
            System.arraycopy(encryptKey, 0, bArr, 3, encryptKey.length);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String createKey() {
        return String.valueOf(System.currentTimeMillis());
    }

    public static byte[] encrypt(String str, String str2) {
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            return cipher.update(bytes);
        } catch (Throwable th) {
            Log.e("LOG_FILE", "encrypt exception:" + th.getMessage());
            return null;
        }
    }

    public static byte[] encryptKey(String str, String str2) {
        try {
            byte[] bytes = str2.getBytes("UTF-8");
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(str.getBytes("UTF-8"), "RC4"));
            return cipher.update(bytes);
        } catch (Throwable th) {
            Log.e("LOG_FILE", "encrypt exception:" + th.getMessage());
            return null;
        }
    }

    public static synchronized void writeDataToStorage(File file, String str, byte[] bArr, String str2, boolean z) {
        OutputStream outputStream;
        byte[] bArr2;
        synchronized (LogFileUtils.class) {
            byte[] encrypt = encrypt(str, str2);
            if (encrypt != null) {
                str2 = null;
            } else {
                encrypt = null;
            }
            file.getParentFile().mkdirs();
            if (file.isFile() && file.exists() && file.length() > 2097152) {
                file.delete();
                file.createNewFile();
            }
            if (a == null) {
                a = new BufferedOutputStream(new FileOutputStream(file, z));
            }
            if (str2 != null) {
                outputStream = a;
                bArr2 = str2.getBytes();
            } else {
                a.write(bArr);
                a.write(encrypt);
                outputStream = a;
                bArr2 = new byte[]{10, 10};
            }
            outputStream.write(bArr2);
            if (a != null) {
                try {
                    a.flush();
                } catch (Throwable unused) {
                }
            }
        }
    }
}
