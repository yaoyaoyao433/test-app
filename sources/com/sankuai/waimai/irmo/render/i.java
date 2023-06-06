package com.sankuai.waimai.irmo.render;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.meituan.android.common.aidata.mrn.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;

    public final void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60138ba43fc4894395d38c18ce240ec7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60138ba43fc4894395d38c18ce240ec7");
        } else {
            com.sankuai.waimai.irmo.mach.c.a(z, this.b, this.c, this.d, i);
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8f4344d939afb53e6ac4ff677c43ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8f4344d939afb53e6ac4ff677c43ac0");
        } else {
            com.sankuai.waimai.irmo.mach.c.a(str, i, this.b, this.c, this.d);
        }
    }

    public final void a(boolean z, int i, int i2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77355811df45e3ec94d2a3d0aabddbaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77355811df45e3ec94d2a3d0aabddbaa");
            return;
        }
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.mach.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "dabcccffa4929292fa8a4dbc28565b45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "dabcccffa4929292fa8a4dbc28565b45");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("InfiniteEnginePlay", Integer.valueOf(z ? 1 : 0));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("moduleID", str);
        hashMap2.put("effectType", String.valueOf(i));
        hashMap2.put(Constants.JSBundleConstants.KEY_BUNDLE_ID, str2);
        hashMap2.put("url", str3);
        hashMap2.put("errorType", String.valueOf(i2));
        com.sankuai.waimai.irmo.mach.c.a(hashMap, hashMap2);
    }

    public final void a(com.sankuai.waimai.irmo.render.monitor.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a7543f71de9726ce4cdc67661c90e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a7543f71de9726ce4cdc67661c90e4");
        } else if (aVar == null) {
        } else {
            try {
                JsonObject jsonObject = TextUtils.isEmpty(aVar.f) ? null : (JsonObject) com.sankuai.waimai.mach.utils.b.a().fromJson(aVar.f, (Class<Object>) JsonObject.class);
                if (jsonObject == null) {
                    jsonObject = new JsonObject();
                }
                jsonObject.addProperty("moduleID", this.b);
                jsonObject.addProperty(Constants.JSBundleConstants.KEY_BUNDLE_ID, this.c);
                jsonObject.addProperty("url", this.d);
                aVar.f = jsonObject.toString();
            } catch (Exception unused) {
            }
            if (z) {
                com.sankuai.waimai.irmo.render.monitor.b.b(aVar);
            } else {
                com.sankuai.waimai.irmo.render.monitor.b.a(aVar);
            }
        }
    }
}
