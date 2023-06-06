package com.meituan.mmp.lib.map;

import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.model.Platform;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public static final Platform b;
    private static final Map<Integer, Boolean> c;
    private static boolean d;

    static {
        Platform platform;
        Platform[] valuesCustom = Platform.valuesCustom();
        int length = valuesCustom.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                platform = null;
                break;
            }
            platform = valuesCustom[i];
            if ("MMP".equals(platform.name())) {
                break;
            }
            i++;
        }
        if (platform == null) {
            platform = Platform.NATIVE;
        }
        b = platform;
        c = new ConcurrentHashMap();
        d = false;
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d80c4ad4530c935fe908c919af38a49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d80c4ad4530c935fe908c919af38a49")).intValue();
        }
        int mapType = MMPEnvHelper.getMapType();
        if (mapType >= 0 && a(mapType)) {
            com.meituan.mmp.lib.trace.b.b("MapChecker", "use map type " + mapType + " by host config");
            return mapType;
        } else if (a(1)) {
            com.meituan.mmp.lib.trace.b.b("MapChecker", "use tencent map");
            return 1;
        } else if (a(3)) {
            com.meituan.mmp.lib.trace.b.b("MapChecker", "use mt map because tencent map not found");
            return 3;
        } else {
            com.meituan.mmp.lib.trace.b.d("MapChecker", "no available map");
            return -1;
        }
    }

    private static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ae9d4475120b4295a87dd66a83a5710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ae9d4475120b4295a87dd66a83a5710");
        } else if (c.containsKey(Integer.valueOf(i))) {
        } else {
            try {
                Class.forName(str);
                c.put(Integer.valueOf(i), Boolean.TRUE);
            } catch (Throwable unused) {
                c.put(Integer.valueOf(i), Boolean.FALSE);
            }
        }
    }

    private static boolean a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bbdf0861c72f007953f7d3b2ac447a06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bbdf0861c72f007953f7d3b2ac447a06")).booleanValue();
        }
        a(1, "com.tencent.tencentmap.mapsdk.maps.TextureMapView");
        a(3, "com.sankuai.meituan.mapsdk.mtmapadapter.NativeMapAdapter");
        Boolean bool = c.get(Integer.valueOf(i));
        return bool != null && bool.booleanValue();
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fc727a0636399a5bd0311d9e9ca1da12", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fc727a0636399a5bd0311d9e9ca1da12")).booleanValue();
        }
        if (!d) {
            if (a() == 3) {
                try {
                    boolean mapCanBeUsed = MapsInitializer.mapCanBeUsed();
                    d = mapCanBeUsed;
                    return mapCanBeUsed;
                } catch (Throwable unused) {
                }
            }
            d = true;
        }
        return true;
    }

    public static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7936294f32ef7fac806d05d2f64a07b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7936294f32ef7fac806d05d2f64a07b6")).booleanValue() : a(1);
    }

    public static boolean a(double d2, double d3) {
        Object[] objArr = {Double.valueOf(d2), Double.valueOf(d3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6682a8527bcff303a92ce4976da3ab12", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6682a8527bcff303a92ce4976da3ab12")).booleanValue() : (Double.isNaN(d2) || Math.abs(d2) > 90.0d || Double.isNaN(d3) || Double.isInfinite(d3)) ? false : true;
    }
}
