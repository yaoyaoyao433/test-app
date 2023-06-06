package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.k;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a {
    private MenuItemImpl a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private ImageView g;
    private Drawable h;
    private int i;
    private Context j;
    private boolean k;
    private Drawable l;
    private int m;
    private LayoutInflater n;
    private boolean o;

    @Override // android.support.v7.view.menu.k.a
    public final boolean a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aw a = aw.a(getContext(), attributeSet, new int[]{16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.titleSize, R.attr.titleColor, R.attr.contentSize, R.attr.contentColor, R.attr.sepPadding, R.attr.menuTitlePadding, R.attr.contentPaddingMenuView, R.attr.pricePadding, R.attr.lineSpacing, R.attr.preserveIconSpacing, R.attr.subMenuArrow}, i, 0);
        this.h = a.a(5);
        this.i = a.g(1, -1);
        this.k = a.a(16, false);
        this.j = context;
        this.l = a.a(17);
        a.a.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(this, this.h);
        this.d = (TextView) findViewById(R.id.title);
        if (this.i != -1) {
            this.d.setTextAppearance(this.j, this.i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        this.g = (ImageView) findViewById(R.id.submenuarrow);
        if (this.g != null) {
            this.g.setImageDrawable(this.l);
        }
    }

    @Override // android.support.v7.view.menu.k.a
    public final void a(MenuItemImpl menuItemImpl, int i) {
        String sb;
        this.a = menuItemImpl;
        int i2 = 0;
        this.m = 0;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(menuItemImpl.a((k.a) this));
        setCheckable(menuItemImpl.isCheckable());
        boolean c = menuItemImpl.c();
        menuItemImpl.b();
        i2 = (c && this.a.c()) ? 8 : 8;
        if (i2 == 0) {
            TextView textView = this.f;
            char b = this.a.b();
            if (b == 0) {
                sb = "";
            } else {
                StringBuilder sb2 = new StringBuilder(MenuItemImpl.d);
                if (b == '\b') {
                    sb2.append(MenuItemImpl.f);
                } else if (b == '\n') {
                    sb2.append(MenuItemImpl.e);
                } else if (b == ' ') {
                    sb2.append(MenuItemImpl.g);
                } else {
                    sb2.append(b);
                }
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f.getVisibility() != i2) {
            this.f.setVisibility(i2);
        }
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.o = z;
        this.k = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        } else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.k.a
    public MenuItemImpl getItemData() {
        return this.a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.c == null && this.e == null) {
            return;
        }
        if (this.a.d()) {
            if (this.c == null) {
                b();
            }
            compoundButton = this.c;
            compoundButton2 = this.e;
        } else {
            if (this.e == null) {
                c();
            }
            compoundButton = this.e;
            compoundButton2 = this.c;
        }
        if (z) {
            compoundButton.setChecked(this.a.isChecked());
            int i = z ? 0 : 8;
            if (compoundButton.getVisibility() != i) {
                compoundButton.setVisibility(i);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        if (this.c != null) {
            this.c.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.a.d()) {
            if (this.c == null) {
                b();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                c();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.g != null) {
            this.g.setVisibility(z ? 0 : 8);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.a.b.i || this.o;
        if (z || this.k) {
            if (this.b == null && drawable == null && !this.k) {
                return;
            }
            if (this.b == null) {
                this.b = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                addView(this.b, 0);
            }
            if (drawable != null || this.k) {
                ImageView imageView = this.b;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                    return;
                }
                return;
            }
            this.b.setVisibility(8);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.b != null && this.k) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void b() {
        this.c = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.c);
    }

    private void c() {
        this.e = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.e);
    }

    private LayoutInflater getInflater() {
        if (this.n == null) {
            this.n = LayoutInflater.from(getContext());
        }
        return this.n;
    }
}
