package com.meituan.network.request;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class NetworkPerformanceEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String apiName;
    public boolean enableShark;
    public String fullUrl;
    public String protocol;
    public String reason;
    public String requestMethod;
    public long requestSize;
    public long responseSize;
    public boolean sharkTunnel;
    public int statusCode;
    public String url;
    public long value;
}
