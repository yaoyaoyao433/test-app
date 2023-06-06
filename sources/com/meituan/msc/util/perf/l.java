package com.meituan.msc.util.perf;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public final g b;
    public final boolean c;

    public l(@NonNull g gVar, boolean z) {
        Object[] objArr = {gVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec98f4f252ce24818037a02bf6508f11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec98f4f252ce24818037a02bf6508f11");
            return;
        }
        this.b = gVar;
        this.c = z;
    }

    public final l a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5a695bedff140d736ab4510dcd9886e", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5a695bedff140d736ab4510dcd9886e");
        }
        if (this.c) {
            this.b.a(i);
            return this;
        }
        return this;
    }

    public final l a(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f18f23f73e306d8a335254695f0a6821", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f18f23f73e306d8a335254695f0a6821");
        }
        if (this.c) {
            if (this.b.j == null) {
                this.b.j = new JSONObject();
            }
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (str2.length() > 1000) {
                    obj = str2.substring(0, 1000);
                }
            }
            try {
                this.b.j.put(str, obj);
            } catch (JSONException e) {
                com.meituan.msc.modules.reporter.g.b("TraceEvent", e, "Failed to put arg");
            }
            return this;
        }
        return this;
    }
}
