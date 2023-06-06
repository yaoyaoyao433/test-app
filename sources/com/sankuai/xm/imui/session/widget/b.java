package com.sankuai.xm.imui.session.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.adapter.IBannerAdapter;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.imui.common.widget.a<com.sankuai.xm.imui.session.entity.b> {
    public static ChangeQuickRedirect c;
    IBannerAdapter i;

    @Override // com.sankuai.xm.imui.common.widget.b
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View onCreateView;
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1508c0e661c64f17fc9f6774d5ccdf8", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1508c0e661c64f17fc9f6774d5ccdf8");
        }
        RelativeLayout relativeLayout = new RelativeLayout(layoutInflater.getContext());
        if (this.i != null && (onCreateView = this.i.onCreateView(layoutInflater, relativeLayout)) != null) {
            relativeLayout.addView(onCreateView);
        }
        return relativeLayout;
    }

    @Override // com.sankuai.xm.imui.common.widget.b
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "405e46533cb686ffe474ce7bcb8a72a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "405e46533cb686ffe474ce7bcb8a72a6");
            return;
        }
        if (this.i != null) {
            this.i.onDestroy();
        }
        super.f();
    }
}
