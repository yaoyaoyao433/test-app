package com.dianping.shield.debug.whiteboard;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TypeConverUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String convertToStringHtml(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "671346ea236ff98fe7997c9de3fadb41", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "671346ea236ff98fe7997c9de3fadb41");
        }
        return "<font color=#FF0000>" + bundle.toString() + "</font>";
    }

    public static String convertToStringHtml(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00918ad9c19351d24789191b58f9f639", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00918ad9c19351d24789191b58f9f639");
        }
        return "<font color=#FF0000>" + parcelable.toString() + "</font>";
    }

    public static String convertToStringHtml(Serializable serializable) {
        Object[] objArr = {serializable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77804faede92cd0356b9b7c65a4248f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77804faede92cd0356b9b7c65a4248f5");
        }
        return "<font color=#FF0000>" + serializable.toString() + "</font>";
    }

    public static String convertToStringHtml(SparseArray sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4106c6dffa90d9f408a5a87de4fa54c8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4106c6dffa90d9f408a5a87de4fa54c8");
        }
        return "<font color=#FF0000>" + sparseArray.toString() + "</font>";
    }

    public static String convertToStringHtml(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f633c58d7af39e9786214856965983c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f633c58d7af39e9786214856965983c3");
        }
        return "<font color=#FF0000>" + Boolean.toString(z) + "</font>";
    }

    public static String convertToStringHtml(short s) {
        Object[] objArr = {Short.valueOf(s)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0eb9896d770969dfe07b0ade69ddbe23", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0eb9896d770969dfe07b0ade69ddbe23");
        }
        return "<font color=#AA00AA>" + Short.toString(s) + "</font>";
    }

    public static String convertToStringHtml(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "923d8a86243c26802e72b04d0cfbe163", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "923d8a86243c26802e72b04d0cfbe163");
        }
        return "<font color=#AA00AA>" + String.valueOf(i) + "</font>";
    }

    public static String convertToStringHtml(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bb93b8dd627676da0143ebc17e099fb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bb93b8dd627676da0143ebc17e099fb1");
        }
        return "<font color=#AA00AA>" + Long.toString(j) + "</font>";
    }

    public static String convertToStringHtml(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd56f591caac49d8dcb19c75bb27304d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd56f591caac49d8dcb19c75bb27304d");
        }
        return "<font color=#AA00AA>" + Double.toString(d) + "</font>";
    }

    public static String convertToStringHtml(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "caef159cf9da9bed5a3f64adbe25e27c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "caef159cf9da9bed5a3f64adbe25e27c");
        }
        return "<font color=#AA00AA>" + Float.toString(f) + "</font>";
    }

    public static String convertToStringHtml(byte b) {
        Object[] objArr = {Byte.valueOf(b)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f04f9211a939eeba9015f73bfa54f178", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f04f9211a939eeba9015f73bfa54f178");
        }
        return "<font color=#AA00AA>" + Byte.toString(b) + "</font>";
    }

    public static String convertToStringHtml(char c) {
        Object[] objArr = {Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ad2c28814cc21508f32995272b2d79f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ad2c28814cc21508f32995272b2d79f");
        }
        return "<font color=#007777> '" + Character.toString(c) + "' </font>";
    }

    public static String convertToStringHtml(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8519ff8b05ee23b578a220f4f7dc5b16", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8519ff8b05ee23b578a220f4f7dc5b16");
        }
        if (str == null) {
            return "<font color=#FD971F> null </font>";
        }
        return "<font color=#007777> \"" + str + "\" </font>";
    }

    public static String convertToStringHtml(boolean[] zArr) {
        int i = 0;
        Object[] objArr = {zArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "25a3a21594543c42b6fa04a341fc752d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "25a3a21594543c42b6fa04a341fc752d");
        }
        if (zArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = zArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append(zArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(short[] sArr) {
        int i = 0;
        Object[] objArr = {sArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "412678e7e3fe2cf1fd723b02e1250400", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "412678e7e3fe2cf1fd723b02e1250400");
        }
        if (sArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = sArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append((int) sArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(int[] iArr) {
        int i = 0;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a8bdeba06ff4041c6b01c1b02ac64eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a8bdeba06ff4041c6b01c1b02ac64eb");
        }
        if (iArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = iArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append(iArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(long[] jArr) {
        int i = 0;
        Object[] objArr = {jArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b89788172b3a3fb1bfc5c2882f43fb8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b89788172b3a3fb1bfc5c2882f43fb8");
        }
        if (jArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = jArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append(jArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(double[] dArr) {
        int i = 0;
        Object[] objArr = {dArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4def48b5510b12a3d0b3feafb37dad2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4def48b5510b12a3d0b3feafb37dad2c");
        }
        if (dArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = dArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append(dArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(float[] fArr) {
        int i = 0;
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6232ca3aa7dc2bc19af88b85bde4a4fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6232ca3aa7dc2bc19af88b85bde4a4fd");
        }
        if (fArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = fArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append(fArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(byte[] bArr) {
        int i = 0;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a5f55dbcf4718ff1af8c88b60479bc92", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a5f55dbcf4718ff1af8c88b60479bc92");
        }
        if (bArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = bArr.length - 1;
        if (length == -1) {
            return "<font color=#0033FF> [] </font>";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#FF0000>");
            sb.append((int) bArr[i]);
            sb.append("</font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(char[] cArr) {
        int i = 0;
        Object[] objArr = {cArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3985873d9137a7db90aee512f8f58707", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3985873d9137a7db90aee512f8f58707");
        }
        if (cArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = cArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#007777> '");
            sb.append(cArr[i]);
            sb.append("' </font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(Object[] objArr) {
        int i = 0;
        Object[] objArr2 = {objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "239fa628f3516289f76a4f0de5018205", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "239fa628f3516289f76a4f0de5018205");
        }
        if (objArr == null) {
            return "<font color=#FD971F> null </font>";
        }
        int length = objArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<font color=#0033FF> [ </font>");
        while (true) {
            sb.append("<font color=#007777> \"");
            sb.append(String.valueOf(objArr[i]));
            sb.append("\" </font>");
            if (i == length) {
                sb.append("<font color=#0033FF> ] </font>");
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static String convertToStringHtml(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a1ad6e808a5ce886b05b499452c28d84", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a1ad6e808a5ce886b05b499452c28d84");
        }
        if (charSequence == null) {
            return "<font color=#FD971F> null </font>";
        }
        return "<font color=#007777> \"" + charSequence.toString() + "\" </font>";
    }

    public static <T> String convertToStringHtml(ArrayList<T> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0dcd7224e689b6b422b1214554cc40de", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0dcd7224e689b6b422b1214554cc40de") : arrayList == null ? "<font color=#FD971F> null </font>" : convertToStringHtml(arrayList.toArray(new Object[arrayList.size()]));
    }

    private static boolean isNumeric(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ded753678b58829398d15e06da46ff24", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ded753678b58829398d15e06da46ff24")).booleanValue() : Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static boolean stringToBoolean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f47a7e5ac0664d9292d00a09bb2351c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f47a7e5ac0664d9292d00a09bb2351c")).booleanValue() : Boolean.parseBoolean(str);
    }

    public static short stringToShort(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e20458d3fec533020bb734333d0b10e", RobustBitConfig.DEFAULT_VALUE) ? ((Short) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e20458d3fec533020bb734333d0b10e")).shortValue() : Short.parseShort(str);
    }

    public static int stringToInt(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dbbfac8a3d4b832d3c3ed0a715d2054b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dbbfac8a3d4b832d3c3ed0a715d2054b")).intValue() : Integer.parseInt(str);
    }

    public static long stringToLong(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "609d053dd8ee6e1116a4daeb23a02c8a", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "609d053dd8ee6e1116a4daeb23a02c8a")).longValue() : Long.parseLong(str);
    }

    public static double stringToDouble(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94cd488823fc843f73f7b0386348f601", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94cd488823fc843f73f7b0386348f601")).doubleValue() : Double.parseDouble(str);
    }

    public static float stringToFloat(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f377e2dd20338d4270d496067c112868", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f377e2dd20338d4270d496067c112868")).floatValue() : Float.parseFloat(str);
    }

    public static byte stringToByte(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3f72644558151840d652cda6a39b38a", RobustBitConfig.DEFAULT_VALUE) ? ((Byte) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3f72644558151840d652cda6a39b38a")).byteValue() : Byte.parseByte(str);
    }

    public static char stringToChar(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "914725be51630643d98652d4deaac6d5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Character) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "914725be51630643d98652d4deaac6d5")).charValue();
        }
        if (str.indexOf(CommonConstant.Symbol.SINGLE_QUOTES) >= 0 && str.lastIndexOf(CommonConstant.Symbol.SINGLE_QUOTES) >= 0 && str.indexOf(CommonConstant.Symbol.SINGLE_QUOTES) != str.lastIndexOf(CommonConstant.Symbol.SINGLE_QUOTES)) {
            return str.substring(str.indexOf(CommonConstant.Symbol.SINGLE_QUOTES) + 1, str.lastIndexOf(CommonConstant.Symbol.SINGLE_QUOTES)).charAt(0);
        }
        return str.charAt(0);
    }

    public static String stringToString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a5d98ed832a366ca6c462b649f33c9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a5d98ed832a366ca6c462b649f33c9c");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        return (str.indexOf(CommonConstant.Symbol.DOUBLE_QUOTES) < 0 || str.lastIndexOf(CommonConstant.Symbol.DOUBLE_QUOTES) < 0 || str.indexOf(CommonConstant.Symbol.DOUBLE_QUOTES) == str.lastIndexOf(CommonConstant.Symbol.DOUBLE_QUOTES)) ? str : str.substring(str.indexOf(CommonConstant.Symbol.DOUBLE_QUOTES) + 1, str.lastIndexOf(CommonConstant.Symbol.DOUBLE_QUOTES));
    }

    public static boolean[] stringToBooleanArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc6180bfc94197afced22404478b0be7", RobustBitConfig.DEFAULT_VALUE)) {
            return (boolean[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc6180bfc94197afced22404478b0be7");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "").replaceAll("，", CommonConstant.Symbol.COMMA);
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        boolean[] zArr = new boolean[split.length];
        for (int i = 0; i < split.length; i++) {
            zArr[i] = stringToBoolean(split[i]);
        }
        return zArr;
    }

    public static Boolean isFitBooleanArray(String str) {
        String[] split;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a62ba828f18ffdab222226cf77dde3b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a62ba828f18ffdab222226cf77dde3b4");
        }
        if (!isFitArray(str).booleanValue()) {
            return Boolean.FALSE;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "").replaceAll("，", CommonConstant.Symbol.COMMA);
        for (String str2 : replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA)) {
            if (!str2.equals("true") && !str2.equals("false")) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    public static Boolean isFitArray(String str) {
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "985b9c7a84ad2e0b7240b08c35be9e1e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "985b9c7a84ad2e0b7240b08c35be9e1e");
        }
        return Boolean.valueOf((str.indexOf("[") < 0 || str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT) < 0 || str.indexOf("[") == str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)) ? false : false);
    }

    public static short[] stringToShortArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e47328d005ccde8f23acb36d3df3e10", RobustBitConfig.DEFAULT_VALUE)) {
            return (short[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e47328d005ccde8f23acb36d3df3e10");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "").replaceAll("，", CommonConstant.Symbol.COMMA);
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        short[] sArr = new short[split.length];
        for (int i = 0; i < split.length; i++) {
            sArr[i] = stringToShort(split[i]);
        }
        return sArr;
    }

    public static int[] stringToIntArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ed105b4b5adaa2c6a99ab58f24f5f15", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ed105b4b5adaa2c6a99ab58f24f5f15");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        int[] iArr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            iArr[i] = stringToInt(split[i]);
        }
        return iArr;
    }

    public static long[] stringToLongArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f16bdd2bee49bb6db6e367af0eee41a", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f16bdd2bee49bb6db6e367af0eee41a");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        long[] jArr = new long[split.length];
        for (int i = 0; i < split.length; i++) {
            jArr[i] = stringToLong(split[i]);
        }
        return jArr;
    }

    public static double[] stringToDoubleArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e19a2ae7f7d3757c97e8c4dd4e1b1f04", RobustBitConfig.DEFAULT_VALUE)) {
            return (double[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e19a2ae7f7d3757c97e8c4dd4e1b1f04");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        double[] dArr = new double[split.length];
        for (int i = 0; i < split.length; i++) {
            dArr[i] = stringToDouble(split[i]);
        }
        return dArr;
    }

    public static float[] stringToFloatArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "084276cb5d1dea58da3efca4d6441858", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "084276cb5d1dea58da3efca4d6441858");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        float[] fArr = new float[split.length];
        for (int i = 0; i < split.length; i++) {
            fArr[i] = stringToFloat(split[i]);
        }
        return fArr;
    }

    public static byte[] stringToByteArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d013cf2ca53e89b4fe1a529f5a30ecd8", RobustBitConfig.DEFAULT_VALUE)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d013cf2ca53e89b4fe1a529f5a30ecd8");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        byte[] bArr = new byte[split.length];
        for (int i = 0; i < split.length; i++) {
            bArr[i] = stringToByte(split[i]);
        }
        return bArr;
    }

    public static char[] stringToCharArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b26d7eaa34cc963d4d3a78419bd70ed0", RobustBitConfig.DEFAULT_VALUE)) {
            return (char[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b26d7eaa34cc963d4d3a78419bd70ed0");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String[] split = str.substring(str.indexOf("[") + 1, str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split("[^[^,'\\s*]],");
        char[] cArr = new char[split.length];
        for (int i = 0; i < split.length; i++) {
            cArr[i] = stringToChar(split[i]);
        }
        return cArr;
    }

    public static String[] stringToStringArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "380259638e468d76d780ad01b56d6698", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "380259638e468d76d780ad01b56d6698");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String[] split = str.substring(str.indexOf("[") + 1, str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split("[^[^\"\\s*]],");
        for (int i = 0; i < split.length; i++) {
            split[i] = stringToString(split[i]);
        }
        return split;
    }

    public static CharSequence stringToCharSequence(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9179776878e82a4e73c0005c6976ca6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9179776878e82a4e73c0005c6976ca6");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        return stringToString(str);
    }

    public static CharSequence[] stringToCharSequenceArray(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4b3ae697a8bbd9b71f1e0ddb45970f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4b3ae697a8bbd9b71f1e0ddb45970f6");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        return stringToStringArray(str);
    }

    public static ArrayList<CharSequence> stringToCharSequenceArrayList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9dad61b9e89802f664d24d3c9523e9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9dad61b9e89802f664d24d3c9523e9c");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String[] split = str.substring(str.indexOf("[") + 1, str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split("[^[^\"\\s*]],");
        for (int i = 0; i < split.length; i++) {
            split[i] = stringToString(split[i]);
        }
        return new ArrayList<>(Arrays.asList(split));
    }

    public static ArrayList<Integer> stringToIntegerArrayList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "72f1905943bdf5ae46c9f7d44ff414b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "72f1905943bdf5ae46c9f7d44ff414b9");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String replaceAll = str.replaceAll(CommonConstant.Symbol.DOUBLE_QUOTES, "").replaceAll(StringUtil.SPACE, "");
        String[] split = replaceAll.substring(replaceAll.indexOf("[") + 1, replaceAll.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split(CommonConstant.Symbol.COMMA);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (String str2 : split) {
            arrayList.add(Integer.valueOf(stringToInt(str2)));
        }
        return arrayList;
    }

    public static ArrayList<String> stringToStringArrayList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8c1e1787b195fe19cf49a335bc0ccb49", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8c1e1787b195fe19cf49a335bc0ccb49");
        }
        if (isNullString(str).booleanValue()) {
            return null;
        }
        String[] split = str.substring(str.indexOf("[") + 1, str.lastIndexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT)).split("[^[^\"\\s*]],");
        for (int i = 0; i < split.length; i++) {
            split[i] = stringToString(split[i]);
        }
        return new ArrayList<>(Arrays.asList(split));
    }

    public static Boolean isNullString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ec223c7e4437bce572c09bd91d33544a", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ec223c7e4437bce572c09bd91d33544a") : Boolean.valueOf(str.replaceAll(StringUtil.SPACE, "").equals(StringUtil.NULL));
    }
}
