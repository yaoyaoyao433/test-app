package com.meituan.android.privacy.locate;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.content.Loader;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.privacy.locate.a;
import com.meituan.android.privacy.locate.c;
import com.meituan.android.privacy.locate.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static volatile Set<String> b = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(final String str, Context context, LoadConfig loadConfig, final Class cls, final Loader loader, final Runnable runnable) {
        long j;
        boolean z;
        byte b2;
        Object[] objArr = {str, context, loadConfig, cls, loader, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4723a39125a04b8d4ecbcf509b8f021c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4723a39125a04b8d4ecbcf509b8f021c");
            return;
        }
        try {
            long parseLong = Long.parseLong(loadConfig.get("privacy_cache_time")) * 1000;
            boolean parseBoolean = Boolean.parseBoolean(loadConfig.get("privacy_only_cache"));
            z = Boolean.parseBoolean(loadConfig.get("privacy_enable_first_pass"));
            j = parseLong;
            b2 = parseBoolean ? 1 : 0;
        } catch (Throwable unused) {
            j = 900000;
            z = false;
            b2 = 1;
        }
        if (z && !b.contains(str)) {
            b.add(str);
            e.a aVar = new e.a();
            aVar.b = str;
            aVar.d = 0L;
            aVar.c = "Locate.once";
            aVar.k = "0";
            aVar.i = true;
            aVar.f = !com.meituan.android.privacy.impl.a.c();
            aVar.l = "enableFirstPass=true, trigger locate sdk";
            e.a(aVar);
            runnable.run();
            return;
        }
        a a2 = a.a();
        final boolean z2 = b2;
        final long j2 = j;
        a.InterfaceC0353a interfaceC0353a = new a.InterfaceC0353a() { // from class: com.meituan.android.privacy.locate.b.1
            public static ChangeQuickRedirect a;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.meituan.android.privacy.locate.a.InterfaceC0353a
            public final void a(@Nullable MtLocation mtLocation, boolean z3) {
                Object[] objArr2 = {mtLocation, Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de2e1654ac6c765806227cd9773b6771", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de2e1654ac6c765806227cd9773b6771");
                    return;
                }
                e.a aVar2 = new e.a();
                aVar2.b = str;
                aVar2.c = "Locate.once";
                aVar2.f = !com.meituan.android.privacy.impl.a.c();
                if (z3 && !z2) {
                    aVar2.g = false;
                    aVar2.d = 0L;
                    aVar2.l = "not onlyCache, expired and trigger locate sdk";
                    aVar2.i = true;
                    aVar2.k = "0";
                    runnable.run();
                    e.a(aVar2);
                    return;
                }
                final boolean z4 = (!z2 || j2 > 0) ? z3 ? 1 : 0 : false;
                aVar2.g = !z4;
                aVar2.h = z4;
                aVar2.d = mtLocation == null ? -1L : System.currentTimeMillis() - mtLocation.getTime();
                aVar2.k = z2 ? "3" : "2";
                aVar2.l = "return cache or null if expired ";
                e.a(aVar2);
                c.a aVar3 = c.a;
                MtLocation a3 = aVar3 != null ? aVar3.a(mtLocation) : mtLocation;
                Parcelable parcelable = a3;
                if (!MtLocation.class.equals(cls)) {
                    if (Location.class.equals(cls)) {
                        Object[] objArr3 = {a3};
                        ChangeQuickRedirect changeQuickRedirect3 = d.a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ab874bf715e25c8b8345dd4bcada0043", RobustBitConfig.DEFAULT_VALUE)) {
                            parcelable = (Location) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ab874bf715e25c8b8345dd4bcada0043");
                        } else if (a3 != null && a3.getStatusCode() == 0 && a3.getLatitude() != 0.0d && a3.getLongitude() != 0.0d) {
                            Location location = new Location(a3.getProvider());
                            location.setProvider(a3.getProvider());
                            location.setLatitude(a3.getLatitude());
                            location.setLongitude(a3.getLongitude());
                            location.setAccuracy(a3.getAccuracy());
                            location.setBearing(a3.getBearing());
                            location.setSpeed(a3.getSpeed());
                            location.setTime(a3.getTime());
                            location.setAltitude(a3.getAltitude());
                            if (Build.VERSION.SDK_INT >= 26) {
                                location.setVerticalAccuracyMeters(a3.getVerticalAccuracyMeters());
                                location.setSpeedAccuracyMetersPerSecond(a3.getSpeedAccuracyMetersPerSecond());
                                location.setBearingAccuracyDegrees(a3.getBearingAccuracyDegrees());
                            }
                            location.setExtras(a3.getExtras() != null ? new Bundle(a3.getExtras()) : null);
                            r2 = location;
                        }
                    }
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.privacy.locate.b.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa375a77a9870e70d303b044966623f8", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa375a77a9870e70d303b044966623f8");
                                return;
                            }
                            loader.deliverResult(z4 ? null : r3);
                            loader.stopLoading();
                        }
                    });
                }
                r2 = parcelable;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.meituan.android.privacy.locate.b.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa375a77a9870e70d303b044966623f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa375a77a9870e70d303b044966623f8");
                            return;
                        }
                        loader.deliverResult(z4 ? null : r3);
                        loader.stopLoading();
                    }
                });
            }
        };
        Object[] objArr2 = {context, Byte.valueOf(b2), new Long(j), interfaceC0353a};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "c0ba13ff451f6fa0ed032a19f5bff901", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "c0ba13ff451f6fa0ed032a19f5bff901");
            return;
        }
        MtLocation mtLocation = a2.b;
        if (mtLocation != null) {
            if (a2.a(mtLocation.getTime(), j)) {
                a2.a(context, b2, j, interfaceC0353a);
            } else {
                interfaceC0353a.a(mtLocation, false);
            }
        } else if (ProcessUtils.isMainProcess(context) && a2.e) {
            a2.e = false;
            interfaceC0353a.a(null, true);
        } else {
            a2.a(context, b2, j, interfaceC0353a);
        }
    }
}
