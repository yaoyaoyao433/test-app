package com.meituan.mmp.lib.page.coverview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.mmp.lib.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CoverViewNormalContainer extends ViewBaseContainer {
    public static ChangeQuickRedirect a;

    public CoverViewNormalContainer(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81aa3d8e9c0150ba000983aaf5ee6c6b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81aa3d8e9c0150ba000983aaf5ee6c6b");
        }
    }

    public CoverViewNormalContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd964c73d632a3fdfd3a86de4a3dae7d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd964c73d632a3fdfd3a86de4a3dae7d");
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {view, Integer.valueOf(i), layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48e2df96a54ecc0762b6c5c358b519d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48e2df96a54ecc0762b6c5c358b519d7");
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdabb14ef9df9a9e98336d8914a9beff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdabb14ef9df9a9e98336d8914a9beff");
        } else {
            super.removeView(view);
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer
    public final boolean a(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0060b6de7d9c86cf091749dd202f676b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0060b6de7d9c86cf091749dd202f676b")).booleanValue() : super.a(view, jSONObject);
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer
    public final void b(View view, JSONObject jSONObject) {
        Object[] objArr = {view, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a427418a8e116a2da6f16328fc7343", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a427418a8e116a2da6f16328fc7343");
        } else {
            super.b(view, jSONObject);
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc62c62373d2f8f5d9abce194c210008", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc62c62373d2f8f5d9abce194c210008");
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // com.meituan.mmp.lib.page.coverview.ViewBaseContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d513079e4d8ac1be88fee1f4c3db001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d513079e4d8ac1be88fee1f4c3db001");
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd003424f4fb97fb17c7cdb992c4568", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd003424f4fb97fb17c7cdb992c4568")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            y.a(getContext(), getWindowToken(), 0);
        }
        return super.onTouchEvent(motionEvent);
    }
}
