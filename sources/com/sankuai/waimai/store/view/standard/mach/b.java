package com.sankuai.waimai.store.view.standard.mach;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.view.standard.FlashPrice;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.mach.component.base.a<FlashPrice> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(FlashPrice flashPrice) {
        FlashPrice flashPrice2 = flashPrice;
        Object[] objArr = {flashPrice2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c0f13e34c14d613ddbaa6e0abb7f1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c0f13e34c14d613ddbaa6e0abb7f1a");
            return;
        }
        super.a((b) flashPrice2);
        a2(flashPrice2);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ FlashPrice b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5c9c7030499f90bfa4c01741eb2501e", RobustBitConfig.DEFAULT_VALUE) ? (FlashPrice) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5c9c7030499f90bfa4c01741eb2501e") : new FlashPrice(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96703361db3d6ad728dca90969917d89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96703361db3d6ad728dca90969917d89");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        this.b = a("price");
        this.c = a("origin-price");
        this.h = a("unit");
        this.d = a(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
        this.e = a("direction");
        this.f = a("alignment");
        this.g = a("theme");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* renamed from: a  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a2(com.sankuai.waimai.store.view.standard.FlashPrice r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.view.standard.mach.b.a2(com.sankuai.waimai.store.view.standard.FlashPrice):void");
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(com.facebook.yoga.d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7568631a5435bece1d9c8ee49a26218", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7568631a5435bece1d9c8ee49a26218")).longValue();
        }
        Activity activity = this.m.getActivity();
        if (activity == null) {
            return 0L;
        }
        FlashPrice flashPrice = new FlashPrice(activity);
        a2(flashPrice);
        flashPrice.measure(View.MeasureSpec.makeMeasureSpec(h.a((Context) activity), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(h.b(activity), Integer.MIN_VALUE));
        return com.facebook.yoga.c.a(flashPrice.getMeasuredWidth(), flashPrice.getMeasuredHeight());
    }
}
