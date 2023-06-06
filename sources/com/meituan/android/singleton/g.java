package com.meituan.android.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Picasso;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    public static Picasso a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9bb7480ccff2f06d55a66a32828bd14", RobustBitConfig.DEFAULT_VALUE) ? (Picasso) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9bb7480ccff2f06d55a66a32828bd14") : Picasso.g(b.a);
    }
}
