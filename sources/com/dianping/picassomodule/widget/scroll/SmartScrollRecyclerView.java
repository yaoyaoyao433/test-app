package com.dianping.picassomodule.widget.scroll;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SmartScrollRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect c;
    private RecyclerView.LayoutManager a;
    private int b;
    private int d;
    private int e;
    private int f;
    private boolean g;

    public SmartScrollRecyclerView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bf92a3350aefab031166f3f5c6503e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bf92a3350aefab031166f3f5c6503e4");
        }
    }

    private SmartScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, -1);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b66e07bcf0aef01cc1dd6b652a4594ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b66e07bcf0aef01cc1dd6b652a4594ae");
        }
    }

    public SmartScrollRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f029beeb58f9127790293a70a46f4957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f029beeb58f9127790293a70a46f4957");
            return;
        }
        this.b = -1;
        this.g = false;
        this.f = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bfcfb3e18a7d1ba8ddfd2128f29aba1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bfcfb3e18a7d1ba8ddfd2128f29aba1");
            return;
        }
        super.setLayoutManager(layoutManager);
        this.a = layoutManager;
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setScrollingTouchSlop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c0cdad46f70526d4248bc850f6ea099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c0cdad46f70526d4248bc850f6ea099");
            return;
        }
        super.setScrollingTouchSlop(i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        switch (i) {
            case 0:
                this.f = viewConfiguration.getScaledTouchSlop();
                return;
            case 1:
                this.f = viewConfiguration.getScaledPagingTouchSlop();
                return;
            default:
                return;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2a6df6b49679dee9527e1fa284d095", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2a6df6b49679dee9527e1fa284d095")).booleanValue();
        }
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a4ec8bba8245e32ab3e582511ce7ea1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a4ec8bba8245e32ab3e582511ce7ea1")).booleanValue();
        }
        a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "481be48c3860fcd7066837cf8172f5ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "481be48c3860fcd7066837cf8172f5ac");
        } else if (this.a == null) {
        } else {
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.b = motionEvent.getPointerId(0);
                this.d = (int) (motionEvent.getX() + 0.5f);
                this.e = (int) (motionEvent.getY() + 0.5f);
                this.g = false;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        this.b = motionEvent.getPointerId(actionIndex);
                        this.d = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.e = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        return;
                    case 6:
                        b(motionEvent);
                        return;
                    default:
                        return;
                }
            } else if (!this.g) {
                int findPointerIndex = motionEvent.findPointerIndex(this.b);
                if (findPointerIndex < 0) {
                    return;
                }
                boolean canScrollHorizontally = this.a.canScrollHorizontally();
                boolean canScrollVertically = this.a.canScrollVertically();
                float abs = Math.abs(((int) (motionEvent.getX(findPointerIndex) + 0.5f)) - this.d);
                float abs2 = Math.abs(((int) (motionEvent.getY(findPointerIndex) + 0.5f)) - this.e);
                if ((abs * abs) + (abs2 * abs2) > this.f * this.f) {
                    if (canScrollHorizontally && abs2 > abs) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else if (canScrollVertically && abs > abs2) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    } else {
                        this.g = true;
                    }
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    private void b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14de633374fd517c07f09eb152095e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14de633374fd517c07f09eb152095e2");
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.b) {
            int i = actionIndex != 0 ? 0 : 1;
            this.b = motionEvent.getPointerId(i);
            this.d = (int) (motionEvent.getX(i) + 0.5f);
            this.e = (int) (motionEvent.getY(i) + 0.5f);
        }
    }
}
