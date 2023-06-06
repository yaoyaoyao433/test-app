package com.meituan.android.mrn.component.shadowview;

import android.view.View;
import com.facebook.common.logging.a;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.f;
import com.facebook.yoga.b;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNShadowViewManager extends ViewGroupManager<MRNShadowView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNShadowView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MRNShadowView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "561ef032a379f6b7fabcdc13b93f0abc", RobustBitConfig.DEFAULT_VALUE)) {
            return (MRNShadowView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "561ef032a379f6b7fabcdc13b93f0abc");
        }
        MRNShadowView mRNShadowView = new MRNShadowView(aoVar);
        mRNShadowView.addView(new f(aoVar));
        return mRNShadowView;
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "shadowColor")
    public void setShadowColor(MRNShadowView mRNShadowView, int i) {
        Object[] objArr = {mRNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36e3c86d87b082453d860d71dd00bf41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36e3c86d87b082453d860d71dd00bf41");
        } else {
            mRNShadowView.setShadowColor(i);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowRadius")
    public void setShadowRadius(MRNShadowView mRNShadowView, float f) {
        Object[] objArr = {mRNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "818519e9a73208e588bbcc1cd0d1f9e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "818519e9a73208e588bbcc1cd0d1f9e8");
        } else {
            mRNShadowView.setShadowRadius(w.a(f));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowOffsetX")
    public void setShadowOffsetX(MRNShadowView mRNShadowView, float f) {
        Object[] objArr = {mRNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bb3a4f805bb681fbe24657820355424", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bb3a4f805bb681fbe24657820355424");
        } else {
            mRNShadowView.setShadowOffsetX(w.a(f));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowOffsetY")
    public void setShadowOffsetY(MRNShadowView mRNShadowView, float f) {
        Object[] objArr = {mRNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f6da1faa18e964e17130b0cd1f535f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f6da1faa18e964e17130b0cd1f535f0");
        } else {
            mRNShadowView.setShadowOffsetY(w.a(f));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(MRNShadowView mRNShadowView, int i, float f) {
        float f2 = f;
        Object[] objArr = {mRNShadowView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a1ec02f5d645aa02ccc73cce9b7273", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a1ec02f5d645aa02ccc73cce9b7273");
            return;
        }
        getName();
        StringBuilder sb = new StringBuilder("setBorderRadius() called with: view = [");
        sb.append(mRNShadowView);
        sb.append("], index = [");
        sb.append(i);
        sb.append("], borderRadius = [");
        sb.append(f2);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (!b.a(f) && f2 < 0.0f) {
            f2 = Float.NaN;
        }
        if (!b.a(f2)) {
            f2 = w.a(f2);
        }
        float f3 = f2;
        if (i == 0) {
            mRNShadowView.setBorderRadius(f3);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(f3), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = MRNShadowView.a;
        if (PatchProxy.isSupport(objArr2, mRNShadowView, changeQuickRedirect3, false, "0504c4c3324348541e04dc6bf91c2bac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, mRNShadowView, changeQuickRedirect3, false, "0504c4c3324348541e04dc6bf91c2bac");
            return;
        }
        if (i2 == 0) {
            mRNShadowView.b = f3;
        } else if (i2 == 1) {
            mRNShadowView.c = f3;
        } else if (i2 == 2) {
            mRNShadowView.e = f3;
        } else if (i2 == 3) {
            mRNShadowView.d = f3;
        }
        mRNShadowView.a();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(MRNShadowView mRNShadowView, int i) {
        Object[] objArr = {mRNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "992e15e9c5e85cb8253815a174ffc725", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "992e15e9c5e85cb8253815a174ffc725");
        }
        View childAt = mRNShadowView.getChildAt(0);
        if (childAt instanceof f) {
            return ((f) childAt).getChildAt(i);
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(MRNShadowView mRNShadowView) {
        Object[] objArr = {mRNShadowView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17946085f5a4f94c7624ab4d0e819727", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17946085f5a4f94c7624ab4d0e819727")).intValue();
        }
        View childAt = mRNShadowView.getChildAt(0);
        if (childAt instanceof f) {
            return ((f) childAt).getChildCount();
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MRNShadowView mRNShadowView, View view, int i) {
        Object[] objArr = {mRNShadowView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "200c25f7321566f5e72c7ac035f74239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "200c25f7321566f5e72c7ac035f74239");
            return;
        }
        View childAt = mRNShadowView.getChildAt(0);
        if (childAt instanceof f) {
            try {
                ((f) childAt).addView(view, i);
            } catch (IndexOutOfBoundsException e) {
                ((f) childAt).addView(view, -1);
                a.d("[MRNShadowViewManager@addView]", null, e);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(MRNShadowView mRNShadowView, int i) {
        Object[] objArr = {mRNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebdf170cf5642add96f4352503af0324", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebdf170cf5642add96f4352503af0324");
            return;
        }
        View childAt = mRNShadowView.getChildAt(0);
        if (childAt instanceof f) {
            ((f) childAt).removeViewAt(i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(MRNShadowView mRNShadowView) {
        Object[] objArr = {mRNShadowView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f78cf313755923a874e406f1d7f1b36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f78cf313755923a874e406f1d7f1b36");
            return;
        }
        View childAt = mRNShadowView.getChildAt(0);
        if (childAt instanceof f) {
            ((f) childAt).removeAllViews();
        }
    }
}
