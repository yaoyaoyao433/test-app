package com.sankuai.waimai.bussiness.order.detailnew.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "579e71ded4e14cb23ee94ecda76bea77", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "579e71ded4e14cb23ee94ecda76bea77")).booleanValue();
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static long a(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2582b5c8ed07a1e1d473dd9a60ab8e98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2582b5c8ed07a1e1d473dd9a60ab8e98")).longValue();
        }
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static int a(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "289f18ef1aeacd0689714206f16f5b99", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "289f18ef1aeacd0689714206f16f5b99")).intValue();
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
