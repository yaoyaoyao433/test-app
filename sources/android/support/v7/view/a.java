package android.support.v7.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class a {
    public Context a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.a = context;
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    public final boolean b() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final int c() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, new int[]{R.attr.background, R.attr.height, R.attr.title, R.attr.navigationMode, R.attr.displayOptions, R.attr.subtitle, R.attr.titleTextStyle, R.attr.subtitleTextStyle, R.attr.icon, R.attr.logo, R.attr.divider, R.attr.backgroundStacked, R.attr.backgroundSplit, R.attr.customNavigationLayout, R.attr.homeLayout, R.attr.progressBarStyle, R.attr.indeterminateProgressStyle, R.attr.progressBarPadding, R.attr.itemPadding, R.attr.hideOnContentScroll, R.attr.contentInsetStart, R.attr.contentInsetEnd, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStartWithNavigation, R.attr.contentInsetEndWithActions, R.attr.elevation, R.attr.popupTheme, R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(1, 0);
        Resources resources = this.a.getResources();
        if (!b()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final boolean d() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int e() {
        return this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
