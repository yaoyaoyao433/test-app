package com.meituan.android.customerservice.callbase.bean.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MeetingCodeItems extends MeetingItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte code;

    public void setCode(byte b) {
        this.code = b;
    }

    public byte getCode() {
        return this.code;
    }

    @Override // com.meituan.android.customerservice.callbase.bean.proto.inner.MeetingItem
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7936ca1cfc2bc982e123d7c6c545cee3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7936ca1cfc2bc982e123d7c6c545cee3");
        }
        return super.toString() + " code " + ((int) this.code);
    }
}
