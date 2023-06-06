package com.sankuai.waimai.store.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedCornerImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private d b;

    public RoundedCornerImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "636c0897f7605399d68e3b51e47fadda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "636c0897f7605399d68e3b51e47fadda");
            return;
        }
        this.b = new d(this);
        a(context, null, 0);
    }

    public RoundedCornerImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "747265365daa4827973dc529350a1290", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "747265365daa4827973dc529350a1290");
            return;
        }
        this.b = new d(this);
        a(context, attributeSet, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be81e5a894f755ac62d25615626e39eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be81e5a894f755ac62d25615626e39eb");
        } else {
            this.b.a(context, attributeSet, 0);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20a4556d9fb3461dce914b53bec7bc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20a4556d9fb3461dce914b53bec7bc5");
        } else if (this.b.f <= 0.0f) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size, (int) (size / this.b.f));
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c15911ae90e9dd959f2c93223b7beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c15911ae90e9dd959f2c93223b7beb");
            return;
        }
        this.b.a(canvas);
        super.draw(canvas);
        this.b.b(canvas);
    }
}
