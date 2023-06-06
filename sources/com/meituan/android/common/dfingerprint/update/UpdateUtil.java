package com.meituan.android.common.dfingerprint.update;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.dfingerprint.collection.utils.StringUtils;
import com.meituan.android.common.dfingerprint.interfaces.ICypher;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
/* loaded from: classes2.dex */
public class UpdateUtil {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String updatePath = "";

    public static String cpuABI() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3d1650c7bd7f75cb25200146ab3b4373", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3d1650c7bd7f75cb25200146ab3b4373");
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 21) {
            for (String str : Build.SUPPORTED_ABIS) {
                sb.append(str);
                sb.append(CommonConstant.Symbol.COMMA);
            }
        } else {
            String str2 = Build.CPU_ABI;
            String str3 = Build.CPU_ABI2;
            sb.append(str2);
            sb.append(CommonConstant.Symbol.COMMA);
            sb.append(str3);
            sb.append(CommonConstant.Symbol.COMMA);
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(CommonConstant.Symbol.COMMA)) {
            sb2 = sb2.substring(0, sb2.lastIndexOf(CommonConstant.Symbol.COMMA));
        }
        return StringUtils.change(sb2);
    }

    public static String decrypt(ICypher iCypher, String str) {
        Object[] objArr = {iCypher, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c83380f306b3829254596dbbba965fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c83380f306b3829254596dbbba965fd");
        }
        try {
            byte[] decrypt = iCypher.decrypt(Base64.decode(str, 0));
            if (decrypt != null && decrypt.length > 0) {
                return new String(decrypt);
            }
            return null;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return "";
        }
    }

    public static void deleteUpdateSo(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3e79bef542a33545513904ba599baf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3e79bef542a33545513904ba599baf2");
            return;
        }
        File file = new File(getUpdateSoPath(context, str));
        if (file.exists()) {
            file.delete();
        }
    }

    public static String encrypt(ICypher iCypher, String str) {
        Object[] objArr = {iCypher, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3bc7e6a7c1f1387d54a778acf4732179", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3bc7e6a7c1f1387d54a778acf4732179");
        }
        try {
            byte[] encrypt = iCypher.encrypt(str.getBytes("UTF-8"));
            if (encrypt != null && encrypt.length > 0) {
                return StringUtils.returnEmptyIfNull(Base64.encodeToString(encrypt, 0)).replace("\n", "");
            }
            return null;
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return "";
        }
    }

    public static String getApkVersionCode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4998b0e03dc5430a709e441e4a47ea2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4998b0e03dc5430a709e441e4a47ea2d");
        }
        if (context == null) {
            return "";
        }
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 256).versionCode);
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    public static String getApkVersionName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2183abe55b2813f15639d829476477ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2183abe55b2813f15639d829476477ac");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 256).versionName;
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return "";
        }
    }

    public static String getRealSoPath(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c9e345347d2e120cae4b8218dc82d7c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c9e345347d2e120cae4b8218dc82d7c8");
        }
        String updateSoPath = getUpdateSoPath(context, str);
        return new File(updateSoPath).exists() ? updateSoPath : "";
    }

    public static String getRealSoPath(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e4bdd3cf4fd48f9174e5d4f47a58d05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e4bdd3cf4fd48f9174e5d4f47a58d05");
        }
        String updateSoPath = getUpdateSoPath(str, str2);
        return new File(updateSoPath).exists() ? updateSoPath : "";
    }

    public static String getUpdateSoPath(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d4f6a0ca11151df1a742ab8abe2c079", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d4f6a0ca11151df1a742ab8abe2c079");
        }
        if (updatePath.isEmpty()) {
            return "/data/data/" + context.getPackageName() + File.separator + "files" + File.separator + "._mtg_mtdfp_up" + File.separator + ".mini" + File.separator + str + File.separator + "libmtguard.so";
        }
        return updatePath;
    }

    private static String getUpdateSoPath(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a082cb39edea1bc0d9168943aad16fa1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a082cb39edea1bc0d9168943aad16fa1");
        }
        String str3 = str + File.separator + "files" + File.separator + "._mtg_mtdfp_up" + File.separator + ".mini" + File.separator + str2 + File.separator + "libmtguard.so";
        updatePath = str3;
        return str3;
    }

    public static String uMD5(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "02abe147c8beaf3408ab86c353b7415a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "02abe147c8beaf3408ab86c353b7415a");
        }
        String realSoPath = getRealSoPath(context, str);
        if (TextUtils.isEmpty(realSoPath)) {
            return "";
        }
        try {
            byte[] bArr = new byte[8192];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(new File(realSoPath));
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    fileInputStream.close();
                    return StringUtils.bytesToHexString(messageDigest.digest());
                }
                messageDigest.update(bArr, 0, read);
            }
        } catch (Exception e) {
            MTGuardLog.setErrorLogan(e);
            return "";
        }
    }
}
