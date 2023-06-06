package com.meituan.dio.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;
    private static final String b = File.separator + File.separator;
    private static final String c = File.separator + CommonConstant.Symbol.DOT_CHAR + File.separator;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;

    static {
        StringBuilder sb = new StringBuilder(CommonConstant.Symbol.DOT);
        sb.append(File.separator);
        d = sb.toString();
        e = File.separator + CommonConstant.Symbol.DOT_CHAR;
        f = File.separator + ".." + File.separator;
        StringBuilder sb2 = new StringBuilder("..");
        sb2.append(File.separator);
        g = sb2.toString();
        h = File.separator + "..";
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0132 -> B:92:0x0133). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.dio.utils.e.a(java.lang.String):java.lang.String");
    }

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "183b1e63d77f797ff9c3a6f5a76c279f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "183b1e63d77f797ff9c3a6f5a76c279f");
        }
        if (f.a(str2)) {
            return d(str);
        }
        if (f.a(str) || str2.charAt(0) == File.separatorChar) {
            return d(str2);
        }
        if (!str.endsWith(File.separator)) {
            str = str + File.separator;
        }
        return str + d(str2);
    }

    private static String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b68ded268f3caa2cbd5bb2d7bc8b1f6a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b68ded268f3caa2cbd5bb2d7bc8b1f6a");
        }
        if (str == null) {
            return null;
        }
        while (str.length() > 0 && str.charAt(str.length() - 1) == File.separatorChar) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static String b(String str) {
        int length;
        int lastIndexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaa9a8a405d28465fbda40eecabd3b0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaa9a8a405d28465fbda40eecabd3b0f");
        }
        if (f.a(str)) {
            return null;
        }
        if (str.charAt(str.length() - 1) == File.separatorChar) {
            length = str.length() - 2;
        } else {
            length = str.length() - 1;
        }
        if (length >= 0 && (lastIndexOf = str.lastIndexOf(File.separatorChar, length)) >= 0) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    public static String c(String str) {
        int length;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fdb802c5d3ccd1ea2aa9a88c170ed2b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fdb802c5d3ccd1ea2aa9a88c170ed2b");
        }
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(str.length() - 1) == File.separatorChar) {
            length = str.length() - 2;
        } else {
            length = str.length() - 1;
        }
        return length < 0 ? "" : str.substring(str.lastIndexOf(File.separatorChar, length) + 1, length + 1);
    }
}
