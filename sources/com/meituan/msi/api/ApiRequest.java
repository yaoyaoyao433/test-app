package com.meituan.msi.api;

import android.app.Activity;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonObject;
import com.meituan.msi.ApiPortal;
import com.meituan.msi.bean.ApiException;
import com.meituan.msi.bean.StringRequestData;
import com.meituan.msi.provider.c;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public abstract class ApiRequest<T> implements Comparable<ApiRequest<T>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient w.a<T> bodyData;
    public transient Map<String, Object> cacheData;
    public transient c<?> callback;
    protected String callbackId;
    private transient long currentMsiStartTimeMillis;
    public transient a defaultCall;
    public transient String extra;
    protected JsonObject innerArgs;
    @NonNull
    public transient ApiPortal.b mContext;
    protected MetricsInfo metrics;
    protected String name;
    protected String scope;
    protected JsonObject uiArgs;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class MetricsInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long feStartTime;
        public long msiStartTime;
        public long nativeStartTime;
    }

    @Override // java.lang.Comparable
    public int compareTo(ApiRequest apiRequest) {
        return 0;
    }

    public abstract w.a<T> pareBody();

    public void cache(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e4a7ac5be85a71e9f71037efbb1de881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e4a7ac5be85a71e9f71037efbb1de881");
            return;
        }
        if (this.cacheData == null) {
            this.cacheData = new HashMap();
        }
        this.cacheData.put(str, obj);
    }

    public Object getCache(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "66033694e2687f06fa418f781f2ef01a", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "66033694e2687f06fa418f781f2ef01a");
        }
        if (this.cacheData != null) {
            return this.cacheData.get(str);
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public JsonObject getUIArgs() {
        return this.uiArgs;
    }

    public void setUIArgs(JsonObject jsonObject) {
        this.uiArgs = jsonObject;
    }

    public void setExtra(StringRequestData stringRequestData, long j, long j2) {
        Object[] objArr = {stringRequestData, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f5505b346aacad357aa49978fefd3ddb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f5505b346aacad357aa49978fefd3ddb");
            return;
        }
        if (this.metrics == null) {
            this.metrics = new MetricsInfo();
        }
        this.metrics.msiStartTime = j;
        this.currentMsiStartTimeMillis = j2;
        if (stringRequestData != null) {
            this.metrics.nativeStartTime = stringRequestData.getNativeStartTime();
            this.extra = stringRequestData.getCustomData();
        }
    }

    public String getCustomData() {
        return this.extra;
    }

    public JsonObject getInnerArgs() {
        return this.innerArgs;
    }

    public String getCallbackId() {
        return this.callbackId;
    }

    public w.a<T> bodyData() {
        return this.bodyData;
    }

    public String getReferrer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b43e9649e67567ba2b9215e04023630", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b43e9649e67567ba2b9215e04023630") : this.mContext.d.a() == null ? "empty" : this.mContext.d.a().containerId;
    }

    public c<?> callback() {
        return this.callback;
    }

    public a getApiCall() {
        return this.defaultCall;
    }

    public IMsiApi getApiImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4ec542981ab4bf049ff1a8f6431f66", RobustBitConfig.DEFAULT_VALUE)) {
            return (IMsiApi) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4ec542981ab4bf049ff1a8f6431f66");
        }
        if (this.defaultCall == null) {
            return null;
        }
        return (IMsiApi) this.defaultCall.b;
    }

    public a attachApiCall(b bVar) throws ApiException {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9c384189afcb35f80c36f173a5d5c80", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9c384189afcb35f80c36f173a5d5c80");
        }
        if (this.defaultCall != null) {
            return this.defaultCall;
        }
        this.defaultCall = bVar.a(this);
        return this.defaultCall;
    }

    @NonNull
    public ApiPortal.b getContainerContext() {
        return this.mContext;
    }

    @NonNull
    public void setContainerContext(ApiPortal.b bVar) {
        if (bVar != null) {
            this.mContext = bVar;
        }
    }

    public Activity getActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2060bffa8cd3f893bce225749c7eeda", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2060bffa8cd3f893bce225749c7eeda") : this.mContext.b.a();
    }

    public String getSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd9ca6966d90f5ae8383ae3e3741c287", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd9ca6966d90f5ae8383ae3e3741c287") : this.mContext.d.a().name;
    }

    public String getScope() {
        return this.scope == null ? "default" : this.scope;
    }

    public long msiStartInnerTime() {
        return this.metrics.msiStartTime;
    }

    public long getCurrentMsiStartTimeMillis() {
        return this.currentMsiStartTimeMillis;
    }

    @NonNull
    public com.meituan.msi.location.c getMsiLocationLoaderProvider() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25f6f93eced80ec6597be2755f3cecd0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.location.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25f6f93eced80ec6597be2755f3cecd0");
        }
        final ApiPortal.b bVar = this.mContext;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = ApiPortal.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect3, false, "855d220c0879bfdf058822bec33518d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.location.c) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect3, false, "855d220c0879bfdf058822bec33518d4");
        }
        if (bVar.q != null) {
            return bVar.q;
        }
        if (com.meituan.msi.a.d() != null) {
            return com.meituan.msi.a.d();
        }
        bVar.q = new com.meituan.msi.location.c() { // from class: com.meituan.msi.ApiPortal.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msi.location.c
            @Nullable
            public final com.meituan.msi.location.b a(Activity activity, @NonNull c cVar) {
                Object[] objArr3 = {activity, cVar};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0d8b0cc7fd288b640133aa2498e3aec2", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0d8b0cc7fd288b640133aa2498e3aec2");
                }
                List a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msi.api.location.b.class, "msi_location_loader_creator");
                if (a2 != null && a2.size() > 0) {
                    return ((com.meituan.msi.api.location.b) a2.get(0)).a(activity, cVar);
                }
                return new com.meituan.msi.location.b() { // from class: com.meituan.msi.ApiPortal.b.1.1
                    @Override // com.meituan.msi.location.b
                    public final void a() {
                    }

                    @Override // com.meituan.msi.location.b
                    public final void a(com.meituan.msi.location.a aVar, String str) {
                    }
                };
            }
        };
        return bVar.q;
    }

    public void setApiCallback(c<?> cVar) {
        this.callback = cVar;
    }
}
