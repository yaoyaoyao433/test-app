package com.sankuai.xm.imui.controller.group.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.utils.a;
import com.sankuai.xm.tinyormapt.annotation.Entity;
import com.sankuai.xm.tinyormapt.annotation.GetM;
import com.sankuai.xm.tinyormapt.annotation.Id;
import com.sankuai.xm.tinyormapt.annotation.Property;
import com.sankuai.xm.tinyormapt.annotation.SetM;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Entity(name = AtMeInfo.TABLE_NAME)
/* loaded from: classes6.dex */
public class AtMeInfo {
    public static final String AT_TYPE = "type";
    public static final String FROM_NAME = "fromName";
    public static final String FROM_UID = "fromUid";
    public static final String GROUP_ID = "gid";
    public static final String MSG_ID = "msgId";
    public static final String TABLE_NAME = "at_me_info";
    public static final String TIME_STAMP = "time_stamp";
    public static final String UUID = "uuid";
    public static ChangeQuickRedirect changeQuickRedirect;
    @Property(name = "fromName")
    private String mFromName;
    @Property(name = "fromUid")
    private long mFromUid;
    @Property(name = "gid")
    private long mGid;
    @Property(name = "msgId")
    private long mMsgId;
    @Property(name = TIME_STAMP)
    private long mTimeStamp;
    @Property(name = "type")
    private int mType;
    @Id
    @Property(name = "uuid")
    private String mUuid;

    public AtMeInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7b198362f96e7d3a2a4a755a8794750", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7b198362f96e7d3a2a4a755a8794750");
        } else {
            this.mType = 1;
        }
    }

    public AtMeInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1a7b894023f30c3786d3a098adc69e23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1a7b894023f30c3786d3a098adc69e23");
            return;
        }
        this.mType = 1;
        this.mUuid = jSONObject.optString("uuid", "");
        this.mMsgId = jSONObject.optLong("msgId", 0L);
        this.mGid = jSONObject.optLong("gid", 0L);
        this.mFromUid = jSONObject.optLong("fromUid", 0L);
        this.mFromName = jSONObject.optString("fromName", "");
        this.mType = jSONObject.optInt("type", 0);
        this.mTimeStamp = jSONObject.optLong(TIME_STAMP, 0L);
    }

    @GetM(property = "mUuid")
    public String getUuid() {
        return this.mUuid;
    }

    @SetM(property = "mUuid")
    public void setUuid(String str) {
        this.mUuid = str;
    }

    @GetM(property = "mMsgId")
    public long getMsgId() {
        return this.mMsgId;
    }

    @SetM(property = "mMsgId")
    public void setMsgId(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f869ef11a74ebbf4f8c1faa0b1c5acce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f869ef11a74ebbf4f8c1faa0b1c5acce");
        } else {
            this.mMsgId = j;
        }
    }

    @GetM(property = "mGid")
    public long getGid() {
        return this.mGid;
    }

    @SetM(property = "mGid")
    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8490f4bd402f29a748c3323285e99d0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8490f4bd402f29a748c3323285e99d0c");
        } else {
            this.mGid = j;
        }
    }

    @GetM(property = "mFromUid")
    public long getFromUid() {
        return this.mFromUid;
    }

    @SetM(property = "mFromUid")
    public void setFromUid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5601888543a5ffba5ca89e019589ca9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5601888543a5ffba5ca89e019589ca9d");
        } else {
            this.mFromUid = j;
        }
    }

    @GetM(property = "mFromName")
    public String getFromName() {
        return this.mFromName;
    }

    @SetM(property = "mFromName")
    public void setFromName(String str) {
        this.mFromName = str;
    }

    @GetM(property = "mType")
    public int getType() {
        return this.mType;
    }

    @SetM(property = "mType")
    public void setType(int i) {
        this.mType = i;
    }

    @GetM(property = "mTimeStamp")
    public long getTimeStamp() {
        return this.mTimeStamp;
    }

    @SetM(property = "mTimeStamp")
    public void setTimeStamp(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7e328aae66ba15b4c3e685447096f1d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7e328aae66ba15b4c3e685447096f1d");
        } else {
            this.mTimeStamp = j;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b02f2c050ddc5193ef34869d745475e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b02f2c050ddc5193ef34869d745475e");
        }
        return "AtMeInfo{mGid=" + this.mGid + ", mMsgId='" + this.mMsgId + "', mUuid=" + this.mUuid + ", mTimeStamp=" + this.mTimeStamp + '}';
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9398cd149819021ddcc29a892792503", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9398cd149819021ddcc29a892792503");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", this.mUuid);
            jSONObject.put("msgId", this.mMsgId);
            jSONObject.put("gid", this.mGid);
            jSONObject.put("fromUid", this.mFromUid);
            jSONObject.put("fromName", this.mFromName);
            jSONObject.put("type", this.mType);
            jSONObject.put(TIME_STAMP, this.mTimeStamp);
            return jSONObject.toString();
        } catch (JSONException e) {
            a.a(e);
            return null;
        }
    }
}
