package com.sankuai.waimai.monitor.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class HeadParamsInfo<T> {
    public static String NAME = "HeadParamsInfo";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String category;
    private String content;
    private T dynamicMetric;
    private String level;
    private String network;
    private String os;
    private String pageUrl;
    private String project;
    private String sec_category;
    private long timestamp;
    private String unionId;

    public String getNetwork() {
        return this.network;
    }

    public void setNetwork(String str) {
        this.network = str;
    }

    public String getProject() {
        return this.project;
    }

    public void setProject(String str) {
        this.project = str;
    }

    public String getPageUrl() {
        return this.pageUrl;
    }

    public void setPageUrl(String str) {
        this.pageUrl = str;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public String getSec_category() {
        return this.sec_category;
    }

    public void setSec_category(String str) {
        this.sec_category = str;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String str) {
        this.unionId = str;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81ca7589046c110aac8e2c9ba04a6dd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81ca7589046c110aac8e2c9ba04a6dd9");
        } else {
            this.timestamp = j;
        }
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String str) {
        this.os = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public T getDynamicMetric() {
        return this.dynamicMetric;
    }

    public void setDynamicMetric(T t) {
        this.dynamicMetric = t;
    }
}
