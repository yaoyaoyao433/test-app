package com.sankuai.waimai.business.page.home.widget.twolevel;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static String a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5548af7a2023451ca4e830f28abb2ef4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5548af7a2023451ca4e830f28abb2ef4");
        }
        if (TextUtils.isEmpty(str) || i <= 0) {
            return str;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorCdnReSizeUtil", "adjustCdnUrl src : " + str, new Object[0]);
        if (i >= 720) {
            i = 720;
        }
        String format = String.format("%s@%dw_1l.webp", str, Integer.valueOf(i));
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloorCdnReSizeUtil", "adjustCdnUrl des : " + format, new Object[0]);
        return format;
    }
}
