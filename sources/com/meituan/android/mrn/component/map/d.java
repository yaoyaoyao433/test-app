package com.meituan.android.mrn.component.map;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNGroundOverlayManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNHeatMapOverlayManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapArcViewManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapCalloutManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapCircleViewManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapMarkerContentManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapMarkerViewManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapPolygonViewManager;
import com.meituan.android.mrn.component.map.viewmanager.MRNMapPolylineViewV2Manager;
import com.meituan.android.mrn.component.map.viewmanager.MRNTileOverlayManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMTNativeMapViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMTNativeTextureMapViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMTTencentMapViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNMTTencentTextureMapViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNTencentMapViewManager;
import com.meituan.android.mrn.component.map.viewmanager.map.MRNTencentTextureMapViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.interfaces.y;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public final class d implements i {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static boolean c = false;
    private static boolean d = true;
    private static a h = new a() { // from class: com.meituan.android.mrn.component.map.d.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.mrn.component.map.d.a
        public final void a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7756f09d8901dd4caa9487485f8fb9fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7756f09d8901dd4caa9487485f8fb9fb");
            } else {
                d.a(str, str2, str3);
            }
        }

        @Override // com.meituan.android.mrn.component.map.d.a
        public final void a(String str, String str2, Throwable th, String str3) {
            Object[] objArr = {str, str2, th, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aedb3b5ac7efe025c3638cd8d1c18b8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aedb3b5ac7efe025c3638cd8d1c18b8");
            } else {
                d.a(str, str2, th, str3);
            }
        }
    };
    private List<com.meituan.android.mrn.component.map.a> e;
    private List<e> f;
    private b g;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, String str3);

        void a(String str, String str2, Throwable th, String str3);
    }

    @Deprecated
    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c092a81a2e34adcb5075be5495624df8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c092a81a2e34adcb5075be5495624df8");
        } else {
            this.g = new b() { // from class: com.meituan.android.mrn.component.map.d.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.mrn.component.map.b
                public final y a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202", RobustBitConfig.DEFAULT_VALUE)) {
                        return (y) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202");
                    }
                    if (d.this.e == null) {
                        return null;
                    }
                    for (com.meituan.android.mrn.component.map.a aVar : d.this.e) {
                        if (aVar != null && TextUtils.equals(aVar.a(), str)) {
                            return aVar.b();
                        }
                    }
                    return null;
                }

                @Override // com.meituan.android.mrn.component.map.b
                public final void a(String str, Context context, MTMap mTMap) {
                    Object[] objArr2 = {str, context, mTMap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a");
                    } else if (d.this.f != null) {
                        for (e eVar : d.this.f) {
                            if (eVar != null && TextUtils.equals(eVar.a(), str)) {
                                return;
                            }
                        }
                    }
                }
            };
        }
    }

    @Deprecated
    public d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8cad25d1538d5e1b87ac0fa9721982", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8cad25d1538d5e1b87ac0fa9721982");
            return;
        }
        this.g = new b() { // from class: com.meituan.android.mrn.component.map.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.component.map.b
            public final y a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202", RobustBitConfig.DEFAULT_VALUE)) {
                    return (y) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202");
                }
                if (d.this.e == null) {
                    return null;
                }
                for (com.meituan.android.mrn.component.map.a aVar : d.this.e) {
                    if (aVar != null && TextUtils.equals(aVar.a(), str)) {
                        return aVar.b();
                    }
                }
                return null;
            }

            @Override // com.meituan.android.mrn.component.map.b
            public final void a(String str, Context context, MTMap mTMap) {
                Object[] objArr2 = {str, context, mTMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a");
                } else if (d.this.f != null) {
                    for (e eVar : d.this.f) {
                        if (eVar != null && TextUtils.equals(eVar.a(), str)) {
                            return;
                        }
                    }
                }
            }
        };
        this.g = bVar;
    }

    public d(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99422ff092ce54aa567b39925b7d8ada", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99422ff092ce54aa567b39925b7d8ada");
            return;
        }
        this.g = new b() { // from class: com.meituan.android.mrn.component.map.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.mrn.component.map.b
            public final y a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202", RobustBitConfig.DEFAULT_VALUE)) {
                    return (y) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "802afd4d772e83c5678d8d12408f0202");
                }
                if (d.this.e == null) {
                    return null;
                }
                for (com.meituan.android.mrn.component.map.a aVar : d.this.e) {
                    if (aVar != null && TextUtils.equals(aVar.a(), str)) {
                        return aVar.b();
                    }
                }
                return null;
            }

            @Override // com.meituan.android.mrn.component.map.b
            public final void a(String str, Context context, MTMap mTMap) {
                Object[] objArr2 = {str, context, mTMap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5709318a56f0b9dcf9bb5291ace8a45a");
                } else if (d.this.f != null) {
                    for (e eVar : d.this.f) {
                        if (eVar != null && TextUtils.equals(eVar.a(), str)) {
                            return;
                        }
                    }
                }
            }
        };
        this.g = cVar;
    }

    public static a a() {
        return h;
    }

    public static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f0e2ca7505d691efce2d297c84a1584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f0e2ca7505d691efce2d297c84a1584");
        } else if (d) {
            try {
                com.dianping.networklog.c.a("[" + str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + "[" + str2 + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT + str3, 3);
            } catch (Throwable unused) {
                d = false;
            }
        }
    }

    public static void a(String str, String str2, Throwable th, String str3) {
        Object[] objArr = {str, str2, th, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6a7126ca423c32b03abd602b0bb5eb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6a7126ca423c32b03abd602b0bb5eb2");
        } else if (d) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(str);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                sb.append("[");
                sb.append(str2);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                sb.append("[");
                sb.append(str3);
                sb.append(CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
                com.dianping.networklog.c.a(Log.getStackTraceString(th), 3);
            } catch (Throwable unused) {
                d = false;
            }
        }
    }

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f403597be1dfb1551e21f9a4301f4baf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f403597be1dfb1551e21f9a4301f4baf");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNMapModule(reactApplicationContext, this.g));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b9b6b8bbd6d0ef2f89166d924568e91", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b9b6b8bbd6d0ef2f89166d924568e91");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNMTTencentMapViewManager(this.g));
        arrayList.add(new MRNMTTencentTextureMapViewManager(this.g));
        arrayList.add(new MRNTencentMapViewManager(this.g));
        arrayList.add(new MRNTencentTextureMapViewManager(this.g));
        arrayList.add(new MRNMTNativeMapViewManager(this.g));
        arrayList.add(new MRNMTNativeTextureMapViewManager(this.g));
        arrayList.add(new MRNMapMarkerViewManager());
        arrayList.add(new MRNMapPolygonViewManager());
        arrayList.add(new MRNMapCalloutManager());
        arrayList.add(new MRNMapMarkerContentManager());
        arrayList.add(new MRNMapCircleViewManager());
        arrayList.add(new MRNMapPolylineViewV2Manager());
        arrayList.add(new MRNHeatMapOverlayManager());
        arrayList.add(new MRNGroundOverlayManager());
        arrayList.add(new MRNTileOverlayManager());
        arrayList.add(new MRNMapArcViewManager());
        return arrayList;
    }
}
