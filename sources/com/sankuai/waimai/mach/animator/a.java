package com.sankuai.waimai.mach.animator;

import com.meituan.android.recce.views.anim.RecceAnimUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.animator.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0998a {
        public static ChangeQuickRedirect a;

        public static boolean a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9d19f3de8ba37c8a1dd3d3afc785174", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9d19f3de8ba37c8a1dd3d3afc785174")).booleanValue() : RecceAnimUtils.TRANSLATION_X.equals(str) || RecceAnimUtils.TRANSLATION_Y.equals(str) || "translationZ".equals(str);
        }
    }
}
