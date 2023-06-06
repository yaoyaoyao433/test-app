package com.tencent.map.lib.models;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.common.CommonConstant;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes6.dex */
public class GeoPoint implements Parcelable {
    public static final Parcelable.Creator<GeoPoint> CREATOR = new Parcelable.Creator<GeoPoint>() { // from class: com.tencent.map.lib.models.GeoPoint.1
        private static GeoPoint a(Parcel parcel) {
            return new GeoPoint(parcel);
        }

        private static GeoPoint[] a(int i) {
            return new GeoPoint[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ GeoPoint[] newArray(int i) {
            return new GeoPoint[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeoPoint createFromParcel(Parcel parcel) {
            return new GeoPoint(parcel);
        }
    };
    private int mLatitudeE6;
    private int mLongitudeE6;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public GeoPoint() {
        this.mLatitudeE6 = -85000001;
        this.mLongitudeE6 = -180000001;
    }

    public GeoPoint(GeoPoint geoPoint) {
        this();
        this.mLatitudeE6 = geoPoint.mLatitudeE6;
        this.mLongitudeE6 = geoPoint.mLongitudeE6;
    }

    public GeoPoint(int i, int i2) {
        this.mLatitudeE6 = i;
        this.mLongitudeE6 = i2;
    }

    public GeoPoint(LatLng latLng) {
        this.mLatitudeE6 = (int) (latLng.latitude * 1000000.0d);
        this.mLongitudeE6 = (int) (latLng.longitude * 1000000.0d);
    }

    public static GeoPoint from(LatLng latLng) {
        if (latLng == null) {
            return null;
        }
        return new GeoPoint(latLng);
    }

    public static List<GeoPoint> from(List<LatLng> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList(0);
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            LatLng latLng = list.get(i);
            if (latLng != null) {
                arrayList.add(from(latLng));
            }
        }
        return arrayList;
    }

    public int getLatitudeE6() {
        return this.mLatitudeE6;
    }

    public int getLongitudeE6() {
        return this.mLongitudeE6;
    }

    public void setLatitudeE6(int i) {
        this.mLatitudeE6 = i;
    }

    public void setLongitudeE6(int i) {
        this.mLongitudeE6 = i;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.mLatitudeE6 = geoPoint.getLatitudeE6();
        this.mLongitudeE6 = geoPoint.getLongitudeE6();
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeoPoint) {
            GeoPoint geoPoint = (GeoPoint) obj;
            return this.mLatitudeE6 == geoPoint.mLatitudeE6 && this.mLongitudeE6 == geoPoint.mLongitudeE6;
        }
        return false;
    }

    public String toString() {
        return this.mLatitudeE6 + CommonConstant.Symbol.COMMA + this.mLongitudeE6;
    }

    public static GeoPoint formString(String str) {
        GeoPoint geoPoint = new GeoPoint();
        if (str != null) {
            try {
                String[] split = str.split(CommonConstant.Symbol.COMMA);
                if (split != null && split.length == 2) {
                    geoPoint.mLatitudeE6 = Integer.parseInt(split[0]);
                    geoPoint.mLongitudeE6 = Integer.parseInt(split[1]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return geoPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mLatitudeE6);
        parcel.writeInt(this.mLongitudeE6);
    }

    private GeoPoint(Parcel parcel) {
        this.mLatitudeE6 = parcel.readInt();
        this.mLongitudeE6 = parcel.readInt();
    }

    public LatLng toLatLng() {
        return new LatLng(this.mLatitudeE6 / 1000000.0d, this.mLongitudeE6 / 1000000.0d);
    }

    public Point toPoint() {
        return new Point(getLongitudeE6(), getLatitudeE6());
    }
}
