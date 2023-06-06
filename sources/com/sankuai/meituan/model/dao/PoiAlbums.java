package com.sankuai.meituan.model.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PoiAlbums {
    public static ChangeQuickRedirect changeQuickRedirect;
    String coverPicUrl;
    byte[] data;
    Boolean hasPanoramaPic;
    Long lastModified;
    Long poiId;

    public PoiAlbums() {
    }

    public PoiAlbums(Long l, byte[] bArr, Long l2, Boolean bool, String str) {
        Object[] objArr = {l, bArr, l2, bool, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "56158851b5bf536399de883ad5e7910a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "56158851b5bf536399de883ad5e7910a");
            return;
        }
        this.poiId = l;
        this.data = bArr;
        this.lastModified = l2;
        this.hasPanoramaPic = bool;
        this.coverPicUrl = str;
    }
}
