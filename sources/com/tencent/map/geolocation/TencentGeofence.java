package com.tencent.map.geolocation;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class TencentGeofence {
    private final int a;
    private final double b;
    private final double c;
    private final float d;
    private final long e;
    private final String f;
    private final long g;

    /* synthetic */ TencentGeofence(double d, double d2, float f, long j, String str, byte b) {
        this(d, d2, f, j, str);
    }

    private TencentGeofence(double d, double d2, float f, long j, String str) {
        this.a = 0;
        this.b = d;
        this.c = d2;
        this.d = f;
        this.g = j;
        this.e = SystemClock.elapsedRealtime() + j;
        this.f = str;
    }

    public final double getLatitude() {
        return this.b;
    }

    public final double getLongitude() {
        return this.c;
    }

    public final float getRadius() {
        return this.d;
    }

    public final long getExpireAt() {
        return this.e;
    }

    public final long getDuration() {
        return this.g;
    }

    public final String getTag() {
        return this.f;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.c);
        return ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + (this.f == null ? 0 : this.f.hashCode());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TencentGeofence tencentGeofence = (TencentGeofence) obj;
            if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(tencentGeofence.b) && Double.doubleToLongBits(this.c) == Double.doubleToLongBits(tencentGeofence.c)) {
                if (this.f == null) {
                    if (tencentGeofence.f != null) {
                        return false;
                    }
                } else if (!this.f.equals(tencentGeofence.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = this.f;
        int i = this.a;
        if (i == 0) {
            str = "CIRCLE";
        } else if (i != 0) {
            throw new IllegalArgumentException("invalid type: ".concat(String.valueOf(i)));
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = Double.valueOf(this.b);
        objArr[3] = Double.valueOf(this.c);
        objArr[4] = Float.valueOf(this.d);
        objArr[5] = Double.valueOf((this.e - SystemClock.elapsedRealtime()) / 1000.0d);
        return String.format(locale, "TencentGeofence[tag=%s, type=%s, loc=(%.6f, %.6f), radius=%.2fm life=%.2fs]", objArr);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class Builder {
        private double a;
        private double b;
        private float c;
        private long d;
        private String e;

        public Builder setCircularRegion(double d, double d2, float f) {
            if (f > 0.0f) {
                if (d > 90.0d || d < -90.0d) {
                    throw new IllegalArgumentException("invalid latitude: ".concat(String.valueOf(d)));
                }
                if (d2 <= 180.0d && d2 >= -180.0d) {
                    this.a = d;
                    this.b = d2;
                    this.c = f;
                    return this;
                }
                throw new IllegalArgumentException("invalid longitude: ".concat(String.valueOf(d2)));
            }
            throw new IllegalArgumentException("invalid radius: ".concat(String.valueOf(f)));
        }

        public Builder setExpirationDuration(long j) {
            if (j >= 0) {
                this.d = j;
                return this;
            }
            throw new IllegalArgumentException("invalid duration: ".concat(String.valueOf(j)));
        }

        public Builder setTag(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new NullPointerException();
            }
            this.e = str;
            return this;
        }

        public TencentGeofence build() {
            return new TencentGeofence(this.a, this.b, this.c, this.d, this.e, (byte) 0);
        }
    }
}
