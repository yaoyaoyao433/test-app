package com.sankuai.waimai.business.restaurant.poicontainer.machpro.nested;

import android.support.annotation.Keep;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.component.MPComponent;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.platform.widget.smoothnestedscroll.PrioritySmoothNestedScrollView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MPNestedScrollViewComponent extends MPComponent<PrioritySmoothNestedScrollView> {
    public static ChangeQuickRedirect a;
    private LinearLayout b;

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public /* synthetic */ PrioritySmoothNestedScrollView createView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74babc07a206b34a4ace39c58a0e9c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrioritySmoothNestedScrollView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74babc07a206b34a4ace39c58a0e9c5c");
        }
        PrioritySmoothNestedScrollView prioritySmoothNestedScrollView = new PrioritySmoothNestedScrollView(this.mMachContext.getContext());
        prioritySmoothNestedScrollView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        return prioritySmoothNestedScrollView;
    }

    public MPNestedScrollViewComponent(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94be79797a66d7bf980a29513a790e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94be79797a66d7bf980a29513a790e4");
        }
    }

    @Override // com.sankuai.waimai.machpro.component.MPComponent
    public void onAppendChild(MPComponent mPComponent, MPComponent mPComponent2) {
        Object[] objArr = {mPComponent, mPComponent2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97372093411a8472c214fb456368f02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97372093411a8472c214fb456368f02");
            return;
        }
        super.onAppendChild(mPComponent, mPComponent2);
        if (this.b == null) {
            this.b = new LinearLayout(this.mMachContext.getContext());
            this.b.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            ((PrioritySmoothNestedScrollView) this.mView).addView(this.b);
        }
        this.b.addView(mPComponent.getView());
    }

    @JSMethod(methodName = "backToTop")
    @Keep
    public void backToTop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0739ba03385ce32fbc0cf3a471bc8ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0739ba03385ce32fbc0cf3a471bc8ef7");
        } else {
            getView().scrollTo(0, 0);
        }
    }
}
