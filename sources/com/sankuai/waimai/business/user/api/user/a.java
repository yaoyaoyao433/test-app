package com.sankuai.waimai.business.user.api.user;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;
    public static long c;
    public static boolean d;

    public static void a(Context context, String str) {
        List<String> arrayList;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66cf4824827f908ecafdad44faa68f31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66cf4824827f908ecafdad44faa68f31");
        } else if (!TextUtils.isEmpty(str)) {
            String b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "accounts", "");
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "ad46789347aec95be7154c9b45b8de8b", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "ad46789347aec95be7154c9b45b8de8b");
            } else {
                arrayList = new ArrayList();
                String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(context, "accounts", "");
                if (!TextUtils.isEmpty(b3)) {
                    String[] split = b3.split("&");
                    int length = split.length;
                    for (int i = 0; i < length; i++) {
                        String str2 = split[i];
                        if (str2 != null && str2.length() != 0 && !"[]".equals(str2)) {
                            if (str2.contains("[")) {
                                int indexOf = str2.indexOf("[");
                                int indexOf2 = str2.indexOf(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                                str2 = str2.substring(0, indexOf) + str2.substring(indexOf + 1, indexOf2) + str2.substring(indexOf2 + 1, str2.length());
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                arrayList.add(str2);
                            }
                        }
                    }
                }
            }
            for (String str3 : arrayList) {
                if (TextUtils.equals(str3, str)) {
                    return;
                }
            }
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a(context, "accounts", b2 + "&" + str);
        }
    }
}
