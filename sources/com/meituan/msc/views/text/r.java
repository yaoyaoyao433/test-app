package com.meituan.msc.views.text;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.text.BreakIterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum r {
    NONE,
    UPPERCASE,
    LOWERCASE,
    CAPITALIZE,
    UNSET;
    
    public static ChangeQuickRedirect a;

    r() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8697accee13304a090aef58e98e3a986", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8697accee13304a090aef58e98e3a986");
        }
    }

    public static r valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ce3526cf300d9f25dcef95794c0bc9d", RobustBitConfig.DEFAULT_VALUE) ? (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ce3526cf300d9f25dcef95794c0bc9d") : (r) Enum.valueOf(r.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static r[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bead15293ffff81e7d2b8bd6972f00f4", RobustBitConfig.DEFAULT_VALUE) ? (r[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bead15293ffff81e7d2b8bd6972f00f4") : (r[]) values().clone();
    }

    public static String a(String str, r rVar) {
        Object[] objArr = {str, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cae5ba41e5b1341948e8848b9f536cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cae5ba41e5b1341948e8848b9f536cf");
        }
        if (str == null) {
            return null;
        }
        switch (rVar) {
            case UPPERCASE:
                return str.toUpperCase();
            case LOWERCASE:
                return str.toLowerCase();
            case CAPITALIZE:
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6f79b134ca24b24fc23314ebbfaedb55", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6f79b134ca24b24fc23314ebbfaedb55");
                }
                BreakIterator wordInstance = BreakIterator.getWordInstance();
                wordInstance.setText(str);
                StringBuilder sb = new StringBuilder(str.length());
                int first = wordInstance.first();
                while (true) {
                    int i = first;
                    first = wordInstance.next();
                    if (first != -1) {
                        String substring = str.substring(i, first);
                        if (Character.isLetterOrDigit(substring.charAt(0))) {
                            sb.append(Character.toUpperCase(substring.charAt(0)));
                            sb.append(substring.substring(1).toLowerCase());
                        } else {
                            sb.append(substring);
                        }
                    } else {
                        return sb.toString();
                    }
                }
            default:
                return str;
        }
    }
}
