package com.meituan.android.neohybrid.v2.neo.nsf;

import android.text.TextUtils;
import com.meituan.android.cipstorage.ag;
import com.meituan.android.cipstorage.ai;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.android.neohybrid.util.n;
import com.meituan.android.neohybrid.v2.neo.nsf.c;
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
    private c.InterfaceC0316c j;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "905a96e9f535a4411000b9d232900977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "905a96e9f535a4411000b9d232900977");
        } else {
            a(i, jSONObject2);
        }
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "962f7343eaa0586275f22dbbe6807e52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "962f7343eaa0586275f22dbbe6807e52");
        } else {
            this.d = 0;
        }
    }

    public static b a(String str, Map<String, Object> map, c.b bVar, c.InterfaceC0316c interfaceC0316c, JSONObject jSONObject, boolean z) {
        Object[] objArr = {str, map, bVar, interfaceC0316c, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6d972b0c3f1a6f3fd6d810cd073670f", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6d972b0c3f1a6f3fd6d810cd073670f");
        }
        b bVar2 = new b();
        bVar2.f = str;
        bVar2.g = n.a(str, null);
        bVar2.h = map;
        bVar2.i = bVar;
        bVar2.j = interfaceC0316c;
        bVar2.m = jSONObject;
        bVar2.e = z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "d3c5ccaf89ed77a0fbfc244a5005c025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "d3c5ccaf89ed77a0fbfc244a5005c025");
        } else if (bVar2.d == 0) {
            bVar2.d = 1;
            com.meituan.android.neohybrid.v2.core.a k = bVar2.i instanceof com.meituan.android.neohybrid.v2.core.n ? ((com.meituan.android.neohybrid.v2.core.n) bVar2.i).k() : null;
            if (bVar2.m == null) {
                com.meituan.android.neohybrid.v2.neo.http.b.a(bVar2).a(bVar2.f).a(bVar2.h).a(TbsListener.ErrorCode.NEEDDOWNLOAD_TRUE).a(k).a();
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

    public static b a(String str, c.b bVar, c.InterfaceC0316c interfaceC0316c, q qVar, String str2) {
        Object[] objArr = {str, bVar, interfaceC0316c, qVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4892a0e015d4db4c76d31f8362be7fda", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4892a0e015d4db4c76d31f8362be7fda");
        }
        b bVar2 = new b();
        bVar2.f = str;
        bVar2.i = bVar;
        bVar2.j = interfaceC0316c;
        bVar2.n = qVar;
        bVar2.o = str2;
        bVar2.e = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "c9f489991b1e9b6cc48bee690db9e0a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "c9f489991b1e9b6cc48bee690db9e0a8");
        } else if (bVar2.d == 0) {
            bVar2.d = 1;
            bVar2.n.a(bVar2.o, new ag<JSONObject>() { // from class: com.meituan.android.neohybrid.v2.neo.nsf.b.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ag
                public final /* synthetic */ String serializeAsString(JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr3 = {jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "86301670fd856f8fd6b8ecb48565b4e0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "86301670fd856f8fd6b8ecb48565b4e0");
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
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d0c3cd9ae9729f02bcfeca0e14bbdb84", RobustBitConfig.DEFAULT_VALUE)) {
                        return (JSONObject) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d0c3cd9ae9729f02bcfeca0e14bbdb84");
                    }
                    try {
                        return new JSONObject(str3);
                    } catch (Exception e) {
                        com.meituan.android.neohybrid.neo.report.b.a(e, "NSFHolder_requestByCIPStorage_deserializeFromString");
                        return null;
                    }
                }
            }, new ai<JSONObject>() { // from class: com.meituan.android.neohybrid.v2.neo.nsf.b.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cipstorage.ai
                public final /* synthetic */ void a(boolean z, String str3, u uVar, String str4, JSONObject jSONObject) {
                    JSONObject jSONObject2 = jSONObject;
                    Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str3, uVar, str4, jSONObject2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5b3caed64e39cd76fb65ae0e9a149b18", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5b3caed64e39cd76fb65ae0e9a149b18");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ea49c3501e5a96585fa55c7b50bbfeb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ea49c3501e5a96585fa55c7b50bbfeb")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23399be65e47775a4cc8accac97bb3fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23399be65e47775a4cc8accac97bb3fd");
            return;
        }
        this.d = 2;
        try {
            this.b = jSONObject;
            if (this.i != null && this.i.a(this.f, this.b)) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972f7bf1abacf185e4616f1eaf6d50c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972f7bf1abacf185e4616f1eaf6d50c0");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c58c104a46201b12f1133c141e19258", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c58c104a46201b12f1133c141e19258");
        } else {
            a(i, exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c.a aVar, JSONObject jSONObject) {
        Object[] objArr = {aVar, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0252e49c1a6827b80292a012638737f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0252e49c1a6827b80292a012638737f8");
        } else if (aVar != null) {
            aVar.b(this.f, jSONObject);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39ae7528cb880ab5b3ef45ce1f8d67f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39ae7528cb880ab5b3ef45ce1f8d67f3");
        } else if (aVar != null) {
            if (this.k != 0) {
                i = this.k;
            }
            if (this.l != null) {
                str = this.l;
            }
            aVar.a(i, str);
            this.d = -2;
            this.c = null;
        } else {
            this.k = i;
            this.l = str;
        }
    }
}
