package com.dianping.networklog;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ag extends k {
    public static ChangeQuickRedirect g;

    public ag(af afVar) {
        super(afVar);
        Object[] objArr = {afVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3e33b7f260bc7dc39004fd7d0e7eba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3e33b7f260bc7dc39004fd7d0e7eba");
        }
    }

    private int a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c941b0f9e8f90581f5eed8fb2222f6e0", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c941b0f9e8f90581f5eed8fb2222f6e0")).intValue();
        }
        int i = -1;
        if (bArr != null) {
            String str = new String(bArr);
            if (c.e) {
                new StringBuilder("[doPostRequest] response: ").append(str);
            }
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optBoolean("success", false)) {
                    i = 0;
                } else {
                    int optInt = jSONObject.optInt("code", -1);
                    if (optInt > 0) {
                        optInt += 1000;
                    }
                    i = optInt;
                }
                String str2 = null;
                try {
                    String optString = jSONObject.optString("data");
                    if (!TextUtils.isEmpty(optString) && !optString.equalsIgnoreCase(StringUtil.NULL)) {
                        str2 = new JSONObject(optString).optString("taskid");
                    }
                } catch (JSONException unused) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c.a(this.b.k, str2);
                }
            }
        }
        return i;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a02f80b7478be8a10d7f7e0d3d1436d", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a02f80b7478be8a10d7f7e0d3d1436d")).booleanValue();
        }
        int i = -1;
        try {
            i = a(this.c.b(this.b));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean z = i == 0;
        if (!z) {
            c.a(this.b.i, (String) null);
        }
        com.dianping.networklog.a.d.a().a((int) this.b.e, i);
        return z;
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c7e624afddbb618ebac1d9e5400cf67", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c7e624afddbb618ebac1d9e5400cf67")).booleanValue();
        }
        int i = -1;
        try {
            i = a(this.c.c(this.b));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        boolean z = i == 0;
        if (!z) {
            c.a(this.b.i, (String) null);
        }
        com.dianping.networklog.a.d.a().b((int) this.b.e, i);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.networklog.ag.run():void");
    }
}
