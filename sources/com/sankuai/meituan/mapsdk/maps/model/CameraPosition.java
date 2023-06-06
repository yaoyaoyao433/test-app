package com.sankuai.meituan.mapsdk.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new Parcelable.Creator<CameraPosition>() { // from class: com.sankuai.meituan.mapsdk.maps.model.CameraPosition.1
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameraPosition createFromParcel(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0178ab20a0bcc7fca84ec0582fcbffdc", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0178ab20a0bcc7fca84ec0582fcbffdc") : new CameraPosition(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CameraPosition[] newArray(int i) {
            return new CameraPosition[i];
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CameraPosition(Parcel parcel) {
        Object[] objArr = {parcel};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dad8504f8893f742b430e01a09b340b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dad8504f8893f742b430e01a09b340b8");
            return;
        }
        this.bearing = parcel.readFloat();
        this.target = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.tilt = parcel.readFloat();
        this.zoom = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object[] objArr = {parcel, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4835afe911491e167697b1385cd3125f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4835afe911491e167697b1385cd3125f");
            return;
        }
        parcel.writeFloat(this.bearing);
        parcel.writeParcelable(this.target, i);
        parcel.writeFloat(this.tilt);
        parcel.writeFloat(this.zoom);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6180fe5edb8f062f90112f1b7ca83b91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6180fe5edb8f062f90112f1b7ca83b91")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (Math.abs(cameraPosition.bearing - this.bearing) <= 1.0E-7d && Math.abs(cameraPosition.tilt - this.tilt) <= 1.0E-7d && Math.abs(cameraPosition.zoom - this.zoom) <= 1.0E-7d) {
            return this.target.equals(cameraPosition.target);
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7448738497c7ff301347f32380e0f7de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7448738497c7ff301347f32380e0f7de")).intValue();
        }
        long floatToIntBits = Float.floatToIntBits(this.bearing);
        int hashCode = (((int) (floatToIntBits ^ (floatToIntBits >>> 32))) * 31) + this.target.hashCode();
        long floatToIntBits2 = Float.floatToIntBits(this.tilt);
        int i = (hashCode * 31) + ((int) (floatToIntBits2 ^ (floatToIntBits2 >>> 32)));
        long floatToIntBits3 = Float.floatToIntBits(this.zoom);
        return (i * 31) + ((int) ((floatToIntBits3 >>> 32) ^ floatToIntBits3));
    }

    public CameraPosition(@NonNull LatLng latLng, float f) {
        this(latLng, f, 0.0f, 0.0f);
        Object[] objArr = {latLng, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70e428b52e263e10a56b8f6286c3423", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70e428b52e263e10a56b8f6286c3423");
        }
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        Object[] objArr = {latLng, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2e96918957a48966aebdaf49aa0f08c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2e96918957a48966aebdaf49aa0f08c");
            return;
        }
        this.zoom = f;
        this.target = latLng;
        this.tilt = f2;
        this.bearing = f3;
    }

    public static Builder builder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74139b13e94fb371a4efbc2e25487c4d", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74139b13e94fb371a4efbc2e25487c4d") : new Builder();
    }

    public static Builder builder(@NonNull CameraPosition cameraPosition) {
        Object[] objArr = {cameraPosition};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6247868babfda76775beee266b80afa2", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6247868babfda76775beee266b80afa2") : new Builder(cameraPosition);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private float a;
        private LatLng b;
        private float c;
        private float d;

        public Builder() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2a05da8b453b86f4cd8f1a1751a9974a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2a05da8b453b86f4cd8f1a1751a9974a");
                return;
            }
            this.a = 0.0f;
            this.b = null;
            this.c = 0.0f;
            this.d = -1.0f;
        }

        public Builder(CameraPosition cameraPosition) {
            this.a = 0.0f;
            this.b = null;
            this.c = 0.0f;
            this.d = -1.0f;
            if (cameraPosition != null) {
                this.a = cameraPosition.bearing;
                this.b = cameraPosition.target;
                this.c = cameraPosition.tilt;
                this.d = cameraPosition.zoom;
            }
        }

        public final Builder target(LatLng latLng) {
            this.b = latLng;
            return this;
        }

        public final Builder zoom(float f) {
            this.d = f;
            return this;
        }

        public final Builder tilt(float f) {
            this.c = f;
            return this;
        }

        public final Builder bearing(float f) {
            Object[] objArr = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "332cf30d3ad958693d117f76e4a222f7", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "332cf30d3ad958693d117f76e4a222f7");
            }
            while (f >= 360.0f) {
                f -= 360.0f;
            }
            while (f < 0.0f) {
                f += 360.0f;
            }
            this.a = f;
            return this;
        }

        public final CameraPosition build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41e40ba522d90ac5bd519c64d53b1cec", RobustBitConfig.DEFAULT_VALUE)) {
                return (CameraPosition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41e40ba522d90ac5bd519c64d53b1cec");
            }
            try {
                return new CameraPosition(this.b, this.d, this.c, this.a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static CameraPosition fromLatLngZoom(LatLng latLng, float f) {
        Object[] objArr = {latLng, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9774b05bbf81aba68a6e1382950c160c", RobustBitConfig.DEFAULT_VALUE) ? (CameraPosition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9774b05bbf81aba68a6e1382950c160c") : new CameraPosition(latLng, f);
    }

    public static CameraPosition changeTilt(CameraPosition cameraPosition, float f) {
        Object[] objArr = {cameraPosition, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5be0182a831f41ee75d8bf29a9d0f76f", RobustBitConfig.DEFAULT_VALUE)) {
            return (CameraPosition) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5be0182a831f41ee75d8bf29a9d0f76f");
        }
        if (cameraPosition == null) {
            return null;
        }
        return new CameraPosition(cameraPosition.target, cameraPosition.zoom, f, cameraPosition.bearing);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccf7079eb8634c13e2f6eb80e73a8447", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccf7079eb8634c13e2f6eb80e73a8447");
        }
        StringBuilder sb = new StringBuilder("latlng:");
        sb.append(this.target == null ? StringUtil.NULL : Double.valueOf(this.target.latitude));
        sb.append(CommonConstant.Symbol.COMMA);
        sb.append(this.target == null ? StringUtil.NULL : Double.valueOf(this.target.longitude));
        sb.append(",zoom:");
        sb.append(this.zoom);
        sb.append(",tilt:");
        sb.append(this.tilt);
        sb.append(",bearing:");
        sb.append(this.bearing);
        return sb.toString();
    }

    public final boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea362e7ca0e032b4654556d3a208c68a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea362e7ca0e032b4654556d3a208c68a")).booleanValue() : (this.target == null || !this.target.isValid() || Float.isNaN(this.zoom) || Float.isInfinite(this.zoom) || Float.isNaN(this.tilt) || Float.isInfinite(this.tilt) || Float.isNaN(this.bearing) || Float.isInfinite(this.bearing)) ? false : true;
    }
}
