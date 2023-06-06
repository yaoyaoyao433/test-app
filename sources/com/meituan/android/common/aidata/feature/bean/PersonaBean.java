package com.meituan.android.common.aidata.feature.bean;

import android.text.TextUtils;
import com.meituan.android.common.aidata.cache.result.ResultRow;
import com.meituan.android.common.aidata.database.BaseItem;
import com.meituan.android.common.aidata.feature.persona.PersonaTable;
import com.meituan.android.common.aidata.utils.AESUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PersonaBean extends BaseItem {
    public static final String IV_AES = "0102030405060718";
    public static final String KEY_AES = "67537f0005eed76108a83206e784080c";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int element_type;
    public String feature_identifier;
    public String feature_value;
    public int label_id;
    public int type;
    public long update_period;
    public long update_timestamp;
    public long user_id;
    public int value_type;

    public PersonaBean() {
    }

    public PersonaBean(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58e3bb5e68c1a4627734bb7f854415eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58e3bb5e68c1a4627734bb7f854415eb");
            return;
        }
        this.label_id = jSONObject.optInt(PersonaTable.LABEL_ID, -1);
        this.update_period = jSONObject.optLong(PersonaTable.UPDATE_PERIOD, -1L);
        this.type = jSONObject.optInt("type", -1);
    }

    public static List<PersonaBean> parseList(long j, String str) {
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70e262db2acfb7dc37e0fc320efdd4c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70e262db2acfb7dc37e0fc320efdd4c6");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                PersonaBean personaBean = new PersonaBean();
                personaBean.user_id = j;
                personaBean.value_type = optJSONObject.optInt("valueType", -1);
                personaBean.label_id = optJSONObject.optInt("id", -1);
                personaBean.feature_value = optJSONObject.isNull("value") ? null : optJSONObject.optString("value", null);
                personaBean.element_type = optJSONObject.optInt("elementType", -1);
                arrayList.add(personaBean);
            }
            return arrayList;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Map<String, List<ResultRow>> getRealFeature() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f38f054b4e0bf17b94e88c100586098a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f38f054b4e0bf17b94e88c100586098a");
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(this.feature_identifier, Collections.singletonList(new ResultRow.RowBuilder(1).add(PersonaTable.FEATURE_VALUE, TextUtils.isEmpty(this.feature_value) ? this.feature_value : AESUtil.decryptCBC(this.feature_value, KEY_AES, IV_AES)).build()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        new StringBuilder("get persona feature value from bean,hit cache,value is").append(hashMap);
        return hashMap;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2c7bacea9f8f3feeeac682c105d1de2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2c7bacea9f8f3feeeac682c105d1de2f");
        }
        return "PersonaBean{update_timestamp=" + this.update_timestamp + ", element_type=" + this.element_type + ", label_id=" + this.label_id + ", feature_value='" + this.feature_value + "', value_type=" + this.value_type + ", update_period=" + this.update_period + ", user_id=" + this.user_id + ", type=" + this.type + ", feature_identifier='" + this.feature_identifier + '}';
    }
}
