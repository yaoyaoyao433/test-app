package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallProbersp extends CSCallProto {
    public static final byte DETECT = 1;
    public static final byte REJOIN = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private short code;
    private String legid;
    private MeetingStatusItems[] mbers;
    private String sKey;
    private String sid;
    private byte type;

    public CSCallProbersp() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de1132e14d5fa277185825096f7c9141", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de1132e14d5fa277185825096f7c9141");
        } else {
            setMethod(CSCallUris.SVID_CALL_PROBERSP);
        }
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String getSid() {
        return this.sid;
    }

    public short getCode() {
        return this.code;
    }

    public void setCode(short s) {
        this.code = s;
    }

    public MeetingStatusItems[] getMbers() {
        return this.mbers;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public byte getType() {
        return this.type;
    }

    public String getsKey() {
        return this.sKey;
    }

    public String getLegid() {
        return this.legid;
    }
}
