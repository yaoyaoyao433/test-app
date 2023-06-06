package com.meituan.msc.util.perf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.Message;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect d;
    public final String e;
    public final long f;
    public final String g;
    public final JSONObject h;

    public e(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "566b9800446c0bd44728f653037b23bd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "566b9800446c0bd44728f653037b23bd");
            return;
        }
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = null;
    }

    public e(String str, long j, String str2, JSONObject jSONObject) {
        Object[] objArr = {str, new Long(j), str2, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "121c62dfc676bb6066c7641c56a21b3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "121c62dfc676bb6066c7641c56a21b3c");
            return;
        }
        this.e = str;
        this.f = j;
        this.g = str2;
        this.h = jSONObject;
    }

    public Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47cb910f9fda4f152dcba0fb64633870", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47cb910f9fda4f152dcba0fb64633870");
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (this.g != null) {
            concurrentHashMap.put(Message.SID, this.g);
        }
        if (this.h != null) {
            concurrentHashMap.put("extra", this.h.toString());
        }
        return concurrentHashMap;
    }
}
