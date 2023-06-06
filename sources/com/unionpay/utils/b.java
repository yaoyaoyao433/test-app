package com.unionpay.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class b {
    private static SimpleDateFormat a = new SimpleDateFormat("yyyyMMddhhmmss");
    private static HashMap b = new c();

    public static String a(Context context) {
        int i;
        String str = "";
        String a2 = UPUtils.a(context, "configs");
        String a3 = UPUtils.a(context, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        String a4 = UPUtils.a(context, "or");
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                String a5 = i.a(jSONObject, DeviceInfo.SIGN);
                try {
                    i = Integer.parseInt(a3);
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                String str2 = new String(Base64.decode(jSONObject.getString("configs"), 2));
                String str3 = jSONObject.has("sePayConf") ? new String(Base64.decode(jSONObject.getString("sePayConf"), 2)) : "";
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                String a6 = a(UPUtils.a(str2 + str3 + a4));
                String forConfig = UPUtils.forConfig(i, a5);
                if (!TextUtils.isEmpty(forConfig)) {
                    if (forConfig.equals(a6)) {
                        str = str2;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object a7 = i.a(jSONArray, i2);
                if (a7 != null) {
                    JSONObject jSONObject2 = (JSONObject) a7;
                    if ("app".equals(i.a(jSONObject2, "type"))) {
                        return new String(Base64.decode(i.a(jSONObject2, "ca"), 2));
                    }
                }
            }
            return "";
        } catch (JSONException unused3) {
            return "";
        }
    }

    public static String a(InputStream inputStream, String str) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    return byteArrayOutputStream.toString(str);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static String a(String str) {
        byte[] bytes;
        if (str == null) {
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (byte b2 : str.getBytes()) {
            sb.append(charArray[(b2 & 240) >> 4]);
            sb.append(charArray[b2 & 15]);
        }
        return sb.toString().trim();
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String b(Context context, String str) {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        String str2;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (CertificateException e2) {
            e2.printStackTrace();
            certificateFactory = null;
        }
        try {
            x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
        } catch (CertificateException e3) {
            e3.printStackTrace();
            x509Certificate = null;
        }
        try {
            str2 = a(MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            str2 = null;
            return str2.replaceAll(CommonConstant.Symbol.COLON, "");
        } catch (CertificateEncodingException e5) {
            e5.printStackTrace();
            str2 = null;
            return str2.replaceAll(CommonConstant.Symbol.COLON, "");
        }
        return str2.replaceAll(CommonConstant.Symbol.COLON, "");
    }

    public static String b(String str) {
        File file = new File(str);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                MappedByteBuffer map = fileInputStream.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length());
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(map);
                String bigInteger = new BigInteger(1, messageDigest.digest()).toString(16);
                try {
                    fileInputStream.close();
                    return bigInteger;
                } catch (IOException e) {
                    e.printStackTrace();
                    return bigInteger;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return null;
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    public static String c(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return "";
    }

    public static void c(String str) {
        File file = new File(str);
        if (file.exists()) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    c(file2.getPath());
                }
            }
            file.delete();
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty((CharSequence) b.get(str)) ? (String) b.get(str) : str;
    }

    public static boolean d(Context context, String str) {
        PackageInfo packageInfo = null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return packageInfo != null;
    }

    public static final boolean e(String str) {
        return !Pattern.compile("[^0-9]+").matcher(str).find();
    }
}
