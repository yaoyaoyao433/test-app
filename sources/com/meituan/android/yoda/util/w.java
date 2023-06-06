package com.meituan.android.yoda.util;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.Toolbar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class w {
    public static ChangeQuickRedirect a;
    private Activity b;
    private Toolbar c;

    private w(Activity activity, Toolbar toolbar) {
        Object[] objArr = {activity, toolbar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91feb332f837f71a77e3067043000643", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91feb332f837f71a77e3067043000643");
            return;
        }
        this.b = activity;
        this.c = toolbar;
    }

    public static w a(Activity activity, Toolbar toolbar) {
        Object[] objArr = {activity, toolbar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a818f29ba5529c79f6876d820dd2798", RobustBitConfig.DEFAULT_VALUE) ? (w) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a818f29ba5529c79f6876d820dd2798") : new w(activity, toolbar);
    }

    public final w a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c64a4e1d628c23345df4a442500dedc", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c64a4e1d628c23345df4a442500dedc");
        }
        this.c.setNavigationIcon(c());
        return this;
    }

    public final w b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a3121a1d47b66d0e274499af74d1c5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a3121a1d47b66d0e274499af74d1c5d");
        }
        if (!com.meituan.android.yoda.config.ui.d.a().a()) {
            this.c.setBackground(com.meituan.android.yoda.config.ui.d.a().i());
        }
        return this;
    }

    private Drawable c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb1ab1ecbc4e06834483c652794a0b9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb1ab1ecbc4e06834483c652794a0b9a");
        }
        if (!com.meituan.android.yoda.config.ui.d.a().a()) {
            com.meituan.android.yoda.widget.drawable.a a2 = new com.meituan.android.yoda.widget.drawable.a().a(com.meituan.android.yoda.config.ui.d.a().h()).a(20.0f);
            JSONObject d = com.meituan.android.yoda.config.ui.d.a().d();
            if (d.has("naviBarItemColor")) {
                try {
                    String string = d.getString("naviBarItemColor");
                    if (!string.startsWith("#")) {
                        string = "#" + string;
                    }
                    a2.a(Color.parseColor(string));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            return a2;
        }
        v a3 = v.a(this.b, new int[]{16842927, 16843072, R.attr.title, R.attr.subtitle, R.attr.logo, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.popupTheme, R.attr.titleTextAppearance, R.attr.subtitleTextAppearance, R.attr.titleMargin, R.attr.titleMarginStart, R.attr.titleMarginEnd, R.attr.titleMarginTop, R.attr.titleMarginBottom, R.attr.titleMargins, R.attr.maxButtonHeight, R.attr.buttonGravity, R.attr.collapseIcon, R.attr.collapseContentDescription, R.attr.navigationIcon, R.attr.navigationContentDescription, R.attr.logoDescription, R.attr.titleTextColor, R.attr.subtitleTextColor});
        Drawable a4 = a3.a(24);
        a3.a();
        if (a4 != null) {
            return a4;
        }
        v a5 = v.a(this.b, new int[]{R.attr.yodaSnackBar, R.attr.yodaToolbarNavigationIconColor, R.attr.yodaToolbarTitleStyle, R.attr.yodaToolbarBackgroundDrawable, R.attr.yodaContainerBackgroundDrawable, R.attr.yodaTextInputViewStyle, R.attr.yodaCursorColor, R.attr.yodaFrameColor, R.attr.yodaButtonLinkStyle, R.attr.yodaVerifyButtonStyle, R.attr.yodaTextColorPrimary, R.attr.yodaTextColorSecondary, R.attr.yodaTextColorThird, R.attr.yodaDialogBackgroundDrawable, R.attr.yodaDialogSlideErrorBackgroundDrawable, R.attr.yodaSlideDialogTitle, R.attr.yodaSlideProgressDrawable, R.attr.yodaSlideKeyDrawable, R.attr.yodaSlideSuccessDrawable, R.attr.yodaSlideFailedDrawable, R.attr.yodaNineDiagramDividerDrawable, R.attr.yodaNineDiagramDividerWidth, R.attr.yodaNineDiagramDividerHeight, R.attr.yodaNineDiagramCloseDrawable, R.attr.yodaNineDiagramTextColor, R.attr.yodaVoiceVerifyTintColor, R.attr.yodaVoiceVerifyGradientStart, R.attr.yodaVoiceVerifyGradientEnd, R.attr.yodaVerifyButtonEnableGradientStart, R.attr.yodaVerifyButtonEnableGradientEnd, R.attr.yodaVerifyButtonDisableGradientStart, R.attr.yodaVerifyButtonDisableGradientEnd, R.attr.yodaToolbarButtonTextColor, R.attr.yodaSlideDialogIconKeyTintColor, R.attr.yodaSlideDialogIconSuccessTintColor, R.attr.yodaSlideDialogIconFailureTintColor, R.attr.yodaCommonThemeColor, R.attr.yodaButtonTextColor});
        int b = a5.b(1, -1);
        a5.a();
        com.meituan.android.yoda.widget.drawable.a a6 = new com.meituan.android.yoda.widget.drawable.a().a(com.meituan.android.yoda.config.ui.d.a().h()).a(20.0f);
        JSONObject d2 = com.meituan.android.yoda.config.ui.d.a().d();
        if (d2 != null && d2.has("naviBarItemColor")) {
            try {
                String string2 = d2.getString("naviBarItemColor");
                if (!string2.startsWith("#")) {
                    string2 = "#" + string2;
                }
                a6.a(Color.parseColor(string2));
                return a6;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (b != -1) {
            return new com.meituan.android.yoda.widget.drawable.a().a(b).a(20.0f);
        }
        return new com.meituan.android.yoda.widget.drawable.a().a(com.meituan.android.yoda.config.ui.d.a().g()).a(20.0f);
    }
}
