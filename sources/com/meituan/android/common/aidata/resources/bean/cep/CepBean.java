package com.meituan.android.common.aidata.resources.bean.cep;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.common.aidata.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CepBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> mCepRuleList;

    public CepBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b1756fc66fee2b1cd7e3b6e25b8b5a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b1756fc66fee2b1cd7e3b6e25b8b5a3");
            return;
        }
        this.mCepRuleList = null;
        this.mCepRuleList = new ArrayList<>();
        try {
            Object nextValue = new JSONTokener(str).nextValue();
            if (nextValue instanceof JSONObject) {
                parseJSONObjectBean(str);
            } else if (nextValue instanceof JSONArray) {
                parseJSONArrayBean(str);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void parseJSONArrayBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44fe584bb0f99f4683d163379c9a46b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44fe584bb0f99f4683d163379c9a46b6");
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.mCepRuleList.add(jSONArray.optString(i));
                    }
                }
            } catch (JSONException e) {
                Log.e("Aidata", "cep parse json exception:" + e.toString());
            }
        }
    }

    public void parseJSONObjectBean(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e651279d0dd3c2be121650f249147ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e651279d0dd3c2be121650f249147ba");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mCepRuleList.add(str);
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b54dab5ce556e6762644eef2631fa018", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b54dab5ce556e6762644eef2631fa018");
        }
        if (LogUtil.isLogEnabled() && this.mCepRuleList != null && this.mCepRuleList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = this.mCepRuleList.iterator();
            while (it.hasNext()) {
                sb.append(" -- cep item:" + it.next());
            }
            return sb.toString();
        }
        return "";
    }

    public ArrayList<String> getCepRuleList() {
        return this.mCepRuleList;
    }
}
