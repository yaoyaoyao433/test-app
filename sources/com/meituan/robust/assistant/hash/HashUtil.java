package com.meituan.robust.assistant.hash;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HashUtil {
    public static HashValue createHash(String str, String str2) {
        MessageDigest createMessageDigest = createMessageDigest(str2);
        createMessageDigest.update(str.getBytes());
        return new HashValue(createMessageDigest.digest());
    }

    public static HashValue createHash(File file, String str) {
        try {
            return createHash(new FileInputStream(file), str);
        } catch (IOException unused) {
            System.err.println(String.format("Failed to create %s hash for file %s.", str, file.getAbsolutePath()));
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static HashValue createHash(InputStream inputStream, String str) {
        try {
            MessageDigest createMessageDigest = createMessageDigest(str);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read >= 0) {
                    createMessageDigest.update(bArr, 0, read);
                } else {
                    inputStream.close();
                    return new HashValue(createMessageDigest.digest());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static MessageDigest createMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String createCompactMD5(String str) {
        return createHash(str, "MD5").asCompactString();
    }

    public static String compactStringFor(byte[] bArr) {
        return new HashValue(bArr).asCompactString();
    }

    public static HashValue sha1(byte[] bArr) {
        return createHash(new ByteArrayInputStream(bArr), "SHA1");
    }

    public static HashValue sha1(InputStream inputStream) {
        return createHash(inputStream, "SHA1");
    }

    public static HashValue sha1(File file) {
        return createHash(file, "SHA1");
    }

    public static HashValue sha256(byte[] bArr) {
        return createHash(new ByteArrayInputStream(bArr), "SHA-256");
    }

    public static HashValue sha256(InputStream inputStream) {
        return createHash(inputStream, "SHA-256");
    }

    public static HashValue sha256(File file) {
        return createHash(file, "SHA-256");
    }

    public static int compareHashCodes(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = length - bArr2.length;
        if (length2 == 0) {
            for (int i = 0; i < length; i++) {
                length2 = bArr[i] - bArr2[i];
                if (length2 != 0) {
                    break;
                }
            }
        }
        return length2;
    }
}
