package com.meituan.android.common.aidata.config;

import android.text.TextUtils;
import com.meituan.android.common.aidata.database.DBAIDataHelper;
import com.meituan.android.common.aidata.feature.persona.PersonaManager;
import com.meituan.android.common.aidata.monitor.LoganManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DBConfig {
    public static final String KEY_FLATTEN_OP_TYPE = "flattenOpType";
    public static final int KEY_FLATTEN_TYPE_FULL = 1;
    public static final int KEY_FLATTEN_TYPE_PART = 0;
    public static final String KEY_MAX_FLATTEN_LEVEL = "maxFlattenLevel";
    public static final String KEY_SQL_CONFIG_VER = "conf";
    public static final String KEY_TAG_FLATTEN = "tag_flatten_keys";
    public static final String KEY_VAL_LAB_CUSTOM_FLATTEN = "val_lab_custom_flatten_keys";
    public static final String KEY_VAL_LAB_FLATTEN = "val_lab_flatten";
    public static final String KEY_VAL_LAB_OPERATOR = "val_lab_operator";
    private static final String TAG = "DBConfig";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile DBConfig instance;
    private boolean mAidataVacuumEnabled;
    private boolean mAidataWalEnabled;
    private int mFlattenOpType;
    private int mMaxFlattenLevel;
    private List<List<String>> mTagFlattenKeyList;
    private List<List<String>> mValLabCustomFlattenKeyLIst;
    private String mValLabFlattenEndKey;
    private List<List<String>> mValLabFlattenKeyList;
    private String mValLabFlattenStartKey;

    public static DBConfig getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4f288b944b6805535e10079af9b4b7e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (DBConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4f288b944b6805535e10079af9b4b7e4");
        }
        if (instance == null) {
            synchronized (DBConfig.class) {
                if (instance == null) {
                    instance = new DBConfig();
                }
            }
        }
        return instance;
    }

    public DBConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f2f93aab3a7755f91edad8a07e27385", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f2f93aab3a7755f91edad8a07e27385");
            return;
        }
        this.mValLabFlattenStartKey = "";
        this.mValLabFlattenEndKey = "";
        this.mMaxFlattenLevel = 4;
        this.mFlattenOpType = 0;
        this.mValLabFlattenKeyList = new ArrayList();
    }

    public void updateDBConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c575d7cdba8f7b7bef63a173f9e66bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c575d7cdba8f7b7bef63a173f9e66bf");
            return;
        }
        StringBuilder sb = new StringBuilder("lxsdk updateDBConfig: ");
        sb.append(str);
        sb.append(" tm:");
        sb.append(System.currentTimeMillis());
        try {
            JSONObject jSONObject = new JSONObject(str);
            LoganManager.getInstance().recordHornConfig(ConfigManager.KEY_SQL_CONFIG_VER, TextUtils.isEmpty(jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, "")) ? "" : jSONObject.optString(PersonaManager.KEY_CLOUD_PUBLIC_FEATURE_CONFIG_VER, ""));
            this.mMaxFlattenLevel = jSONObject.optInt(KEY_MAX_FLATTEN_LEVEL, 4);
            this.mFlattenOpType = jSONObject.optInt(KEY_FLATTEN_OP_TYPE, 1);
            initValLabFlattenOperators(jSONObject.optJSONObject(KEY_VAL_LAB_OPERATOR));
            this.mValLabFlattenKeyList = initFlattenKeys(jSONObject.optJSONArray("val_lab_flatten"));
            this.mValLabCustomFlattenKeyLIst = initFlattenKeys(jSONObject.optJSONArray(KEY_VAL_LAB_CUSTOM_FLATTEN));
            this.mTagFlattenKeyList = initFlattenKeys(jSONObject.optJSONArray(KEY_TAG_FLATTEN));
        } catch (Exception e) {
            new StringBuilder("update db config failed: ").append(e);
        }
    }

    public void updateBlueDBRealTimeConfig(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9620a20640ebc9807778e58642993e1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9620a20640ebc9807778e58642993e1c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mAidataWalEnabled = jSONObject.optBoolean("enable_aidata_wal");
            DBAIDataHelper.getInstance().switchDBWALMode(this.mAidataWalEnabled);
            this.mAidataVacuumEnabled = jSONObject.optBoolean("enable_aidata_vacuum");
        } catch (Exception e) {
            new StringBuilder("update blue db realtime config failed: ").append(e);
        }
    }

    private List<List<String>> initFlattenKeys(JSONArray jSONArray) {
        Object[] objArr = {jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e64e0a129cb04b4ccc9495fdbde8876e", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e64e0a129cb04b4ccc9495fdbde8876e");
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(jSONArray2.getString(i2));
                    }
                    arrayList.add(arrayList2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    private void initValLabFlattenOperators(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "32122814701466fab94863288e694c35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "32122814701466fab94863288e694c35");
            return;
        }
        this.mValLabFlattenStartKey = jSONObject.optString("soperator");
        this.mValLabFlattenEndKey = jSONObject.optString("eoperator");
    }

    public List<List<String>> getValLabFlattenKeyList() {
        return this.mValLabFlattenKeyList;
    }

    public List<List<String>> getValLabCustomFlattenKeyLIst() {
        return this.mValLabCustomFlattenKeyLIst;
    }

    public List<List<String>> getTagFlattenKeyList() {
        return this.mTagFlattenKeyList;
    }

    public String getStartOperator() {
        return this.mValLabFlattenStartKey;
    }

    public String getEndOperator() {
        return this.mValLabFlattenEndKey;
    }

    public int getMaxFlattenLevel() {
        return this.mMaxFlattenLevel;
    }

    public int getFlattenType() {
        return this.mFlattenOpType;
    }

    public boolean isAidataWalEnabled() {
        return this.mAidataWalEnabled;
    }

    public boolean isAidataVacuumEnabled() {
        return this.mAidataVacuumEnabled;
    }
}
