package com.meituan.android.common.statistics.Interface;

import com.meituan.android.common.statistics.entity.BusinessEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface LXViewDotter {
    BusinessEntity getBusinessEntity(LXEventName lXEventName);

    String getPageInfoKey();

    void setBusinessEntity(LXEventName lXEventName, BusinessEntity businessEntity);

    void setPageInfoKey(String str);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum LXEventName {
        CLICK,
        VIEW,
        EDIT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        LXEventName() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cccc28ac96dfbc9f0f5c95d1b391d4c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cccc28ac96dfbc9f0f5c95d1b391d4c");
            }
        }

        public static LXEventName valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab94064f3d7cfdfc02c6f9b79f007f51", 6917529027641081856L) ? (LXEventName) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab94064f3d7cfdfc02c6f9b79f007f51") : (LXEventName) Enum.valueOf(LXEventName.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static LXEventName[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a04cf6d800973d65b23b472c4eab4fba", 6917529027641081856L) ? (LXEventName[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a04cf6d800973d65b23b472c4eab4fba") : (LXEventName[]) values().clone();
        }
    }
}
