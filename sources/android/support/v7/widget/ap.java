package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ap extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator k = new DecelerateInterpolator();
    Runnable a;
    LinearLayoutCompat b;
    int c;
    int d;
    int e;
    protected ViewPropertyAnimator f;
    protected final c g;
    private Spinner h;
    private boolean i;
    private int j;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public ap(Context context) {
        super(context);
        this.g = new c();
        setHorizontalScrollBarEnabled(false);
        android.support.v7.view.a a2 = android.support.v7.view.a.a(context);
        setContentHeight(a2.c());
        this.d = a2.e();
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.b = linearLayoutCompat;
        addView(this.b, new ViewGroup.LayoutParams(-2, -1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.b.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.c = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.c = View.MeasureSpec.getSize(i) / 2;
            }
            this.c = Math.min(this.c, this.d);
        } else {
            this.c = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
        if ((z2 || !this.i) ? false : false) {
            this.b.measure(0, makeMeasureSpec);
            if (this.b.getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                b();
            } else if (!a()) {
                if (this.h == null) {
                    AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                    appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                    appCompatSpinner.setOnItemSelectedListener(this);
                    this.h = appCompatSpinner;
                }
                removeView(this.b);
                addView(this.h, new ViewGroup.LayoutParams(-2, -1));
                if (this.h.getAdapter() == null) {
                    this.h.setAdapter((SpinnerAdapter) new a());
                }
                if (this.a != null) {
                    removeCallbacks(this.a);
                    this.a = null;
                }
                this.h.setSelection(this.j);
            }
        } else {
            b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z2 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.j);
    }

    private boolean a() {
        return this.h != null && this.h.getParent() == this;
    }

    public final void setAllowCollapse(boolean z) {
        this.i = z;
    }

    private boolean b() {
        if (a()) {
            removeView(this.h);
            addView(this.b, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.h.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public final void setTabSelected(int i) {
        this.j = i;
        int childCount = this.b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.b.getChildAt(i);
                if (this.a != null) {
                    removeCallbacks(this.a);
                }
                this.a = new Runnable() { // from class: android.support.v7.widget.ap.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ap.this.smoothScrollTo(childAt2.getLeft() - ((ap.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        ap.this.a = null;
                    }
                };
                post(this.a);
            }
            i2++;
        }
        if (this.h == null || i < 0) {
            return;
        }
        this.h.setSelection(i);
    }

    public final void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        android.support.v7.view.a a2 = android.support.v7.view.a.a(getContext());
        setContentHeight(a2.c());
        this.d = a2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((b) view).getTab();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class b extends LinearLayoutCompat {
        ActionBar.b a;
        private final int[] c;
        private TextView d;
        private ImageView e;
        private View f;

        public b(Context context, ActionBar.b bVar, boolean z) {
            super(context, null, R.attr.actionBarTabStyle);
            this.c = new int[]{16842964};
            this.a = bVar;
            aw a = aw.a(context, null, this.c, R.attr.actionBarTabStyle, 0);
            if (a.f(0)) {
                setBackgroundDrawable(a.a(0));
            }
            a.a.recycle();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ap.this.c <= 0 || getMeasuredWidth() <= ap.this.c) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(ap.this.c, 1073741824), i2);
        }

        public final void a() {
            ActionBar.b bVar = this.a;
            View c = bVar.c();
            if (c != null) {
                ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c);
                    }
                    addView(c);
                }
                this.f = c;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f != null) {
                removeView(this.f);
                this.f = null;
            }
            Drawable a = bVar.a();
            CharSequence b = bVar.b();
            if (a != null) {
                if (this.e == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayoutCompat.a aVar = new LinearLayoutCompat.a(-2, -2);
                    aVar.h = 16;
                    appCompatImageView.setLayoutParams(aVar);
                    addView(appCompatImageView, 0);
                    this.e = appCompatImageView;
                }
                this.e.setImageDrawable(a);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(b);
            if (z) {
                if (this.d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayoutCompat.a aVar2 = new LinearLayoutCompat.a(-2, -2);
                    aVar2.h = 16;
                    appCompatTextView.setLayoutParams(aVar2);
                    addView(appCompatTextView);
                    this.d = appCompatTextView;
                }
                this.d.setText(b);
                this.d.setVisibility(0);
            } else if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setText((CharSequence) null);
            }
            if (this.e != null) {
                this.e.setContentDescription(bVar.d());
            }
            ay.a(this, z ? null : bVar.d());
        }

        public final ActionBar.b getTab() {
            return this.a;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends BaseAdapter {
        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        a() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ap.this.b.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return ((b) ap.this.b.getChildAt(i)).getTab();
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                ap apVar = ap.this;
                b bVar = new b(apVar.getContext(), (ActionBar.b) getItem(i), true);
                bVar.setBackgroundDrawable(null);
                bVar.setLayoutParams(new AbsListView.LayoutParams(-1, apVar.e));
                return bVar;
            }
            b bVar2 = (b) view;
            bVar2.a = (ActionBar.b) getItem(i);
            bVar2.a();
            return view;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {
        private boolean b = false;
        private int c;

        protected c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ap.this.setVisibility(0);
            this.b = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.b) {
                return;
            }
            ap.this.f = null;
            ap.this.setVisibility(this.c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.b = true;
        }
    }
}
