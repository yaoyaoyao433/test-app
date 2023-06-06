package com.sankuai.meituan.mapsdk.core.render.model;

import com.meituan.mtmap.rendersdk.SdkExceptionHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public com.sankuai.meituan.mapsdk.core.render.a b;
    public h c;
    public int d;
    public HashMap<String, Object> e;

    public b(com.sankuai.meituan.mapsdk.core.render.a aVar, h hVar, int i) {
        Object[] objArr = {aVar, hVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49496517d2ebca9d9dedbbce485b156c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49496517d2ebca9d9dedbbce485b156c");
            return;
        }
        this.b = aVar;
        this.c = hVar;
        this.d = i;
        this.e = new HashMap<>();
    }

    public static String a(int i) {
        Object[] objArr = {20};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f83a84ee2695a5e565005509c9de4e65", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f83a84ee2695a5e565005509c9de4e65");
        }
        try {
            Random random = new Random();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i2 = 0; i2 < 20; i2++) {
                stringBuffer.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            SdkExceptionHandler.handleException(e);
            return "";
        }
    }

    public final void a(c cVar, LatLng latLng) {
        Object[] objArr = {cVar, latLng};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba26b0a2d2b32c33deff55b399418993", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba26b0a2d2b32c33deff55b399418993");
        } else if (this.b == null || this.c == null || !com.sankuai.meituan.mapsdk.mapcore.utils.h.a(latLng)) {
        } else {
            this.b.setFeatureGeometry(this.c.e, this.d, cVar, latLng);
        }
    }

    public final void a(c cVar, List<LatLng> list) {
        Object[] objArr = {cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e873843ed5cec5e6a9fdb8a9b4613d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e873843ed5cec5e6a9fdb8a9b4613d");
        } else if (this.b == null || this.c == null) {
        } else {
            this.b.setFeatureGeometry(this.c.e, this.d, cVar, list);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13367057fb401895cfccd43654d1391d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13367057fb401895cfccd43654d1391d");
        } else if (this.b == null || this.c == null) {
        } else {
            this.b.addFeatureProperty(this.c.e, this.d, str, z);
            this.e.put(str, Boolean.valueOf(z));
        }
    }

    public final void a(String str, float f) {
        Object[] objArr = {str, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf5296fe342e4b797150f9a44bb56f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf5296fe342e4b797150f9a44bb56f3");
        } else if (this.b == null || this.c == null) {
        } else {
            this.b.addFeatureProperty(this.c.e, this.d, str, f);
            this.e.put(str, Float.valueOf(f));
        }
    }

    public final void a(String str, double[] dArr) {
        Object[] objArr = {str, dArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65aeeb2cbacc1d415c9a06582cb759e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65aeeb2cbacc1d415c9a06582cb759e");
        } else if (this.b == null || this.c == null) {
        } else {
            this.b.addFeatureProperty(this.c.e, this.d, str, dArr);
            this.e.put(str, dArr);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2060c93ffe8a1a49f30ecd71c56bb19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2060c93ffe8a1a49f30ecd71c56bb19");
        } else if (this.b == null || this.c == null) {
        } else {
            this.b.addFeatureProperty(this.c.e, this.d, str, str2);
            this.e.put(str, str2);
        }
    }

    public final void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "613b61a8f251bd576c29d153651a15a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "613b61a8f251bd576c29d153651a15a9");
        } else if (hashMap != null) {
            for (String str : new ArrayList(hashMap.keySet())) {
                Object obj = hashMap.get(str);
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        a(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        a(str, ((Float) obj).floatValue());
                    } else if (obj instanceof String) {
                        a(str, (String) obj);
                    } else if (obj instanceof double[]) {
                        a(str, (double[]) obj);
                    }
                }
            }
        }
    }

    public final Object a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49cddb7166fb65d9c3749bf35c823340", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49cddb7166fb65d9c3749bf35c823340") : this.e.get(str);
    }
}
