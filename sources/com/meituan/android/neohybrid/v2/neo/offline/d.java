package com.meituan.android.neohybrid.v2.neo.offline;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum d {
    EXIST,
    NON_EXIST_DIO_PATH,
    NON_EXIST_FILE,
    NON_EXIST_EXCEPTION;
    
    public static ChangeQuickRedirect a;

    d() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cb91ba9f0cfb0b09b8a133a353b4acf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cb91ba9f0cfb0b09b8a133a353b4acf");
        }
    }

    public static d valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "342fb6723a955e2e61430fd4e0fe6006", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "342fb6723a955e2e61430fd4e0fe6006") : (d) Enum.valueOf(d.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "776e1926463643e3f5c4f09817a8364f", RobustBitConfig.DEFAULT_VALUE) ? (d[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "776e1926463643e3f5c4f09817a8364f") : (d[]) values().clone();
    }
}
