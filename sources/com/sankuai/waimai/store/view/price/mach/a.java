package com.sankuai.waimai.store.view.price.mach;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.dianping.titans.js.JsBridgeResult;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.c;
import com.facebook.yoga.d;
import com.google.gson.Gson;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.text.SizeSpec;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.price.SCPriceView;
import com.sankuai.waimai.store.view.price.bean.UnifyPrice;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.mach.component.base.a<SCPriceView> implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;
    private String b;
    private UnifyPrice c;
    private String d;
    private boolean e;

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ void a(SCPriceView sCPriceView) {
        SCPriceView sCPriceView2 = sCPriceView;
        Object[] objArr = {sCPriceView2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f679a21cb3d5378c11795d5b95ac163e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f679a21cb3d5378c11795d5b95ac163e");
            return;
        }
        super.a((a) sCPriceView2);
        a2(sCPriceView2);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final /* synthetic */ SCPriceView b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8448aae7deefb4897d3ad0ecd31e96e", RobustBitConfig.DEFAULT_VALUE) ? (SCPriceView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8448aae7deefb4897d3ad0ecd31e96e") : new SCPriceView(context);
    }

    @Override // com.sankuai.waimai.mach.component.base.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92fc5c566343548cbaa1966b671c8d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92fc5c566343548cbaa1966b671c8d33");
            return;
        }
        ac_().a((YogaMeasureFunction) this);
        this.b = a(KnbConstants.PARAMS_SCENE);
        this.d = a(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
        this.e = Boolean.parseBoolean(a("sold-out"));
        Map<String, Object> k = k();
        if (k == null) {
            return;
        }
        Gson a2 = i.a();
        this.c = (UnifyPrice) a2.fromJson(a2.toJson(k.get("unify-price")), (Class<Object>) UnifyPrice.class);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(SCPriceView sCPriceView) {
        Object[] objArr = {sCPriceView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f2ffacb874d19da36aa6381bceb9cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f2ffacb874d19da36aa6381bceb9cc");
        } else if (sCPriceView == null || this.c == null) {
            u.a((View) sCPriceView, 8);
        } else {
            sCPriceView.a(!t.a(this.b) ? Integer.parseInt(this.b) : 0, this.c, t.a(this.d) ? 0 : Integer.parseInt(this.d.replace("f", "")), this.e);
        }
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21514a6ba57fb460fadd9b30de59cf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21514a6ba57fb460fadd9b30de59cf2")).longValue();
        }
        Activity activity = this.m.getActivity();
        if (activity == null) {
            return 0L;
        }
        SCPriceView sCPriceView = new SCPriceView(activity);
        a2(sCPriceView);
        sCPriceView.measure(SizeSpec.a(f, yogaMeasureMode), SizeSpec.a(f2, yogaMeasureMode2));
        return c.a(sCPriceView.getMeasuredWidth(), sCPriceView.getMeasuredHeight());
    }
}
