package com.tencent.liteav.basic.license;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LicenceCheck {
    private static LicenceCheck d;
    private Context a;
    private String b = "YTFaceSDK.licence";
    private String c = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4teqkW/TUruU89ElNVd\nKrpSL+HCITruyb6BS9mW6M4mqmxDhazDmQgMKNfsA0d2kxFucCsXTyesFNajaisk\nrAzVJpNGO75bQFap4jYzJYskIuas6fgIS7zSmGXgRcp6i0ZBH3pkVCXcgfLfsVCO\n+sN01jFhFgOC0LY2f1pJ+3jqktAlMIxy8Q9t7XwwL5/n8/Sledp7TwuRdnl2OPl3\nycCTRkXtOIoRNB9vgd9XooTKiEdCXC7W9ryvtwCiAB82vEfHWXXgzhsPC13URuFy\n1JqbWJtTCCcfsCVxuBplhVJAQ7JsF5SMntdJDkp7rJLhprgsaim2CRjcVseNmw97\nbwIDAQAB";
    private a e = new a("TXUgcSDK.licence");
    private a f = new a("TXLiveSDK.licence");

    private native byte[] nativeIvParameterSpec(byte[] bArr);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a {
        String a;
        String b;
        String c = "";
        String d = "";
        String e = "";
        boolean f = false;
        boolean g = false;
        int h = -1;
        String i = "";

        public a(String str) {
            this.a = str;
            this.b = str + ".tmp";
        }
    }

    public static LicenceCheck a() {
        if (d == null) {
            d = new LicenceCheck();
        }
        return d;
    }

    private LicenceCheck() {
    }

    public void a(Context context, String str, String str2) {
        a(this.e, context, str, str2);
        a(context);
    }

    private void a(Context context) {
        try {
            if (Class.forName("com.tencent.qcloud.ugckit.UGCKit") != null) {
                TXCDRApi.txReportDAU(context, com.tencent.liteav.basic.datareport.a.bs);
            }
        } catch (Exception unused) {
        }
    }

    public void b(Context context, String str, String str2) {
        a(this.f, context, str, str2);
    }

    private void a(a aVar, Context context, String str, String str2) {
        if (context != null) {
            this.a = context.getApplicationContext();
            TXCCommonUtil.setAppContext(context);
        }
        aVar.d = str2;
        aVar.e = str;
        if (this.a == null || !d()) {
            return;
        }
        File externalFilesDir = this.a.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            aVar.c = externalFilesDir.getAbsolutePath();
        }
        if (!b(aVar.c + File.separator + aVar.a)) {
            TXCLog.i("LicenceCheck", "setLicense, sdcard file not exist, to download");
            b(aVar, "");
        }
        a(aVar);
    }

    public void a(final a aVar) {
        if (TextUtils.isEmpty(aVar.e)) {
            TXCLog.e("LicenceCheck", "downloadLicense, mUrl is empty, ignore!");
        } else if (aVar.f) {
            TXCLog.i("LicenceCheck", "downloadLicense, in downloading, ignore");
        } else {
            b bVar = new b() { // from class: com.tencent.liteav.basic.license.LicenceCheck.1
                @Override // com.tencent.liteav.basic.license.b
                public void a(File file, String str) {
                    if (file != null) {
                        LicenceCheck.this.b(aVar, str);
                        TXCLog.i("LicenceCheck", "downloadLicense, onSaveSuccess");
                        String h = LicenceCheck.this.h(aVar);
                        if (!TextUtils.isEmpty(h)) {
                            if (LicenceCheck.this.d(aVar, h) == 0) {
                                LicenceCheck.this.f(aVar);
                                return;
                            }
                            return;
                        }
                        TXCLog.e("LicenceCheck", "downloadLicense, readDownloadTempLicence is empty!");
                        aVar.f = false;
                        return;
                    }
                    TXCLog.i("LicenceCheck", "downloadLicense, license not modified");
                }

                @Override // com.tencent.liteav.basic.license.b
                public void a(File file, Exception exc) {
                    TXCLog.i("LicenceCheck", "downloadLicense, onSaveFailed");
                }

                @Override // com.tencent.liteav.basic.license.b
                public void a(int i) {
                    TXCLog.i("LicenceCheck", "downloadLicense, onProgressUpdate");
                }

                @Override // com.tencent.liteav.basic.license.b
                public void a() {
                    TXCLog.i("LicenceCheck", "downloadLicense, onProcessEnd");
                    aVar.f = false;
                }
            };
            if (this.a == null) {
                TXCLog.e("LicenceCheck", "context is NULL !!! Please set context in method:setLicense(Context context, String url, String key)");
                return;
            }
            File externalFilesDir = this.a.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                TXCLog.e("LicenceCheck", "Please check permission WRITE_EXTERNAL_STORAGE permission has been set !!!");
                return;
            }
            String b = b(aVar);
            aVar.c = externalFilesDir.getAbsolutePath();
            new Thread(new c(this.a, aVar.e, aVar.c, aVar.b, bVar, false, b)).start();
            aVar.f = true;
        }
    }

    public int a(f fVar, Context context) {
        return a(this.e, fVar, context);
    }

    public int b(f fVar, Context context) {
        return a(this.f, fVar, context);
    }

    private String b(a aVar) {
        if (this.a == null) {
            return null;
        }
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("LicenceCheck.lastModified", 0);
        return sharedPreferences.getString(aVar.a + ".lastModified", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar, String str) {
        if (this.a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.getSharedPreferences("LicenceCheck.lastModified", 0).edit();
        edit.putString(aVar.a + ".lastModified", str);
        edit.commit();
    }

    private int a(a aVar, f fVar, Context context) {
        int a2 = a(aVar, context);
        if (a2 != 0) {
            a(aVar);
        }
        if (fVar != null) {
            fVar.a = aVar.i;
        }
        return a2;
    }

    private int a(a aVar, Context context) {
        if (aVar.g) {
            return 0;
        }
        if (this.a == null) {
            this.a = context;
        }
        if (d(aVar) == 0) {
            aVar.g = true;
            return 0;
        }
        int c = c(aVar);
        if (c == 0) {
            aVar.g = true;
            return 0;
        }
        return c;
    }

    private int c(a aVar) {
        File externalFilesDir;
        String str;
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return -10;
        }
        if (this.a.getExternalFilesDir(null) == null) {
            TXCLog.e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
            return -10;
        }
        String str2 = externalFilesDir.getAbsolutePath() + File.separator + aVar.a;
        if (b(str2)) {
            try {
                str = com.tencent.liteav.basic.util.d.b(str2);
            } catch (Exception e) {
                TXCLog.e("LicenceCheck", "read licence file error: ", e);
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                TXCLog.e("LicenceCheck", "checkSdcardLicence, licenceSdcardStr is empty");
                return -8;
            }
            return a(aVar, str);
        }
        return -7;
    }

    private int d(a aVar) {
        if (e(aVar)) {
            String b = com.tencent.liteav.basic.util.d.b(this.a, aVar.a);
            if (TextUtils.isEmpty(b)) {
                TXCLog.e("LicenceCheck", "checkAssetLicence, licenceSdcardStr is empty");
                return -8;
            }
            return a(aVar, b);
        }
        return -6;
    }

    public int a(a aVar, String str) {
        try {
            new JSONObject(str);
            return d(aVar, str);
        } catch (JSONException unused) {
            if (aVar == this.f) {
                return -1;
            }
            return e(aVar, str);
        }
    }

    private boolean d() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            TXCLog.e("LicenceCheck", "checkSdcardLicence, sdcard not mounted yet!");
            return false;
        } else if (this.a.getExternalFilesDir(null) == null) {
            TXCLog.e("LicenceCheck", "checkSdcardLicence, mContext.getExternalFilesDir is null!");
            return false;
        } else {
            return true;
        }
    }

    private boolean e(a aVar) {
        return com.tencent.liteav.basic.util.d.a(this.a, aVar.a);
    }

    private boolean b(String str) {
        return com.tencent.liteav.basic.util.d.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(a aVar) {
        File externalFilesDir = this.a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            TXCLog.i("LicenceCheck", "saveTempLocal sdcardDir is null");
            return;
        }
        File file = new File(externalFilesDir.getAbsolutePath() + File.separator + aVar.a);
        if (file.exists()) {
            boolean delete = file.delete();
            TXCLog.i("LicenceCheck", "delete dst file:" + delete);
        }
        File file2 = new File(aVar.c + File.separator + aVar.b);
        if (file2.exists()) {
            boolean renameTo = file2.renameTo(file);
            TXCLog.i("LicenceCheck", "rename file:" + renameTo);
        }
        aVar.g = true;
    }

    private static long c(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(str).getTime();
        } catch (Exception e) {
            TXCLog.e("LicenceCheck", "time str to millsecond failed.", e);
            return -1L;
        }
    }

    public PublicKey a(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    private String c(a aVar, String str) {
        if (TextUtils.isEmpty(aVar.d)) {
            TXCLog.e("LicenceCheck", "decodeLicence, mKey is empty!!!");
            return "";
        }
        byte[] bytes = aVar.d.getBytes();
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nativeIvParameterSpec(bytes));
        byte[] decode = Base64.decode(str, 0);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            String str2 = new String(cipher.doFinal(decode), "UTF-8");
            TXCLog.i("LicenceCheck", "decodeLicence : " + str2);
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(a aVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("appId");
            String string = jSONObject.getString("encryptedLicense");
            String string2 = jSONObject.getString("signature");
            TXCLog.i("LicenceCheck", "appid:" + optInt);
            TXCLog.i("LicenceCheck", "encryptedLicense:" + string);
            TXCLog.i("LicenceCheck", "signature:" + string2);
            return a(aVar, string, string2);
        } catch (JSONException e) {
            e.printStackTrace();
            a(-1);
            return -1;
        }
    }

    private int a(a aVar, String str, String str2) {
        boolean z;
        try {
            z = a(Base64.decode(str, 0), Base64.decode(str2, 0), a(this.c));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyLicence, exception is : " + e);
            z = false;
        }
        if (!z) {
            a(-2);
            TXCLog.e("LicenceCheck", "verifyLicence, signature not pass!");
            return -2;
        }
        String c = c(aVar, str);
        if (TextUtils.isEmpty(c)) {
            a(-3);
            TXCLog.e("LicenceCheck", "verifyLicence, decodeValue is empty!");
            return -3;
        }
        aVar.i = c;
        try {
            JSONObject jSONObject = new JSONObject(c);
            String string = jSONObject.getString("pituLicense");
            JSONArray optJSONArray = jSONObject.optJSONArray("appData");
            if (optJSONArray == null) {
                TXCLog.e("LicenceCheck", "verifyLicence, appDataArray is null!");
                a(-1);
                return -1;
            }
            int i = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                if (i >= optJSONArray.length()) {
                    break;
                }
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String optString = jSONObject2.optString("packageName");
                TXCLog.i("LicenceCheck", "verifyLicence, packageName:" + optString);
                if (!optString.equals(this.a.getPackageName())) {
                    TXCLog.e("LicenceCheck", "verifyLicence, packageName not match!");
                } else if (d(jSONObject2.optString("endDate"))) {
                    z3 = true;
                } else {
                    z2 = a(aVar, jSONObject2, string);
                    if (z2) {
                        z2 = true;
                        z3 = true;
                        z4 = true;
                        break;
                    }
                    z3 = true;
                    z4 = true;
                }
                i++;
            }
            if (!z3) {
                a(-4);
                return -4;
            } else if (!z4) {
                a(-5);
                return -5;
            } else if (!z2) {
                a(-11);
                return -11;
            } else {
                if (!TextUtils.isEmpty(string)) {
                    try {
                        byte[] decode = Base64.decode(string, 0);
                        File externalFilesDir = this.a.getExternalFilesDir(null);
                        if (externalFilesDir == null) {
                            return -10;
                        }
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        File file = new File(absolutePath + File.separator + this.b);
                        com.tencent.liteav.basic.util.d.a(file.getAbsolutePath(), decode);
                        TXCCommonUtil.setPituLicencePath(file.getAbsolutePath());
                    } catch (Exception e2) {
                        TXCLog.e("LicenceCheck", "decode pitu license error:" + e2);
                    }
                }
                TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aJ);
                return 0;
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyLicence, json format error ! exception = " + e3);
            a(-1);
            return -1;
        }
    }

    private boolean a(a aVar, JSONObject jSONObject, String str) {
        int optInt = jSONObject.optInt("feature");
        boolean z = false;
        if (aVar == this.f) {
            int i = (optInt >> 4) & 15;
            if (i > 0) {
                aVar.h = i;
                z = true;
            }
            TXCLog.i("LicenceCheck", "live parseVersionType, mLicenceVersionType = " + aVar.h);
        } else if (aVar == this.e) {
            int i2 = optInt & 15;
            if (i2 > 1) {
                aVar.h = i2;
            } else {
                if (i2 == 1 || optInt == 0) {
                    if (!TextUtils.isEmpty(str)) {
                        aVar.h = 5;
                    } else {
                        aVar.h = 3;
                    }
                }
                TXCLog.i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + aVar.h);
            }
            z = true;
            TXCLog.i("LicenceCheck", "ugc parseVersionType, mLicenceVersionType = " + aVar.h);
        }
        return z;
    }

    public int b() {
        return g(this.e);
    }

    public int c() {
        return g(this.f);
    }

    private int g(a aVar) {
        return aVar.h;
    }

    private void a(int i) {
        TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aK, i, "");
    }

    private boolean d(String str) {
        long c = c(str);
        if (c < 0) {
            TXCLog.e("LicenceCheck", "checkEndDate, end date millis < 0!");
            return true;
        } else if (c < System.currentTimeMillis()) {
            TXCLog.e("LicenceCheck", "checkEndDate, end date expire!");
            return true;
        } else {
            return false;
        }
    }

    private int e(a aVar, String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            TXCLog.e("LicenceCheck", "verifyOldLicence, decryptStr is empty");
            return -3;
        }
        aVar.i = e;
        try {
            JSONObject jSONObject = new JSONObject(e);
            if (!jSONObject.getString("packagename").equals(b(this.a))) {
                TXCLog.e("LicenceCheck", "packagename not match!");
                a(-4);
                return -4;
            } else if (d(jSONObject.getString("enddate"))) {
                return -5;
            } else {
                aVar.h = 5;
                TXCDRApi.txReportDAU(this.a, com.tencent.liteav.basic.datareport.a.aJ);
                return 0;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            TXCLog.e("LicenceCheck", "verifyOldLicence, json format error !");
            a(-1);
            return -1;
        }
    }

    private static String b(Context context) {
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    private String e(String str) {
        try {
            return new String(h.b(Base64.decode(str, 0), Base64.decode("MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKfMXaF6wx9lev2U\nIzkk6ydI2sdaSQAD2ZvDBLq+5Fm6nGwSSWawl03D4vHcWIUa3wnz6f19/y8wzrj4\nnTfcEnT94SPdB6GhGsqPwbwRp9MHAqd/2gWZxSb005il2yiOZafk6X4NGKCn2tGd\nyNaCF+m9rLykuLdZHB0Z53ivgseNAgMBAAECgYAvXI2pAH+Goxwd6uwuOu9svTGT\nRzaHnI6VWmxBUZQeh3+TOW4iYAG03291GN6bY0RFCOWouSGH7lzK9NFbbPCAQ/hx\ncO48PqioHoq7K8sqzd3XaYBv39HrRnM8JvZsqv0PLJwX/LGm2y/MRaKAC6bcHtse\npgh+NNmUxXNRcTMRAQJBANezmenBcR8HTcY5YaEk3SQRzOo+QhIXuuD4T/FESpVJ\nmVQGxJjLsEBua1j38WG2QuepE5JiVbkQ0jQSvhUiZK0CQQDHJa+vWu6l72lQAvIx\nwmRISorvLb/tnu5bH0Ele42oX+w4p/tm03awdVjhVANnpDjYS2H6EzrF/pfis7k9\nV2phAkB4E4gz47bYYhV+qsTZkw70HGCpab0YG1OyFylRkwW983nCl/3rXUChrZZe\nsbATCAZYtfuqOsmju2R5DpH4a+wFAkBmHlcWbmSNxlSUaM5U4b+WqlLQDv+qE6Na\nKo63b8HWI0n4S3tI4QqttZ7b/L66OKXFk/Ir0AyFVuX/o/VLFTZBAkAdSTEkGwE5\nGQmhxu95sKxmdlUY6Q0Gwwpi06C1BPBrj2VkGXpBP0twhPVAq/3xVjjb+2KXVTUW\nIpRLc06M4vhv", 0)));
        } catch (Exception e) {
            e.printStackTrace();
            TXCLog.e("LicenceCheck", "decryptLicenceStr, exception is : " + e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String h(a aVar) {
        return com.tencent.liteav.basic.util.d.b(new File(aVar.c + File.separator + aVar.b).getAbsolutePath());
    }

    public static boolean a(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature signature = Signature.getInstance("SHA256WithRSA");
        signature.initVerify(publicKey);
        signature.update(bArr);
        return signature.verify(bArr2);
    }
}
