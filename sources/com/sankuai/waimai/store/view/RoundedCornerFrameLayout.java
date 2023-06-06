package com.sankuai.waimai.store.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedCornerFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private d b;

    public RoundedCornerFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "368ec82e1942bba39f6b854498c9d58b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "368ec82e1942bba39f6b854498c9d58b");
            return;
        }
        this.b = new d(this);
        a(context, null, 0);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42e844bc9fee27c9e7686eac5abe6a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42e844bc9fee27c9e7686eac5abe6a2");
            return;
        }
        this.b = new d(this);
        a(context, attributeSet, 0);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849a4072f04da668b2a64b092706b114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849a4072f04da668b2a64b092706b114");
            return;
        }
        this.b = new d(this);
        a(context, attributeSet, i);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a8322b5d74fd391ca7ee03a6a1e427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a8322b5d74fd391ca7ee03a6a1e427");
        } else {
            this.b.a(context, attributeSet, i);
        }
    }

    public d getDelegate() {
        return this.b;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9edd5681cdb6675b58908fc682745168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9edd5681cdb6675b58908fc682745168");
            return;
        }
        this.b.a(canvas);
        super.draw(canvas);
        this.b.b(canvas);
    }
}
