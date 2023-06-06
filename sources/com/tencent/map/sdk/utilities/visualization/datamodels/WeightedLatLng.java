package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class WeightedLatLng implements Parcelable {
    public static final Parcelable.Creator<WeightedLatLng> CREATOR = new Parcelable.Creator<WeightedLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng.1
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
    private static final double DEFAULT_INTENSITY = 1.0d;
    private double mIntensity;
    private LatLng mPoint;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeDouble(this.mIntensity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public WeightedLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mIntensity = parcel.readDouble();
    }

    public WeightedLatLng(LatLng latLng, double d) {
        setPoint(latLng);
        setIntensity(d);
    }

    public WeightedLatLng(LatLng latLng) {
        this(latLng, 1.0d);
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public void setIntensity(double d) {
        if (d >= 0.0d) {
            this.mIntensity = d;
        } else {
            this.mIntensity = 1.0d;
        }
    }

    public double getIntensity() {
        return this.mIntensity;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof WeightedLatLng) {
            if (obj == this) {
                return true;
            }
            if (this.mPoint != null) {
                WeightedLatLng weightedLatLng = (WeightedLatLng) obj;
                return this.mPoint.equals(weightedLatLng.mPoint) && this.mIntensity == weightedLatLng.mIntensity;
            }
            WeightedLatLng weightedLatLng2 = (WeightedLatLng) obj;
            return weightedLatLng2.mPoint == null && this.mIntensity == weightedLatLng2.mIntensity;
        }
        return false;
    }

    public int hashCode() {
        if (this.mPoint != null) {
            return this.mPoint.hashCode() + ((int) (this.mIntensity * 1000000.0d));
        }
        return (int) (this.mIntensity * 1000000.0d);
    }
}
