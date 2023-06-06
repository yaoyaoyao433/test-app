package com.sankuai.waimai.store.manager.marketing;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.g;
import com.sankuai.waimai.store.manager.marketing.push.MarketingPushModel;
import com.sankuai.waimai.store.manager.marketing.push.a;
import com.sankuai.waimai.store.manager.sequence.c;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d, a.InterfaceC1226a {
    public static ChangeQuickRedirect a;
    public Activity b;
    final b c;
    com.sankuai.waimai.store.manager.sequence.c d;
    com.sankuai.waimai.store.manager.sequence.b e;
    View f;
    public com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c g;
    public com.sankuai.waimai.store.manager.marketing.action.b h;
    public com.sankuai.waimai.store.manager.marketing.action.c i;
    boolean j;
    public int k;
    public String l;
    private String m;
    private com.sankuai.waimai.store.manager.sequence.c n;
    private long o;
    private final Map<String, com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c> p;
    private Map<String, Object> q;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.manager.marketing.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1225a {
        void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map);
    }

    public a(Activity activity, View view, int i) {
        Object[] objArr = {activity, view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd2047de87bd7ab8af468e1a9bc6aba6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd2047de87bd7ab8af468e1a9bc6aba6");
            return;
        }
        this.p = new HashMap();
        this.j = false;
        this.f = view;
        this.b = activity;
        this.k = i;
        this.c = new b();
        com.sankuai.waimai.store.manager.marketing.action.a aVar = new com.sankuai.waimai.store.manager.marketing.action.a(this);
        Object[] objArr2 = {"alert", aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5067331aa8b17ad88a79c1d93a7cd966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5067331aa8b17ad88a79c1d93a7cd966");
        } else if (!TextUtils.isEmpty("alert")) {
            this.p.put("alert", aVar);
        }
        com.sankuai.waimai.store.manager.marketing.push.a.a(i, this);
    }

    com.sankuai.waimai.store.manager.sequence.c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74adb4a7fdc762d15d419c84f157ed0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74adb4a7fdc762d15d419c84f157ed0f");
        }
        if (this.n == null) {
            this.n = new com.sankuai.waimai.store.manager.sequence.c(false);
            this.n.e = new c.a() { // from class: com.sankuai.waimai.store.manager.marketing.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final boolean b() {
                    return false;
                }

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff1c22574e7f4db14c1f01ab1380f410", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff1c22574e7f4db14c1f01ab1380f410");
                        return;
                    }
                    if (!a.this.j) {
                        a.this.j = true;
                        a.this.f();
                    }
                    a.this.e().b(true);
                }
            };
        }
        return this.n;
    }

    com.sankuai.waimai.store.manager.sequence.c b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6b37d8721da8b9d82d7b1e3e06e278", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6b37d8721da8b9d82d7b1e3e06e278");
        }
        if (this.d == null) {
            this.d = new com.sankuai.waimai.store.manager.sequence.c(false);
            this.d.e = new c.a() { // from class: com.sankuai.waimai.store.manager.marketing.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final void a() {
                }

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final boolean b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88ffd70463b8f67ac9a3bb7bcf54890e", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88ffd70463b8f67ac9a3bb7bcf54890e")).booleanValue();
                    }
                    if (a.this.d.f || !a.this.d.e()) {
                        return false;
                    }
                    if (com.sankuai.waimai.store.util.b.a(a.this.b)) {
                        return true;
                    }
                    a.this.b.finish();
                    return true;
                }
            };
        }
        return this.d;
    }

    com.sankuai.waimai.store.manager.sequence.b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cdec2f2a334beaa92ac3acfbb64b72b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.manager.sequence.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cdec2f2a334beaa92ac3acfbb64b72b");
        }
        if (this.e == null) {
            this.e = new com.sankuai.waimai.store.manager.sequence.b(false);
            this.e.e = new c.a() { // from class: com.sankuai.waimai.store.manager.marketing.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final boolean b() {
                    return false;
                }

                @Override // com.sankuai.waimai.store.manager.sequence.c.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2b5ccfa4e00ddf154f273cb8eb34426", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2b5ccfa4e00ddf154f273cb8eb34426");
                    } else if (a.this.i != null) {
                        a.this.i.b(a.this.e);
                    }
                }
            };
        }
        return this.e;
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ac125d2650205e998552ccffff488e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ac125d2650205e998552ccffff488e3");
        } else {
            this.o = System.currentTimeMillis();
        }
    }

    public final void a(Map<String, Object> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f6cf1951f265fd457c1b07b8e2abfe2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f6cf1951f265fd457c1b07b8e2abfe2");
        } else {
            a(map, str, false, -1);
        }
    }

    public final void a(Map<String, Object> map, String str, int i) {
        Object[] objArr = {map, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fdef625faaeb4f001ff7f223e758e85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fdef625faaeb4f001ff7f223e758e85");
        } else {
            a(map, str, false, i);
        }
    }

    private void a(Map<String, Object> map, String str, boolean z, int i) {
        Object[] objArr = {map, str, (byte) 0, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "630a4976f3252a5c118e5b64c256209d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "630a4976f3252a5c118e5b64c256209d");
            return;
        }
        this.q = map;
        this.m = str;
        a(false);
        this.j = false;
        ae.a("SGMarketingTemplateController", "page: " + this.k + " start request by enter page...");
        a(map, str, new k<MarketingResponse>() { // from class: com.sankuai.waimai.store.manager.marketing.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                MarketingResponse marketingResponse = (MarketingResponse) obj;
                Object[] objArr2 = {marketingResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e3b69acf69ddafa8612c8adc2162840f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e3b69acf69ddafa8612c8adc2162840f");
                    return;
                }
                if (r2) {
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "870fed3b8b27748dc5ec83f289852cfd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "870fed3b8b27748dc5ec83f289852cfd");
                    } else {
                        aVar.b().d();
                    }
                }
                a.this.a(marketingResponse, false);
            }
        }, i);
    }

    private void a(Map<String, Object> map, String str, final k<MarketingResponse> kVar, int i) {
        Object[] objArr = {map, str, kVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca7a278110f4724a2adf865a10af2b23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca7a278110f4724a2adf865a10af2b23");
        } else if (this.f == null || this.b == null) {
        } else {
            e().b(false);
            final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask("flashbuy_marketing_controller");
            createCustomSpeedMeterTask.recordStep("start_request");
            k<MarketingResponse> kVar2 = new k<MarketingResponse>() { // from class: com.sankuai.waimai.store.manager.marketing.a.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MarketingResponse marketingResponse = (MarketingResponse) obj;
                    Object[] objArr2 = {marketingResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7fb9260634759c4603983f5b712203d9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7fb9260634759c4603983f5b712203d9");
                        return;
                    }
                    createCustomSpeedMeterTask.recordStep("request_success");
                    kVar.a((k) marketingResponse);
                    h.a(createCustomSpeedMeterTask.recordStep("resolveResponse_finish"));
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9faf45836e29688f6463e6df11ee7293", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9faf45836e29688f6463e6df11ee7293");
                    } else {
                        kVar.a();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "192213cc23e950e48bd3752760fe6321", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "192213cc23e950e48bd3752760fe6321");
                        return;
                    }
                    ae.a("SGMarketingTemplateController", "page: " + a.this.k + ", error: " + bVar.toString());
                    kVar.a(bVar);
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b3014db85583222a229f85174d3b6598", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b3014db85583222a229f85174d3b6598");
                    } else {
                        kVar.b();
                    }
                }
            };
            if (i == 999) {
                g.a(str).b(map, kVar2);
            } else if (i == 1000) {
                com.sankuai.waimai.store.base.net.drug.c.a(str).a(map, kVar2);
            } else {
                g.a(str).a(map, kVar2);
            }
        }
    }

    public final void a(@NonNull final MarketingResponse marketingResponse, final boolean z) {
        Object[] objArr = {marketingResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3aef5b671433a8a7821968d2aaff173e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3aef5b671433a8a7821968d2aaff173e");
            return;
        }
        ae.a("SGMarketingTemplateController", "page: " + this.k + " resolve response...");
        final InterfaceC1225a interfaceC1225a = new InterfaceC1225a() { // from class: com.sankuai.waimai.store.manager.marketing.a.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.manager.marketing.a.InterfaceC1225a
            public final void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                com.sankuai.waimai.store.manager.sequence.c a2;
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aa5af45025bfbcbdea826250256e351e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aa5af45025bfbcbdea826250256e351e");
                } else if (map != null && map.size() != 0) {
                    for (Map.Entry<String, List<com.sankuai.waimai.store.manager.sequence.d>> entry : map.entrySet()) {
                        List<com.sankuai.waimai.store.manager.sequence.d> value = entry.getValue();
                        if (!com.sankuai.shangou.stone.util.a.b(value)) {
                            String key = entry.getKey();
                            char c = 65535;
                            int hashCode = key.hashCode();
                            if (hashCode != -347124400) {
                                if (hashCode != 3015911) {
                                    if (hashCode == 3417674 && key.equals(MarketingModel.TYPE_ENTER_DIALOG)) {
                                        c = 0;
                                    }
                                } else if (key.equals("back")) {
                                    c = 1;
                                }
                            } else if (key.equals(MarketingModel.TYPE_RESIDENT_POPUP)) {
                                c = 2;
                            }
                            switch (c) {
                                case 0:
                                    a2 = a.this.a();
                                    break;
                                case 1:
                                    a2 = a.this.b();
                                    break;
                                case 2:
                                    a2 = a.this.e();
                                    break;
                                default:
                                    a2 = null;
                                    break;
                            }
                            if (a2 != null) {
                                a aVar = a.this;
                                String key2 = entry.getKey();
                                Object[] objArr3 = {key2, a2, value};
                                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c98e7b2e942ad146573671ca00fcfe51", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c98e7b2e942ad146573671ca00fcfe51");
                                } else if (aVar.i != null) {
                                    if (key2.equals(MarketingModel.TYPE_ENTER_DIALOG)) {
                                        Object[] objArr4 = {value, a2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "c211930eddd32bcc422778af69246205", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "c211930eddd32bcc422778af69246205");
                                        } else {
                                            if (!com.sankuai.shangou.stone.util.a.b(value)) {
                                                Iterator<com.sankuai.waimai.store.manager.sequence.d> it = value.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        com.sankuai.waimai.store.manager.sequence.d next = it.next();
                                                        if (next != null && next.b(false)) {
                                                            a2.h = true;
                                                        } else {
                                                            a2.h = false;
                                                        }
                                                    }
                                                }
                                            }
                                            if (aVar.i != null) {
                                                aVar.i.a(a2);
                                            }
                                        }
                                    } else {
                                        a2.h = false;
                                        aVar.i.a(a2);
                                    }
                                }
                                if (z) {
                                    a2.b(value);
                                } else {
                                    a2.a(value);
                                }
                            }
                        }
                    }
                    a.this.e().b(false);
                    a.this.e().i = true;
                    a.this.a().c();
                } else if (a.this.i != null) {
                    a.this.i.a(null);
                    a.this.i.a();
                }
            }
        };
        Object[] objArr2 = {marketingResponse, interfaceC1225a};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "89ff99c401b0bfaa0e6bcb96d01394a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "89ff99c401b0bfaa0e6bcb96d01394a5");
        } else {
            al.a(new al.b<Map<String, List<com.sankuai.waimai.store.manager.sequence.d>>>() { // from class: com.sankuai.waimai.store.manager.marketing.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f22f146d80756fc7b97611b2071b4cb6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Map) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f22f146d80756fc7b97611b2071b4cb6");
                    }
                    ae.a("SGMarketingTemplateController", "page: " + a.this.k + " parse result: \n" + i.a(marketingResponse));
                    return a.this.c.a(a.this.b, a.this.f, marketingResponse, a.this);
                }

                @Override // com.sankuai.waimai.store.util.al.b
                public final /* synthetic */ void a(Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map) {
                    Map<String, List<com.sankuai.waimai.store.manager.sequence.d>> map2 = map;
                    Object[] objArr3 = {map2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e191062f73ec22a0045f414ed31d0e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e191062f73ec22a0045f414ed31d0e6");
                    } else if (interfaceC1225a != null) {
                        interfaceC1225a.a(map2);
                    }
                }
            }, this.m);
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "290af846f983f5c45aae44c57587b88e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "290af846f983f5c45aae44c57587b88e")).booleanValue();
        }
        if (this.d == null || this.d.e()) {
            return true;
        }
        this.d.c();
        return false;
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "148469451247c64d30258816364116dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "148469451247c64d30258816364116dc");
            return;
        }
        a().c(true);
        e().c(true);
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fde9b34d8b8232bb17b0c0627138721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fde9b34d8b8232bb17b0c0627138721");
            return;
        }
        a().c(false);
        e().c(false);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d00ccc3938fb7bb42bb5884735d24b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d00ccc3938fb7bb42bb5884735d24b");
        } else {
            e().a(z);
        }
    }

    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faeeae70a84db47408e52169c4384a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faeeae70a84db47408e52169c4384a9");
            return;
        }
        a(this.n);
        a(this.d);
        a(this.e);
        al.cancel(this.m);
        com.sankuai.waimai.store.manager.marketing.push.a.b(this.k, this);
    }

    private void a(com.sankuai.waimai.store.manager.sequence.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b031b2014b9c11e5351ca6f3b396d025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b031b2014b9c11e5351ca6f3b396d025");
        } else if (cVar != null) {
            cVar.f();
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c
    public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str, @NonNull Map<String, Object> map) {
        Object[] objArr = {aVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f2699e756b74485489d027707840a1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f2699e756b74485489d027707840a1a");
            return;
        }
        com.sankuai.waimai.store.manager.marketing.parser.inner.mach.c cVar = this.p.get(str);
        if (cVar != null) {
            cVar.a(aVar, str, map);
        } else if (this.g != null) {
            this.g.a(aVar, str, map);
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final long c() {
        return this.o;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.d
    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5de8b048041d8ffd2b412f77e5964588", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5de8b048041d8ffd2b412f77e5964588") : TextUtils.isEmpty(this.l) ? com.sankuai.waimai.store.manager.judas.b.b(this.b) : this.l;
    }

    @Override // com.sankuai.waimai.store.manager.marketing.push.a.InterfaceC1226a
    public final void a(@NonNull final MarketingPushModel marketingPushModel) {
        Object[] objArr = {marketingPushModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47f392c9c54057c4d4e08b5c618022e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47f392c9c54057c4d4e08b5c618022e");
        } else if (this.q == null || this.q.isEmpty()) {
            ae.a("SGMarketingPushManager", "page: " + this.k + " pushModel is empty");
        } else {
            this.q.put(PushConstants.TASK_ID, marketingPushModel.taskId);
            this.q.put("biz_source", marketingPushModel.bizSource);
            ae.a("SGMarketingPushManager", "page: " + this.k + " start request by push...");
            ae.a("SGMarketingPushManager", "page: " + this.k + ", task_id = " + marketingPushModel.taskId + ", biz_source = " + marketingPushModel.bizSource);
            Map<String, Object> map = this.q;
            String str = this.m;
            k<MarketingResponse> kVar = new k<MarketingResponse>() { // from class: com.sankuai.waimai.store.manager.marketing.a.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    MarketingResponse marketingResponse = (MarketingResponse) obj;
                    Object[] objArr2 = {marketingResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f9a9e73b874e2b6184f6f36003db800", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f9a9e73b874e2b6184f6f36003db800");
                    } else {
                        a.this.a(marketingResponse, marketingPushModel.insertFront);
                    }
                }
            };
            Object[] objArr2 = {map, str, kVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bce8827cca14ab4d3f7644302a3472fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bce8827cca14ab4d3f7644302a3472fd");
            } else {
                a(map, str, kVar, -1);
            }
        }
    }

    @Override // com.sankuai.waimai.store.manager.marketing.action.b
    public final void a(final String str, final com.sankuai.waimai.store.manager.marketing.action.d dVar) {
        Object[] objArr = {str, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3bc34cd31d636981dec4ea9e95ea03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3bc34cd31d636981dec4ea9e95ea03");
        } else if (this.h == null) {
        } else {
            al.a(new Runnable() { // from class: com.sankuai.waimai.store.manager.marketing.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a76d5a9f090003908b22d20c08a50b74", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a76d5a9f090003908b22d20c08a50b74");
                    } else if (a.this.h == null) {
                    } else {
                        a.this.h.a(str, dVar);
                    }
                }
            }, this.m);
        }
    }
}
