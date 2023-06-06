package com.meituan.android.common.aidata.cep.js;

import android.text.TextUtils;
import com.meituan.android.common.aidata.ai.bundle.model.AiBundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepCallJsConfig extends AiBundle.JSConfig {
    private static final String KEY_CEP_LIST = "cep";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final List<String> cepList;

    public CepCallJsConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69ee30f0bb2bb1b3710ff4c97d01a4fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69ee30f0bb2bb1b3710ff4c97d01a4fb");
        } else {
            this.cepList = new ArrayList();
        }
    }

    public AiBundle.JSConfig init(JSONObject jSONObject) {
        JSONArray optJSONArray;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dda8370b2a073a10069e0d5d965c3a8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (AiBundle.JSConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dda8370b2a073a10069e0d5d965c3a8b");
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("cep")) == null) {
            return this;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                this.cepList.add(optString);
            }
        }
        return this;
    }

    public List<String> getCepList() {
        return this.cepList;
    }

    @Override // com.meituan.android.common.aidata.ai.bundle.model.AiBundle.JSConfig
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c74e42c13118718aec7e88e2988e358", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c74e42c13118718aec7e88e2988e358");
        }
        return "super : " + super.toString() + "\nCepCallJsConfig{cepList=" + this.cepList + '}';
    }
}
