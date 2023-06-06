package com.sankuai.xm.integration.knb.publish;

import android.content.Intent;
import android.text.TextUtils;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.JsHost;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.integration.knb.publish.k;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class c {
    public static ChangeQuickRedirect b;
    private String a;
    String c;
    short d;
    JsHost e;
    public String f;
    volatile com.sankuai.xm.im.bridge.base.bridge_impl.proto_result.a g;

    public abstract void a();

    public abstract void b();

    public c(JsHost jsHost, String str, short s, String str2) {
        Object[] objArr = {jsHost, str, Short.valueOf(s), str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b03991e56afb46ad09ae3158f85deb46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b03991e56afb46ad09ae3158f85deb46");
            return;
        }
        this.c = str;
        this.d = s;
        this.e = jsHost;
        this.a = str2;
        this.f = UUID.randomUUID().toString();
        this.g = new com.sankuai.xm.integration.knb.result.a(this);
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc47a60b50d41c958d39d0073946ecdd", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc47a60b50d41c958d39d0073946ecdd")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.e == cVar.e && this.d == cVar.d && TextUtils.equals(this.c, cVar.c) && TextUtils.equals(this.f, cVar.f);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "effc104e31b2c9e4f98776b0ce1033f8", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "effc104e31b2c9e4f98776b0ce1033f8")).intValue() : Arrays.hashCode(Arrays.asList(this.c, Short.valueOf(this.d), this.e, this.f).toArray(new Object[4]));
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec8542185d4a2e7b308c43bbe0af54e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec8542185d4a2e7b308c43bbe0af54e");
        }
        return "BasePublisher: mEvent:" + this.c + " mChannel:" + ((int) this.d) + " mJsHost:" + this.e + " mID:" + this.f;
    }

    public final void c(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d94373542cff552247cb2184b6257c0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d94373542cff552247cb2184b6257c0");
        } else if (TextUtils.equals(this.a, "mtflutter")) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85152f529db9e25c680dbab21b6eb8e5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85152f529db9e25c680dbab21b6eb8e5");
                return;
            }
            final JsHost jsHost = this.e;
            if (jsHost == null) {
                com.sankuai.xm.im.utils.a.c("cannot publish as the JsHost is null.", new Object[0]);
            } else if (!ActivityUtils.a(jsHost.getActivity())) {
                com.sankuai.xm.im.utils.a.c("jsHost.getActivity is destroy", new Object[0]);
                k.a.a.a(jsHost);
            } else {
                jsHost.post(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.integration.knb.publish.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e226f235e444fd968fb1cdbb30a713f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e226f235e444fd968fb1cdbb30a713f");
                            return;
                        }
                        try {
                            if (ActivityUtils.a(jsHost.getActivity())) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("action", c.this.c);
                                jSONObject.put("idIMEvent", c.this.f);
                                jSONObject.put(GearsLocator.DETAIL, new JSONObject(str));
                                Intent intent = new Intent(c.this.c);
                                intent.setPackage(jsHost.getActivity().getApplicationContext().getPackageName());
                                intent.putExtra("data", jSONObject.toString());
                                com.sankuai.meituan.takeoutnew.util.aop.b.a(jsHost.getActivity().getApplicationContext(), intent);
                            }
                        } catch (Throwable th) {
                            com.sankuai.xm.im.utils.a.a(th);
                        }
                    }
                }));
            }
        } else if (TextUtils.equals(this.a, "web")) {
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ab4475a9abe2d102a6dafd5a575adb20", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ab4475a9abe2d102a6dafd5a575adb20");
                return;
            }
            final JsHost jsHost2 = this.e;
            if (jsHost2 == null) {
                com.sankuai.xm.im.utils.a.c("cannot publish as the JsHost is null.", new Object[0]);
            } else if (!ActivityUtils.a(jsHost2.getActivity())) {
                com.sankuai.xm.im.utils.a.c("jsHost.getActivity is destroy", new Object[0]);
                k.a.a.a(jsHost2);
            } else {
                jsHost2.post(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.integration.knb.publish.c.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8ff2f2f4eaff583234ef1705b64faa7f", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8ff2f2f4eaff583234ef1705b64faa7f");
                            return;
                        }
                        try {
                            if (ActivityUtils.a(jsHost2.getActivity())) {
                                jsHost2.loadJs(String.format("javascript:window.dispatchEvent && window.dispatchEvent(new window.CustomEvent(\"%s\", {\"detail\": %s, \"idIMEvent\": %s}))", c.this.c, str, c.this.f));
                            }
                        } catch (Throwable th) {
                            com.sankuai.xm.im.utils.a.a(th);
                        }
                    }
                }));
            }
        } else {
            Object[] objArr4 = {str};
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "74d5c99221f22ac61039a2c5cfe7bd5e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "74d5c99221f22ac61039a2c5cfe7bd5e");
                return;
            }
            final JsHost jsHost3 = this.e;
            if (jsHost3 == null) {
                com.sankuai.xm.im.utils.a.c("cannot publish as the JsHost is null.", new Object[0]);
            } else if (!ActivityUtils.a(jsHost3.getActivity())) {
                com.sankuai.xm.im.utils.a.c("jsHost.getActivity is destroy", new Object[0]);
                k.a.a.a(jsHost3);
            } else {
                jsHost3.post(com.sankuai.xm.base.trace.j.a(new Runnable() { // from class: com.sankuai.xm.integration.knb.publish.c.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3d84f619e62d9b8ae0be832ab9ad892b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3d84f619e62d9b8ae0be832ab9ad892b");
                            return;
                        }
                        try {
                            if (ActivityUtils.a(jsHost3.getActivity())) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("action", c.this.c);
                                jSONObject.put("idIMEvent", c.this.f);
                                jSONObject.put(GearsLocator.DETAIL, new JSONObject(str));
                                JsHandlerFactory.publish(jSONObject);
                            }
                        } catch (Throwable th) {
                            com.sankuai.xm.im.utils.a.a(th);
                        }
                    }
                }));
            }
        }
    }
}
