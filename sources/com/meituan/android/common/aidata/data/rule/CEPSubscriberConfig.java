package com.meituan.android.common.aidata.data.rule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CEPSubscriberConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<String> mFeatureList;

    public CEPSubscriberConfig(List<String> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c11dde6feda94814caef46d78d27218", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c11dde6feda94814caef46d78d27218");
            return;
        }
        this.mFeatureList = null;
        this.mFeatureList = list;
    }

    public List<String> getFeatureList() {
        return this.mFeatureList;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<String> mFeatureList;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fe25887ed55d3f8c4157a8b27add065", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fe25887ed55d3f8c4157a8b27add065");
            } else {
                this.mFeatureList = null;
            }
        }

        public final Builder featureList(List<String> list) {
            this.mFeatureList = list;
            return this;
        }

        public final CEPSubscriberConfig build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "864c72fc6e4e3fe8d548d63a8ab0662c", RobustBitConfig.DEFAULT_VALUE) ? (CEPSubscriberConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "864c72fc6e4e3fe8d548d63a8ab0662c") : new CEPSubscriberConfig(this.mFeatureList);
        }
    }
}
