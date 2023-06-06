package com.dianping.monitor.mrn;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class a extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.monitor.impl.a
    public final int containerType() {
        return 2;
    }

    public a(Context context, int i, String str) {
        super(context, i, str);
        Object[] objArr = {context, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b235753df7b23acff654dd11f9d8a5f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b235753df7b23acff654dd11f9d8a5f5");
        }
    }
}
