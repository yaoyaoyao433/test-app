package com.meituan.android.privacy.proxy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Criteria;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.Log;
import com.meituan.android.privacy.proxy.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"MissingPermission"})
/* loaded from: classes3.dex */
public final class o implements com.meituan.android.privacy.interfaces.u {
    public static ChangeQuickRedirect a;
    LocationManager b;
    private Context c;
    private u d;
    private String e;

    public o(@NonNull Context context, @NonNull String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1828ebdfd3c409259a319b86011a9a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1828ebdfd3c409259a319b86011a9a2");
            return;
        }
        this.e = str;
        this.c = context;
        this.d = new u();
        if (context != null) {
            try {
                this.b = (LocationManager) context.getApplicationContext().getSystemService("location");
            } catch (Exception e) {
                Log.e("MtLocationManagerImpl", e.toString());
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @Nullable
    public final Location a(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f79349674fdf2fff1548a983028d03a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f79349674fdf2fff1548a983028d03a");
        }
        if (this.b == null) {
            return null;
        }
        return (Location) this.d.a("loc.gLKLocation", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Location>() { // from class: com.meituan.android.privacy.proxy.o.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Location a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c4c6cf0b75b675aae341e5ec0cc08ac", RobustBitConfig.DEFAULT_VALUE) ? (Location) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c4c6cf0b75b675aae341e5ec0cc08ac") : o.this.b.getLastKnownLocation(str);
            }
        });
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8519ebda88ac60cdfa9436fe7e1d44c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8519ebda88ac60cdfa9436fe7e1d44c");
        } else if (this.b == null) {
        } else {
            this.b.removeTestProvider(str);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac40b4d2c7c7f12c10deee42a841f753", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac40b4d2c7c7f12c10deee42a841f753");
        }
        if (this.b == null) {
            return new ArrayList();
        }
        return this.b.getAllProviders();
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 28)
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c32a5f68ddaab6cc8a810a6dc29888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c32a5f68ddaab6cc8a810a6dc29888")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.isLocationEnabled();
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final String a(@NonNull Criteria criteria, boolean z) {
        Object[] objArr = {criteria, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c63fdef6db2979e71b6dd4933dcee5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c63fdef6db2979e71b6dd4933dcee5f");
        }
        if (this.b == null) {
            return null;
        }
        return this.b.getBestProvider(criteria, z);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final boolean a(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Object[] objArr = {str, str2, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d107204e7e4f305692e3a93489cded62", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d107204e7e4f305692e3a93489cded62")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.sendExtraCommand(str, str2, bundle);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void a(@NonNull final String str, final long j, final float f, @NonNull final LocationListener locationListener) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), locationListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553b0da95f03f3be1d3bb236fa7615cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553b0da95f03f3be1d3bb236fa7615cc");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rLUpdates_SlfL", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f17b985d60fc29f3f2180dca65379f3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f17b985d60fc29f3f2180dca65379f3");
                    }
                    o.this.b.requestLocationUpdates(str, j, f, locationListener);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void a(@NonNull final String str, final long j, final float f, @NonNull final LocationListener locationListener, final Looper looper) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), locationListener, looper};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32ad5eef2d24114903e0286d529a7649", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32ad5eef2d24114903e0286d529a7649");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rLUpdates_SlfLL", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1fb5f90d4a8a9a0451200bbad7d927dd", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1fb5f90d4a8a9a0451200bbad7d927dd");
                    }
                    o.this.b.requestLocationUpdates(str, j, f, locationListener, looper);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void a(final LocationListener locationListener) {
        Object[] objArr = {locationListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9f53a1b5a4e29d2b9ebe63e205e09b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9f53a1b5a4e29d2b9ebe63e205e09b");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rUpdates", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.8
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4040abe05e68e6833c67df32e3f6e451", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4040abe05e68e6833c67df32e3f6e451");
                    }
                    o.this.b.removeUpdates(locationListener);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final void a(@NonNull final GnssStatus.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73f84a31bda0c1f30cba0284a70b3bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73f84a31bda0c1f30cba0284a70b3bc");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rGSCallback", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.9
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37e23f51accd171fb8e30de8aa146b06", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37e23f51accd171fb8e30de8aa146b06");
                    }
                    o.this.b.registerGnssStatusCallback(callback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final void b(@NonNull final GnssStatus.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c731b2e71f42621aeca36f4e7ed0319a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c731b2e71f42621aeca36f4e7ed0319a");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.uGSCallback", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.10
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "068a5ed7e5ba0b026cae739def1c1ac2", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "068a5ed7e5ba0b026cae739def1c1ac2");
                    }
                    o.this.b.unregisterGnssStatusCallback(callback);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final boolean a(final GpsStatus.Listener listener) {
        Boolean bool;
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0578055be470bf03754492c136737aa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0578055be470bf03754492c136737aa")).booleanValue();
        }
        if (this.b == null || (bool = (Boolean) this.d.a("loc.aGSListener", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Boolean>() { // from class: com.meituan.android.privacy.proxy.o.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f6007ecb1a4062b6cd6688dbfd796cab", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f6007ecb1a4062b6cd6688dbfd796cab") : Boolean.valueOf(o.this.b.addGpsStatusListener(listener));
            }
        }, false)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void b(final GpsStatus.Listener listener) {
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea7e00e872fc07a7934e34937b4f6a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea7e00e872fc07a7934e34937b4f6a5");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rGSListener", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f777f33a1d310af69e1edacf39101072", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f777f33a1d310af69e1edacf39101072");
                    }
                    o.this.b.removeGpsStatusListener(listener);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final void a(@NonNull final OnNmeaMessageListener onNmeaMessageListener) {
        Object[] objArr = {onNmeaMessageListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70b358053b449f61aa88f2e133b1db87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70b358053b449f61aa88f2e133b1db87");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.aNListener_O", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e75b3382e759cf6cb630dfc3dce154a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e75b3382e759cf6cb630dfc3dce154a");
                    }
                    o.this.b.addNmeaListener(onNmeaMessageListener);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final void b(@NonNull final OnNmeaMessageListener onNmeaMessageListener) {
        Object[] objArr = {onNmeaMessageListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ca8cf1bd86e482c417d06a486a113a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ca8cf1bd86e482c417d06a486a113a");
        } else if (this.b == null) {
        } else {
            this.d.a("loc.rNListener", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<Void>() { // from class: com.meituan.android.privacy.proxy.o.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.privacy.proxy.u.a
                public final /* synthetic */ Void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83869da12cf82d203b8e77cbe19f8624", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Void) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83869da12cf82d203b8e77cbe19f8624");
                    }
                    o.this.b.removeNmeaListener(onNmeaMessageListener);
                    return null;
                }
            }, false);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final boolean c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbbaea759916c81f4d38b7198861f6c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbbaea759916c81f4d38b7198861f6c")).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return this.b.isProviderEnabled(str);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final GpsStatus a(@Nullable final GpsStatus gpsStatus) {
        Object[] objArr = {gpsStatus};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5939c027b48a22434ce2029d274479c", RobustBitConfig.DEFAULT_VALUE)) {
            return (GpsStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5939c027b48a22434ce2029d274479c");
        }
        if (this.b == null) {
            return null;
        }
        return (GpsStatus) this.d.a("loc.gGStatus", this.e, new String[]{y.a(this.e, "Locate.once")}, new u.a<GpsStatus>() { // from class: com.meituan.android.privacy.proxy.o.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.privacy.proxy.u.a
            public final /* synthetic */ GpsStatus a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f66013b18c26056c3c1e443ef56f0232", RobustBitConfig.DEFAULT_VALUE) ? (GpsStatus) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f66013b18c26056c3c1e443ef56f0232") : o.this.b.getGpsStatus(gpsStatus);
            }
        });
    }
}
