package com.sankuai.waimai.store.drug.home.newp.sg;

import android.arch.lifecycle.l;
import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements l {
    public static ChangeQuickRedirect a;
    private final ChannelNormalMachViewBlock b;

    public d(ChannelNormalMachViewBlock channelNormalMachViewBlock) {
        this.b = channelNormalMachViewBlock;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda7b31400d4f117b10c4a9726530276", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda7b31400d4f117b10c4a9726530276");
        } else {
            ChannelNormalMachViewBlock.a(this.b, (Bitmap) obj);
        }
    }
}
