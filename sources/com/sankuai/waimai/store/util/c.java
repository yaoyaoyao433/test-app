package com.sankuai.waimai.store.util;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, int i, int i2) {
        Object[] objArr = {context, str, 1, 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cd3abdd9da275694065edc5d289cc56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cd3abdd9da275694065edc5d289cc56");
            return;
        }
        long b = ab.b().b(context, str, 0L);
        int[] iArr = {0, a.b(b), a.a(b)};
        iArr[1] = Math.min(iArr[1] + 1, 1);
        iArr[2] = Math.min(iArr[2] + 1, 1);
        b(context, str, iArr[1], iArr[2]);
    }

    private static void b(Context context, String str, int i, int i2) {
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d899159e1c763d7d46fe887516dc830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d899159e1c763d7d46fe887516dc830");
        } else {
            ab.b().a(context, str, a.a(a(), i, i2));
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5c5bee2b0721ea0bbedec15970c160e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5c5bee2b0721ea0bbedec15970c160e")).intValue();
        }
        try {
            return Integer.parseInt(com.sankuai.shangou.stone.util.g.b().replace(CommonConstant.Symbol.MINUS, ""));
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
            return -1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;

        public static int a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc21ef17e1cfd2545beec2c1968afe88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc21ef17e1cfd2545beec2c1968afe88")).intValue() : (int) ((j & 70368744177663L) >> 25);
        }

        public static int b(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39bf15b447ec387006abf0bf44732057", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39bf15b447ec387006abf0bf44732057")).intValue() : (int) (j >> 46);
        }

        static long a(int i, int i2, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5e195d86ab0f7e2c3ebbb682cbeec5ad", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5e195d86ab0f7e2c3ebbb682cbeec5ad")).longValue();
            }
            long j = i;
            long j2 = i2;
            long j3 = i3;
            Object[] objArr2 = {new Long(j), new Long(j2), new Long(j3)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0484d888ab2ff9a243ec7b360c72cef0", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0484d888ab2ff9a243ec7b360c72cef0")).longValue() : (j2 << 46) | ((j3 << 25) & 70368744177663L) | (j & 33554431);
        }
    }
}
