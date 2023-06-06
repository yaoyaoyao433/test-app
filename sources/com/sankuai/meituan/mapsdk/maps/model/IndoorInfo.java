package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IndoorInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String a;
    private String b;

    public IndoorInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc67983f86e393a4e86fc2de3f7a91e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc67983f86e393a4e86fc2de3f7a91e4");
            return;
        }
        this.a = str;
        this.b = str2;
    }

    public String getBuildingId() {
        return this.a;
    }

    public String getFloorName() {
        return this.b;
    }
}
