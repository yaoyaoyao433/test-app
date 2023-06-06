package com.sankuai.waimai.business.search.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HorizontalSrollViewEx extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(HorizontalScrollView horizontalScrollView, int i, int i2, int i3, int i4);
    }

    public HorizontalSrollViewEx(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d3ed0b0bbebd0735d90a44fdacd5a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d3ed0b0bbebd0735d90a44fdacd5a0");
        } else {
            this.b = null;
        }
    }

    public HorizontalSrollViewEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22c11c0fe6e13fe9eff5af324dc5bad4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22c11c0fe6e13fe9eff5af324dc5bad4");
        } else {
            this.b = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "709e01d785f2892fc5642475622efea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "709e01d785f2892fc5642475622efea7");
            return;
        }
        super.onFinishInflate();
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOverScrollMode(2);
    }

    public void setScrollViewListener(a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06b2ea3d3addb324ccf73fc54172da78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06b2ea3d3addb324ccf73fc54172da78");
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
        if (this.b != null) {
            this.b.a(this, i, i2, i3, i4);
        }
    }
}
