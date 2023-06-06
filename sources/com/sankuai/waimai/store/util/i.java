package com.sankuai.waimai.store.util;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.monitor.monitor.GsonMonitor;
import java.lang.reflect.Type;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class i {
    public static ChangeQuickRedirect a;
    private static volatile Gson b;

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffa60f6f7ecb16e790fbec031fafea43", RobustBitConfig.DEFAULT_VALUE)) {
            return (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffa60f6f7ecb16e790fbec031fafea43");
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = b().create();
                }
            }
        }
        return b;
    }

    public static GsonBuilder b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9a9b7f9f879bd22f7359fae74c0dfd9", RobustBitConfig.DEFAULT_VALUE) ? (GsonBuilder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9a9b7f9f879bd22f7359fae74c0dfd9") : new GsonBuilder().serializeSpecialFloatingPointValues().disableHtmlEscaping().enableComplexMapKeySerialization();
    }

    @Nullable
    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17fe023a882c29a22261b66d2c9631f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17fe023a882c29a22261b66d2c9631f7");
        }
        if (obj == null) {
            return null;
        }
        try {
            return a().toJson(obj);
        } catch (Exception e) {
            String str = "obj=" + obj.toString() + " msg=" + e.getMessage();
            if (com.sankuai.waimai.store.config.k.b()) {
                com.sankuai.waimai.store.base.log.a.a(e);
                com.sankuai.waimai.store.util.monitor.c.a(GsonMonitor.ParseFailure, str, RemoteMessageConst.TO);
                return "";
            }
            com.sankuai.shangou.stone.util.log.a.a(e);
            throw new RuntimeException(str);
        }
    }

    @Nullable
    public static <T> T a(String str, Type type) {
        Object[] objArr = {str, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b42ea38093b36080c672fde46d248160", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b42ea38093b36080c672fde46d248160");
        }
        try {
            return (T) a().fromJson(str, type);
        } catch (Exception e) {
            String str2 = "json=" + str + " typeOfT=" + type + " msg=" + e.getMessage();
            if (com.sankuai.waimai.store.config.k.b()) {
                com.sankuai.waimai.store.base.log.a.a(e);
                com.sankuai.waimai.store.util.monitor.c.a(GsonMonitor.ParseFailure, str2, "string - from");
                return null;
            }
            com.sankuai.shangou.stone.util.log.a.a(e);
            throw new RuntimeException(str2);
        }
    }

    @Nullable
    public static <T> T a(JsonElement jsonElement, Type type) {
        Object[] objArr = {jsonElement, type};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bf49ff74ba4a32f65d9582207d0dc25", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bf49ff74ba4a32f65d9582207d0dc25");
        }
        try {
            return (T) a().fromJson(jsonElement, type);
        } catch (Exception e) {
            String str = "json=" + jsonElement + " typeOfT=" + type + " msg=" + e.getMessage();
            if (com.sankuai.waimai.store.config.k.b()) {
                com.sankuai.waimai.store.base.log.a.a(e);
                com.sankuai.waimai.store.util.monitor.c.a(GsonMonitor.ParseFailure, str, "jsonElement - from");
                return null;
            }
            com.sankuai.shangou.stone.util.log.a.a(e);
            throw new RuntimeException(str);
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bff198daddc1bcd3e13fd5e81db4eb7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bff198daddc1bcd3e13fd5e81db4eb7")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
