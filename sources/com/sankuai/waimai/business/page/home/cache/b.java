package com.sankuai.waimai.business.page.home.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    private static <T> String a(String str, Collection<T> collection) {
        boolean z;
        Object[] objArr = {str, collection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a28ca3f858c1857d11b889c22d16f5d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a28ca3f858c1857d11b889c22d16f5d9");
        }
        if (collection == null || collection.isEmpty()) {
            return "";
        }
        Iterator<T> it = collection.iterator();
        StringBuilder sb = new StringBuilder(a(it.next()));
        while (it.hasNext()) {
            T next = it.next();
            Object[] objArr2 = {next};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b4e353c48b3f202c3e52d44421384ac7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b4e353c48b3f202c3e52d44421384ac7")).booleanValue();
            } else {
                z = a(next).trim().length() != 0;
            }
            if (z) {
                sb.append(str);
                sb.append(a(next));
            }
        }
        return sb.toString();
    }

    private static <T> String a(String str, T... tArr) {
        Object[] objArr = {str, tArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec11e792101c3cb5f4c4cc3ffdfd1b6e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec11e792101c3cb5f4c4cc3ffdfd1b6e") : a(str, Arrays.asList(tArr));
    }

    private static String a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "26c4be95d51bf9121a2efcee2dd21e44", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "26c4be95d51bf9121a2efcee2dd21e44");
        }
        StringWriter stringWriter = new StringWriter();
        a(new InputStreamReader(inputStream), stringWriter);
        return stringWriter.toString();
    }

    private static String a(Reader reader) {
        Object[] objArr = {reader};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1d015b92910e9c790159f3e395008e1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1d015b92910e9c790159f3e395008e1");
        }
        StringWriter stringWriter = new StringWriter();
        a(reader, stringWriter);
        return stringWriter.toString();
    }

    private static int a(Reader reader, Writer writer) {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94462049fc9959a55ea50bcff2f22c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94462049fc9959a55ea50bcff2f22c5")).intValue();
        }
        long b = b(reader, writer);
        if (b > 2147483647L) {
            return -1;
        }
        return (int) b;
    }

    private static long b(Reader reader, Writer writer) throws RuntimeException {
        Object[] objArr = {reader, writer};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab19c28f444c60c66ab6bd0ae10a4cc7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab19c28f444c60c66ab6bd0ae10a4cc7")).longValue();
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

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaf7271c6b087e41180de7914165bc09", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaf7271c6b087e41180de7914165bc09") : a(obj, "");
    }

    private static String a(Object obj, String str) {
        Object[] objArr = {obj, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6b5ec1d3ff715d514aea53117c025d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6b5ec1d3ff715d514aea53117c025d");
        }
        if (obj == null) {
            return str;
        }
        if (obj instanceof InputStream) {
            return a((InputStream) obj);
        }
        if (obj instanceof Reader) {
            return a((Reader) obj);
        }
        if (obj instanceof Object[]) {
            return a(", ", (Object[]) obj);
        }
        if (obj instanceof Collection) {
            return a(", ", (Collection) obj);
        }
        return obj.toString();
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed8d6fa875b1b71bec0509fa90413c05", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed8d6fa875b1b71bec0509fa90413c05");
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
}
