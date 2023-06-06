package com.sankuai.titans.protocol.services;

import android.content.Context;
import android.support.annotation.ColorInt;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.protocol.lifecycle.ITitansPlugin;
import com.sankuai.titans.protocol.webcompat.elements.ILoadingViewTemplate;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBar;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings;
import com.sankuai.titans.protocol.webcompat.jshost.OnActivityFinishListener;
import com.sankuai.titans.protocol.webcompat.jshost.OnWindowHiddenListener;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class IContainerAdapter {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean acceptThirdPartyCookies() {
        return true;
    }

    public OnActivityFinishListener getActivityFinishListener() {
        return null;
    }

    @Deprecated
    public Map<String, Object> getBridgeInterfaces(Context context) {
        return null;
    }

    public ITitansPlugin getBusinessPlugin() {
        return null;
    }

    public ILoadingViewTemplate getLoadingViewTemplate() {
        return null;
    }

    public int getNetworkErrorLayoutId() {
        return -1;
    }

    public ITitleBarUISettings getTitansUISettings() {
        return null;
    }

    public ITitleBar getTitleBar(Context context) {
        return null;
    }

    @ColorInt
    public int getWebViewBackgroundColor(Context context) {
        return -1;
    }

    public OnWindowHiddenListener getWindowHiddenListener() {
        return null;
    }

    public abstract String h5UrlParameterName();

    public boolean isShowTitleBarOnReceivedError() {
        return false;
    }

    public abstract String scheme();

    public boolean showDebugBar() {
        return true;
    }

    public boolean showTitleBar() {
        return true;
    }
}
