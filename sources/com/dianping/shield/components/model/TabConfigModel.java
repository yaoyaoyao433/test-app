package com.dianping.shield.components.model;

import com.dianping.eunomia.c;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TabConfigModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<ArrayList<String>> configAgentKeys;
    public List<ArrayList<c>> configModuleKeys;
    public ArrayList<ArrayList<ShieldConfigInfo>> configShieldKeys;
    public boolean isLinkPrevious;
    public String tabKey;
    public List<ArrayList<String>> tabRelatedAgentKeys;

    public TabConfigModel(String str) {
        this.tabKey = str;
    }
}
