package com.sankuai.common.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.Character;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StringUtils {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##");
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String md5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f5e0ac7f643524d8a98e8cfde0aff42", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f5e0ac7f643524d8a98e8cfde0aff42");
        }
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(str.getBytes());
                str = new BigInteger(1, messageDigest.digest()).toString(16);
                while (str.length() < 32) {
                    str = "0" + str;
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return str;
    }

    public static String replaceHtml(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0ba04ab6032ff1ac3f9bddfd8b538510", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0ba04ab6032ff1ac3f9bddfd8b538510") : TextUtils.isEmpty(str) ? "" : Pattern.compile("<.+?>").matcher(str).replaceAll("");
    }

    public static boolean checkEmail(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e659cbef38ec8b9c81e8acb1d996a20", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e659cbef38ec8b9c81e8acb1d996a20")).booleanValue() : Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$").matcher(str).find();
    }

    public static boolean checkPhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "12fb46bec98c6ffbe19f189673dd6ba4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "12fb46bec98c6ffbe19f189673dd6ba4")).booleanValue() : Pattern.compile("((\\d{4}|\\d{3})?-?(\\d{7,8})(-\\d{1,2})?(\\d{1,2})?)|((\\d{4}|\\d{3})-(\\d{4}|\\d{3})-(\\d{4}|\\d{3}))").matcher(str).find();
    }

    public static boolean checkMobilePhone(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee83ac50fa2d2740d0154b607b933442", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee83ac50fa2d2740d0154b607b933442")).booleanValue();
        }
        if (str.length() != 11) {
            return false;
        }
        return Pattern.compile("(\\d{11})").matcher(str).find();
    }

    public static boolean checkSpecialChar(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0e05d29e1d49a8148d3ad202e8a1c11d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0e05d29e1d49a8148d3ad202e8a1c11d")).booleanValue() : !Pattern.compile("^[一-龥_a-zA-Z0-9]+$").matcher(str).find();
    }

    public static boolean isChinese(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba9fe2fe960e6aa568fea4360c9a7caf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba9fe2fe960e6aa568fea4360c9a7caf")).booleanValue();
        }
        for (char c : str.toCharArray()) {
            if (isChinese(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChinese(char c) {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c6e1ff6155669062e3d9fd012fe183d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c6e1ff6155669062e3d9fd012fe183d3")).booleanValue();
        }
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.GENERAL_PUNCTUATION || of == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || of == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }

    public static String strFormat(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bef7d80886b7c10741fbecaf4ae70537", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bef7d80886b7c10741fbecaf4ae70537");
        }
        if (TextUtils.equals("", str)) {
            return "";
        }
        if (i <= 0) {
            return str;
        }
        if (TextUtils.equals("", str2)) {
            str2 = StringUtil.SPACE;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        int i2 = length % i > 0 ? (length / i) + 1 : length / i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 == i2 - 1) {
                stringBuffer.append(str.substring(i3 * i));
            } else {
                int i4 = i3 * i;
                stringBuffer.append(str.substring(i4, i4 + i));
                stringBuffer.append(str2);
            }
        }
        return stringBuffer.toString();
    }

    public static String getFormattedDoubleValue(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95f59e0ec5fcc2482237f4f81005b7da", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95f59e0ec5fcc2482237f4f81005b7da") : DECIMAL_FORMAT.format(d);
    }

    public static String subZeroAndDot(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "eb3ea8298a0f99487bfb3c21cd41a92b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "eb3ea8298a0f99487bfb3c21cd41a92b") : str.indexOf(CommonConstant.Symbol.DOT) > 0 ? str.replaceAll("0+?$", "").replaceAll("[.]$", "") : str;
    }

    public static String formatDealTitle(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c2e093ee68febca845849a66dac3018", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c2e093ee68febca845849a66dac3018");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replace = str.replace(str2 + "：", "");
        return replace.replace(str2 + CommonConstant.Symbol.COLON, "");
    }

    public static String replacePhoneNumber(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "75eb438ff9797641871ecd7f537c126e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "75eb438ff9797641871ecd7f537c126e") : str.replaceAll("(\\d{3})([^<>]*)(\\d{4})", "$1****$3");
    }

    public static String addZero(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "439195e0873cd1865c82303dabff6b29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "439195e0873cd1865c82303dabff6b29");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        if (length == i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i - length; i2++) {
            sb.append("0");
        }
        sb.append(str);
        return sb.toString();
    }
}
