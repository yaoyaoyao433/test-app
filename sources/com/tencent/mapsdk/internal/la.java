package com.tencent.mapsdk.internal;

import android.content.Context;
import android.os.Bundle;
import com.meituan.robust.common.CommonConstant;
import com.tencent.map.tools.net.NetAdapter;
import com.tencent.map.tools.net.NetConfig;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.http.HttpProxyRule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class la implements NetAdapter {
    private static final String b = "NetImpl";
    protected Bundle a;
    private boolean d;
    private List<HttpProxyRule> e;
    private String h;
    private boolean c = true;
    private HashMap<String, String> f = new HashMap<>();
    private HashSet<Class<? extends ln>> g = new HashSet<>();

    protected abstract NetResponse a(NetRequest netRequest);

    protected abstract void a();

    protected abstract NetResponse b(NetRequest netRequest);

    private void a(boolean z) {
        this.c = z;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isForceHttps() {
        return this.c;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public boolean isLogEnable() {
        return this.d;
    }

    private void b(boolean z) {
        this.d = z;
    }

    private void b(String str) {
        this.h = str;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public String getSecretKey() {
        return this.h;
    }

    private void a(List<HttpProxyRule> list) {
        this.e = list;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public List<HttpProxyRule> getProxyRuleList() {
        return this.e;
    }

    private void a(HashMap<String, String> hashMap) {
        this.f.putAll(hashMap);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public HashSet<Class<? extends ln>> getNetFlowProcessor() {
        return this.g;
    }

    private void a(Class<? extends ln> cls) {
        this.g.add(cls);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public HashMap<String, String> getNetFlowRuleList() {
        return this.f;
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public void initNet(Context context, NetConfig netConfig) {
        try {
            this.c = netConfig.isForceHttps();
            this.d = netConfig.isLogEnable();
            this.e = netConfig.getProxyRuleList();
            this.f.putAll(netConfig.getNetFlowRuleList());
            this.h = netConfig.getSecretKey();
            this.g.add(netConfig.getProcessor());
            this.a = netConfig.getArguments();
            a();
        } catch (Exception e) {
            kj.e(b, "initNet error:" + e.toString());
        }
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public NetResponse doGet(NetRequest netRequest) {
        return a(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public NetResponse doPost(NetRequest netRequest) {
        return b(netRequest);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String a(String str) {
        String[] split;
        if (str != null) {
            for (String str2 : str.split(";")) {
                if (str2.contains("charset")) {
                    String[] split2 = str2.split("=");
                    return split2.length > 1 ? split2[1].trim() : CommonConstant.Encoding.GBK;
                }
            }
            return CommonConstant.Encoding.GBK;
        }
        return CommonConstant.Encoding.GBK;
    }
}
