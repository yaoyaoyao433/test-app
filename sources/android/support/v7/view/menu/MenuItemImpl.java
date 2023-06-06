package android.support.v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.view.ActionProvider;
import android.support.v7.view.menu.k;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {
    static String d;
    static String e;
    static String f;
    static String g;
    private int E;
    private View F;
    private ActionProvider G;
    private MenuItem.OnActionExpandListener H;
    final int a;
    MenuBuilder b;
    ContextMenu.ContextMenuInfo c;
    private final int h;
    private final int i;
    private final int j;
    private CharSequence k;
    private CharSequence l;
    private Intent m;
    private char n;
    private char p;
    private Drawable r;
    private SubMenuBuilder t;
    private Runnable u;
    private MenuItem.OnMenuItemClickListener v;
    private CharSequence w;
    private CharSequence x;
    private int o = 4096;
    private int q = 4096;
    private int s = 0;
    private ColorStateList y = null;
    private PorterDuff.Mode z = null;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private int D = 16;
    private boolean I = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.E = 0;
        this.b = menuBuilder;
        this.h = i2;
        this.i = i;
        this.j = i3;
        this.a = i4;
        this.k = charSequence;
        this.E = i5;
    }

    public final boolean a() {
        if ((this.v == null || !this.v.onMenuItemClick(this)) && !this.b.a(this.b, this)) {
            if (this.u != null) {
                this.u.run();
                return true;
            }
            if (this.m != null) {
                try {
                    this.b.a.startActivity(this.m);
                    return true;
                } catch (ActivityNotFoundException e2) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
                }
            }
            return this.G != null && this.G.onPerformDefaultAction();
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.D & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.D |= 16;
        } else {
            this.D &= -17;
        }
        this.b.a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.i;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.m = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.p;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.p == c) {
            return this;
        }
        this.p = Character.toLowerCase(c);
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.p == c && this.q == i) {
            return this;
        }
        this.p = Character.toLowerCase(c);
        this.q = KeyEvent.normalizeMetaState(i);
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.q;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.n;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.o;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.n == c) {
            return this;
        }
        this.n = c;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.n == c && this.o == i) {
            return this;
        }
        this.n = c;
        this.o = KeyEvent.normalizeMetaState(i);
        this.b.a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.n = c;
        this.p = Character.toLowerCase(c2);
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.n = c;
        this.o = KeyEvent.normalizeMetaState(i);
        this.p = Character.toLowerCase(c2);
        this.q = KeyEvent.normalizeMetaState(i2);
        this.b.a(false);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final char b() {
        return this.b.b() ? this.p : this.n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.b.c() && b() != 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.t;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.t != null;
    }

    public final void a(SubMenuBuilder subMenuBuilder) {
        this.t = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(getTitle());
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final CharSequence a(k.a aVar) {
        if (aVar.a()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.k = charSequence;
        this.b.a(false);
        if (this.t != null) {
            this.t.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        return setTitle(this.b.a.getString(i));
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.l != null ? this.l : this.k;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.l = charSequence;
        this.b.a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        if (this.r != null) {
            return a(this.r);
        }
        if (this.s != 0) {
            Drawable b = android.support.v7.content.res.b.b(this.b.a, this.s);
            this.s = 0;
            this.r = b;
            return a(b);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.s = 0;
        this.r = drawable;
        this.C = true;
        this.b.a(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.r = null;
        this.s = i;
        this.C = true;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.y = colorStateList;
        this.A = true;
        this.C = true;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.y;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.z = mode;
        this.B = true;
        this.C = true;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.z;
    }

    private Drawable a(Drawable drawable) {
        if (drawable != null && this.C && (this.A || this.B)) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (this.A) {
                DrawableCompat.setTintList(drawable, this.y);
            }
            if (this.B) {
                DrawableCompat.setTintMode(drawable, this.z);
            }
            this.C = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.D & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.D;
        this.D = (z ? 1 : 0) | (this.D & (-2));
        if (i != this.D) {
            this.b.a(false);
        }
        return this;
    }

    public final void a(boolean z) {
        this.D = (z ? 4 : 0) | (this.D & (-5));
    }

    public final boolean d() {
        return (this.D & 4) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.D & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        if ((this.D & 4) != 0) {
            MenuBuilder menuBuilder = this.b;
            int groupId = getGroupId();
            int size = menuBuilder.c.size();
            menuBuilder.d();
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl = menuBuilder.c.get(i);
                if (menuItemImpl.getGroupId() == groupId && menuItemImpl.d() && menuItemImpl.isCheckable()) {
                    menuItemImpl.b(menuItemImpl == this);
                }
            }
            menuBuilder.e();
        } else {
            b(z);
        }
        return this;
    }

    final void b(boolean z) {
        int i = this.D;
        this.D = (z ? 2 : 0) | (this.D & (-3));
        if (i != this.D) {
            this.b.a(false);
        }
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.G == null || !this.G.overridesItemVisibility()) ? (this.D & 8) == 0 : (this.D & 8) == 0 && this.G.isVisible();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(boolean z) {
        int i = this.D;
        this.D = (z ? 0 : 8) | (this.D & (-9));
        return i != this.D;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        if (c(z)) {
            this.b.a(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.v = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        if (this.k != null) {
            return this.k.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.c;
    }

    public final boolean e() {
        return (this.D & 32) == 32;
    }

    public final boolean f() {
        return (this.E & 1) == 1;
    }

    public final boolean g() {
        return (this.E & 2) == 2;
    }

    public final void d(boolean z) {
        if (z) {
            this.D |= 32;
        } else {
            this.D &= -33;
        }
    }

    public final boolean h() {
        return (this.E & 4) == 4;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.E = i;
                this.b.b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    /* renamed from: a */
    public SupportMenuItem setActionView(View view) {
        this.F = view;
        this.G = null;
        if (view != null && view.getId() == -1 && this.h > 0) {
            view.setId(this.h);
        }
        this.b.b(this);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final View getActionView() {
        if (this.F != null) {
            return this.F;
        }
        if (this.G != null) {
            this.F = this.G.onCreateActionView(this);
            return this.F;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.support.v4.internal.view.SupportMenuItem
    public final ActionProvider getSupportActionProvider() {
        return this.G;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem
    public final SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        if (this.G != null) {
            this.G.reset();
        }
        this.F = null;
        this.G = actionProvider;
        this.b.a(true);
        if (this.G != null) {
            this.G.setVisibilityListener(new ActionProvider.VisibilityListener() { // from class: android.support.v7.view.menu.MenuItemImpl.1
                @Override // android.support.v4.view.ActionProvider.VisibilityListener
                public void onActionProviderVisibilityChanged(boolean z) {
                    MenuItemImpl.this.b.a(MenuItemImpl.this);
                }
            });
        }
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean expandActionView() {
        if (i()) {
            if (this.H == null || this.H.onMenuItemActionExpand(this)) {
                return this.b.c(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.E & 8) == 0) {
            return false;
        }
        if (this.F == null) {
            return true;
        }
        if (this.H == null || this.H.onMenuItemActionCollapse(this)) {
            return this.b.d(this);
        }
        return false;
    }

    public final boolean i() {
        if ((this.E & 8) != 0) {
            if (this.F == null && this.G != null) {
                this.F = this.G.onCreateActionView(this);
            }
            return this.F != null;
        }
        return false;
    }

    public final void e(boolean z) {
        this.I = z;
        this.b.a(false);
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.I;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.H = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.w = charSequence;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.w;
    }

    @Override // android.view.MenuItem
    public final SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.x = charSequence;
        this.b.a(false);
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.x;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.b.a;
        setActionView(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // android.support.v4.internal.view.SupportMenuItem, android.view.MenuItem
    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }
}
