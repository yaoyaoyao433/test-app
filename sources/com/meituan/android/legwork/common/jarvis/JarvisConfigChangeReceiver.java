package com.meituan.android.legwork.common.jarvis;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JarvisConfigChangeReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect a;
    private a b;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public JarvisConfigChangeReceiver(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aa5e6fe8a313626e72ec06d91cbc742", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aa5e6fe8a313626e72ec06d91cbc742");
        } else {
            this.b = aVar;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21453fd1a37d8965f2f249e884945ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21453fd1a37d8965f2f249e884945ea");
        } else if (this.b != null) {
            this.b.a();
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93946146bce6e8be804f8c7a39e97a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93946146bce6e8be804f8c7a39e97a6f");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "paotui_c:degrade_info_changed");
            jSONObject.put("code", 0);
            JsHandlerFactory.publish(jSONObject);
            Intent intent = new Intent("paotui_c:degrade_info_changed");
            intent.setPackage(com.meituan.android.legwork.a.a().getPackageName());
            com.sankuai.meituan.takeoutnew.util.aop.b.a(com.meituan.android.legwork.a.a(), intent);
        } catch (Exception e) {
            x.e("JarvisConfigChangeReceiver", "sendJarvisConfigChangeBroadcast exception " + e);
            x.a(e);
        }
    }
}
