package com.sankuai.meituan.mtlive.ugc.tx;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tencent.liteav.beauty.TXBeautyManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private TXBeautyManager b;

    public a(TXBeautyManager tXBeautyManager) {
        Object[] objArr = {tXBeautyManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abd088ecf9bab3706c7360320c8971e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abd088ecf9bab3706c7360320c8971e5");
        } else {
            this.b = tXBeautyManager;
        }
    }
}
