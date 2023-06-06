package com.meituan.android.finthirdpayadapter.utils;

import android.app.Activity;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static PayActionListener a(Activity activity) {
        List list;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f49df128a07baaaf635f7fa17232822", RobustBitConfig.DEFAULT_VALUE)) {
            return (PayActionListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f49df128a07baaaf635f7fa17232822");
        }
        ArrayList arrayList = new ArrayList();
        try {
            list = b.a(PayActionListener.class, "ThirdPayResultUtils", activity);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "ThirdPayUtils_getThirdPayResultUtils", (Map<String, Object>) null);
            list = arrayList;
        }
        if (i.a((Collection) list)) {
            return null;
        }
        return (PayActionListener) list.get(0);
    }

    public static void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04e1c452d518639920bb6e2ed5b5d9d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04e1c452d518639920bb6e2ed5b5d9d7");
            return;
        }
        PayActionListener a2 = a(activity);
        if (a2 != null) {
            PayFailInfo payFailInfo = new PayFailInfo();
            payFailInfo.setMsg(str);
            a2.a(str2, 12, payFailInfo);
        }
    }
}
