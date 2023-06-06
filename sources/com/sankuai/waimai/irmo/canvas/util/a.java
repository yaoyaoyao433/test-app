package com.sankuai.waimai.irmo.canvas.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ExecutorService b = c.a("INFE-Log");

    public static void a(int i, String str, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "cf3e02724fe012984e433960ebb3a3ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "cf3e02724fe012984e433960ebb3a3ca");
            return;
        }
        switch (i) {
            case 2:
                com.sankuai.waimai.foundation.utils.log.a.a("infe_log: ", str, objArr);
                break;
            case 3:
                com.sankuai.waimai.foundation.utils.log.a.b("infe_log: ", str, objArr);
                break;
            case 4:
                com.sankuai.waimai.foundation.utils.log.a.c("infe_log: ", str, objArr);
                break;
            case 5:
                com.sankuai.waimai.foundation.utils.log.a.d("infe_log: ", str, objArr);
                break;
            case 6:
                com.sankuai.waimai.foundation.utils.log.a.e("infe_log: ", str, objArr);
                break;
        }
        final String str2 = "infe_log: " + str;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect2, true, "de9e6f5a0f069ce599c2148b63834369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect2, true, "de9e6f5a0f069ce599c2148b63834369");
            return;
        }
        try {
            b.execute(new Runnable() { // from class: com.sankuai.waimai.irmo.canvas.util.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect3, false, "2ec3f0c29fae04ff9240f89e64674f6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect3, false, "2ec3f0c29fae04ff9240f89e64674f6c");
                        return;
                    }
                    try {
                        com.dianping.networklog.c.a(str2, 3);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }
}
