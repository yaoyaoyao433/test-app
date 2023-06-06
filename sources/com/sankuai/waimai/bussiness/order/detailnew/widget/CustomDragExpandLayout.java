package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CustomDragExpandLayout extends BaseDragExpandLayout implements com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
    public final void a(boolean z) {
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
    public final void a(boolean z, String str) {
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout
    public View getHeaderView() {
        return null;
    }

    public CustomDragExpandLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "426a79202b8ecbb4a80d2ed73aefc631", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "426a79202b8ecbb4a80d2ed73aefc631");
        } else {
            c();
        }
    }

    public CustomDragExpandLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321c16a1a22b60f55c8353f7a860a3e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321c16a1a22b60f55c8353f7a860a3e3");
        } else {
            c();
        }
    }

    public CustomDragExpandLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61757aa93b0d33e94a961ea70aad58e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61757aa93b0d33e94a961ea70aad58e");
        } else {
            c();
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e92cff836db7fc7690f2241f3096cf1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e92cff836db7fc7690f2241f3096cf1a");
        } else {
            setExpandStatusChangeListener(this);
        }
    }

    public final boolean a() {
        return this.d == b.a.Expanded;
    }

    public final boolean b() {
        return this.d == b.a.Normal;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4d6d986cebab72425d002ef2994c72", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4d6d986cebab72425d002ef2994c72")).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }
}
