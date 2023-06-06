package com.meituan.msi.api.location;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.l;
import com.meituan.msi.bean.LocationUpdateEvent;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.constants.ErrorTips;
import com.meituan.msi.dispather.c;
import com.meituan.msi.provider.c;
import com.meituan.msi.util.k;
import com.meituan.msi.util.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LocationApi implements IMsiApi, l, c, com.meituan.msi.lifecycle.a {
    public static ChangeQuickRedirect a;
    public final Context b;
    public MsiContext c;
    LocationUpdateEvent d;
    boolean e;
    public final ConcurrentHashMap<String, b> f;
    private final Set<String> g;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public MsiContext a;
        public LocationUpdateApiParam b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public a a;
        public com.meituan.msi.location.b b;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ef604877a088d9c570a9d2a3bf5eab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ef604877a088d9c570a9d2a3bf5eab7");
        }
    }

    @MsiApiMethod(isCallback = true, name = "offLocationChange")
    public void offLocationChange(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onLocationChange", request = LocationUpdateApiParam.class, response = LocationChangeEvent.class)
    public void onLocationChange(LocationUpdateApiParam locationUpdateApiParam, MsiContext msiContext) {
    }

    public LocationApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77539cca3fd67da0b837971341f72b58", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77539cca3fd67da0b837971341f72b58");
            return;
        }
        this.b = com.meituan.msi.a.f();
        this.f = new ConcurrentHashMap<>();
        this.g = new CopyOnWriteArraySet();
    }

    @Nullable
    private synchronized com.meituan.msi.location.b a(Activity activity, c.a aVar, String str) {
        Object[] objArr = {activity, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5e2b786370f1b076b684db9b22291d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msi.location.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5e2b786370f1b076b684db9b22291d");
        } else if (a(activity)) {
            return null;
        } else {
            com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
            cVar.a = aVar;
            cVar.b = str;
            return this.c.request.getMsiLocationLoaderProvider().a(activity, cVar);
        }
    }

    private boolean a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c19d9967be9852dbaaf0a30d244f001", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c19d9967be9852dbaaf0a30d244f001")).booleanValue() : activity == null || activity.isFinishing() || (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r13.equals("startLocationUpdate") != false) goto L15;
     */
    @Override // com.meituan.msi.api.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String[] a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.msi.api.location.LocationApi.a
            java.lang.String r11 = "e9ce1e707173d9b00ad26a3b3d9208e0"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.String[] r13 = (java.lang.String[]) r13
            return r13
        L1e:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -340613664(0xffffffffebb2a5e0, float:-4.3194424E26)
            if (r2 == r3) goto L49
            r0 = -316023509(0xffffffffed29dd2b, float:-3.2856464E27)
            if (r2 == r0) goto L3e
            r0 = 1273954094(0x4beeff2e, float:3.1325788E7)
            if (r2 == r0) goto L33
            goto L53
        L33:
            java.lang.String r0 = "startLocationUpdateBackground"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L53
            r0 = 2
            goto L54
        L3e:
            java.lang.String r0 = "getLocation"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L53
            r0 = 0
            goto L54
        L49:
            java.lang.String r2 = "startLocationUpdate"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L53
            goto L54
        L53:
            r0 = -1
        L54:
            switch(r0) {
                case 0: goto L61;
                case 1: goto L5a;
                case 2: goto L5a;
                default: goto L57;
            }
        L57:
            java.lang.String[] r13 = new java.lang.String[r9]
            return r13
        L5a:
            java.lang.String r13 = "Locate.continuous"
            java.lang.String[] r13 = new java.lang.String[]{r13}
            return r13
        L61:
            java.lang.String r13 = "Locate.once"
            java.lang.String[] r13 = new java.lang.String[]{r13}
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msi.api.location.LocationApi.a(java.lang.String):java.lang.String[]");
    }

    @MsiApiMethod(name = "startLocationUpdate", request = LocationUpdateApiParam.class)
    public void startLocationUpdate(LocationUpdateApiParam locationUpdateApiParam, MsiContext msiContext) {
        Object[] objArr = {locationUpdateApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d58711a929bb48ebe8c65c28467d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d58711a929bb48ebe8c65c28467d76");
            return;
        }
        String str = "";
        if (locationUpdateApiParam != null && locationUpdateApiParam._mt != null) {
            str = locationUpdateApiParam._mt.sceneToken;
        }
        if (!a(false, str, msiContext)) {
            msiContext.onSuccess("system location is not enable");
            return;
        }
        this.c = msiContext;
        b bVar = this.f.get(str);
        if (bVar == null && !this.e) {
            com.meituan.msi.location.b a2 = a(msiContext.getActivity(), c.a.instant_forground, str);
            if (a2 != null) {
                a aVar = new a();
                aVar.b = locationUpdateApiParam;
                aVar.a = msiContext;
                b bVar2 = new b();
                bVar2.b = a2;
                bVar2.a = aVar;
                this.f.put(str, bVar2);
                a(null, a2, msiContext, true);
                msiContext.onSuccess("");
            } else {
                msiContext.onError("startLocationUpdate api call failed, activity not exist");
            }
        } else if (bVar != null && bVar.b == null && !this.e) {
            com.meituan.msi.location.b a3 = a(msiContext.getActivity(), c.a.instant_forground, str);
            if (a3 != null) {
                bVar.b = a3;
                a(null, a3, msiContext, true);
                msiContext.onSuccess("");
            } else {
                msiContext.onError("startLocationUpdate api call failed, activity not exist");
            }
        } else if (bVar != null) {
            a aVar2 = new a();
            aVar2.b = locationUpdateApiParam;
            aVar2.a = msiContext;
            bVar.a = aVar2;
            msiContext.onSuccess("");
        } else {
            msiContext.onError("data is null and onBackground");
        }
        this.g.remove(str);
    }

    @MsiApiMethod(name = "startLocationUpdateBackground", request = LocationUpdateApiParam.class)
    public void startLocationUpdateBackground(LocationUpdateApiParam locationUpdateApiParam, MsiContext msiContext) {
        Object[] objArr = {locationUpdateApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03301e97c441bb4aa6413dae07ab3b65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03301e97c441bb4aa6413dae07ab3b65");
            return;
        }
        String str = "";
        if (locationUpdateApiParam != null && locationUpdateApiParam._mt != null) {
            str = locationUpdateApiParam._mt.sceneToken;
        }
        if (!a(false, str, msiContext)) {
            msiContext.onSuccess("system location is not enable");
            return;
        }
        this.c = msiContext;
        b bVar = this.f.get(str);
        if (bVar == null) {
            com.meituan.msi.location.b a2 = a(msiContext.getActivity(), c.a.instant_background, str);
            if (a2 != null) {
                b bVar2 = new b();
                bVar2.b = a2;
                this.f.put(str, bVar2);
                a(null, a2, msiContext, true);
                msiContext.onSuccess("");
            } else {
                msiContext.onError("startLocationUpdateBackground api call failed, activity not exist");
            }
        } else {
            bVar.a = null;
            msiContext.onSuccess("");
        }
        this.g.remove(str);
    }

    @MsiApiMethod(name = "stopLocationUpdate", request = LocationUpdateApiParam.class)
    public synchronized void stopLocationUpdate(LocationUpdateApiParam locationUpdateApiParam, MsiContext msiContext) {
        Object[] objArr = {locationUpdateApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7946aecb86896771e8d0d85ebe8a65da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7946aecb86896771e8d0d85ebe8a65da");
            return;
        }
        Object[] objArr2 = {locationUpdateApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a76dcddd0d63874454cc7be546c6dae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a76dcddd0d63874454cc7be546c6dae6");
            return;
        }
        String str = "";
        if (locationUpdateApiParam != null && locationUpdateApiParam._mt != null) {
            str = locationUpdateApiParam._mt.sceneToken;
        }
        b bVar = this.f.get(str);
        if (bVar != null) {
            a(bVar.b, str, msiContext);
            this.f.remove(str);
        } else if (this.g.contains(str)) {
            msiContext.onSuccess("");
        } else {
            msiContext.onError("location not started, invoke startLocationUpdate or startLocationUpdateBackground first!");
        }
    }

    private void a(com.meituan.msi.location.b bVar, String str, MsiContext msiContext) {
        Object[] objArr = {bVar, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b07824a556bb6de883b59fb475d4febf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b07824a556bb6de883b59fb475d4febf");
        } else if (bVar == null) {
            msiContext.onError("location not started, invoke startLocationUpdate or startLocationUpdateBackground first!");
        } else {
            this.g.add(str);
            bVar.a();
            msiContext.onSuccess("");
        }
    }

    @MsiApiMethod(name = "getLocation", request = GetLocationApiParam.class, response = LocationChangeEvent.class)
    public void getLocation(GetLocationApiParam getLocationApiParam, MsiContext msiContext) {
        Object[] objArr = {getLocationApiParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93cb04d9ca9f426c97d92b1ed45a8076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93cb04d9ca9f426c97d92b1ed45a8076");
            return;
        }
        Activity activity = msiContext.getActivity();
        if (a(activity)) {
            msiContext.onError("getLocation api call failed, activity not exist");
            return;
        }
        String str = "";
        if (getLocationApiParam != null && getLocationApiParam._mt != null) {
            str = getLocationApiParam._mt.sceneToken;
        }
        if (!a(false, str)) {
            msiContext.onError(401, "system location permissions denied");
            return;
        }
        com.meituan.msi.location.c msiLocationLoaderProvider = msiContext.request.getMsiLocationLoaderProvider();
        com.meituan.msi.provider.c cVar = new com.meituan.msi.provider.c();
        cVar.a = c.a.normal;
        cVar.b = str;
        com.meituan.msi.location.b a2 = msiLocationLoaderProvider.a(activity, cVar);
        if (a2 == null) {
            msiContext.onError(ErrorTips.LOCATION_SERVICE_UNAVAILABLE);
        } else {
            a(getLocationApiParam, a2, msiContext, false);
        }
    }

    private void a(GetLocationApiParam getLocationApiParam, @NonNull final com.meituan.msi.location.b bVar, final MsiContext msiContext, final boolean z) {
        Object[] objArr = {getLocationApiParam, bVar, msiContext, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e19077016171ba9df5d0b8db27e084ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e19077016171ba9df5d0b8db27e084ff");
        } else {
            bVar.a(new com.meituan.msi.location.a() { // from class: com.meituan.msi.api.location.LocationApi.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msi.location.a
                public final void a(int i, com.meituan.msi.api.location.a aVar, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), aVar, str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "834a3148a7df91368595a4755477b346", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "834a3148a7df91368595a4755477b346");
                    } else if (i != 0 || aVar == null) {
                        MsiContext msiContext2 = msiContext;
                        msiContext2.onError(String.valueOf(i) + CommonConstant.Symbol.COMMA + str);
                    } else {
                        if (!z) {
                            bVar.a();
                        }
                        LocationChangeEvent locationChangeEvent = new LocationChangeEvent(aVar);
                        LocationApi locationApi = LocationApi.this;
                        MsiContext msiContext3 = msiContext;
                        boolean z2 = z;
                        Object[] objArr3 = {msiContext3, locationChangeEvent, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bVar};
                        ChangeQuickRedirect changeQuickRedirect3 = LocationApi.a;
                        if (PatchProxy.isSupport(objArr3, locationApi, changeQuickRedirect3, false, "f45bf9e3f165a91f2353b75bfba5419d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, locationApi, changeQuickRedirect3, false, "f45bf9e3f165a91f2353b75bfba5419d");
                        } else if (!z2) {
                            msiContext3.onSuccess(locationChangeEvent);
                        } else {
                            if (locationApi.d != null) {
                                if (!locationApi.d.updateEnable) {
                                    locationApi.b(msiContext3);
                                    return;
                                } else if (!locationApi.d.updateBackgroundEnable) {
                                    locationApi.a(msiContext3);
                                    return;
                                }
                            }
                            if (locationApi.e() || !locationApi.e) {
                                msiContext3.dispatchEvent("onLocationChange", locationChangeEvent);
                            }
                        }
                    }
                }
            }, a(getLocationApiParam, z));
        }
    }

    boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92bf8c76d03f952763eab364ff4c4512", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92bf8c76d03f952763eab364ff4c4512")).booleanValue();
        }
        for (b bVar : this.f.values()) {
            if (bVar != null && bVar.a == null && bVar.b != null) {
                return true;
            }
        }
        return false;
    }

    void a(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e570611b011f6d81ed054bdff6a30cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e570611b011f6d81ed054bdff6a30cc6");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            b value = it.next().getValue();
            if (value.a == null) {
                a(value.b, key, msiContext);
                it.remove();
            }
        }
    }

    void b(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3b83837b75c4eeb8b59b250aef4cf7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3b83837b75c4eeb8b59b250aef4cf7");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            b value = it.next().getValue();
            if (value.a != null) {
                a(value.b, key, msiContext);
                it.remove();
            }
        }
    }

    private boolean a(boolean z, String str, MsiContext msiContext) {
        Object[] objArr = {(byte) 0, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1099b7c597162a355cae39330528bde", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1099b7c597162a355cae39330528bde")).booleanValue();
        }
        if (!k.a(this.b)) {
            msiContext.onError(401, "gps is not enabled");
            return false;
        } else if (a(false, str)) {
            return true;
        } else {
            msiContext.onError(401, "system location permissions denied");
            return false;
        }
    }

    private boolean a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676914df4681be4c055c56a3e4cd369b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676914df4681be4c055c56a3e4cd369b")).booleanValue();
        }
        if (z) {
            return k.b(this.b, str);
        }
        return k.a(this.b, str);
    }

    private String a(GetLocationApiParam getLocationApiParam, boolean z) {
        Object[] objArr = {getLocationApiParam, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc3df3ef662626b20a34c8f481c32b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc3df3ef662626b20a34c8f481c32b4");
        }
        if (getLocationApiParam == null || TextUtils.isEmpty(getLocationApiParam.type)) {
            return z ? "gcj02" : "wgs84";
        }
        return getLocationApiParam.type;
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14120fe061f38b74f57fd5102a2de8bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14120fe061f38b74f57fd5102a2de8bd");
            return;
        }
        this.e = false;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0803297aba88bf4c3e2f5c55ba89b859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0803297aba88bf4c3e2f5c55ba89b859");
            return;
        }
        for (b bVar : this.f.values()) {
            if (bVar.a != null && bVar.a.a != null) {
                startLocationUpdate(bVar.a.b, bVar.a.a);
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ae01a4803bde2e09da9f068077e5af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ae01a4803bde2e09da9f068077e5af");
            return;
        }
        char c = 1;
        this.e = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "069b4828bcf07cba4f682f78b027e36c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "069b4828bcf07cba4f682f78b027e36c");
            return;
        }
        for (Map.Entry<String, b> entry : this.f.entrySet()) {
            b value = entry.getValue();
            if (value.a != null) {
                com.meituan.msi.location.b bVar = value.b;
                String key = entry.getKey();
                Object[] objArr3 = new Object[2];
                objArr3[0] = bVar;
                objArr3[c] = key;
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "afc4468e3649852d0a4bc4c9d1af86e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "afc4468e3649852d0a4bc4c9d1af86e4");
                } else if (bVar == null) {
                    System.out.println("location not started, invoke startLocationUpdate or startLocationUpdateBackground first!");
                } else {
                    this.g.add(key);
                    bVar.a();
                }
                value.b = null;
                c = 1;
            }
        }
    }

    @Override // com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24642681a452368be53090b28caa1075", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24642681a452368be53090b28caa1075");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc55d3fdc64649c3c3a0593b0c3c3806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc55d3fdc64649c3c3a0593b0c3c3806");
            return;
        }
        Iterator<Map.Entry<String, b>> it = this.f.entrySet().iterator();
        while (it.hasNext()) {
            b value = it.next().getValue();
            if (value.b != null) {
                value.b.a();
            }
            it.remove();
        }
    }

    @Override // com.meituan.msi.dispather.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da98e24ae90ca608c6e4e0bac53a882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da98e24ae90ca608c6e4e0bac53a882");
        } else if (TextUtils.equals(str, "locationUpdateEvent")) {
            this.d = (LocationUpdateEvent) w.a(str2, LocationUpdateEvent.class);
        }
    }
}
