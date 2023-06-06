package com.tencent.tencentmap.mapsdk.maps.model;

import com.meituan.robust.common.CommonConstant;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class IndoorBuilding implements Cloneable {
    private int mActiveLevelIndex;
    private String mBuidlingId;
    private String mBuildingName;
    private LatLng mLatLng;
    private List<IndoorLevel> mLevels;

    public IndoorBuilding(String str, String str2, LatLng latLng, List<IndoorLevel> list, int i) {
        this.mBuidlingId = str;
        this.mBuildingName = str2;
        this.mLatLng = latLng;
        this.mLevels = list;
        this.mActiveLevelIndex = i;
    }

    public final String getBuidlingId() {
        return this.mBuidlingId;
    }

    public final String getBuildingName() {
        return this.mBuildingName;
    }

    public final List<IndoorLevel> getLevels() {
        return this.mLevels;
    }

    public final int getActiveLevelIndex() {
        return this.mActiveLevelIndex;
    }

    public final LatLng getBuildingLatLng() {
        return this.mLatLng;
    }

    public final String toString() {
        if (this.mBuidlingId == null || this.mLevels == null || this.mLevels.size() <= this.mActiveLevelIndex) {
            return "";
        }
        return this.mBuidlingId + CommonConstant.Symbol.UNDERLINE + this.mLevels.get(this.mActiveLevelIndex).getName();
    }

    protected final Object clone() throws CloneNotSupportedException {
        IndoorBuilding indoorBuilding = (IndoorBuilding) super.clone();
        if (this.mLevels != null) {
            indoorBuilding.mLevels = new ArrayList(this.mLevels.size());
            for (int i = 0; i < this.mLevels.size(); i++) {
                indoorBuilding.mLevels.add(new IndoorLevel(this.mLevels.get(i).getName()));
            }
        }
        if (this.mLatLng != null) {
            indoorBuilding.mLatLng = new LatLng(this.mLatLng.latitude, this.mLatLng.longitude);
        }
        return indoorBuilding;
    }
}
