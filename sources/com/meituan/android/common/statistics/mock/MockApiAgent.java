package com.meituan.android.common.statistics.mock;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.statistics.network.NetworkController;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MockApiAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mDpId;
    private boolean mIsAvailable;
    private boolean mIsEnable;
    private ExecutorService mMockAgentExecutors;
    private String mMockUrl;
    private String mUUID;
    private String mUnionId;
    private MockTemplate mockDataTemplate;

    public MockApiAgent() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class MockSub {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static MockApiAgent mockApiAgent = new MockApiAgent();
    }

    public static MockApiAgent get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "433b73528aec8d76298ebe8dd9e68568", 6917529027641081856L) ? (MockApiAgent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "433b73528aec8d76298ebe8dd9e68568") : MockSub.mockApiAgent;
    }

    public void enable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d17dff304e2239bf847b6956613f1d87", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d17dff304e2239bf847b6956613f1d87");
            return;
        }
        this.mMockAgentExecutors = c.a("mock_agent");
        this.mIsEnable = true;
    }

    public void disable() {
        this.mMockAgentExecutors = null;
        this.mIsAvailable = false;
        this.mIsEnable = false;
    }

    public void setUUID(String str) {
        this.mUUID = str;
    }

    public void setDpId(String str) {
        this.mDpId = str;
    }

    public void setUnionId(String str) {
        this.mUnionId = str;
    }

    public void setScanUri(final Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cd224e8b06aac14b96d2023c9a9becf8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cd224e8b06aac14b96d2023c9a9becf8");
        } else if (uri == null) {
        } else {
            this.mMockUrl = uri.getScheme() + "://" + uri.getEncodedAuthority();
            String str = null;
            try {
                str = uri.getQueryParameter("triggerLxDebugMode");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (str != null && "true".equals(str)) {
                this.mockDataTemplate = new MTMockTemplate();
            } else {
                this.mockDataTemplate = new DPMockTemplate();
            }
            this.mMockUrl += this.mockDataTemplate.getPath(uri);
            if (this.mMockAgentExecutors != null) {
                this.mMockAgentExecutors.execute(new Runnable() { // from class: com.meituan.android.common.statistics.mock.MockApiAgent.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f81fb8c20c52ace4a12b2b6d658902f7", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f81fb8c20c52ace4a12b2b6d658902f7");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(MockApiAgent.this.mUnionId)) {
                            hashMap.put("pragma-unionid", MockApiAgent.this.mUnionId);
                        }
                        if (!TextUtils.isEmpty(MockApiAgent.this.mUUID)) {
                            hashMap.put("uuid", MockApiAgent.this.mUUID);
                        }
                        if (!TextUtils.isEmpty(MockApiAgent.this.mDpId)) {
                            hashMap.put("pragma-dpid", MockApiAgent.this.mDpId);
                        }
                        LogUtil.log("statistics", "扫码url：" + uri.toString());
                        try {
                            MockApiAgent.this.mIsAvailable = NetworkController.mockRegist(uri.toString(), hashMap);
                        } catch (Exception e2) {
                            LogUtil.log("statistics", "Reporter - Register: " + e2.getMessage());
                        }
                        LogUtil.log("statistics", "mIsAvailable：" + MockApiAgent.this.mIsAvailable);
                    }
                });
            }
        }
    }

    public void mock(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4504bc00557bb68bfbf691d2ff4a9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4504bc00557bb68bfbf691d2ff4a9e");
            return;
        }
        final JSONObject data = this.mockDataTemplate.getData(obj);
        if (!isEnable() || TextUtils.isEmpty(this.mMockUrl) || this.mMockAgentExecutors == null) {
            return;
        }
        this.mMockAgentExecutors.execute(new Runnable() { // from class: com.meituan.android.common.statistics.mock.MockApiAgent.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "66cf924b845baf99c1bd9e7dc3f1522f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "66cf924b845baf99c1bd9e7dc3f1522f");
                    return;
                }
                HashMap hashMap = new HashMap();
                if (!TextUtils.isEmpty(MockApiAgent.this.mUnionId)) {
                    hashMap.put("pragma-unionid", MockApiAgent.this.mUnionId);
                }
                if (!TextUtils.isEmpty(MockApiAgent.this.mDpId)) {
                    hashMap.put("pragma-dpid", MockApiAgent.this.mDpId);
                }
                try {
                    NetworkController.mockReport(MockApiAgent.this.mMockUrl, hashMap, data.toString());
                } catch (Exception e) {
                    LogUtil.log("statistics", "MockApiAgent - mock: " + e.toString());
                }
            }
        });
    }

    public boolean isEnable() {
        return this.mIsEnable && this.mIsAvailable;
    }
}
