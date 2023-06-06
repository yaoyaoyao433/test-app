package com.sankuai.waimai.platform.db.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class InshopSearchHistory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String content;
    private String data1;
    private Long id;
    private Long poiId;
    private Long updateTime;

    public InshopSearchHistory() {
    }

    public InshopSearchHistory(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0495ebf97a1fbd88664c67dae2ff2850", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0495ebf97a1fbd88664c67dae2ff2850");
        } else {
            this.id = l;
        }
    }

    public InshopSearchHistory(Long l, String str, Long l2, Long l3, String str2) {
        Object[] objArr = {l, str, l2, l3, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef42defea07710d40cb2e6ee6d772491", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef42defea07710d40cb2e6ee6d772491");
            return;
        }
        this.id = l;
        this.content = str;
        this.updateTime = l2;
        this.poiId = l3;
        this.data1 = str2;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Long l) {
        this.updateTime = l;
    }

    public Long getPoiId() {
        return this.poiId;
    }

    public void setPoiId(Long l) {
        this.poiId = l;
    }

    public String getData1() {
        return this.data1;
    }

    public void setData1(String str) {
        this.data1 = str;
    }
}
