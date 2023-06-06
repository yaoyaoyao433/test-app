package com.meituan.android.mrn.component.cardview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import com.facebook.react.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MRNCardView extends CardView {
    public static ChangeQuickRedirect e;

    public MRNCardView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f917c17f6e0b50ce8066d99eae619535", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f917c17f6e0b50ce8066d99eae619535");
        }
    }

    public MRNCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "208bfe5c607ae0496faf8d5db0149a9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "208bfe5c607ae0496faf8d5db0149a9c");
        }
    }

    public void setRnCornerRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95f90751293a38b5584378f78efbde49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95f90751293a38b5584378f78efbde49");
        } else {
            setRadius(f);
        }
    }

    public void setRnElevation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e7d59a56004e72a5db25f9de77f3b39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e7d59a56004e72a5db25f9de77f3b39");
        } else {
            setCardElevation(w.a(f));
        }
    }

    public void setRnMaxElevation(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc9e8ec1f470a1af24bd4665c2c1f04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc9e8ec1f470a1af24bd4665c2c1f04");
        } else {
            setMaxCardElevation(w.a(f));
        }
    }

    public void setRnBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b305ef292ad655bf8b7b45f7af925f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b305ef292ad655bf8b7b45f7af925f");
        } else {
            setCardBackgroundColor(i);
        }
    }
}
