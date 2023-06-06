package com.meituan.android.legwork.common.location;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.legwork.common.location.BaseLocationManager;
import com.meituan.android.legwork.utils.q;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BaseLocationManager.a {
    public static ChangeQuickRedirect a;
    private final BaseLocationManager b;
    private final String c;
    private final String d;

    public a(BaseLocationManager baseLocationManager, String str, String str2) {
        this.b = baseLocationManager;
        this.c = str;
        this.d = str2;
    }

    @Override // com.meituan.android.legwork.common.location.BaseLocationManager.a
    public final void a(MtLocation mtLocation) {
        String str;
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b68f4f7e2fd8a4a2243dc0a5cf8bb19e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b68f4f7e2fd8a4a2243dc0a5cf8bb19e");
            return;
        }
        BaseLocationManager baseLocationManager = this.b;
        String str2 = this.c;
        String str3 = this.d;
        Object[] objArr2 = {baseLocationManager, str2, str3, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = BaseLocationManager.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04caac8d805f199c0de1131fa0694e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04caac8d805f199c0de1131fa0694e7b");
            return;
        }
        x.c("BaseLocationManager.requestActualLocation", "最终定位结束:" + str2);
        BaseLocationManager.b remove = baseLocationManager.f.remove(str3);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = BaseLocationManager.b.a;
        if (PatchProxy.isSupport(objArr3, remove, changeQuickRedirect3, false, "a5b825c24f1727940bbbd50838e90a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, remove, changeQuickRedirect3, false, "a5b825c24f1727940bbbd50838e90a31");
        } else {
            Object[] objArr4 = new Object[1];
            StringBuilder sb = new StringBuilder("LocationMap stopLoading:");
            sb.append(remove.b != null);
            sb.append(StringUtil.SPACE);
            sb.append(remove.c != null);
            objArr4[0] = sb.toString();
            x.c("BaseLocationManager.requestActualLocation", objArr4);
            if (remove.b != null && remove.c != null) {
                remove.b.unregisterListener(remove.c);
                remove.b.stopLoading();
                remove.c = null;
                remove.b = null;
            }
        }
        HashMap hashMap = new HashMap(4);
        hashMap.put(ShieldMonitorKey.TAG_BUSINESS, str2);
        if (mtLocation != null && mtLocation.getStatusCode() == 0) {
            q.a("legwork_mt_locate_success", hashMap);
            return;
        }
        if (mtLocation == null) {
            str = "locationNull";
        } else {
            str = "statusCode:" + mtLocation.getStatusCode();
        }
        hashMap.put("reason", str);
        q.a("legwork_mt_locate_null", hashMap);
    }
}
