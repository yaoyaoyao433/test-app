package com.sankuai.xm.base.hornconfig;

import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.callback.d;
import com.sankuai.xm.base.entity.b;
import com.sankuai.xm.base.f;
import com.sankuai.xm.base.service.h;
import com.sankuai.xm.base.service.l;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.b;
import com.sankuai.xm.log.c;
import com.sankuai.xm.network.setting.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a implements h {
    public static ChangeQuickRedirect a;
    private static a c;
    public HashMap<String, C1372a> b;

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "cab7443a60c8b374e24f24accf1b3f9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "cab7443a60c8b374e24f24accf1b3f9e");
            return;
        }
        final b bVar = new b(str);
        ((l) m.a(l.class)).b("LISTENER_HORN_CHANGE").a(new b.a<d<String>>() { // from class: com.sankuai.xm.base.hornconfig.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.base.util.b.a
            public final /* synthetic */ boolean a(d<String> dVar) {
                d<String> dVar2 = dVar;
                Object[] objArr2 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a815f609f88cd6bf511db4bead3a5749", 6917529027641081856L)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a815f609f88cd6bf511db4bead3a5749")).booleanValue();
                }
                dVar2.a(bVar);
                return false;
            }
        });
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "646e3e0b97f75f4b5a31f5e6279ae89a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "646e3e0b97f75f4b5a31f5e6279ae89a");
            return;
        }
        this.b = new HashMap<>();
        a(f.m().f());
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "438266a366a8dca8f7abd18d01236c1a", 6917529027641081856L)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "438266a366a8dca8f7abd18d01236c1a");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98c5eeb98e3aed13605cc045d302766a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98c5eeb98e3aed13605cc045d302766a");
        } else {
            b();
        }
    }

    private synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd981a9cb5b0ee15620a936de08bd2e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd981a9cb5b0ee15620a936de08bd2e1");
            return;
        }
        this.b.clear();
        C1372a c1372a = new C1372a("mtdx_sdk_config_ios_android");
        c1372a.a();
        this.b.put("mtdx_sdk_config_ios_android", c1372a);
        C1372a c1372a2 = new C1372a("mtdx_sdk_config_android");
        c1372a2.a();
        this.b.put("mtdx_sdk_config_android", c1372a2);
    }

    public final synchronized void a(long j) {
        int i;
        int i2 = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c2c9f2c64484b1fa409a8bd9694fb4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c2c9f2c64484b1fa409a8bd9694fb4");
            return;
        }
        for (Map.Entry<String, C1372a> entry : this.b.entrySet()) {
            final C1372a value = entry.getValue();
            HashMap hashMap = new HashMap();
            hashMap.put("appid", Short.valueOf(f.m().c()));
            Object[] objArr2 = new Object[i2];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e7f72381c321275a77e7b033ac4de0e7", 6917529027641081856L)) {
                switch (f.m().f()) {
                    case ENV_STAGING:
                        i = 1;
                        break;
                    case ENV_TEST:
                        i = 3;
                        break;
                    default:
                        i = 0;
                        break;
                }
            } else {
                i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e7f72381c321275a77e7b033ac4de0e7")).intValue();
            }
            hashMap.put("env", Integer.valueOf(i));
            hashMap.put("uid", Long.valueOf(j));
            hashMap.put("sv", "4.46.113");
            hashMap.put("svc", com.sankuai.xm.base.util.a.a);
            Object[] objArr3 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect3 = C1372a.a;
            if (PatchProxy.isSupport(objArr3, value, changeQuickRedirect3, false, "cf17356331f8786916f7bf3516dd41a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, value, changeQuickRedirect3, false, "cf17356331f8786916f7bf3516dd41a0");
            } else if (value.d == null) {
                value.d = new HornCallback() { // from class: com.sankuai.xm.base.hornconfig.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.android.common.horn.HornCallback
                    public final void onChanged(boolean z, String str) {
                        String str2;
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "de938f604687e52b5db8a54b5141ada4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "de938f604687e52b5db8a54b5141ada4");
                            return;
                        }
                        C1372a c1372a = C1372a.this;
                        String str3 = z ? str : "";
                        Object[] objArr5 = {str3};
                        ChangeQuickRedirect changeQuickRedirect5 = C1372a.a;
                        if (PatchProxy.isSupport(objArr5, c1372a, changeQuickRedirect5, false, "c3b14001c69a9bd2f2e66577ec67c992", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, c1372a, changeQuickRedirect5, false, "c3b14001c69a9bd2f2e66577ec67c992");
                        } else if (str3 == null || !c1372a.b(str3)) {
                        } else {
                            c1372a.c(str3);
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = C1372a.a;
                            if (PatchProxy.isSupport(objArr6, c1372a, changeQuickRedirect6, false, "162032a4dcf008025106f333a36f6b8e", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr6, c1372a, changeQuickRedirect6, false, "162032a4dcf008025106f333a36f6b8e");
                            } else {
                                synchronized (c1372a) {
                                    str2 = ac.a(c1372a.c) ? "" : c1372a.c;
                                }
                                com.sankuai.xm.base.e.a().edit().putString(c1372a.b(), str2).apply();
                            }
                            a.a(a.this, c1372a.b);
                        }
                    }
                };
                Horn.register(value.b, value.d, hashMap);
            }
            i2 = 0;
        }
    }

    @Override // com.sankuai.xm.base.service.h
    public final void a(d<String> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0bcb01b5ba4303bfc24bccc2407c8d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0bcb01b5ba4303bfc24bccc2407c8d5");
        } else {
            ((l) m.a(l.class)).a("LISTENER_HORN_CHANGE").a((l.a) dVar);
        }
    }

    @Override // com.sankuai.xm.base.service.h
    public final void b(d<String> dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644240ab4523d5d27106ef34e743443d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644240ab4523d5d27106ef34e743443d");
        } else {
            ((l) m.a(l.class)).a("LISTENER_HORN_CHANGE").b(dVar);
        }
    }

    @Override // com.sankuai.xm.base.service.h
    public final synchronized String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1876aa22ac3e902086cbacdc0700ef", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1876aa22ac3e902086cbacdc0700ef");
        }
        for (Map.Entry<String, C1372a> entry : this.b.entrySet()) {
            String a2 = entry.getValue().a(str);
            if (!ac.a(a2)) {
                return a2;
            }
        }
        return "";
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.hornconfig.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public final class C1372a {
        public static ChangeQuickRedirect a;
        String b;
        String c;
        HornCallback d;
        private HashMap<String, String> f;
        private volatile boolean g;

        public C1372a(String str) {
            Object[] objArr = {a.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0390b1e41a8246b187703c7c1951fe35", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0390b1e41a8246b187703c7c1951fe35");
                return;
            }
            this.b = str;
            this.f = new HashMap<>();
            this.g = false;
            this.c = "";
            this.d = null;
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b28a41da381ca1a31cd34039c93dcf0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b28a41da381ca1a31cd34039c93dcf0");
            } else if (this.g) {
            } else {
                c(com.sankuai.xm.base.e.a().getString(b(), ""));
                this.g = true;
                a.a(a.this, this.b);
            }
        }

        public final synchronized String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b15618e61bcc9e0b434bd8c96a69f956", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b15618e61bcc9e0b434bd8c96a69f956");
            }
            String str2 = this.f.get(str);
            return str2 == null ? "" : str2;
        }

        synchronized boolean b(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cefa39a30360cf6b90c30d590a01994", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cefa39a30360cf6b90c30d590a01994")).booleanValue();
            }
            return !ac.a(str, this.c);
        }

        String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ebbd84bd2a6eb9e97f9ef9f2fa7ad6a", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ebbd84bd2a6eb9e97f9ef9f2fa7ad6a");
            }
            return "horn_" + this.b;
        }

        synchronized void c(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78741cf68337fec0ff0ad257359c7f96", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78741cf68337fec0ff0ad257359c7f96");
            } else if (ac.a(str, this.c)) {
            } else {
                try {
                    this.f.clear();
                    if (ac.a(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f.put(next, jSONObject.optString(next));
                    }
                    this.c = str;
                } catch (JSONException e) {
                    c.a("HornFile", e);
                }
            }
        }
    }
}
