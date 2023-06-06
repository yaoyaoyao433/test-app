package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.GravityCompat;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.SubMenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ActionMenuPresenter extends android.support.v7.view.menu.a implements ActionProvider.SubUiVisibilityListener {
    private final SparseBooleanArray A;
    private View B;
    private b C;
    d i;
    Drawable j;
    boolean k;
    boolean l;
    e m;
    a n;
    c o;
    final f p;
    int q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.A = new SparseBooleanArray();
        this.p = new f();
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public final void a(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
        super.a(context, menuBuilder);
        Resources resources = context.getResources();
        android.support.v7.view.a a2 = android.support.v7.view.a.a(context);
        if (!this.s) {
            boolean z = true;
            if (Build.VERSION.SDK_INT < 19 && ViewConfiguration.get(a2.a).hasPermanentMenuKey()) {
                z = false;
            }
            this.r = z;
        }
        if (!this.y) {
            this.t = a2.a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.w) {
            this.v = a2.a();
        }
        int i = this.t;
        if (this.r) {
            if (this.i == null) {
                this.i = new d(this.a);
                if (this.k) {
                    this.i.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.u = i;
        this.z = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.B = null;
    }

    public final void a(Configuration configuration) {
        if (!this.w) {
            this.v = android.support.v7.view.a.a(this.b).a();
        }
        if (this.c != null) {
            this.c.a(true);
        }
    }

    public final void b(boolean z) {
        this.r = true;
        this.s = true;
    }

    @Override // android.support.v7.view.menu.a
    public final android.support.v7.view.menu.k a(ViewGroup viewGroup) {
        android.support.v7.view.menu.k kVar = this.g;
        android.support.v7.view.menu.k a2 = super.a(viewGroup);
        if (kVar != a2) {
            ((ActionMenuView) a2).setPresenter(this);
        }
        return a2;
    }

    @Override // android.support.v7.view.menu.a
    public final View a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.i()) {
            actionView = super.a(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.a
    public final void a(MenuItemImpl menuItemImpl, k.a aVar) {
        aVar.a(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.g);
        if (this.C == null) {
            this.C = new b();
        }
        actionMenuItemView.setPopupCallback(this.C);
    }

    @Override // android.support.v7.view.menu.a
    public final boolean a(int i, MenuItemImpl menuItemImpl) {
        return menuItemImpl.e();
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public final void a(boolean z) {
        super.a(z);
        ((View) this.g).requestLayout();
        boolean z2 = false;
        if (this.c != null) {
            MenuBuilder menuBuilder = this.c;
            menuBuilder.g();
            ArrayList<MenuItemImpl> arrayList = menuBuilder.d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ActionProvider supportActionProvider = arrayList.get(i).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        ArrayList<MenuItemImpl> h = this.c != null ? this.c.h() : null;
        if (this.r && h != null) {
            int size2 = h.size();
            if (size2 == 1) {
                z2 = !h.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.i.getParent();
            if (viewGroup != this.g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.g;
                actionMenuView.addView(this.i, actionMenuView.a());
            }
        } else if (this.i != null && this.i.getParent() == this.g) {
            ((ViewGroup) this.g).removeView(this.i);
        }
        ((ActionMenuView) this.g).setOverflowReserved(this.r);
    }

    @Override // android.support.v7.view.menu.a
    public final boolean a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.i) {
            return false;
        }
        return super.a(viewGroup, i);
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public final boolean a(SubMenuBuilder subMenuBuilder) {
        View view;
        boolean z = false;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (subMenuBuilder2.l != this.c) {
                subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.l;
            }
            MenuItem item = subMenuBuilder2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.g;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    view = viewGroup.getChildAt(i);
                    if ((view instanceof k.a) && ((k.a) view).getItemData() == item) {
                        break;
                    }
                }
            }
            view = null;
            if (view == null) {
                return false;
            }
            this.q = subMenuBuilder.getItem().getItemId();
            int size = subMenuBuilder.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item2 = subMenuBuilder.getItem(i2);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            this.n = new a(this.b, subMenuBuilder, view);
            this.n.a(z);
            if (this.n.b()) {
                super.a(subMenuBuilder);
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    public final boolean d() {
        if (!this.r || h() || this.c == null || this.g == null || this.o != null || this.c.h().isEmpty()) {
            return false;
        }
        this.o = new c(new e(this.b, this.c, this.i, true));
        ((View) this.g).post(this.o);
        super.a((SubMenuBuilder) null);
        return true;
    }

    public final boolean e() {
        if (this.o != null && this.g != null) {
            ((View) this.g).removeCallbacks(this.o);
            this.o = null;
            return true;
        }
        e eVar = this.m;
        if (eVar != null) {
            eVar.c();
            return true;
        }
        return false;
    }

    public final boolean f() {
        return e() | g();
    }

    public final boolean g() {
        if (this.n != null) {
            this.n.c();
            return true;
        }
        return false;
    }

    public final boolean h() {
        return this.m != null && this.m.e();
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public final boolean a() {
        ArrayList<MenuItemImpl> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        int i5 = 0;
        if (actionMenuPresenter.c != null) {
            arrayList = actionMenuPresenter.c.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.v;
        int i7 = actionMenuPresenter.u;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.g;
        int i8 = i6;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            MenuItemImpl menuItemImpl = arrayList.get(i11);
            if (menuItemImpl.g()) {
                i9++;
            } else if (menuItemImpl.f()) {
                i10++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.l && menuItemImpl.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.r && (z2 || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.A;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.x) {
            i2 = i7 / actionMenuPresenter.z;
            i3 = ((i7 % actionMenuPresenter.z) / i2) + actionMenuPresenter.z;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = i7;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i14);
            if (menuItemImpl2.g()) {
                View a2 = actionMenuPresenter.a(menuItemImpl2, actionMenuPresenter.B, viewGroup);
                if (actionMenuPresenter.B == null) {
                    actionMenuPresenter.B = a2;
                }
                if (actionMenuPresenter.x) {
                    i2 -= ActionMenuView.a(a2, i3, i2, makeMeasureSpec, i5);
                } else {
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i15 != 0) {
                    measuredWidth = i15;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    z = true;
                    sparseBooleanArray.put(groupId, true);
                } else {
                    z = true;
                }
                menuItemImpl2.d(z);
                i4 = i;
                i15 = measuredWidth;
            } else if (menuItemImpl2.f()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i12 > 0 || z3) && i13 > 0 && (!actionMenuPresenter.x || i2 > 0);
                if (z4) {
                    boolean z5 = z4;
                    View a3 = actionMenuPresenter.a(menuItemImpl2, actionMenuPresenter.B, viewGroup);
                    i4 = i;
                    if (actionMenuPresenter.B == null) {
                        actionMenuPresenter.B = a3;
                    }
                    if (actionMenuPresenter.x) {
                        int a4 = ActionMenuView.a(a3, i3, i2, makeMeasureSpec, 0);
                        i2 -= a4;
                        if (a4 == 0) {
                            z5 = false;
                        }
                    } else {
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a3.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z4 = actionMenuPresenter.x ? z5 & (i13 >= 0) : z5 & (i13 + i15 > 0);
                } else {
                    i4 = i;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i16);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.e()) {
                                i12++;
                            }
                            menuItemImpl3.d(false);
                        }
                    }
                }
                if (z4) {
                    i12--;
                }
                menuItemImpl2.d(z4);
            } else {
                i4 = i;
                menuItemImpl2.d(false);
                i14++;
                i = i4;
                actionMenuPresenter = this;
                i5 = 0;
            }
            i14++;
            i = i4;
            actionMenuPresenter = this;
            i5 = 0;
        }
        return true;
    }

    @Override // android.support.v7.view.menu.a, android.support.v7.view.menu.j
    public final void a(MenuBuilder menuBuilder, boolean z) {
        f();
        super.a(menuBuilder, z);
    }

    @Override // android.support.v7.view.menu.j
    public final Parcelable c() {
        SavedState savedState = new SavedState();
        savedState.a = this.q;
        return savedState;
    }

    @Override // android.support.v7.view.menu.j
    public final void a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.a <= 0 || (findItem = this.c.findItem(savedState.a)) == null) {
                return;
            }
            a((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    @Override // android.support.v4.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.a((SubMenuBuilder) null);
        } else if (this.c != null) {
            this.c.b(false);
        }
    }

    public final void a(ActionMenuView actionMenuView) {
        this.g = actionMenuView;
        actionMenuView.a = this.c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {
        private final float[] b;

        @Override // android.support.v7.widget.ActionMenuView.a
        public final boolean c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public final boolean d() {
            return false;
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            this.b = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            ay.a(this, getContentDescription());
            setOnTouchListener(new aa(this) { // from class: android.support.v7.widget.ActionMenuPresenter.d.1
                @Override // android.support.v7.widget.aa
                public final android.support.v7.view.menu.n a() {
                    if (ActionMenuPresenter.this.m == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.m.a();
                }

                @Override // android.support.v7.widget.aa
                public final boolean b() {
                    ActionMenuPresenter.this.d();
                    return true;
                }

                @Override // android.support.v7.widget.aa
                public final boolean c() {
                    if (ActionMenuPresenter.this.o != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.e();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.d();
            return true;
        }

        @Override // android.widget.ImageView
        protected final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class e extends android.support.v7.view.menu.i {
        public e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, true, R.attr.actionOverflowMenuStyle);
            this.b = GravityCompat.END;
            a(ActionMenuPresenter.this.p);
        }

        @Override // android.support.v7.view.menu.i
        public final void d() {
            if (ActionMenuPresenter.this.c != null) {
                ActionMenuPresenter.this.c.close();
            }
            ActionMenuPresenter.this.m = null;
            super.d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a extends android.support.v7.view.menu.i {
        public a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.actionOverflowMenuStyle);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).e()) {
                this.a = ActionMenuPresenter.this.i == null ? (View) ActionMenuPresenter.this.g : ActionMenuPresenter.this.i;
            }
            a(ActionMenuPresenter.this.p);
        }

        @Override // android.support.v7.view.menu.i
        public final void d() {
            ActionMenuPresenter.this.n = null;
            ActionMenuPresenter.this.q = 0;
            super.d();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class f implements j.a {
        f() {
        }

        @Override // android.support.v7.view.menu.j.a
        public final boolean a(MenuBuilder menuBuilder) {
            if (menuBuilder == null) {
                return false;
            }
            ActionMenuPresenter.this.q = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            j.a aVar = ActionMenuPresenter.this.f;
            if (aVar != null) {
                return aVar.a(menuBuilder);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.j.a
        public final void a(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.i().b(false);
            }
            j.a aVar = ActionMenuPresenter.this.f;
            if (aVar != null) {
                aVar.a(menuBuilder, z);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        private e b;

        public c(e eVar) {
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActionMenuPresenter.this.c != null) {
                MenuBuilder menuBuilder = ActionMenuPresenter.this.c;
                if (menuBuilder.b != null) {
                    menuBuilder.b.a(menuBuilder);
                }
            }
            View view = (View) ActionMenuPresenter.this.g;
            if (view != null && view.getWindowToken() != null && this.b.b()) {
                ActionMenuPresenter.this.m = this.b;
            }
            ActionMenuPresenter.this.o = null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public final android.support.v7.view.menu.n a() {
            if (ActionMenuPresenter.this.n != null) {
                return ActionMenuPresenter.this.n.a();
            }
            return null;
        }
    }
}
