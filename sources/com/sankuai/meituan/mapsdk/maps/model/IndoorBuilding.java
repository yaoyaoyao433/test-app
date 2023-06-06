package com.sankuai.meituan.mapsdk.maps.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class IndoorBuilding {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String a;
    private String b;
    private String c;
    private LatLng d;
    private List<String> e;
    private int f;
    private List<String> g;
    private List<String> h;
    private String i;
    private String j;

    public String getDefaultFloorNum() {
        return this.j;
    }

    public void setDefaultFloorNum(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2fc3ad4ea9b10e78c9395bb06b085ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2fc3ad4ea9b10e78c9395bb06b085ba");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.j = str;
        }
    }

    public String getDefaultFloorName() {
        return this.i;
    }

    public void setDefaultFloorName(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "11a9befe8d374c67cb76c59fa33a4d26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "11a9befe8d374c67cb76c59fa33a4d26");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.i = str;
            if (this.g == null || this.g.size() <= 0 || (indexOf = this.g.indexOf(this.i)) <= 0) {
                return;
            }
            setActiveIndex(indexOf);
            if (this.h == null || this.h.size() <= 0) {
                return;
            }
            setDefaultFloorNum(this.h.get(indexOf));
        }
    }

    public List<String> getIndoorFloorNames() {
        return this.g;
    }

    public void setIndoorFloorNames(List<String> list) {
        this.g = list;
    }

    public List<String> getIndoorFloorNums() {
        return this.h;
    }

    public void setIndoorFloorNums(List<String> list) {
        this.h = list;
    }

    public IndoorBuilding(String str, String str2, String str3, LatLng latLng, List<String> list, int i) {
        Object[] objArr = {str, str2, str3, latLng, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c612ed4d24e7a57b40ba0dd8eec322a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c612ed4d24e7a57b40ba0dd8eec322a0");
            return;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = latLng;
        this.e = list;
        this.f = i;
    }

    public IndoorBuilding() {
    }

    public String getBuildingId() {
        return this.a;
    }

    @Deprecated
    public void setBuildingId(String str) {
        this.a = str;
    }

    public String getName() {
        return this.c;
    }

    public void setName(String str) {
        this.c = str;
    }

    public LatLng getLatLng() {
        return this.d;
    }

    public List<String> getIndoorLevelList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa94aba88d9ecff42cfff435ffc8c90", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa94aba88d9ecff42cfff435ffc8c90") : new ArrayList(this.e);
    }

    @Deprecated
    public void setIndoorLevelList(List<String> list) {
        this.e = list;
    }

    public int getActiveIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f27cb16ee3f999f7e5b598def9ccbc43", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f27cb16ee3f999f7e5b598def9ccbc43")).intValue();
        }
        if (this.f < 0) {
            return this.h.indexOf(this.j);
        }
        return this.f;
    }

    @Deprecated
    public void setActiveIndex(int i) {
        if (i >= 0) {
            this.f = i;
        }
    }

    public String getPoiId() {
        return this.b;
    }

    @Deprecated
    public void setPoiId(String str) {
        this.b = str;
    }

    @Deprecated
    public IndoorBuilding(String str, String str2, LatLng latLng, List<String> list, int i) {
        Object[] objArr = {str, str2, latLng, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cf8d4b82d2791de74052f66223ce5a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cf8d4b82d2791de74052f66223ce5a0");
            return;
        }
        this.a = str;
        this.c = str2;
        this.d = latLng;
        this.e = list;
        this.f = i;
    }

    public void setLatLng(LatLng latLng) {
        this.d = latLng;
    }
}
