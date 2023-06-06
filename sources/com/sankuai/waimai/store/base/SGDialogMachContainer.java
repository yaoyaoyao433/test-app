package com.sankuai.waimai.store.base;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.store.newwidgets.pullrefresh.DefaultHeaderService;
import com.sankuai.waimai.store.platform.marketing.MarketingModel;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.mach.SGCommonMachReportInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGDialogMachContainer extends SCBaseDialog implements com.sankuai.waimai.store.expose.v2.a {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.mach.event.b b;
    private com.sankuai.waimai.store.mach.d c;
    private ViewGroup d;
    private Map<String, Object> e;
    private final Map<String, Object> f;
    private final String g;
    private com.sankuai.waimai.mach.manager.load.a h;
    private final int i;
    private String j;
    private String m;
    private Handler n;

    public static void a(Activity activity, MarketingModel.ModuleItem moduleItem, Map<String, Object> map) {
        Object[] objArr = {activity, moduleItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "98d413405c8950b99e4ee98490bca652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "98d413405c8950b99e4ee98490bca652");
            return;
        }
        Object[] objArr2 = {activity, moduleItem, map, null};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "526756a52c1f444722733edf7b34e653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "526756a52c1f444722733edf7b34e653");
        } else if (activity == null || moduleItem == null) {
        } else {
            try {
                SGDialogMachContainer sGDialogMachContainer = new SGDialogMachContainer(activity, "", moduleItem.moduleExtra);
                String str = moduleItem.templateID;
                String str2 = moduleItem.templateData;
                sGDialogMachContainer.a(map);
                sGDialogMachContainer.b = null;
                if (sGDialogMachContainer.a(str, str2)) {
                    com.sankuai.waimai.platform.widget.dialog.a.a(sGDialogMachContainer);
                }
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public SGDialogMachContainer(@NonNull Activity activity, String str) {
        this(activity, str, null);
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e450e5da72b50ab6f4189f42290c600", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e450e5da72b50ab6f4189f42290c600");
        }
    }

    public SGDialogMachContainer(@NonNull final Activity activity, @Nullable String str, @Nullable String str2) {
        super(activity, LayoutInflater.from(activity).inflate(R.layout.wm_sc_dialog_mach_container, (ViewGroup) null), R.style.dialog_mach_container);
        final String str3;
        String str4;
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7cce2761ddbf94b8818ed015dfe4033", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7cce2761ddbf94b8818ed015dfe4033");
            return;
        }
        this.f = new HashMap();
        this.i = 200;
        this.j = "supermarket";
        this.m = "sm_mach_alert";
        this.n = new Handler(Looper.getMainLooper()) { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                Object[] objArr2 = {message};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08187df9dc232c807bfdfc04fb065335", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08187df9dc232c807bfdfc04fb065335");
                } else if (message.what == 200) {
                    u.a(SGDialogMachContainer.this.d);
                    if (SGDialogMachContainer.this.c == null || SGDialogMachContainer.this.c.r() == null) {
                        return;
                    }
                    SGDialogMachContainer.this.c.g();
                }
            }
        };
        this.g = str2;
        Object[] objArr2 = {activity, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e1bd92150d71e26d35db2789c8fd2502", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e1bd92150d71e26d35db2789c8fd2502");
            return;
        }
        setCanceledOnTouchOutside(true);
        if (activity instanceof SCBaseActivity) {
            SCBaseActivity sCBaseActivity = (SCBaseActivity) activity;
            String w = sCBaseActivity.w();
            String b = sCBaseActivity.b();
            if (!TextUtils.isEmpty(sCBaseActivity.t())) {
                this.j = sCBaseActivity.t();
                if (DefaultHeaderService.KEY_DRUG.equals(this.j)) {
                    this.m = "MachDrugFullLinkDialog";
                }
            }
            str4 = w;
            str3 = b;
        } else {
            str3 = str;
            str4 = activity.getClass().getSimpleName() + System.identityHashCode(activity);
        }
        a();
        this.c = new com.sankuai.waimai.store.mach.d(this, str4) { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.d
            public final com.sankuai.waimai.mach.d aZ_() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7bd3eaaf8d13b047f1f1431d41e14dec", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.mach.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7bd3eaaf8d13b047f1f1431d41e14dec") : new com.sankuai.waimai.store.mach.logger.a(activity, str3);
            }
        };
        this.c.a(this.d, this.m, this.j);
        this.c.a(new com.sankuai.waimai.mach.container.e() { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e6522e6f78e1826fbf4e773aef95b5d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e6522e6f78e1826fbf4e773aef95b5d8");
                    return;
                }
                super.d();
                if (SGDialogMachContainer.this.n.hasMessages(200)) {
                    SGDialogMachContainer.this.n.removeMessages(200);
                }
                SGDialogMachContainer.this.n.sendEmptyMessageDelayed(200, 300L);
                if (SGDialogMachContainer.this.c == null || SGDialogMachContainer.this.c.r() == null) {
                    return;
                }
                SGDialogMachContainer.this.c.r().setVisibility(0);
            }
        });
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f79ee80c15d1de8114f6961000dc315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f79ee80c15d1de8114f6961000dc315");
            return;
        }
        super.a(view);
        this.d = (ViewGroup) c(R.id.search_coupon_mach_container);
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3572b9c0a6afd7e7361d8137b871188b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3572b9c0a6afd7e7361d8137b871188b");
            return;
        }
        this.f.clear();
        if (map != null) {
            this.f.putAll(map);
        }
    }

    public final boolean a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e82af564f2ba979eae9c55a1b69fee1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e82af564f2ba979eae9c55a1b69fee1")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            dismiss();
            return false;
        }
        this.e = (Map) i.a(str2, Map.class);
        if (this.e == null || this.e.size() == 0) {
            dismiss();
            return false;
        }
        this.e.putAll(this.f);
        a.C1015a c1015a = new a.C1015a();
        c1015a.c = str;
        c1015a.b = str;
        c1015a.d = this.m;
        c1015a.e = this.j;
        this.h = c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a();
        com.sankuai.waimai.store.manager.marketing.parser.inner.mach.f fVar = new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.f(str, str2, new com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e() { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
            public final void b() {
            }

            @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb64f4a7b51fbcd26792e36bd3417095", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb64f4a7b51fbcd26792e36bd3417095");
                } else {
                    SGDialogMachContainer.this.dismiss();
                }
            }

            @Override // com.sankuai.waimai.store.manager.marketing.parser.inner.mach.e
            public final void a(com.sankuai.waimai.store.mach.event.a aVar, String str3, Map<String, Object> map) {
                Object[] objArr2 = {aVar, str3, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "113c01d2268b16bf6b27a7c53f7a506e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "113c01d2268b16bf6b27a7c53f7a506e");
                } else if (SGDialogMachContainer.this.b != null) {
                    SGDialogMachContainer.this.b.a(aVar, str3, map);
                }
            }
        });
        fVar.b = this.f;
        this.c.g = fVar;
        return true;
    }

    private void a() {
        Map map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4ac364e65b761fc961364fb225bfaf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4ac364e65b761fc961364fb225bfaf3");
        } else if (TextUtils.isEmpty(this.g) || (map = (Map) i.a(this.g, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.5
        }.getType())) == null || map.isEmpty()) {
        } else {
            try {
                a((String) map.get("show_type"));
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    public final void a(String str) {
        WindowManager.LayoutParams attributes;
        char c = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96a926df1882fb6bb6637baefd50ac0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96a926df1882fb6bb6637baefd50ac0e");
        } else if (TextUtils.isEmpty(str) || getWindow() == null) {
        } else {
            Window window = getWindow();
            if (((str.hashCode() == 3135100 && str.equals(MarketingModel.DIALOG_SHOW_TYPE_FADE)) ? (char) 65535 : (char) 65535) == 0 && (attributes = window.getAttributes()) != null) {
                attributes.width = -1;
                attributes.height = -1;
                window.setAttributes(attributes);
                window.setWindowAnimations(R.style.WmStDialogEnlargedAnimation);
            }
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e61e865e2141d09b392ef8785465e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e61e865e2141d09b392ef8785465e0");
        } else {
            this.c.a(this.h, new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.store.base.SGDialogMachContainer.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr2 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "356b1dbeaa96049d1013537ae9ad96e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "356b1dbeaa96049d1013537ae9ad96e3");
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(BaseModuleDesc.USE_POI_ID_STR, Boolean.valueOf(com.sankuai.waimai.store.platform.domain.manager.poi.a.w()));
                    SGDialogMachContainer.this.e.put(BaseModuleDesc.MACH_BIZ_CUSTOM_DATA_KEY, hashMap);
                    SGDialogMachContainer.this.c.a(eVar, SGDialogMachContainer.this.e);
                    u.b(SGDialogMachContainer.this.d);
                    SGDialogMachContainer.super.show();
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5d8cef172a2094c150b86f1ebb6690a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5d8cef172a2094c150b86f1ebb6690a");
                        return;
                    }
                    SGDialogMachContainer.this.dismiss();
                    SGCommonMachReportInfo sGCommonMachReportInfo = new SGCommonMachReportInfo(SGDialogMachContainer.class.getSimpleName());
                    sGCommonMachReportInfo.e = SGDialogMachContainer.this.h == null ? "" : SGDialogMachContainer.this.h.b;
                    sGCommonMachReportInfo.d = 4;
                    sGCommonMachReportInfo.i = bVar.a();
                    com.sankuai.waimai.store.util.mach.a.a(sGCommonMachReportInfo);
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.expose.v2.a
    public final View f() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, com.sankuai.waimai.store.expose.v2.a
    public final Activity bB_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f5f8017b88207cdbd436b8fcbc55ee", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f5f8017b88207cdbd436b8fcbc55ee") : super.bB_();
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "015c5f9f25631594f496224ed8149076", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "015c5f9f25631594f496224ed8149076");
            return;
        }
        super.onDismiss(dialogInterface);
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        if (this.n.hasMessages(200)) {
            this.n.removeMessages(200);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        Object[] objArr = {dialogInterface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5c3f3707cc09d1567f00f8a764ead0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5c3f3707cc09d1567f00f8a764ead0");
            return;
        }
        super.onShow(dialogInterface);
        com.sankuai.waimai.store.expose.v2.b.a().a(this);
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
    }
}
