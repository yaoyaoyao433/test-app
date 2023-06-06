package com.sankuai.waimai.store.view.standard.mach;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.view.standard.FlashMemberPrice;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<FlashMemberPrice> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FlashMemberPrice flashMemberPrice) {
        FlashMemberPrice flashMemberPrice2 = flashMemberPrice;
        Object[] objArr = {flashMemberPrice2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cdf874cc548be2cbcd6b5bc30c0d707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cdf874cc548be2cbcd6b5bc30c0d707");
            return;
        }
        super.a((a) flashMemberPrice2);
        a2(flashMemberPrice2);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FlashMemberPrice b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6926e0cc692564a2c3c76be250445844", RobustBitConfig.DEFAULT_VALUE) ? (FlashMemberPrice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6926e0cc692564a2c3c76be250445844") : new FlashMemberPrice(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08d29eae5bdaf90baed9c4becde08b6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08d29eae5bdaf90baed9c4becde08b6d");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        this.b = a("price");
        this.c = a("member-price-style");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(FlashMemberPrice flashMemberPrice) {
        Object[] objArr = {flashMemberPrice};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d53a0eb38261b20c5cd6488a5131dc6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d53a0eb38261b20c5cd6488a5131dc6b");
        } else if (flashMemberPrice == null) {
        } else {
            flashMemberPrice.setPrice(this.b);
            flashMemberPrice.setPriceStyle(1 ^ ("styleLong".equals(this.c) ? 1 : 0));
        }
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d8f336bb28257a0197191ff1b4bf22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d8f336bb28257a0197191ff1b4bf22")).longValue();
        }
        Activity activity = this.m.getActivity();
        if (activity == null) {
            return 0L;
        }
        FlashMemberPrice flashMemberPrice = new FlashMemberPrice(activity);
        a2(flashMemberPrice);
        flashMemberPrice.measure(View.MeasureSpec.makeMeasureSpec(h.a((Context) activity), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h.b(activity), Integer.MIN_VALUE));
        return com.facebook.yoga.c.a(flashMemberPrice.getMeasuredWidth(), flashMemberPrice.getMeasuredHeight());
    }
}
