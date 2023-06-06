package com.sankuai.meituan.abtestv2;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static b b;

    public static b a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52cfd8f81f662a91958cfabb8b47c4ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52cfd8f81f662a91958cfabb8b47c4ec");
        }
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new a(context.getApplicationContext());
                }
            }
        }
        return b;
    }
}
