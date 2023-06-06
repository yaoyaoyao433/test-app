package com.meituan.android.common.statistics.pageinfo;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class PageInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private volatile String category;
    private volatile String cid;
    private SearchIndexKey indexKey;
    private volatile String proc;
    private volatile String ref;
    private volatile String requestId;
    private volatile String requestRefId;
    private volatile long startTime;
    private ConcurrentHashMap<String, Object> val_lab;

    public PageInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab61c52d683696c46ad364d9b0d4743d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab61c52d683696c46ad364d9b0d4743d");
            return;
        }
        this.requestId = "";
        this.requestRefId = "";
        this.cid = "";
        this.ref = "";
        this.category = "";
        this.proc = "";
        this.val_lab = new ConcurrentHashMap<String, Object>() { // from class: com.meituan.android.common.statistics.pageinfo.PageInfo.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
            public Object put(@NonNull String str, @NonNull Object obj) {
                Object[] objArr2 = {str, obj};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b2b3532c4082b460e8819ae292859741", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b2b3532c4082b460e8819ae292859741");
                }
                if (str == null) {
                    str = "";
                }
                if (obj == null) {
                    obj = "";
                }
                return super.put((AnonymousClass1) str, (String) obj);
            }
        };
        this.indexKey = new SearchIndexKey();
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public final String getRequestRefId() {
        return this.requestRefId;
    }

    public final void setRequestRefId(String str) {
        this.requestRefId = str;
    }

    public final String getCid() {
        return this.cid;
    }

    public final void setCid(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dba19e5823aff176a122cf9959eea3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dba19e5823aff176a122cf9959eea3b");
            return;
        }
        this.cid = str;
        this.indexKey.setPrimaryKey(str);
    }

    public final String getRef() {
        return this.ref;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e0856c79cb67966366947c5c11f6a54e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e0856c79cb67966366947c5c11f6a54e");
        } else {
            this.startTime = j;
        }
    }

    public final String getProcName() {
        return this.proc;
    }

    public final void setProName(String str) {
        this.proc = str;
    }

    public final ConcurrentHashMap<String, Object> getValLab() {
        return this.val_lab;
    }

    public final void addValLab(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ebc2a5500d457221b450beb7605d1d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ebc2a5500d457221b450beb7605d1d0");
        } else {
            this.val_lab.put(str, str2);
        }
    }

    public final void addValLab(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d79593670e663a07674d40aa9562e62c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d79593670e663a07674d40aa9562e62c");
        } else if (map != null) {
            for (String str : map.keySet()) {
                this.val_lab.put(str, map.get(str));
            }
        }
    }

    public final void clearValLab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e54933b78a95746c14222c4c3f6bace", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e54933b78a95746c14222c4c3f6bace");
        } else {
            this.val_lab.clear();
        }
    }

    public final String getCategory() {
        return this.category;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final boolean match(SearchIndexKey searchIndexKey) {
        Object[] objArr = {searchIndexKey};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bda1816cced0b852108e86df4c85dc3", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bda1816cced0b852108e86df4c85dc3")).booleanValue();
        }
        if (searchIndexKey != null && !TextUtils.isEmpty(searchIndexKey.primaryKey) && searchIndexKey.primaryKey.equals(this.indexKey.primaryKey)) {
            searchIndexKey.matchResult = 2;
            if (searchIndexKey.matchMode == 1 || TextUtils.isEmpty(searchIndexKey.secondaryKey)) {
                return true;
            }
            if (searchIndexKey.secondaryKey.equals(this.indexKey.secondaryKey)) {
                searchIndexKey.matchResult = 1;
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f075c115c9fb99029a88d2803fc0c851", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f075c115c9fb99029a88d2803fc0c851");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cid:");
        sb.append(this.cid);
        sb.append(",requestId:");
        sb.append(this.requestId);
        sb.append("\n,startTime:");
        sb.append(this.startTime);
        sb.append(",val_lab:");
        sb.append(this.val_lab);
        sb.append("\n,ref:");
        sb.append(this.ref);
        sb.append(",requestRefId:");
        sb.append(this.requestRefId);
        sb.append("\n,category:");
        sb.append(this.category);
        sb.append(CommonConstant.Symbol.COMMA);
        return ((Object) sb) + super.toString();
    }

    public final void parse(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b98336c3176354a41cf019aff9829bad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b98336c3176354a41cf019aff9829bad");
            return;
        }
        try {
            this.requestId = jSONObject.optString(Constants.EventInfoConsts.KEY_REQ_ID);
            this.requestRefId = jSONObject.optString(Constants.EventInfoConsts.KEY_REFER_REQ_ID);
            this.cid = jSONObject.optString("val_cid");
            this.ref = jSONObject.optString("val_ref");
            this.category = jSONObject.optString("category");
            this.proc = jSONObject.optString(Constants.EventInfoConsts.KEY_PROC);
            JSONObject optJSONObject = jSONObject.optJSONObject("val_lab");
            if (optJSONObject == null || optJSONObject.length() <= 0) {
                return;
            }
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    this.val_lab.put(next, opt);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final JSONObject toJsonObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "619c893fa196508580ea9717eaa2da87", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "619c893fa196508580ea9717eaa2da87");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.EventInfoConsts.KEY_REQ_ID, this.requestId);
            jSONObject.put(Constants.EventInfoConsts.KEY_REFER_REQ_ID, this.requestRefId);
            jSONObject.put("val_cid", this.cid);
            jSONObject.put("val_ref", this.ref);
            jSONObject.put("category", this.category);
            jSONObject.put(Constants.EventInfoConsts.KEY_PROC, this.proc);
            jSONObject.put("val_lab", JsonUtil.mapToJSONObject(this.val_lab));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
