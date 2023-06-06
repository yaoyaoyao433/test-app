package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public static ChangeQuickRedirect a;
    private static final e b = new e();

    public static Runnable a() {
        return b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ddbafbd9769e0c934bccbf36db0fe85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ddbafbd9769e0c934bccbf36db0fe85");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f14d4eaec27c2d2941b63b7d108d549d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f14d4eaec27c2d2941b63b7d108d549d");
        } else {
            l.cancel("hide_remind_bubble_view");
        }
    }
}
