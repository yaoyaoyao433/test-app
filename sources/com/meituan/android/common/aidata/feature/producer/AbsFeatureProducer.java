package com.meituan.android.common.aidata.feature.producer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class AbsFeatureProducer implements IFeatureProducer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String identifier;

    public AbsFeatureProducer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b55dbf8b09a505488b7bee4404ed110", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b55dbf8b09a505488b7bee4404ed110");
        } else {
            this.identifier = str;
        }
    }

    @Override // com.meituan.android.common.aidata.feature.producer.IFeatureProducer
    public String getIdentifier() {
        return this.identifier;
    }
}
