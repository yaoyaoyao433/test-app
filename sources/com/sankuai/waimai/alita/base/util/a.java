package com.sankuai.waimai.alita.base.util;

import android.support.annotation.NonNull;
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

    @NonNull
    public static List<String> a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "79ee095ce138c1c2430784fd10d6492a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "79ee095ce138c1c2430784fd10d6492a");
        }
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length == 0) {
            return arrayList;
        }
        while (true) {
            if (i >= split.length) {
                break;
            }
            String trim = split[i].trim();
            if ("*".equals(trim)) {
                arrayList.clear();
                arrayList.add("*");
                break;
            }
            arrayList.add(trim);
            i++;
        }
        return arrayList;
    }
}
