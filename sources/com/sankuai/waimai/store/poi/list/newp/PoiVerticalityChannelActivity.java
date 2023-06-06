package com.sankuai.waimai.store.poi.list.newp;

import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.mach.e;
import com.sankuai.waimai.store.pagingload.c;
import com.sankuai.waimai.store.shopping.cart.f;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.ac;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.d;
import rx.functions.k;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PoiVerticalityChannelActivity extends SCBaseActivity {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.param.a b;
    public PoiVerticalityFragment e;
    public boolean f;

    public PoiVerticalityChannelActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618ce5854da80de0afa6a84e062bd824", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618ce5854da80de0afa6a84e062bd824");
        } else {
            this.f = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0194, code lost:
        if ((android.os.Build.VERSION.SDK_INT > 27) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c7, code lost:
        if (r0.size() == 0) goto L47;
     */
    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@android.support.annotation.Nullable android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity.onCreate(android.os.Bundle):void");
    }

    private void a(final com.sankuai.waimai.mach.recycler.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f2f1360f384f8ec02a9eb757c9214bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f2f1360f384f8ec02a9eb757c9214bf");
            return;
        }
        final ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.PRELOAD_RENDER_MACH_LIST, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity.3
        }.getType(), new ArrayList());
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (final int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(d.a((d.a) new d.a<Boolean>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity.4
                public static ChangeQuickRedirect a;

                @Override // rx.functions.b
                public final /* synthetic */ void call(Object obj) {
                    rx.j jVar = (rx.j) obj;
                    Object[] objArr2 = {jVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d3740ea3b91d46c9f56559ab928e79d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d3740ea3b91d46c9f56559ab928e79d");
                        return;
                    }
                    Map map = (Map) arrayList.get(i);
                    if (map != null) {
                        String str = (String) map.get("templateID");
                        String str2 = (String) map.get("presetTemplateID");
                        String str3 = (String) map.get("moduleId");
                        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
                            jVar.onNext(Boolean.FALSE);
                            return;
                        }
                        if (TextUtils.isEmpty(str2)) {
                            str2 = str;
                        }
                        if (bVar.a(str, str2, str3, 500) != null) {
                            jVar.onNext(Boolean.TRUE);
                        } else {
                            jVar.onNext(Boolean.FALSE);
                        }
                    }
                }
            }).b(rx.schedulers.a.a(ac.a())));
        }
        d.a((Iterable<? extends d<?>>) arrayList2, new k<List<Boolean>>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity.6
            public static ChangeQuickRedirect a;

            @Override // rx.functions.k
            public final /* synthetic */ List<Boolean> call(Object[] objArr2) {
                Object[] objArr3 = {objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "4a3b59989c26a0133bdd5edfa7c21802", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "4a3b59989c26a0133bdd5edfa7c21802") : new ArrayList();
            }
        }).c(new rx.functions.b<List<Boolean>>() { // from class: com.sankuai.waimai.store.poi.list.newp.PoiVerticalityChannelActivity.5
            @Override // rx.functions.b
            public final /* bridge */ /* synthetic */ void call(List<Boolean> list) {
            }
        });
    }

    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "746b6011083827f27528bc62a9a7c136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "746b6011083827f27528bc62a9a7c136");
            return;
        }
        setContentView(R.layout.wm_sc_activity_poi_verticality_channel);
        this.e = new PoiVerticalityFragment();
        this.e.d = this.b;
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment_container, this.e).commitAllowingStateLoss();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "132bbb940a119501ca1689838884ba65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "132bbb940a119501ca1689838884ba65");
            return;
        }
        com.sankuai.waimai.store.manager.judas.d.a(this);
        super.onResume();
        com.sankuai.waimai.store.expose.v2.b.a().c(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27fbef71b9c7316e0f74e95047577ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27fbef71b9c7316e0f74e95047577ab2");
            return;
        }
        super.onPause();
        boolean a2 = com.sankuai.waimai.store.manager.abtest.a.a(c.b).a();
        boolean a3 = j.h().a(SCConfigPath.PREFETCH_MACH_TAG, false);
        if (!a2 && a3 && !this.f) {
            e.a();
            e.b();
            this.f = true;
        }
        com.sankuai.waimai.store.expose.v2.b.a().e(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfd8a45861522385bd50b7e915179692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfd8a45861522385bd50b7e915179692");
            return;
        }
        super.onStop();
        com.sankuai.waimai.store.expose.v2.b.a().f(this);
        if (bB_() == null || !com.sankuai.waimai.store.poi.list.util.a.a(bB_())) {
            return;
        }
        com.sankuai.waimai.store.poi.list.util.a.b = true;
        ab.b().a(bB_(), "key_last_background_time", System.currentTimeMillis());
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd949985c00b85ba95db3de4e83d152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd949985c00b85ba95db3de4e83d152");
            return;
        }
        super.onSaveInstanceState(bundle);
        this.b.b(bundle);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4983053a69a4b465d2f309b6ea4c9492", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4983053a69a4b465d2f309b6ea4c9492");
            return;
        }
        super.onDestroy();
        com.sankuai.waimai.store.expose.v2.b.a().b(this);
        f.a().a(hashCode());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab8db39ff4551358f07cfc4e704cc26f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab8db39ff4551358f07cfc4e704cc26f");
            return;
        }
        String a2 = aa.a(getIntent(), "key_pre_request_cache", "");
        com.sankuai.waimai.store.base.preload.e.a().a(a2);
        if (!TextUtils.isEmpty(a2)) {
            com.sankuai.waimai.store.base.net.c.a(a2);
        }
        com.sankuai.waimai.store.base.preload.f.a(a2);
        String a3 = aa.a(getIntent(), "key_pre_request_cache2", "");
        com.sankuai.waimai.store.base.preload.e.a().a(a3);
        if (!TextUtils.isEmpty(a3)) {
            com.sankuai.waimai.store.base.net.c.a(a3);
        }
        com.sankuai.waimai.store.base.preload.f.a(a3);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c32c83497bcbb4bbb28dce8f33d7fb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c32c83497bcbb4bbb28dce8f33d7fb6");
        }
        try {
            if (this.b != null) {
                HashMap hashMap = new HashMap();
                String str = this.b.G;
                String valueOf = String.valueOf(this.b.c);
                if (!t.a(str)) {
                    hashMap.put("page_id", str + CommonConstant.Symbol.UNDERLINE + valueOf);
                    return hashMap;
                }
            }
        } catch (Throwable unused) {
        }
        return super.Z_();
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public String b() {
        return this.b.G;
    }

    @Override // com.sankuai.waimai.store.base.SCBaseActivity
    public String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2643f8cee9229b4e3d463e9f164f5e3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2643f8cee9229b4e3d463e9f164f5e3") : com.sankuai.waimai.store.manager.judas.b.a(this.e);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9d45db4be03856bfebddf2948ba213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9d45db4be03856bfebddf2948ba213");
        } else if (this.e == null || !this.e.e()) {
            super.onBackPressed();
        }
    }
}
