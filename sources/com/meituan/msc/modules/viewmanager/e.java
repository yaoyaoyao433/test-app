package com.meituan.msc.modules.viewmanager;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.Callback;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.scroll.nested.a;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "NestedScrollManager")
/* loaded from: classes3.dex */
public final class e extends k {
    public static ChangeQuickRedirect a;
    private com.meituan.msc.mmpviews.scroll.nested.a b;

    public e(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f129992ae8a58ed891aacd8ecb3d3fdc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f129992ae8a58ed891aacd8ecb3d3fdc");
        } else {
            this.b = new com.meituan.msc.mmpviews.scroll.nested.a(reactApplicationContext);
        }
    }

    @MSCMethod
    public final void bind(JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8058f8c06b60460be254617281a0a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8058f8c06b60460be254617281a0a9");
            return;
        }
        com.meituan.msc.mmpviews.scroll.nested.a aVar = this.b;
        MSCReadableMap mSCReadableMap = new MSCReadableMap(jSONObject);
        Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "626505f0f7442aa1319a37f876254577", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "626505f0f7442aa1319a37f876254577");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {mSCReadableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.scroll.nested.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6c022f1adadb48bae11d9f68056a478d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6c022f1adadb48bae11d9f68056a478d");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        try {
            if (aVar.b != null) {
                a.C0450a c0450a = new a.C0450a(mSCReadableMap.hasKey("mainScrollViewTag") ? mSCReadableMap.getInt("mainScrollViewTag") : -1, mSCReadableMap.hasKey("subScrollViewTag") ? mSCReadableMap.getInt("subScrollViewTag") : -1, mSCReadableMap.hasKey(DMKeys.KEY_SCROLL_DIRECTION) ? mSCReadableMap.getInt(DMKeys.KEY_SCROLL_DIRECTION) : -1, mSCReadableMap.hasKey("maxOffset") ? (int) com.meituan.msc.mmpviews.util.b.b(mSCReadableMap.getDynamic("maxOffset")) : -1);
                aVar.c.put(c0450a.a(), c0450a);
                aVar.a(c0450a, true);
                createMap.putString("token", c0450a.a());
            } else {
                createMap.putString("errMsg", "params is null");
            }
        } catch (Throwable th) {
            createMap.putString("errMsg", th.getMessage());
        }
        callback.invoke(createMap);
    }

    @MSCMethod
    public final void unbind(JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adf640e37eef5b5346f2c4eb0e3f197b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adf640e37eef5b5346f2c4eb0e3f197b");
            return;
        }
        com.meituan.msc.mmpviews.scroll.nested.a aVar = this.b;
        MSCReadableMap mSCReadableMap = new MSCReadableMap(jSONObject);
        Callback callback = new Callback() { // from class: com.meituan.msc.modules.viewmanager.e.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.jse.bridge.Callback
            public final void invoke(Object... objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "5de63d80c17d248d89f7b269a5f53343", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "5de63d80c17d248d89f7b269a5f53343");
                } else {
                    bVar.a(objArr2);
                }
            }
        };
        Object[] objArr2 = {mSCReadableMap, callback};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.mmpviews.scroll.nested.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "22fde96a1c2cb67dce86942490fdffdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "22fde96a1c2cb67dce86942490fdffdb");
        } else if (aVar.c == null || aVar.c.size() == 0 || aVar.b == null) {
        } else {
            String string = mSCReadableMap.getString("token");
            a.C0450a c0450a = aVar.c.get(string);
            if (c0450a != null) {
                aVar.a(c0450a, false);
            }
            aVar.c.remove(string);
            callback.invoke(new Object[0]);
        }
    }
}
