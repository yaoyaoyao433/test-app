package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {
    protected final VisibilityAnimListener a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected int e;
    protected ViewPropertyAnimatorCompat f;
    private boolean g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.b = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.height, R.attr.title, R.attr.navigationMode, R.attr.displayOptions, R.attr.subtitle, R.attr.titleTextStyle, R.attr.subtitleTextStyle, R.attr.icon, R.attr.logo, R.attr.divider, R.attr.backgroundStacked, R.attr.backgroundSplit, R.attr.customNavigationLayout, R.attr.homeLayout, R.attr.progressBarStyle, R.attr.indeterminateProgressStyle, R.attr.progressBarPadding, R.attr.itemPadding, R.attr.hideOnContentScroll, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.elevation, R.attr.popupTheme, R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(1, 0));
        obtainStyledAttributes.recycle();
        if (this.d != null) {
            this.d.a(configuration);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    public int getContentHeight() {
        return this.e;
    }

    public int getAnimatedVisibility() {
        if (this.f != null) {
            return this.a.a;
        }
        return getVisibility();
    }

    public ViewPropertyAnimatorCompat a(int i, long j) {
        if (this.f != null) {
            this.f.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimatorCompat alpha = ViewCompat.animate(this).alpha(1.0f);
            alpha.setDuration(j);
            alpha.setListener(this.a.a(alpha, i));
            return alpha;
        }
        ViewPropertyAnimatorCompat alpha2 = ViewCompat.animate(this).alpha(0.0f);
        alpha2.setDuration(j);
        alpha2.setListener(this.a.a(alpha2, i));
        return alpha2;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f != null) {
                this.f.cancel();
            }
            super.setVisibility(i);
        }
    }

    public boolean a() {
        if (this.d != null) {
            return this.d.d();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        int a;
        private boolean c = false;

        protected VisibilityAnimListener() {
        }

        public final VisibilityAnimListener a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, int i) {
            AbsActionBarView.this.f = viewPropertyAnimatorCompat;
            this.a = i;
            return this;
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationStart(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.c = false;
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(View view) {
            if (this.c) {
                return;
            }
            AbsActionBarView.this.f = null;
            AbsActionBarView.super.setVisibility(this.a);
        }

        @Override // android.support.v4.view.ViewPropertyAnimatorListener
        public void onAnimationCancel(View view) {
            this.c = true;
        }
    }
}
