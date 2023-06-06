package com.sankuai.waimai.store.locate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.listener.c;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements c {
    public static ChangeQuickRedirect a;
    private WeakReference<com.sankuai.waimai.store.i.locate.b> b;

    public b(com.sankuai.waimai.store.i.locate.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31c44b928a310dbf0e5ed298aa9ebbb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31c44b928a310dbf0e5ed298aa9ebbb3");
        } else {
            this.b = new WeakReference<>(bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public final void onPoiChange(WmAddress wmAddress, boolean z) {
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d39c60824a1de53abf05e3eda9f37e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d39c60824a1de53abf05e3eda9f37e96");
        } else if (this.b.get() == null) {
        } else {
            if (wmAddress != null) {
                this.b.get().a(wmAddress.getWMLocation(), wmAddress.getAddress(), z);
            } else {
                this.b.get().a(null, "", false);
            }
        }
    }
}
