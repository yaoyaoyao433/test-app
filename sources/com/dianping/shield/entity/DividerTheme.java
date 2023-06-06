package com.dianping.shield.entity;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum DividerTheme {
    DEFAULT_DIVIDER,
    DEFAULT_LEFT_OFFSET,
    DEFAULT_RIGHT_OFFSET,
    DEFAULT_SECTION_DIVIDER,
    DEFAULT_SECTION_DIVIDER_OFFSET,
    DEFAULT_SECTION_TOP_DIVIDER,
    DEFAULT_SECTION_BOTTOM_DIVIDER,
    DEFAULT_HEADER_HEIGHT,
    DEFAULT_FOOTER_HEIGHT,
    FIRST_HEADER_EXTRA_HEIGHT,
    LAST_FOOTER_EXTRA_HEIGHT,
    NEED_ADD_LAST_FOOTER,
    NEED_ADD_FIRST_HEADER,
    DEFAULT_SPACE_DRAWABLE,
    ENABLE_DIVIDER,
    DEFAULT_HEADER_BACKGROUND_COLOR,
    DEFAULT_FOOTER_BACKGROUND_COLOR;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    DividerTheme() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee339e1c4d75447fde44ff2bd972152b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee339e1c4d75447fde44ff2bd972152b");
        }
    }

    public static DividerTheme valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5d19eaacb7870eb3141d603d7f88cf2d", RobustBitConfig.DEFAULT_VALUE) ? (DividerTheme) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5d19eaacb7870eb3141d603d7f88cf2d") : (DividerTheme) Enum.valueOf(DividerTheme.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DividerTheme[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0901966ca3892c2d40a1dd6489cc5fef", RobustBitConfig.DEFAULT_VALUE) ? (DividerTheme[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0901966ca3892c2d40a1dd6489cc5fef") : (DividerTheme[]) values().clone();
    }
}
