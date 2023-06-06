package com.sankuai.waimai.store.mach.swiper;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends SwiperTagProcessor {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor, com.sankuai.waimai.mach.ITagProcessor
    @NonNull
    public final com.sankuai.waimai.mach.component.base.a createComponent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb321cd2100337c1009b10cda04e5f73", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.component.base.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb321cd2100337c1009b10cda04e5f73") : new a();
    }
}
