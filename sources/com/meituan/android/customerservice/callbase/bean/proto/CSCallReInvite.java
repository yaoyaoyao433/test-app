package com.meituan.android.customerservice.callbase.bean.proto;

import com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingStatusItems;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CSCallReInvite extends CSCallProto {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long gid;
    private String legid;
    private MeetingStatusItems[] mbers;
    private String sid;
    private HashMap<String, String> uData;

    public CSCallReInvite() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "59b6947a2b3fab4889b4a1db7cb5fbc7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "59b6947a2b3fab4889b4a1db7cb5fbc7");
        } else {
            setMethod(CSCallUris.SVID_CALL_REINVITE);
        }
    }

    public long getGid() {
        return this.gid;
    }

    public String getLegid() {
        return this.legid;
    }

    public void setGid(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b507e5c2ab74a4aa0c7cd40383e11f10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b507e5c2ab74a4aa0c7cd40383e11f10");
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

    public void setSid(String str) {
        this.sid = str;
    }

    public String getSid() {
        return this.sid;
    }
}
