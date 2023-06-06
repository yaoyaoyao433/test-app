package com.dianping.networklog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    public static ChangeQuickRedirect a;
    ConcurrentHashMap<String, String> b;
    private ConcurrentHashMap<String, String> c;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5f615d01bf7eac37ff6ae211612c30", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5f615d01bf7eac37ff6ae211612c30");
        }
        try {
            return new JSONObject(this.c).toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
