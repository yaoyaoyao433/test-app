package com.meituan.android.common.statistics;

import com.meituan.android.common.statistics.Interface.LXViewDotter;
import com.meituan.android.common.statistics.entity.BusinessEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class LXViewDotterProxy implements LXViewDotter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<LXViewDotter.LXEventName, BusinessEntity> mBusinessEntities;
    private String mPageInfoKey;

    public LXViewDotterProxy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7de2ece579be17436c5323818353b3fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7de2ece579be17436c5323818353b3fb");
            return;
        }
        this.mPageInfoKey = null;
        this.mBusinessEntities = new HashMap(4);
    }

    @Override // com.meituan.android.common.statistics.Interface.LXViewDotter
    public final void setPageInfoKey(String str) {
        this.mPageInfoKey = str;
    }

    @Override // com.meituan.android.common.statistics.Interface.LXViewDotter
    public final String getPageInfoKey() {
        return this.mPageInfoKey;
    }

    @Override // com.meituan.android.common.statistics.Interface.LXViewDotter
    public final void setBusinessEntity(LXViewDotter.LXEventName lXEventName, BusinessEntity businessEntity) {
        Object[] objArr = {lXEventName, businessEntity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d9c24635751919544794cdf889bea729", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d9c24635751919544794cdf889bea729");
        } else {
            this.mBusinessEntities.put(lXEventName, businessEntity);
        }
    }

    @Override // com.meituan.android.common.statistics.Interface.LXViewDotter
    public final BusinessEntity getBusinessEntity(LXViewDotter.LXEventName lXEventName) {
        Object[] objArr = {lXEventName};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3713701e4feaf4b5501800cfe2ff8c11", 6917529027641081856L) ? (BusinessEntity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3713701e4feaf4b5501800cfe2ff8c11") : this.mBusinessEntities.get(lXEventName);
    }
}
