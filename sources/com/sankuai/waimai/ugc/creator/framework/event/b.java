package com.sankuai.waimai.ugc.creator.framework.event;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b {
    public static ChangeQuickRedirect d;
    public final int e;

    public b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de134f217926e5ef39cf21ffcabb4141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de134f217926e5ef39cf21ffcabb4141");
        } else {
            this.e = i;
        }
    }
}
