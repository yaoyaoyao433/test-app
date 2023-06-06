package com.meituan.msc.modules.mainthread;

import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.meituan.msc.jse.bridge.JSInstance;
import com.meituan.msc.mmpviews.perflist.JSBridge;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.b;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.m;
import com.meituan.msc.modules.reporter.g;
import com.meituan.msc.modules.viewmanager.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "NativeRList")
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;
    public volatile AtomicInteger b;
    public boolean c;
    private final ArrayList<Runnable> d;
    private final Runnable e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060c9bac2cbbdf8bd7d32be766b0170d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060c9bac2cbbdf8bd7d32be766b0170d");
            return;
        }
        this.d = new ArrayList<>();
        this.b = new AtomicInteger(0);
        this.c = false;
        this.e = new Runnable() { // from class: com.meituan.msc.modules.mainthread.a.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bcdac5fc8403504048614144b7d0d795", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bcdac5fc8403504048614144b7d0d795");
                    return;
                }
                com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) a.this.U_().c(com.meituan.msc.modules.engine.k.class);
                if (kVar == null) {
                    return;
                }
                kVar.c(this);
                synchronized (a.this.d) {
                    Iterator it = a.this.d.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    a.this.d.clear();
                }
            }
        };
    }

    @MSCMethod
    public void transport(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d795d5f8a8f2eea2cd7e16d92504266", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d795d5f8a8f2eea2cd7e16d92504266");
            return;
        }
        final int incrementAndGet = this.b.incrementAndGet();
        Object[] objArr2 = {NotificationCompat.CATEGORY_TRANSPORT, str, Integer.valueOf(incrementAndGet)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1040b5adda4382cacefa56dfd31159ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1040b5adda4382cacefa56dfd31159ab");
        } else {
            U_().o.a("r_list_data_cmd", (Map<String, Object>) new ConcurrentHashMap<String, Object>() { // from class: com.meituan.msc.modules.mainthread.a.3
                {
                    put("cmdIndex", Integer.valueOf(incrementAndGet));
                }
            });
            com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) U_().c(com.meituan.msc.modules.engine.k.class);
            if (kVar != null) {
                if (kVar.f) {
                    a(NotificationCompat.CATEGORY_TRANSPORT, str, incrementAndGet);
                } else {
                    synchronized (this.d) {
                        this.d.add(new Runnable() { // from class: com.meituan.msc.modules.mainthread.a.4
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c7c44e73fe886cca93d8e587aa877732", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c7c44e73fe886cca93d8e587aa877732");
                                } else {
                                    a.this.a(r2, str, incrementAndGet);
                                }
                            }
                        });
                    }
                    kVar.b(this.e);
                }
            }
        }
        this.c = true;
    }

    @MSCMethod
    public void onDataChange(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc5d0a28099760c427e330c22b668d12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc5d0a28099760c427e330c22b668d12");
            return;
        }
        a("onDataChange", str, str2);
        this.c = true;
    }

    @MSCMethod
    public void scrollToIndex(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbcc0825f9cdc1b90415d267d5bf2ea7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbcc0825f9cdc1b90415d267d5bf2ea7");
            return;
        }
        a("scrollToIndex", str, str);
        this.c = true;
    }

    @MSCMethod
    public void queryListItemVisibility(String str, b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3d0e4debfa4dbc99f431fbdde0af0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3d0e4debfa4dbc99f431fbdde0af0a");
            return;
        }
        a("queryListItemVisibility", str, str, bVar);
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a5ce0f7dad9371d6b33095a45a45614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a5ce0f7dad9371d6b33095a45a45614");
            return;
        }
        JSInstance d = ((com.meituan.msc.modules.engine.k) U_().c(com.meituan.msc.modules.engine.k.class)).d();
        if (d == null || TextUtils.isEmpty(str)) {
            return;
        }
        ((JSBridge) d.getJSModule(JSBridge.class)).invoke("RList", str, str2);
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9250c92288f87b6c17cfbdbcec21efa1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9250c92288f87b6c17cfbdbcec21efa1");
        } else {
            a(str, str2, str3, (b) null);
        }
    }

    private void a(String str, String str2, String str3, b bVar) {
        Object[] objArr = {str, str2, str3, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa7673a87e80448e9cca59d223e9155f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa7673a87e80448e9cca59d223e9155f");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int i = jSONObject.getInt("pageId");
            k b = U_().b("PageManager");
            if (b == null) {
                g.d("NativeRList", "PageManager is null when sendToPageManager");
                return;
            }
            k f = b.f(String.valueOf(i)).f("MSCRListModule");
            if (f instanceof f) {
                ((f) f).a(str, jSONObject, str3, bVar);
            }
        } catch (m e) {
            g.a("NativeRList", e);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a21a9c0847c727168b109e1481f81521", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a21a9c0847c727168b109e1481f81521");
        } else if (this.d != null) {
            this.d.clear();
        }
    }
}
