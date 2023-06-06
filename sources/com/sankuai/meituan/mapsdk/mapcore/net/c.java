package com.sankuai.meituan.mapsdk.mapcore.net;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapfoundation.starship.c;
import com.sankuai.meituan.mapfoundation.starship.j;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.meituan.mapsdk.maps.model.MTMapEnv;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static void a(Context context, String str, final b<OutlineConfig> bVar) {
        String str2;
        Object[] objArr = {context, str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e3729cca49d2abfa42a35eaaf31cf99c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e3729cca49d2abfa42a35eaaf31cf99c");
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        if (!TextUtils.isEmpty(str)) {
            arrayMap.put("version", str);
        }
        String a2 = com.sankuai.meituan.mapsdk.mapcore.utils.a.a(context);
        arrayMap.put("key", a2);
        arrayMap.put("userid", com.sankuai.meituan.mapsdk.mapcore.a.c());
        Map<String, Object> a3 = e.a(a2, "", "");
        com.sankuai.meituan.mapfoundation.starship.c a4 = j.a(b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b6357983c683be19004fe2a15d7aa916", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b6357983c683be19004fe2a15d7aa916");
        } else {
            str2 = MapsInitializer.getMTMapEnv() == MTMapEnv.STAGE ? "http://api.map.wmarch.st.sankuai.com/outlineConfig" : "https://api-map.meituan.com/outlineConfig";
        }
        a4.a(str2, a3, arrayMap, new c.a<OutlineConfig>() { // from class: com.sankuai.meituan.mapsdk.mapcore.net.c.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mapfoundation.starship.c.a
            public final /* synthetic */ void a(int i, Map map, OutlineConfig outlineConfig) {
                OutlineConfig outlineConfig2 = outlineConfig;
                Object[] objArr3 = {Integer.valueOf(i), map, outlineConfig2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "32dec62700efe7a5d8d9a385d254e5d6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "32dec62700efe7a5d8d9a385d254e5d6");
                } else {
                    b.this.a(0, null, outlineConfig2);
                }
            }

            @Override // com.sankuai.meituan.mapfoundation.starship.c.a
            public final void a(Exception exc) {
                Object[] objArr3 = {exc};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0db0bc728640b514cd1604f87dbd6d5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0db0bc728640b514cd1604f87dbd6d5");
                } else {
                    b.this.a(exc);
                }
            }
        });
    }

    public static void a(String str, final b<String> bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e885f09d9ac53216c64f132131ffbcd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e885f09d9ac53216c64f132131ffbcd1");
        } else {
            j.a(b).a(str, new HashMap(), new HashMap(), new c.a<String>() { // from class: com.sankuai.meituan.mapsdk.mapcore.net.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mapfoundation.starship.c.a
                public final /* synthetic */ void a(int i, Map map, String str2) {
                    String str3 = str2;
                    Object[] objArr2 = {Integer.valueOf(i), map, str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6d3c652fdc5ab4c58418c22ca6fe2c2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6d3c652fdc5ab4c58418c22ca6fe2c2");
                    } else {
                        b.this.a(0, null, str3);
                    }
                }

                @Override // com.sankuai.meituan.mapfoundation.starship.c.a
                public final void a(Exception exc) {
                    Object[] objArr2 = {exc};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bdc1d89d6f774a0e0ee6e40b9a95ea99", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bdc1d89d6f774a0e0ee6e40b9a95ea99");
                    } else {
                        b.this.a(exc);
                    }
                }
            });
        }
    }
}
