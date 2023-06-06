package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class sl implements TencentMap.OnIndoorStateChangeListener {
    private so a;

    public sl(so soVar) {
        this.a = soVar;
    }

    private boolean a() {
        return this.a == null;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorBuildingFocused() {
        if (this.a == null) {
            return false;
        }
        this.a.onIndoorBuildingFocused();
        if (this.a.x != null) {
            this.a.x.onIndoorBuildingFocused();
            return true;
        }
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
        if (this.a == null) {
            return false;
        }
        this.a.onIndoorLevelActivated(indoorBuilding);
        if (this.a.x != null) {
            this.a.x.onIndoorLevelActivated(indoorBuilding);
            return true;
        }
        return true;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.TencentMap.OnIndoorStateChangeListener
    public final boolean onIndoorBuildingDeactivated() {
        if (this.a == null) {
            return false;
        }
        this.a.onIndoorBuildingDeactivated();
        if (this.a.x != null) {
            this.a.x.onIndoorBuildingDeactivated();
            return true;
        }
        return true;
    }
}
