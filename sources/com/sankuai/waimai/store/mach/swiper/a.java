package com.sankuai.waimai.store.mach.swiper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.swiper.b {
    public static ChangeQuickRedirect c;
    public InterfaceC1221a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.mach.swiper.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1221a {
        void d_(int i);
    }

    @Override // com.sankuai.waimai.mach.component.swiper.b, com.sankuai.waimai.mach.component.swiper.SwiperContainer.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78a4875881994795b63b3f38795443b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78a4875881994795b63b3f38795443b5");
            return;
        }
        super.a(i);
        if (this.d != null) {
            this.d.d_(i);
        }
    }
}
