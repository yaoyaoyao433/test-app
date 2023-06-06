package com.meituan.android.common.statistics.flowmanager;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SdkInteceptStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected static List<ConfigItem> mConfigList = Collections.synchronizedList(new ArrayList());

    public boolean intercept(String str, String str2, String str3, String str4, String str5) {
        Object[] objArr = {str, str2, str3, str4, str5};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7766d563a7d3cb90b0293f59b1fb9e08", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7766d563a7d3cb90b0293f59b1fb9e08")).booleanValue();
        }
        if (mConfigList != null && mConfigList.size() > 0) {
            for (ConfigItem configItem : mConfigList) {
                if (configItem != null && configItem.match(str2, str, str3, str4, str5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void reset() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6ec50fd5225b7796d8c445ce4c434e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6ec50fd5225b7796d8c445ce4c434e1");
        } else if (mConfigList != null) {
            mConfigList.clear();
        }
    }

    public void ruleParse(Context context, JSONArray jSONArray) {
        Object[] objArr = {context, jSONArray};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7e1132f7fa44b0b7d04241f1d2f264e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7e1132f7fa44b0b7d04241f1d2f264e");
            return;
        }
        reset();
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                ConfigItem configItem = new ConfigItem();
                configItem.parseItem(optJSONObject);
                mConfigList.add(configItem);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class ConfigItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<String> mBidList;
        public List<String> mCategoryList;
        public List<String> mCidList;
        public List<String> mEventNameList;
        public List<String> mNtList;

        public ConfigItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "718e0e6780d3f366a3b49526253c47f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "718e0e6780d3f366a3b49526253c47f5");
                return;
            }
            this.mCategoryList = null;
            this.mEventNameList = null;
            this.mCidList = null;
            this.mBidList = null;
            this.mNtList = null;
        }

        public void parseItem(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc01604c625dc746d3fd98a0cb03d146", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc01604c625dc746d3fd98a0cb03d146");
                return;
            }
            this.mCategoryList = parseCategoryItem(jSONObject.optJSONArray("category"));
            this.mEventNameList = parseSubItem(jSONObject.optJSONArray("nm"));
            this.mCidList = parseSubItem(jSONObject.optJSONArray("cid"));
            this.mBidList = parseSubItem(jSONObject.optJSONArray("bid"));
            this.mNtList = parseSubItem(jSONObject.optJSONArray("nt"));
        }

        public List parseCategoryItem(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75e1699bc20ec1a647852e981e39f90", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75e1699bc20ec1a647852e981e39f90");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    String optString = jSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString) && !optString.startsWith(Constants.PREFIX)) {
                        arrayList.add(Constants.PREFIX + optString);
                    }
                }
            }
            return arrayList;
        }

        public List parseSubItem(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "badaffb245d9ead5f495f76ceec1513d", 6917529027641081856L)) {
                return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "badaffb245d9ead5f495f76ceec1513d");
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    String optString = jSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        arrayList.add(optString);
                    }
                }
            }
            return arrayList;
        }

        public boolean match(String str, String str2, String str3, String str4, String str5) {
            boolean z;
            Object[] objArr = {str, str2, str3, str4, str5};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d817e956b09648cad0dd56178e0154a6", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d817e956b09648cad0dd56178e0154a6")).booleanValue();
            }
            if (TextUtils.isEmpty(str) || this.mEventNameList == null || this.mEventNameList.size() <= 0) {
                z = false;
            } else if (!this.mEventNameList.contains(str)) {
                return false;
            } else {
                z = true;
            }
            if (!TextUtils.isEmpty(str2) && this.mCategoryList != null && this.mCategoryList.size() > 0) {
                if (!this.mCategoryList.contains(str2)) {
                    return false;
                }
                z = true;
            }
            if (!TextUtils.isEmpty(str3) && this.mCidList != null && this.mCidList.size() > 0) {
                if (!this.mCidList.contains(str3)) {
                    return false;
                }
                z = true;
            }
            if (!TextUtils.isEmpty(str4) && this.mBidList != null && this.mBidList.size() > 0) {
                if (!this.mBidList.contains(str4)) {
                    return false;
                }
                z = true;
            }
            return (TextUtils.isEmpty(str5) || this.mNtList == null || this.mNtList.size() <= 0) ? z : this.mNtList.contains(str5);
        }
    }
}
