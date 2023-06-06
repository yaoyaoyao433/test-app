package com.meituan.robust.assistant;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.common.MD5;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class VerifyUtils {
    public static final int SHA_LENGTH = 64;

    public static boolean isLocalPatchValid(String str, File file) {
        if (file == null || TextUtils.isEmpty(str) || !file.exists()) {
            return false;
        }
        try {
        } catch (IOException e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("patchMd5", str);
            hashMap.put("localPatchFile", file.getAbsolutePath());
            ThrowableReporter.report(e, hashMap);
        }
        return isRealSameMd5(str, MD5.getHashString(file));
    }

    public static boolean decryptPatch(Context context, String str, String str2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            byte[] bArr = new byte[4096];
            FileInputStream fileInputStream = new FileInputStream(str);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byte[] copyOfRange = Arrays.copyOfRange(byteArray, byteArray.length - 64, byteArray.length);
            byte[] copyOfRange2 = Arrays.copyOfRange(byteArray, 0, byteArray.length - 64);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            fileOutputStream.write(copyOfRange2);
            fileOutputStream.flush();
            fileOutputStream.close();
            return isRealSameMd5(MD5.getHashString(new File(str2)), getDecryptMD5(copyOfRange, context));
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put("patchLocalPath", str);
            hashMap.put("decryptPatchPath", str2);
            ThrowableReporter.report(e, hashMap);
            return false;
        }
    }

    private static boolean isRealSameMd5(String str, String str2) {
        if (str == null || "".equals(str) || str2 == null || "".equals(str2)) {
            return false;
        }
        if (str.length() == str2.length()) {
            if (str.equals(str2)) {
                return true;
            }
        } else {
            String str3 = "0" + str2;
            if (("0" + str).equals(str2) || str.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    private static String getDecryptMD5(byte[] bArr, Context context) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, (RSAPublicKey) getPublicKey(context));
        byte[] doFinal = cipher.doFinal(bArr);
        return doFinal.length <= 0 ? "" : new String(doFinal);
    }

    private static PublicKey getPublicKey(Context context) throws Exception {
        DataInputStream dataInputStream = new DataInputStream(context.getAssets().open("publickey"));
        byte[] bArr = new byte[dataInputStream.available()];
        dataInputStream.readFully(bArr);
        dataInputStream.close();
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
    }
}
