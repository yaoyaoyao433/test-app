package com.dianping.networklog;

import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dianping.com.nvlinker.NVLinker;
import dianping.com.nvlinker.stub.IHorn;
import dianping.com.nvlinker.stub.IHornCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class q extends a {
    public static ChangeQuickRedirect a;
    private static final AtomicBoolean b = new AtomicBoolean();
    private static final IHornCallback c = new IHornCallback() { // from class: com.dianping.networklog.q.1
        public static ChangeQuickRedirect a;

        @Override // dianping.com.nvlinker.stub.IHornCallback
        public final void onChanged(boolean z, String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d679b6a6cb6b8c1385c5eaa4a797819d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d679b6a6cb6b8c1385c5eaa4a797819d");
            } else if (c.e) {
                new StringBuilder("onChanged: ").append(str);
            }
        }
    };

    @Override // com.dianping.networklog.a, com.dianping.networklog.b
    public final JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d12798a678ae6a06e6d2849d592f486c", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d12798a678ae6a06e6d2849d592f486c");
        }
        try {
            IHorn horn = NVLinker.getHorn();
            if (horn != null) {
                if (b.compareAndSet(false, true)) {
                    horn.register("logan", c);
                }
                String accessCache = horn.accessCache("logan");
                if (!TextUtils.isEmpty(accessCache)) {
                    JSONObject jSONObject = new JSONObject(accessCache);
                    if (jSONObject.optBoolean("config_enable", true)) {
                        return jSONObject;
                    }
                }
            }
        } catch (Exception e) {
            if (c.e) {
                Log.w("HornGrayController", "getConfig", e);
            }
        }
        return super.a();
    }
}
