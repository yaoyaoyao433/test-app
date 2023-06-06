package com.meituan.android.common.locate.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.common.locate.util.j;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
@Deprecated
/* loaded from: classes2.dex */
public class MtLocationManager extends MtBaseManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private u c;

    @Deprecated
    /* loaded from: classes2.dex */
    public interface a {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface b {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface c {
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public interface d {
    }

    public MtLocationManager(@NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bafaf353ebb5ca5fc0a8e0c3f4b74b6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bafaf353ebb5ca5fc0a8e0c3f4b74b6e");
        } else if (this.a == null) {
        } else {
            try {
                this.c = Privacy.createLocationManager(context, str);
            } catch (Exception unused) {
                LogUtils.a("location exception");
            }
        }
    }

    public MtLocationManager(@NonNull LocationManager locationManager, @NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {locationManager, context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ea8567d888a5e9e84e806d86ade2f15b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ea8567d888a5e9e84e806d86ade2f15b");
        } else if (this.a == null) {
        } else {
            this.c = Privacy.createLocationManager(context, str);
        }
    }

    @Deprecated
    public boolean addGpsStatusListener(GpsStatus.Listener listener) {
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b2fb601d105af7d70f9e80e31e1939d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b2fb601d105af7d70f9e80e31e1939d")).booleanValue();
        }
        a();
        return false;
    }

    @Deprecated
    public synchronized boolean addGpsStatusListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0bc1885caf329b357449c7a09b6808d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0bc1885caf329b357449c7a09b6808d")).booleanValue();
        }
        a();
        return false;
    }

    @Deprecated
    public synchronized void addNmeaListener(@NonNull d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a403652b3c0f95772d16ac249c4aaf2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a403652b3c0f95772d16ac249c4aaf2");
        } else {
            a();
        }
    }

    public List<String> getAllProviders() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99342be9df87dd31c05c65b3d9afa148", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99342be9df87dd31c05c65b3d9afa148");
        }
        if (this.c == null) {
            return null;
        }
        return this.c.a();
    }

    public String getBestProvider(@NonNull Criteria criteria, boolean z) {
        Object[] objArr = {criteria, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b8dcf6582e09479165434c040e0b57c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b8dcf6582e09479165434c040e0b57c") : this.c == null ? "" : this.c.a(criteria, z);
    }

    @SuppressLint({"MissingPermission"})
    public GpsStatus getGpsStatus(@Nullable GpsStatus gpsStatus) {
        Object[] objArr = {gpsStatus};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d06ff14ad0459c7a50191f0a53d60c2d", RobustBitConfig.DEFAULT_VALUE)) {
            return (GpsStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d06ff14ad0459c7a50191f0a53d60c2d");
        }
        if (this.c != null && j.b(this.a)) {
            return this.c.a(gpsStatus);
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    @Nullable
    public Location getLastKnownLocation(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb2c21ea50c4685ffbf801a1cc9c72bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb2c21ea50c4685ffbf801a1cc9c72bf");
        }
        if (this.c != null && j.c(this.a)) {
            return this.c.a(str);
        }
        return null;
    }

    public boolean isLocationEnabled() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4b35661dff44771db5c1cee442e4365", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4b35661dff44771db5c1cee442e4365")).booleanValue();
        }
        if (this.c != null && Build.VERSION.SDK_INT >= 28) {
            return this.c.b();
        }
        return false;
    }

    public boolean isProviderEnabled(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8653f19390b2c6813c4111e6f17edee6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8653f19390b2c6813c4111e6f17edee6")).booleanValue();
        }
        if (this.c != null) {
            return this.c.c(str);
        }
        return false;
    }

    @Deprecated
    public synchronized void registerGnssStatusCallback(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e5c420852b4818a92f1ddb3484063c97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e5c420852b4818a92f1ddb3484063c97");
        } else {
            a();
        }
    }

    @Deprecated
    public void removeGpsStatusListener(GpsStatus.Listener listener) {
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f497386df3f1d8a9e5f5b65333cef5e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f497386df3f1d8a9e5f5b65333cef5e4");
        } else {
            a();
        }
    }

    @Deprecated
    public synchronized void removeGpsStatusListener(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3776b9f53bbc0108196407138a51f65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3776b9f53bbc0108196407138a51f65");
        } else {
            a();
        }
    }

    @Deprecated
    public synchronized void removeNmeaListener(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cbdded8d6ec49d3edc807963b6235a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cbdded8d6ec49d3edc807963b6235a7");
        } else {
            a();
        }
    }

    public void removeTestProvider(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69c225ff8595e11c91a48233e7ef48d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69c225ff8595e11c91a48233e7ef48d2");
        } else if (this.c == null) {
        } else {
            this.c.b(str);
        }
    }

    @Deprecated
    public void removeUpdates(LocationListener locationListener) {
        Object[] objArr = {locationListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c794aa6fc725094bc1e1316d2cbe9ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c794aa6fc725094bc1e1316d2cbe9ba");
        } else {
            a();
        }
    }

    @Deprecated
    public synchronized void removeUpdates(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9172eec37ab574ac211cfab8340272b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9172eec37ab574ac211cfab8340272b4");
        } else {
            a();
        }
    }

    @Deprecated
    public void requestLocationUpdates(@NonNull String str, long j, float f, @NonNull LocationListener locationListener, Looper looper) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), locationListener, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9abf63f31ae675f0ccc02bdf2a59d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9abf63f31ae675f0ccc02bdf2a59d3e");
        } else {
            a();
        }
    }

    @Deprecated
    public void requestLocationUpdates(@NonNull String str, long j, float f, @NonNull c cVar) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d304bde7162d4242d0e575d9a414336f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d304bde7162d4242d0e575d9a414336f");
        } else {
            a();
        }
    }

    @Deprecated
    public synchronized void requestLocationUpdates(@NonNull String str, long j, float f, @NonNull c cVar, @Nullable Looper looper) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), cVar, looper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0158478f48d4e7c331790a332b3b3979", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0158478f48d4e7c331790a332b3b3979");
        } else {
            a();
        }
    }

    public boolean sendExtraCommand(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Object[] objArr = {str, str2, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f178d25d4f0c272fd0e93691fc8b4bb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f178d25d4f0c272fd0e93691fc8b4bb")).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        return this.c.a(str, str2, bundle);
    }

    @Deprecated
    public synchronized void unregisterGnssStatusCallback(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7915c1605226fdbea3057ae42b7cf806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7915c1605226fdbea3057ae42b7cf806");
        } else {
            a();
        }
    }
}
