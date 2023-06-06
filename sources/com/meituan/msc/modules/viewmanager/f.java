package com.meituan.msc.modules.viewmanager;

import android.view.View;
import com.facebook.react.uimanager.UIManagerModule;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.msc.common.utils.o;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "MSCRListModule")
/* loaded from: classes3.dex */
public final class f extends k {
    public static ChangeQuickRedirect a;
    private ReactApplicationContext b;
    private Set<Integer> c;
    private final ConcurrentHashMap<String, ConcurrentLinkedQueue<a>> d;

    public f(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032b443ea12a4f7ad8de28240e2dec79", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032b443ea12a4f7ad8de28240e2dec79");
            return;
        }
        this.c = new HashSet();
        this.d = new ConcurrentHashMap<>();
        this.b = reactApplicationContext;
    }

    public final void a(int i, int i2) {
        char c = 2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d383056bce865b816dd9ba7a65dbe96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d383056bce865b816dd9ba7a65dbe96");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        View b = b(i, i2);
        if (b == null) {
            com.meituan.msc.modules.reporter.g.a("[MSCRListModule@notifyPendingRListCommands]", "list is null");
            return;
        }
        String valueOf = String.valueOf(i2);
        com.meituan.msc.modules.reporter.g.d("[MSCRListModule@notifyPendingRListCommands] ", "tagKey:", valueOf);
        if (!this.d.containsKey(valueOf)) {
            com.meituan.msc.modules.reporter.g.d("[MSCRListModule@notifyPendingRListCommands]", "renderCommands doesn't contains tagKey:", valueOf);
            return;
        }
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = this.d.get(valueOf);
        if (concurrentLinkedQueue == null) {
            com.meituan.msc.modules.reporter.g.a("[MSCRListModule@notifyPendingRListCommands]", "listRenderCommands null");
            return;
        }
        while (true) {
            a poll = concurrentLinkedQueue.poll();
            if (poll == null) {
                return;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(i2);
            objArr2[1] = "rlist RenderCommand:";
            objArr2[c] = poll;
            com.meituan.msc.modules.reporter.g.d("[MSCRListModule@notifyPendingRListCommand]", objArr2);
            String str = poll.d;
            JSONObject jSONObject = poll.f;
            String str2 = poll.e;
            com.meituan.msc.modules.manager.b bVar = poll.g;
            Object[] objArr3 = new Object[5];
            objArr3[0] = b;
            objArr3[1] = str;
            objArr3[c] = jSONObject;
            objArr3[3] = str2;
            objArr3[4] = bVar;
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "416b8409751ff4c1d43ec536a81b343a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "416b8409751ff4c1d43ec536a81b343a");
            } else if (b == null) {
                if ("onDataChange".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("message", "[view is null when reload sendToPageManager]");
                        jSONObject2.put("nativeStack", o.b(new Exception("view is null when reload sendToPageManager")));
                        jSONObject2.put("isFatal", false);
                        jSONObject2.put("isNativeError", true);
                        U_().p.b(jSONObject2);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } else {
                    com.meituan.msc.modules.reporter.g.a("MSCRListModule@sendToPageManager", "view is null when reload sendToPageManager " + str);
                }
            } else {
                com.meituan.msc.modules.reporter.g.d("[MSCRListModule@sendToPageManagerInner]", "type:", str, "view:", Integer.valueOf(b.getId()), b);
                this.c.add(Integer.valueOf(b.getId()));
                if (b instanceof com.meituan.msc.mmpviews.perflist.a) {
                    com.meituan.msc.mmpviews.perflist.a aVar = (com.meituan.msc.mmpviews.perflist.a) b;
                    if ("onDataChange".equals(str)) {
                        aVar.a(jSONObject, str2);
                    } else if ("reloadItem".equals(str)) {
                        aVar.b(jSONObject.optInt("itemIndex"));
                    } else if ("scrollToIndex".equals(str)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("args");
                        if (optJSONObject != null) {
                            aVar.a(optJSONObject.optInt("index"), optJSONObject.optJSONObject("options"));
                        }
                    } else if ("queryListItemVisibility".equals(str)) {
                        JSONObject b2 = aVar.b();
                        if (bVar != null) {
                            bVar.a(b2);
                        }
                    } else if (SearchIntents.EXTRA_QUERY.equals(str)) {
                        aVar.a(jSONObject);
                    }
                }
            }
            c = 2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        public static ChangeQuickRedirect a;
        public int b;
        public int c;
        public String d;
        public String e;
        public JSONObject f;
        public com.meituan.msc.modules.manager.b g;

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55674037dda665d4678b17eebba444c1", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55674037dda665d4678b17eebba444c1");
            }
            return "MSCRListRenderCommand{tag='" + this.b + "'type='" + this.d + "'}";
        }
    }

    private View b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b8ae1e5fc7e8d9796519d114a7bf175", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b8ae1e5fc7e8d9796519d114a7bf175");
        }
        try {
            h hVar = (h) U_().b("PageManager").f(String.valueOf(i)).f(UIManagerModule.NAME);
            if (hVar != null && hVar.c != null) {
                return hVar.c.b().g(i2);
            }
            return null;
        } catch (Throwable th) {
            com.meituan.msc.modules.reporter.g.a("[MSCRListModule@resolveView]", th);
            return null;
        }
    }

    public final void a(final String str, JSONObject jSONObject, String str2, com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {str, jSONObject, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e9cf16576e0438f392110a99931f101", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e9cf16576e0438f392110a99931f101");
            return;
        }
        final int optInt = jSONObject.optInt("pageId");
        final int optInt2 = jSONObject.optInt("viewId");
        if (optInt < 0 || optInt2 < 0) {
            return;
        }
        try {
            final h hVar = (h) U_().b("PageManager").f(String.valueOf(optInt)).f(UIManagerModule.NAME);
            if (hVar != null && hVar.c != null) {
                a(optInt2, optInt, str, jSONObject, str2, bVar);
                if (hVar.c.b().g(optInt2) == null) {
                    com.meituan.msc.modules.reporter.g.d("[MSCRListModule@sendToPageManager]", "view null: ", Integer.valueOf(optInt2), str);
                    if (hVar.d()) {
                        hVar.a(str, new Runnable() { // from class: com.meituan.msc.modules.viewmanager.f.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bad7843cb03d8d6fa2aed2eaf69e4c21", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bad7843cb03d8d6fa2aed2eaf69e4c21");
                                } else {
                                    hVar.c.a(new am() { // from class: com.meituan.msc.modules.viewmanager.f.1.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.msc.uimanager.am
                                        public final void a(NativeViewHierarchyManager nativeViewHierarchyManager) {
                                            Object[] objArr3 = {nativeViewHierarchyManager};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a76014568dd519acb12e04991785c75d", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a76014568dd519acb12e04991785c75d");
                                            } else if (nativeViewHierarchyManager.a(optInt2) == null && f.this.c.contains(Integer.valueOf(optInt2))) {
                                                com.meituan.msc.modules.reporter.g.a("MSCRListModule", "listView is null when sendToPageManager");
                                            } else {
                                                f.this.a(optInt, optInt2);
                                            }
                                        }
                                    });
                                }
                            }
                        });
                        return;
                    } else {
                        hVar.a(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.f.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "12d3f2af057a45eb9f2cf208d4cd5639", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "12d3f2af057a45eb9f2cf208d4cd5639");
                                } else {
                                    hVar.c.a(new am() { // from class: com.meituan.msc.modules.viewmanager.f.2.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.meituan.msc.uimanager.am
                                        public final void a(NativeViewHierarchyManager nativeViewHierarchyManager) {
                                            Object[] objArr3 = {nativeViewHierarchyManager};
                                            ChangeQuickRedirect changeQuickRedirect3 = a;
                                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bb486604b509450e0549191dad8bfc6", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bb486604b509450e0549191dad8bfc6");
                                            } else if (nativeViewHierarchyManager.a(optInt2) == null && f.this.c.contains(Integer.valueOf(optInt2))) {
                                                com.meituan.msc.modules.reporter.g.a("MSCRListModule", "listView is null when sendToPageManager");
                                            } else {
                                                f.this.a(optInt, optInt2);
                                            }
                                        }
                                    });
                                }
                            }
                        }, 0);
                        return;
                    }
                }
                com.meituan.msc.modules.reporter.g.d("[MSCRListModule@sendToPageManager]", "direct run sendToPageManager:", "listView:", Integer.valueOf(optInt2), str);
                a(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.f.3
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d986bb1b5ce6d85b1de6306207a7575d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d986bb1b5ce6d85b1de6306207a7575d");
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.d("[MSCRListModule@execute]", "direct run:", Integer.valueOf(optInt2), str);
                        f.this.a(optInt, optInt2);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(int i, int i2, String str, JSONObject jSONObject, String str2, com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, jSONObject, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8843c73bd09a495246c7b3c084c498", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8843c73bd09a495246c7b3c084c498");
            return;
        }
        a aVar = new a();
        aVar.b = i;
        aVar.c = i2;
        aVar.d = str;
        aVar.f = jSONObject;
        aVar.e = str2;
        aVar.g = bVar;
        String valueOf = String.valueOf(i);
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = this.d.get(valueOf);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
            this.d.put(valueOf, concurrentLinkedQueue);
        }
        concurrentLinkedQueue.add(aVar);
    }

    private void a(final Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f20d08efaa18cd8c60e5f4bffcba9d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f20d08efaa18cd8c60e5f4bffcba9d86");
        } else if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.f.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "949b048e2ddec65b30021612f819d7cb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "949b048e2ddec65b30021612f819d7cb");
                    } else {
                        runnable.run();
                    }
                }
            });
        }
    }
}
