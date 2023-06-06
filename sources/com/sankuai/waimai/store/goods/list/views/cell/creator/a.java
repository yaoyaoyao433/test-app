package com.sankuai.waimai.store.goods.list.views.cell.creator;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.views.cell.view.SpuRestaurantBigCellView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.cell.creator.a {
    public static ChangeQuickRedirect b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a() {
        /*
            r11 = this;
            com.sankuai.waimai.store.cell.core.CellUiConfig r0 = com.sankuai.waimai.store.cell.core.CellUiConfig.a()
            r1 = 1
            r0.b = r1
            r11.<init>(r0)
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.goods.list.views.cell.creator.a.b
            java.lang.String r10 = "bc1580a7d22382b9eba1f7a822a6bdfd"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.views.cell.creator.a.<init>():void");
    }

    @Override // com.sankuai.waimai.store.cell.creator.a
    public final com.sankuai.waimai.store.cell.core.a b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb8f4af9c251af63696430a38487a2d6", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.cell.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb8f4af9c251af63696430a38487a2d6") : new SpuRestaurantBigCellView(context);
    }
}
