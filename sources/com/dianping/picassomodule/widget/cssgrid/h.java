package com.dianping.picassomodule.widget.cssgrid;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h implements Cloneable {
    public static ChangeQuickRedirect a;
    public float b;
    public float c;
    public float d;
    public float e;

    public final Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72082d7cae9ab7fd36c3774cde8c9276", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72082d7cae9ab7fd36c3774cde8c9276") : super.clone();
    }
}
