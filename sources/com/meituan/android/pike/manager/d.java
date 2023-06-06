package com.meituan.android.pike.manager;

import android.content.Context;
import com.google.gson.Gson;
import com.meituan.android.pike.bean.PikeLog;
import com.meituan.android.pike.bean.PikeSharedPreference;
import com.meituan.android.pike.bean.proto.PikeProto;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    long b;
    Context c;
    private com.meituan.android.pike.inner.a d;

    public d(Context context, com.meituan.android.pike.inner.a aVar) {
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4914b82aec2e3e807bcb4de6f7a5c29a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4914b82aec2e3e807bcb4de6f7a5c29a");
            return;
        }
        this.b = 0L;
        this.c = context;
        this.d = aVar;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c61011ddce67cf410597606065fcaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c61011ddce67cf410597606065fcaa");
            return;
        }
        Class<?> cls = getClass();
        PikeLog.i(cls, "StampPlugin::notifySystemTimeChanged => time: " + System.currentTimeMillis());
        b();
    }

    public final long a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d50abe820819f628699c6e291321746c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d50abe820819f628699c6e291321746c")).longValue();
        }
        if (this.b == 0) {
            this.b = ((Long) PikeSharedPreference.get(this.c, "LAST_DELTA_TIME", 0L)).longValue();
        }
        return j + this.b;
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be5f78bd7acc2a0500dbb634676cd715", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be5f78bd7acc2a0500dbb634676cd715");
            return;
        }
        Gson gson = new Gson();
        PikeProto pikeProto = new PikeProto();
        pikeProto.setC(8);
        HashMap hashMap = new HashMap();
        hashMap.put("clientTimestamp", Long.valueOf(System.currentTimeMillis()));
        pikeProto.setD(gson.toJson(hashMap));
        try {
            this.d.a("pike", new JSONObject(gson.toJson(pikeProto)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
