package com.sankuai.waimai.ugc.creator.utils;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c249df0c43a15afe9100945040683aab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c249df0c43a15afe9100945040683aab");
        } else if (view == null || view.getVisibility() != 0) {
        } else {
            view.setEnabled(false);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(j);
            view.startAnimation(alphaAnimation);
            view.setVisibility(8);
        }
    }
}
