package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IndoorMapPoi extends MapPoi {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String h;
    private String i;
    private String j;

    public IndoorMapPoi(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30c63bbd88f9586b812d86f477afc38d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30c63bbd88f9586b812d86f477afc38d");
            return;
        }
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    public IndoorMapPoi(String str, String str2, String str3, double d, double d2, String str4) {
        super(d, d2, str4);
        Object[] objArr = {str, str2, str3, Double.valueOf(d), Double.valueOf(d2), str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aad69842d86643cb3a0e03892c46f7ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aad69842d86643cb3a0e03892c46f7ef");
            return;
        }
        this.h = str;
        this.i = str2;
        this.j = str3;
    }

    public String getBuildingId() {
        return this.h;
    }

    public String getBuildingName() {
        return this.i;
    }

    public String getFloorName() {
        return this.j;
    }

    @Override // com.sankuai.meituan.mapsdk.maps.model.MapPoi
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f95ac1622c08eb9843414d60088db36", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f95ac1622c08eb9843414d60088db36");
        }
        return this.h + CommonConstant.Symbol.MINUS + this.i + CommonConstant.Symbol.MINUS + this.j + CommonConstant.Symbol.MINUS + this.c;
    }
}
