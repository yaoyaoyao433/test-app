package com.sankuai.waimai.business.page.kingkong;

import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.q;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.meituan.android.cube.pga.action.d;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.arch.PageActivity;
import com.sankuai.waimai.business.page.common.config.a;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.preload.e;
import com.sankuai.waimai.business.page.kingkong.future.root.FKKFragment;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KingKongActivity extends PageActivity {
    public static ChangeQuickRedirect c;
    private a d;
    private KingKongViewModel e;
    private KingkongInfo f;
    private boolean g;
    private long h;
    private Fragment i;
    private boolean j;
    private long k;

    public KingKongActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "855cd24d7721d9d42118da212d05177f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "855cd24d7721d9d42118da212d05177f");
            return;
        }
        this.f = new KingkongInfo();
        this.g = false;
        this.h = Long.MAX_VALUE;
        this.j = true;
        this.k = 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.support.v4.app.Fragment] */
    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        com.sankuai.waimai.business.page.common.config.a aVar;
        a.InterfaceC0758a interfaceC0758a;
        FKKFragment fKKFragment;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9e411e86fb2788a540fa230a489714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9e411e86fb2788a540fa230a489714");
            return;
        }
        super.onCreate(bundle);
        Runtime.getRuntime().freeMemory();
        setContentView(R.layout.wm_page_kingkong_container_activity);
        this.d = new a(this);
        this.d.R.b = new d() { // from class: com.sankuai.waimai.business.page.kingkong.KingKongActivity.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "677d8803a6f1960fd5c210ad2c245eb4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "677d8803a6f1960fd5c210ad2c245eb4") : KingKongActivity.this.w();
            }
        };
        a(true, true);
        this.e = (KingKongViewModel) q.a((FragmentActivity) this).a(KingKongViewModel.class);
        this.e.a(d.a.ON_CREATE);
        a(bundle, getIntent());
        if (this.f.q == -1) {
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().b();
        }
        this.g = b.a(this.f) == b.FOOD;
        this.d.ah.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.KingKongActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d39ee0b979bc7f59fbe8ca07dc07ae3", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d39ee0b979bc7f59fbe8ca07dc07ae3") : Boolean.valueOf(KingKongActivity.this.g);
            }
        };
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.common.config.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "e5713be7ac615b9ef1da3fb42a7a8706", RobustBitConfig.DEFAULT_VALUE)) {
            interfaceC0758a = (a.InterfaceC0758a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "e5713be7ac615b9ef1da3fb42a7a8706");
        } else {
            aVar = a.b.a;
            interfaceC0758a = aVar.b;
        }
        this.h = interfaceC0758a.a(bB_());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "82f007f0979c1931d8bf3f7d0294e189", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "82f007f0979c1931d8bf3f7d0294e189");
        } else {
            KingKongViewModel kingKongViewModel = this.e;
            boolean z = this.j;
            Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = KingKongViewModel.a;
            if (PatchProxy.isSupport(objArr4, kingKongViewModel, changeQuickRedirect4, false, "6412053d8da82eb84be25df142ca0978", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, kingKongViewModel, changeQuickRedirect4, false, "6412053d8da82eb84be25df142ca0978");
            } else {
                kingKongViewModel.i.b((k<Boolean>) Boolean.valueOf(z));
            }
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = c;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d4f227879e4fae622fc108816a147dc4", RobustBitConfig.DEFAULT_VALUE)) {
                fKKFragment = (Fragment) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d4f227879e4fae622fc108816a147dc4");
            } else {
                FKKFragment a = FKKFragment.a(this.g, this.h);
                a.b = this.d;
                a.c = this.f;
                a.d = this.z;
                fKKFragment = a;
            }
            this.i = fKKFragment;
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_king_kong_container, this.i).commit();
        }
        if (com.sankuai.waimai.platform.privacy.a.a().b()) {
            e.b = false;
        }
    }

    private void a(Bundle bundle, Intent intent) {
        Object[] objArr = {bundle, intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "add145b6799fa0725c1b0cbc520414ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "add145b6799fa0725c1b0cbc520414ac");
            return;
        }
        if (bundle != null) {
            a(bundle);
        } else if (com.sankuai.waimai.foundation.router.a.a(intent)) {
            this.f.b(intent);
            com.sankuai.waimai.business.page.kingkong.log.b.a(bB_(), intent, this.f);
        } else {
            this.f.a(intent);
            com.sankuai.waimai.business.page.kingkong.log.b.a(bB_(), intent, this.f);
        }
        this.e.a(this.f);
        this.d.w.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.KingKongActivity.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5b7708eaee6eb91b4ee15e071c15a2a4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5b7708eaee6eb91b4ee15e071c15a2a4") : KingKongActivity.this.f;
            }
        };
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "060c12456c2af02ecafc57854f5f3f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "060c12456c2af02ecafc57854f5f3f40");
            return;
        }
        super.onNewIntent(intent);
        a((Bundle) null, intent);
        this.d.ah.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.business.page.kingkong.KingKongActivity.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f59d561226c04a5404abcc860f59104", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f59d561226c04a5404abcc860f59104") : Boolean.valueOf(KingKongActivity.this.g);
            }
        };
        this.d.al.a((com.meituan.android.cube.pga.common.b<Void>) null);
        if (this.e != null) {
            KingKongViewModel kingKongViewModel = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = KingKongViewModel.a;
            if (PatchProxy.isSupport(objArr2, kingKongViewModel, changeQuickRedirect2, false, "98a99d0691e373757aea0d34ffc8d8c4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kingKongViewModel, changeQuickRedirect2, false, "98a99d0691e373757aea0d34ffc8d8c4");
            } else {
                kingKongViewModel.e.b((k) null);
            }
        }
    }

    private void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27078d9531f60719f253a1b64904636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27078d9531f60719f253a1b64904636");
        } else if (bundle == null) {
        } else {
            try {
                this.f.a(bundle);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.e("AppKingKongActivity", e.getLocalizedMessage(), new Object[0]);
            }
        }
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2333575b2e73dc785bb142ea02507435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2333575b2e73dc785bb142ea02507435");
            return;
        }
        super.onSaveInstanceState(bundle);
        try {
            KingkongInfo kingkongInfo = this.f;
            Object[] objArr2 = {bundle};
            ChangeQuickRedirect changeQuickRedirect2 = KingkongInfo.a;
            if (PatchProxy.isSupport(objArr2, kingkongInfo, changeQuickRedirect2, false, "970240450400670be5f60d64b939d3d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, kingkongInfo, changeQuickRedirect2, false, "970240450400670be5f60d64b939d3d6");
                return;
            }
            bundle.putLong("sorttype", kingkongInfo.i);
            bundle.putLong("categorytype", kingkongInfo.b);
            bundle.putStringArrayList("multifiltercodes", kingkongInfo.k);
            bundle.putParcelableArrayList("sliderfiltercodes", kingkongInfo.l);
            bundle.putLong("subcategorytype", kingkongInfo.g);
            bundle.putString("multifiltertext", kingkongInfo.m);
            bundle.putString("categorytext", kingkongInfo.c);
            bundle.putString("subcategorytext", kingkongInfo.h);
            bundle.putString("sorttext", kingkongInfo.j);
            bundle.putString("titletext", kingkongInfo.n);
            bundle.putBoolean("showfilter", kingkongInfo.o);
            bundle.putLong("navigate_type", kingkongInfo.d);
            bundle.putString("navigatetext", kingkongInfo.e);
            bundle.putParcelable("android:support:fragments", null);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("AppKingKongActivity", e.getLocalizedMessage(), new Object[0]);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e347aceee35091bde2ec788ef678abfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e347aceee35091bde2ec788ef678abfd");
            return;
        }
        super.onBackPressed();
        JudasManualManager.a(com.sankuai.waimai.business.page.common.constant.a.a).a("c_i5kxn8l").a(this).a();
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb0e5554799f37b7ef42901ff7ca0772", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb0e5554799f37b7ef42901ff7ca0772");
            return;
        }
        super.onStart();
        this.e.a(d.a.ON_START);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efbe879bbfb797e2d3662742d440b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efbe879bbfb797e2d3662742d440b54");
            return;
        }
        JudasManualManager.a("c_i5kxn8l", this);
        super.onResume();
        this.e.a(d.a.ON_RESUME);
        Metrics.getInstance().setScrollCustom(this);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7475fe13fd44aeb68910071859d62a75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7475fe13fd44aeb68910071859d62a75");
            return;
        }
        super.onPause();
        com.sankuai.waimai.business.page.home.list.future.mach.d.a().b();
        this.e.a(d.a.ON_PAUSE);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a634bd9622fc03f28ec423fdb99ee60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a634bd9622fc03f28ec423fdb99ee60");
            return;
        }
        super.onStop();
        this.e.a(d.a.ON_STOP);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.PageActivity, com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e60800080daa52ac5d81a2cd8e4270bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e60800080daa52ac5d81a2cd8e4270bb");
            return;
        }
        super.onDestroy();
        this.e.a(d.a.ON_DESTROY);
        com.sankuai.waimai.business.page.kingkong.future.network.preload.b a = com.sankuai.waimai.business.page.kingkong.future.network.preload.b.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.kingkong.future.network.preload.b.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "214f47e0e6cccdcbdb2edcf8f92b9c32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "214f47e0e6cccdcbdb2edcf8f92b9c32");
        } else {
            if (a.c != null) {
                a.c.a();
            }
            if (a.d != null) {
                a.d.clear();
            }
        }
        com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a().e = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c64e6bf0052d07454aec17b7f44b1123", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c64e6bf0052d07454aec17b7f44b1123")).booleanValue() : super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, com.sankuai.waimai.foundation.core.base.activity.c
    public final Map<String, String> Z_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5f0232ba537874e5a1c4b6ca8f0d90c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5f0232ba537874e5a1c4b6ca8f0d90c");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page_id", "waimai_subcategory");
        hashMap.put("category_code", String.valueOf(this.f.b));
        return hashMap;
    }

    @Override // com.sankuai.waimai.foundation.core.base.activity.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Object[] objArr = {Integer.valueOf(i), keyEvent};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27ea66adfebd725ab30d92fea215d8ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27ea66adfebd725ab30d92fea215d8ec")).booleanValue() : super.onKeyDown(i, keyEvent);
    }
}
