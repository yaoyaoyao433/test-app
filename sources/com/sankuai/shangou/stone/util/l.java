package com.sankuai.shangou.stone.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a = null;
    private static String b = "KeyBoardUtil";

    public static void a(View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60849b72f1654e2bd190d54bbb1c95c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60849b72f1654e2bd190d54bbb1c95c1");
            return;
        }
        try {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(view, 0);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    public static void b(View view, Context context) {
        Object[] objArr = {view, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e43da310b10f0a74d9a60717891bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e43da310b10f0a74d9a60717891bef");
            return;
        }
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}
