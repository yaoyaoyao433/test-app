package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedCornerLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private b b;

    public RoundedCornerLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09cff82f03fcd8b1da04fc22571cf150", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09cff82f03fcd8b1da04fc22571cf150");
            return;
        }
        this.b = new b(this);
        a(context, null, 0);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fdcb695b65951f7030c1c3755e9a53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fdcb695b65951f7030c1c3755e9a53");
            return;
        }
        this.b = new b(this);
        a(context, attributeSet, 0);
    }

    public RoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba6bdb327efd28ea7fa64c47e9f5593", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba6bdb327efd28ea7fa64c47e9f5593");
            return;
        }
        this.b = new b(this);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4b270a6abce5cd60e51a0b3609404c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4b270a6abce5cd60e51a0b3609404c0");
        } else {
            this.b.a(context, attributeSet, i);
        }
    }

    public b getDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7228e7ba10263f4a85b17a49b8c7b878", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7228e7ba10263f4a85b17a49b8c7b878");
            return;
        }
        this.b.a(canvas);
        super.draw(canvas);
        this.b.b(canvas);
    }
}
