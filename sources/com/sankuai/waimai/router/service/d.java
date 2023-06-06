package com.sankuai.waimai.router.service;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    final String b;
    public final String c;
    public final Class d;
    final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d22c06b808b85e7d84181dc572c97ea8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d22c06b808b85e7d84181dc572c97ea8")).booleanValue() : str == null || str.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d85bba876d012b5f8bb507bddf85918", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d85bba876d012b5f8bb507bddf85918");
        }
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public d(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e132d178bed81db5d31eeda31afef1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e132d178bed81db5d31eeda31afef1");
        } else if (a(str2)) {
            throw new RuntimeException("implementation不应该为空");
        } else {
            this.b = a(str) ? str2 : str;
            this.c = str2;
            this.d = null;
            this.e = z;
        }
    }

    public final String toString() {
        return this.c;
    }
}
