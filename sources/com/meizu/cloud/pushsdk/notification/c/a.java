package com.meizu.cloud.pushsdk.notification.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/* loaded from: classes3.dex */
public final class a {
    public static void a(String str, String str2) {
        String[] list;
        try {
            new File(str2).mkdirs();
            for (String str3 : new File(str).list()) {
                File file = str.endsWith(File.separator) ? new File(str + str3) : new File(str + File.separator + str3);
                if (file.isFile()) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    FileOutputStream fileOutputStream = new FileOutputStream(str2 + "/" + file.getName());
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    fileInputStream.close();
                } else if (file.isDirectory()) {
                    a(str + "/" + str3, str2 + "/" + str3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean a(String str) {
        File[] listFiles;
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            boolean z = true;
            for (File file2 : file.listFiles()) {
                if (!file2.isFile()) {
                    z = a(file2.getAbsolutePath());
                    if (!z) {
                        break;
                    }
                } else {
                    File file3 = new File(file2.getAbsolutePath());
                    z = (file3.isFile() && file3.exists()) ? file3.delete() : false;
                    if (!z) {
                        break;
                    }
                }
            }
            if (z) {
                return file.delete();
            }
            return false;
        }
        return false;
    }
}
