package com.dianping.picasso.view;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.dianping.picasso.PicassoCanvasClipper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PicassoGroupView extends FrameLayout implements PicassoCanvasClipper.Clippable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PicassoCanvasClipper picassoCanvasClipper;

    public PicassoGroupView(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80270ff6be10a48b516b2dd93a20b113", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80270ff6be10a48b516b2dd93a20b113");
        }
    }

    public PicassoGroupView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ff329c7291fba4347ad7d0e36c79383", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ff329c7291fba4347ad7d0e36c79383");
        }
    }

    public PicassoGroupView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84a82ef73c5998f2bfcd8986854d30d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84a82ef73c5998f2bfcd8986854d30d0");
        } else {
            this.picassoCanvasClipper = new PicassoCanvasClipper();
        }
    }

    public PicassoCanvasClipper getPicassoCanvasClipper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29505a8cb9ff6904b800a698751e4901", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoCanvasClipper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29505a8cb9ff6904b800a698751e4901");
        }
        if (this.picassoCanvasClipper == null) {
            this.picassoCanvasClipper = new PicassoCanvasClipper();
        }
        return this.picassoCanvasClipper;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6b268cbdb349042c4b2a975059b36af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6b268cbdb349042c4b2a975059b36af");
            return;
        }
        super.onDraw(canvas);
        if (this.picassoCanvasClipper != null) {
            this.picassoCanvasClipper.drawShadow(canvas, this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        Object[] objArr = {canvas, view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2f9d1e1e4dda0589ecc1d1cc494bc2d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2f9d1e1e4dda0589ecc1d1cc494bc2d0")).booleanValue();
        }
        if (this.picassoCanvasClipper != null) {
            this.picassoCanvasClipper.clip(canvas, this);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // com.dianping.picasso.PicassoCanvasClipper.Clippable
    @NonNull
    public PicassoCanvasClipper getClipper() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40365ae8c7c15b55f5272c447ca7edf6", RobustBitConfig.DEFAULT_VALUE)) {
            return (PicassoCanvasClipper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40365ae8c7c15b55f5272c447ca7edf6");
        }
        if (this.picassoCanvasClipper == null) {
            this.picassoCanvasClipper = new PicassoCanvasClipper();
        }
        return this.picassoCanvasClipper;
    }
}
