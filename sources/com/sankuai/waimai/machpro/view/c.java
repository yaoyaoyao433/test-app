package com.sankuai.waimai.machpro.view;

import android.view.View;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements YogaMeasureFunction {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.yoga.YogaMeasureFunction
    public final long measure(d dVar, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        Object[] objArr = {dVar, Float.valueOf(f), yogaMeasureMode, Float.valueOf(f2), yogaMeasureMode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5dcab2efddb38e67d7b85971455fea2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5dcab2efddb38e67d7b85971455fea2")).longValue();
        }
        View view = (View) dVar.w();
        if (view != null && !(view instanceof a)) {
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f, a(yogaMeasureMode)), View.MeasureSpec.makeMeasureSpec((int) f2, a(yogaMeasureMode2)));
            return com.facebook.yoga.c.a(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        float f3 = 0;
        return com.facebook.yoga.c.a(f3, f3);
    }

    private int a(YogaMeasureMode yogaMeasureMode) {
        Object[] objArr = {yogaMeasureMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f54ca7316a73569748e017c6b7e20fdb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f54ca7316a73569748e017c6b7e20fdb")).intValue();
        }
        if (yogaMeasureMode == YogaMeasureMode.AT_MOST) {
            return Integer.MIN_VALUE;
        }
        return yogaMeasureMode == YogaMeasureMode.EXACTLY ? 1073741824 : 0;
    }
}
