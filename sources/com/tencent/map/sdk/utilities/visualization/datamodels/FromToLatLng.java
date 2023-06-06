package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class FromToLatLng implements Parcelable {
    public static final Parcelable.Creator<FromToLatLng> CREATOR = new Parcelable.Creator<FromToLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng.1
        private static FromToLatLng a(@NonNull Parcel parcel) {
            return new FromToLatLng(parcel);
        }

        private static FromToLatLng[] a(int i) {
            return new FromToLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FromToLatLng[] newArray(int i) {
            return new FromToLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FromToLatLng createFromParcel(@NonNull Parcel parcel) {
            return new FromToLatLng(parcel);
        }
    };
    private static final double DEFAULT_ARC = 45.0d;
    private double mArc;
    private LatLng mEndPoint;
    private LatLng mStartPoint;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mStartPoint, i);
        parcel.writeParcelable(this.mEndPoint, i);
        parcel.writeDouble(this.mArc);
    }

    protected FromToLatLng(Parcel parcel) {
        this.mStartPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mEndPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mArc = parcel.readDouble();
    }

    private FromToLatLng(LatLng latLng, LatLng latLng2, double d) {
        setPoint(latLng, latLng2);
        setArc(d);
    }

    public FromToLatLng(LatLng latLng, LatLng latLng2) {
        this(latLng, latLng2, DEFAULT_ARC);
    }

    public void setPoint(LatLng latLng, LatLng latLng2) {
        this.mStartPoint = latLng;
        this.mEndPoint = latLng2;
    }

    public LatLng getStartPoint() {
        return this.mStartPoint;
    }

    public LatLng getEndPoint() {
        return this.mEndPoint;
    }

    public void setArc(double d) {
        if (d > 0.0d && d <= 90.0d) {
            this.mArc = d;
        } else {
            this.mArc = DEFAULT_ARC;
        }
    }

    public double getArc() {
        return this.mArc;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof FromToLatLng) {
            if (obj == this) {
                return true;
            }
            if (this.mStartPoint == null || this.mEndPoint == null) {
                FromToLatLng fromToLatLng = (FromToLatLng) obj;
                return fromToLatLng.mStartPoint == null && this.mArc == fromToLatLng.mArc;
            }
            FromToLatLng fromToLatLng2 = (FromToLatLng) obj;
            return this.mStartPoint.equals(fromToLatLng2.mStartPoint) && this.mEndPoint.equals(fromToLatLng2.mEndPoint) && this.mArc == fromToLatLng2.mArc;
        }
        return false;
    }

    public int hashCode() {
        if (this.mStartPoint != null && this.mEndPoint != null) {
            return this.mStartPoint.hashCode() + this.mEndPoint.hashCode() + ((int) (this.mArc * 1000000.0d));
        }
        return (int) (this.mArc * 1000000.0d);
    }
}
