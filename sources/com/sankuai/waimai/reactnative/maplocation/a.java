package com.sankuai.waimai.reactnative.maplocation;

import android.content.Context;
import com.facebook.react.modules.appstate.AppStateModule;
import com.meituan.android.mrn.component.map.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import com.sankuai.meituan.mapsdk.maps.model.MapLocation;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.g;
import java.util.concurrent.TimeUnit;
import rx.d;
import rx.e;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    k b;
    y.b c;

    @Override // com.meituan.android.mrn.component.map.c
    public final String a() {
        return "49058660-1de4-4c13-a401-a7f237e85065";
    }

    @Override // com.meituan.android.mrn.component.map.b
    public final void a(String str, Context context, MTMap mTMap) {
    }

    @Override // com.meituan.android.mrn.component.map.b
    public final y a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f9ece2e26d700c7a81e307ea52c3e0b", RobustBitConfig.DEFAULT_VALUE) ? (y) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f9ece2e26d700c7a81e307ea52c3e0b") : new y() { // from class: com.sankuai.waimai.reactnative.maplocation.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y
            public final void a(final y.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "39ba64eae274574a721a6b4de868784e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "39ba64eae274574a721a6b4de868784e");
                    return;
                }
                com.sankuai.waimai.imbase.log.a.c("WMLocationSourceProvide", AppStateModule.APP_STATE_ACTIVE, new Object[0]);
                a.this.b = d.a(1L, 5L, TimeUnit.SECONDS, rx.schedulers.a.d()).a(rx.android.schedulers.a.a()).a(new e<Long>() { // from class: com.sankuai.waimai.reactnative.maplocation.a.1.1
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final void onCompleted() {
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                    }

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Long l) {
                        Object[] objArr3 = {l};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b7bbb41f42e5e40180da0bf764705de", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b7bbb41f42e5e40180da0bf764705de");
                            return;
                        }
                        if (aVar instanceof y.b) {
                            a.this.c = (y.b) aVar;
                        }
                        final WMLocation i = g.a().i();
                        if (i == null || a.this.c == null) {
                            return;
                        }
                        y.b bVar = a.this.c;
                        final a aVar2 = a.this;
                        Object[] objArr4 = {i};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        bVar.onLocationChanged(PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "341907e7976033b6bffe2a9d5f527b2a", RobustBitConfig.DEFAULT_VALUE) ? (MapLocation) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "341907e7976033b6bffe2a9d5f527b2a") : new MapLocation() { // from class: com.sankuai.waimai.reactnative.maplocation.a.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final double getLatitude() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "f2db77bf786fd5f96f0be835a61bbbd4", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "f2db77bf786fd5f96f0be835a61bbbd4")).doubleValue() : i.getLatitude();
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final double getLongitude() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9d31e4ac747793a8d0998a2678ef0b52", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9d31e4ac747793a8d0998a2678ef0b52")).doubleValue() : i.getLongitude();
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final double getAltitude() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ca96bf68bb4d858e555d3ae3cfbee5da", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ca96bf68bb4d858e555d3ae3cfbee5da")).doubleValue() : i.getAltitude();
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final float getSpeed() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "159d8f992d8cf3c7a6273a53d296c255", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "159d8f992d8cf3c7a6273a53d296c255")).floatValue() : i.getSpeed();
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final float getBearing() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6964c575b2ab37ffb002735be62eb20c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6964c575b2ab37ffb002735be62eb20c")).floatValue() : i.getBearing();
                            }

                            @Override // com.sankuai.meituan.mapsdk.maps.model.MapLocation
                            public final float getAccuracy() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a1a3f0178ffc30ae7f871dc4e136a3c7", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a1a3f0178ffc30ae7f871dc4e136a3c7")).floatValue() : i.getAccuracy();
                            }
                        });
                    }
                });
            }

            @Override // com.sankuai.meituan.mapsdk.maps.interfaces.y
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14fba94ac4d1b30ce99403189e819459", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14fba94ac4d1b30ce99403189e819459");
                    return;
                }
                com.sankuai.waimai.imbase.log.a.c("WMLocationSourceProvide", "deactivate", new Object[0]);
                if (a.this.b == null || a.this.b.isUnsubscribed()) {
                    return;
                }
                a.this.b.unsubscribe();
            }
        };
    }
}
