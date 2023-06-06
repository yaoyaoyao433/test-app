package com.sankuai.waimai.store.drug.home.newp.sg;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements c.a {
    public static ChangeQuickRedirect a;
    private final ChannelNormalMachViewBlock b;

    public c(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        this.b = channelNormalMachViewBlock;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47391feb25ddf3fd125ef402d227cc23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47391feb25ddf3fd125ef402d227cc23");
        } else {
            ChannelNormalMachViewBlock.a(this.b);
        }
    }
}
