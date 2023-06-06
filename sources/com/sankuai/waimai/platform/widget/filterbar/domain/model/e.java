package com.sankuai.waimai.platform.widget.filterbar.domain.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e implements Serializable {
    public static ChangeQuickRedirect a;

    public static String a(List<String> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6b2b2d548aa82ae2e93406d71463bcf7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6b2b2d548aa82ae2e93406d71463bcf7");
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                if (i == 0) {
                    sb.append(str);
                } else {
                    sb.append(CommonConstant.Symbol.COMMA);
                    sb.append(str);
                }
                i++;
            }
        }
        return sb.toString();
    }
}
