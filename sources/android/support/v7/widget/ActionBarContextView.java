package android.support.v7.widget;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.view.menu.MenuBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {
    public boolean g;
    private CharSequence h;
    private CharSequence i;
    private View j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.support.v7.widget.AbsActionBarView
    public final /* bridge */ /* synthetic */ ViewPropertyAnimatorCompat a(int i, long j) {
        return super.a(i, j);
    }

    @Override // android.support.v7.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.support.v7.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        aw a = aw.a(context, attributeSet, new int[]{R.attr.background, R.attr.height, R.attr.titleTextStyle, R.attr.subtitleTextStyle, R.attr.backgroundSplit, R.attr.closeItemLayout}, i, 0);
        ViewCompat.setBackground(this, a.a(0));
        this.o = a.g(2, 0);
        this.p = a.g(3, 0);
        this.e = a.f(1, 0);
        this.q = a.g(5, R.layout.abc_action_mode_close_item_material);
        a.a.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.e();
            this.d.g();
        }
    }

    @Override // android.support.v7.widget.AbsActionBarView
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.k != null) {
            removeView(this.k);
        }
        this.k = view;
        if (view != null && this.l != null) {
            removeView(this.l);
            this.l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.h = charSequence;
        d();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.i = charSequence;
        d();
    }

    public CharSequence getTitle() {
        return this.h;
    }

    public CharSequence getSubtitle() {
        return this.i;
    }

    private void d() {
        if (this.l == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            this.l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = (TextView) this.l.findViewById(R.id.action_bar_title);
            this.n = (TextView) this.l.findViewById(R.id.action_bar_subtitle);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.h);
        this.n.setText(this.i);
        boolean z = !TextUtils.isEmpty(this.h);
        boolean z2 = !TextUtils.isEmpty(this.i);
        int i = 8;
        this.n.setVisibility(z2 ? 0 : 8);
        this.l.setVisibility((z || z2) ? 0 : 0);
        if (this.l.getParent() == null) {
            addView(this.l);
        }
    }

    public final void a(final android.support.v7.view.b bVar) {
        if (this.j == null) {
            this.j = LayoutInflater.from(getContext()).inflate(this.q, (ViewGroup) this, false);
            addView(this.j);
        } else if (this.j.getParent() == null) {
            addView(this.j);
        }
        this.j.findViewById(R.id.action_mode_close_button).setOnClickListener(new View.OnClickListener() { // from class: android.support.v7.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bVar.c();
            }
        });
        MenuBuilder menuBuilder = (MenuBuilder) bVar.b();
        if (this.d != null) {
            this.d.f();
        }
        this.d = new ActionMenuPresenter(getContext());
        this.d.b(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.a(this.d, this.b);
        this.c = (ActionMenuView) this.d.a(this);
        ViewCompat.setBackground(this.c, null);
        addView(this.c, layoutParams);
    }

    public final void b() {
        if (this.j == null) {
            c();
        }
    }

    public final void c() {
        removeAllViews();
        this.k = null;
        this.c = null;
    }

    @Override // android.support.v7.widget.AbsActionBarView
    public final boolean a() {
        if (this.d != null) {
            return this.d.d();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.e > 0 ? this.e : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i3 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            if (this.j != null) {
                int a = a(this.j, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = a(this.c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.l != null && this.k == null) {
                if (this.g) {
                    this.l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.l.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.l.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a(this.l, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.k != null) {
                ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
                int i4 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                int i5 = layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824;
                if (layoutParams.height >= 0) {
                    i3 = Math.min(layoutParams.height, i3);
                }
                this.k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(i3, i5));
            }
            if (this.e <= 0) {
                int childCount = getChildCount();
                int i6 = 0;
                for (int i7 = 0; i7 < childCount; i7++) {
                    int measuredHeight = getChildAt(i7).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i6) {
                        i6 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i6);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a = bd.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.j != null && this.j.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = a(paddingRight, i5, a);
            paddingRight = a(a2 + a(this.j, a2, paddingTop, paddingTop2, a), i6, a);
        }
        if (this.l != null && this.k == null && this.l.getVisibility() != 8) {
            paddingRight += a(this.l, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.k != null) {
            a(this.k, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a(this.c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.g) {
            requestLayout();
        }
        this.g = z;
    }
}
