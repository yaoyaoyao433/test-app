package com.sankuai.meituan.model.dao;

import com.meituan.android.turbo.annotations.JsonType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonType
/* loaded from: classes4.dex */
public class City implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String divisionStr;
    public String dstOffset;
    public String extraName;
    public Long id;
    public Boolean isDomestic;
    public Boolean isForeign;
    public Boolean isOpen;
    private String label;
    public Double lat;
    public Double lng;
    public String name;
    public String pinyin;
    public String rank;
    public int rawOffset;
    public String stdOffset;
    public boolean weather;

    public City() {
    }

    public City(Long l, String str, String str2, Double d, Double d2, String str3, Boolean bool, String str4, Boolean bool2) {
        Object[] objArr = {l, str, str2, d, d2, str3, bool, str4, bool2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60d219fa2e73eb91c1a5151daa16fccf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60d219fa2e73eb91c1a5151daa16fccf");
            return;
        }
        this.id = l;
        this.rank = str;
        this.name = str2;
        this.lat = d;
        this.lng = d2;
        this.pinyin = str3;
        this.isOpen = bool;
        this.divisionStr = str4;
        this.isForeign = bool2;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcd7840d5a68bb02a37295fcfcff2451", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcd7840d5a68bb02a37295fcfcff2451")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        City city = (City) obj;
        return this.id != null ? this.id.equals(city.id) : city.id == null;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "28ea641d464bd455966f3aa1b191f9d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "28ea641d464bd455966f3aa1b191f9d6")).intValue();
        }
        if (this.id != null) {
            return this.id.hashCode();
        }
        return 0;
    }
}
