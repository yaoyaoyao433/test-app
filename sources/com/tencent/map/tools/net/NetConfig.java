package com.tencent.map.tools.net;

import android.os.Bundle;
import com.tencent.map.tools.net.http.HttpProxyRule;
import com.tencent.mapsdk.internal.ln;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetConfig {
    private Bundle mArguments;
    private HashMap<String, String> mNetFlowRuleList;
    private List<HttpProxyRule> mProxyRuleList;
    private String mSecretKey;
    private Class<? extends ln> processorClass;
    private AdapterType mAdapterType = AdapterType.URL;
    private boolean mForceHttps = true;
    private boolean mIsLogEnable = false;

    private NetConfig() {
    }

    public static NetConfig create() {
        return new NetConfig();
    }

    public boolean isForceHttps() {
        return this.mForceHttps;
    }

    public NetConfig setForceHttps(boolean z) {
        this.mForceHttps = z;
        return this;
    }

    public String getSecretKey() {
        return this.mSecretKey;
    }

    public NetConfig setSecretKey(String str) {
        this.mSecretKey = str;
        return this;
    }

    public List<HttpProxyRule> getProxyRuleList() {
        return this.mProxyRuleList;
    }

    public NetConfig setProxyRuleList(List<HttpProxyRule> list) {
        this.mProxyRuleList = list;
        return this;
    }

    public HashMap<String, String> getNetFlowRuleList() {
        return this.mNetFlowRuleList;
    }

    public NetConfig setNetFlowRuleList(HashMap<String, String> hashMap) {
        this.mNetFlowRuleList = hashMap;
        return this;
    }

    public Class<? extends ln> getProcessor() {
        return this.processorClass;
    }

    public NetConfig setProcessor(Class<? extends ln> cls) {
        this.processorClass = cls;
        return this;
    }

    public Bundle getArguments() {
        return this.mArguments;
    }

    public NetConfig setArguments(Bundle bundle) {
        this.mArguments = bundle;
        return this;
    }

    public AdapterType getAdapterType() {
        return this.mAdapterType;
    }

    public NetConfig setAdapterType(AdapterType adapterType) {
        this.mAdapterType = adapterType;
        return this;
    }

    public boolean isLogEnable() {
        return this.mIsLogEnable;
    }

    public NetConfig setLogEnable(boolean z) {
        this.mIsLogEnable = z;
        return this;
    }
}
