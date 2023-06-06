package com.meituan.mmp.main;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c implements ICustomEventDispatch {
    public static ChangeQuickRedirect a;
    private a b;

    public c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f8f4d8b57fd979c64d7614f1d8da85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f8f4d8b57fd979c64d7614f1d8da85");
        } else {
            this.b = new a(str);
        }
    }

    @Override // com.meituan.mmp.main.ICustomEventDispatch
    public final void onCustomEventDispatch(JSONObject jSONObject) throws IllegalStateException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d28300c68f04fb64003689a993cfb5e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d28300c68f04fb64003689a993cfb5e3");
        } else if (x.b.isEmpty()) {
            throw new IllegalStateException("dispatch not ready!");
        } else {
            a aVar = this.b;
            Object[] objArr2 = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "169270551c63573c52ef98a69652196b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "169270551c63573c52ef98a69652196b");
                return;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            aVar.d.add(jSONObject);
            if (System.currentTimeMillis() - aVar.b > 1000) {
                aVar.g.run();
                return;
            }
            synchronized (aVar) {
                if (!aVar.f) {
                    aVar.f = true;
                    aVar.e.postDelayed(aVar.g, 1000L);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
        volatile long b;
        String c;
        LinkedList<JSONObject> d;
        Handler e;
        public boolean f;
        Runnable g;

        public a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29d4236f0effadbddf55847ccd70a071", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29d4236f0effadbddf55847ccd70a071");
                return;
            }
            this.b = 0L;
            this.d = new LinkedList<>();
            this.f = false;
            this.g = new Runnable() { // from class: com.meituan.mmp.main.c.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final synchronized void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1952cfb4dd78292c6ca3c56e25ff3ce8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1952cfb4dd78292c6ca3c56e25ff3ce8");
                        return;
                    }
                    a.this.f = false;
                    a.this.b = System.currentTimeMillis();
                    if (a.this.d.isEmpty()) {
                        return;
                    }
                    LinkedList linkedList = new LinkedList(a.this.d);
                    a.this.d.clear();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < linkedList.size(); i++) {
                        jSONArray.put(linkedList.get(i));
                    }
                    synchronized (x.b) {
                        Iterator<com.meituan.mmp.lib.interfaces.c> it = x.b.iterator();
                        while (it.hasNext()) {
                            it.next().a(a.this.c, jSONArray.toString(), 0);
                        }
                    }
                }
            };
            this.c = str;
            this.e = x.c;
        }
    }
}
