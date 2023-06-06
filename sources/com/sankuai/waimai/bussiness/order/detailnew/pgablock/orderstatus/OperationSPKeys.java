package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum OperationSPKeys {
    NOTIFICATION_SWITCH;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static OperationSPKeys valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "671f43ee07f9842266f02e59bbdee191", RobustBitConfig.DEFAULT_VALUE) ? (OperationSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "671f43ee07f9842266f02e59bbdee191") : (OperationSPKeys) Enum.valueOf(OperationSPKeys.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static OperationSPKeys[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a46969b4a9602a5e745ceb01a6629192", RobustBitConfig.DEFAULT_VALUE) ? (OperationSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a46969b4a9602a5e745ceb01a6629192") : (OperationSPKeys[]) values().clone();
    }

    OperationSPKeys() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ea6f3a34b43ed88b5db838d1ed3fed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ea6f3a34b43ed88b5db838d1ed3fed");
        }
    }
}
