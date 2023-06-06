package com.sankuai.xm.imui.base;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.im.session.SessionId;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PageSpeedLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    public String b;
    public SessionId c;
    private boolean d;

    public PageSpeedLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db67f004778c4f960c0c5637c412b1ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db67f004778c4f960c0c5637c412b1ed");
        }
    }

    public PageSpeedLinearLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc95f5ddfb0589dd1499612f610fc9c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc95f5ddfb0589dd1499612f610fc9c8");
        }
    }

    public PageSpeedLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa7f3543002726b8b566d98cf3f91e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa7f3543002726b8b566d98cf3f91e1");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "902802edac8b628ab738c596b26a3c1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "902802edac8b628ab738c596b26a3c1c");
            return;
        }
        super.dispatchDraw(canvas);
        if (this.d) {
            return;
        }
        this.d = true;
        if (this.c == null || ac.a(this.b)) {
            return;
        }
        com.sankuai.xm.imui.common.report.b.a(this.b, this.c, false);
    }
}
