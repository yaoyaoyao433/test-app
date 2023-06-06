package com.meituan.android.common.aidata.feature;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.aidata.feature.bean.JSFeatureConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GetFeatureRequest extends AbsFeatureRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("features")
    public String feature;
    @SerializedName(JSFeatureConfig.KEY_BUNDLE_FEATURE_REALTIME)
    public boolean isRealTime;

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce428e8567749f2cf17bce53ff6a2eb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce428e8567749f2cf17bce53ff6a2eb");
        }
        return "feature=" + this.feature + ", isRealTime=" + this.isRealTime;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04af7eb4acde7304d249df27b68c71d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04af7eb4acde7304d249df27b68c71d0")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.feature, ((GetFeatureRequest) obj).feature);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "be4c7fb2094c24571b9023f8f03e0f7f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "be4c7fb2094c24571b9023f8f03e0f7f")).intValue() : Objects.hash(this.feature);
    }
}
