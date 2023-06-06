package com.dianping.shield.entity;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class PageDividerThemeParams {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DividerTheme dividerTheme;
    private Object params;

    public PageDividerThemeParams(DividerTheme dividerTheme, Object obj) {
        Object[] objArr = {dividerTheme, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "277c7c41054bdd3f70fe3d819359fb50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "277c7c41054bdd3f70fe3d819359fb50");
            return;
        }
        this.dividerTheme = dividerTheme;
        this.params = obj;
    }

    public static PageDividerThemeParams dividerDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a510f29188000c5d9bc9a016aec120d", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a510f29188000c5d9bc9a016aec120d") : new PageDividerThemeParams(DividerTheme.DEFAULT_DIVIDER, drawable);
    }

    public static PageDividerThemeParams dividerLeftOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4b99314961bf50878183de295ce2cd1", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4b99314961bf50878183de295ce2cd1") : new PageDividerThemeParams(DividerTheme.DEFAULT_LEFT_OFFSET, Integer.valueOf(i));
    }

    public static PageDividerThemeParams dividerRightOffset(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bf252e2520cafbac3659ff9657fde1e", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bf252e2520cafbac3659ff9657fde1e") : new PageDividerThemeParams(DividerTheme.DEFAULT_RIGHT_OFFSET, Integer.valueOf(i));
    }

    public static PageDividerThemeParams sectionDivider(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a42fe7fa6f42727473c50ee114cd6a11", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a42fe7fa6f42727473c50ee114cd6a11") : new PageDividerThemeParams(DividerTheme.DEFAULT_SECTION_DIVIDER, drawable);
    }

    public static PageDividerThemeParams sectioinDividerOffset(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "267060c6d597f9d45f00d9d9551e1bc7", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "267060c6d597f9d45f00d9d9551e1bc7") : new PageDividerThemeParams(DividerTheme.DEFAULT_SECTION_DIVIDER_OFFSET, rect);
    }

    public static PageDividerThemeParams sectionTopDivider(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c3c8b52e640d4556db3916a61d684c1d", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c3c8b52e640d4556db3916a61d684c1d") : new PageDividerThemeParams(DividerTheme.DEFAULT_SECTION_TOP_DIVIDER, drawable);
    }

    public static PageDividerThemeParams sectionBottomDivider(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "778493ba6c8f97d5c943d6d00cf28119", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "778493ba6c8f97d5c943d6d00cf28119") : new PageDividerThemeParams(DividerTheme.DEFAULT_SECTION_BOTTOM_DIVIDER, drawable);
    }

    public static PageDividerThemeParams headerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a092e3e17f459ab46622149456aa976", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a092e3e17f459ab46622149456aa976") : new PageDividerThemeParams(DividerTheme.DEFAULT_HEADER_HEIGHT, Integer.valueOf(i));
    }

    public static PageDividerThemeParams footerHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "983b88737a01bb6c070a23d7ff059d70", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "983b88737a01bb6c070a23d7ff059d70") : new PageDividerThemeParams(DividerTheme.DEFAULT_FOOTER_HEIGHT, Integer.valueOf(i));
    }

    public static PageDividerThemeParams firstHeaderExtraHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6ae4d079b06710459b08a1125c7430fd", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6ae4d079b06710459b08a1125c7430fd") : new PageDividerThemeParams(DividerTheme.FIRST_HEADER_EXTRA_HEIGHT, Integer.valueOf(i));
    }

    public static PageDividerThemeParams lastFooterExtraHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bd024573c61c0f3ac1a05b17e2dab70a", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bd024573c61c0f3ac1a05b17e2dab70a") : new PageDividerThemeParams(DividerTheme.LAST_FOOTER_EXTRA_HEIGHT, Integer.valueOf(i));
    }

    public static PageDividerThemeParams needLastFooter(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dab9e69e0c83da0dce14f1724e980ca", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dab9e69e0c83da0dce14f1724e980ca") : new PageDividerThemeParams(DividerTheme.NEED_ADD_LAST_FOOTER, Boolean.valueOf(z));
    }

    public static PageDividerThemeParams needFirstHeader(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4b680b9885cc01b37d0dcc17a6e86672", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4b680b9885cc01b37d0dcc17a6e86672") : new PageDividerThemeParams(DividerTheme.NEED_ADD_FIRST_HEADER, Boolean.valueOf(z));
    }

    public static PageDividerThemeParams spaceDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e96d6c60c6da972a6901cc59ec2c1d61", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e96d6c60c6da972a6901cc59ec2c1d61") : new PageDividerThemeParams(DividerTheme.DEFAULT_SPACE_DRAWABLE, drawable);
    }

    public static PageDividerThemeParams enableDivider(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d0d6e0b529dd7cb5bab63f943224393c", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d0d6e0b529dd7cb5bab63f943224393c") : new PageDividerThemeParams(DividerTheme.ENABLE_DIVIDER, Boolean.valueOf(z));
    }

    public DividerTheme getDividerTheme() {
        return this.dividerTheme;
    }

    public Object getParams() {
        return this.params;
    }

    public static PageDividerThemeParams headerDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "251050cd2bdae3276ab08bf4d32ad942", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "251050cd2bdae3276ab08bf4d32ad942") : new PageDividerThemeParams(DividerTheme.DEFAULT_HEADER_BACKGROUND_COLOR, drawable);
    }

    public static PageDividerThemeParams footerDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8322e646f3cb3438253a7b2b1ccec880", RobustBitConfig.DEFAULT_VALUE) ? (PageDividerThemeParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8322e646f3cb3438253a7b2b1ccec880") : new PageDividerThemeParams(DividerTheme.DEFAULT_FOOTER_BACKGROUND_COLOR, drawable);
    }
}
