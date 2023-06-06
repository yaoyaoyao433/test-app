package com.sankuai.model.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Strings {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> String joinAnd(String str, String str2, Collection<T> collection) {
        int i = 1;
        Object[] objArr = {str, str2, collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0faadc1cb085918ad99b3ee3e4653ee2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0faadc1cb085918ad99b3ee3e4653ee2");
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        Iterator<T> it = collection.iterator();
        StringBuilder sb = new StringBuilder(toString(it.next()));
        while (it.hasNext()) {
            T next = it.next();
            if (notEmpty(next)) {
                i++;
                sb.append(i == collection.size() ? str2 : str);
                sb.append(toString(next));
            }
        }
        return sb.toString();
    }

    public static <T> String joinAnd(String str, String str2, T... tArr) {
        Object[] objArr = {str, str2, tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "373b1ab036f02a3f807ffddda477f2ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "373b1ab036f02a3f807ffddda477f2ce") : joinAnd(str, str2, Arrays.asList(tArr));
    }

    public static <T> String join(String str, Collection<T> collection) {
        Object[] objArr = {str, collection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b5ae5a1a1b4e2b32432e0f2d714f285", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b5ae5a1a1b4e2b32432e0f2d714f285");
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        Iterator<T> it = collection.iterator();
        StringBuilder sb = new StringBuilder(toString(it.next()));
        while (it.hasNext()) {
            T next = it.next();
            if (notEmpty(next)) {
                sb.append(str);
                sb.append(toString(next));
            }
        }
        return sb.toString();
    }

    public static <T> String join(String str, T... tArr) {
        Object[] objArr = {str, tArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fc94969f03c47d63e9c02eb8b70dd9a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fc94969f03c47d63e9c02eb8b70dd9a") : join(str, Arrays.asList(tArr));
    }

    public static String toString(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0af8024b0af55ed37ed86d31a4e06623", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0af8024b0af55ed37ed86d31a4e06623");
        }
        StringWriter stringWriter = new StringWriter();
        copy(new InputStreamReader(inputStream), stringWriter);
        return stringWriter.toString();
    }

    public static String toString(Reader reader) {
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "610b6ea8edde3e73edf7ef5a2adec7e9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "610b6ea8edde3e73edf7ef5a2adec7e9");
        }
        StringWriter stringWriter = new StringWriter();
        copy(reader, stringWriter);
        return stringWriter.toString();
    }

    public static int copy(Reader reader, Writer writer) {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34232b9b999d7a0fb182e17ca4f26525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34232b9b999d7a0fb182e17ca4f26525")).intValue();
        }
        long copyLarge = copyLarge(reader, writer);
        if (copyLarge > 2147483647L) {
            return -1;
        }
        return (int) copyLarge;
    }

    public static long copyLarge(Reader reader, Writer writer) throws RuntimeException {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b73b2a425ac5a86833c4dd9a79dee971", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b73b2a425ac5a86833c4dd9a79dee971")).longValue();
        }
        try {
            char[] cArr = new char[4096];
            long j = 0;
            while (true) {
                int read = reader.read(cArr);
                if (-1 == read) {
                    return j;
                }
                writer.write(cArr, 0, read);
                j += read;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d098fb68cbe7928843ccb7f2fe944212", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d098fb68cbe7928843ccb7f2fe944212") : toString(obj, "");
    }

    public static String toString(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3c486f986b9ebeea8ff7316311fb146c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3c486f986b9ebeea8ff7316311fb146c");
        }
        if (obj == null) {
            return str;
        }
        if (obj instanceof InputStream) {
            return toString((InputStream) obj);
        }
        if (obj instanceof Reader) {
            return toString((Reader) obj);
        }
        if (obj instanceof Object[]) {
            return join(", ", (Object[]) obj);
        }
        return obj instanceof Collection ? join(", ", (Collection) obj) : obj.toString();
    }

    public static boolean isEmpty(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2f17a6e6793baaf4f51a91b75521fdd2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2f17a6e6793baaf4f51a91b75521fdd2")).booleanValue() : toString(obj).trim().length() == 0;
    }

    public static boolean notEmpty(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cc0b9d42ed932f511467ecbc6aebe0c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cc0b9d42ed932f511467ecbc6aebe0c8")).booleanValue() : toString(obj).trim().length() != 0;
    }

    public static String md5(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1a13f4eb4b5164bf939e4bc92174de19", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1a13f4eb4b5164bf939e4bc92174de19");
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() == 1) {
                    sb.append('0');
                    sb.append(hexString.charAt(hexString.length() - 1));
                } else {
                    sb.append(hexString.substring(hexString.length() - 2));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String capitalize(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96bbf960d649e4fea258a0d053dcbeb2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96bbf960d649e4fea258a0d053dcbeb2");
        }
        String strings = toString(str);
        if (strings.length() < 2) {
            return strings.length() > 0 ? strings.toUpperCase() : strings;
        }
        return strings.substring(0, 1).toUpperCase() + strings.substring(1);
    }

    public static boolean equals(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "62fd18201dcafb3252fa52802a0f24d6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "62fd18201dcafb3252fa52802a0f24d6")).booleanValue() : toString(obj).equals(toString(obj2));
    }

    public static boolean equalsIgnoreCase(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77106c107ea191fad5e4ce8f3e6725a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77106c107ea191fad5e4ce8f3e6725a9")).booleanValue() : toString(obj).toLowerCase().equals(toString(obj2).toLowerCase());
    }

    public static String[] chunk(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bef77cae935ba5619aec253c4fc80086", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bef77cae935ba5619aec253c4fc80086");
        }
        if (isEmpty(str) || i == 0) {
            return new String[0];
        }
        int length = str.length();
        int i2 = ((length - 1) / i) + 1;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * i;
            int i5 = i4 + i;
            if (i5 >= length) {
                i5 = length;
            }
            strArr[i3] = str.substring(i4, i5);
        }
        return strArr;
    }

    public static String namedFormat(String str, Map<String, String> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "49431bd7f7cc63190b7aabdf957138e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "49431bd7f7cc63190b7aabdf957138e7");
        }
        for (String str2 : map.keySet()) {
            str = str.replace(CommonConstant.Symbol.DOLLAR + str2, map.get(str2));
        }
        return str;
    }

    public static String namedFormat(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "337dd938c5ab20f5a208f604c726ce85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "337dd938c5ab20f5a208f604c726ce85");
        }
        if (objArr.length % 2 != 0) {
            throw new InvalidParameterException("You must include one value for each parameter");
        }
        HashMap hashMap = new HashMap(objArr.length / 2);
        for (int i = 0; i < objArr.length; i += 2) {
            hashMap.put(toString(objArr[i]), toString(objArr[i + 1]));
        }
        return namedFormat(str, hashMap);
    }
}
