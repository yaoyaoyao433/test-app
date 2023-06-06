package com.meituan.robust.common;

import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class StringUtil {
    public static final String BLANK = "";
    public static final byte CR = 13;
    public static final byte[] CRLF = {13, 10};
    public static final String CRLF_STRING = "\r\n";
    public static final byte LF = 10;
    private static final String METCH_PATTERN = "*";
    private static final String METCH_PATTERN_REGEX = "[\\*]+";
    private static final String METCH_PATTERN_REPLACEMENT = "[\\\\S|\\\\s]*";
    public static final String NULL = "null";
    public static final String SPACE = " ";
    private static final String ZERO = "0";

    public static String nullToBlank(String str) {
        return str == null ? "" : str;
    }

    private StringUtil() {
    }

    public static String trim(String str) {
        return str == null ? "" : str.trim();
    }

    public static String[] nullToBlank(String[] strArr) {
        return strArr == null ? new String[0] : strArr;
    }

    public static String convertToPatternString(String str) {
        if (str.contains(CommonConstant.Symbol.DOT)) {
            str = str.replaceAll("\\.", "\\\\.");
        }
        if (str.contains(CommonConstant.Symbol.QUESTION_MARK)) {
            str = str.replaceAll("\\?", "\\.");
        }
        return str.contains("*") ? str.replace("*", ".*") : str;
    }

    public static boolean isStringMatchesPatterns(String str, Collection<Pattern> collection) {
        for (Pattern pattern : collection) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static <T> String collectionToString(Collection<T> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T t : collection) {
            if (z) {
                z = false;
            } else {
                sb.append(',');
            }
            sb.append(t);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkFileInPatternCompatOs(java.util.HashSet<java.util.regex.Pattern> r5, java.lang.String r6) {
        /*
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L44
            java.util.Iterator r5 = r5.iterator()
        La:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            java.lang.String r1 = r6.toString()
            java.lang.String r2 = "\\"
            java.lang.String r3 = "/"
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.String r2 = r6.toString()
            java.lang.String r3 = "/"
            java.lang.String r4 = "\\"
            java.lang.String r2 = r2.replace(r3, r4)
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L42
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto La
        L42:
            r5 = 1
            return r5
        L44:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.robust.common.StringUtil.checkFileInPatternCompatOs(java.util.HashSet, java.lang.String):boolean");
    }

    public static boolean isBlank(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < length && Character.isWhitespace(str.charAt(i)); i++) {
        }
        return false;
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String[] compareString(String[] strArr, String[] strArr2) {
        boolean z;
        if (strArr == null || strArr2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strArr.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr2.length) {
                    z = false;
                    break;
                } else if (strArr[i].equals(strArr2[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (!z) {
                arrayList.add(strArr[i]);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean isMatchPattern(String str, String str2) {
        if (str != null && str2 != null) {
            if (str2.indexOf("*") >= 0) {
                return isMatchRegex(str, CommonConstant.Symbol.XOR + str2.replaceAll(METCH_PATTERN_REGEX, METCH_PATTERN_REPLACEMENT) + CommonConstant.Symbol.DOLLAR);
            } else if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isMatchRegex(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        return Pattern.compile(str2).matcher(str).find();
    }

    public static List<String> parseRegexGroup(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int groupCount = matcher.groupCount();
        ArrayList arrayList = new ArrayList();
        if (matcher.find()) {
            for (int i = 1; i <= groupCount; i++) {
                arrayList.add(matcher.group(i));
            }
            return arrayList;
        }
        return arrayList;
    }

    public static List<String> parseStringGroup(String str, String str2, String str3, String str4, int i) {
        if (str != null) {
            ArrayList arrayList = new ArrayList();
            if (i < 0) {
                i = 0;
            }
            Matcher matcher = Pattern.compile(str2).matcher(str);
            int i2 = 0;
            while (matcher.find(i2)) {
                i2 = matcher.end();
                String replaceFirst = matcher.group().replaceFirst(str3, str4);
                arrayList.add(replaceFirst.substring(0, replaceFirst.length() - i));
            }
            return arrayList;
        }
        return null;
    }

    public static String byteToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append(0);
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }

    public static byte[] hexStringToByte(String str) {
        if (str != null) {
            byte[] bArr = new byte[str.length() / 2];
            int i = 0;
            while (i < bArr.length) {
                int i2 = i + 1;
                try {
                    bArr[i] = (byte) Integer.parseInt(str.substring(i * 2, i2 * 2), 16);
                } catch (NumberFormatException unused) {
                }
                i = i2;
            }
            return bArr;
        }
        return null;
    }

    public static String fillZero(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public static int stringMod(String str, int i) {
        int hashCode;
        int i2 = 0;
        if (str != null && ((hashCode = str.hashCode()) >= 0 || (hashCode = Math.abs(hashCode)) >= 0)) {
            i2 = hashCode;
        }
        if (i <= 0) {
            i = 1;
        }
        return i2 % i;
    }
}
