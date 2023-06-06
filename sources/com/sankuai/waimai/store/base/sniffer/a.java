package com.sankuai.waimai.store.base.sniffer;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.monitor.AbstractSnifferNetMonitor;
import com.sankuai.waimai.store.monitor.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a<T> extends AbstractSnifferNetMonitor<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<b<T>> mSniffers;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52e6ca6b1352706ea989a08b3f5cf3e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52e6ca6b1352706ea989a08b3f5cf3e5");
        } else {
            this.mSniffers = new CopyOnWriteArrayList();
        }
    }

    @Override // com.sankuai.waimai.store.monitor.b
    public void collect(String str, String str2, String str3, @NonNull BaseResponse<T> baseResponse) {
        Object[] objArr = {str, str2, str3, baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a3702fb64be2958cc044900744b4b2a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a3702fb64be2958cc044900744b4b2a1");
            return;
        }
        for (b<T> bVar : this.mSniffers) {
            bVar.collect(str, str2, str3, baseResponse);
        }
    }

    public void addSnifferCollect(@NonNull b<T> bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "70c3fb299db14b485f9ca668be49e056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "70c3fb299db14b485f9ca668be49e056");
        } else {
            this.mSniffers.add(bVar);
        }
    }
}
