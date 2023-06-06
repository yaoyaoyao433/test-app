package com.meituan.network;

import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class CommonProfile {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long CallEnd;
    public long CallStart;
    public long SSLconnectionEnd;
    public long SSLconnectionStart;
    public long connectEnd;
    public long connectStart;
    public long domainLookUpEnd;
    public long domainLookUpStart;
    public long downstreamThroughputKbpsEstimate;
    public long estimate_nettype;
    public long fetchStart;
    public long httpRttEstimate;
    public String peerIP;
    public int port;
    public long receivedBytedCount;
    public long redirectEnd;
    public long redirectStart;
    public long requestEnd;
    public long requestStart;
    public long responseEnd;
    public long responseStart;
    public long rtt;
    public long sendBytesCount;
    public boolean socketReused;
    public long throughputKbps;
    public long transportRttEstimate;
}
