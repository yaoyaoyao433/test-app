package com.sankuai.mesh.bean;

import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.mesh.util.a;
import com.sankuai.mesh.util.c;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MeshBaseUrl implements Serializable, Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -516166557274959519L;
    private String api;
    private String apiAdaptId;
    private List<MeshApiType> apiAdaptIds;
    private String businessId;
    private JsonObject data;
    private JsonObject error;
    private int meshApiIndex;
    private JsonObject parameters;
    private HashMap<String, String> scheme;
    private String service;
    private String sourceType;
    private String status;
    private String uniqueId;

    public MeshBaseUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "980e2c01a7c8e68ce73921b77d16cc44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "980e2c01a7c8e68ce73921b77d16cc44");
        } else {
            this.scheme = new HashMap<>();
        }
    }

    public boolean isRequest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d5e229c846bcaea46638fde041abdbb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d5e229c846bcaea46638fde041abdbb")).booleanValue() : TextUtils.isEmpty(this.status);
    }

    public boolean isRequestSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1786d0068337ceb59766747c1f1373f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1786d0068337ceb59766747c1f1373f")).booleanValue() : "success".equals(this.status);
    }

    /* renamed from: clone */
    public MeshBaseUrl m14clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ac18f4ba24844f4bf19f7b0957faefd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ac18f4ba24844f4bf19f7b0957faefd9");
        }
        try {
            return (MeshBaseUrl) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean hasApiType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ce78a6c1b4dba0a6c42cbe8eecf03f9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ce78a6c1b4dba0a6c42cbe8eecf03f9")).booleanValue() : !a.a(this.apiAdaptIds);
    }

    public MeshApiType getCurrentApiType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af1d265e1b0fe8e4ad076b592c983e94", RobustBitConfig.DEFAULT_VALUE)) {
            return (MeshApiType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af1d265e1b0fe8e4ad076b592c983e94");
        }
        if (!hasApiType() || this.meshApiIndex >= this.apiAdaptIds.size()) {
            return null;
        }
        return this.apiAdaptIds.get(this.meshApiIndex);
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public void setBusinessId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "300a23ddeb0bb875ebfa8469c4d4c863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "300a23ddeb0bb875ebfa8469c4d4c863");
            return;
        }
        this.businessId = str;
        updateHashMap("businessId", str);
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d52e1ee97388e303347979150556e465", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d52e1ee97388e303347979150556e465");
            return;
        }
        this.sourceType = str;
        updateHashMap("sourceType", str);
    }

    public String getService() {
        return this.service;
    }

    public void setService(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d67616363dd6b31948164c069fc8d9c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d67616363dd6b31948164c069fc8d9c3");
            return;
        }
        this.service = str;
        updateHashMap("service", str);
    }

    public String getApi() {
        return this.api;
    }

    public void setApi(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38a88247410e6d637723b46f309ee880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38a88247410e6d637723b46f309ee880");
            return;
        }
        this.api = str;
        updateHashMap("api", str);
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public void setUniqueId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5970581c5ced90be909b7ab20f47f368", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5970581c5ced90be909b7ab20f47f368");
            return;
        }
        this.uniqueId = str;
        updateHashMap(CepCallJsManager.JS_PARAM_CEP_UNIQUE_ID, str);
    }

    public JsonObject getParameters() {
        return this.parameters;
    }

    public void setParameters(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6991166ce8941638b5b5c576d2988ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6991166ce8941638b5b5c576d2988ab2");
            return;
        }
        this.parameters = jsonObject;
        updateHashMap("parameters", jsonObject != null ? jsonObject.toString() : "");
    }

    public List<MeshApiType> getApiAdaptIds() {
        return this.apiAdaptIds;
    }

    public void setApiAdaptIds(List<MeshApiType> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4e48385d5704442dd2025d6d90e2468", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4e48385d5704442dd2025d6d90e2468");
            return;
        }
        this.apiAdaptIds = list;
        updateHashMap("apiAdaptIds", list != null ? list.toString() : "");
    }

    public String getApiAdaptId() {
        return this.apiAdaptId;
    }

    public void setApiAdaptId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3febd4756f9dba996caca4df20476cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3febd4756f9dba996caca4df20476cab");
            return;
        }
        this.apiAdaptId = str;
        updateHashMap("apiAdaptId", str);
    }

    public JsonObject getData() {
        return this.data;
    }

    public void setData(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c9bcc1065d3bd9936b5e92058574beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c9bcc1065d3bd9936b5e92058574beb");
            return;
        }
        this.data = jsonObject;
        updateHashMap("data", jsonObject != null ? jsonObject.toString() : "");
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf06c28f574dc26d38fef697f4e00fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf06c28f574dc26d38fef697f4e00fee");
            return;
        }
        this.status = str;
        updateHashMap("status", str);
    }

    public JsonObject getError() {
        return this.error;
    }

    public void setError(JsonObject jsonObject) {
        Object[] objArr = {jsonObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e10b8dc38b80a1bd1c430d5eb76933c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e10b8dc38b80a1bd1c430d5eb76933c");
            return;
        }
        this.error = jsonObject;
        updateHashMap("error", jsonObject != null ? jsonObject.toString() : "");
    }

    public void autoIncrementIndex() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "118ca26651d0907c24c5ccabed7ac60d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "118ca26651d0907c24c5ccabed7ac60d");
        } else {
            this.meshApiIndex++;
        }
    }

    private void updateHashMap(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9db5362114a66efc3d6c139079bc0cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9db5362114a66efc3d6c139079bc0cb1");
            return;
        }
        if (this.scheme == null) {
            this.scheme = new HashMap<>();
        }
        if (TextUtils.isEmpty(str2)) {
            this.scheme.remove(str);
        } else {
            this.scheme.put(str, str2);
        }
    }

    public String toString() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "914f611ba0565816b93ef13dc0d7eb31", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "914f611ba0565816b93ef13dc0d7eb31");
        }
        StringBuilder sb = new StringBuilder("mesh://?");
        for (Map.Entry<String, String> entry : this.scheme.entrySet()) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(Uri.encode(entry.getValue()));
            i = i2;
        }
        return sb.toString();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String api;
        private List<MeshApiType> apiAdaptIds;
        private String businessId;
        private JsonObject parameters;
        private String service;
        private String uniqueId;

        public MeshBaseUrl build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "043bb18aa4f02b5f7073476b46c62192", RobustBitConfig.DEFAULT_VALUE)) {
                return (MeshBaseUrl) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "043bb18aa4f02b5f7073476b46c62192");
            }
            MeshBaseUrl meshBaseUrl = new MeshBaseUrl();
            meshBaseUrl.businessId = this.businessId;
            meshBaseUrl.service = this.service;
            meshBaseUrl.api = this.api;
            meshBaseUrl.parameters = this.parameters;
            meshBaseUrl.apiAdaptIds = this.apiAdaptIds;
            return meshBaseUrl;
        }

        public Builder businessId(String str) {
            this.businessId = str;
            return this;
        }

        public Builder service(String str) {
            this.service = str;
            return this;
        }

        public Builder api(String str) {
            this.api = str;
            return this;
        }

        public Builder parameters(JsonObject jsonObject) {
            this.parameters = jsonObject;
            return this;
        }

        public Builder parameters(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "284adbe9bcfdadf2067369c22561bb81", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "284adbe9bcfdadf2067369c22561bb81");
            }
            this.parameters = c.a(str);
            return this;
        }

        public Builder apiAdaptIds(List<MeshApiType> list) {
            this.apiAdaptIds = list;
            return this;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class MeshApiType implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -677161249634978770L;
        public String apiAdaptId;
        public String targetType;
        public String url;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d379e8032adf1ffa2cd5c7cc11133eb", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d379e8032adf1ffa2cd5c7cc11133eb");
            }
            JsonObject jsonObject = new JsonObject();
            if (!TextUtils.isEmpty(this.targetType)) {
                jsonObject.addProperty("targetType", this.targetType);
            }
            if (!TextUtils.isEmpty(this.apiAdaptId)) {
                jsonObject.addProperty("apiAdaptId", this.apiAdaptId);
            }
            return jsonObject.toString();
        }
    }
}
