package com.sankuai.waimai.store.drug.home.newp.sg;

import android.arch.lifecycle.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeData;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class b implements l {
    public static ChangeQuickRedirect a;
    private final ChannelNormalMachViewBlock b;

    public b(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        this.b = channelNormalMachViewBlock;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "161f32e5c1f0aa60827e94276c33dd11", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "161f32e5c1f0aa60827e94276c33dd11");
        } else {
            ChannelNormalMachViewBlock.a(this.b, (ShoppingGuideRealtimeData) obj);
        }
    }
}
