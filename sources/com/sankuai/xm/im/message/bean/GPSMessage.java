package com.sankuai.xm.im.message.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class GPSMessage extends IMMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mImgUrl;
    private double mLatitude;
    private double mLongitude;
    private String mName;

    public GPSMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "437b0adbc355c6d5d0c617c696525a90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "437b0adbc355c6d5d0c617c696525a90");
            return;
        }
        this.mLatitude = 0.0d;
        this.mLongitude = 0.0d;
        this.mName = "";
        this.mImgUrl = "";
        setMsgType(9);
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public void setLatitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcf15ded96082bb1582e5cb8568d311f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcf15ded96082bb1582e5cb8568d311f");
        } else {
            this.mLatitude = d;
        }
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public void setLongitude(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "888c5ed6c5270dc91865977f54118d9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "888c5ed6c5270dc91865977f54118d9f");
        } else {
            this.mLongitude = d;
        }
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public String getImgUrl() {
        return this.mImgUrl;
    }

    public void setImgUrl(String str) {
        this.mImgUrl = str;
    }

    @Override // com.sankuai.xm.im.message.bean.IMMessage
    public void copyTo(IMMessage iMMessage) {
        Object[] objArr = {iMMessage};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "07896cbcb15e0705fc00c6a616bbc0e5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "07896cbcb15e0705fc00c6a616bbc0e5");
            return;
        }
        super.copyTo(iMMessage);
        if (iMMessage instanceof GPSMessage) {
            GPSMessage gPSMessage = (GPSMessage) iMMessage;
            gPSMessage.mLatitude = this.mLatitude;
            gPSMessage.mLongitude = this.mLongitude;
            gPSMessage.mName = this.mName;
            gPSMessage.mImgUrl = this.mImgUrl;
        }
    }
}
