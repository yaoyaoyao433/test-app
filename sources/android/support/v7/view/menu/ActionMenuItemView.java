package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.RestrictTo;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.aa;
import android.support.v7.widget.ay;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, ActionMenuView.a, View.OnClickListener {
    MenuItemImpl a;
    MenuBuilder.b b;
    b c;
    private CharSequence d;
    private Drawable e;
    private aa f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract n a();
    }

    @Override // android.support.v7.view.menu.k.a
    public final boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.g = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g = e();
        f();
    }

    private boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            return (i >= 640 && i2 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v7.view.menu.k.a
    public MenuItemImpl getItemData() {
        return this.a;
    }

    @Override // android.support.v7.view.menu.k.a
    public final void a(MenuItemImpl menuItemImpl, int i) {
        this.a = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.a((k.a) this));
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f == null) {
            this.f = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a.hasSubMenu() && this.f != null && this.f.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.b != null) {
            this.b.a(this.a);
        }
    }

    public void setItemInvoker(MenuBuilder.b bVar) {
        this.b = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.c = bVar;
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.a != null) {
                MenuItemImpl menuItemImpl = this.a;
                menuItemImpl.b.b(menuItemImpl);
            }
        }
    }

    private void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.d);
        if (this.e != null && (!this.a.h() || (!this.g && !this.h))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.d : null);
        CharSequence contentDescription = this.a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z3 ? null : this.a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            ay.a(this, z3 ? null : this.a.getTitle());
        } else {
            ay.a(this, tooltipText);
        }
    }

    public void setIcon(Drawable drawable) {
        this.e = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f = this.k / intrinsicWidth;
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.k) {
                float f2 = this.k / intrinsicHeight;
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.d = charSequence;
        f();
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public final boolean c() {
        return b() && this.a.getIcon() == null;
    }

    @Override // android.support.v7.widget.ActionMenuView.a
    public final boolean d() {
        return b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean b2 = b();
        if (b2 && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (b2 || this.e == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.e.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class a extends aa {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.v7.widget.aa
        public final n a() {
            if (ActionMenuItemView.this.c != null) {
                return ActionMenuItemView.this.c.a();
            }
            return null;
        }

        @Override // android.support.v7.widget.aa
        public final boolean b() {
            n a;
            return ActionMenuItemView.this.b != null && ActionMenuItemView.this.b.a(ActionMenuItemView.this.a) && (a = a()) != null && a.f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }
}
