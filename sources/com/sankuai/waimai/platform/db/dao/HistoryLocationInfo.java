package com.sankuai.waimai.platform.db.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class HistoryLocationInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc;
    private Long id;
    private String lat;
    private String lng;
    private String timestamp;

    public HistoryLocationInfo() {
    }

    public HistoryLocationInfo(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2540dc769235c36668c27eb2d31fb5b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2540dc769235c36668c27eb2d31fb5b6");
        } else {
            this.id = l;
        }
    }

    public HistoryLocationInfo(Long l, String str, String str2, String str3, String str4) {
        Object[] objArr = {l, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "811da8569b3fecdfb191a3538321228b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "811da8569b3fecdfb191a3538321228b");
            return;
        }
        this.id = l;
        this.lat = str;
        this.lng = str2;
        this.desc = str3;
        this.timestamp = str4;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String str) {
        this.lat = str;
    }

    public String getLng() {
        return this.lng;
    }

    public void setLng(String str) {
        this.lng = str;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }
}
