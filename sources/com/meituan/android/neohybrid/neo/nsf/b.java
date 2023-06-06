package com.meituan.android.neohybrid.neo.nsf;

import android.text.TextUtils;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ai;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.neohybrid.neo.nsf.c;
import com.meituan.android.neohybrid.util.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements com.meituan.android.neohybrid.neo.http.a<JSONObject> {
    public static ChangeQuickRedirect a;
    JSONObject b;
    c.a c;
    int d;
    boolean e;
    private String f;
    private String g;
    private Map<String, Object> h;
    private c.b i;
    private c.InterfaceC0307c j;
    private int k;
    private String l;
    private JSONObject m;
    private q n;
    private String o;

    @Override // com.meituan.android.neohybrid.neo.http.a
    public final /* synthetic */ void onRequestSucc(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Object[] objArr = {Integer.valueOf(i), jSONObject2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03ed4e2c6a941fbee2e1fd366b361f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03ed4e2c6a941fbee2e1fd366b361f0a");
        } else {
            a(i, jSONObject2);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0edb515c0c183a8ad6486c78efd1a588", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0edb515c0c183a8ad6486c78efd1a588");
        } else {
            this.d = 0;
        }
    }

    public static b a(String str, Map<String, Object> map, c.b bVar, c.InterfaceC0307c interfaceC0307c, JSONObject jSONObject, boolean z) {
        Object[] objArr = {str, map, bVar, interfaceC0307c, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53144013707d62a62e6f07734532e5ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53144013707d62a62e6f07734532e5ff");
        }
        b bVar2 = new b();
        bVar2.f = str;
        bVar2.g = n.a(str, null);
        bVar2.h = map;
        bVar2.i = bVar;
        bVar2.j = interfaceC0307c;
        bVar2.m = jSONObject;
        bVar2.e = z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "4f72c121adc9c89935dd069dba06f763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "4f72c121adc9c89935dd069dba06f763");
        } else if (bVar2.d == 0) {
            bVar2.d = 1;
            com.meituan.android.neohybrid.core.a k = bVar2.i instanceof com.meituan.android.neohybrid.core.n ? ((com.meituan.android.neohybrid.core.n) bVar2.i).k() : null;
            if (bVar2.m == null) {
                com.meituan.android.neohybrid.neo.http.c.a(bVar2).a(bVar2.f).b(bVar2.h).a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE).a(k).a();
            } else {
                try {
                    bVar2.a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, bVar2.m);
                } catch (Exception e) {
                    bVar2.a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, e.getMessage());
                }
            }
        }
        return bVar2;
    }

    public static b a(String str, c.b bVar, c.InterfaceC0307c interfaceC0307c, q qVar, String str2) {
        Object[] objArr = {str, bVar, interfaceC0307c, qVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1db079913b5032d24a8772aa1550f036", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1db079913b5032d24a8772aa1550f036");
        }
        b bVar2 = new b();
        bVar2.f = str;
        bVar2.i = bVar;
        bVar2.j = interfaceC0307c;
        bVar2.n = qVar;
        bVar2.o = str2;
        bVar2.e = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "417708009b0b8032f235044dbf432c5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "417708009b0b8032f235044dbf432c5a");
        } else if (bVar2.d == 0) {
            bVar2.d = 1;
            bVar2.n.a(bVar2.o, new ag<JSONObject>() { // from class: com.meituan.android.neohybrid.neo.nsf.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ag
                public final /* synthetic */ String serializeAsString(JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr3 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0d038722086d2003e801278b8a7ddd7", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0d038722086d2003e801278b8a7ddd7");
                    }
                    if (jSONObject2 != null) {
                        return jSONObject2.toString();
                    }
                    return null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // com.meituan.android.cipstorage.ag
                /* renamed from: a */
                public JSONObject deserializeFromString(String str3) {
                    Object[] objArr3 = {str3};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8accf2643b630a2dca5d73db8b1ec117", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JSONObject) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8accf2643b630a2dca5d73db8b1ec117");
                    }
                    try {
                        return new JSONObject(str3);
                    } catch (Exception e) {
                        com.meituan.android.neohybrid.neo.report.b.a(e, "NSFHolder_requestByCIPStorage_deserializeFromString");
                        return null;
                    }
                }
            }, new ai<JSONObject>() { // from class: com.meituan.android.neohybrid.neo.nsf.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ai
                public final /* synthetic */ void a(boolean z, String str3, u uVar, String str4, JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, uVar, str4, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0a0dff78166c53b098c73cd9ae4616ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0a0dff78166c53b098c73cd9ae4616ac");
                        return;
                    }
                    if (!z || jSONObject2 == null) {
                        b.this.a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, "读取 CIPStorage 失败或结果为空");
                    } else {
                        b.this.a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE, jSONObject2);
                    }
                    b.this.n.b(b.this.o);
                }
            }, u.b);
        }
        return bVar2;
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d440879647e63e5401c3b53106469bcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d440879647e63e5401c3b53106469bcf")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(this.g)) {
            return false;
        }
        return TextUtils.equals(str, this.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, JSONObject jSONObject) {
        Object[] objArr = {Integer.valueOf(i), jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74f804fef2798896bdd0e81b906501a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74f804fef2798896bdd0e81b906501a8");
            return;
        }
        this.d = 2;
        try {
            this.b = jSONObject;
            if (this.i != null && this.i.b(this.f, this.b)) {
                if (this.j != null) {
                    this.j.a(this);
                }
                this.d = -2;
                return;
            }
            a(this.c, this.b);
        } catch (Exception unused) {
            a(this.c, 2000, "未知异常");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14455c0cc5ba4bd428a46ed2cab6210a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14455c0cc5ba4bd428a46ed2cab6210a");
            return;
        }
        this.d = 2;
        try {
            if (this.i != null && this.i.a(this.f, 3000, str)) {
                if (this.j != null) {
                    this.j.a(this);
                }
                this.d = -2;
                return;
            }
            a(this.c, 3000, "网络错误");
        } catch (Exception unused) {
            a(this.c, 2000, "未知异常");
        }
    }

    @Override // com.meituan.android.neohybrid.neo.http.a
    public final void onRequestFail(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b43a2dfab4f0354f82222936e93e58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b43a2dfab4f0354f82222936e93e58");
        } else {
            a(i, exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c.a aVar, JSONObject jSONObject) {
        Object[] objArr = {aVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a61fc9a3f842763e8d30bd32fb7995d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a61fc9a3f842763e8d30bd32fb7995d");
        } else if (aVar != null) {
            aVar.onCallbackSucc(this.f, jSONObject);
            this.d = -2;
            if (this.j != null) {
                this.j.a(this);
            }
            this.c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c.a aVar, int i, String str) {
        Object[] objArr = {aVar, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2b3626df9560319c634eff30cd5c872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2b3626df9560319c634eff30cd5c872");
        } else if (aVar != null) {
            if (this.k != 0) {
                i = this.k;
            }
            if (this.l != null) {
                str = this.l;
            }
            aVar.onCallbackFail(i, str);
            this.d = -2;
            this.c = null;
        } else {
            this.k = i;
            this.l = str;
        }
    }
}
