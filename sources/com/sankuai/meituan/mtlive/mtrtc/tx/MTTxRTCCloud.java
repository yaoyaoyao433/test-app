package com.sankuai.meituan.mtlive.mtrtc.tx;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MTTxRTCCloud extends a {
    public static ChangeQuickRedirect a;

    public MTTxRTCCloud(Context context, int i) {
        super(context, i);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618e91ed348846ba2ad15fadcd8fbf15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618e91ed348846ba2ad15fadcd8fbf15");
        }
    }
}
