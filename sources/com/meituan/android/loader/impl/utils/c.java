package com.meituan.android.loader.impl.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c {
    public static ChangeQuickRedirect a;
    protected static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static synchronized String a(File file) {
        MessageDigest messageDigest;
        synchronized (c.class) {
            Object[] objArr = {file};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "05aaa2ef8267023df35fa021c52631ac", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "05aaa2ef8267023df35fa021c52631ac");
            }
            try {
                messageDigest = MessageDigest.getInstance("MD5");
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    fileInputStream.close();
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                messageDigest = null;
            }
            byte[] digest = messageDigest.digest();
            Object[] objArr2 = {digest};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "005d071a48fdbfeb7e2bbb11ea7c0597", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "005d071a48fdbfeb7e2bbb11ea7c0597");
            }
            return a(digest, 0, digest.length);
        }
    }

    private static String a(byte[] bArr, int i, int i2) {
        Object[] objArr = {bArr, 0, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd01719ea6e95d0e85feaddf389b7e4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd01719ea6e95d0e85feaddf389b7e4a");
        }
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            a(bArr[i4], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        Object[] objArr = {Byte.valueOf(b2), stringBuffer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "843c9010004e1c36643020ef1a29e622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "843c9010004e1c36643020ef1a29e622");
            return;
        }
        char c = b[(b2 & 240) >> 4];
        char c2 = b[b2 & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    public static String b(File file) {
        File[] listFiles;
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7300913b2abf98fb42be056a9ef785be", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7300913b2abf98fb42be056a9ef785be");
        }
        ArrayList arrayList = new ArrayList();
        if (file.isFile()) {
            arrayList.add(file.getName() + c(file));
        }
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName() + b(file2));
                } else {
                    arrayList.add(file2.getName() + c(file2));
                }
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        return a(sb.toString());
    }

    public static String c(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e02bf55792a4d66ba951e0acc3d2e7b0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e02bf55792a4d66ba951e0acc3d2e7b0");
        }
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return new BigInteger(1, messageDigest.digest()).toString(16);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "470f52cdd9ad94b4dd39bfd9c24ae692", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "470f52cdd9ad94b4dd39bfd9c24ae692");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(40);
            for (byte b2 : digest) {
                int i = b2 & 255;
                if ((i >> 4) == 0) {
                    sb.append("0");
                    sb.append(Integer.toHexString(i));
                } else {
                    sb.append(Integer.toHexString(i));
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}
