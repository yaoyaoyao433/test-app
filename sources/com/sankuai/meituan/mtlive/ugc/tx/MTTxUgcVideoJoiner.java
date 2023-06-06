package com.sankuai.meituan.mtlive.ugc.tx;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.ugc.TXVideoJoiner;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxUgcVideoJoiner {
    public static ChangeQuickRedirect a;
    private TXVideoJoiner b;

    public MTTxUgcVideoJoiner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2446e072f449f5ce51dfad4332ace5b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2446e072f449f5ce51dfad4332ace5b8");
        } else {
            this.b = new TXVideoJoiner(context);
        }
    }

    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b153284849e97d8275a844f381b8d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b153284849e97d8275a844f381b8d6");
        } else {
            this.b.cancel();
        }
    }
}
