package com.meituan.mmp.lib.page.coverview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FixedViewContainer extends ViewBaseContainer {
    public static ChangeQuickRedirect a;

    public FixedViewContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75f5a2a8c888dd24723313b081e08b13", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75f5a2a8c888dd24723313b081e08b13");
        }
    }

    public FixedViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e13e795a475f5b26d48e857e7a6a07f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e13e795a475f5b26d48e857e7a6a07f8");
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f1b181d8958f12f80dec8c633bdbdc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f1b181d8958f12f80dec8c633bdbdc1");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer
    public final void b(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64e235ec6cc8dc7fcb131c37bcedca4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64e235ec6cc8dc7fcb131c37bcedca4");
        } else {
            super.b(view, jSONObject);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4dfd37125387c55ccc55769b4d861fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4dfd37125387c55ccc55769b4d861fe");
        } else {
            super.updateViewLayout(view, layoutParams);
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer
    public final boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d5d8d937de879d9acf609deb3295a85", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d5d8d937de879d9acf609deb3295a85")).booleanValue() : super.a(view, jSONObject);
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff07c88cb1e88f7ab43b8b25b897730e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff07c88cb1e88f7ab43b8b25b897730e");
        } else {
            super.removeView(view);
        }
    }
}
