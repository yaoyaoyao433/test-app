package com.sankuai.waimai.platform.db.dao;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiSearchHistory {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Long bizSource;
    private String content;
    private Long id;
    private Long poiId;
    private String poiIdStr;
    private Long updateTime;

    public PoiSearchHistory() {
    }

    public PoiSearchHistory(Long l) {
        Object[] objArr = {l};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c7ede0d1a9e39f08f14527b654d990d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c7ede0d1a9e39f08f14527b654d990d");
        } else {
            this.id = l;
        }
    }

    public PoiSearchHistory(Long l, String str, Long l2, Long l3) {
        Object[] objArr = {l, str, l2, l3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ead08b167f2ef344d0afc2b625e05c12", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ead08b167f2ef344d0afc2b625e05c12");
            return;
        }
        this.id = l;
        this.content = str;
        this.updateTime = l2;
        this.poiId = l3;
    }

    public PoiSearchHistory(Long l, String str, Long l2, Long l3, Long l4) {
        Object[] objArr = {l, str, l2, l3, l4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38699f4120fd53d0613de3af4bc6d645", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38699f4120fd53d0613de3af4bc6d645");
            return;
        }
        this.id = l;
        this.content = str;
        this.updateTime = l2;
        this.poiId = l3;
        this.bizSource = l4;
    }

    public PoiSearchHistory(Long l, String str, Long l2, Long l3, Long l4, String str2) {
        Object[] objArr = {l, str, l2, l3, l4, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e8ff7b16eea8b02cc3dc3435d5f70e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e8ff7b16eea8b02cc3dc3435d5f70e");
            return;
        }
        this.id = l;
        this.content = str;
        this.updateTime = l2;
        this.poiId = l3;
        this.poiIdStr = str2;
        this.bizSource = l4;
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

    public Long getBizSource() {
        return this.bizSource;
    }

    public void setBizSource(Long l) {
        this.bizSource = l;
    }

    public String getPoiIdStr() {
        return this.poiIdStr;
    }

    public void setPoiIdStr(String str) {
        this.poiIdStr = str;
    }
}
