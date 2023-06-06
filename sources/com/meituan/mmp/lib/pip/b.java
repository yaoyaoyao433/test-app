package com.meituan.mmp.lib.pip;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public enum b {
    PAGE_RE_ENTER,
    PIP_OPEN_PAGE_RE_ENTER,
    PIP_CLOSE_BUTTON_CLICKED,
    EXIT_CLOSE_BY_BIZ_OPERATION,
    OTHER_VIDEO_AUTO_PLAY,
    OTHER_VIDEO_PLAY,
    PAGE_RE_LAUNCH,
    EXIT_PIP_CALLED,
    EXIT_MP_CLOSE_BUTTON_CLICKED,
    OTHERS;
    
    public static ChangeQuickRedirect a;

    b() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ac9562c3f57880aed226fb764d33c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ac9562c3f57880aed226fb764d33c8");
        }
    }

    public static b valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d6e96161ee8ca9d4bfd42a104e85b8d", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d6e96161ee8ca9d4bfd42a104e85b8d") : (b) Enum.valueOf(b.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static b[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94a7257dae343fef294dcf4edb4af9a3", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94a7257dae343fef294dcf4edb4af9a3") : (b[]) values().clone();
    }
}
