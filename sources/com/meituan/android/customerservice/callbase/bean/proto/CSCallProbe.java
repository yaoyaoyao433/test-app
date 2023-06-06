package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallProbe extends CSCallProto {
    public static final byte DETECT = 1;
    public static final byte REJOIN = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    private String legid;
    private String sid;
    private byte type;

    public CSCallProbe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01956722a1c8cab8135976cd5788415b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01956722a1c8cab8135976cd5788415b");
        } else {
            setMethod(CSCallUris.SVID_CALL_PROBE);
        }
    }

    public void setLegid(String str) {
        this.legid = str;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public String getLegid() {
        return this.legid;
    }

    public String getSid() {
        return this.sid;
    }

    public void setType(byte b) {
        this.type = b;
    }

    public byte getType() {
        return this.type;
    }
}
