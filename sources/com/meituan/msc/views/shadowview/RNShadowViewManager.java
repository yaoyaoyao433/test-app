package com.meituan.msc.views.shadowview;

import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.msc.yoga.f;
import com.meituan.android.recce.props.gens.BorderBottomLeftRadius;
import com.meituan.android.recce.props.gens.BorderBottomRightRadius;
import com.meituan.android.recce.props.gens.BorderRadius;
import com.meituan.android.recce.props.gens.BorderTopLeftRadius;
import com.meituan.android.recce.props.gens.BorderTopRightRadius;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.uimanager.RNViewGroupManager;
import com.meituan.msc.uimanager.ThemedReactContext;
import com.meituan.msc.uimanager.annotations.ReactProp;
import com.meituan.msc.uimanager.annotations.ReactPropGroup;
import com.meituan.msc.uimanager.s;
import com.meituan.msc.views.view.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RNShadowViewManager extends RNViewGroupManager<RNShadowView> {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.msc.uimanager.as
    public final String a() {
        return "MRNShadowView";
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ View a(ViewGroup viewGroup, int i) {
        RNShadowView rNShadowView = (RNShadowView) viewGroup;
        Object[] objArr = {rNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560e5de3464b99e73ffab07b4b2d8279", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560e5de3464b99e73ffab07b4b2d8279");
        }
        View childAt = rNShadowView.getChildAt(0);
        if (childAt instanceof b) {
            return ((b) childAt).getChildAt(i);
        }
        return null;
    }

    @Override // com.meituan.msc.uimanager.as
    public final /* synthetic */ View a(ThemedReactContext themedReactContext) {
        Object[] objArr = {themedReactContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e9d1243b39aca3ed4618587fe73a92", RobustBitConfig.DEFAULT_VALUE)) {
            return (RNShadowView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e9d1243b39aca3ed4618587fe73a92");
        }
        RNShadowView rNShadowView = new RNShadowView(themedReactContext);
        rNShadowView.addView(new b(themedReactContext));
        return rNShadowView;
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void a(ViewGroup viewGroup, View view, int i) {
        RNShadowView rNShadowView = (RNShadowView) viewGroup;
        Object[] objArr = {rNShadowView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d22d245b4c234dec8fe9f19c74a05ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d22d245b4c234dec8fe9f19c74a05ac7");
            return;
        }
        View childAt = rNShadowView.getChildAt(0);
        if (childAt instanceof b) {
            try {
                ((b) childAt).addView(view, i);
            } catch (IndexOutOfBoundsException e) {
                ((b) childAt).addView(view, -1);
                g.b("[MSCShadowViewManager@addView]", null, e);
            }
        }
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ int b(ViewGroup viewGroup) {
        RNShadowView rNShadowView = (RNShadowView) viewGroup;
        Object[] objArr = {rNShadowView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0ee3935cbc914e306285d6c0382ff8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0ee3935cbc914e306285d6c0382ff8")).intValue();
        }
        View childAt = rNShadowView.getChildAt(0);
        if (childAt instanceof b) {
            return ((b) childAt).getChildCount();
        }
        return 0;
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void b(ViewGroup viewGroup, int i) {
        RNShadowView rNShadowView = (RNShadowView) viewGroup;
        Object[] objArr = {rNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b13d479bf9339a7ac5a66ff32ed60c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b13d479bf9339a7ac5a66ff32ed60c32");
            return;
        }
        View childAt = rNShadowView.getChildAt(0);
        if (childAt instanceof b) {
            ((b) childAt).removeViewAt(i);
        }
    }

    @Override // com.meituan.msc.uimanager.RNViewGroupManager, com.meituan.msc.uimanager.e
    public final /* synthetic */ void c(ViewGroup viewGroup) {
        RNShadowView rNShadowView = (RNShadowView) viewGroup;
        Object[] objArr = {rNShadowView};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fdd563e18f6fbaaa02de850bddf28fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fdd563e18f6fbaaa02de850bddf28fd");
            return;
        }
        View childAt = rNShadowView.getChildAt(0);
        if (childAt instanceof b) {
            ((b) childAt).removeAllViews();
        }
    }

    @ReactProp(customType = "Color", defaultInt = 0, name = "shadowColor")
    public void setShadowColor(RNShadowView rNShadowView, int i) {
        Object[] objArr = {rNShadowView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1512c2b9e0219e7e62994876c1bfe9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1512c2b9e0219e7e62994876c1bfe9");
        } else {
            rNShadowView.setShadowColor(i);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowRadius")
    public void setShadowRadius(RNShadowView rNShadowView, float f) {
        Object[] objArr = {rNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64eb7f82d082db0689fa3c2b0a96c7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64eb7f82d082db0689fa3c2b0a96c7f");
        } else {
            rNShadowView.setShadowRadius(s.a(f));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowOffsetX")
    public void setShadowOffsetX(RNShadowView rNShadowView, float f) {
        Object[] objArr = {rNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5301f4c51ef7fd40d0a5f3d17fa6e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5301f4c51ef7fd40d0a5f3d17fa6e1");
        } else {
            rNShadowView.setShadowOffsetX(s.a(f));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "shadowOffsetY")
    public void setShadowOffsetY(RNShadowView rNShadowView, float f) {
        Object[] objArr = {rNShadowView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b5fba742c37a23431d7f400fee9b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b5fba742c37a23431d7f400fee9b25");
        } else {
            rNShadowView.setShadowOffsetY(s.a(f));
        }
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {BorderRadius.LOWER_CASE_NAME, BorderTopLeftRadius.LOWER_CASE_NAME, BorderTopRightRadius.LOWER_CASE_NAME, BorderBottomRightRadius.LOWER_CASE_NAME, BorderBottomLeftRadius.LOWER_CASE_NAME})
    public void setBorderRadius(RNShadowView rNShadowView, int i, float f) {
        float f2 = f;
        Object[] objArr = {rNShadowView, Integer.valueOf(i), Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7cb5c493c0d377479979818d7d365847", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7cb5c493c0d377479979818d7d365847");
            return;
        }
        StringBuilder sb = new StringBuilder("setBorderRadius() called with: view = [");
        sb.append(rNShadowView);
        sb.append("], index = [");
        sb.append(i);
        sb.append("], borderRadius = [");
        sb.append(f2);
        sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
        if (!f.a(f) && f2 < 0.0f) {
            f2 = Float.NaN;
        }
        if (!f.a(f2)) {
            f2 = s.a(f2);
        }
        float f3 = f2;
        if (i == 0) {
            rNShadowView.setBorderRadius(f3);
            return;
        }
        int i2 = i - 1;
        Object[] objArr2 = {Float.valueOf(f3), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = RNShadowView.a;
        if (PatchProxy.isSupport(objArr2, rNShadowView, changeQuickRedirect2, false, "9efe4e3a6cf5c1b7f148c0d95ea06e0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, rNShadowView, changeQuickRedirect2, false, "9efe4e3a6cf5c1b7f148c0d95ea06e0d");
            return;
        }
        if (i2 == 0) {
            rNShadowView.b = f3;
        } else if (i2 == 1) {
            rNShadowView.c = f3;
        } else if (i2 == 2) {
            rNShadowView.e = f3;
        } else if (i2 == 3) {
            rNShadowView.d = f3;
        }
        rNShadowView.a();
    }
}
