package com.meituan.android.yoda.config.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.yoda.util.v;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e extends com.meituan.android.yoda.config.ui.a {
    public static ChangeQuickRedirect n = null;
    private static final String o = "e";
    private WeakReference<Drawable> A;
    private a B;
    private WeakReference<Drawable> C;
    private a D;
    private WeakReference<Drawable> E;
    private a F;
    private a G;
    private WeakReference<Drawable> H;
    private a I;
    private a J;
    private a K;
    private a L;
    private a M;
    private a N;
    private b p;
    private int q;
    private String r;
    private JSONObject s;
    private String t;
    private String u;
    private int v;
    private boolean w;
    private a x;
    private WeakReference<Drawable> y;
    private a z;

    public e(@NonNull Context context, b bVar) {
        boolean z;
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca604deb5f637db768b2a69704be46a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca604deb5f637db768b2a69704be46a5");
            return;
        }
        this.q = -1;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = 0;
        this.w = true;
        this.x = null;
        this.z = null;
        this.B = null;
        this.D = null;
        this.F = null;
        this.G = null;
        this.p = bVar;
        if (this.p != null) {
            this.r = this.p.c();
            this.t = this.p.e();
            int b = bVar.b();
            Object[] objArr2 = {context, Integer.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect2 = n;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8d0c96c34b8eec022e85c8539d41783", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8d0c96c34b8eec022e85c8539d41783");
            } else if (b != this.q) {
                this.q = b;
                Object[] objArr3 = {context, Integer.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect3 = n;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9718211c4b380b2557f467a113b028d0", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9718211c4b380b2557f467a113b028d0")).booleanValue();
                } else {
                    if (b != -1) {
                        v a2 = v.a(context, null, new int[]{R.attr.yoda_status_backArrow_color, R.attr.yoda_status_title_color, R.attr.yoda_status_background_color, R.attr.yoda_frame_color, R.attr.yoda_cursor_color, R.attr.yoda_text_color, R.attr.yoda_background_active_color, R.attr.yoda_background_normal_color, R.attr.yoda_background_ban_color, R.attr.yoda_button_background_drawable}, 0, b);
                        int a3 = a2.a(2, -1);
                        a2.a();
                        if (a3 != -1) {
                            z = false;
                        }
                    }
                    z = true;
                }
                this.w = z;
                if (this.w) {
                    Object[] objArr4 = {context, Integer.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect4 = n;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "10e8a915122a9207f32689cd85aa69ce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "10e8a915122a9207f32689cd85aa69ce");
                    } else {
                        v a4 = v.a(context, null, new int[]{R.attr.yodaSnackBar, R.attr.yodaToolbarNavigationIconColor, R.attr.yodaToolbarTitleStyle, R.attr.yodaToolbarBackgroundDrawable, R.attr.yodaContainerBackgroundDrawable, R.attr.yodaTextInputViewStyle, R.attr.yodaCursorColor, R.attr.yodaFrameColor, R.attr.yodaButtonLinkStyle, R.attr.yodaVerifyButtonStyle, R.attr.yodaTextColorPrimary, R.attr.yodaTextColorSecondary, R.attr.yodaTextColorThird, R.attr.yodaDialogBackgroundDrawable, R.attr.yodaDialogSlideErrorBackgroundDrawable, R.attr.yodaSlideDialogTitle, R.attr.yodaSlideProgressDrawable, R.attr.yodaSlideKeyDrawable, R.attr.yodaSlideSuccessDrawable, R.attr.yodaSlideFailedDrawable, R.attr.yodaNineDiagramDividerDrawable, R.attr.yodaNineDiagramDividerWidth, R.attr.yodaNineDiagramDividerHeight, R.attr.yodaNineDiagramCloseDrawable, R.attr.yodaNineDiagramTextColor, R.attr.yodaVoiceVerifyTintColor, R.attr.yodaVoiceVerifyGradientStart, R.attr.yodaVoiceVerifyGradientEnd, R.attr.yodaVerifyButtonEnableGradientStart, R.attr.yodaVerifyButtonEnableGradientEnd, R.attr.yodaVerifyButtonDisableGradientStart, R.attr.yodaVerifyButtonDisableGradientEnd, R.attr.yodaToolbarButtonTextColor, R.attr.yodaSlideDialogIconKeyTintColor, R.attr.yodaSlideDialogIconSuccessTintColor, R.attr.yodaSlideDialogIconFailureTintColor, R.attr.yodaCommonThemeColor, R.attr.yodaButtonTextColor}, 0, b);
                        this.f = a4.a(1, -1);
                        this.i = a4.a(6, -1);
                        this.u = a4.b(15);
                        this.t = a4.b(0);
                        this.B = a(a4, 4);
                        this.D = a(a4, 13);
                        this.F = a(a4, 14);
                        this.G = a(a4, 16);
                        this.I = a(a4, 17);
                        this.J = a(a4, 18);
                        this.K = a(a4, 19);
                        this.L = a(a4, 20);
                        this.M = a(a4, 23);
                        this.N = a(a4, 24);
                        this.b = a4.b(36);
                        this.c = a4.b(37);
                        a4.a();
                        v a5 = v.a(context, null, new int[]{16842839, 16842926, R.attr.windowActionBar, R.attr.windowNoTitle, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedWidthMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMinor, R.attr.windowFixedHeightMajor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.actionBarTabStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabTextStyle, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.actionBarPopupTheme, R.attr.actionBarStyle, R.attr.actionBarSplitStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionBarSize, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeStyle, R.attr.actionModeCloseButtonStyle, R.attr.actionModeBackground, R.attr.actionModeSplitBackground, R.attr.actionModeCloseDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModePasteDrawable, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeFindDrawable, R.attr.actionModeWebSearchDrawable, R.attr.actionModePopupWindowStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceSmallPopupMenu, R.attr.textAppearancePopupMenuHeader, R.attr.dialogTheme, R.attr.dialogPreferredPadding, R.attr.listDividerAlertDialog, R.attr.actionDropDownStyle, R.attr.dropdownListPreferredItemHeight, R.attr.spinnerDropDownItemStyle, R.attr.homeAsUpIndicator, R.attr.actionButtonStyle, R.attr.buttonBarStyle, R.attr.buttonBarButtonStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.borderlessButtonStyle, R.attr.dividerVertical, R.attr.dividerHorizontal, R.attr.activityChooserViewStyle, R.attr.toolbarStyle, R.attr.toolbarNavigationButtonStyle, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.editTextColor, R.attr.editTextBackground, R.attr.imageButtonStyle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSearchResultSubtitle, R.attr.textColorSearchUrl, R.attr.searchViewStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.dropDownListViewStyle, R.attr.listPopupWindowStyle, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.panelBackground, R.attr.panelMenuListWidth, R.attr.panelMenuListTheme, R.attr.listChoiceBackgroundIndicator, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorAccent, R.attr.colorControlNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorButtonNormal, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.colorBackgroundFloating, R.attr.alertDialogStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogTheme, R.attr.textColorAlertDialogListItem, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.autoCompleteTextViewStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.editTextStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.seekBarStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.listMenuViewStyle, R.attr.tooltipFrameBackground, R.attr.tooltipForegroundColor, R.attr.colorError}, 0, b);
                        this.d = a5.a(84, -1);
                        this.e = a5.c(84, -1);
                        this.j = this.d;
                        a5.a();
                    }
                } else {
                    Object[] objArr5 = {context, Integer.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect5 = n;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e087dfa283d936e9e63816c5ef20489c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e087dfa283d936e9e63816c5ef20489c");
                    } else {
                        v a6 = v.a(context, null, new int[]{R.attr.yoda_status_backArrow_color, R.attr.yoda_status_title_color, R.attr.yoda_status_background_color, R.attr.yoda_frame_color, R.attr.yoda_cursor_color, R.attr.yoda_text_color, R.attr.yoda_background_active_color, R.attr.yoda_background_normal_color, R.attr.yoda_background_ban_color, R.attr.yoda_button_background_drawable}, 0, b);
                        this.f = a6.a(0, -1);
                        this.g = a6.a(1, -1);
                        this.x = a(a6, 2);
                        this.h = a6.a(3, -1);
                        this.j = a6.a(5, -1);
                        this.k = a6.a(6, -1);
                        this.l = a6.a(7, -1);
                        this.i = a6.a(4, -1);
                        if (this.i == -1) {
                            this.i = this.l;
                        }
                        this.m = a6.a(8, -1);
                        this.z = a(a6, 9);
                        this.L = a(a6, 20);
                        this.M = a(a6, 23);
                        this.N = a(a6, 24);
                        a6.a();
                        this.d = this.j;
                    }
                }
            }
            this.s = this.p.d();
            this.v = this.p.f();
            JSONObject jSONObject = this.s;
            Object[] objArr6 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect6 = n;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a85f92c34155fdec7332188e0a44c512", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a85f92c34155fdec7332188e0a44c512");
            } else if (jSONObject != null) {
                if (jSONObject.has("yodaCommonThemeColor")) {
                    String optString = jSONObject.optString("yodaCommonThemeColor");
                    if (!TextUtils.isEmpty(optString)) {
                        this.b = optString;
                    }
                }
                if (jSONObject.has("yodaButtonTextColor")) {
                    String optString2 = jSONObject.optString("yodaButtonTextColor");
                    if (TextUtils.isEmpty(optString2)) {
                        return;
                    }
                    this.c = optString2;
                }
            }
        }
    }

    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74b29173d69e86b46064b1f854f984a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74b29173d69e86b46064b1f854f984a6");
            return;
        }
        this.p = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.F = null;
        this.E = null;
        this.G = null;
        this.H = null;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.b
    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1940560ba4fd1e8a285a6eea6df03fa5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1940560ba4fd1e8a285a6eea6df03fa5")).intValue() : this.q != -1 ? this.q : super.b();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final boolean a() {
        return this.w;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "637b15fc4febd01a893b0e50577cf10e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "637b15fc4febd01a893b0e50577cf10e")).intValue() : this.f != -1 ? this.f : super.g();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ce2c873974b81680f141bab534f786a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ce2c873974b81680f141bab534f786a")).intValue() : this.g != -1 ? this.g : super.h();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final Drawable i() {
        Drawable a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e305751cd3853a9cc90ff2afc6c3597", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e305751cd3853a9cc90ff2afc6c3597");
        }
        if (this.y != null && this.y.get() != null) {
            return this.y.get();
        }
        if (this.x != null && (a2 = a(this.x)) != null) {
            this.y = new WeakReference<>(a2);
            return a2;
        }
        return super.i();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2cfa98b2681abe6f4086d097f640f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2cfa98b2681abe6f4086d097f640f2")).intValue() : this.j != -1 ? this.j : super.j();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2f00bec93a29a696093f7c64814501d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2f00bec93a29a696093f7c64814501d")).intValue() : this.k != -1 ? this.k : super.k();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5492785fc6e3978365a6a1c0c5560566", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5492785fc6e3978365a6a1c0c5560566")).intValue() : this.l != -1 ? this.l : super.l();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final int m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc31c3cf311bc557b5b70b6f66eb291", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc31c3cf311bc557b5b70b6f66eb291")).intValue() : this.m != -1 ? this.m : super.m();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final Drawable n() {
        Drawable a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38b74996add8d57f3407e16a4a6f8fea", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38b74996add8d57f3407e16a4a6f8fea");
        }
        if (this.A == null || this.A.get() == null) {
            if (this.z != null && (a2 = a(this.z)) != null) {
                this.A = new WeakReference<>(a2);
                return a2;
            }
            return super.n();
        }
        return this.A.get();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final Drawable o() {
        Drawable a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f6d090ed897b24230df7fb94503fea", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f6d090ed897b24230df7fb94503fea");
        }
        if (this.C != null && this.C.get() != null) {
            return this.C.get();
        }
        if (this.B != null && (a2 = a(this.B)) != null) {
            this.C = new WeakReference<>(a2);
            return a2;
        }
        return super.o();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.b
    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97eaa36587147d8e137d7c80bc19d661", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97eaa36587147d8e137d7c80bc19d661") : this.r == null ? super.c() : this.r;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.b
    public final JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d70ca58e2461dbc3e8b56a9043663126", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d70ca58e2461dbc3e8b56a9043663126") : this.s == null ? super.d() : this.s;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.b
    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c879c4bdb7e0a0c321aa6eb63e8a16b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c879c4bdb7e0a0c321aa6eb63e8a16b3") : this.t == null ? super.e() : this.t;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.b
    public final int f() {
        return this.v;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public int a;
        public int b;

        public a() {
            this.a = -1;
            this.b = -1;
        }
    }

    private a a(v vVar, int i) {
        Object[] objArr = {vVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba5012bc3a5704282ad2050d63c0c9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba5012bc3a5704282ad2050d63c0c9d");
        }
        a aVar = new a();
        aVar.a = vVar.c(i, -1);
        if (aVar.a == -1) {
            aVar.b = vVar.a(i, -1);
        }
        return aVar;
    }

    private Drawable a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = n;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd1a41cc855382fec06d8259987baeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd1a41cc855382fec06d8259987baeb");
        }
        if (aVar != null) {
            ColorDrawable c = aVar.a != -1 ? x.c(aVar.a) : null;
            if (c == null && aVar.b != -1) {
                try {
                    c = new ColorDrawable(aVar.b);
                } catch (Exception unused) {
                }
            }
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final String p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df91aca288b5fcced0125925bb26c368", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df91aca288b5fcced0125925bb26c368") : !TextUtils.isEmpty(this.b) ? this.b : super.p();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final String q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9b28927b04d8c160c5ba49034a9f520", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9b28927b04d8c160c5ba49034a9f520") : !TextUtils.isEmpty(this.c) ? this.c : super.q();
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final boolean r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea1f60dee39b1ec74b651e5462b8ca14", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea1f60dee39b1ec74b651e5462b8ca14")).booleanValue() : !TextUtils.isEmpty(this.b) && this.b.startsWith("#") && this.b.length() == 7;
    }

    @Override // com.meituan.android.yoda.config.ui.a, com.meituan.android.yoda.config.ui.c
    public final boolean s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = n;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d47e5965f5fa389e8ccaa8642d54bd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d47e5965f5fa389e8ccaa8642d54bd")).booleanValue() : !TextUtils.isEmpty(this.c) && this.c.startsWith("#") && this.c.length() == 7;
    }
}
