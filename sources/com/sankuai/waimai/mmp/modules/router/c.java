package com.sankuai.waimai.mmp.modules.router;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    static f b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "629af05deacf5eb05487d5f270c402ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "629af05deacf5eb05487d5f270c402ca");
            return;
        }
        final f a2 = TextUtils.isEmpty(str) ? null : f.a(str);
        com.meituan.mmp.lib.executor.a.a(new com.meituan.mmp.lib.executor.b() { // from class: com.sankuai.waimai.mmp.modules.router.c.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5711f60a50aff02d4f61a407e640cafd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5711f60a50aff02d4f61a407e640cafd");
                } else {
                    c.b = f.this;
                }
            }
        });
    }
}
