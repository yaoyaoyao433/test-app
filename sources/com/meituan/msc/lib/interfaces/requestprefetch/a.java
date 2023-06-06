package com.meituan.msc.lib.interfaces.requestprefetch;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.lib.interfaces.requestprefetch.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0446a {
        public static ChangeQuickRedirect changeQuickRedirect;

        public abstract String getSceneToken();

        public abstract String getType();

        public abstract boolean isEnable();
    }

    public abstract String getContentType();

    public abstract Map<String, String> getKeyMap();

    public abstract AbstractC0446a getLocation();

    public abstract String getMethod();

    public abstract String getPagePath();

    public abstract long getTimeout();

    public abstract String getUrl();

    public abstract boolean isEnableSecuritySign();

    public abstract boolean isEnableSecuritySiua();

    public abstract boolean isEnableShark();
}
