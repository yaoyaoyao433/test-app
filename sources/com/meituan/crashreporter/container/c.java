package com.meituan.crashreporter.container;

import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.meituan.android.common.metricx.helpers.UserActionsProvider;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private String b;
    private String c;
    private long d;
    private JSONObject e;
    private LinkedHashMap<String, String> f;
    private b g;

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8025cdda75fd97ae3d47322bbf6065", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8025cdda75fd97ae3d47322bbf6065");
            return;
        }
        this.d = 0L;
        this.e = new JSONObject();
        this.f = new LinkedHashMap<>(16);
        this.g = new b();
        this.b = str;
    }

    public final synchronized void a(String str) {
        this.c = str;
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f8fd5ae349c78f121e77c842c8dd9d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f8fd5ae349c78f121e77c842c8dd9d2");
        } else if (this.d != 0) {
        } else {
            this.d = System.currentTimeMillis();
        }
    }

    public final synchronized void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25baa41ded2d775ccb82c0fa274527de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25baa41ded2d775ccb82c0fa274527de");
            return;
        }
        try {
            this.e.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final synchronized void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa52b2e0a474f693515731e7247909d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa52b2e0a474f693515731e7247909d5");
        } else {
            this.f.put(str, str2);
        }
    }

    public final synchronized void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d40a6fa15672e1561bed93b0d70d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d40a6fa15672e1561bed93b0d70d58");
        } else {
            this.f.remove(str);
        }
    }

    public final synchronized void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fa4156c3f4b76a5caa7db4fdc80feff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fa4156c3f4b76a5caa7db4fdc80feff");
            return;
        }
        UserActionsProvider.getInstance().logVmSize();
        this.g.a(str);
    }

    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69137c3dc481a7abb213bc0ef95b5301", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69137c3dc481a7abb213bc0ef95b5301");
            return;
        }
        UserActionsProvider.getInstance().logVmSize();
        this.g.a();
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "640e65b71ec42cfa7f83f23dcebd3f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "640e65b71ec42cfa7f83f23dcebd3f8c");
        } else {
            this.g.b();
        }
    }

    public final synchronized JSONObject d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01f4ab4b8abca749c32917672a9c6e0d", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01f4ab4b8abca749c32917672a9c6e0d");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("container_name", d(this.b));
            jSONObject.put("container_version", d(this.c));
            jSONObject.put(GetAppInfoJsHandler.EXTRA_EXTRAS, d(this.e.toString()));
            jSONObject.put("init_time", d(TimeUtil.formatDateTime(this.d)));
            jSONObject.put(SnifferDBHelper.COLUMN_LOG, "");
            jSONObject.put("page_stack", this.g.c());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, String> entry : this.f.entrySet()) {
                try {
                    jSONArray.put(new JSONObject().put(entry.getKey(), entry.getValue()));
                } catch (Throwable unused) {
                }
            }
            jSONObject.put("bundle_version", d(jSONArray.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    private String d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd697e3b405443e4d0f92da8d9170949", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd697e3b405443e4d0f92da8d9170949") : TextUtils.isEmpty(str) ? "" : str.length() < 1024 ? str : str.substring(str.length() - 1024);
    }
}
