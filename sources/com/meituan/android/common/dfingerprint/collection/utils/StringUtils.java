package com.meituan.android.common.dfingerprint.collection.utils;

import com.meituan.android.common.dfingerprint.DFPConfigs;
import com.meituan.android.common.utils.mtguard.MTGLog.MTGuardLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.security.MessageDigest;
import java.util.Collection;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public class StringUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String bool2String(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af2692ae72894f5dd72ae1ca12f78578", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af2692ae72894f5dd72ae1ca12f78578") : bool.booleanValue() ? "1" : "0";
    }

    public static String bytesToHexString(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c45a1140d52fc66d6ea56dbfaccef11", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c45a1140d52fc66d6ea56dbfaccef11");
        }
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    public static String change(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcf8557629d3a32df3d69cab1c2fd2f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcf8557629d3a32df3d69cab1c2fd2f6") : str.replace("=", "").replace("&", "");
    }

    public static boolean isMatch(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "90a29cbadac338d447f958653b41f4c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "90a29cbadac338d447f958653b41f4c1")).booleanValue();
        }
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            try {
                Pattern compile = Pattern.compile(str2);
                if (compile == null) {
                    return false;
                }
                return compile.matcher(str).matches();
            } catch (Exception e) {
                MTGuardLog.setErrorLogan(e);
            }
        }
        return false;
    }

    public static String join(Collection<String> collection, char c) {
        Object[] objArr = {collection, Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a40cffb9b836a87595601e3d27a75780", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a40cffb9b836a87595601e3d27a75780");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : collection) {
            sb.append(str);
            sb.append(c);
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static String md5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b79afe273d603b099b6b8753c776222b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b79afe273d603b099b6b8753c776222b");
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return StringUtil.NULL;
        }
    }

    public static String md5(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8541810bf5db6e7ed540ed101d807d62", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8541810bf5db6e7ed540ed101d807d62");
        }
        try {
            return bytesToHexString(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Throwable th) {
            MTGuardLog.setErrorLogan(th);
            return StringUtil.NULL;
        }
    }

    public static String parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7000f10b20a197f447b43e83734b3e6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7000f10b20a197f447b43e83734b3e6f");
        }
        if (str.length() == 14) {
            char[] charArray = str.toCharArray();
            int i = 0;
            int i2 = 0;
            while (i < charArray.length) {
                char c = charArray[i];
                int i3 = i + 1;
                int i4 = charArray[i3] * 2;
                if (i4 >= 10) {
                    i4 -= 9;
                }
                i2 += i4 + c;
                i = i3 + 1;
            }
            int i5 = i2 % 10;
            return str + (i5 != 0 ? 10 - i5 : 0);
        }
        return "";
    }

    public static String returnEmptyIfNull(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "64608c98e32a05c838fe602e2cb61065", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "64608c98e32a05c838fe602e2cb61065") : (str == null || str.isEmpty() || str == "[]" || str == "{}") ? "" : (str == DFPConfigs.API_RET_NULL || str == DFPConfigs.JAVA_EXCEPTION || str == DFPConfigs.NO_PERMISSION) ? "unknown" : str;
    }

    public static String toString(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6de6de2577bd78f461aae5a12ca91076", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6de6de2577bd78f461aae5a12ca91076") : returnEmptyIfNull(Float.toString(f));
    }

    public static String toString(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5e29f935ff83c7bda8939054f60a05b8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5e29f935ff83c7bda8939054f60a05b8") : returnEmptyIfNull(Integer.toString(i));
    }

    public static String toString(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83a6b5bbad5cf5cd7e123a0c412d22b0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83a6b5bbad5cf5cd7e123a0c412d22b0") : returnEmptyIfNull(Long.toString(j));
    }
}
