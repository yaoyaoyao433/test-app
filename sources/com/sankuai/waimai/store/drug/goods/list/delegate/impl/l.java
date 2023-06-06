package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.drug.goods.list.templet.drugselfbusiness.DrugSelfBusinessContainerBlock;
import com.sankuai.waimai.store.drug.goods.list.viewblocks.f;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.monitor.monitor.SGStorePageLoad;
import com.sankuai.waimai.store.util.w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class l extends c {
    public static ChangeQuickRedirect K;
    protected String L;
    protected int M;
    private com.sankuai.waimai.store.drug.goods.list.viewblocks.f N;
    private com.sankuai.waimai.store.drug.goods.list.viewblocks.e O;
    private int P;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final boolean n() {
        return false;
    }

    public l(@NonNull SCBaseActivity sCBaseActivity, int i) {
        super(sCBaseActivity, i);
        Object[] objArr = {sCBaseActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad7a9eecf2ae6dd1953eb7b929aa88bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad7a9eecf2ae6dd1953eb7b929aa88bc");
            return;
        }
        this.P = -1;
        this.M = 0;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "894df8969f2bb848fe70a9d304f69d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "894df8969f2bb848fe70a9d304f69d06");
            return;
        }
        super.a(fragmentActivity, bundle);
        this.N = new com.sankuai.waimai.store.drug.goods.list.viewblocks.f(this);
        this.N.createAndReplaceView(this.C, R.id.layout_poi_tip_container);
        this.O = new com.sankuai.waimai.store.drug.goods.list.viewblocks.e(this);
        p();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.a, com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141bfa31976bb0f9bc438736fb280cf0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141bfa31976bb0f9bc438736fb280cf0") : (w.g(this.x.b) || w.d(this.x.b) || w.f(this.x.b)) ? "c_crkfv64n" : w.c(this.x.b) ? "c_waimai_bwm78neq" : "c_waimai_qeknbhm9";
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.a
    public final Map<String, Object> j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c715c003ae22db13afe3eaf5f35be747", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c715c003ae22db13afe3eaf5f35be747");
        }
        HashMap hashMap = new HashMap();
        if (this.y != null && this.y.getIntent() != null) {
            hashMap.put("isFromSg", Boolean.valueOf(com.sankuai.waimai.platform.utils.f.a(this.y.getIntent(), "from_sg", false)));
            hashMap.put("isSpuTab", Integer.valueOf(this.M == 5 ? 1 : 0));
            hashMap.put("tabType", Integer.valueOf(this.M));
        }
        return hashMap;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ba0f1dcad7e871ef5888643726a708a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ba0f1dcad7e871ef5888643726a708a");
        } else {
            super.a(intent);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1cfd0b7622435519a01aa40a3230ffb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1cfd0b7622435519a01aa40a3230ffb");
        } else {
            super.f();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02bc43bfc8587512d4a30f4b038f2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02bc43bfc8587512d4a30f4b038f2bc");
            return;
        }
        super.g();
        if (this.z != null) {
            this.z.onResume();
        }
        com.sankuai.waimai.store.manager.judas.d.a(this.y);
        if (this.P != -1) {
            y();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84b5b7a7427f275b94b7ad0c7a243761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84b5b7a7427f275b94b7ad0c7a243761");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(this.P)};
        ChangeQuickRedirect changeQuickRedirect2 = K;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44813fd706d07fa1346b1cf7a66cc7b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44813fd706d07fa1346b1cf7a66cc7b3");
        } else {
            com.sankuai.waimai.store.manager.judas.d.d(this.y, b());
        }
        if (this.z != null) {
            this.z.onPause();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25d52497efab85bfc4af7982f3dfa0fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25d52497efab85bfc4af7982f3dfa0fb");
        } else {
            super.i();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a12f7c9c767ef2c5ef0d387b98c07ed9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a12f7c9c767ef2c5ef0d387b98c07ed9");
            return;
        }
        super.c();
        if (this.z != null) {
            this.z.onDestroy();
        }
        if (this.O != null) {
            this.O.onDestroy();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void a(String str, String str2, boolean z) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24c49cfa5e63e5b7dc8b835dd83eb0e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24c49cfa5e63e5b7dc8b835dd83eb0e1");
            return;
        }
        super.a(str, str2, z);
        com.sankuai.waimai.store.util.monitor.c.a(SGStorePageLoad.RequestAPIError, "", str);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final RestMenuResponse s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06311c13f45b9948364d64f4438c6bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (RestMenuResponse) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06311c13f45b9948364d64f4438c6bd");
        }
        Object a = com.sankuai.waimai.store.router.d.a(this.y.getIntent(), "poi_response");
        if (a == null || !(a instanceof RestMenuResponse)) {
            return null;
        }
        return (RestMenuResponse) a;
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public final void a(@NonNull RestMenuResponse restMenuResponse, @Nullable RestRecommendPoi restRecommendPoi) {
        Object[] objArr = {restMenuResponse, restRecommendPoi};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8972357001b2889b7c4dcc08f10dea51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8972357001b2889b7c4dcc08f10dea51");
            return;
        }
        this.s = true;
        if (restMenuResponse.getPoi() == null) {
            return;
        }
        super.a(restMenuResponse, restRecommendPoi);
        this.P = restMenuResponse.getPoi().isNewPage;
        this.L = restMenuResponse.pageScheme;
        d(restMenuResponse);
        final com.sankuai.waimai.store.drug.goods.list.viewblocks.f fVar = this.N;
        Poi poi = restMenuResponse.getPoi();
        JSONArray remindArray = restMenuResponse.getRemindArray();
        Object[] objArr2 = {poi, remindArray};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.f.c;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "08d4c0e3a1b0b00faa02dd4c4caf516e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "08d4c0e3a1b0b00faa02dd4c4caf516e");
        } else if (remindArray != null) {
            if (poi == null || poi.getState() != 3) {
                SCBaseActivity k = fVar.a.k();
                View view = fVar.d;
                TextView textView = (TextView) fVar.d.findViewById(R.id.txt_remind);
                ImageView imageView = (ImageView) fVar.d.findViewById(R.id.img_close);
                Object[] objArr3 = {remindArray, k, view, textView, imageView, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = f.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "05573d8c09651fba02c4d2277f1eb0e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "05573d8c09651fba02c4d2277f1eb0e8");
                } else {
                    f.a.a(Poi.Remind.fromJsonArray(remindArray), k, view, textView, imageView, true);
                }
            }
            ImageView imageView2 = (ImageView) fVar.d.findViewById(R.id.img_close);
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.f.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr4 = {view2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "89669e64fde85ce2d8dc1ac3fe318668", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "89669e64fde85ce2d8dc1ac3fe318668");
                        } else {
                            fVar.d.setVisibility(8);
                        }
                    }
                });
            }
        }
        com.sankuai.waimai.store.drug.goods.list.viewblocks.f fVar2 = this.N;
        Poi poi2 = restMenuResponse.getPoi();
        String b = b();
        Object[] objArr4 = {poi2, b};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.drug.goods.list.viewblocks.f.c;
        if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "f78abcec24c844d1e37d4c1109ecdc88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "f78abcec24c844d1e37d4c1109ecdc88");
        } else if (poi2 != null && !poi2.isInDelivery) {
            com.sankuai.waimai.store.manager.judas.b.b(b, "b_waimai_tyct7ww3_mv").a("poi_id", poi2.getOfficialPoiId()).a();
        }
        String a = aa.a(this.y.getIntent(), "errormsg", "");
        Object[] objArr5 = {a};
        ChangeQuickRedirect changeQuickRedirect5 = K;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5bf41ce80348b6e6ff9d5a703c8a4c30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5bf41ce80348b6e6ff9d5a703c8a4c30");
        } else if (!TextUtils.isEmpty(a)) {
            new CustomDialog.a(this.y).a(this.y.getString(R.string.wm_sc_dialog_title_tips)).b(a).a(com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_ok), (DialogInterface.OnClickListener) null).b();
        }
        int i = this.P;
        long g = this.x.g();
        String h = this.x.h();
        Object[] objArr6 = {Integer.valueOf(i), new Long(g), h};
        ChangeQuickRedirect changeQuickRedirect6 = K;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4286d814ef5172f780b41e33ab96cc23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4286d814ef5172f780b41e33ab96cc23");
        } else if (i == 1 || i == 2) {
            if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.PAGE_NEW_SUPERMARKET_MARKETING_REQUEST, false)) {
                a(3, g, h);
            }
        } else if (com.sankuai.waimai.store.config.j.h().a(SCConfigPath.PAGE_OLD_SUPERMARKET_MARKETING_REQUEST, false)) {
            a(4, g, h);
        }
        y();
        com.sankuai.waimai.store.util.monitor.c.a(SGStorePageLoad.Normal);
        if (restMenuResponse.navigationBars == null || restMenuResponse.navigationBars.isEmpty()) {
            return;
        }
        for (RestMenuResponse.b bVar : restMenuResponse.navigationBars) {
            if (bVar.d) {
                this.M = bVar.c;
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c
    public void a(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39062f163dbf763d1fb732c180ee0449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39062f163dbf763d1fb732c180ee0449");
            return;
        }
        super.a(restMenuResponse);
        if (restMenuResponse.getPoiState() == 3 || !this.u) {
            return;
        }
        this.B.a(true);
    }

    private void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4572a751121bcdb73a208c31d461e51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4572a751121bcdb73a208c31d461e51");
            return;
        }
        this.j.put("source_type", Integer.valueOf(this.g));
        this.j.put("source_id", this.h);
        this.j.put("mBuzType", Integer.valueOf(z()));
        this.j.put("source_page_id", this.l);
        this.j.put("source_event_id", this.o);
        this.j.put("source_attribute", this.p);
        this.j.put("source_ext", this.q);
        com.sankuai.waimai.store.manager.judas.d.b(this.y, b()).a(this.j).b("poi_id", this.x.b.getOfficialPoiId()).b("stid", this.x.b.abExpInfo).a();
        com.sankuai.waimai.store.manager.judas.d.a(this.y, b());
    }

    private int z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df1d71a92dfa0ee0a194cdaec6505c7d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df1d71a92dfa0ee0a194cdaec6505c7d")).intValue();
        }
        if (this.x == null || this.x.b == null) {
            return -999;
        }
        return this.x.b.mBuzType;
    }

    public void d(RestMenuResponse restMenuResponse) {
        boolean z = true;
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93a7bedb9c1d50bbd1400d329acb18de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93a7bedb9c1d50bbd1400d329acb18de");
            return;
        }
        Poi poi = restMenuResponse.getPoi();
        if (this.z != null) {
            this.z.onDestroy();
        }
        if (w.f(restMenuResponse.getPoi())) {
            this.z = new com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.c(this, e(restMenuResponse));
        } else if (w.g(restMenuResponse.getPoi())) {
            this.z = new DrugSelfBusinessContainerBlock(this);
        } else {
            if ((poi == null || poi.brandStory == null || poi.brandStory.type == 0) ? false : false) {
                this.z = new com.sankuai.waimai.store.drug.goods.list.viewblocks.d(this);
            } else {
                this.z = new com.sankuai.waimai.store.drug.goods.list.viewblocks.a(this);
            }
        }
        this.z.createAndReplaceView(this.C, R.id.layout_shop_root_scroll_container);
        this.z.a(this.C);
        b(restMenuResponse);
        if (this.I == 1 && u()) {
            com.sankuai.waimai.store.drug.goods.list.utils.a.b();
        }
    }

    public static boolean e(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = K;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c65e62dc6ba8fcdc08c8abc1ee8a863", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c65e62dc6ba8fcdc08c8abc1ee8a863")).booleanValue() : restMenuResponse != null && "1".equals(restMenuResponse.newPoiPage);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.impl.c, com.sankuai.waimai.store.drug.goods.list.delegate.a
    public final boolean a() {
        boolean z;
        boolean z2;
        boolean z3;
        String path;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = K;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e250926e0ff10368915475d0caf920f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e250926e0ff10368915475d0caf920f1")).booleanValue();
        }
        if (!super.a()) {
            final com.sankuai.waimai.store.drug.goods.list.viewblocks.e eVar = this.O;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.drug.goods.list.viewblocks.e.c;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "410d4b43a52edfd4b0cacd45f0ad45e3", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "410d4b43a52edfd4b0cacd45f0ad45e3")).booleanValue();
            } else {
                z = eVar.d && com.sankuai.waimai.store.notify.b.a(eVar.a.k(), (int) R.string.wm_sc_sold_out_spu_notify_text, new com.sankuai.waimai.store.notify.a() { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.notify.a
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "73821fc19d49a63030d5478113868a72", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "73821fc19d49a63030d5478113868a72");
                        } else {
                            e.a(eVar);
                        }
                    }

                    @Override // com.sankuai.waimai.store.notify.a
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cbc2c4ff54eeabcbb20f81e2f0aa5a54", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cbc2c4ff54eeabcbb20f81e2f0aa5a54");
                        } else {
                            eVar.a(2);
                        }
                    }

                    @Override // com.sankuai.waimai.store.notify.a
                    public final void c() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5e0d306516fedb5229d0b6bb411b9c53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5e0d306516fedb5229d0b6bb411b9c53");
                        } else {
                            eVar.a(1);
                        }
                    }
                }) == 3;
            }
            if (!z) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = K;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79ac739d4d684149f4f364ee8d10a7c0", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79ac739d4d684149f4f364ee8d10a7c0")).booleanValue();
                } else {
                    if (!TextUtils.isEmpty(this.L)) {
                        List<Activity> b = com.sankuai.waimai.store.util.b.b();
                        String str = this.L;
                        Object[] objArr4 = {b, str};
                        ChangeQuickRedirect changeQuickRedirect4 = K;
                        if (!PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "59dcf582a36dfe5ac3d92b3eeefde1f7", RobustBitConfig.DEFAULT_VALUE)) {
                            String path2 = Uri.parse(str).getPath();
                            int c2 = com.sankuai.shangou.stone.util.a.c(b);
                            int i = 0;
                            while (true) {
                                if (i >= c2) {
                                    z3 = false;
                                    break;
                                }
                                Activity activity = (Activity) com.sankuai.shangou.stone.util.a.a((List<Object>) b, i);
                                Object[] objArr5 = new Object[1];
                                objArr5[c] = activity;
                                ChangeQuickRedirect changeQuickRedirect5 = K;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "895230c2d56a11f9bd6198464d13fe15", RobustBitConfig.DEFAULT_VALUE)) {
                                    path = (String) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "895230c2d56a11f9bd6198464d13fe15");
                                } else {
                                    path = (activity == null || activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().getPath();
                                }
                                if (TextUtils.equals(path, path2)) {
                                    z3 = true;
                                    break;
                                }
                                i++;
                                c = 0;
                            }
                        } else {
                            z3 = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "59dcf582a36dfe5ac3d92b3eeefde1f7")).booleanValue();
                        }
                        if (!z3) {
                            com.sankuai.waimai.store.router.d.a().a(this.y, this.L);
                            this.y.overridePendingTransition(R.anim.wm_common_slide_in_from_left, R.anim.wm_sc_slide_out_to_right);
                            this.y.finish();
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }
}
