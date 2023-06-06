package com.sankuai.waimai.store.cell.creator;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.cell.view.SpuBaseCellView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r11 = this;
            com.sankuai.waimai.store.cell.core.CellUiConfig r0 = com.sankuai.waimai.store.cell.core.CellUiConfig.a()
            r1 = 0
            r0.b = r1
            r11.<init>(r0)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.store.cell.creator.b.b
            java.lang.String r10 = "679d0eb20bc6728ce82aa84ac7b1814b"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r0
            r3 = r11
            r4 = r9
            r6 = r10
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r1, r10)
            return
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.cell.creator.b.<init>():void");
    }

    @Override // com.sankuai.waimai.store.cell.creator.a
    public final com.sankuai.waimai.store.cell.core.a b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1421851c79b061074c53dc156a07519", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.cell.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1421851c79b061074c53dc156a07519") : new SpuBaseCellView(context);
    }
}
