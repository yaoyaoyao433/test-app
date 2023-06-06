package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallInvite extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte dType;
    private short encrypt;
    private long gid;
    private String legid;
    private MeetingStatusItems[] mbers;
    private String sKey;
    private String sid;
    private HashMap<String, String> uData;
    private String vAppkey;
    private String vCid;
    private byte vcType;
    private byte vendor;

    public CSCallInvite() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4efb4b6b7f820484bf446662f63a6adc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4efb4b6b7f820484bf446662f63a6adc");
        } else {
            setMethod(CSCallUris.SVID_CALL_INVITE);
        }
    }

    public byte getVcType() {
        return this.vcType;
    }

    public HashMap<String, String> getuData() {
        return this.uData;
    }

    public MeetingStatusItems[] getMbers() {
        return this.mbers;
    }

    public long getGid() {
        return this.gid;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getvAppkey() {
        return this.vAppkey;
    }

    public byte getVendor() {
        return this.vendor;
    }

    public void setdType(byte b) {
        this.dType = b;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ebbd21a9e33e4399bcf9a20f48b4cf6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ebbd21a9e33e4399bcf9a20f48b4cf6d");
        } else {
            this.gid = j;
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setMbers(MeetingStatusItems[] meetingStatusItemsArr) {
        this.mbers = meetingStatusItemsArr;
    }

    public void setuData(HashMap<String, String> hashMap) {
        this.uData = hashMap;
    }

    public void setvAppkey(String str) {
        this.vAppkey = str;
    }

    public void setVcType(byte b) {
        this.vcType = b;
    }

    public void setVendor(byte b) {
        this.vendor = b;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public void setvCid(String str) {
        this.vCid = str;
    }

    public String getvCid() {
        return this.vCid;
    }

    public void setsKey(String str) {
        this.sKey = str;
    }

    public String getsKey() {
        return this.sKey;
    }

    public void setEncrypt(short s) {
        this.encrypt = s;
    }

    public short getEncrypt() {
        return this.encrypt;
    }
}
