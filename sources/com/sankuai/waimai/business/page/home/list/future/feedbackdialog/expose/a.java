package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;

    public static void a(Map<String, Object> map, Activity activity) {
        Object[] objArr = {map, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f0d1a131d94895231d71581ab2f4ef4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f0d1a131d94895231d71581ab2f4ef4f");
        } else {
            JudasManualManager.a("b_waimai_cgfylh9f_mc").a(b).a(activity).a(map).a();
        }
    }
}
