package com.dianping.voyager.widgets.container.secondfloor;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.dianping.shield.component.utils.AnimationsContainer;
import com.dianping.shield.component.widgets.internal.GCLoadingView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class b extends LinearLayout {
    public static ChangeQuickRedirect b;
    private int a;
    public int c;
    public boolean d;
    public GCLoadingView.OnRefreshCompleteListener e;
    AnimationsContainer f;
    AnimationsContainer.FramesSequenceAnimation g;
    private int h;
    private a i;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
    }

    public abstract void a();

    public abstract void a(float f);

    public void a(boolean z) {
    }

    public abstract int getDefaultDrawableResId();

    public abstract int getVisiableHeight();

    public void setLoadingDrawable(Drawable drawable) {
    }

    public abstract void setState(int i);

    public abstract void setVisiableHeight(int i);

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e4af4ebb50cd518bfea7759bd6b2489", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e4af4ebb50cd518bfea7759bd6b2489");
            return;
        }
        this.c = 0;
        this.d = true;
    }

    public void setInitHeight(int i) {
        this.h = i;
    }

    public int getInitHeight() {
        return this.h;
    }

    public int getRefreshHeight() {
        return this.a;
    }

    public void setRefreshHeight(int i) {
        this.a = i;
    }

    public void setRefreshCompleteListener(GCLoadingView.OnRefreshCompleteListener onRefreshCompleteListener) {
        this.e = onRefreshCompleteListener;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cbe2b2288e50fa8b194aee8841b2f57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cbe2b2288e50fa8b194aee8841b2f57");
        } else if (this.g != null) {
            this.g.stop();
        }
    }

    public void setHeaderViewOnTouchEvent(a aVar) {
        this.i = aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608ba94ce759b15323fc140c8de8a4a4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608ba94ce759b15323fc140c8de8a4a4")).booleanValue() : super.onTouchEvent(motionEvent);
    }
}
