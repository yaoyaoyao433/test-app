package com.meituan.android.neohybrid.util.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.neohybrid.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        private static final Gson a = new Gson();
        private static final Gson b = new GsonBuilder().registerTypeAdapter(g.d.a, new FixedObjectMapAdapter()).registerTypeAdapter(JSONObject.class, new JSONObjectTypeAdapter()).create();
        private static final Gson c = new GsonBuilder().registerTypeAdapter(g.d.a, new FixedObjectMapAdapter()).registerTypeAdapter(JSONObject.class, new JSONObjectTypeAdapter()).registerTypeAdapterFactory(GsonCheckFactory.a()).create();
    }

    public static Gson a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f530d01434df976c6545a76e758a5991", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f530d01434df976c6545a76e758a5991") : a.b;
    }

    public static Gson b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ce5d4533b5792aed618c04530f467ae", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ce5d4533b5792aed618c04530f467ae") : a.c;
    }
}
