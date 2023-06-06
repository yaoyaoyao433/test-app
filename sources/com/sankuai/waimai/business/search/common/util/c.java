package com.sankuai.waimai.business.search.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static int a(int[] iArr) {
        int i = 0;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72056ac0d77b10cc2af2bbe50f86d525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72056ac0d77b10cc2af2bbe50f86d525")).intValue();
        }
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (iArr[i] < iArr[i2]) {
                i = i2;
            }
        }
        return iArr[i];
    }

    public static int b(int[] iArr) {
        int i = 0;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24a3ee99cac6ba4f1d8c474454ff58af", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24a3ee99cac6ba4f1d8c474454ff58af")).intValue();
        }
        int length = iArr.length;
        for (int i2 = 1; i2 < length; i2++) {
            if (iArr[i] > iArr[i2]) {
                i = i2;
            }
        }
        return iArr[i];
    }
}
