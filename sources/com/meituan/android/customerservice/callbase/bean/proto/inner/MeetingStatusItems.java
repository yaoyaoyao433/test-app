package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MeetingStatusItems extends MeetingItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte status;

    public MeetingStatusItems() {
    }

    public MeetingStatusItems(String str, byte b, short s, short s2, short s3, String str2) {
        super(str, b, s, s2, s3, str2);
        Object[] objArr = {str, Byte.valueOf(b), Short.valueOf(s), Short.valueOf(s2), Short.valueOf(s3), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2841f9039393696ff74f365d9de9e28d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2841f9039393696ff74f365d9de9e28d");
        }
    }

    public void setStatus(byte b) {
        this.status = b;
    }

    public byte getStatus() {
        return this.status;
    }

    @Override // com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingItem
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "803769a6ab5721248effd87c687d3559", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "803769a6ab5721248effd87c687d3559");
        }
        return super.toString() + ", status " + ((int) this.status);
    }
}
