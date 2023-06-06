package com.dianping.networklog;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.dianping.networklog.ae;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class ai {
    public static ChangeQuickRedirect a;
    private final ConcurrentHashMap<String, ae> b;
    private SharedPreferences c;
    private volatile boolean d;
    private AtomicBoolean e;

    /* loaded from: classes.dex */
    public static class a {
        public static final ai a = new ai();
    }

    @VisibleForTesting
    public ai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1074696e2e3f31fa1c96d4c60ad47a1a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1074696e2e3f31fa1c96d4c60ad47a1a");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.e = new AtomicBoolean(false);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1051c1dd99b1af043064228840940bce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1051c1dd99b1af043064228840940bce");
        } else if (this.b.isEmpty()) {
            if (this.c != null) {
                this.c.edit().remove("SHAREPREFERENCES_FILE_KEY_1").apply();
            }
        } else {
            Enumeration<ae> elements = this.b.elements();
            JSONArray jSONArray = new JSONArray();
            while (elements.hasMoreElements()) {
                JSONObject a2 = ae.a(elements.nextElement());
                if (a2 != null) {
                    jSONArray.put(a2);
                }
            }
            if (this.c != null) {
                this.c.edit().putString("SHAREPREFERENCES_FILE_KEY_1", jSONArray.toString()).apply();
            }
        }
    }

    public final List<ae> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4615d7e2f5e991d1a907d0465be2d8f3", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4615d7e2f5e991d1a907d0465be2d8f3");
        }
        LinkedList linkedList = new LinkedList();
        if (this.d && this.e.compareAndSet(false, true)) {
            Enumeration<ae> elements = this.b.elements();
            while (elements.hasMoreElements()) {
                ae nextElement = elements.nextElement();
                if (nextElement.k == ae.a.NONE || nextElement.k == ae.a.UPLOAD_FAIL) {
                    nextElement.k = ae.a.UPLOAD_ING;
                    nextElement.h++;
                    linkedList.add(nextElement);
                }
            }
            if (!linkedList.isEmpty()) {
                b();
            }
            this.e.set(false);
        }
        return linkedList;
    }

    public final void a(ae aeVar) {
        Object[] objArr = {aeVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9c40e3199e383e99cb1752084350e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9c40e3199e383e99cb1752084350e8");
            return;
        }
        if (aeVar.k == ae.a.NOFile || aeVar.k == ae.a.UPLOAD_SUCCESS) {
            this.b.remove(aeVar.c);
        } else if (this.b.containsKey(aeVar.c)) {
            ae aeVar2 = this.b.get(aeVar.c);
            aeVar2.k = aeVar.k;
            if (aeVar2.k == ae.a.UPLOAD_FAIL && aeVar2.h >= 4) {
                this.b.remove(aeVar2.c);
            }
        } else {
            this.b.put(aeVar.c, aeVar);
        }
        if (this.d) {
            b();
        }
    }

    public final synchronized void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3994bc4f931637a48cc78d3421e24e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3994bc4f931637a48cc78d3421e24e9");
            return;
        }
        if (!this.d) {
            this.c = aj.a(context, "SHAREPREFERENCES_FILE_NAME_1", 0);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f8ce63972d324ad9e288697e15e97ba6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f8ce63972d324ad9e288697e15e97ba6");
            } else {
                String string = this.c.getString("SHAREPREFERENCES_FILE_KEY_1", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            ae a2 = ae.a(jSONArray.getJSONObject(i));
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = ae.a;
                            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "050dadef2c294d820cd28eb6cfdccae9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "050dadef2c294d820cd28eb6cfdccae9")).booleanValue() : (TextUtils.isEmpty(a2.c) || TextUtils.isEmpty(a2.e) || a2.h > 4) ? false : true) {
                                this.b.put(a2.c, a2);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
            this.d = true;
        }
    }
}
