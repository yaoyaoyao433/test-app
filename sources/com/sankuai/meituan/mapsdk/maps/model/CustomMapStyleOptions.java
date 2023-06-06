package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CustomMapStyleOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String a;
    private String b;

    public CustomMapStyleOptions(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1488020e5d0cfc3fa3ece284a5b20d6a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1488020e5d0cfc3fa3ece284a5b20d6a");
            return;
        }
        this.a = str;
        this.b = str2;
    }

    public String getStylePath() {
        return this.a;
    }

    public void setStylePath(String str) {
        this.a = str;
    }

    public String getStyleExtraPath() {
        return this.b;
    }

    public void setStyleExtraPath(String str) {
        this.b = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "034a36eef3c7ccf7708bebd2e85cdb86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "034a36eef3c7ccf7708bebd2e85cdb86");
        }
        return "CustomMapStyleOptions{stylePath='" + this.a + "', styleExtraPath='" + this.b + "'}";
    }
}
