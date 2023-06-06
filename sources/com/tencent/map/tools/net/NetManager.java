package com.tencent.map.tools.net;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.adapter.URLNetImpl;
import com.tencent.map.tools.net.http.HttpCanceler;
import com.tencent.mapsdk.internal.lb;
import com.tencent.mapsdk.internal.ln;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class NetManager {
    private static NetManager sInstance;
    private NetAdapter mAdapter;
    private String mGlobalSecretKey;
    private boolean mInited = false;
    private boolean mGlobalForceHttps = true;
    private HashMap<String, String> mGlobalNetFlowRuleList = new HashMap<>();
    private HashSet<Class<? extends ln>> mGlobalNetFlowProcessorClzList = new HashSet<>();

    public static synchronized NetManager getInstance() {
        NetManager netManager;
        synchronized (NetManager.class) {
            if (sInstance == null) {
                sInstance = new NetManager();
            }
            netManager = sInstance;
        }
        return netManager;
    }

    private NetManager() {
    }

    static NetAdapter createAdapter(Context context, NetConfig netConfig) {
        if (netConfig == null) {
            netConfig = NetConfig.create().setForceHttps(true).setAdapterType(AdapterType.URL);
        }
        int[] iArr = AnonymousClass1.a;
        netConfig.getAdapterType().ordinal();
        lb lbVar = new lb();
        lbVar.initNet(context, netConfig);
        return lbVar;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.tencent.map.tools.net.NetManager$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[AdapterType.values().length];

        static {
            try {
                a[AdapterType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdapterType.URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdapterType.Halley.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean available() {
        return this.mAdapter != null && this.mInited;
    }

    public void setAdapter(Context context, NetAdapter netAdapter) {
        if (netAdapter instanceof URLNetImpl) {
            ((URLNetImpl) netAdapter).setProxyAdapter(createAdapter(context, NetConfig.create()));
        }
        setAdapter(netAdapter);
    }

    void setAdapter(NetAdapter netAdapter) {
        if (netAdapter == null || this.mAdapter == netAdapter) {
            return;
        }
        this.mInited = false;
        if (this.mAdapter != null) {
            netAdapter.getNetFlowRuleList().putAll(this.mAdapter.getNetFlowRuleList());
        }
        this.mAdapter = netAdapter;
        init();
    }

    public static void init(Context context, NetConfig netConfig) {
        getInstance().setAdapter(createAdapter(context, netConfig));
    }

    private void init() {
        if (this.mInited || this.mAdapter == null) {
            return;
        }
        this.mInited = true;
        this.mGlobalForceHttps = this.mAdapter.isForceHttps();
        this.mGlobalSecretKey = this.mAdapter.getSecretKey();
        this.mGlobalNetFlowRuleList.putAll(this.mAdapter.getNetFlowRuleList());
        this.mGlobalNetFlowProcessorClzList.addAll(this.mAdapter.getNetFlowProcessor());
    }

    public NetRequest.NetRequestBuilder builder() {
        return builder("");
    }

    public NetRequest.NetRequestBuilder builder(String str) {
        if (TextUtils.isEmpty(str)) {
            str = this.mGlobalSecretKey;
        }
        NetRequest.NetRequestBuilder netRequestBuilder = new NetRequest.NetRequestBuilder(this.mAdapter, str);
        netRequestBuilder.forceHttps(this.mGlobalForceHttps);
        return netRequestBuilder;
    }

    private NetRequest.NetRequestBuilder builder(NetRequest netRequest) {
        return new NetRequest.NetRequestBuilder(this.mAdapter, this.mGlobalSecretKey, netRequest);
    }

    public NetResponse doGet(String str, String str2, int i, int i2, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        return builder().url(str).retryNum(i).header(hashMap).userAgent(str2).timeOut(i2).canceler(httpCanceler).doGet();
    }

    public NetResponse doPost(String str, String str2, byte[] bArr, int i, int i2, HashMap<String, String> hashMap, HttpCanceler httpCanceler) {
        return builder().url(str).userAgent(str2).postData(bArr).retryNum(i).header(hashMap).timeOut(i2).canceler(httpCanceler).doPost();
    }

    public NetResponse doRequest(NetRequest netRequest) {
        return builder(netRequest).doRequest();
    }

    public NetResponse doStream(NetRequest netRequest) {
        return builder(netRequest).doStream();
    }

    public void appendNetFlowRules(HashMap<String, String> hashMap) {
        if (this.mAdapter != null) {
            this.mAdapter.getNetFlowRuleList().putAll(hashMap);
        }
    }
}
