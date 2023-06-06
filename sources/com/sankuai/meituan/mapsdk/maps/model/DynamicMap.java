package com.sankuai.meituan.mapsdk.maps.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.interfaces.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class DynamicMap implements f {
    public static final String FEATURE_KEY_STATE = "state";
    public static final String FEATURE_STATE_NORMAL = "normal";
    public static final String FEATURE_STATE_SELECTED = "selecting";
    public static ChangeQuickRedirect changeQuickRedirect;
    public f dynamicMap;

    public DynamicMap(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a5742e5c0b65e6827e77080fe2f2144", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a5742e5c0b65e6827e77080fe2f2144");
        } else {
            this.dynamicMap = fVar;
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void initDynamicMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "886b5f35c75596768b09bbd362153992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "886b5f35c75596768b09bbd362153992");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.initDynamicMap();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void initDynamicMap(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "993da9ce6665c65554f529fe939abde1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "993da9ce6665c65554f529fe939abde1");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.initDynamicMap(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f059aef220521c24931655a3bed2baa7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f059aef220521c24931655a3bed2baa7");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.removeDynamicMap();
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94a85ee9fc03cb0485113d39535032b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94a85ee9fc03cb0485113d39535032b5");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.addDynamicMapImage(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapImage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d8535f051767b29cb11afad11522248", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d8535f051767b29cb11afad11522248");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.removeDynamicMapImage(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapImage(BitmapDescriptor bitmapDescriptor) {
        Object[] objArr = {bitmapDescriptor};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67f0e80930890ea953b02293e1180427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67f0e80930890ea953b02293e1180427");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.removeDynamicMapImage(bitmapDescriptor);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapGeoJSON(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "442a0426dedc53cac6fb48b36bacc513", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "442a0426dedc53cac6fb48b36bacc513");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.addDynamicMapGeoJSON(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void addDynamicMapGeoJSONWithSize(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62e949b0985f6a31b07352c48c5cff7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62e949b0985f6a31b07352c48c5cff7b");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.addDynamicMapGeoJSONWithSize(str, str2, i);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapGeoJSON(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "47e0950e030c8f2c3cb9ebc412638081", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "47e0950e030c8f2c3cb9ebc412638081");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.removeDynamicMapGeoJSON(str);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void setDynamicMapFeature(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e8b6e864613a20b80d32906a97fd844", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e8b6e864613a20b80d32906a97fd844");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.setDynamicMapFeature(str, str2, str3, str4);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void resetDynamicMapFeature(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b60c9be98212e51f78bc0b664e65c8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b60c9be98212e51f78bc0b664e65c8a");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.resetDynamicMapFeature(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void removeDynamicMapFeature(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b803734cadc40a4ba3e6dc4b9429992", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b803734cadc40a4ba3e6dc4b9429992");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.removeDynamicMapFeature(str, str2);
        }
    }

    @Override // com.sankuai.meituan.mapsdk.maps.interfaces.f
    public final void resetDynamicMapFeatures() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc8992e1e80c85fb45edb2856582e7f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc8992e1e80c85fb45edb2856582e7f4");
        } else if (this.dynamicMap != null) {
            this.dynamicMap.resetDynamicMapFeatures();
        }
    }
}
