package com.meituan.android.mrn.config.horn;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.mrn.config.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class m {
    public static ChangeQuickRedirect a;
    public static m b = new m();

    public m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "741b642b27cdb0494ee5ea613f473756", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "741b642b27cdb0494ee5ea613f473756");
            return;
        }
        a("msc_enable", Boolean.TYPE, Boolean.FALSE, "总开关");
        a("router_map", new TypeToken<JsonElement>() { // from class: com.meituan.android.mrn.config.horn.m.1
        }.getType(), null, "映射表");
        a("msc_init", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.horn.m.2
        }.getType(), null, "初始化Msc的时机");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e27f1e2c7734483de55ebdda3b1293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e27f1e2c7734483de55ebdda3b1293");
        } else {
            t.a(str, type, obj, "mrn_msc_routing_converter_android", str2);
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2859ddae0dd385539a010a4b666b604", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2859ddae0dd385539a010a4b666b604")).booleanValue() : ((Boolean) t.b.a("msc_enable")).booleanValue();
    }

    public final synchronized JsonObject a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfdae25e17567bae705902742cdc8715", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfdae25e17567bae705902742cdc8715");
        }
        JsonElement jsonElement = (JsonElement) t.b.a("router_map");
        if (jsonElement != null && jsonElement.isJsonObject()) {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.has(str) && asJsonObject.isJsonObject()) {
                return asJsonObject.get(str).getAsJsonObject();
            }
            return null;
        }
        return null;
    }
}
