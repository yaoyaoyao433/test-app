package com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox;

import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cube.pga.common.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.common.net.response.ChannelBannerInfoResponseV8;
import com.sankuai.waimai.business.page.home.head.recommendwords.alita.RefreshResponseData;
import com.sankuai.waimai.business.page.home.view.TextSwitchView;
import com.sankuai.waimai.business.page.kingkong.KingKongActivity;
import com.sankuai.waimai.business.page.kingkong.viewmodel.KingKongViewModel;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FloatSearchBoxBlock extends com.meituan.android.cube.pga.block.a<a, b, com.sankuai.waimai.business.page.kingkong.a> {
    public static ChangeQuickRedirect r;
    private View s;
    private RocksServerModel t;

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbc68f0c8821a637c88b9510d3634473", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbc68f0c8821a637c88b9510d3634473") : new a(m(), this.h);
    }

    @Keep
    public FloatSearchBoxBlock(com.sankuai.waimai.business.page.kingkong.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea106a0b244426d4d1141dded3fcbffe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea106a0b244426d4d1141dded3fcbffe");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e46be9821b3905d30f32d80eb412afa2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e46be9821b3905d30f32d80eb412afa2");
            return;
        }
        ((com.sankuai.waimai.business.page.kingkong.a) F()).P.a(new com.meituan.android.cube.pga.action.b<RocksServerModel>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.FloatSearchBoxBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(RocksServerModel rocksServerModel) {
                RefreshResponseData refreshResponseData;
                RocksServerModel rocksServerModel2 = rocksServerModel;
                Object[] objArr3 = {rocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c46a77ad757963e4299194efc3424c89", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c46a77ad757963e4299194efc3424c89");
                    return;
                }
                FloatSearchBoxBlock.this.t = rocksServerModel2;
                final a aVar2 = (a) FloatSearchBoxBlock.this.g;
                RocksServerModel rocksServerModel3 = FloatSearchBoxBlock.this.t;
                Object[] objArr4 = {rocksServerModel3};
                ChangeQuickRedirect changeQuickRedirect4 = a.d;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "a4b0e1e7df856160db68a9e39e5100a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "a4b0e1e7df856160db68a9e39e5100a3");
                    return;
                }
                RocksServerModel rocksServerModel4 = rocksServerModel3;
                if (rocksServerModel4 != null) {
                    try {
                        JsonObject jsonObject = (JsonObject) new JsonParser().parse(rocksServerModel4.stringData);
                        String str = "";
                        if (jsonObject != null && jsonObject.get("channel_search_words") != null) {
                            str = jsonObject.get("channel_search_words").getAsString();
                        }
                        refreshResponseData = (RefreshResponseData) new Gson().fromJson(str, new TypeToken<RefreshResponseData>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.a.3
                        }.getType());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (refreshResponseData != null || refreshResponseData.rollSearchKeyword == null) {
                    }
                    RollSearchKeyword rollSearchKeyword = refreshResponseData.rollSearchKeyword;
                    Object[] objArr5 = {rollSearchKeyword};
                    ChangeQuickRedirect changeQuickRedirect5 = a.d;
                    if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "dac8d06e3f922b9f9388aa97f877836f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "dac8d06e3f922b9f9388aa97f877836f");
                        return;
                    }
                    aVar2.r = 0;
                    aVar2.s = TextUtils.isEmpty(rollSearchKeyword.rcmdLogId) ? "" : rollSearchKeyword.rcmdLogId;
                    if (rollSearchKeyword == null) {
                        aVar2.t = null;
                        return;
                    }
                    final List<RecommendedSearchKeyword> list = rollSearchKeyword.rollKeywords;
                    if (list == null || list.size() == 0) {
                        aVar2.t = null;
                        return;
                    }
                    aVar2.t = list.get(0);
                    if (aVar2.t != null) {
                        aVar2.t.tgt_stids = rollSearchKeyword.tgtStids;
                        aVar2.t.sceneType = rollSearchKeyword.sceneType;
                    }
                    final ArrayList arrayList = new ArrayList();
                    final int i = rollSearchKeyword.eachShowNum;
                    final String str2 = rollSearchKeyword.sceneType;
                    final String str3 = rollSearchKeyword.tgtStids;
                    aVar2.g.setInterval(rollSearchKeyword.showTimeInterval);
                    aVar2.u = new ArrayList();
                    aVar2.g.post(new Runnable() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.a.4
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "09e32f5a0ec4c49f939b0c075d0cacaf", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "09e32f5a0ec4c49f939b0c075d0cacaf");
                                return;
                            }
                            TextView textView = (TextView) aVar2.g.getCurrentView();
                            for (int i2 = 0; i2 < list.size(); i2++) {
                                RecommendedSearchKeyword recommendedSearchKeyword = (RecommendedSearchKeyword) list.get(i2);
                                if (recommendedSearchKeyword != null) {
                                    recommendedSearchKeyword.sceneType = str2;
                                    recommendedSearchKeyword.tgt_stids = str3;
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(recommendedSearchKeyword);
                                    if (i > 1 && i2 < list.size() - 1) {
                                        int i3 = i2 + 1;
                                        if (list.get(i3) != null) {
                                            TextPaint paint = textView.getPaint();
                                            if (textView.getWidth() > paint.measureText(recommendedSearchKeyword.viewKeyword + " | " + ((RecommendedSearchKeyword) list.get(i3)).viewKeyword)) {
                                                RecommendedSearchKeyword recommendedSearchKeyword2 = (RecommendedSearchKeyword) list.get(i3);
                                                recommendedSearchKeyword2.sceneType = str2;
                                                recommendedSearchKeyword2.tgt_stids = str3;
                                                arrayList2.add(recommendedSearchKeyword2);
                                                List list2 = arrayList;
                                                list2.add(recommendedSearchKeyword.viewKeyword + " | " + recommendedSearchKeyword2.viewKeyword);
                                                aVar2.u.add(arrayList2);
                                            }
                                        }
                                    }
                                    arrayList.add(recommendedSearchKeyword.viewKeyword);
                                    aVar2.u.add(arrayList2);
                                }
                            }
                            aVar2.g.a(arrayList);
                            aVar2.g.c();
                        }
                    });
                    aVar2.g.setTextFlipListener(new TextSwitchView.b() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.a.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.home.view.TextSwitchView.b
                        public final void a(String str4, int i2, int i3) {
                            Object[] objArr6 = {str4, Integer.valueOf(i2), Integer.valueOf(i3)};
                            ChangeQuickRedirect changeQuickRedirect6 = a;
                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e5bd35b0de58264f16583a5e37a8eb3f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e5bd35b0de58264f16583a5e37a8eb3f");
                            } else if (aVar2.u == null || i2 < 0 || i2 >= aVar2.u.size()) {
                            } else {
                                aVar2.r = i2;
                                aVar2.t = aVar2.u.get(i2).get(0);
                                if (i3 == 0) {
                                    aVar2.e();
                                }
                            }
                        }
                    });
                    return;
                }
                refreshResponseData = null;
                if (refreshResponseData != null) {
                }
            }
        });
        KingKongViewModel kingKongViewModel = (KingKongViewModel) q.a(((com.sankuai.waimai.business.page.kingkong.a) F()).b()).a(KingKongViewModel.class);
        kingKongViewModel.b.a((KingKongActivity) ((com.sankuai.waimai.business.page.kingkong.a) F()).b(), new l<com.sankuai.waimai.business.page.kingkong.net.b>() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.FloatSearchBoxBlock.3
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable com.sankuai.waimai.business.page.kingkong.net.b bVar) {
                com.sankuai.waimai.business.page.kingkong.net.b bVar2 = bVar;
                boolean z = false;
                Object[] objArr3 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "88441bb703c1956106f09e9fc1ca2b24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "88441bb703c1956106f09e9fc1ca2b24");
                    return;
                }
                if (bVar2 != null) {
                    BaseResponse<ChannelBannerInfoResponseV8> baseResponse = bVar2.a;
                    if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != null) {
                        z = true;
                    }
                    if (z) {
                        FloatSearchBoxBlock.this.n = new b(bVar2.a.data.isNewBarStyle());
                        FloatSearchBoxBlock.this.I();
                    }
                }
                FloatSearchBoxBlock.this.n = new b(true);
                FloatSearchBoxBlock.this.I();
            }
        });
        Boolean a = kingKongViewModel.i.a();
        if (a == null || !a.booleanValue()) {
            return;
        }
        this.n = new b(true);
        I();
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c8a19a75074c9767804b28d710a6fd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c8a19a75074c9767804b28d710a6fd8");
            return;
        }
        super.s();
        if (this.g == 0 || ((a) this.g).a() == null) {
            return;
        }
        this.s = ((a) this.g).a().findViewById(R.id.action_bar_search_box);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.kingkong.view.searchbox.floatsearchbox.FloatSearchBoxBlock.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<RecommendedSearchKeyword> list;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "203554dc1b76532b23458527a2081576", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "203554dc1b76532b23458527a2081576");
                    return;
                }
                a aVar = (a) FloatSearchBoxBlock.this.g;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.d;
                if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "d2189fe2ba84144ffd7f4ceac0814415", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "d2189fe2ba84144ffd7f4ceac0814415");
                } else {
                    JudasManualManager.a("b_UDdde").a("c_i5kxn8l").a(KingKongActivity.class).b(aVar.a(true)).a();
                }
                com.meituan.android.cube.pga.common.b<List<RecommendedSearchKeyword>> bVar = ((com.sankuai.waimai.business.page.kingkong.a) FloatSearchBoxBlock.this.F()).N;
                a aVar2 = (a) FloatSearchBoxBlock.this.g;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a.d;
                if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "4b500f646393d388cd17cae1905b81d1", RobustBitConfig.DEFAULT_VALUE)) {
                    list = (List) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "4b500f646393d388cd17cae1905b81d1");
                } else {
                    list = (aVar2.u == null || aVar2.u.size() <= 0) ? null : aVar2.u.get(aVar2.r);
                }
                bVar.a((com.meituan.android.cube.pga.common.b<List<RecommendedSearchKeyword>>) list);
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ab4834f3f467bf79a829ce2b61dc69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ab4834f3f467bf79a829ce2b61dc69");
            return;
        }
        super.I();
        a aVar = (a) this.g;
        boolean booleanValue = ((b) this.n).e().booleanValue();
        Object[] objArr2 = {Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "8b39f31438240ce0ee2c74f19abea42c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "8b39f31438240ce0ee2c74f19abea42c");
            return;
        }
        KingkongInfo a = aVar.e.d.a();
        Boolean a2 = aVar.e.i.a();
        if (a != null && a.b == 910 && (a2 == null || !a2.booleanValue())) {
            aVar.f.setBackgroundColor(1358954495);
            ((TextView) aVar.g.getCurrentView()).setTextColor(-1);
            aVar.h.setImageResource(R.drawable.wm_common_ic_search_white);
        }
        aVar.j = booleanValue;
        if (aVar.j) {
            aVar.f.setVisibility(4);
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a3c450d057e6c75a1265a9e8b8b26c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a3c450d057e6c75a1265a9e8b8b26c");
            return;
        }
        d<Integer> a = ((com.sankuai.waimai.business.page.kingkong.a) F()).K.a();
        int c = a == null ? 0 : a.c();
        d<Integer> a2 = ((com.sankuai.waimai.business.page.kingkong.a) F()).M.a();
        int c2 = a2 == null ? 0 : a2.c();
        a aVar = (a) this.g;
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(c), Integer.valueOf(c2)};
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6d401a2eb1b668062603136098bd3afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6d401a2eb1b668062603136098bd3afa");
            return;
        }
        if (aVar.q) {
            aVar.n = (aVar.m + g.a(com.meituan.android.singleton.b.a, 10.0f)) / aVar.m;
        }
        int i2 = (int) (i * aVar.n);
        aVar.k = c;
        aVar.l = i2;
        if (aVar.j) {
            return;
        }
        int a3 = (g.a(com.meituan.android.singleton.b.a) - g.a(com.meituan.android.singleton.b.a, 10.0f)) - aVar.k;
        int i3 = aVar.k - aVar.p;
        if (i2 < c2) {
            aVar.e.b(true);
            aVar.f.setVisibility(4);
            aVar.e.a(1.0f);
        } else if (i2 >= c2 && i2 < aVar.m + c2) {
            aVar.e.b(false);
            aVar.f.setVisibility(0);
            int i4 = i2 - c2;
            aVar.f.setTranslationY(-i4);
            float abs = Math.abs(i4) / aVar.m;
            aVar.f.setTranslationX((int) (i3 * abs));
            aVar.f.getLayoutParams().width = aVar.o - ((int) (Math.abs(aVar.o - a3) * abs));
            aVar.f.requestLayout();
            aVar.e.a(1.0f - abs);
        } else {
            aVar.f.setVisibility(0);
            aVar.f.setTranslationY(-aVar.m);
            aVar.f.setTranslationX(i3);
            aVar.f.getLayoutParams().width = a3;
            aVar.f.requestLayout();
            aVar.e.a(0.0f);
        }
        if (i2 <= aVar.m + c2) {
            aVar.e.a(Float.valueOf(1.0f));
        } else if (i2 <= aVar.m + c2 + g.a(com.meituan.android.singleton.b.a, 20.0f)) {
            aVar.e.a(Float.valueOf(1.0f - (((i2 - aVar.m) - c2) / g.a(com.meituan.android.singleton.b.a, 20.0f))));
        }
    }
}
