package com.sankuai.xm.file.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class Block {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mLength;
    private String mMd5;
    private String mPartId;
    private long mPartNum;
    private long mStart;
    private int mState;

    public Block() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12a16e42d7e6a19c19b2c218ee6f95f7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12a16e42d7e6a19c19b2c218ee6f95f7");
            return;
        }
        this.mStart = 0L;
        this.mStart = 0L;
        this.mLength = 0L;
        this.mMd5 = "";
        this.mPartId = "";
        this.mPartNum = 0L;
    }

    public int getState() {
        return this.mState;
    }

    public void setState(int i) {
        this.mState = i;
    }

    public long getStart() {
        return this.mStart;
    }

    public void setStart(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d1d7c43e8bb452d3a2bec662098468e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d1d7c43e8bb452d3a2bec662098468e5");
        } else {
            this.mStart = j;
        }
    }

    public long getLength() {
        return this.mLength;
    }

    public void setLength(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc2a793c7778de81087410cfc39025da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc2a793c7778de81087410cfc39025da");
        } else {
            this.mLength = j;
        }
    }

    public String getMd5() {
        return this.mMd5;
    }

    public void setMd5(String str) {
        this.mMd5 = str;
    }

    public String getPartId() {
        return this.mPartId;
    }

    public void setPartId(String str) {
        this.mPartId = str;
    }

    public long getPartNum() {
        return this.mPartNum;
    }

    public void setPartNum(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24b4f01b82a30808728b6230a4a14344", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24b4f01b82a30808728b6230a4a14344");
        } else {
            this.mPartNum = j;
        }
    }

    public void deserializeJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2b8c08e5580665509e8baffd31d1224", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2b8c08e5580665509e8baffd31d1224");
        } else if (jSONObject == null) {
        } else {
            this.mState = jSONObject.optInt("state");
            this.mStart = jSONObject.optLong("start");
            this.mLength = jSONObject.optLong("length");
            this.mMd5 = jSONObject.optString("md5");
            this.mPartId = jSONObject.optString("partId");
            this.mPartNum = jSONObject.optLong("partNum");
        }
    }

    public JSONObject serializeObject() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd16a817b53967018c02713af2791331", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd16a817b53967018c02713af2791331");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.mState);
        jSONObject.put("start", this.mStart);
        jSONObject.put("length", this.mLength);
        jSONObject.put("md5", this.mMd5);
        jSONObject.put("partId", this.mPartId);
        jSONObject.put("partNum", this.mPartNum);
        return jSONObject;
    }
}
