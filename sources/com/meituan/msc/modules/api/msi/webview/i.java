package com.meituan.msc.modules.api.msi.webview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.R;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import com.meituan.msc.common.utils.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends View {
    public static ChangeQuickRedirect a;
    int b;
    private Context c;
    private int d;
    private int e;
    private Paint f;
    private int g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public static /* synthetic */ int a(i iVar, int i) {
        iVar.b = 0;
        return 0;
    }

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65aedef13fbc7d16ed229e789c99b68c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65aedef13fbc7d16ed229e789c99b68c");
            return;
        }
        this.c = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.WebViewProgress, R.attr.WebViewProgressHeight, R.attr.WebViewProgressColor});
        this.b = obtainStyledAttributes.getInt(0, 0);
        this.e = obtainStyledAttributes.getInt(1, ar.a(4.0f));
        this.g = obtainStyledAttributes.getColor(2, getResources().getColor(R.color.msc_yellow));
        obtainStyledAttributes.recycle();
        this.f = new Paint();
        this.f.setColor(this.g);
        setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cb54acedeb7b68a70996569264a46f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cb54acedeb7b68a70996569264a46f0");
            return;
        }
        super.onMeasure(i, i2);
        this.d = View.MeasureSpec.getSize(i);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6f41c0e2b0bd11ec9fb2e39db9bb24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6f41c0e2b0bd11ec9fb2e39db9bb24");
            return;
        }
        super.onDraw(canvas);
        canvas.drawRect(0.0f, 0.0f, this.d * (this.b / 100.0f), this.e, this.f);
    }

    public final void setNormalProgress(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99db9737082289f9b3e56bc240d6efd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99db9737082289f9b3e56bc240d6efd5");
            return;
        }
        this.b = i;
        postInvalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimationSet getDismissAnim() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b742f1950ea122d62af8a2b1b315c849", RobustBitConfig.DEFAULT_VALUE)) {
            return (AnimationSet) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b742f1950ea122d62af8a2b1b315c849");
        }
        AnimationSet animationSet = new AnimationSet(this.c, null);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public final int getCurProgress() {
        return this.b;
    }
}
