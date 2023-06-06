package com.tencent.tencentmap.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tencent.tencentmap.mapsdk.maps.exception.InvalidLatLngBoundsException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator<LatLngBounds>() { // from class: com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.1
        private static LatLngBounds a(@NonNull Parcel parcel) {
            return LatLngBounds.readFromParcel(parcel);
        }

        private static LatLngBounds[] a(int i) {
            return new LatLngBounds[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LatLngBounds createFromParcel(@NonNull Parcel parcel) {
            return LatLngBounds.readFromParcel(parcel);
        }
    };
    private final double latitudeNorth;
    private final double latitudeSouth;
    private final double longitudeEast;
    private final double longitudeWest;
    public final LatLng northeast;
    public final LatLng southwest;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
        this.northeast = new LatLng(d, d2);
        this.southwest = new LatLng(d3, d4);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        this.northeast = latLng;
        this.southwest = latLng2;
        this.latitudeNorth = latLng.latitude;
        this.longitudeEast = latLng.longitude;
        this.latitudeSouth = latLng2.latitude;
        this.longitudeWest = latLng2.longitude;
    }

    public static LatLngBounds world() {
        return from(90.0d, 180.0d, -90.0d, -180.0d);
    }

    public static Builder builder() {
        return new Builder();
    }

    public LatLngBounds including(LatLng latLng) {
        return include(latLng);
    }

    @NonNull
    public LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public double getLatNorth() {
        return this.latitudeNorth;
    }

    public double getLatSouth() {
        return this.latitudeSouth;
    }

    public double getLonEast() {
        return this.longitudeEast;
    }

    public double getLonWest() {
        return this.longitudeWest;
    }

    @NonNull
    public LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    @NonNull
    public LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    @NonNull
    public LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    @NonNull
    public LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    @NonNull
    public LatLngSpan getSpan() {
        return new LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    @NonNull
    public String toString() {
        return "N:" + this.latitudeNorth + "; E:" + this.longitudeEast + "; S:" + this.latitudeSouth + "; W:" + this.longitudeWest;
    }

    static LatLngBounds fromLatLngs(List<? extends LatLng> list) {
        double d = Double.MAX_VALUE;
        double d2 = 90.0d;
        double d3 = -90.0d;
        double d4 = -1.7976931348623157E308d;
        for (LatLng latLng : list) {
            if (latLng != null) {
                double latitude = latLng.getLatitude();
                double longitude = latLng.getLongitude();
                d2 = Math.min(d2, latitude);
                d = Math.min(d, longitude);
                d3 = Math.max(d3, latitude);
                d4 = Math.max(d4, longitude);
            }
        }
        return new LatLngBounds(d3, d4, d2, d);
    }

    @NonNull
    public LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public static LatLngBounds from(@FloatRange(from = -90.0d, to = 90.0d) double d, double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return new LatLngBounds(d, d2, d3, d4);
    }

    private static void checkParams(@FloatRange(from = -90.0d, to = 90.0d) double d, double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, double d4) {
        if (Double.isNaN(d) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        }
        if (Double.isNaN(d2) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        }
        if (Double.isInfinite(d2) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
        if (d > 90.0d || d < -90.0d || d3 > 90.0d || d3 < -90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        if (d < d3) {
            throw new IllegalArgumentException("latNorth cannot be less than latSouth");
        }
        if (d2 < d4) {
            throw new IllegalArgumentException("lonEast cannot be less than lonWest");
        }
    }

    private static double lat_(int i, int i2) {
        double pow = 3.141592653589793d - ((i2 * 6.283185307179586d) / Math.pow(2.0d, i));
        return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
    }

    private static double lon_(int i, int i2) {
        return ((i2 / Math.pow(2.0d, i)) * 360.0d) - 180.0d;
    }

    public static LatLngBounds from(int i, int i2, int i3) {
        return new LatLngBounds(lat_(i, i3), lon_(i, i2 + 1), lat_(i, i3 + 1), lon_(i, i2));
    }

    @NonNull
    public LatLngBounds include(@NonNull LatLng latLng) {
        return new Builder().include(getNorthEast()).include(getSouthWest()).include(latLng).build();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.latitudeNorth == latLngBounds.getLatNorth() && this.latitudeSouth == latLngBounds.getLatSouth() && this.longitudeEast == latLngBounds.getLonEast() && this.longitudeWest == latLngBounds.getLonWest();
        }
        return false;
    }

    private boolean containsLatitude(double d) {
        return d <= this.latitudeNorth && d >= this.latitudeSouth;
    }

    private boolean containsLongitude(double d) {
        return d <= this.longitudeEast && d >= this.longitudeWest;
    }

    public boolean contains(@NonNull LatLng latLng) {
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    public boolean contains(@NonNull LatLngBounds latLngBounds) {
        return contains(latLngBounds.getNorthEast()) && contains(latLngBounds.getSouthWest());
    }

    @NonNull
    public LatLngBounds union(@NonNull LatLngBounds latLngBounds) {
        return unionNoParamCheck(latLngBounds.getLatNorth(), latLngBounds.getLonEast(), latLngBounds.getLatSouth(), latLngBounds.getLonWest());
    }

    @NonNull
    public LatLngBounds union(double d, double d2, double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return unionNoParamCheck(d, d2, d3, d4);
    }

    private LatLngBounds unionNoParamCheck(double d, double d2, double d3, double d4) {
        return new LatLngBounds(this.latitudeNorth < d ? d : this.latitudeNorth, this.longitudeEast < d2 ? d2 : this.longitudeEast, this.latitudeSouth > d3 ? d3 : this.latitudeSouth, this.longitudeWest > d4 ? d4 : this.longitudeWest);
    }

    @Nullable
    public LatLngBounds intersect(@NonNull LatLngBounds latLngBounds) {
        return intersectNoParamCheck(latLngBounds.getLatNorth(), latLngBounds.getLonEast(), latLngBounds.getLatSouth(), latLngBounds.getLonWest());
    }

    @NonNull
    public LatLngBounds intersect(double d, double d2, double d3, double d4) {
        checkParams(d, d2, d3, d4);
        return intersectNoParamCheck(d, d2, d3, d4);
    }

    private LatLngBounds intersectNoParamCheck(double d, double d2, double d3, double d4) {
        double max = Math.max(this.longitudeWest, d4);
        double min = Math.min(this.longitudeEast, d2);
        if (min >= max) {
            double max2 = Math.max(this.latitudeSouth, d3);
            double min2 = Math.min(this.latitudeNorth, d);
            if (min2 >= max2) {
                return new LatLngBounds(min2, min, max2, max);
            }
            return null;
        }
        return null;
    }

    public int hashCode() {
        return (int) (this.latitudeNorth + 90.0d + ((this.latitudeSouth + 90.0d) * 1000.0d) + ((this.longitudeEast + 180.0d) * 1000000.0d) + ((this.longitudeWest + 180.0d) * 1.0E9d));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    protected static LatLngBounds readFromParcel(Parcel parcel) {
        return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class Builder {
        private final List<LatLng> latLngList = new ArrayList();

        public final LatLngBounds build() {
            if (this.latLngList.size() < 2) {
                throw new InvalidLatLngBoundsException(this.latLngList.size());
            }
            return LatLngBounds.fromLatLngs(this.latLngList);
        }

        @NonNull
        public final Builder include(@NonNull List<LatLng> list) {
            this.latLngList.addAll(list);
            return this;
        }

        @NonNull
        public final Builder include(@NonNull LatLng latLng) {
            this.latLngList.add(latLng);
            return this;
        }
    }
}
