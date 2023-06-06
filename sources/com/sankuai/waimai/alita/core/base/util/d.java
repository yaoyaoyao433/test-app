package com.sankuai.waimai.alita.core.base.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static Random b = new Random(System.currentTimeMillis());

    public static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e6d4814d643614671b6c790f69fb587", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e6d4814d643614671b6c790f69fb587")).booleanValue();
        }
        if (i < 0 || i > 100) {
            return false;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a20bd64fca5316c508b392624a263f72", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a20bd64fca5316c508b392624a263f72")).intValue() : b(100)) < i;
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "444e0fc4ce75f369c894e4bc63890749", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "444e0fc4ce75f369c894e4bc63890749")).intValue() : b.nextInt(i);
    }
}
