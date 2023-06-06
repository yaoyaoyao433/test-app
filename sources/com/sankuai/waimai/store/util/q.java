package com.sankuai.waimai.store.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class q {
    public static ChangeQuickRedirect a;

    public static String a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4a05d5ddbc014949627566da547a79e8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4a05d5ddbc014949627566da547a79e8") : com.sankuai.shangou.stone.util.a.b(strArr) ? "" : com.sankuai.shangou.stone.util.t.a(Arrays.asList(strArr), new t.a<String>() { // from class: com.sankuai.waimai.store.util.q.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.shangou.stone.util.t.a
            public final /* synthetic */ String a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fffc1f32b3d1a46364fde0b1ce7afc20", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fffc1f32b3d1a46364fde0b1ce7afc20");
                }
                if (TextUtils.isEmpty(str2) || StringUtil.NULL.equalsIgnoreCase(str2)) {
                    return null;
                }
                return str2;
            }
        }, ";");
    }
}
