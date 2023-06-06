package com.unionpay.mobile.android.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class c {
    private static String a = "[{\"type\":\"app\",\"sort\":100,\"package_info\":[{\"schema\":\"com.unionpay.uppay\",\"version\":\".*\",\"sign\":\"23137B5BE6AEF6682B41E6536F08367E0949A1CC\",\"sort\":101}],\"need_install\":true,\"install_msg\":\"�Ƿ����ذ�װ��������֧������\",\"url\":\"https://mobile.unionpay.com/getclient?platform=android&type=securepayplugin\",\"download_app\":\"UPPayPluginEx.apk\",\"download_title\":\"��������֧������\",\"download_desp\":\"��������֧������\",\"md5\":\"D75BB2802E61738A9A03BF014F927D9A\"},{\"type\":\"jar\",\"sort\":200}]";
    private static SimpleDateFormat b = new SimpleDateFormat("yyyyMMddhhmmss");
    private static HashMap<String, String> c = new d();
    private static long[] d = new long[256];

    static {
        for (int i = 0; i < 256; i++) {
            long j = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j = (j >> 1) ^ ((((int) j) & 1) != 0 ? -7661587058870466123L : 0L);
            }
            d[i] = j;
        }
    }

    public static String a() {
        return b.format(new Date(System.currentTimeMillis()));
    }

    public static String a(Context context) {
        int i;
        String str = "";
        String a2 = PreferenceUtils.a(context, "configs");
        String a3 = PreferenceUtils.a(context, JsBridgeResult.ARG_KEY_LOCATION_MODE);
        String a4 = PreferenceUtils.a(context, "or");
        if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                String a5 = j.a(jSONObject, DeviceInfo.SIGN);
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
                if (PreferenceUtils.forConfig(i, a5).equals(b(f(str2 + str3 + a4)))) {
                    str = str2;
                }
            } catch (Exception unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                Object b2 = j.b(jSONArray, i2);
                if (b2 != null) {
                    JSONObject jSONObject2 = (JSONObject) b2;
                    if ("app".equals(j.a(jSONObject2, "type"))) {
                        return new String(Base64.decode(j.a(jSONObject2, "ca"), 2));
                    }
                }
            }
            return "";
        } catch (JSONException unused3) {
            return "";
        }
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
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        return str.matches("[0-9A-Fa-f]+");
    }

    public static String b(Context context) {
        String str = c.get(f.b(context));
        return !TextUtils.isEmpty(str) ? str : "1000";
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

    public static String c(String str) {
        try {
            return new BigDecimal(str).divide(new BigDecimal("100")).toString();
        } catch (Exception unused) {
            return "1";
        }
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() / 3; i++) {
            sb.append("cmd");
        }
        for (int i2 = 0; i2 < str.length() % 3; i2++) {
            sb.append("cmd".charAt(i2));
        }
        byte[] bytes = str.getBytes();
        byte[] bytes2 = sb.toString().getBytes();
        byte[] bArr = new byte[str.length()];
        for (int i3 = 0; i3 < bytes.length; i3++) {
            bArr[i3] = (byte) (bytes[i3] ^ bytes2[i3]);
        }
        return b.a(bArr);
    }

    public static String e(String str) {
        long j;
        char[] charArray;
        if (str == null || str.length() == 0) {
            j = 0;
        } else {
            byte[] bArr = new byte[str.length() * 2];
            int i = 0;
            for (char c2 : str.toCharArray()) {
                int i2 = i + 1;
                bArr[i] = (byte) (c2 & 255);
                i = i2 + 1;
                bArr[i2] = (byte) (c2 >> '\b');
            }
            j = -1;
            for (byte b2 : bArr) {
                j = (j >> 8) ^ d[(b2 ^ ((int) j)) & 255];
            }
        }
        return Long.toHexString(j);
    }

    private static String f(String str) {
        try {
            byte[] bytes = str.getBytes();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(bytes);
            return b.a(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }
}
