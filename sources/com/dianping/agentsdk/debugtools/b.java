package com.dianping.agentsdk.debugtools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements Comparable<b> {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(b bVar) {
        b bVar2 = bVar;
        Object[] objArr = {bVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18cba0c41d9cb42e9109fb61dd7132c3", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18cba0c41d9cb42e9109fb61dd7132c3")).intValue() : bVar2.b.compareTo(this.b);
    }
}
