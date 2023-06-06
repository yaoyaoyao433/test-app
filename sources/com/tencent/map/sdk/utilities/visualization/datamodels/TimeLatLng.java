package com.tencent.map.sdk.utilities.visualization.datamodels;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TimeLatLng implements Parcelable {
    public static final Parcelable.Creator<TimeLatLng> CREATOR = new Parcelable.Creator<TimeLatLng>() { // from class: com.tencent.map.sdk.utilities.visualization.datamodels.TimeLatLng.1
        private static TimeLatLng a(@NonNull Parcel parcel) {
            return new TimeLatLng(parcel);
        }

        private static TimeLatLng[] a(int i) {
            return new TimeLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeLatLng[] newArray(int i) {
            return new TimeLatLng[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeLatLng createFromParcel(@NonNull Parcel parcel) {
            return new TimeLatLng(parcel);
        }
    };
    private static final int DEFAULT_TIME = 0;
    private LatLng mPoint;
    private int mTime;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mPoint, i);
        parcel.writeInt(this.mTime);
    }

    protected TimeLatLng(Parcel parcel) {
        this.mPoint = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.mTime = parcel.readInt();
    }

    public TimeLatLng(LatLng latLng, int i) {
        setPoint(latLng);
        setTime(i);
    }

    public TimeLatLng(LatLng latLng) {
        this(latLng, 0);
    }

    public void setPoint(LatLng latLng) {
        this.mPoint = latLng;
    }

    public LatLng getPoint() {
        return this.mPoint;
    }

    public void setTime(int i) {
        if (i >= 0) {
            this.mTime = i;
        } else {
            this.mTime = 0;
        }
    }

    public int getTime() {
        return this.mTime;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof TimeLatLng) {
            if (obj == this) {
                return true;
            }
            if (this.mPoint != null) {
                TimeLatLng timeLatLng = (TimeLatLng) obj;
                return this.mPoint.equals(timeLatLng.mPoint) && this.mTime == timeLatLng.mTime;
            }
            TimeLatLng timeLatLng2 = (TimeLatLng) obj;
            return timeLatLng2.mPoint == null && this.mTime == timeLatLng2.mTime;
        }
        return false;
    }

    public int hashCode() {
        if (this.mPoint != null) {
            return this.mPoint.hashCode() + ((int) (this.mTime * 1000000.0d));
        }
        return (int) (this.mTime * 1000000.0d);
    }
}
