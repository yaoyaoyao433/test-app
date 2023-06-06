package com.sankuai.meituan.mtlive.core.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HotSwitchHornAppInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appID;
    private List<HotSwitchHornProjectInfo> appProjects;

    public String getAppID() {
        return this.appID;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public List<HotSwitchHornProjectInfo> getAppProjects() {
        return this.appProjects;
    }

    public void setAppProjects(List<HotSwitchHornProjectInfo> list) {
        this.appProjects = list;
    }
}
