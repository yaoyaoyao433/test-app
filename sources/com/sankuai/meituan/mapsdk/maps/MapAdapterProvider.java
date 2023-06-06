package com.sankuai.meituan.mapsdk.maps;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.a;
import com.sankuai.meituan.mapsdk.mapcore.config.MapConfig;
import com.sankuai.meituan.mapsdk.mapcore.report.f;
import com.sankuai.meituan.mapsdk.mapcore.utils.c;
import com.sankuai.meituan.mapsdk.mapcore.utils.d;
import com.sankuai.meituan.mapsdk.mapcore.utils.g;
import com.sankuai.meituan.mapsdk.maps.interfaces.k;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import com.sankuai.meituan.mapsdk.maps.model.MapViewOptions;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MapAdapterProvider {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Class[] h = {Integer.TYPE, String.class, MTMapEnv.class, Platform.class, Boolean.TYPE, MapViewOptions.class, String.class};
    private static final Class[] i = {Integer.TYPE, Boolean.TYPE, MapViewOptions.class};
    private final Context a;
    private String b;
    private int c;
    private final String d;
    private final Platform e;
    private final int f;
    private final MapViewOptions g;
    private boolean j;

    public MapAdapterProvider(Context context, int i2, String str, Platform platform, int i3, MapViewOptions mapViewOptions, String str2) {
        Object[] objArr = {context, Integer.valueOf(i2), str, platform, Integer.valueOf(i3), mapViewOptions, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c85b59fae4bc0a5c85e3b00fee1390e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c85b59fae4bc0a5c85e3b00fee1390e9");
            return;
        }
        this.j = false;
        this.a = context;
        this.c = i2;
        this.d = str;
        this.e = platform;
        this.f = i3;
        this.g = mapViewOptions;
        this.b = str2;
    }

    public k obtain() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c84acc1dd9437556b3eb13693b0cf84", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c84acc1dd9437556b3eb13693b0cf84");
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8dc61121d30dbd5aefe208dc22f6d15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8dc61121d30dbd5aefe208dc22f6d15c");
        } else {
            MapConfig b = a.b();
            synchronized (MapConfig.class) {
                try {
                    if (b != null) {
                        List<MapConfig.Bussiness> bussinessConfigs = b.getBussinessConfigs();
                        if (bussinessConfigs != null && !bussinessConfigs.isEmpty()) {
                            for (MapConfig.Bussiness bussiness : bussinessConfigs) {
                                if (TextUtils.equals(this.d, bussiness.getKey())) {
                                    int mapSupplier = bussiness.getMapSupplier();
                                    if (mapSupplier != -2) {
                                        this.c = mapSupplier;
                                    }
                                    this.j = bussiness.isApiTracking();
                                }
                            }
                        }
                        MapConfig.AllConfig allConfig = b.getAllConfig();
                        if (allConfig != null) {
                            if (allConfig.getMapSupplier() != -2) {
                                this.c = allConfig.getMapSupplier();
                            }
                            this.j = allConfig.isApiTracking();
                        }
                    }
                } finally {
                }
            }
        }
        int i2 = this.c;
        k kVar = null;
        if (this.c == 1 && g.b()) {
            kVar = (k) d.a("com.sankuai.meituan.mapsdk.tencentadapter.TencentMapAdapter", i, Integer.valueOf(this.f), Boolean.valueOf(this.j), this.g);
        }
        if (kVar == null) {
            this.c = 3;
            kVar = (k) d.a("com.sankuai.meituan.mapsdk.mtmapadapter.NativeMapAdapter", h, Integer.valueOf(this.f), this.d, MapsInitializer.getMTMapEnv(), this.e, Boolean.valueOf(this.j), this.g, this.b);
        }
        if (kVar != null) {
            String a = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(this.a);
            if (TextUtils.isEmpty(a)) {
                a = "";
            }
            f.a(this.a, kVar.getMapType(), i2, this.e, this.d, a, kVar.getCacheClearState(this.a), this.g);
            return kVar;
        }
        c.f("mtmap_adapter_create_fail:" + this.c);
        throw new IllegalArgumentException("please check target module exist");
    }
}
