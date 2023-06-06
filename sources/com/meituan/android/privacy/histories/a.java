package com.meituan.android.privacy.histories;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements com.meituan.android.privacy.interfaces.monitor.a {
    public static ChangeQuickRedirect a;
    private static volatile a e;
    @VisibleForTesting
    public q b;
    public AtomicInteger c;
    public String d;
    private final Context f;

    @VisibleForTesting
    private a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "419ac4777ad4952b876dc8672feabf94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "419ac4777ad4952b876dc8672feabf94");
            return;
        }
        this.c = new AtomicInteger(1);
        this.f = context;
    }

    @NonNull
    public static a a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a746db2d5dab32f2ede5b6ef56f741b", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a746db2d5dab32f2ede5b6ef56f741b");
        }
        if (e == null) {
            synchronized (a.class) {
                e = new a(context);
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b90a26065ec1f579a422c8e3d87bd04e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b90a26065ec1f579a422c8e3d87bd04e");
            return;
        }
        if (this.b == null) {
            this.b = q.a(this.f, "privacy-recorder", 2);
        }
    }

    @Override // com.meituan.android.privacy.interfaces.monitor.a
    @WorkerThread
    public final void a(double d, double d2) {
        String str;
        Object[] objArr = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ffc0ed99d0a24e4789fd10946628a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ffc0ed99d0a24e4789fd10946628a92");
            return;
        }
        Object[] objArr2 = {Double.valueOf(d), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d9d31497ae22d1fd03824faeb70dd585", RobustBitConfig.DEFAULT_VALUE)) {
            str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d9d31497ae22d1fd03824faeb70dd585");
        } else {
            str = a(d2) + CommonConstant.Symbol.COMMA + a(d);
        }
        a();
        this.b.a("location", a(this.b.b("location", (String) null), str));
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c4f13650092a25a7cab6cc1186b15526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c4f13650092a25a7cab6cc1186b15526");
            return;
        }
        int andSet = this.c.getAndSet(0);
        a();
        this.b.a("androidid", this.d);
        this.b.a("androidid_times", andSet);
    }

    @WorkerThread
    @NonNull
    public final JSONArray a(int i) {
        String str;
        String str2;
        int i2 = 1;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a12cd3587455c073d55bb298ff0736e", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONArray) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a12cd3587455c073d55bb298ff0736e");
        }
        a();
        String b = this.b.b("location", (String) null);
        if (b == null) {
            return new JSONArray();
        }
        long currentTimeMillis = System.currentTimeMillis() - ((((i * 24) * 60) * 60) * 1000);
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray(b);
            int i3 = 0;
            while (i3 < jSONArray2.length()) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                String optString = jSONObject2.optString("location");
                Object[] objArr2 = new Object[i2];
                objArr2[0] = optString;
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a0a333f2f1abeff5cba813cd6b2cd5b", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a0a333f2f1abeff5cba813cd6b2cd5b");
                    str2 = "location";
                } else {
                    String[] split = optString.split(CommonConstant.Symbol.COMMA);
                    float parseFloat = Float.parseFloat(split[0]);
                    float parseFloat2 = Float.parseFloat(split[1]);
                    str = ((int) parseFloat) + ".**," + ((int) parseFloat2) + ".**";
                    str2 = "location";
                }
                jSONObject.put(str2, str);
                jSONObject.put("times", jSONObject2.optInt("times"));
                if (jSONObject2.optLong("createMs", 1 + currentTimeMillis) >= currentTimeMillis) {
                    jSONArray.put(jSONObject);
                }
                i3++;
                i2 = 1;
            }
            return jSONArray;
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new JSONArray();
        }
    }

    private String a(@Nullable String str, @NonNull String str2) {
        JSONArray jSONArray;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b026ac40d3fe713c099879b400dca2e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b026ac40d3fe713c099879b400dca2e0");
        }
        if (str == null) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONArray = new JSONArray();
            }
        }
        try {
            JSONObject jSONObject = jSONArray.length() == 0 ? new JSONObject() : jSONArray.getJSONObject(0);
            if (str2.equals(jSONObject.optString("location", ""))) {
                jSONObject.put("times", jSONObject.optInt("times", 0) + 1);
                return jSONArray.toString();
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("location", str2);
            jSONObject2.put("times", 1);
            jSONObject2.put("createMs", System.currentTimeMillis());
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONObject2);
            for (int i = 0; i < jSONArray.length() && i < 20; i++) {
                jSONArray2.put(jSONArray.getJSONObject(i));
            }
            return jSONArray2.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return new JSONArray().toString();
        }
    }

    private String a(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06036459e34b22ec2366043816f16b61", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06036459e34b22ec2366043816f16b61") : String.valueOf(((int) (d * 10.0d)) / 10.0d);
    }
}
