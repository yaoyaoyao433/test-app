package com.sankuai.waimai.share;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eef7ac07c322b38d818e5ec6a9e31120", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eef7ac07c322b38d818e5ec6a9e31120")).intValue();
        }
        if (i != 4) {
            if (i != 8) {
                switch (i) {
                    case 1:
                        return 3;
                    case 2:
                        return 2;
                    default:
                        return 1;
                }
            }
            return 4;
        }
        return 1;
    }

    public static int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "513849a37fcb163d624c6f71f813781d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "513849a37fcb163d624c6f71f813781d")).intValue();
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 2;
            case 3:
                return 1;
            case 4:
                return 8;
            default:
                return 0;
        }
    }
}
