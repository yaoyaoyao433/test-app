package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiFavorite {
    public static ChangeQuickRedirect changeQuickRedirect;
    Integer index;
    Long poiId;

    public PoiFavorite() {
    }

    public PoiFavorite(Long l, Integer num) {
        Object[] objArr = {l, num};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b77a4383a5190236f5b187e0403b22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b77a4383a5190236f5b187e0403b22");
            return;
        }
        this.poiId = l;
        this.index = num;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8c391dc32361badfe282303fe491f1e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8c391dc32361badfe282303fe491f1e")).intValue() : this.poiId.intValue();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "700230f5ac729af4f0c30e4098a65b98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "700230f5ac729af4f0c30e4098a65b98")).booleanValue();
        }
        if ((obj instanceof PoiFavorite) && this.poiId.equals(((PoiFavorite) obj).poiId)) {
            return true;
        }
        return super.equals(obj);
    }
}
