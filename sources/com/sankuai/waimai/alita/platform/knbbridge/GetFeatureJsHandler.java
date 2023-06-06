package com.sankuai.waimai.alita.platform.knbbridge;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.aidata.jsengine.utils.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.feature.c;
import com.sankuai.waimai.alita.core.feature.d;
import com.sankuai.waimai.alita.core.feature.f;
import com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetFeatureJsHandler extends AbstractAlitaJsHandler {
    public static String NAME = "GetFeatureJsHandler";
    public static final String PARAM_NAME_BIZ = "biz";
    public static final String PARAM_NAME_CONFIG_ARRAY_KEY = "config_array";
    public static final String PARAM_NAME_FEATURE_CONFIG_KEY = "feature_configs";
    public static final String PARAM_NAME_FEATURE_LIST = "feature_list";
    public static final String PARAM_NAME_IS_REAL_TIME = "is_real_time";
    public static final String PARAM_NAME_TABLE_KEY = "table_key";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public boolean isOpSupported() {
        return true;
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public AbstractAlitaJsHandler.BaseParamBean parseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6128fe135a725bfc94fe0868324c11b9", RobustBitConfig.DEFAULT_VALUE)) {
            return (AbstractAlitaJsHandler.BaseParamBean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6128fe135a725bfc94fe0868324c11b9");
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray(PARAM_NAME_CONFIG_ARRAY_KEY);
            List list = (optJSONArray == null || optJSONArray.length() <= 0) ? null : (List) com.sankuai.waimai.alita.platform.utils.a.a().fromJson(optJSONArray.toString(), new TypeToken<List<GetFeatureParams.ConfigListBean>>() { // from class: com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.1
            }.getType());
            if (list != null) {
                return new GetFeatureParams(list);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isParamValid(com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler.BaseParamBean r13) throws java.lang.IllegalArgumentException {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.changeQuickRedirect
            java.lang.String r11 = "ed49fb1bcfd428d7f5cd90573e0aa1e7"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            if (r13 == 0) goto L56
            boolean r1 = r13 instanceof com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams
            if (r1 == 0) goto L56
            com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams r13 = (com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams) r13
            java.util.List<com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$ConfigListBean> r1 = r13.mConfigList
            if (r1 == 0) goto L50
            java.util.List<com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$ConfigListBean> r13 = r13.mConfigList
            java.util.Iterator r13 = r13.iterator()
        L34:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r13.next()
            com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$ConfigListBean r1 = (com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams.ConfigListBean) r1
            if (r1 == 0) goto L49
            boolean r1 = r1.isParamValid()
            if (r1 == 0) goto L49
            goto L34
        L49:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L4f:
            return r0
        L50:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        L56:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.isParamValid(com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler$BaseParamBean):boolean");
    }

    @Override // com.sankuai.waimai.alita.platform.knbbridge.AbstractAlitaJsHandler
    public void execInner(AbstractAlitaJsHandler.BaseParamBean baseParamBean) {
        Object[] objArr = {baseParamBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06c805127b0bbccdd0d4a64bbfb87c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06c805127b0bbccdd0d4a64bbfb87c57");
            return;
        }
        final GetFeatureParams getFeatureParams = (GetFeatureParams) baseParamBean;
        if (getFeatureParams == null || getFeatureParams.mConfigList == null || getFeatureParams.mConfigList.size() <= 0) {
            jsCallbackError(-190000, "缺少必传参数");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (GetFeatureParams.ConfigListBean configListBean : getFeatureParams.mConfigList) {
            if (configListBean != null) {
                for (GetFeatureParams.FeatureConfig featureConfig : configListBean.feature_configs) {
                    d dVar = new d();
                    dVar.b = configListBean.biz;
                    dVar.c = featureConfig.table_key;
                    dVar.d = featureConfig.feature_list;
                    dVar.e = featureConfig.is_real_time.booleanValue();
                    dVar.f = featureConfig.source;
                    arrayList.add(dVar);
                }
            }
        }
        c.a().a(null, arrayList, new f() { // from class: com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.alita.core.feature.f
            public final void a(@Nullable JSONObject jSONObject) {
                Object[] objArr2 = {jSONObject};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a510a75aecada09fa4fda37a88bde48c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a510a75aecada09fa4fda37a88bde48c");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("data", jSONObject);
                } catch (Exception unused) {
                }
                GetFeatureJsHandler.this.jsCallback(jSONObject2);
                HashMap hashMap = new HashMap();
                hashMap.put("method", Constants.Func.GET_FEATURE);
                hashMap.put("params", getFeatureParams);
                com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "success", (Map<String, Object>) hashMap);
            }

            @Override // com.sankuai.waimai.alita.core.feature.f
            public final void a(@Nullable Exception exc) {
                Object[] objArr2 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1504bf1bd4d13c8db62377c006f7ffa1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1504bf1bd4d13c8db62377c006f7ffa1");
                    return;
                }
                GetFeatureJsHandler.this.jsCallbackError(-190000, exc == null ? "其他未定义错误类型" : exc.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("method", Constants.Func.GET_FEATURE);
                hashMap.put("params", getFeatureParams);
                hashMap.put("errorMessage", exc != null ? exc.getMessage() : "");
                com.sankuai.waimai.alita.core.utils.c.b("alita_knb", (String) null, "failed", (Map<String, Object>) hashMap);
            }
        });
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class GetFeatureParams extends AbstractAlitaJsHandler.BaseParamBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<ConfigListBean> mConfigList;

        public GetFeatureParams(List<ConfigListBean> list) {
            super("");
            this.mConfigList = list;
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public final class ConfigListBean {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String biz;
            public List<FeatureConfig> feature_configs;

            public ConfigListBean(String str, List<FeatureConfig> list) {
                Object[] objArr = {GetFeatureParams.this, str, list};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6d31acfc798c7aa6e729855e02237c99", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6d31acfc798c7aa6e729855e02237c99");
                    return;
                }
                this.biz = str;
                this.feature_configs = list;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean isParamValid() {
                /*
                    r11 = this;
                    r0 = 0
                    java.lang.Object[] r8 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams.ConfigListBean.changeQuickRedirect
                    java.lang.String r10 = "b898bd3b62da999f0832dcd29614595d"
                    r4 = 0
                    r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                    r1 = r8
                    r2 = r11
                    r3 = r9
                    r5 = r10
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                    if (r1 == 0) goto L1f
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    return r0
                L1f:
                    java.lang.String r1 = r11.biz
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L5c
                    java.util.List<com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$FeatureConfig> r1 = r11.feature_configs
                    if (r1 == 0) goto L5c
                    java.util.List<com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$FeatureConfig> r1 = r11.feature_configs
                    int r1 = r1.size()
                    if (r1 > 0) goto L34
                    goto L5c
                L34:
                    java.util.List<com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$FeatureConfig> r1 = r11.feature_configs
                    java.util.Iterator r1 = r1.iterator()
                L3a:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L5a
                    java.lang.Object r2 = r1.next()
                    com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler$GetFeatureParams$FeatureConfig r2 = (com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams.FeatureConfig) r2
                    if (r2 == 0) goto L59
                    java.lang.String r3 = r2.feature_list
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 != 0) goto L58
                    java.lang.String r2 = r2.table_key
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 == 0) goto L3a
                L58:
                    return r0
                L59:
                    return r0
                L5a:
                    r0 = 1
                    return r0
                L5c:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.platform.knbbridge.GetFeatureJsHandler.GetFeatureParams.ConfigListBean.isParamValid():boolean");
            }
        }

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes4.dex */
        public static final class FeatureConfig {
            public static ChangeQuickRedirect changeQuickRedirect;
            public String feature_list;
            public Boolean is_real_time;
            public String source;
            public String table_key;

            public FeatureConfig(String str, String str2, boolean z, String str3) {
                this.table_key = str;
                this.feature_list = str2;
                this.is_real_time = Boolean.valueOf(z);
                this.source = str3;
            }
        }
    }
}
