package com.meituan.android.yoda.xxtea;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        String a2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee268d1ce1cf0f810ea29ccf89a49ffc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee268d1ce1cf0f810ea29ccf89a49ffc");
        }
        try {
            String a3 = b.a(str2.getBytes());
            String str3 = str2 + a3.replace("=", CommonConstant.Symbol.DOT).replace("W", "w");
            Object[] objArr2 = {str, str3};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a20b6264b49cb371750dfb3b7ed8557c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a20b6264b49cb371750dfb3b7ed8557c") : a.a(str, str3)).substring(8, a2.length() - 7);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;

        static String a(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55a019abfbe115bbe4bf811bd5651f17", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55a019abfbe115bbe4bf811bd5651f17");
            }
            Integer[] numArr = new Integer[256];
            Character[] chArr = new Character[str.length()];
            StringBuffer stringBuffer = new StringBuffer();
            a(numArr, str2);
            a(numArr, chArr, str.length());
            for (int i = 0; i < str.length(); i++) {
                stringBuffer.append((char) (str.charAt(i) ^ chArr[i].charValue()));
            }
            return stringBuffer.toString();
        }

        private static void a(Integer[] numArr, String str) {
            Object[] objArr = {numArr, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "afc92ca1b7b1ccf17d48aa67b8d7b9c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "afc92ca1b7b1ccf17d48aa67b8d7b9c4");
                return;
            }
            for (int i = 0; i < 256; i++) {
                numArr[i] = Integer.valueOf(i);
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 256; i3++) {
                i2 = ((i2 + numArr[i3].intValue()) + str.charAt(i3 % str.length())) % 256;
                a(numArr, i3, i2);
            }
        }

        private static void a(Integer[] numArr, Character[] chArr, int i) {
            Object[] objArr = {numArr, chArr, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a6edd4fa9cf231acacdb6f955e53a77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a6edd4fa9cf231acacdb6f955e53a77");
                return;
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i2 = (i2 + 1) % 256;
                i3 = (i3 + numArr[i2].intValue()) % 256;
                a(numArr, i2, i3);
                chArr[i4] = Character.valueOf((char) numArr[(numArr[i2].intValue() + numArr[i3].intValue()) % 256].intValue());
            }
        }

        private static void a(Integer[] numArr, int i, int i2) {
            Object[] objArr = {numArr, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42ab8d3839983ae127e1f80748db8c9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42ab8d3839983ae127e1f80748db8c9d");
                return;
            }
            Integer num = numArr[i];
            numArr[i] = numArr[i2];
            numArr[i2] = num;
        }
    }
}
