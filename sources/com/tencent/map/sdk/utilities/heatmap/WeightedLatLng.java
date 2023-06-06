package com.tencent.map.sdk.utilities.heatmap;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WeightedLatLng extends com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng {
    public static final Parcelable.Creator<WeightedLatLng> CREATOR = new Parcelable.Creator<WeightedLatLng>() { // from class: com.tencent.map.sdk.utilities.heatmap.WeightedLatLng.1
        private static WeightedLatLng a(@NonNull Parcel parcel) {
            return new WeightedLatLng(parcel);
        }

        private static WeightedLatLng[] a(int i) {
            return new WeightedLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WeightedLatLng[] newArray(int i) {
            return new WeightedLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WeightedLatLng createFromParcel(@NonNull Parcel parcel) {
            return new WeightedLatLng(parcel);
        }
    };

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected WeightedLatLng(Parcel parcel) {
        super(parcel);
    }

    public WeightedLatLng(LatLng latLng, double d) {
        super(latLng, d);
    }

    public WeightedLatLng(LatLng latLng) {
        super(latLng);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    @Override // com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WeightedLatLng) {
            if (obj == this) {
                return true;
            }
            LatLng point = getPoint();
            double intensity = getIntensity();
            if (point != null) {
                WeightedLatLng weightedLatLng = (WeightedLatLng) obj;
                return point.equals(weightedLatLng.getPoint()) && intensity == weightedLatLng.getIntensity();
            }
            WeightedLatLng weightedLatLng2 = (WeightedLatLng) obj;
            return weightedLatLng2.getPoint() == null && intensity == weightedLatLng2.getIntensity();
        }
        return false;
    }
}
