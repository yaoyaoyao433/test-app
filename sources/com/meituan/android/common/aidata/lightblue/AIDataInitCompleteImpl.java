package com.meituan.android.common.aidata.lightblue;

import com.meituan.android.common.aidata.AIData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AIDataInitCompleteImpl implements AIData.AIDataInitCompleteListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private IAIDataInitCompleteListener mInitCompleteListener;

    public void setInitCompleteListener(IAIDataInitCompleteListener iAIDataInitCompleteListener) {
        this.mInitCompleteListener = iAIDataInitCompleteListener;
    }

    @Override // com.meituan.android.common.aidata.AIData.AIDataInitCompleteListener
    public void onComplete() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cb3a03f24cb8fc88989496da5194c293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cb3a03f24cb8fc88989496da5194c293");
        } else if (this.mInitCompleteListener != null) {
            this.mInitCompleteListener.onComplete();
        }
    }
}
