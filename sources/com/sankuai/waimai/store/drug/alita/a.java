package com.sankuai.waimai.store.drug.alita;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.a;
import com.sankuai.waimai.alita.platform.init.b;
import com.sankuai.waimai.alita.platform.init.e;
import com.sankuai.waimai.alita.platform.init.f;
import com.sankuai.waimai.alita.platform.init.g;
import com.sankuai.waimai.store.drug.alita.marketing.d;
import com.sankuai.waimai.store.util.al;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static b b;

    static {
        b a2 = b.a();
        a2.b = "medicine";
        a2.d = new f() { // from class: com.sankuai.waimai.store.drug.alita.a.2
        };
        a2.e = new g() { // from class: com.sankuai.waimai.store.drug.alita.a.1
            @Override // com.sankuai.waimai.alita.platform.init.g
            public final e a() {
                return null;
            }

            @Override // com.sankuai.waimai.alita.platform.init.g
            public final e b() {
                return null;
            }
        };
        b = a2;
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6b470cb8be8ccdcd27834e0d89f376", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6b470cb8be8ccdcd27834e0d89f376");
        } else {
            al.a(new al.a() { // from class: com.sankuai.waimai.store.drug.alita.a.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.util.al.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c6294954d7cbf1193270d8949ed29325", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c6294954d7cbf1193270d8949ed29325");
                    } else {
                        com.sankuai.waimai.alita.platform.a.a().a(a.b, new a.InterfaceC0717a() { // from class: com.sankuai.waimai.store.drug.alita.a.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.alita.platform.a.InterfaceC0717a
                            public final void a(final String str, final int i, final String str2) {
                                Object[] objArr3 = {str, Integer.valueOf(i), str2};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d002fc51ef20a4dc47c14d3eb973e5f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d002fc51ef20a4dc47c14d3eb973e5f");
                                } else {
                                    al.b(new Runnable() { // from class: com.sankuai.waimai.store.drug.alita.a.3.1.1
                                        public static ChangeQuickRedirect a;

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Object[] objArr4 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "8f3406f6e2dc7c1fe09c3a691e24e10a", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "8f3406f6e2dc7c1fe09c3a691e24e10a");
                                                return;
                                            }
                                            com.sankuai.shangou.stone.util.log.a.a("DrugAlita", "configDataString " + str + " code " + i + " onComplete: " + str2, new Object[0]);
                                            d a2 = d.a();
                                            Object[] objArr5 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect5 = d.a;
                                            if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "ab5870324ffc9bea35791d8fc331ae27", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "ab5870324ffc9bea35791d8fc331ae27");
                                            } else if (a2.d) {
                                                com.sankuai.shangou.stone.util.log.a.b(d.b, "DrugMqLifecycleManager 已经启动", new Object[0]);
                                            } else {
                                                try {
                                                    com.sankuai.shangou.stone.util.log.a.b(d.b, "DrugMqLifecycleManager 注册生命周期回调", new Object[0]);
                                                    ((Application) com.meituan.android.singleton.b.a).registerActivityLifecycleCallbacks(a2);
                                                    a2.d = true;
                                                } catch (Exception e) {
                                                    String str3 = d.b;
                                                    com.sankuai.shangou.stone.util.log.a.d(str3, "DrugMqLifecycleManager 注册生命周期回调失败: " + e.getMessage(), new Object[0]);
                                                }
                                            }
                                            com.sankuai.waimai.store.drug.alita.marketing.e.a();
                                        }
                                    }, "drug_alita");
                                }
                            }
                        });
                    }
                }
            }, "drug_alita");
        }
    }
}
