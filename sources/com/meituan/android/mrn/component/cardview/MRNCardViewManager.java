package com.meituan.android.mrn.component.cardview;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.uimanager.w;
import com.facebook.react.views.view.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNCardViewManager extends ViewGroupManager<MRNCardView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "MRNCardView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public MRNCardView createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bc6524376b034aaa569fa897884db63", RobustBitConfig.DEFAULT_VALUE)) {
            return (MRNCardView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bc6524376b034aaa569fa897884db63");
        }
        MRNCardView mRNCardView = new MRNCardView(aoVar);
        mRNCardView.addView(new f(aoVar));
        return mRNCardView;
    }

    @ReactProp(defaultFloat = 0.0f, name = "cornerRadius")
    public void setCornerRadius(MRNCardView mRNCardView, float f) {
        Object[] objArr = {mRNCardView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "474135470471a64ae21bd676d7ebdbba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "474135470471a64ae21bd676d7ebdbba");
        } else {
            mRNCardView.setRnCornerRadius(w.a(f));
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "cardElevation")
    public void setCardElevation(MRNCardView mRNCardView, float f) {
        Object[] objArr = {mRNCardView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e170ac13cb9e2e4d89deebbb959fa47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e170ac13cb9e2e4d89deebbb959fa47");
        } else {
            mRNCardView.setRnElevation(f);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "cardMaxElevation")
    public void setCardMaxElevation(MRNCardView mRNCardView, float f) {
        Object[] objArr = {mRNCardView, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5bdc52575a3a80bab95a19664f4d57d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5bdc52575a3a80bab95a19664f4d57d");
        } else {
            mRNCardView.setRnMaxElevation(f);
        }
    }

    @ReactProp(name = "cornerOverlap")
    public void setPreventCornerOverlap(MRNCardView mRNCardView, boolean z) {
        Object[] objArr = {mRNCardView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bee2dc3f07d8424f28a0f2d412d2698", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bee2dc3f07d8424f28a0f2d412d2698");
        } else {
            mRNCardView.setPreventCornerOverlap(z);
        }
    }

    @ReactProp(name = "useCompatPadding")
    public void setUseCompatPadding(MRNCardView mRNCardView, boolean z) {
        Object[] objArr = {mRNCardView, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e0cc00a31faaf67543ac6997653266a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e0cc00a31faaf67543ac6997653266a");
        } else {
            mRNCardView.setUseCompatPadding(z);
        }
    }

    @ReactProp(name = "backgroundColor")
    public void setCardBackgroundColor(MRNCardView mRNCardView, int i) {
        Object[] objArr = {mRNCardView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9f2177aa1ae3032b40033e9e5b0cea0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9f2177aa1ae3032b40033e9e5b0cea0");
        } else {
            mRNCardView.setRnBackgroundColor(i);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(MRNCardView mRNCardView, int i) {
        Object[] objArr = {mRNCardView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1bda51a9b4393ab317946ebcb7961b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1bda51a9b4393ab317946ebcb7961b3");
        }
        View childAt = mRNCardView.getChildAt(0);
        if (childAt == null || !(childAt instanceof f)) {
            return null;
        }
        return ((f) childAt).getChildAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(MRNCardView mRNCardView) {
        Object[] objArr = {mRNCardView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3bb8d7ec1508645e9c5eb4b9a5f6a1ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3bb8d7ec1508645e9c5eb4b9a5f6a1ba")).intValue();
        }
        View childAt = mRNCardView.getChildAt(0);
        if (childAt == null || !(childAt instanceof f)) {
            return 0;
        }
        return ((f) childAt).getChildCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(MRNCardView mRNCardView, View view, int i) {
        Object[] objArr = {mRNCardView, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b72639058281d7d8a33ce723bd55e81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b72639058281d7d8a33ce723bd55e81");
            return;
        }
        View childAt = mRNCardView.getChildAt(0);
        if (childAt == null || !(childAt instanceof f)) {
            return;
        }
        ((f) childAt).addView(view, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(MRNCardView mRNCardView, int i) {
        Object[] objArr = {mRNCardView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194e5aa0cc39925a4e8342c95be4e729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194e5aa0cc39925a4e8342c95be4e729");
            return;
        }
        View childAt = mRNCardView.getChildAt(0);
        if (childAt == null || !(childAt instanceof f)) {
            return;
        }
        ((f) childAt).removeViewAt(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(MRNCardView mRNCardView) {
        Object[] objArr = {mRNCardView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40a5be801106dc0495ddffc86fc7f420", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40a5be801106dc0495ddffc86fc7f420");
            return;
        }
        View childAt = mRNCardView.getChildAt(0);
        if (childAt == null || !(childAt instanceof f)) {
            return;
        }
        ((f) childAt).removeAllViews();
    }
}
