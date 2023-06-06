package com.sankuai.meituan.tte;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.tte.x;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l {
    public static ChangeQuickRedirect a;
    public x.d b;
    public x.c c;
    public byte[] d;
    public byte[] e;
    public long f;
    public transient boolean g;
    public transient boolean h;
    public final AtomicBoolean i;
    public volatile transient boolean j;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63bcfe6189a9a428ad693ba50be8a087", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63bcfe6189a9a428ad693ba50be8a087");
        } else {
            this.i = new AtomicBoolean();
        }
    }

    public l(x.d dVar, x.c cVar, byte[] bArr, byte[] bArr2) {
        Object[] objArr = {dVar, cVar, bArr, bArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4f387fed6b0d22d68d32f5a4fb0c446", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4f387fed6b0d22d68d32f5a4fb0c446");
            return;
        }
        this.i = new AtomicBoolean();
        this.b = dVar;
        this.c = cVar;
        this.d = bArr;
        this.e = bArr2;
    }

    public l(JSONObject jSONObject) throws JSONException, c {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8baa675f54c8e3acb3863f6ceb77668", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8baa675f54c8e3acb3863f6ceb77668");
            return;
        }
        this.i = new AtomicBoolean();
        this.b = x.d.a(jSONObject.optInt("env", x.d.PROD.ordinal()));
        this.c = x.c.a(jSONObject.optInt("cipherType", x.c.SM4_GCM.d));
        this.d = y.a(jSONObject.getString("dk"));
        this.e = y.a(jSONObject.getString("edk"));
        this.f = jSONObject.optLong("retrievedAt", 0L);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3968f490c11774f6e451a4381c07ee96", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3968f490c11774f6e451a4381c07ee96");
        }
        return CommonConstant.Symbol.BIG_BRACKET_LEFT + this.b + ", " + this.c + ", " + y.a(this.e) + ", " + new Date(this.f) + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}
