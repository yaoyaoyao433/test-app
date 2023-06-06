package com.tencent.mapsdk.internal;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.lib.models.AccessibleTouchItem;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hb {
    private static SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

    public static String c(String str) {
        return str == null ? "" : str;
    }

    public static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    private static boolean b(String str, String str2) {
        return (str2 == null || str == null || str2.indexOf(str) != 0) ? false : true;
    }

    private static boolean c(String str, String str2) {
        if (str2 == null || str == null) {
            return false;
        }
        return str2.contains(str);
    }

    private static CharSequence a(String[] strArr, int[] iArr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strArr[i]);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(iArr[i]), 0, spannableStringBuilder2.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }

    private static String d(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String e(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String f(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "gbk");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public static String a(byte[] bArr, String str) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(256);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    private static boolean g(String str) {
        if (a(str)) {
            return false;
        }
        return str.equals(AccessibleTouchItem.MY_LOCATION_PREFIX) || str.equals("当前位置") || str.equals("我在哪") || str.equals("我在哪儿") || str.equals("我在的位置") || str.equals("我的位置在哪") || str.equals("我的位置在哪儿");
    }

    private static boolean h(String str) {
        try {
            return Pattern.compile("[0-9]*").matcher(str).matches();
        } catch (Exception unused) {
            return false;
        }
    }

    private static int d(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i < (split.length > split2.length ? split2.length : split.length)) {
                int intValue = Integer.valueOf(split[i]).intValue() - Integer.valueOf(split2[i]).intValue();
                if (intValue != 0) {
                    return intValue;
                }
                i++;
            } else if (split.length != split2.length) {
                return split.length - split2.length;
            } else {
                return 0;
            }
        }
    }

    private static String a(long j) {
        return a.format(Long.valueOf(j));
    }

    public static boolean a(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return str2.equals(str);
        }
        return false;
    }

    public static String b(String str) {
        int lastIndexOf;
        return (!a(str) && (lastIndexOf = str.lastIndexOf(CommonConstant.Symbol.DOT)) > 0) ? str.substring(0, lastIndexOf) : str;
    }

    private static String i(String str) {
        if (a(str)) {
            return str;
        }
        try {
            URI uri = new URI(str);
            String[] split = uri.getQuery().split("&");
            Arrays.sort(split);
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                sb.append(str2);
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), sb.toString(), uri.getFragment()).toString();
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return str;
        }
    }

    private static int j(String str) {
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i + 1;
            i2 = str.substring(i, i3).matches("[一-龥]") ? i2 + 1 : (int) (i2 + 0.5d);
            i = i3;
        }
        return i2;
    }

    private static String a(Collection<String> collection, String str) {
        if (collection == null || collection.isEmpty() || str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String str2 : collection) {
            if (i == collection.size() - 1) {
                sb.append(str2);
            } else {
                sb.append(str2);
                sb.append(str);
            }
            i++;
        }
        return sb.toString();
    }
}
