package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class BottomNavigationItemView extends FrameLayout implements k.a {
    private static final int[] a = {16842912};
    private final int b;
    private final int c;
    private final float d;
    private final float e;
    private boolean f;
    private ImageView g;
    private final TextView h;
    private final TextView i;
    private int j;
    private MenuItemImpl k;
    private ColorStateList l;

    @Override // android.support.v7.view.menu.k.a
    public final boolean a() {
        return false;
    }

    public BottomNavigationItemView(@NonNull Context context) {
        this(context, null);
    }

    private BottomNavigationItemView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = -1;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_text_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_text_size);
        this.b = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_margin);
        this.c = dimensionPixelSize - dimensionPixelSize2;
        float f = dimensionPixelSize2;
        float f2 = dimensionPixelSize;
        this.d = (f * 1.0f) / f2;
        this.e = (f2 * 1.0f) / f;
        LayoutInflater.from(context).inflate(R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.design_bottom_navigation_item_background);
        this.g = (ImageView) findViewById(R.id.icon);
        this.h = (TextView) findViewById(R.id.smallLabel);
        this.i = (TextView) findViewById(R.id.largeLabel);
    }

    @Override // android.support.v7.view.menu.k.a
    public final void a(MenuItemImpl menuItemImpl, int i) {
        this.k = menuItemImpl;
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setIcon(menuItemImpl.getIcon());
        setTitle(menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        setContentDescription(menuItemImpl.getContentDescription());
        ay.a(this, menuItemImpl.getTooltipText());
    }

    public void setItemPosition(int i) {
        this.j = i;
    }

    public int getItemPosition() {
        return this.j;
    }

    public void setShiftingMode(boolean z) {
        this.f = z;
    }

    @Override // android.support.v7.view.menu.k.a
    public MenuItemImpl getItemData() {
        return this.k;
    }

    public void setTitle(CharSequence charSequence) {
        this.h.setText(charSequence);
        this.i.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.i.setPivotX(this.i.getWidth() / 2);
        this.i.setPivotY(this.i.getBaseline());
        this.h.setPivotX(this.h.getWidth() / 2);
        this.h.setPivotY(this.h.getBaseline());
        if (this.f) {
            if (z) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams.gravity = 49;
                layoutParams.topMargin = this.b;
                this.g.setLayoutParams(layoutParams);
                this.i.setVisibility(0);
                this.i.setScaleX(1.0f);
                this.i.setScaleY(1.0f);
            } else {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
                layoutParams2.gravity = 17;
                layoutParams2.topMargin = this.b;
                this.g.setLayoutParams(layoutParams2);
                this.i.setVisibility(4);
                this.i.setScaleX(0.5f);
                this.i.setScaleY(0.5f);
            }
            this.h.setVisibility(4);
        } else if (z) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams3.gravity = 49;
            layoutParams3.topMargin = this.b + this.c;
            this.g.setLayoutParams(layoutParams3);
            this.i.setVisibility(0);
            this.h.setVisibility(4);
            this.i.setScaleX(1.0f);
            this.i.setScaleY(1.0f);
            this.h.setScaleX(this.d);
            this.h.setScaleY(this.d);
        } else {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams4.gravity = 49;
            layoutParams4.topMargin = this.b;
            this.g.setLayoutParams(layoutParams4);
            this.i.setVisibility(4);
            this.h.setVisibility(0);
            this.i.setScaleX(this.e);
            this.i.setScaleY(this.e);
            this.h.setScaleX(1.0f);
            this.h.setScaleY(1.0f);
        }
        refreshDrawableState();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.h.setEnabled(z);
        this.i.setEnabled(z);
        this.g.setEnabled(z);
        if (z) {
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), 1002));
        } else {
            ViewCompat.setPointerIcon(this, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.k != null && this.k.isCheckable() && this.k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = DrawableCompat.wrap(drawable).mutate();
            DrawableCompat.setTintList(drawable, this.l);
        }
        this.g.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (this.k != null) {
            setIcon(this.k.getIcon());
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.h.setTextColor(colorStateList);
        this.i.setTextColor(colorStateList);
    }

    public void setItemBackground(int i) {
        ViewCompat.setBackground(this, i == 0 ? null : ContextCompat.getDrawable(getContext(), i));
    }
}
