package com.meituan.android.common.locate.posquality;

import android.location.GnssStatus;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import com.dianping.shield.entity.ExposeAction;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static double d = 10.0d;
    private boolean a;
    private long b;
    private long c;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9b08ee03b8d8e46f46aa21e6f176eb3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9b08ee03b8d8e46f46aa21e6f176eb3c");
            return;
        }
        this.a = true;
        this.b = 0L;
        this.c = 0L;
        this.e = 1.0d;
        this.f = 10.0d;
        this.g = 1000.0d;
        this.h = 10000.0d;
        this.i = 0.0d;
    }

    private static double a(double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5), Double.valueOf(d6), Double.valueOf(d7), Double.valueOf(d8)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19668966fc29e704da9f5b8086ade8b2", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19668966fc29e704da9f5b8086ade8b2")).doubleValue() : d3 + ((d4 - d3) / Math.pow((Math.exp(((-d6) * d2) + (d6 * d7)) * d5) + 1.0d, 1.0d / d8));
    }

    private static double a(int i, int i2, double d2, double d3, double d4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "954d2bada27e0c0d85d23018932cc834", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "954d2bada27e0c0d85d23018932cc834")).doubleValue() : d * Math.exp((-(((1.0d - a(Math.sqrt((d4 * d4) + (d3 * d3)), 0.0d, 1.0d, 1.0d, 5.0d, 0.5d, 0.5d)) * (a(i, 1.0d, 2.0d, 2.0d, 0.25d, 5.0d, 1.0d) - 1.0d)) * (a(d2, 1.0d, 2.0d, 2.0d, 0.25d, 15.0d, 2.5d) - 1.0d))) / 0.43d);
    }

    public static double a(GnssStatus gnssStatus) {
        int i;
        GnssStatus gnssStatus2 = gnssStatus;
        int i2 = 0;
        Object[] objArr = {gnssStatus2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8bf673e9c82fb1abacfe10315e99ec2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8bf673e9c82fb1abacfe10315e99ec2a")).doubleValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            int satelliteCount = gnssStatus.getSatelliteCount();
            double d2 = 0.0d;
            double d3 = 0.0d;
            double d4 = 0.0d;
            int i3 = 0;
            while (i2 < satelliteCount) {
                gnssStatus2.getElevationDegrees(i2);
                gnssStatus2.getCn0DbHz(i2);
                if (gnssStatus2.usedInFix(i2)) {
                    i3++;
                    double azimuthDegrees = gnssStatus2.getAzimuthDegrees(i2);
                    double elevationDegrees = gnssStatus2.getElevationDegrees(i2);
                    i = satelliteCount;
                    double cn0DbHz = gnssStatus2.getCn0DbHz(i2);
                    double d5 = (azimuthDegrees * 3.141592653589793d) / 180.0d;
                    d2 += cn0DbHz;
                    double cos = cn0DbHz * Math.cos((elevationDegrees * 3.141592653589793d) / 180.0d);
                    d3 += Math.cos(d5) * cos;
                    d4 += cos * Math.sin(d5);
                } else {
                    i = satelliteCount;
                }
                i2++;
                satelliteCount = i;
                gnssStatus2 = gnssStatus;
            }
            int i4 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
            return a(i3, i3, i3 == 0 ? 0.0d : d2 / i3, i4 == 0 ? 0.0d : d4 / d2, i4 == 0 ? 0.0d : d3 / d2);
        }
        return 10.0d;
    }

    public static double a(GpsStatus gpsStatus) {
        Object[] objArr = {gpsStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ac7cd03afe8f60e228eafc445ff6a39", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ac7cd03afe8f60e228eafc445ff6a39")).doubleValue();
        }
        gpsStatus.getMaxSatellites();
        double d2 = 0.0d;
        int i = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (GpsSatellite gpsSatellite : gpsStatus.getSatellites()) {
            gpsSatellite.getElevation();
            gpsSatellite.getSnr();
            if (gpsSatellite.usedInFix()) {
                i++;
                double snr = gpsSatellite.getSnr();
                double azimuth = (gpsSatellite.getAzimuth() * 3.141592653589793d) / 180.0d;
                d2 += snr;
                double cos = snr * Math.cos((gpsSatellite.getElevation() * 3.141592653589793d) / 180.0d);
                d3 += Math.cos(azimuth) * cos;
                d4 += cos * Math.sin(azimuth);
            }
        }
        int i2 = (d2 > 0.0d ? 1 : (d2 == 0.0d ? 0 : -1));
        return a(i, i, i != 0 ? d2 / i : 0.0d, i2 == 0 ? 0.0d : d4 / d2, i2 == 0 ? 0.0d : d3 / d2);
    }

    private double c(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c410794e1c918aa0331feda329e2ecaf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c410794e1c918aa0331feda329e2ecaf")).doubleValue();
        }
        this.a = true;
        double d2 = 0.0d;
        if (mtLocation.getTime() <= 0 || mtLocation.getTime() < this.c || mtLocation.getTime() < this.c) {
            d2 = -1.0d;
            this.a = false;
        }
        if (Math.abs(mtLocation.getLatitude()) < 1.0E-7d && Math.abs(mtLocation.getLongitude()) < 1.0E-7d) {
            d2 -= 1.0d;
            this.a = false;
        }
        if (Math.abs(mtLocation.getLatitude()) < 1.0E-7d && Math.abs(mtLocation.getSpeed()) < 1.0E-7d && Math.abs(mtLocation.getLongitude()) < 1.0E-7d) {
            d2 -= 0.5d;
        }
        return mtLocation.getAccuracy() <= 0.0f ? d2 - 0.5d : d2;
    }

    public double a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bf5bad2e763494bb9180ca91f4b5300", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bf5bad2e763494bb9180ca91f4b5300")).doubleValue();
        }
        this.i = c(mtLocation);
        double b = b(mtLocation);
        this.e = Math.exp(Math.abs(this.i));
        this.g = b < 1000.0d ? (this.g + b) / 2.0d : 1000.0d;
        this.c = mtLocation.getTime();
        this.h = this.e * ((mtLocation.getTime() < this.b || mtLocation.getTime() - this.b < ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE) ? this.f : 10.0d) * this.g;
        if (this.h > 10000.0d || !this.a) {
            return 10000.0d;
        }
        return this.h;
    }

    public void a(GnssStatus gnssStatus, long j) {
        Object[] objArr = {gnssStatus, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "84dd54bdb9f5c4d324fb3ab9f49702a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "84dd54bdb9f5c4d324fb3ab9f49702a0");
            return;
        }
        this.f = a(gnssStatus);
        this.b = j;
    }

    public void a(GpsStatus gpsStatus, long j) {
        Object[] objArr = {gpsStatus, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "31d5c6d9b8b1e45f38bad50bc553ff86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "31d5c6d9b8b1e45f38bad50bc553ff86");
            return;
        }
        this.f = a(gpsStatus);
        this.b = j;
    }

    public double b(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e3d52cd4284faa43ede1e92aee153dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e3d52cd4284faa43ede1e92aee153dc")).doubleValue();
        }
        if (mtLocation.getTime() - this.c > MetricsAnrManager.ANR_THRESHOLD) {
            return 1000.0d;
        }
        return mtLocation.getTime() == this.c ? this.g : (mtLocation.getTime() - this.c) / 1000.0d;
    }
}
