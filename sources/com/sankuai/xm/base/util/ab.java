package com.sankuai.xm.base.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ab {
    public static ChangeQuickRedirect a;

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fbc5820e711746baa45b49a4dc87cab", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fbc5820e711746baa45b49a4dc87cab")).booleanValue();
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static long a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a2111bee29e81a670133c352b20cfd8", 6917529027641081856L)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a2111bee29e81a670133c352b20cfd8")).longValue();
        }
        try {
            return Long.valueOf(str).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0c110353fb18fe7c96a052bf055843aa", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0c110353fb18fe7c96a052bf055843aa");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        while (length > 0 && charArray[length - 1] == '\n') {
            length--;
        }
        return length < str.length() ? str.substring(0, length) : str;
    }
}
