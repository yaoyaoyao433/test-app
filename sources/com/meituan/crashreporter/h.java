package com.meituan.crashreporter;

import android.content.Context;
import android.os.Build;
import com.meituan.android.common.metricx.helpers.ContextProvider;
import com.meituan.android.common.metricx.utils.NetWorkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;
    d b;
    WeakReference<Context> c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    String i;
    private Map<String, Object> j;
    private final ArrayList<com.meituan.crashreporter.a> k;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a<T> {
        T a();
    }

    public h(Context context, d dVar) {
        Object[] objArr = {context, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9511fe567f75866ec6706b133657ab3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9511fe567f75866ec6706b133657ab3");
            return;
        }
        this.j = new HashMap();
        this.k = new ArrayList<>();
        this.c = new WeakReference<>(context);
        this.b = dVar;
        this.d = "Android";
        this.e = Build.VERSION.RELEASE;
        this.f = "4.7.24.2-waimai";
        this.g = Build.MANUFACTURER;
        this.h = Build.MODEL;
    }

    public final Context a() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc35b68895fbbb3d9f4b09e0b6856625", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc35b68895fbbb3d9f4b09e0b6856625") : (this.c == null || (context = this.c.get()) == null) ? ContextProvider.getInstance().getContext() : context;
    }

    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "504fd02574641b9f7b4a46de061dbbb0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "504fd02574641b9f7b4a46de061dbbb0") : this.b != null ? "" : "";
    }

    public final String c() {
        Context context;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c078d42123d8c1f6a8e40c87e3ee116", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c078d42123d8c1f6a8e40c87e3ee116") : (this.c == null || (context = this.c.get()) == null) ? "unknown" : NetWorkUtils.getNetWorkTypeForCrashAndSniffer(context);
    }

    public final JSONObject d() {
        JSONObject jSONObject;
        String e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d5d22ec320d6aad7547922b9c7fe656", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d5d22ec320d6aad7547922b9c7fe656");
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc78cb03c020ec6a77748204070a31ad", RobustBitConfig.DEFAULT_VALUE)) {
                e = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc78cb03c020ec6a77748204070a31ad");
            } else {
                e = this.b != null ? this.b.e() : "";
            }
            jSONObject = new JSONObject(e);
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        for (Map.Entry<String, Object> entry : this.j.entrySet()) {
            try {
                if (entry.getValue() instanceof a) {
                    jSONObject.put(entry.getKey(), ((a) entry.getValue()).a());
                } else {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (Throwable unused2) {
            }
        }
        return jSONObject;
    }

    public final JSONObject a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6e50e9473f1534389c93cfe0eba81b", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6e50e9473f1534389c93cfe0eba81b");
        }
        JSONObject jSONObject = new JSONObject();
        synchronized (this.k) {
            Iterator<com.meituan.crashreporter.a> it = this.k.iterator();
            while (it.hasNext()) {
                try {
                    for (Map.Entry<String, Object> entry : it.next().getCrashInfo(str, z).entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public final void a(com.meituan.crashreporter.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59717e6a6ae6e4e33932e4f0b534b77d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59717e6a6ae6e4e33932e4f0b534b77d");
            return;
        }
        synchronized (this.k) {
            this.k.add(aVar);
        }
    }
}
