package com.meituan.android.recce.shark;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.recce.shark.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        private static final Gson a = new Gson();
        private static final Gson b = new GsonBuilder().registerTypeAdapter(l.a.a, new WasaiFixedObjectMapAdapter()).registerTypeAdapter(JSONObject.class, new WasaiJSONObjectTypeAdapter()).create();
        private static final Gson c = new GsonBuilder().registerTypeAdapter(l.a.a, new WasaiFixedObjectMapAdapter()).registerTypeAdapter(JSONObject.class, new WasaiJSONObjectTypeAdapter()).create();
    }

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cdb4a9155c4b3b6cc1adf15d523e0d93", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cdb4a9155c4b3b6cc1adf15d523e0d93") : a.b;
    }
}
