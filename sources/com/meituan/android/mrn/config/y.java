package com.meituan.android.mrn.config;

import com.meituan.android.mrn.IMRNPackageBuilder;
import com.meituan.android.mrn.module.MRNRequestInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
import com.sankuai.meituan.retrofit2.raw.a;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class y {
    public static ChangeQuickRedirect a;
    private static volatile y k;
    public e b;
    i c;
    j d;
    public a.InterfaceC0637a e;
    public i.a f;
    public com.meituan.android.mrn.config.city.a g;
    public com.dianping.dataservice.mapi.g h;
    public IMRNPackageBuilder i;
    public MRNRequestInterceptor j;

    public static final y a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18d7b80c0ea5b27076ce47f4b62ca4e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (y) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18d7b80c0ea5b27076ce47f4b62ca4e4");
        }
        if (k == null) {
            synchronized (y.class) {
                if (k == null) {
                    k = new y();
                }
            }
        }
        return k;
    }
}
