package com.meituan.msi.lib.map.view.model;

import android.text.TextUtils;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.BitmapDescriptor;
import com.sankuai.meituan.mapsdk.maps.model.DynamicMap;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public MTMap b;
    public MsiContext c;
    volatile DynamicMap d;
    Map<String, BitmapDescriptor> e;
    public String f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(DynamicMap dynamicMap) {
        return dynamicMap != null;
    }

    public g(MTMap mTMap, MsiContext msiContext) {
        Object[] objArr = {mTMap, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1eac2718b2f557ff65976d04d6a1b597", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1eac2718b2f557ff65976d04d6a1b597");
            return;
        }
        this.b = null;
        this.c = null;
        this.e = new HashMap();
        this.f = null;
        this.b = mTMap;
        this.c = msiContext;
    }

    public final synchronized boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56bf10bce3b24e56a275c4ad3c6875cb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56bf10bce3b24e56a275c4ad3c6875cb")).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            this.c.onError(1201, "createDynamicMap styleName is null");
            return false;
        } else if (this.b == null) {
            this.c.onError(1201, "createDynamicMap MTMap is null");
            return false;
        } else {
            c();
            DynamicMap createDynamicMap = this.b.createDynamicMap(str);
            if (a(createDynamicMap)) {
                this.d = createDynamicMap;
                return true;
            }
            return false;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af7e4072795096efbd12be1d5093614f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af7e4072795096efbd12be1d5093614f");
            return;
        }
        DynamicMap dynamicMap = this.d;
        if (a(dynamicMap)) {
            dynamicMap.initDynamicMap();
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28be93b975ebf8accef81db98c171c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28be93b975ebf8accef81db98c171c0");
        } else if (TextUtils.isEmpty(str)) {
            this.c.onError(1201, "initDynamicMap styleJSON is null");
        } else {
            DynamicMap dynamicMap = this.d;
            if (a(dynamicMap)) {
                dynamicMap.initDynamicMap(str);
            }
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b05167003868b68c92b526010c666fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b05167003868b68c92b526010c666fe6");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            this.c.onError(1201, "setDynamicMapGeoJSON featureCollectionJson is null");
        } else {
            DynamicMap dynamicMap = this.d;
            if (a(dynamicMap)) {
                this.f = str;
                dynamicMap.addDynamicMapGeoJSON(str, str2);
            }
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eeee943dfd9e328178556682c668c74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eeee943dfd9e328178556682c668c74");
            return;
        }
        DynamicMap dynamicMap = this.d;
        if (dynamicMap == null) {
            return;
        }
        dynamicMap.removeDynamicMapGeoJSON(str);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "892bdd5818a4f5fb5710d0544f999e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "892bdd5818a4f5fb5710d0544f999e49");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            DynamicMap dynamicMap = this.d;
            if (a(dynamicMap)) {
                dynamicMap.removeDynamicMapImage(str);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08291a53bd3799e93ca18bc2a1efe65d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08291a53bd3799e93ca18bc2a1efe65d");
            return;
        }
        DynamicMap dynamicMap = this.d;
        if (dynamicMap == null) {
            return;
        }
        dynamicMap.removeDynamicMapGeoJSON(this.f);
        this.e.clear();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d92a19f654a7015c533ed2260d666c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d92a19f654a7015c533ed2260d666c3");
            return;
        }
        DynamicMap dynamicMap = this.d;
        if (dynamicMap == null) {
            return;
        }
        this.d = null;
        dynamicMap.removeDynamicMap();
        this.e.clear();
    }
}
