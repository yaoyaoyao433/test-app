package com.sankuai.waimai.business.restaurant.goodsdetail.videoview;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GoodDetailPlayerService implements IGoodDetailPlayerService {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService
    public void setPlayerMuting(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "42e90ee530e7ce7ebe938e4a11d7082a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "42e90ee530e7ce7ebe938e4a11d7082a");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", z);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.player.IGoodDetailPlayerService
    public boolean isPlayerMuting() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "946c1f7cee12443f5ab353d64eb8f014", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "946c1f7cee12443f5ab353d64eb8f014")).booleanValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "goods_detail_video_volume_state", true);
    }
}
