package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MeetingItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private short appid;
    private short cid;
    private String fMber;
    private short mType;
    private String mber;
    private byte role;

    public MeetingItem() {
    }

    public MeetingItem(String str, byte b, short s, short s2, short s3, String str2) {
        Object[] objArr = {str, Byte.valueOf(b), Short.valueOf(s), Short.valueOf(s2), Short.valueOf(s3), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2170f9c213cfdb864f50536fd3e4749", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2170f9c213cfdb864f50536fd3e4749");
            return;
        }
        this.mber = str;
        this.role = b;
        this.mType = s;
        this.appid = s2;
        this.cid = s3;
        this.fMber = str2;
    }

    public short getCid() {
        return this.cid;
    }

    public String getfMber() {
        return this.fMber;
    }

    public void setfMber(String str) {
        this.fMber = str;
    }

    public void setMber(String str) {
        this.mber = str;
    }

    public String getMber() {
        return this.mber;
    }

    public void setAppId(short s) {
        this.appid = s;
    }

    public short getAppId() {
        return this.appid;
    }

    public void setType(short s) {
        this.mType = s;
    }

    public short getType() {
        return this.mType;
    }

    public void setRole(byte b) {
        this.role = b;
    }

    public byte getRole() {
        return this.role;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f75700300bd8b44336d835b1e752334", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f75700300bd8b44336d835b1e752334");
        }
        return "mber " + this.mber + ", role " + ((int) this.role) + ", mType " + ((int) this.mType) + ", fMber " + this.fMber;
    }
}
