package com.meituan.android.common.aidata.feature.producer;

import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.resources.bean.FeatureBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProduceRequest {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FeatureBean mFeatureBean;
    public String mFeatureKey;
    public boolean mManual;
    public Object mParam;
    public String mProducerId;

    public ProduceRequest(String str, String str2, Object obj) {
        this(str, str2, obj, null);
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "506d169ad370b8a85798e2ee5ecdf2ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "506d169ad370b8a85798e2ee5ecdf2ab");
        }
    }

    public ProduceRequest(String str, String str2, Object obj, FeatureBean featureBean) {
        this(str, str2, obj, false, featureBean);
        Object[] objArr = {str, str2, obj, featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e584658c34c21fd1b4c6c53770457c04", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e584658c34c21fd1b4c6c53770457c04");
        }
    }

    public ProduceRequest(String str, String str2, Object obj, boolean z, FeatureBean featureBean) {
        Object[] objArr = {str, str2, obj, Byte.valueOf(z ? (byte) 1 : (byte) 0), featureBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e533f6eec3696f9847c7a0eb67af0efc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e533f6eec3696f9847c7a0eb67af0efc");
            return;
        }
        this.mManual = false;
        this.mFeatureKey = str;
        this.mProducerId = str2;
        this.mParam = obj;
        this.mManual = z;
        this.mFeatureBean = featureBean;
    }

    public String getFeatureKey() {
        return this.mFeatureKey;
    }

    public Object getParam() {
        return this.mParam;
    }

    @Nullable
    public FeatureBean getFeatureBean() {
        return this.mFeatureBean;
    }

    @Nullable
    public String getSubTableName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87687462a9ef4fb7b9723ece2f2b3d3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87687462a9ef4fb7b9723ece2f2b3d3e");
        }
        if (this.mFeatureBean == null || this.mFeatureBean.subTableConfigBean == null) {
            return null;
        }
        return this.mFeatureBean.subTableConfigBean.getSubTableName();
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c791b94a9b26ea0253e6e7fda876725", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c791b94a9b26ea0253e6e7fda876725")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ProduceRequest)) {
            ProduceRequest produceRequest = (ProduceRequest) obj;
            if (this.mFeatureKey != null && this.mFeatureKey.equals(produceRequest.getFeatureKey()) && this.mParam != null && this.mParam.equals(produceRequest.getParam())) {
                return true;
            }
        }
        return false;
    }
}
