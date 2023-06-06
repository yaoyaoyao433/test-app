package com.sankuai.eh.component.web.tab;

import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.eh.component.web.module.e;
import com.sankuai.eh.plugins.fupTab.EHTabBlock;
import com.sankuai.titans.proxy.util.Constants;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    String b;
    EHTabBlock c;
    ViewGroup d;

    public a(ViewGroup viewGroup, String str) {
        Object[] objArr = {viewGroup, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c59f1940ba80e150e1238207fa298b9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c59f1940ba80e150e1238207fa298b9c");
            return;
        }
        this.d = viewGroup;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0bae39b4f5d6ddadec63cc7c5f073be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0bae39b4f5d6ddadec63cc7c5f073be");
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("User-Agent", e.a());
        hashMap.put(Constants.KEY_ORIGIN, "https://eh.sankuai.com");
        hashMap.put("Referrer", com.sankuai.eh.component.service.utils.e.b(this.b, "url"));
        hashMap.put("Accept", "*/*");
        hashMap.put("Cookie", CookieManager.getInstance().getCookie(com.sankuai.eh.component.service.utils.e.b(this.b, "url")));
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("token", com.sankuai.eh.component.service.a.c().e());
        hashMap2.put("nb_app", com.sankuai.eh.component.service.a.c().j().get("nickname"));
        hashMap2.put("nb_appversion", com.sankuai.eh.component.service.a.c().i());
        hashMap2.put("nb_ci", com.sankuai.eh.component.service.a.c().a());
        hashMap2.put("nb_deviceid", com.sankuai.eh.component.service.a.c().f());
        hashMap2.put("nb_osversion", Build.VERSION.RELEASE);
        hashMap2.put("nb_platform", "android");
        hashMap2.put("nb_uuid", com.sankuai.eh.component.service.a.c().f());
        com.sankuai.eh.component.service.network.a.a(false).callDynamic(c(), hashMap, hashMap2).a(new AnonymousClass1(z));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.tab.a$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends b.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ boolean b;

        public AnonymousClass1(boolean z) {
            this.b = z;
        }

        @Override // com.sankuai.eh.component.service.database.b.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dcabeebe41ad647f18a7cfdc532c882", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dcabeebe41ad647f18a7cfdc532c882");
                return;
            }
            JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(str);
            if ("success".equals(com.sankuai.eh.component.service.utils.b.a(a2, "status"))) {
                Gson create = new GsonBuilder().disableHtmlEscaping().create();
                String json = create.toJson(com.sankuai.eh.component.service.utils.b.c(a2, "data"));
                if (this.b && a.this.a(json)) {
                    a.this.a();
                }
                JsonObject jsonObject = new b.a().a("userid", com.sankuai.eh.component.service.a.c().d()).a("data", json).b;
                com.sankuai.eh.component.service.utils.thread.b a3 = com.sankuai.eh.component.service.utils.thread.b.a();
                Object[] objArr2 = {create, jsonObject};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                a3.c(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9b528fb590dae94516bc96d8f20691df", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9b528fb590dae94516bc96d8f20691df") : new b(create, jsonObject));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c95f9d69437bdae77ce28c91ae77c29e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c95f9d69437bdae77ce28c91ae77c29e")).booleanValue();
        }
        List<com.sankuai.eh.plugins.fupTab.a> list = (List) com.sankuai.eh.component.service.utils.b.a(str, new TypeToken<List<com.sankuai.eh.plugins.fupTab.a>>() { // from class: com.sankuai.eh.component.web.tab.a.2
        }.getType());
        if (a(list)) {
            int i = 0;
            for (int i2 = 0; list != null && i2 < list.size(); i2++) {
                com.sankuai.eh.plugins.fupTab.a aVar = list.get(i2);
                if (String.valueOf(aVar.a).equals(a(this.b, "bizId"))) {
                    if (aVar.f == 2) {
                        return false;
                    }
                    i++;
                    aVar.h = true;
                    this.c.setCurIndex(i2);
                }
                aVar.g = i2;
                this.c.a(aVar);
            }
            return i == 1;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8fa74fac19dd42796dc823d146f2fb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8fa74fac19dd42796dc823d146f2fb4");
        } else if (this.c != null) {
            this.d.addView(this.c);
            View view = new View(this.d.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.sankuai.eh.component.service.utils.a.a(1.0f));
            layoutParams.addRule(2, this.c.getId());
            view.setBackgroundColor(Color.parseColor("#f0f0f0"));
            view.setLayoutParams(layoutParams);
            this.d.addView(view);
            b();
            new d.c().a("ehc_fup_tab").a("type", "show").b();
            com.sankuai.eh.component.web.module.c a2 = com.sankuai.eh.component.web.plugins.core.b.a(this.d.getContext());
            if (a2 != null) {
                a2.a("fupTabFlag", Boolean.TRUE);
            }
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c776dced728b1c3f92a67f05f6ace07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c776dced728b1c3f92a67f05f6ace07");
        } else if (this.c != null) {
            for (com.sankuai.eh.plugins.fupTab.a aVar : this.c.getAllItems()) {
                if (aVar == null) {
                    aVar = new com.sankuai.eh.plugins.fupTab.a();
                }
                d.a("fup", "b_fup_g5v8t3vc_mv", "c_fup_2e5d1t9k", new d.b().a("biz_id", Integer.valueOf(aVar.a)).a("display_name", aVar.c).a("from", a(this.b, "from")).a("utm_source", a(this.b, "utm_source")).b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.util.List<com.sankuai.eh.plugins.fupTab.a> r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.eh.component.web.tab.a.a
            java.lang.String r11 = "3da603d82990f15edef97438f3df8488"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            if (r13 == 0) goto L65
            int r1 = r13.size()
            r2 = 2
            if (r1 < r2) goto L65
            int r1 = r13.size()
            r2 = 5
            if (r1 <= r2) goto L33
            goto L65
        L33:
            java.util.Iterator r13 = r13.iterator()
        L37:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r13.next()
            com.sankuai.eh.plugins.fupTab.a r1 = (com.sankuai.eh.plugins.fupTab.a) r1
            java.lang.String r2 = r1.c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L63
            java.lang.String r2 = r1.b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L63
            java.lang.String r2 = r1.e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L63
            java.lang.String r1 = r1.d
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L37
        L63:
            return r9
        L64:
            return r0
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.eh.component.web.tab.a.a(java.util.List):boolean");
    }

    private String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cae6d7055a6f4af6f164e7b1156aa29f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cae6d7055a6f4af6f164e7b1156aa29f");
        }
        if (f.b()) {
            String lowerCase = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.eh.component.service.a.b()).toLowerCase();
            return lowerCase.contains("stage") ? "http://stable.pay.st.sankuai.com/conch/walletv4/bottomtabs" : lowerCase.contains("test") ? "http://stable.pay.test.sankuai.com/conch/walletv4/bottomtabs" : "https://npay.meituan.com/conch/walletv4/bottomtabs";
        }
        return "https://npay.meituan.com/conch/walletv4/bottomtabs";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "658eb605815f3814ee88ad1e93155432", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "658eb605815f3814ee88ad1e93155432");
        }
        String b = com.sankuai.eh.component.service.utils.e.b(str, str2);
        return !TextUtils.isEmpty(b) ? b : "-999";
    }
}
