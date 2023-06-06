package com.meituan.android.common.aidata.lightblue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class FeatureRequestEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mFeatureName;
    public boolean mRealTime;

    public FeatureRequestEntity(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd50a3c18fc28ea38aa49903e552140", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd50a3c18fc28ea38aa49903e552140");
        } else {
            this.mFeatureName = str;
        }
    }

    public FeatureRequestEntity(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e11f6aa0f71fe8a25e9ed76a3e9eb643", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e11f6aa0f71fe8a25e9ed76a3e9eb643");
            return;
        }
        this.mFeatureName = str;
        this.mRealTime = z;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d54d42934125808a4b68c1923f670044", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d54d42934125808a4b68c1923f670044");
        }
        return "feature=" + this.mFeatureName + ", isRealTime=" + this.mRealTime;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6a3058996dac39a65542da583266bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6a3058996dac39a65542da583266bb6")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.mFeatureName, ((FeatureRequestEntity) obj).mFeatureName);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "704ddc5ca45103025158fe1753740d54", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "704ddc5ca45103025158fe1753740d54")).intValue() : Objects.hash(this.mFeatureName);
    }
}
