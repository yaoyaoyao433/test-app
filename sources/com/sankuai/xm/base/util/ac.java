package com.sankuai.xm.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ac {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f4bfe3793c35d6c940158717c00b7bf", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f4bfe3793c35d6c940158717c00b7bf")).booleanValue() : str == null || str.length() == 0;
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        Object[] objArr = {charSequence, charSequence2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79cb6679fb35e26e7bd0773a7b518302", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79cb6679fb35e26e7bd0773a7b518302")).booleanValue();
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static Long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce913b594c21c91a719a7337068b3393", 6917529027641081856L)) {
            return (Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce913b594c21c91a719a7337068b3393");
        }
        try {
            return Long.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long a(String str, long j) {
        Object[] objArr = {str, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfe6a1296fa85da478fddb70496cb999", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfe6a1296fa85da478fddb70496cb999")).longValue();
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static boolean c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a1e773d94165dbf1025cb4a7dc0e34e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a1e773d94165dbf1025cb4a7dc0e34e")).booleanValue();
        }
        if (a(str)) {
            return false;
        }
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(str, i);
            if (!Character.isDigit(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return true;
    }

    public static String a(Collection<String> collection, String str, boolean z) {
        Object[] objArr = {collection, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e7e86c9ef9a2f11a514e4f15b670988", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e7e86c9ef9a2f11a514e4f15b670988");
        }
        if (b.a(collection)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next == null) {
                next = "";
            }
            if (z) {
                sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
                sb.append(next);
                sb.append(CommonConstant.Symbol.SINGLE_QUOTES);
            } else {
                sb.append(next);
            }
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static boolean a(CharSequence charSequence, CharSequence... charSequenceArr) {
        Object[] objArr = {charSequence, charSequenceArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fd6bacae8b0a0628c7790f440e84d0f", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fd6bacae8b0a0628c7790f440e84d0f")).booleanValue();
        }
        if (charSequenceArr.length == 0) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (a(charSequence, charSequence2)) {
                return true;
            }
        }
        return false;
    }
}
