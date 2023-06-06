package com.tencent.map.tools.net;

import android.content.Context;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.mapsdk.internal.ln;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface NetAdapter {
    boolean cancel();

    NetResponse doGet(NetRequest netRequest);

    NetResponse doPost(NetRequest netRequest);

    NetResponse doRequest(NetRequest netRequest);

    HashSet<Class<? extends ln>> getNetFlowProcessor();

    HashMap<String, String> getNetFlowRuleList();

    List<HttpProxyRule> getProxyRuleList();

    String getSecretKey();

    void initNet(Context context, NetConfig netConfig);

    boolean isForceHttps();

    boolean isLogEnable();

    NetResponse openStream(NetRequest netRequest);
}
