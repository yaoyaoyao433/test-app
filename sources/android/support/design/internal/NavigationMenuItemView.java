package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.k;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements k.a {
    private static final int[] f = {16842912};
    boolean c;
    final CheckedTextView d;
    FrameLayout e;
    private final int g;
    private boolean h;
    private MenuItemImpl i;
    private ColorStateList j;
    private boolean k;
    private Drawable l;
    private final AccessibilityDelegateCompat m;

    @Override // android.support.v7.view.menu.k.a
    public final boolean a() {
        return false;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new AccessibilityDelegateCompat() { // from class: android.support.design.internal.NavigationMenuItemView.1
            @Override // android.support.v4.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(NavigationMenuItemView.this.c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.d = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.d.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(this.d, this.m);
    }

    @Override // android.support.v7.view.menu.k.a
    public final void a(MenuItemImpl menuItemImpl, int i) {
        StateListDrawable stateListDrawable;
        this.i = menuItemImpl;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            ViewCompat.setBackground(this, stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        ay.a(this, menuItemImpl.getTooltipText());
        if ((this.i.getTitle() == null && this.i.getIcon() == null && this.i.getActionView() != null) ? false : false) {
            this.d.setVisibility(8);
            if (this.e != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) this.e.getLayoutParams();
                aVar.width = -1;
                this.e.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.d.setVisibility(0);
        if (this.e != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) this.e.getLayoutParams();
            aVar2.width = -2;
            this.e.setLayoutParams(aVar2);
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.e.removeAllViews();
            this.e.addView(view);
        }
    }

    @Override // android.support.v7.view.menu.k.a
    public MenuItemImpl getItemData() {
        return this.i;
    }

    public void setTitle(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.c != z) {
            this.c = z;
            this.m.sendAccessibilityEvent(this.d, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.d.setChecked(z);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.k) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.wrap(drawable).mutate();
                DrawableCompat.setTintList(drawable, this.j);
            }
            drawable.setBounds(0, 0, this.g, this.g);
        } else if (this.h) {
            if (this.l == null) {
                this.l = ResourcesCompat.getDrawable(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                if (this.l != null) {
                    this.l.setBounds(0, 0, this.g, this.g);
                }
            }
            drawable = this.l;
        }
        TextViewCompat.setCompoundDrawablesRelative(this.d, drawable, null, null, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.i != null && this.i.isCheckable() && this.i.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        return onCreateDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        this.k = this.j != null;
        if (this.i != null) {
            setIcon(this.i.getIcon());
        }
    }

    public void setTextAppearance(int i) {
        TextViewCompat.setTextAppearance(this.d, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.d.setTextColor(colorStateList);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.h = z;
    }
}
