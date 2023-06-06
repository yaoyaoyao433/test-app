package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.R;
import android.support.v4.app.NavUtils;
import android.support.v4.util.LongSparseArray;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.view.b;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.j;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bd;
import android.support.v7.widget.t;
import android.support.v7.widget.z;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.sankuai.waimai.platform.utils.p;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@RequiresApi(14)
/* loaded from: classes.dex */
public class AppCompatDelegateImplV9 extends android.support.v7.app.b implements MenuBuilder.a, LayoutInflater.Factory2 {
    private static final boolean v;
    private ViewGroup A;
    private TextView B;
    private View C;
    private boolean D;
    private boolean E;
    private boolean F;
    private PanelFeatureState[] G;
    private PanelFeatureState H;
    private boolean I;
    private final Runnable J;
    private boolean K;
    private Rect L;
    private Rect M;
    private g N;
    android.support.v7.view.b o;
    ActionBarContextView p;
    PopupWindow q;
    Runnable r;
    ViewPropertyAnimatorCompat s;
    boolean t;
    int u;
    private t w;
    private a x;
    private d y;
    private boolean z;

    static {
        v = Build.VERSION.SDK_INT < 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatDelegateImplV9(Context context, Window window, android.support.v7.app.a aVar) {
        super(context, window, aVar);
        this.s = null;
        this.J = new Runnable() { // from class: android.support.v7.app.AppCompatDelegateImplV9.1
            @Override // java.lang.Runnable
            public final void run() {
                if ((AppCompatDelegateImplV9.this.u & 1) != 0) {
                    AppCompatDelegateImplV9.this.f(0);
                }
                if ((AppCompatDelegateImplV9.this.u & 4096) != 0) {
                    AppCompatDelegateImplV9.this.f(108);
                }
                AppCompatDelegateImplV9.this.t = false;
                AppCompatDelegateImplV9.this.u = 0;
            }
        };
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Bundle bundle) {
        if (!(this.d instanceof Activity) || NavUtils.getParentActivityName((Activity) this.d) == null) {
            return;
        }
        ActionBar actionBar = this.g;
        if (actionBar == null) {
            this.K = true;
        } else {
            actionBar.d(true);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(Bundle bundle) {
        s();
    }

    @Override // android.support.v7.app.b
    public void l() {
        s();
        if (this.i && this.g == null) {
            if (this.d instanceof Activity) {
                this.g = new n((Activity) this.d, this.j);
            } else if (this.d instanceof Dialog) {
                this.g = new n((Dialog) this.d);
            }
            if (this.g != null) {
                this.g.d(this.K);
            }
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Toolbar toolbar) {
        if (this.d instanceof Activity) {
            ActionBar a2 = a();
            if (a2 instanceof n) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.h = null;
            if (a2 != null) {
                a2.j();
            }
            if (toolbar != null) {
                k kVar = new k(toolbar, ((Activity) this.d).getTitle(), this.e);
                this.g = kVar;
                this.c.setCallback(kVar.c);
            } else {
                this.g = null;
                this.c.setCallback(this.e);
            }
            f();
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    @Nullable
    public <T extends View> T a(@IdRes int i) {
        s();
        return (T) this.c.findViewById(i);
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(Configuration configuration) {
        ActionBar a2;
        if (this.i && this.z && (a2 = a()) != null) {
            a2.a(configuration);
        }
        android.support.v7.widget.g a3 = android.support.v7.widget.g.a();
        Context context = this.b;
        synchronized (a3.a) {
            LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = a3.b.get(context);
            if (longSparseArray != null) {
                longSparseArray.clear();
            }
        }
        j();
    }

    @Override // android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void d() {
        ActionBar a2 = a();
        if (a2 != null) {
            a2.e(false);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void e() {
        ActionBar a2 = a();
        if (a2 != null) {
            a2.e(true);
        }
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(View view) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(int i) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.b).inflate(i, viewGroup);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        ViewGroup viewGroup = (ViewGroup) this.A.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        s();
        ((ViewGroup) this.A.findViewById(16908290)).addView(view, layoutParams);
        this.d.onContentChanged();
    }

    @Override // android.support.v7.app.b, android.support.v7.app.AppCompatDelegate
    public void g() {
        if (this.t) {
            this.c.getDecorView().removeCallbacks(this.J);
        }
        super.g();
        if (this.g != null) {
            this.g.j();
        }
    }

    private void s() {
        if (this.z) {
            return;
        }
        this.A = t();
        CharSequence o = o();
        if (!TextUtils.isEmpty(o)) {
            b(o);
        }
        u();
        this.z = true;
        PanelFeatureState a2 = a(0, false);
        if (this.n) {
            return;
        }
        if (a2 == null || a2.j == null) {
            d(108);
        }
    }

    private ViewGroup t() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.windowActionBar, R.attr.windowNoTitle, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedWidthMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMinor, R.attr.windowFixedHeightMajor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.actionBarTabStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabTextStyle, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.actionBarPopupTheme, R.attr.actionBarStyle, R.attr.actionBarSplitStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionBarSize, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeStyle, R.attr.actionModeCloseButtonStyle, R.attr.actionModeBackground, R.attr.actionModeSplitBackground, R.attr.actionModeCloseDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModePasteDrawable, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeFindDrawable, R.attr.actionModeWebSearchDrawable, R.attr.actionModePopupWindowStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceSmallPopupMenu, R.attr.textAppearancePopupMenuHeader, R.attr.dialogTheme, R.attr.dialogPreferredPadding, R.attr.listDividerAlertDialog, R.attr.actionDropDownStyle, R.attr.dropdownListPreferredItemHeight, R.attr.spinnerDropDownItemStyle, R.attr.homeAsUpIndicator, R.attr.actionButtonStyle, R.attr.buttonBarStyle, R.attr.buttonBarButtonStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.borderlessButtonStyle, R.attr.dividerVertical, R.attr.dividerHorizontal, R.attr.activityChooserViewStyle, R.attr.toolbarStyle, R.attr.toolbarNavigationButtonStyle, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.editTextColor, R.attr.editTextBackground, R.attr.imageButtonStyle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSearchResultSubtitle, R.attr.textColorSearchUrl, R.attr.searchViewStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.dropDownListViewStyle, R.attr.listPopupWindowStyle, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.panelBackground, R.attr.panelMenuListWidth, R.attr.panelMenuListTheme, R.attr.listChoiceBackgroundIndicator, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorAccent, R.attr.colorControlNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorButtonNormal, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.colorBackgroundFloating, R.attr.alertDialogStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogTheme, R.attr.textColorAlertDialogListItem, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.autoCompleteTextViewStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.editTextStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.seekBarStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.listMenuViewStyle, R.attr.tooltipFrameBackground, R.attr.tooltipForegroundColor, R.attr.colorError});
        if (!obtainStyledAttributes.hasValue(2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(3, false)) {
            c(1);
        } else if (obtainStyledAttributes.getBoolean(2, false)) {
            c(108);
        }
        if (obtainStyledAttributes.getBoolean(4, false)) {
            c(109);
        }
        if (obtainStyledAttributes.getBoolean(5, false)) {
            c(10);
        }
        this.l = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.c.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.b);
        if (!this.m) {
            if (this.l) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                this.j = false;
                this.i = false;
            } else if (this.i) {
                TypedValue typedValue = new TypedValue();
                this.b.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new android.support.v7.view.d(this.b, typedValue.resourceId);
                } else {
                    context = this.b;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                this.w = (t) viewGroup.findViewById(R.id.decor_content_parent);
                this.w.setWindowCallback(this.c.getCallback());
                if (this.j) {
                    this.w.a(109);
                }
                if (this.D) {
                    this.w.a(2);
                }
                if (this.E) {
                    this.w.a(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            if (this.k) {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
            } else {
                viewGroup = (ViewGroup) from.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new OnApplyWindowInsetsListener() { // from class: android.support.v7.app.AppCompatDelegateImplV9.2
                    @Override // android.support.v4.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
                        int g = AppCompatDelegateImplV9.this.g(systemWindowInsetTop);
                        if (systemWindowInsetTop != g) {
                            windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), g, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                        }
                        return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
                    }
                });
            } else {
                ((z) viewGroup).setOnFitSystemWindowsListener(new z.a() { // from class: android.support.v7.app.AppCompatDelegateImplV9.3
                    @Override // android.support.v7.widget.z.a
                    public final void a(Rect rect) {
                        rect.top = AppCompatDelegateImplV9.this.g(rect.top);
                    }
                });
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.i + ", windowActionBarOverlay: " + this.j + ", android:windowIsFloating: " + this.l + ", windowActionModeOverlay: " + this.k + ", windowNoTitle: " + this.m + " }");
        }
        if (this.w == null) {
            this.B = (TextView) viewGroup.findViewById(R.id.title);
        }
        bd.b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.c.findViewById(16908290);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.c.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.a() { // from class: android.support.v7.app.AppCompatDelegateImplV9.4
            @Override // android.support.v7.widget.ContentFrameLayout.a
            public final void a() {
                AppCompatDelegateImplV9.this.r();
            }
        });
        return viewGroup;
    }

    private void u() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.A.findViewById(16908290);
        View decorView = this.c.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.windowActionBar, R.attr.windowNoTitle, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedWidthMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMinor, R.attr.windowFixedHeightMajor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.actionBarTabStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabTextStyle, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.actionBarPopupTheme, R.attr.actionBarStyle, R.attr.actionBarSplitStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionBarSize, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeStyle, R.attr.actionModeCloseButtonStyle, R.attr.actionModeBackground, R.attr.actionModeSplitBackground, R.attr.actionModeCloseDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModePasteDrawable, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeFindDrawable, R.attr.actionModeWebSearchDrawable, R.attr.actionModePopupWindowStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceSmallPopupMenu, R.attr.textAppearancePopupMenuHeader, R.attr.dialogTheme, R.attr.dialogPreferredPadding, R.attr.listDividerAlertDialog, R.attr.actionDropDownStyle, R.attr.dropdownListPreferredItemHeight, R.attr.spinnerDropDownItemStyle, R.attr.homeAsUpIndicator, R.attr.actionButtonStyle, R.attr.buttonBarStyle, R.attr.buttonBarButtonStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.borderlessButtonStyle, R.attr.dividerVertical, R.attr.dividerHorizontal, R.attr.activityChooserViewStyle, R.attr.toolbarStyle, R.attr.toolbarNavigationButtonStyle, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.editTextColor, R.attr.editTextBackground, R.attr.imageButtonStyle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSearchResultSubtitle, R.attr.textColorSearchUrl, R.attr.searchViewStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.dropDownListViewStyle, R.attr.listPopupWindowStyle, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.panelBackground, R.attr.panelMenuListWidth, R.attr.panelMenuListTheme, R.attr.listChoiceBackgroundIndicator, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorAccent, R.attr.colorControlNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorButtonNormal, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.colorBackgroundFloating, R.attr.alertDialogStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogTheme, R.attr.textColorAlertDialogListItem, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.autoCompleteTextViewStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.editTextStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.seekBarStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.listMenuViewStyle, R.attr.tooltipFrameBackground, R.attr.tooltipForegroundColor, R.attr.colorError});
        obtainStyledAttributes.getValue(10, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(11, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(6)) {
            obtainStyledAttributes.getValue(6, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(8)) {
            obtainStyledAttributes.getValue(8, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(9)) {
            obtainStyledAttributes.getValue(9, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(7)) {
            obtainStyledAttributes.getValue(7, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public boolean c(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.m && i == 108) {
            return false;
        }
        if (this.i && i == 1) {
            this.i = false;
        }
        switch (i) {
            case 1:
                v();
                this.m = true;
                return true;
            case 2:
                v();
                this.D = true;
                return true;
            case 5:
                v();
                this.E = true;
                return true;
            case 10:
                v();
                this.k = true;
                return true;
            case 108:
                v();
                this.i = true;
                return true;
            case 109:
                v();
                this.j = true;
                return true;
            default:
                return this.c.requestFeature(i);
        }
    }

    @Override // android.support.v7.app.b
    final void b(CharSequence charSequence) {
        if (this.w != null) {
            this.w.setWindowTitle(charSequence);
        } else if (this.g != null) {
            this.g.b(charSequence);
        } else if (this.B != null) {
            this.B.setText(charSequence);
        }
    }

    @Override // android.support.v7.app.b
    final void a(int i, Menu menu) {
        if (i == 108) {
            ActionBar a2 = a();
            if (a2 != null) {
                a2.f(false);
            }
        } else if (i == 0) {
            PanelFeatureState a3 = a(i, true);
            if (a3.o) {
                a(a3, false);
            }
        }
    }

    @Override // android.support.v7.app.b
    final boolean b(int i, Menu menu) {
        if (i == 108) {
            ActionBar a2 = a();
            if (a2 != null) {
                a2.f(true);
            }
            return true;
        }
        return false;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public android.support.v7.view.b a(@NonNull b.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.o != null) {
            this.o.c();
        }
        b bVar = new b(aVar);
        ActionBar a2 = a();
        if (a2 != null) {
            this.o = a2.a(bVar);
            if (this.o != null && this.f != null) {
                this.f.onSupportActionModeStarted(this.o);
            }
        }
        if (this.o == null) {
            this.o = b(bVar);
        }
        return this.o;
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void f() {
        ActionBar a2 = a();
        if (a2 == null || !a2.h()) {
            d(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // android.support.v7.app.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.support.v7.view.b b(@android.support.annotation.NonNull android.support.v7.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.b(android.support.v7.view.b$a):android.support.v7.view.b");
    }

    final boolean p() {
        return this.z && this.A != null && ViewCompat.isLaidOut(this.A);
    }

    final void q() {
        if (this.s != null) {
            this.s.cancel();
        }
    }

    @Override // android.support.v7.app.b
    final boolean a(int i, KeyEvent keyEvent) {
        ActionBar a2 = a();
        if (a2 == null || !a2.a(i, keyEvent)) {
            if (this.H != null && a(this.H, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (this.H != null) {
                    this.H.n = true;
                }
                return true;
            }
            if (this.H == null) {
                PanelFeatureState a3 = a(0, true);
                b(a3, keyEvent);
                boolean a4 = a(a3, keyEvent.getKeyCode(), keyEvent, 1);
                a3.m = false;
                if (a4) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x0101 A[RETURN] */
    @Override // android.support.v7.app.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final boolean a(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.a(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r10).getDepth() > 1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r8.equals("ImageView") != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b(android.view.View r7, java.lang.String r8, @android.support.annotation.NonNull android.content.Context r9, @android.support.annotation.NonNull android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV9.b(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.support.v7.app.AppCompatDelegate
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.b);
        if (from.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(from, this);
        } else {
            from.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a2 = a(view, str, context, attributeSet);
        return a2 != null ? a2 : b(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    View a(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.d instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.d).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    private void a(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (panelFeatureState.o || this.n) {
            return;
        }
        if (panelFeatureState.a == 0) {
            Context context = this.b;
            boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
            boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
            if (z && z2) {
                return;
            }
        }
        Window.Callback callback = this.c.getCallback();
        if (callback != null && !callback.onMenuOpened(panelFeatureState.a, panelFeatureState.j)) {
            a(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (windowManager != null && b(panelFeatureState, keyEvent)) {
            if (panelFeatureState.g == null || panelFeatureState.q) {
                if (panelFeatureState.g == null) {
                    a(panelFeatureState);
                    if (panelFeatureState.g == null) {
                        return;
                    }
                } else if (panelFeatureState.q && panelFeatureState.g.getChildCount() > 0) {
                    panelFeatureState.g.removeAllViews();
                }
                if (!c(panelFeatureState) || !panelFeatureState.a()) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = panelFeatureState.h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                panelFeatureState.g.setBackgroundResource(panelFeatureState.b);
                ViewParent parent = panelFeatureState.h.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(panelFeatureState.h);
                }
                panelFeatureState.g.addView(panelFeatureState.h, layoutParams2);
                if (!panelFeatureState.h.hasFocus()) {
                    panelFeatureState.h.requestFocus();
                }
            } else if (panelFeatureState.i != null && (layoutParams = panelFeatureState.i.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                panelFeatureState.n = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.c;
                layoutParams3.windowAnimations = panelFeatureState.f;
                windowManager.addView(panelFeatureState.g, layoutParams3);
                panelFeatureState.o = true;
            }
            i = -2;
            panelFeatureState.n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.d, panelFeatureState.e, 1002, 8519680, -3);
            layoutParams32.gravity = panelFeatureState.c;
            layoutParams32.windowAnimations = panelFeatureState.f;
            windowManager.addView(panelFeatureState.g, layoutParams32);
            panelFeatureState.o = true;
        }
    }

    private boolean a(PanelFeatureState panelFeatureState) {
        panelFeatureState.a(m());
        panelFeatureState.g = new c(panelFeatureState.l);
        panelFeatureState.c = 81;
        return true;
    }

    private boolean b(PanelFeatureState panelFeatureState) {
        Context context = this.b;
        if ((panelFeatureState.a == 0 || panelFeatureState.a == 108) && this.w != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                android.support.v7.view.d dVar = new android.support.v7.view.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.a(this);
        panelFeatureState.a(menuBuilder);
        return true;
    }

    private boolean c(PanelFeatureState panelFeatureState) {
        if (panelFeatureState.i != null) {
            panelFeatureState.h = panelFeatureState.i;
            return true;
        } else if (panelFeatureState.j == null) {
            return false;
        } else {
            if (this.y == null) {
                this.y = new d();
            }
            panelFeatureState.h = (View) panelFeatureState.a(this.y);
            return panelFeatureState.h != null;
        }
    }

    final void b(MenuBuilder menuBuilder) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.w.h();
        Window.Callback callback = this.c.getCallback();
        if (callback != null && !this.n) {
            callback.onPanelClosed(108, menuBuilder);
        }
        this.F = false;
    }

    final void e(int i) {
        a(a(0, true), true);
    }

    final void a(PanelFeatureState panelFeatureState, boolean z) {
        if (z && panelFeatureState.a == 0 && this.w != null && this.w.c()) {
            b(panelFeatureState.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.b.getSystemService("window");
        if (windowManager != null && panelFeatureState.o && panelFeatureState.g != null) {
            windowManager.removeView(panelFeatureState.g);
            if (z) {
                a(panelFeatureState.a, panelFeatureState, (Menu) null);
            }
        }
        panelFeatureState.m = false;
        panelFeatureState.n = false;
        panelFeatureState.o = false;
        panelFeatureState.h = null;
        panelFeatureState.q = true;
        if (this.H == panelFeatureState) {
            this.H = null;
        }
    }

    final void a(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0 && i < this.G.length) {
                panelFeatureState = this.G[i];
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.o) && !this.n) {
            this.d.onPanelClosed(i, menu);
        }
    }

    final PanelFeatureState a(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.G;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final PanelFeatureState a(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.G;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.G = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState == null) {
            PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
            panelFeatureStateArr[i] = panelFeatureState2;
            return panelFeatureState2;
        }
        return panelFeatureState;
    }

    private boolean a(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.m || b(panelFeatureState, keyEvent)) && panelFeatureState.j != null) {
            return panelFeatureState.j.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    private void d(int i) {
        this.u = (1 << i) | this.u;
        if (this.t) {
            return;
        }
        ViewCompat.postOnAnimation(this.c.getDecorView(), this.J);
        this.t = true;
    }

    final void f(int i) {
        PanelFeatureState a2;
        PanelFeatureState a3 = a(i, true);
        if (a3.j != null) {
            Bundle bundle = new Bundle();
            a3.j.c(bundle);
            if (bundle.size() > 0) {
                a3.s = bundle;
            }
            a3.j.d();
            a3.j.clear();
        }
        a3.r = true;
        a3.q = true;
        if ((i != 108 && i != 0) || this.w == null || (a2 = a(0, false)) == null) {
            return;
        }
        a2.m = false;
        b(a2, (KeyEvent) null);
    }

    final int g(int i) {
        boolean z;
        boolean z2;
        if (this.p == null || !(this.p.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.L == null) {
                    this.L = new Rect();
                    this.M = new Rect();
                }
                Rect rect = this.L;
                Rect rect2 = this.M;
                rect.set(0, i, 0, 0);
                bd.a(this.A, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.C == null) {
                        this.C = new View(this.b);
                        this.C.setBackgroundColor(this.b.getResources().getColor(R.color.abc_input_method_navigation_guard));
                        this.A.addView(this.C, -1, new ViewGroup.LayoutParams(-1, i));
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.C.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.C.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = this.C != null;
                if (!this.k && z) {
                    i = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        if (this.C != null) {
            this.C.setVisibility(z ? 0 : 8);
        }
        return i;
    }

    private void v() {
        if (this.z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    final void r() {
        if (this.w != null) {
            this.w.h();
        }
        if (this.q != null) {
            this.c.getDecorView().removeCallbacks(this.r);
            if (this.q.isShowing()) {
                try {
                    p.b(this.q);
                } catch (IllegalArgumentException unused) {
                }
            }
            this.q = null;
        }
        q();
        PanelFeatureState a2 = a(0, false);
        if (a2 == null || a2.j == null) {
            return;
        }
        a2.j.close();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    class b implements b.a {
        private b.a b;

        public b(b.a aVar) {
            this.b = aVar;
        }

        @Override // android.support.v7.view.b.a
        public final boolean a(android.support.v7.view.b bVar, Menu menu) {
            return this.b.a(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public final boolean b(android.support.v7.view.b bVar, Menu menu) {
            return this.b.b(bVar, menu);
        }

        @Override // android.support.v7.view.b.a
        public final boolean a(android.support.v7.view.b bVar, MenuItem menuItem) {
            return this.b.a(bVar, menuItem);
        }

        @Override // android.support.v7.view.b.a
        public final void a(android.support.v7.view.b bVar) {
            this.b.a(bVar);
            if (AppCompatDelegateImplV9.this.q != null) {
                AppCompatDelegateImplV9.this.c.getDecorView().removeCallbacks(AppCompatDelegateImplV9.this.r);
            }
            if (AppCompatDelegateImplV9.this.p != null) {
                AppCompatDelegateImplV9.this.q();
                AppCompatDelegateImplV9.this.s = ViewCompat.animate(AppCompatDelegateImplV9.this.p).alpha(0.0f);
                AppCompatDelegateImplV9.this.s.setListener(new ViewPropertyAnimatorListenerAdapter() { // from class: android.support.v7.app.AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1
                    @Override // android.support.v4.view.ViewPropertyAnimatorListenerAdapter, android.support.v4.view.ViewPropertyAnimatorListener
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImplV9.this.p.setVisibility(8);
                        if (AppCompatDelegateImplV9.this.q != null) {
                            p.b(AppCompatDelegateImplV9.this.q);
                        } else if (AppCompatDelegateImplV9.this.p.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImplV9.this.p.getParent());
                        }
                        AppCompatDelegateImplV9.this.p.removeAllViews();
                        AppCompatDelegateImplV9.this.s.setListener(null);
                        AppCompatDelegateImplV9.this.s = null;
                    }
                });
            }
            if (AppCompatDelegateImplV9.this.f != null) {
                AppCompatDelegateImplV9.this.f.onSupportActionModeFinished(AppCompatDelegateImplV9.this.o);
            }
            AppCompatDelegateImplV9.this.o = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class d implements j.a {
        d() {
        }

        @Override // android.support.v7.view.menu.j.a
        public final void a(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder i = menuBuilder.i();
            boolean z2 = i != menuBuilder;
            AppCompatDelegateImplV9 appCompatDelegateImplV9 = AppCompatDelegateImplV9.this;
            if (z2) {
                menuBuilder = i;
            }
            PanelFeatureState a = appCompatDelegateImplV9.a((Menu) menuBuilder);
            if (a != null) {
                if (z2) {
                    AppCompatDelegateImplV9.this.a(a.a, a, i);
                    AppCompatDelegateImplV9.this.a(a, true);
                    return;
                }
                AppCompatDelegateImplV9.this.a(a, z);
            }
        }

        @Override // android.support.v7.view.menu.j.a
        public final boolean a(MenuBuilder menuBuilder) {
            Window.Callback callback;
            if (menuBuilder != null || !AppCompatDelegateImplV9.this.i || (callback = AppCompatDelegateImplV9.this.c.getCallback()) == null || AppCompatDelegateImplV9.this.n) {
                return true;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public final class a implements j.a {
        a() {
        }

        @Override // android.support.v7.view.menu.j.a
        public final boolean a(MenuBuilder menuBuilder) {
            Window.Callback callback = AppCompatDelegateImplV9.this.c.getCallback();
            if (callback != null) {
                callback.onMenuOpened(108, menuBuilder);
                return true;
            }
            return true;
        }

        @Override // android.support.v7.view.menu.j.a
        public final void a(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImplV9.this.b(menuBuilder);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class PanelFeatureState {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        MenuBuilder j;
        android.support.v7.view.menu.d k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        PanelFeatureState(int i) {
            this.a = i;
        }

        public final boolean a() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.d().getCount() > 0;
        }

        final void a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(2131558920, true);
            }
            android.support.v7.view.d dVar = new android.support.v7.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842839, 16842926, R.attr.windowActionBar, R.attr.windowNoTitle, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedWidthMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMinor, R.attr.windowFixedHeightMajor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.actionBarTabStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabTextStyle, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.actionBarPopupTheme, R.attr.actionBarStyle, R.attr.actionBarSplitStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionBarSize, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeStyle, R.attr.actionModeCloseButtonStyle, R.attr.actionModeBackground, R.attr.actionModeSplitBackground, R.attr.actionModeCloseDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModePasteDrawable, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeFindDrawable, R.attr.actionModeWebSearchDrawable, R.attr.actionModePopupWindowStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceSmallPopupMenu, R.attr.textAppearancePopupMenuHeader, R.attr.dialogTheme, R.attr.dialogPreferredPadding, R.attr.listDividerAlertDialog, R.attr.actionDropDownStyle, R.attr.dropdownListPreferredItemHeight, R.attr.spinnerDropDownItemStyle, R.attr.homeAsUpIndicator, R.attr.actionButtonStyle, R.attr.buttonBarStyle, R.attr.buttonBarButtonStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.borderlessButtonStyle, R.attr.dividerVertical, R.attr.dividerHorizontal, R.attr.activityChooserViewStyle, R.attr.toolbarStyle, R.attr.toolbarNavigationButtonStyle, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.editTextColor, R.attr.editTextBackground, R.attr.imageButtonStyle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSearchResultSubtitle, R.attr.textColorSearchUrl, R.attr.searchViewStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.dropDownListViewStyle, R.attr.listPopupWindowStyle, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.panelBackground, R.attr.panelMenuListWidth, R.attr.panelMenuListTheme, R.attr.listChoiceBackgroundIndicator, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorAccent, R.attr.colorControlNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorButtonNormal, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.colorBackgroundFloating, R.attr.alertDialogStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogTheme, R.attr.textColorAlertDialogListItem, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.autoCompleteTextViewStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.editTextStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.seekBarStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.listMenuViewStyle, R.attr.tooltipFrameBackground, R.attr.tooltipForegroundColor, R.attr.colorError});
            this.b = obtainStyledAttributes.getResourceId(80, 0);
            this.f = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }

        final void a(MenuBuilder menuBuilder) {
            if (menuBuilder == this.j) {
                return;
            }
            if (this.j != null) {
                this.j.b(this.k);
            }
            this.j = menuBuilder;
            if (menuBuilder == null || this.k == null) {
                return;
            }
            menuBuilder.a(this.k);
        }

        final android.support.v7.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                this.k = new android.support.v7.view.menu.d(this.l, (int) R.layout.abc_list_menu_item_layout);
                this.k.h = aVar;
                this.j.a(this.k);
            }
            return this.k.a(this.g);
        }

        /* compiled from: ProGuard */
        /* loaded from: classes.dex */
        static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.app.AppCompatDelegateImplV9.PanelFeatureState.SavedState.1
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, null);
                }
            };
            int a;
            boolean b;
            Bundle c;

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            SavedState() {
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b ? 1 : 0);
                if (this.b) {
                    parcel.writeBundle(this.c);
                }
            }

            static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.a = parcel.readInt();
                savedState.b = parcel.readInt() == 1;
                if (savedState.b) {
                    savedState.c = parcel.readBundle(classLoader);
                }
                return savedState;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class c extends ContentFrameLayout {
        public c(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImplV9.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImplV9.this.e(0);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(android.support.v7.content.res.b.b(getContext(), i));
        }
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
        PanelFeatureState a2;
        Window.Callback callback = this.c.getCallback();
        if (callback == null || this.n || (a2 = a((Menu) menuBuilder.i())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(a2.a, menuItem);
    }

    @Override // android.support.v7.view.menu.MenuBuilder.a
    public void a(MenuBuilder menuBuilder) {
        if (this.w == null || !this.w.b() || (ViewConfiguration.get(this.b).hasPermanentMenuKey() && !this.w.d())) {
            PanelFeatureState a2 = a(0, true);
            a2.q = true;
            a(a2, false);
            a(a2, (KeyEvent) null);
            return;
        }
        Window.Callback callback = this.c.getCallback();
        if (this.w.c()) {
            this.w.f();
            if (this.n) {
                return;
            }
            callback.onPanelClosed(108, a(0, true).j);
        } else if (callback == null || this.n) {
        } else {
            if (this.t && (this.u & 1) != 0) {
                this.c.getDecorView().removeCallbacks(this.J);
                this.J.run();
            }
            PanelFeatureState a3 = a(0, true);
            if (a3.j == null || a3.r || !callback.onPreparePanel(0, a3.i, a3.j)) {
                return;
            }
            callback.onMenuOpened(108, a3.j);
            this.w.e();
        }
    }

    private boolean b(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        if (this.n) {
            return false;
        }
        if (panelFeatureState.m) {
            return true;
        }
        if (this.H != null && this.H != panelFeatureState) {
            a(this.H, false);
        }
        Window.Callback callback = this.c.getCallback();
        if (callback != null) {
            panelFeatureState.i = callback.onCreatePanelView(panelFeatureState.a);
        }
        boolean z = panelFeatureState.a == 0 || panelFeatureState.a == 108;
        if (z && this.w != null) {
            this.w.g();
        }
        if (panelFeatureState.i == null && (!z || !(this.g instanceof k))) {
            if (panelFeatureState.j == null || panelFeatureState.r) {
                if (panelFeatureState.j == null) {
                    b(panelFeatureState);
                    if (panelFeatureState.j == null) {
                        return false;
                    }
                }
                if (z && this.w != null) {
                    if (this.x == null) {
                        this.x = new a();
                    }
                    this.w.a(panelFeatureState.j, this.x);
                }
                panelFeatureState.j.d();
                if (!callback.onCreatePanelMenu(panelFeatureState.a, panelFeatureState.j)) {
                    panelFeatureState.a((MenuBuilder) null);
                    if (z && this.w != null) {
                        this.w.a(null, this.x);
                    }
                    return false;
                }
                panelFeatureState.r = false;
            }
            panelFeatureState.j.d();
            if (panelFeatureState.s != null) {
                panelFeatureState.j.d(panelFeatureState.s);
                panelFeatureState.s = null;
            }
            if (!callback.onPreparePanel(0, panelFeatureState.i, panelFeatureState.j)) {
                if (z && this.w != null) {
                    this.w.a(null, this.x);
                }
                panelFeatureState.j.e();
                return false;
            }
            panelFeatureState.p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.j.setQwertyMode(panelFeatureState.p);
            panelFeatureState.j.e();
        }
        panelFeatureState.m = true;
        panelFeatureState.n = false;
        this.H = panelFeatureState;
        return true;
    }
}
