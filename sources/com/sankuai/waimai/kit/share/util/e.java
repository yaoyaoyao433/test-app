package com.sankuai.waimai.kit.share.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static int a(String str, int i) {
        Object[] objArr = {str, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dd814b71b77e4a7d66ca23af42ed98e6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dd814b71b77e4a7d66ca23af42ed98e6")).intValue();
        }
        if (!TextUtils.isEmpty(str)) {
            String trim = str.trim();
            try {
                if (TextUtils.isEmpty(trim)) {
                    return 0;
                }
                return Integer.parseInt(trim);
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
