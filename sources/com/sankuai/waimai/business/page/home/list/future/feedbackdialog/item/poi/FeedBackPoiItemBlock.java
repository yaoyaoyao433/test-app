package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.Answer;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.container.e;
import com.sankuai.waimai.mach.manager.load.a;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FeedBackPoiItemBlock extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, c, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect r;
    private LinearLayout A;
    private LinearLayout B;
    private Map<String, String> C;
    private Map<String, String> D;
    private Map<String, String> E;
    private Map<String, String> F;
    private long G;
    private long H;
    private long I;
    private long J;
    private com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a K;
    private int L;
    private boolean M;
    private boolean N;
    private boolean O;
    private TextView s;
    private TextView t;
    private a u;
    private InterceptLinearLayout v;
    private ChildRecylcerView w;
    private b x;
    private TextView y;
    private TextView z;

    public static /* synthetic */ boolean a(FeedBackPoiItemBlock feedBackPoiItemBlock, boolean z) {
        feedBackPoiItemBlock.M = true;
        return true;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6243de7bfa410e1f53350ebc60892bd7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6243de7bfa410e1f53350ebc60892bd7") : new com.meituan.android.cube.pga.view.a(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_page_home_feedback_poi_item;
            }
        };
    }

    @Keep
    public FeedBackPoiItemBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "441e8f6f28efc6efcddd9514ecd9727b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "441e8f6f28efc6efcddd9514ecd9727b");
            return;
        }
        this.M = false;
        this.N = false;
        this.O = false;
        this.K = aVar;
    }

    @Keep
    public FeedBackPoiItemBlock(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d45e63287fb0f026553cde1d470f546d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d45e63287fb0f026553cde1d470f546d");
            return;
        }
        this.M = false;
        this.N = false;
        this.O = false;
        this.K = aVar;
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        String w;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4cd8348eb619480e6fa0d7653bc1ba6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4cd8348eb619480e6fa0d7653bc1ba6");
            return;
        }
        super.s();
        this.s = (TextView) this.g.a().findViewById(R.id.tv_title);
        this.t = (TextView) this.g.a().findViewById(R.id.tv_sub_title);
        this.v = (InterceptLinearLayout) this.g.a().findViewById(R.id.layout_mach_container);
        FragmentActivity b = ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) F()).b();
        Context m = m();
        Object[] objArr2 = {m};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00af1ecde178513bffb6d4310c7dd355", RobustBitConfig.DEFAULT_VALUE)) {
            w = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00af1ecde178513bffb6d4310c7dd355");
        } else {
            w = m instanceof BaseActivity ? ((BaseActivity) m).w() : null;
        }
        this.u = new a(b, w);
        this.u.a(this.v, "home_feed_back", "waimai");
        this.y = (TextView) this.g.a().findViewById(R.id.tv_like);
        this.z = (TextView) this.g.a().findViewById(R.id.tv_dislike);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d051c397e57d52b386890a5bd0b44fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d051c397e57d52b386890a5bd0b44fe4");
        } else {
            int a = g.a(com.meituan.android.singleton.b.a, 20.0f);
            Drawable drawable = l().getResources().getDrawable(R.drawable.wm_page_feedbak_like_selector);
            drawable.setBounds(0, 0, a, a);
            Drawable drawable2 = l().getResources().getDrawable(R.drawable.wm_page_feedbak_dislike_selector);
            drawable2.setBounds(0, 0, a, a);
            this.y.setCompoundDrawables(drawable, null, null, null);
            this.z.setCompoundDrawables(drawable2, null, null, null);
        }
        this.A = (LinearLayout) this.g.a().findViewById(R.id.ll_like);
        this.B = (LinearLayout) this.g.a().findViewById(R.id.ll_dislike);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = r;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5f23603b7dccd8b651d21d69b8a00e84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5f23603b7dccd8b651d21d69b8a00e84");
        } else {
            this.w = (ChildRecylcerView) this.g.a().findViewById(R.id.rv_poi_question);
            this.w.setLayoutManager(new LinearLayoutManager(m(), 1, false));
            this.x = new b();
            this.w.setAdapter(this.x);
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = r;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4f34e6fa276815819f0265af1dcafd4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4f34e6fa276815819f0265af1dcafd4e");
        } else {
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b2b4b9fdc3ba4bae800bbe918001e452", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b2b4b9fdc3ba4bae800bbe918001e452");
                    } else if (FeedBackPoiItemBlock.this.A.isSelected()) {
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(FeedBackPoiItemBlock.this.M());
                        FeedBackPoiItemBlock.this.A.setSelected(false);
                        FeedBackPoiItemBlock.this.x.a(FeedBackPoiItemBlock.this.C, FeedBackPoiItemBlock.this.E, 2, FeedBackPoiItemBlock.this.G, (String) FeedBackPoiItemBlock.this.y.getTag(), FeedBackPoiItemBlock.this.L, true);
                        if (FeedBackPoiItemBlock.this.w.getVisibility() == 0) {
                            FeedBackPoiItemBlock.this.w.setVisibility(8);
                        } else {
                            FeedBackPoiItemBlock.this.w.setVisibility(0);
                        }
                    } else {
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(FeedBackPoiItemBlock.this.M(), (String) FeedBackPoiItemBlock.this.y.getTag());
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a(FeedBackPoiItemBlock.this.b("1"), ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) FeedBackPoiItemBlock.this.F()).b());
                        FeedBackPoiItemBlock.this.A.setSelected(true);
                        FeedBackPoiItemBlock.this.B.setSelected(false);
                        FeedBackPoiItemBlock.this.w.setVisibility(0);
                        FeedBackPoiItemBlock.this.x.a(FeedBackPoiItemBlock.this.C, FeedBackPoiItemBlock.this.E, 2, FeedBackPoiItemBlock.this.G, (String) FeedBackPoiItemBlock.this.y.getTag(), FeedBackPoiItemBlock.this.L, true);
                    }
                }
            });
            this.B.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b469492c86d23239dfd2a9424eb964b6", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b469492c86d23239dfd2a9424eb964b6");
                    } else if (FeedBackPoiItemBlock.this.B.isSelected()) {
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(FeedBackPoiItemBlock.this.M());
                        FeedBackPoiItemBlock.this.B.setSelected(false);
                        if (FeedBackPoiItemBlock.this.w.getVisibility() == 0) {
                            FeedBackPoiItemBlock.this.w.setVisibility(8);
                        } else {
                            FeedBackPoiItemBlock.this.w.setVisibility(0);
                        }
                        FeedBackPoiItemBlock.this.x.a(FeedBackPoiItemBlock.this.D, FeedBackPoiItemBlock.this.F, 2, FeedBackPoiItemBlock.this.G, (String) FeedBackPoiItemBlock.this.z.getTag(), FeedBackPoiItemBlock.this.L, true);
                    } else {
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().a(FeedBackPoiItemBlock.this.M(), (String) FeedBackPoiItemBlock.this.z.getTag());
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a(FeedBackPoiItemBlock.this.b("0"), ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) FeedBackPoiItemBlock.this.F()).b());
                        FeedBackPoiItemBlock.this.A.setSelected(false);
                        FeedBackPoiItemBlock.this.B.setSelected(true);
                        FeedBackPoiItemBlock.this.w.setVisibility(0);
                        FeedBackPoiItemBlock.this.x.a(FeedBackPoiItemBlock.this.D, FeedBackPoiItemBlock.this.F, 2, FeedBackPoiItemBlock.this.G, (String) FeedBackPoiItemBlock.this.z.getTag(), FeedBackPoiItemBlock.this.L, true);
                    }
                }
            });
        }
        this.u.a(new e() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void c() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9a75ae8bd59524320b18871b96f81d41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9a75ae8bd59524320b18871b96f81d41");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("mMachCoBundle", "onInputParamsError", new Object[0]);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void a() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "dfaa774a6156b4b5c051fa0c8b6f4da7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "dfaa774a6156b4b5c051fa0c8b6f4da7");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("mMachCoBundle", "onMachRenderFailure", new Object[0]);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void b() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b2742a2a3ad423c86a3b27011e79e122", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b2742a2a3ad423c86a3b27011e79e122");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("mMachCoBundle", "onMachBundleLoadFailure", new Object[0]);
                }
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void d() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "5775266ce37544e7acea7b39901057e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "5775266ce37544e7acea7b39901057e3");
                    return;
                }
                if (FeedBackPoiItemBlock.this.A != null) {
                    FeedBackPoiItemBlock.this.A.setVisibility(0);
                }
                if (FeedBackPoiItemBlock.this.B != null) {
                    FeedBackPoiItemBlock.this.B.setVisibility(0);
                }
                FeedBackPoiItemBlock.this.v.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.2.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr7 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect7 = a;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5b239b302dce063c5fc93128d9373568", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5b239b302dce063c5fc93128d9373568");
                            return;
                        }
                        FeedBackPoiItemBlock.this.v.measure(0, 0);
                        int measuredHeight = FeedBackPoiItemBlock.this.v.getMeasuredHeight();
                        if (FeedBackPoiItemBlock.this.w != null) {
                            FeedBackPoiItemBlock.this.w.getLayoutParams().height = measuredHeight;
                        }
                        FeedBackPoiItemBlock.a(FeedBackPoiItemBlock.this, true);
                        if (FeedBackPoiItemBlock.this.N) {
                            FeedBackPoiItemBlock.this.N();
                        } else if (FeedBackPoiItemBlock.this.O) {
                            FeedBackPoiItemBlock.this.O();
                        }
                    }
                });
            }

            @Override // com.sankuai.waimai.mach.container.e, com.sankuai.waimai.mach.container.d
            public final void e() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3ed89118f5d665322d4b192da7ecd416", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3ed89118f5d665322d4b192da7ecd416");
                } else {
                    com.sankuai.waimai.foundation.utils.log.a.b("mMachCoBundle", "onMachRenderSuccess", new Object[0]);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        JSONObject optJSONObject;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59c9fa9635eaaa070aa65a5c11a11ac7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59c9fa9635eaaa070aa65a5c11a11ac7");
            return;
        }
        super.I();
        QuestionBean e = ((c) this.n).e();
        RocksServerModel rocksServerModel = ((c) this.n).q;
        if (e == null || rocksServerModel == null) {
            return;
        }
        this.G = e.questionId;
        boolean z = ((c) this.n).p;
        this.L = ((c) this.n).r;
        this.s.setText(e.questionTitle);
        if (e.requiredField) {
            this.s.setText(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.util.a.a(this.s.getContext(), e.questionTitle));
        } else {
            this.s.setText(e.questionTitle);
        }
        String str = rocksServerModel.templateId;
        String str2 = rocksServerModel.stringData;
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1202785b35b4fd15073911c27cebd3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1202785b35b4fd15073911c27cebd3ba");
        } else {
            final Map<String, Object> a = com.sankuai.waimai.mach.utils.b.a(str2);
            com.sankuai.waimai.mach.manager.a.a();
            a.C1015a c1015a = new a.C1015a();
            c1015a.b = str;
            c1015a.d = "home_feed_back";
            c1015a.e = "waimai";
            this.u.a(c1015a.a(MetricsAnrManager.ANR_THRESHOLD).a(), new com.sankuai.waimai.mach.container.c() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.cache.e eVar) {
                    Object[] objArr3 = {eVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3dfdfcc4c30569eeb970810c0491fd2c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3dfdfcc4c30569eeb970810c0491fd2c");
                    } else {
                        FeedBackPoiItemBlock.this.u.a(eVar, a, com.sankuai.waimai.platform.b.A().l() - g.a(com.meituan.android.singleton.b.a, 20.0f), 0);
                    }
                }

                @Override // com.sankuai.waimai.mach.container.c
                public final void a(@NonNull com.sankuai.waimai.mach.manager.load.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf9acaa583a3e38acd1527806c9c3d79", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf9acaa583a3e38acd1527806c9c3d79");
                        return;
                    }
                    com.sankuai.waimai.foundation.utils.log.a.b("mMachCoBundle", "LoadException: " + bVar, new Object[0]);
                }
            });
        }
        String str3 = rocksServerModel.stringData;
        Object[] objArr3 = {str3};
        ChangeQuickRedirect changeQuickRedirect3 = r;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9290a4c57994726a1bc192f2f870152b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9290a4c57994726a1bc192f2f870152b");
        } else if (!TextUtils.isEmpty(str3)) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                if (jSONObject.has("wm_poi_id")) {
                    this.H = jSONObject.optLong("wm_poi_id");
                }
                if (this.H == 0 && jSONObject.has("poi_info")) {
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("poi_info");
                    if (optJSONObject2.has("wm_poi_id")) {
                        this.H = optJSONObject2.optLong("wm_poi_id");
                    }
                }
                if (jSONObject.has("product_info") && (optJSONObject = jSONObject.optJSONObject("product_info")) != null) {
                    if (optJSONObject.has("sku_id")) {
                        this.J = optJSONObject.optLong("sku_id");
                    }
                    if (optJSONObject.has("spu_id")) {
                        this.I = optJSONObject.optLong("spu_id");
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        a(e.getMapAnswers());
        if (z) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = r;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b53f682aa15e698313933fa5cee4a5b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b53f682aa15e698313933fa5cee4a5b3");
                return;
            }
            this.s.setVisibility(0);
            this.t.setVisibility(0);
            return;
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = r;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7ca198141d7ee2e15620603f52ae34d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7ca198141d7ee2e15620603f52ae34d7");
            return;
        }
        this.s.setVisibility(8);
        this.t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d59babd73656e16168ff8c0213c66254", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d59babd73656e16168ff8c0213c66254");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append(this.H);
        sb.append(this.J);
        sb.append(this.I);
        return sb.toString();
    }

    private void a(Map<String, Answer> map) {
        String str;
        List<Answer.SecondAnswerDTO> list;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8bb14e3c2841d7a5bd13fcd3140a6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8bb14e3c2841d7a5bd13fcd3140a6c0");
        } else if (map != null) {
            int i = 0;
            for (String str2 : map.keySet()) {
                Answer answer = map.get(str2);
                if (answer != null) {
                    try {
                        str = answer.qAnsText;
                        list = answer.secondAnswer;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (list != null) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            Answer.SecondAnswerDTO secondAnswerDTO = list.get(i2);
                            if (secondAnswerDTO != null) {
                                if (i == 0) {
                                    if (this.C == null) {
                                        this.C = new HashMap();
                                    }
                                    if (this.E == null) {
                                        this.E = new HashMap();
                                    }
                                    Map<String, String> map2 = this.E;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(i2);
                                    map2.put(sb.toString(), answer.qAnsId);
                                    Map<String, String> map3 = this.C;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i2);
                                    map3.put(sb2.toString(), secondAnswerDTO.qAnsText);
                                } else if (i == 1) {
                                    if (this.D == null) {
                                        this.D = new HashMap();
                                    }
                                    if (this.F == null) {
                                        this.F = new HashMap();
                                    }
                                    Map<String, String> map4 = this.F;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(i2);
                                    map4.put(sb3.toString(), answer.qAnsId);
                                    Map<String, String> map5 = this.D;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(i2);
                                    map5.put(sb4.toString(), secondAnswerDTO.qAnsText);
                                }
                            }
                        }
                        if (i == 0) {
                            this.y.setText(str);
                            this.y.setTag(str2);
                            if (TextUtils.equals(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b(M()), str2)) {
                                O();
                            }
                        } else if (i == 1) {
                            this.z.setText(str);
                            this.z.setTag(str2);
                            if (TextUtils.equals(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b(M()), str2)) {
                                N();
                            }
                        }
                        i++;
                        if (i > 1) {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9455a947761b303b3bebe63e6854dfd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9455a947761b303b3bebe63e6854dfd2");
        } else if (this.M) {
            this.B.setSelected(true);
            this.A.setSelected(false);
            this.w.setVisibility(0);
            this.x.a(this.D, this.F, 2, this.G, (String) this.z.getTag(), this.L, false);
        } else {
            this.N = true;
            this.O = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b7c0de85960e576e575fb6ca78836d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b7c0de85960e576e575fb6ca78836d8");
        } else if (this.M) {
            this.A.setSelected(true);
            this.B.setSelected(false);
            this.w.setVisibility(0);
            this.x.a(this.C, this.E, 2, this.G, (String) this.y.getTag(), this.L, false);
        } else {
            this.N = false;
            this.O = true;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75d09b72cd779dfd3c16c931b4174b93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75d09b72cd779dfd3c16c931b4174b93");
            return;
        }
        super.y();
        Map<String, Object> b = b("");
        FragmentActivity b2 = ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) F()).b();
        Object[] objArr2 = {b, b2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "5efcc791c3c34a144c770c715656e764", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "5efcc791c3c34a144c770c715656e764");
        } else {
            JudasManualManager.b("b_waimai_u40dm6je_mv").a(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.b).a(b2).a(b).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22237138755da030df8c15be3cecfd73", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22237138755da030df8c15be3cecfd73");
        }
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.a aVar = this.K.N.a().b;
        if (aVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("opt_index", str);
        }
        hashMap.put("survey_id", aVar.b);
        hashMap.put("survey_type", "1");
        hashMap.put("rank_trace_id", aVar.f);
        hashMap.put("index", Integer.valueOf(this.L));
        hashMap.put("resource_id", aVar.e);
        if (this.H != 0) {
            hashMap.put("poi_id", Long.valueOf(this.H));
        }
        if (this.I != 0) {
            hashMap.put("spu_id", Long.valueOf(this.I));
        }
        if (this.J != 0) {
            hashMap.put("sku_id", Long.valueOf(this.J));
        }
        return hashMap;
    }
}
