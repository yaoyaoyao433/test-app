package com.sankuai.waimai.business.search.common.util;

import android.app.Activity;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a36bd1f413828fccf2584dea64f1c63e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a36bd1f413828fccf2584dea64f1c63e");
            return;
        }
        com.sankuai.meituan.android.ui.widget.a aVar = new com.sankuai.meituan.android.ui.widget.a(activity, str, -1);
        View c = aVar.c();
        Object[] objArr2 = {c};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b3b28d34d82e1ad1ce97d5abff27c23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b3b28d34d82e1ad1ce97d5abff27c23c");
        } else {
            ViewCompat.setOnApplyWindowInsetsListener(c, new OnApplyWindowInsetsListener() { // from class: com.sankuai.waimai.business.search.common.util.SearchToastUtil$1
                @Override // android.support.v4.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return windowInsetsCompat;
                }
            });
        }
        aVar.a();
    }
}
