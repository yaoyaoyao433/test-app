package com.sankuai.meituan.mtlive.core.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HotSwitchHornProjectInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<HotSwitchHornEngineInfo> projectEngineList;
    private String projectID;

    public String getProjectID() {
        return this.projectID;
    }

    public void setProjectID(String str) {
        this.projectID = str;
    }

    public List<HotSwitchHornEngineInfo> getProjectEngineList() {
        return this.projectEngineList;
    }

    public void setProjectEngineList(List<HotSwitchHornEngineInfo> list) {
        this.projectEngineList = list;
    }
}
