package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCCoordinatorLayoutCompat extends CoordinatorLayout {
    public static ChangeQuickRedirect i;

    public static String getCid() {
        return "";
    }

    public SCCoordinatorLayoutCompat(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fbebffb25d48240b994288a13422c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fbebffb25d48240b994288a13422c3");
        }
    }

    public SCCoordinatorLayoutCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700a14b49fad103a93809eaae54434b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700a14b49fad103a93809eaae54434b6");
        }
    }

    public SCCoordinatorLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a760f67c4ec39150514f357c43ef420", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a760f67c4ec39150514f357c43ef420");
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        Object[] objArr = {view, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8628e790be6e5ad89ba0a4dd52466ce9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8628e790be6e5ad89ba0a4dd52466ce9");
            return;
        }
        super.onNestedScroll(view, i2, i3, i4, i5);
        a.d("sugoo6", "#onNestedScroll, comsumed=%d,unconsumed=%d", Integer.valueOf(i3), Integer.valueOf(i5));
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8af567858bdb64f63f35decb64f53db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8af567858bdb64f63f35decb64f53db");
        } else {
            super.onScrollChanged(i2, i3, i4, i5);
        }
    }
}
