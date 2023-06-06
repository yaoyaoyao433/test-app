package com.meituan.android.common.aidata.resources.bean;

import android.text.TextUtils;
import com.meituan.android.common.aidata.cep.js.CepCallJsManager;
import com.meituan.android.common.aidata.resources.bean.cep.CepBean;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String biz;
    public CepBean cep;
    public String cepRelation;
    public String feature;
    public String packageName;
    public String packageVersion;
    public FeatureSqlBean sqlBean;
    public SubTableConfigBean subTableConfigBean;
    public String ver;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface CepRelation {
        public static final String INDEPENDENT = "independent";
        public static final String MUTEX = "mutex";
    }

    public FeatureBean() {
    }

    public FeatureBean(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "134e94073212af0a49b9f6ed1ff9f99b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "134e94073212af0a49b9f6ed1ff9f99b");
            return;
        }
        String optString = jSONObject.optString(CepCallJsManager.JS_PARAM_KEY_CEP);
        if (!TextUtils.isEmpty(optString)) {
            this.cep = new CepBean(optString);
        }
        String optString2 = jSONObject.optString("android_sql");
        optString2 = TextUtils.isEmpty(optString2) ? jSONObject.optString("sql") : optString2;
        if (!TextUtils.isEmpty(optString2)) {
            this.sqlBean = new FeatureSqlBean(optString2);
        }
        this.feature = jSONObject.optString("feature");
        this.biz = jSONObject.optString("biz");
        this.ver = jSONObject.optString("ver");
        JSONObject optJSONObject = jSONObject.optJSONObject("subTableConfig");
        String optString3 = optJSONObject != null ? optJSONObject.optString("subTableName") : "";
        if (!TextUtils.isEmpty(optString3)) {
            this.subTableConfigBean = new SubTableConfigBean(optString3);
            JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("tableIndex") : null;
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    this.subTableConfigBean.addTableIndex(optJSONArray.optString(i));
                }
            }
        }
        this.cepRelation = jSONObject.optString("cepRelation", CepRelation.INDEPENDENT);
    }

    public FeatureBean(JSONObject jSONObject, String str, String str2) {
        this(jSONObject);
        Object[] objArr = {jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1b04f3b5338efba8cc07bd3452376f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1b04f3b5338efba8cc07bd3452376f1");
            return;
        }
        this.packageName = str;
        this.packageVersion = str2;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c8dde4ca4623f029305effcb9faf408", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c8dde4ca4623f029305effcb9faf408");
        }
        if (LogUtil.isLogEnabled()) {
            StringBuilder sb = new StringBuilder(" feature:");
            sb.append(this.feature);
            sb.append(" biz:");
            sb.append(this.biz);
            sb.append(" packageName:");
            sb.append(this.packageName);
            sb.append(" packageVersion:");
            sb.append(this.packageVersion);
            sb.append(" ver:");
            sb.append(this.ver);
            sb.append(" cep:");
            sb.append(this.cep != null ? this.cep.toString() : "");
            sb.append(" sql:");
            sb.append(this.sqlBean != null ? this.sqlBean.mSql : "");
            return sb.toString();
        }
        return "";
    }
}
