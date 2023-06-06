package com.sankuai.waimai.store.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ab extends com.sankuai.shangou.stone.util.r {
    public static ChangeQuickRedirect c;
    private static ab d;

    public ab() {
        super("quickbuy");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c1c177f5fa4e4ba432d13ff98d5bcdd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c1c177f5fa4e4ba432d13ff98d5bcdd");
        }
    }

    public static ab b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af89909708210dc8825295adba34564d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ab) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af89909708210dc8825295adba34564d");
        }
        if (d == null) {
            synchronized (ab.class) {
                if (d == null) {
                    d = new ab();
                }
            }
        }
        return d;
    }
}
