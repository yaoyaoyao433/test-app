package com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ViewStub;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.cube.pga.action.d;
import com.meituan.android.cube.pga.block.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.FeedBackMultiChoiceBlock;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.FeedBackEditBlock;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.empty.FeedBackEmptyBlock;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.FeedBackPoiItemBlock;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.FeedBackApi;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionBean;
import com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.bean.QuestionnaireBeanResponse;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends c<b, com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a> {
    public static ChangeQuickRedirect s;
    private com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.a A;
    private com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a B;
    private long C;
    public long t;
    public String u;
    public String v;
    public String w;
    public int x;
    public com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b y;
    private RecyclerView z;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7284f170c9f471217c8dae79aa1c619e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7284f170c9f471217c8dae79aa1c619e");
            return;
        }
        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.a aVar2 = aVar.A;
        FragmentActivity b = ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) aVar.F()).b();
        b.AbstractC1042b<BaseResponse> abstractC1042b = new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.8
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4aa32beba1755aa03b16bcc414cfc116", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4aa32beba1755aa03b16bcc414cfc116");
                    return;
                }
                if (a.this.B != null) {
                    a.this.B.H.a((com.meituan.android.cube.pga.common.b<Void>) null);
                }
                if (baseResponse != null && baseResponse.code == 0) {
                    if (a.this.B != null) {
                        a.this.B.O.a((com.meituan.android.cube.pga.common.b<Void>) null);
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                        long j = a.this.t;
                        Object[] objArr3 = {new Long(j)};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "d049113aadbd34e37a5d169df4c7ddf7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "d049113aadbd34e37a5d169df4c7ddf7");
                            return;
                        } else {
                            a2.f.put(Long.valueOf(j), Boolean.TRUE);
                            return;
                        }
                    }
                    return;
                }
                ae.b(((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) a.this.F()).b(), (baseResponse == null || TextUtils.isEmpty(baseResponse.msg)) ? "提交失败" : baseResponse.msg);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "954fabda0546ab9aa1a232162819e612", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "954fabda0546ab9aa1a232162819e612");
                    return;
                }
                ae.a((Activity) a.this.l(), "提交失败");
                if (a.this.B != null) {
                    a.this.B.H.a((com.meituan.android.cube.pga.common.b<Void>) null);
                }
            }
        };
        String str = aVar.A.b;
        long j = aVar.C;
        Object[] objArr2 = {b, abstractC1042b, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "62e0206916163c9dbd15d1f95605a62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "62e0206916163c9dbd15d1f95605a62f");
            return;
        }
        aVar2.a();
        com.sankuai.waimai.foundation.utils.log.a.b("mAnswers", aVar2.c, new Object[0]);
        if (!com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a().b()) {
            m.b(b, "您有必填题未填写");
        } else if (TextUtils.isEmpty(aVar2.c)) {
            m.b(b, "请填写问卷后再提交");
        } else {
            HashMap hashMap = new HashMap();
            aVar2.m.I.a((com.meituan.android.cube.pga.common.b<Void>) null);
            hashMap.put("bizLine", "1");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("terminal_type", Integer.valueOf(aVar2.i));
            hashMap2.put("entrance_show_page", Integer.valueOf(aVar2.d));
            hashMap2.put(Constants.Environment.KEY_VERSION_CODE, Integer.valueOf(aVar2.k));
            hashMap2.put("resource_id", aVar2.e);
            hashMap2.put(Constants.PRIVACY.KEY_LATITUDE, aVar2.h);
            hashMap2.put(Constants.PRIVACY.KEY_LONGITUDE, aVar2.g);
            hashMap2.put("version", aVar2.j);
            hashMap2.put("rank_trace_id", aVar2.f);
            hashMap.put("questionnaireId", str);
            hashMap.put("questionTotalType", Long.valueOf(j));
            hashMap.put("extra", new JSONObject(hashMap2).toString());
            hashMap.put("questionAnswerList", aVar2.c);
            new Gson().toJson(hashMap);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FeedBackApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FeedBackApi.class)).submit(hashMap), abstractC1042b, aVar2.l);
        }
    }

    public static /* synthetic */ boolean a(a aVar, List list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "dc1ae47d3775f16b789d11b8cab0078f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "dc1ae47d3775f16b789d11b8cab0078f")).booleanValue();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            QuestionBean questionBean = (QuestionBean) it.next();
            if (questionBean != null && (questionBean.questionType == 1 || questionBean.questionType == 2 || questionBean.questionType == 4 || questionBean.questionType == 5)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void f(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "27d25c1ceffcd53ab418e52b35bb3d87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "27d25c1ceffcd53ab418e52b35bb3d87");
        } else {
            aVar.B.L.a((com.meituan.android.cube.pga.common.b<Void>) null);
        }
    }

    public static /* synthetic */ void j(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "00134b6516e8524038946124c8f56b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "00134b6516e8524038946124c8f56b5f");
        } else if (aVar.y == null || aVar.z == null) {
        } else {
            aVar.z.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e518f1d52e7646634d498fc660afea0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e518f1d52e7646634d498fc660afea0");
                    } else {
                        a.this.y.aq_();
                    }
                }
            }, 400L);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c23bfcafb38f3002cc576a42908616", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c23bfcafb38f3002cc576a42908616") : new b((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) F());
    }

    public a(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de2660f53916ee9b21a737b9e55443e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de2660f53916ee9b21a737b9e55443e");
        } else if (aVar != null) {
            this.B = aVar;
            aVar.F.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {r11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7e31f892445ef80955aaa2f5c0335d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7e31f892445ef80955aaa2f5c0335d4");
                    } else {
                        a.a(a.this);
                    }
                }
            });
            aVar.M.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {r11};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15fa32d8be4bba8ef7eff8e0390af6be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15fa32d8be4bba8ef7eff8e0390af6be");
                    } else {
                        a.this.a(a.this.t, a.this.x);
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.c, com.meituan.android.cube.pga.block.a
    /* renamed from: N */
    public final com.meituan.android.cube.pga.view.b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553ecc2e383a5d91487f73b35e9ba5bb", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553ecc2e383a5d91487f73b35e9ba5bb") : new com.meituan.android.cube.pga.view.b(m(), this.h) { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.3
            public static ChangeQuickRedirect e;

            @Override // com.meituan.android.cube.pga.view.b, com.meituan.android.cube.pga.view.a
            @Nullable
            /* renamed from: e */
            public final RecyclerView c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f22d032658f4ee34d1cc6e8009c5fc8", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f22d032658f4ee34d1cc6e8009c5fc8") : new RecyclerView(a.this.m());
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.c, com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "552ac10de8e2cccaa6f86abc6f49df1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "552ac10de8e2cccaa6f86abc6f49df1c");
            return;
        }
        super.s();
        this.z = ((com.meituan.android.cube.pga.view.b) this.g).a();
        this.z.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.4
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1bbc2aa68cb558a8ed95107204dfb0b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1bbc2aa68cb558a8ed95107204dfb0b2");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b bVar = a.this.y;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "415830f82bd0c78d3c4441638f76d05f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "415830f82bd0c78d3c4441638f76d05f");
                } else if (bVar.b == null || bVar.d == null) {
                } else {
                    RecyclerView.LayoutManager layoutManager = bVar.b.getLayoutManager();
                    int i4 = -1;
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        i4 = linearLayoutManager.findFirstVisibleItemPosition();
                        i3 = linearLayoutManager.findLastVisibleItemPosition();
                    } else {
                        i3 = -1;
                    }
                    bVar.c(i4);
                    bVar.d(i3);
                }
            }
        });
        this.z.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "592f789fdd16ecc309118d2e1349bbf9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "592f789fdd16ecc309118d2e1349bbf9");
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b bVar = a.this.y;
                Object[] objArr3 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "a478bd431bbaac89fb5a43c20d605f10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "a478bd431bbaac89fb5a43c20d605f10");
                } else if (bVar.b == null || bVar.d == null || i != 0) {
                } else {
                    bVar.b();
                }
            }

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr2 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "800daf296281d9f4caa25692ffdb135f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "800daf296281d9f4caa25692ffdb135f");
                } else {
                    super.onScrolled(recyclerView, i, i2);
                }
            }
        });
        int a = g.a(m(), 10.0f);
        this.z.setPadding(a, 0, a, 0);
    }

    public void a(final long j, final int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc04f7ca3f44dafd478f204d4f74e0b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc04f7ca3f44dafd478f204d4f74e0b0");
            return;
        }
        this.A = new com.sankuai.waimai.business.page.home.list.future.feedbackdialog.network.a(a((Context) l()), this.B);
        this.B.N.b = new d() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "088e7c2a00b786d1f836fe45462453e4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "088e7c2a00b786d1f836fe45462453e4") : a.this.A;
            }
        };
        this.A.a(i, j, new b.AbstractC1042b<QuestionnaireBeanResponse>() { // from class: com.sankuai.waimai.business.page.home.list.future.feedbackdialog.list.a.7
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                QuestionnaireBeanResponse questionnaireBeanResponse = (QuestionnaireBeanResponse) obj;
                Object[] objArr2 = {questionnaireBeanResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9aba65ecfb98072b445655ec26cc287f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9aba65ecfb98072b445655ec26cc287f");
                } else if (questionnaireBeanResponse == null || questionnaireBeanResponse.questionnaire == null || questionnaireBeanResponse.code != 0) {
                    a.f(a.this);
                } else {
                    QuestionnaireBeanResponse.QuestionnaireBean questionnaireBean = questionnaireBeanResponse.questionnaire;
                    if (questionnaireBean != null) {
                        a.this.A.e = a.this.w;
                        a.this.A.f = a.this.v;
                        a.this.A.b = questionnaireBean.project_id;
                        a.this.A.d = i;
                        a.this.C = questionnaireBean.questionTotalType;
                        List<QuestionBean> questions = questionnaireBean.getQuestions();
                        if (com.sankuai.waimai.foundation.utils.d.a(questions) || !a.a(a.this, questions)) {
                            a.f(a.this);
                            return;
                        }
                        a.this.B.K.a((com.meituan.android.cube.pga.common.b<Void>) null);
                        a.j(a.this);
                        com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a a2 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a();
                        long j2 = j;
                        int i2 = i;
                        Object[] objArr3 = {new Long(j2), Integer.valueOf(i2), questionnaireBeanResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.submit.a.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "89328e5b2370748476000eb8a07a4035", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "89328e5b2370748476000eb8a07a4035");
                        } else {
                            a2.e.put(a2.b(j2, i2), questionnaireBeanResponse);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(a.this.t);
                        String sb2 = sb.toString();
                        FragmentActivity b = ((com.sankuai.waimai.business.page.home.list.future.feedbackdialog.a) a.this.F()).b();
                        Object[] objArr4 = {sb2, "1", b};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d3c9c777eb9641cb09018e6cd97c1ea2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d3c9c777eb9641cb09018e6cd97c1ea2");
                        } else {
                            JudasManualManager.b("b_waimai_az1grxci_mv").a(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.expose.a.b).a(b).a("survey_id", sb2).a("survey_type", "1").a();
                        }
                        a.this.z.setItemViewCacheSize(questions.size());
                        b bVar = (b) a.this.n;
                        long j3 = a.this.t;
                        Object[] objArr5 = {new Long(j3)};
                        ChangeQuickRedirect changeQuickRedirect5 = b.p;
                        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "d01452113c59b776ebbe2a4f41f6ed57", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "d01452113c59b776ebbe2a4f41f6ed57");
                        } else {
                            bVar.r = j3;
                        }
                        b bVar2 = (b) a.this.n;
                        Object[] objArr6 = {questions};
                        ChangeQuickRedirect changeQuickRedirect6 = b.p;
                        if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "84794a530bb676d3804d9417ca6202f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "84794a530bb676d3804d9417ca6202f4");
                        } else if (!com.sankuai.waimai.foundation.utils.d.a(questions)) {
                            bVar2.a(questions);
                            if (!com.sankuai.waimai.foundation.utils.d.a(bVar2.q)) {
                                bVar2.q.add(new com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.empty.a(""));
                            }
                        }
                        a.this.I();
                        return;
                    }
                    a.f(a.this);
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6e05784014b62fc44d58c2680c61358", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6e05784014b62fc44d58c2680c61358");
                } else {
                    a.f(a.this);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.c
    public final Map<Class, Class> M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f14d27e4249d81d7d9bc84ea068a42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f14d27e4249d81d7d9bc84ea068a42");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.checkbox.b.class, FeedBackMultiChoiceBlock.class);
        hashMap.put(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.edit.a.class, FeedBackEditBlock.class);
        hashMap.put(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.poi.c.class, FeedBackPoiItemBlock.class);
        hashMap.put(com.sankuai.waimai.business.page.home.list.future.feedbackdialog.item.empty.a.class, FeedBackEmptyBlock.class);
        return hashMap;
    }

    private String a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "534d3e6f9574b5c6edeca859633977f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "534d3e6f9574b5c6edeca859633977f7");
        }
        if (context instanceof BaseActivity) {
            return ((BaseActivity) context).w();
        }
        return null;
    }

    public final void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "887934e419dc4bd91bf3dafca3cceff2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "887934e419dc4bd91bf3dafca3cceff2");
        } else {
            super.aX_();
        }
    }
}
