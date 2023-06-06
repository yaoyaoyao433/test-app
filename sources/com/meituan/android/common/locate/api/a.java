package com.meituan.android.common.locate.api;

import android.text.TextUtils;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class a {
    private static Map<String, Integer> a = new ConcurrentHashMap();
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(String str, Integer num) {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dd57531f237559ec196092b79980254", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dd57531f237559ec196092b79980254");
            return;
        }
        synchronized (a) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Integer num2 = a.get(str);
            if (num2 == null) {
                a.put(str, 1);
            } else {
                a.put(str, Integer.valueOf(num2.intValue() + 1));
            }
            LogUtils.a("InnerApiTimes:" + str);
            LogUtils.a("api times sApi:" + str + CommonConstant.Symbol.COMMA + LogUtils.b());
        }
    }
}
