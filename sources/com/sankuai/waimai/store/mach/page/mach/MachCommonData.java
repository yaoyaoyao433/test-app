package com.sankuai.waimai.store.mach.page.mach;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachCommonData implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public com.sankuai.waimai.store.mach.page.event.d mItem;
    public com.sankuai.waimai.mach.recycler.b machRecycler;

    public void setMachLogicList(com.sankuai.waimai.mach.recycler.b bVar) {
        this.machRecycler = bVar;
    }

    public com.sankuai.waimai.mach.recycler.b getMachRecycler() {
        return this.machRecycler;
    }

    public MachCommonData(com.sankuai.waimai.store.mach.page.event.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc3d11eac26ecf33bf3c22be96b0da53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc3d11eac26ecf33bf3c22be96b0da53");
        } else {
            this.mItem = dVar;
        }
    }
}
