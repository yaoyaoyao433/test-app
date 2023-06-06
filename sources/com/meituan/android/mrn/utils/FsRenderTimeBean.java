package com.meituan.android.mrn.utils;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class FsRenderTimeBean {
    public static String CUSTOM_TAG_PREFIX = "Custom_";
    public static final int FMP_BY_INTERACTION_CAUSE_LAYOUT_FMP_IS_BIGGER = 2;
    public static final int FMP_BY_INTERACTION_CAUSE_NO_LAYOUT_FMP = 1;
    public static final int FMP_BY_LAYOUT = 0;
    public static final int FMP_BY_NO_ENGINE_INTERACTION = 4;
    public static final int FMP_BY_NO_ENGINE_LAYOUT = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    public long bundleDidDownloadTime;
    public long bundleDidLoadTime;
    public String bundleName;
    public String bundleVersion;
    public String componentName;
    public Map<String, Long> customEvents;
    public Map<String, String> customTags;
    public long customTime;
    public long fCPTime;
    public int fetch_bridge_type;
    public long firstNetworkTime;
    public int fmpByWhat;
    public long fmpTreeNode;
    public long fsRenderTime;
    public long interactionTime;
    public long interactionTimeTreeNode;
    public int isRemote;
    public float isStatusCodeException;
    public long jSEngineDidInitTime;
    public float rate;
    public long renderStartTime;
    public String routerPath;
    public long startTime;
    private int statusCode;
    public boolean triggerByNoEngine;
    public long viewTreeChangedTime;

    public FsRenderTimeBean() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee643d0ad22d19492dd13aa76dad1ec0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee643d0ad22d19492dd13aa76dad1ec0");
            return;
        }
        this.customTags = new ConcurrentHashMap();
        this.componentName = "";
        this.bundleName = "";
        this.bundleVersion = CommonConstant.Symbol.MINUS;
        this.fetch_bridge_type = -1;
        this.isRemote = -1;
        this.routerPath = "";
        this.customEvents = new ConcurrentHashMap();
        this.fmpByWhat = 0;
        this.triggerByNoEngine = false;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6f17d42fa1374543d66394bf5b4aa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6f17d42fa1374543d66394bf5b4aa0b");
        } else if (i == 0 || this.statusCode == 0) {
            this.statusCode = i;
            this.isStatusCodeException = i < 200 ? 0.0f : 1.0f;
        }
    }
}
