package com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public enum AbnormalSPKeys {
    second_delivery;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    public static AbnormalSPKeys valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cd1eee794fc18f3b347fed0187c10b9", RobustBitConfig.DEFAULT_VALUE) ? (AbnormalSPKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cd1eee794fc18f3b347fed0187c10b9") : (AbnormalSPKeys) Enum.valueOf(AbnormalSPKeys.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AbnormalSPKeys[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dea522742af0c6b329101531ee8ae503", RobustBitConfig.DEFAULT_VALUE) ? (AbnormalSPKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dea522742af0c6b329101531ee8ae503") : (AbnormalSPKeys[]) values().clone();
    }

    AbnormalSPKeys() {
        Object[] objArr = {r10, Integer.valueOf(r11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "71c598063a5c3d43d4de31898d97650a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "71c598063a5c3d43d4de31898d97650a");
        }
    }
}
