package com.meituan.android.privacy.interfaces.def;

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
import com.meituan.android.common.locate.api.MtLocationManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class o extends c implements com.meituan.android.privacy.interfaces.u {
    public static ChangeQuickRedirect c;
    private LocationManager d;

    public o(@NonNull Context context, @NonNull String str) {
        super(context, str);
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c08c0ef1782d52f9642ced634debd81", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c08c0ef1782d52f9642ced634debd81");
        } else if (this.a != null) {
            try {
                this.d = (LocationManager) this.a.getSystemService("location");
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    @Nullable
    public final Location a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b804f7ceffc5f8a12dc9dd71513bb0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Location) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b804f7ceffc5f8a12dc9dd71513bb0a");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.c.a(this.d, str);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3070d30b487095e8af1ff40c8e80a79e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3070d30b487095e8af1ff40c8e80a79e");
        } else if (this.d == null) {
        } else {
            this.d.removeTestProvider(str);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d43263fca5f9aaff44ee970906919a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d43263fca5f9aaff44ee970906919a8");
        }
        if (this.d == null) {
            return null;
        }
        return this.d.getAllProviders();
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 28)
    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ad745c9514f425f6e06c1a8d69e268", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ad745c9514f425f6e06c1a8d69e268")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        return this.d.isLocationEnabled();
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final String a(@NonNull Criteria criteria, boolean z) {
        Object[] objArr = {criteria, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48c7e7c02b9da469a93382fc66333ae", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48c7e7c02b9da469a93382fc66333ae") : this.d == null ? "" : this.d.getBestProvider(criteria, z);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final boolean a(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        Object[] objArr = {str, str2, bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea104b290dd02affda201d31df11d1bf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea104b290dd02affda201d31df11d1bf")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        LocationManager locationManager = this.d;
        Object[] objArr2 = {locationManager, str, str2, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.util.aop.g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f36a2968ddcce838664c7318e2c14114", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f36a2968ddcce838664c7318e2c14114")).booleanValue();
        }
        if (com.sankuai.meituan.takeoutnew.util.aop.j.a("android.permission.ACCESS_COARSE_LOCATION") || com.sankuai.meituan.takeoutnew.util.aop.j.a("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return locationManager.sendExtraCommand(str, str2, bundle);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    public final void a(@NonNull String str, long j, float f, @NonNull LocationListener locationListener) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), locationListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be07d03d46c73931a48085268cbc60e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be07d03d46c73931a48085268cbc60e7");
        } else if (this.d == null) {
        } else {
            this.d.requestLocationUpdates(str, j, f, locationListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    public final void a(@NonNull String str, long j, float f, @NonNull LocationListener locationListener, Looper looper) {
        Object[] objArr = {str, new Long(j), Float.valueOf(f), locationListener, looper};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24515ad05b5c0cfb3e199318f8cf121c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24515ad05b5c0cfb3e199318f8cf121c");
        } else {
            this.d.requestLocationUpdates(str, j, f, locationListener, looper);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    public final void a(LocationListener locationListener) {
        Object[] objArr = {locationListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c399a2301331cd11298af6e5ff31fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c399a2301331cd11298af6e5ff31fb2");
        } else if (this.d == null) {
        } else {
            this.d.removeUpdates(locationListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final synchronized void a(@NonNull GnssStatus.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd0e80fc38056f9cf2d3211aa6cdc5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd0e80fc38056f9cf2d3211aa6cdc5b");
        } else if (this.d == null) {
        } else {
            this.d.registerGnssStatusCallback(callback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final synchronized void b(@NonNull GnssStatus.Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030ebffd8d10db76b13486a8c1d328ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030ebffd8d10db76b13486a8c1d328ec");
        } else if (this.d == null) {
        } else {
            this.d.unregisterGnssStatusCallback(callback);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    public final boolean a(GpsStatus.Listener listener) {
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65e97897e28504e1d2c1dde75738f89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65e97897e28504e1d2c1dde75738f89")).booleanValue();
        }
        if (this.d == null) {
            return false;
        }
        LocationManager locationManager = this.d;
        Object[] objArr2 = {locationManager, listener};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.util.aop.g.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b9652a77e0046903fd46b8e3363a7126", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b9652a77e0046903fd46b8e3363a7126")).booleanValue();
        }
        if (com.sankuai.meituan.takeoutnew.util.aop.j.a("android.permission.ACCESS_COARSE_LOCATION") || com.sankuai.meituan.takeoutnew.util.aop.j.a("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        return new MtLocationManager(locationManager, com.meituan.android.singleton.b.a, "waimai").addGpsStatusListener(listener);
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final void b(GpsStatus.Listener listener) {
        Object[] objArr = {listener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328c9b5f494cd1c71d10bb8f598bf52b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328c9b5f494cd1c71d10bb8f598bf52b");
        } else if (this.d == null) {
        } else {
            LocationManager locationManager = this.d;
            Object[] objArr2 = {locationManager, listener};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.takeoutnew.util.aop.g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7104c97da9ecc73ebf477c583120ff5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7104c97da9ecc73ebf477c583120ff5e");
            } else {
                new MtLocationManager(locationManager, com.meituan.android.singleton.b.a, "waimai").removeGpsStatusListener(listener);
            }
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    @SuppressLint({"MissingPermission"})
    public final synchronized void a(@NonNull OnNmeaMessageListener onNmeaMessageListener) {
        Object[] objArr = {onNmeaMessageListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba1c1a0ee7a51687c3a0413e3d8339a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba1c1a0ee7a51687c3a0413e3d8339a");
        } else if (this.d == null) {
        } else {
            this.d.addNmeaListener(onNmeaMessageListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @RequiresApi(api = 24)
    public final synchronized void b(@NonNull OnNmeaMessageListener onNmeaMessageListener) {
        Object[] objArr = {onNmeaMessageListener};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18534c67ffee01d1f91755dbcac6f86e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18534c67ffee01d1f91755dbcac6f86e");
        } else if (this.d == null) {
        } else {
            this.d.removeNmeaListener(onNmeaMessageListener);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.u
    public final boolean c(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f8be586bfd28a7dacf11c04b9605780", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f8be586bfd28a7dacf11c04b9605780")).booleanValue();
        }
        if (this.d != null) {
            return com.sankuai.meituan.takeoutnew.util.aop.g.a(this.d, str);
        }
        return false;
    }

    @Override // com.meituan.android.privacy.interfaces.u
    @SuppressLint({"MissingPermission"})
    public final GpsStatus a(@Nullable GpsStatus gpsStatus) {
        Object[] objArr = {gpsStatus};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9526d6fc89fdc657bf5e53a2ffe7efcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (GpsStatus) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9526d6fc89fdc657bf5e53a2ffe7efcd");
        }
        if (this.d == null) {
            return null;
        }
        return com.meituan.android.privacy.aop.c.a(this.d, gpsStatus);
    }
}
