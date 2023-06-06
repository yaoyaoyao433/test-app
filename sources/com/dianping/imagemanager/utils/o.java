package com.dianping.imagemanager.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class o {
    public static ChangeQuickRedirect a;
    private Context b;

    public o(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539319e7914c10941276e933fd73b7e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539319e7914c10941276e933fd73b7e5");
        } else {
            this.b = context;
        }
    }

    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170428c0d9615bebc170f91e34372ff4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170428c0d9615bebc170f91e34372ff4")).intValue();
        }
        if (this.b == null) {
            return 0;
        }
        try {
            switch (NetWorkUtils.getNetworkType(this.b)) {
                case -1:
                    return 0;
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                default:
                    return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
