package com.sankuai.waimai.business.restaurant.poicontainer.comment.widget;

import android.content.Context;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.view.RooFlowLayout;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiTagGroup extends FrameLayout {
    public static ChangeQuickRedirect a;
    public final RooFlowLayout b;
    private final HorizontalScrollView c;

    public PoiTagGroup(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c402be7aaba0ca7d5d58cabedfb3be12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c402be7aaba0ca7d5d58cabedfb3be12");
        }
    }

    private PoiTagGroup(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6de372b71ab810a760fc37286b4a6998", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6de372b71ab810a760fc37286b4a6998");
        }
    }

    public PoiTagGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b813c1bb9eaa97c8c75747f5aefaf49c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b813c1bb9eaa97c8c75747f5aefaf49c");
            return;
        }
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.wm_comment_poi_layout_ceiling_tags, (ViewGroup) this, true);
        this.c = (HorizontalScrollView) inflate.findViewById(R.id.scroll_view);
        this.b = (RooFlowLayout) inflate.findViewById(R.id.tag_container);
        this.b.setSingleLine(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f500280652a0bdf48bfa73322cf587d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f500280652a0bdf48bfa73322cf587d4");
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931eab170c7f0a71457a641411a1b602", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931eab170c7f0a71457a641411a1b602");
        } else if (view != null) {
            this.b.addView(view);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ade991eaf80698e523a3713f3813651c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ade991eaf80698e523a3713f3813651c");
            return;
        }
        for (int i = 0; i < this.b.getChildCount(); i++) {
            View childAt = this.b.getChildAt(i);
            if (childAt != null) {
                childAt.setSelected(false);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d0133210337867cf8f9286c6c4a1b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d0133210337867cf8f9286c6c4a1b7c");
            return;
        }
        View view = null;
        int i = 0;
        while (true) {
            if (i >= this.b.getChildCount()) {
                break;
            }
            View childAt = this.b.getChildAt(i);
            if (childAt.isSelected()) {
                view = childAt;
                break;
            }
            i++;
        }
        if (view == null) {
            return;
        }
        this.c.smoothScrollTo(((int) view.getX()) - ((this.c.getWidth() - view.getWidth()) / 2), 0);
    }
}
