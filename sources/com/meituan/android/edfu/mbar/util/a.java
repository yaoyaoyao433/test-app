package com.meituan.android.edfu.mbar.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum a {
    AZTEC,
    CODABAR,
    CODE_39,
    CODE_93,
    CODE_128,
    DATA_MATRIX,
    EAN_8,
    EAN_13,
    ITF,
    MAXICODE,
    PDF_417,
    QR_CODE,
    RSS_14,
    RSS_EXPANDED,
    UPC_A,
    UPC_E,
    UPC_EAN_EXTENSION,
    PARTIAL,
    EAN_2,
    EAN_5,
    ISBN_10,
    ISBN_13,
    COMPOSITE,
    DATABAR,
    DATABAR_EXP;
    
    public static ChangeQuickRedirect a;

    a() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4923de11f2ad6f5d1bbbad334fdf38bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4923de11f2ad6f5d1bbbad334fdf38bb");
        }
    }

    public static a valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9323110d1e64e4752e3d303fc1db9d7f", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9323110d1e64e4752e3d303fc1db9d7f") : (a) Enum.valueOf(a.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e376dab0cdf691e49b4b198e04bfe642", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e376dab0cdf691e49b4b198e04bfe642") : (a[]) values().clone();
    }
}
