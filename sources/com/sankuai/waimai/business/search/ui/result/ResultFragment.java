package com.sankuai.waimai.business.search.ui.result;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.entity.ExposeAction;
import com.google.gson.Gson;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.recce.props.gens.IsShow;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.metrics.traffic.report.BusinessCodeUtil;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.adapterdelegates.e;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.WaimaiSearchService;
import com.sankuai.waimai.business.search.common.data.b;
import com.sankuai.waimai.business.search.common.message.a;
import com.sankuai.waimai.business.search.common.util.NoxSp;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.k;
import com.sankuai.waimai.business.search.common.util.m;
import com.sankuai.waimai.business.search.common.view.EasterEggLayout;
import com.sankuai.waimai.business.search.common.view.StickyContainerFrameLayout;
import com.sankuai.waimai.business.search.datatype.CategoryFilterData;
import com.sankuai.waimai.business.search.datatype.CommonMachData;
import com.sankuai.waimai.business.search.datatype.FilterNoResultRemindInfoData;
import com.sankuai.waimai.business.search.datatype.ForbiddenInfo;
import com.sankuai.waimai.business.search.datatype.GuideQueryCard;
import com.sankuai.waimai.business.search.datatype.GuideQueryData;
import com.sankuai.waimai.business.search.datatype.NoResultRemindInfoData;
import com.sankuai.waimai.business.search.datatype.QueryCorrect;
import com.sankuai.waimai.business.search.global.filterbar.SearchLoadConfig;
import com.sankuai.waimai.business.search.global.filterbar.f;
import com.sankuai.waimai.business.search.model.CommonPageStyleConfig;
import com.sankuai.waimai.business.search.model.DrugImEntranceEntity;
import com.sankuai.waimai.business.search.model.ExpAbInfo;
import com.sankuai.waimai.business.search.model.GlobalPageResponse;
import com.sankuai.waimai.business.search.model.GlobalSearchCouponCard;
import com.sankuai.waimai.business.search.model.OasisModule;
import com.sankuai.waimai.business.search.model.PrescriptionRemindInfo;
import com.sankuai.waimai.business.search.ui.BaseSearchFragment;
import com.sankuai.waimai.business.search.ui.GlobalSearchActivity;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.business.search.ui.result.behavior.SearchStickyContainerBehavior;
import com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout;
import com.sankuai.waimai.business.search.ui.result.guideQuery.d;
import com.sankuai.waimai.business.search.ui.result.guideQuery.e;
import com.sankuai.waimai.business.search.ui.result.mach.prerender.c;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.imbase.manager.d;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.mach.lifecycle.c;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.platform.monitor.DovePageMonitor;
import com.sankuai.waimai.platform.preload.f;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.waimai.platform.widget.filterbar.domain.model.SearchStatisticsData;
import com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController;
import com.sankuai.waimai.platform.widget.filterbar.view.model.SliderSelectData;
import com.sankuai.waimai.pouch.model.PouchDynamicAd;
import com.sankuai.waimai.pouch.viewmodel.PouchViewModel;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ResultFragment extends BaseSearchFragment implements b.a, f, com.sankuai.waimai.foundation.location.v2.listener.c {
    public static ChangeQuickRedirect d;
    private int A;
    private int B;
    private com.sankuai.waimai.business.search.ui.result.c C;
    private com.sankuai.waimai.business.search.common.data.d D;
    private com.sankuai.waimai.business.search.ui.actionbar.b I;
    private ViewGroup J;
    private ViewGroup K;
    private StatisticsRecyclerView L;
    private LinearLayout M;
    private ImageView N;
    private com.sankuai.waimai.business.search.ui.result.im.b O;
    private DrugImEntranceEntity P;
    private ImageView Q;
    private TextView R;
    private ImageView S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private boolean Y;
    private String Z;
    private com.sankuai.waimai.business.search.ui.result.guideQuery.b aA;
    private boolean aB;
    private RecyclerView aC;
    private com.sankuai.waimai.business.search.ui.result.guideQuery.e aD;
    private LinearLayout aE;
    private LinearLayout aF;
    private LinearLayout aG;
    private View aH;
    private RecyclerView aI;
    private com.sankuai.waimai.business.search.ui.result.guideQuery.d aJ;
    private String aK;
    private int aL;
    private OasisModule aM;
    private LinearLayout aN;
    private com.sankuai.waimai.business.search.ui.result.coupon.a aO;
    private OasisModule aP;
    private BroadcastReceiver aQ;
    private BroadcastReceiver aR;
    private BroadcastReceiver aS;
    private b aT;
    private boolean aU;
    private PouchViewModel aV;
    private com.sankuai.waimai.business.search.alita.a aW;
    private boolean aX;
    private final Runnable aY;
    private String aa;
    private int ab;
    private View ac;
    private View ad;
    private View ae;
    private TextView af;
    private com.sankuai.waimai.business.search.ui.result.view.a ag;
    private View ah;
    private View ai;
    private TextView aj;
    private EasterEggLayout ak;
    private com.sankuai.waimai.business.search.ui.result.pouch.a al;
    private com.sankuai.waimai.business.search.ui.result.mach.prerender.c am;
    private com.sankuai.waimai.business.search.ui.result.mach.prerender.c an;
    private com.sankuai.waimai.business.search.ui.result.mach.prerender.c ao;
    private RecommendedSearchKeyword ap;
    private String aq;
    private int ar;
    private StickyContainerFrameLayout as;
    private String at;
    private String au;
    private com.sankuai.waimai.business.search.common.data.b av;
    private boolean aw;
    private long ax;
    private int ay;
    private View az;
    public com.sankuai.waimai.business.search.global.filterbar.b e;
    LinearLayout f;
    LinearLayout g;
    public boolean h;
    public boolean i;
    public DragTopLayout j;
    public ViewGroup k;
    public CoordinatorLayout l;
    public int m;
    public com.sankuai.waimai.business.search.model.a<GlobalPageResponse> n;
    public Runnable o;
    public Runnable p;
    public Animation q;
    public Animation r;
    public String s;
    public ArrayList<c> t;
    public List<GuideQueryData.GuidedQueryWordNew> u;
    private boolean v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void a(DragTopLayout.b bVar);
    }

    public ResultFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83570290de5de5531ede7edca3db223", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83570290de5de5531ede7edca3db223");
            return;
        }
        this.v = true;
        this.w = 0;
        this.x = true;
        this.z = 0;
        this.A = -1;
        this.D = new com.sankuai.waimai.business.search.common.data.d();
        this.U = false;
        this.V = false;
        this.W = false;
        this.ar = 0;
        this.ax = 0L;
        this.ay = 0;
        this.aB = false;
        this.aL = 0;
        this.t = new ArrayList<>();
        this.u = new ArrayList();
        this.aX = true;
        this.aY = new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "314438d06ce8fc73eb5fcafaa5888c5d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "314438d06ce8fc73eb5fcafaa5888c5d");
                    return;
                }
                ResultFragment.this.C();
                ResultFragment.a(ResultFragment.this, false);
            }
        };
    }

    public static /* synthetic */ void D(ResultFragment resultFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "397b72a6949f3dacb7d50a43761d76e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "397b72a6949f3dacb7d50a43761d76e4");
            return;
        }
        if (resultFragment.g().j) {
            resultFragment.g().a();
        }
        if (resultFragment.e != null) {
            resultFragment.e.c();
        }
    }

    public static /* synthetic */ int a(ResultFragment resultFragment, int i) {
        resultFragment.w = 0;
        return 0;
    }

    public static /* synthetic */ com.sankuai.waimai.business.search.ui.result.mach.prerender.c a(ResultFragment resultFragment, com.sankuai.waimai.business.search.ui.result.mach.prerender.c cVar) {
        resultFragment.an = null;
        return null;
    }

    public static /* synthetic */ void a(ResultFragment resultFragment, com.sankuai.waimai.business.search.model.a aVar, boolean z, boolean z2) {
        boolean z3;
        String a2;
        boolean z4;
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "0ccc35fb65275b9f4ab6191d42933023", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "0ccc35fb65275b9f4ab6191d42933023");
            return;
        }
        resultFragment.s();
        resultFragment.aw = !z ? 1 : 0;
        resultFragment.O.a();
        if (TextUtils.isEmpty(resultFragment.c.g)) {
            resultFragment.G();
        } else if (aVar == null || aVar.a == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.common.util.f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a38b793edb02fbfaadb8652bab0a6b8d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a38b793edb02fbfaadb8652bab0a6b8d");
            } else {
                com.sankuai.waimai.platform.capacity.log.b.b(new m().a("main_search_process").b("main_search_data_exception").b());
            }
            if (z) {
                resultFragment.w();
                resultFragment.G();
                resultFragment.g().a();
                return;
            }
            resultFragment.a(new com.sankuai.waimai.platform.modular.network.error.a(BusinessCodeUtil.CODE_JSON_GZIP_FAIL, "data is null"));
            resultFragment.u();
            resultFragment.v();
            resultFragment.I();
            resultFragment.G();
            resultFragment.g().a();
            resultFragment.b((List<OasisModule>) null, (List<OasisModule>) null);
            DovePageMonitor.a(resultFragment.getActivity(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
        } else {
            com.sankuai.waimai.business.search.monitor.horn.a.a().a((GlobalPageResponse) aVar.a);
            if (!z) {
                resultFragment.j.c = false;
                resultFragment.v();
            }
            resultFragment.P = ((GlobalPageResponse) aVar.a).drugImEntranceEntity;
            if (((GlobalPageResponse) aVar.a).searchCommonConfig != null) {
                resultFragment.Y = ((GlobalPageResponse) aVar.a).searchCommonConfig.isFirstScreenShowFeedBack;
                resultFragment.Z = ((GlobalPageResponse) aVar.a).searchCommonConfig.scheme;
                resultFragment.aa = ((GlobalPageResponse) aVar.a).searchCommonConfig.feedBackTips;
            } else {
                resultFragment.Y = false;
                resultFragment.Z = "";
                resultFragment.aa = "";
            }
            if (!(aVar.c == 0)) {
                int i = aVar.c;
                String str = aVar.d;
                Object[] objArr3 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.util.f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a64e1d443ca0fc24148b357d5530115d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a64e1d443ca0fc24148b357d5530115d");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i);
                        jSONObject.put("msg", str);
                        com.sankuai.waimai.platform.capacity.log.b.b(new m().a("main_search_process").b("main_search_code_exception").d(jSONObject.toString()).b());
                    } catch (JSONException unused) {
                    }
                }
                if (z) {
                    resultFragment.w();
                    resultFragment.G();
                    resultFragment.g().a();
                    return;
                }
                resultFragment.b(((GlobalPageResponse) aVar.a).moduleList, ((GlobalPageResponse) aVar.a).topModuleList);
                if (aVar.c == 100) {
                    resultFragment.c.u.clear();
                    com.sankuai.waimai.search.common.mach.b.a();
                    com.sankuai.waimai.business.search.ui.result.pouch.b.a();
                    resultFragment.c.D.clear();
                    resultFragment.c.C.clear();
                    ForbiddenInfo a3 = com.sankuai.waimai.business.search.common.data.a.a((GlobalPageResponse) aVar.a);
                    Object[] objArr4 = {a3};
                    ChangeQuickRedirect changeQuickRedirect4 = d;
                    if (PatchProxy.isSupport(objArr4, resultFragment, changeQuickRedirect4, false, "f3aad2376ba18784e243a6cfa991cef2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, resultFragment, changeQuickRedirect4, false, "f3aad2376ba18784e243a6cfa991cef2");
                    } else {
                        resultFragment.ab = 2;
                        resultFragment.ag.a(a3);
                        resultFragment.J();
                    }
                    resultFragment.a(aVar);
                    resultFragment.F();
                    resultFragment.c.l = "";
                    if (((GlobalPageResponse) aVar.a).globalSearchExtraInfo != null) {
                        resultFragment.c.l = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.searchLogId;
                    }
                    resultFragment.E();
                } else {
                    resultFragment.a(new com.sankuai.waimai.platform.modular.network.error.a(BusinessCodeUtil.CODE_JSON_PARSER_FAIL, "data code exception"));
                }
                resultFragment.u();
                resultFragment.v();
                resultFragment.I();
                resultFragment.G();
                resultFragment.D.clear();
                resultFragment.C.notifyDataSetChanged();
                resultFragment.g().a();
                DovePageMonitor.a(resultFragment.getActivity(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
            } else if (z && resultFragment.c.O != ((GlobalPageResponse) aVar.a).searchMode) {
                int i2 = resultFragment.c.O;
                int i3 = ((GlobalPageResponse) aVar.a).searchMode;
                Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.search.common.util.f.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "a536e5fd5c641a9bbca9ded8e6cc3df1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "a536e5fd5c641a9bbca9ded8e6cc3df1");
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("currentMode", i2);
                        jSONObject2.put("apiMode", i3);
                        com.sankuai.waimai.platform.capacity.log.b.b(new m().a("main_search_process").b("main_search_mode_exception").d(jSONObject2.toString()).b());
                    } catch (JSONException unused2) {
                    }
                }
                resultFragment.w();
                resultFragment.G();
                resultFragment.g().a();
                DovePageMonitor.a(resultFragment.getActivity(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM);
            } else {
                resultFragment.n = aVar;
                resultFragment.ax = ((GlobalPageResponse) aVar.a).searchCursor;
                resultFragment.ay = ((GlobalPageResponse) aVar.a).nextSearchPageType;
                resultFragment.c.m = resultFragment.aq;
                resultFragment.c.A = z2;
                resultFragment.c.i = ((GlobalPageResponse) aVar.a).highLightList;
                resultFragment.c.K = resultFragment.m;
                if (((GlobalPageResponse) aVar.a).globalSearchExtraInfo != null) {
                    resultFragment.a(((GlobalPageResponse) aVar.a).globalSearchExtraInfo.tgt_stids);
                    resultFragment.c.l = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.searchLogId;
                    resultFragment.c.X = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.expAbInfo;
                    SearchShareData searchShareData = resultFragment.c;
                    Map<String, String> map = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.expAbInfo;
                    Object[] objArr6 = {map};
                    ChangeQuickRedirect changeQuickRedirect6 = d;
                    if (PatchProxy.isSupport(objArr6, resultFragment, changeQuickRedirect6, false, "c3375d672145bef2039896be3838457e", RobustBitConfig.DEFAULT_VALUE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, resultFragment, changeQuickRedirect6, false, "c3375d672145bef2039896be3838457e")).booleanValue();
                    } else {
                        z3 = !TextUtils.isEmpty(resultFragment.a(map, ExpAbInfo.EFFECTIVE_UI_EXP));
                    }
                    searchShareData.Z = z3;
                    SearchShareData searchShareData2 = resultFragment.c;
                    Map<String, String> map2 = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.expAbInfo;
                    Object[] objArr7 = {map2};
                    ChangeQuickRedirect changeQuickRedirect7 = d;
                    if (PatchProxy.isSupport(objArr7, resultFragment, changeQuickRedirect7, false, "7ebd5eb4a887e4cdd5a761ecef491419", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (String) PatchProxy.accessDispatch(objArr7, resultFragment, changeQuickRedirect7, false, "7ebd5eb4a887e4cdd5a761ecef491419");
                    } else {
                        a2 = resultFragment.a(map2, ExpAbInfo.RANK_UGC_LABEL_EXP);
                        if (TextUtils.isEmpty(a2)) {
                            a2 = ErrorCode.ERROR_TYPE_B;
                        }
                    }
                    searchShareData2.Y = a2;
                    resultFragment.c.aa = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.searchTraceInfo;
                    resultFragment.c.ad = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.traceInfo;
                    resultFragment.c.ab = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.paotuiChannel;
                    resultFragment.c.ac = ((GlobalPageResponse) aVar.a).globalSearchExtraInfo.moreParam;
                    final com.sankuai.waimai.business.search.ui.actionbar.b bVar = resultFragment.I;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.search.ui.actionbar.b.a;
                    if (PatchProxy.isSupport(objArr8, bVar, changeQuickRedirect8, false, "82bf1dadf0c88cbbb3d7cfc80c95f3c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, bVar, changeQuickRedirect8, false, "82bf1dadf0c88cbbb3d7cfc80c95f3c5");
                    } else if (!bVar.A) {
                        if (bVar.h.getVisibility() == 0) {
                            bVar.s.setVisibility(8);
                        } else {
                            bVar.s.setVisibility(0);
                            String str2 = "wm_search_location_button_" + com.sankuai.waimai.platform.b.A().c();
                            String format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).format(new Date());
                            q a4 = q.a(bVar.c, bVar.c.getPackageName() + "_cipstoragecenter", 2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("cat_id", Integer.valueOf(bVar.q.w));
                            hashMap.put("search_log_id", bVar.q.l);
                            hashMap.put("stid", bVar.q.d);
                            hashMap.put("media_type", 1);
                            hashMap.put("keyword", bVar.q.g);
                            h.a(bVar.c, 2, "c_nfqbfvw", "b_waimai_f6mznhgc_mv", AppUtil.generatePageInfoKey(bVar.c), hashMap);
                            Object[] objArr9 = {a4, str2, format};
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.search.ui.actionbar.b.a;
                            if (PatchProxy.isSupport(objArr9, bVar, changeQuickRedirect9, false, "d4dcb0c5d731e89441d438538978801f", RobustBitConfig.DEFAULT_VALUE)) {
                                z4 = ((Boolean) PatchProxy.accessDispatch(objArr9, bVar, changeQuickRedirect9, false, "d4dcb0c5d731e89441d438538978801f")).booleanValue();
                            } else if ("".equals(a4.b(str2, ""))) {
                                a4.a(str2, format);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.search.ui.actionbar.b.a;
                                if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "749328b8940ca846b2b636c25d9150fe", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "749328b8940ca846b2b636c25d9150fe");
                                } else if (!bVar.A) {
                                    if (bVar.v == null) {
                                        bVar.v = new com.sankuai.waimai.business.search.ui.actionbar.c(bVar.c);
                                    }
                                    bVar.v.a(bVar.e);
                                    if (bVar.w == null) {
                                        bVar.w = new Runnable() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.3
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr11 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect11 = a;
                                                if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "6dcb05b4bd582cea69e2c211e52ce89f", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "6dcb05b4bd582cea69e2c211e52ce89f");
                                                } else {
                                                    p.b(bVar.v);
                                                }
                                            }
                                        };
                                    }
                                    l.a(bVar.w, 3000, bVar.x);
                                    bVar.v.getContentView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.actionbar.b.4
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            Object[] objArr11 = {view};
                                            ChangeQuickRedirect changeQuickRedirect11 = a;
                                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "229b42a688bf3df1ea5f25594421220c", 4611686018427387906L)) {
                                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "229b42a688bf3df1ea5f25594421220c");
                                            } else {
                                                p.b(bVar.v);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    com.sankuai.waimai.business.search.common.data.c.a = -1;
                    resultFragment.c.k = ((GlobalPageResponse) aVar.a).template;
                    resultFragment.c.y = ((GlobalPageResponse) aVar.a).templateDetail;
                    resultFragment.c.U = ((GlobalPageResponse) aVar.a).innerSearchIntent;
                    resultFragment.c.O = ((GlobalPageResponse) aVar.a).searchMode;
                    resultFragment.c.P = ((GlobalPageResponse) aVar.a).spuMode;
                    resultFragment.c.Q = ((GlobalPageResponse) aVar.a).poiMode;
                    resultFragment.c.ae = ((GlobalPageResponse) aVar.a).userPreferType;
                    resultFragment.c.af = ((GlobalPageResponse) aVar.a).userProfile;
                    resultFragment.c.aj = ((GlobalPageResponse) aVar.a).easterEgg;
                    com.sankuai.waimai.search.common.mach.b.a();
                    com.sankuai.waimai.business.search.ui.result.pouch.b.a();
                    resultFragment.c.u.clear();
                    resultFragment.c.D.clear();
                    resultFragment.c.C.clear();
                    resultFragment.E();
                    resultFragment.d(((GlobalPageResponse) aVar.a).moduleList);
                    resultFragment.b(((GlobalPageResponse) aVar.a).moduleList, ((GlobalPageResponse) aVar.a).topModuleList);
                    resultFragment.c(aVar);
                    resultFragment.e.a(((GlobalPageResponse) aVar.a).showAllFilter);
                    resultFragment.I.a(((GlobalPageResponse) aVar.a).switchButton);
                    resultFragment.e.a(((GlobalPageResponse) aVar.a).searchMode);
                    if (((GlobalPageResponse) aVar.a).switchButton == 100 || ((GlobalPageResponse) aVar.a).switchButton == 200) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("cat_id", Integer.valueOf(resultFragment.c.w));
                        hashMap2.put("template_type", Integer.valueOf(resultFragment.c.y));
                        hashMap2.put("choice_type", Integer.valueOf(resultFragment.c.O == 200 ? 100 : 200));
                        hashMap2.put("search_log_id", resultFragment.c.l);
                        h.a(resultFragment.getActivity(), 2, "c_nfqbfvw", "b_waimai_7d43r4wm_mv", AppUtil.generatePageInfoKey(resultFragment.getActivity()), hashMap2);
                    }
                    resultFragment.b(((GlobalPageResponse) aVar.a).moduleList);
                    resultFragment.c(((GlobalPageResponse) aVar.a).moduleList);
                    resultFragment.c.ao = ((GlobalPageResponse) aVar.a).prescriptionRemindInfo;
                }
                resultFragment.x = ((GlobalPageResponse) aVar.a).hasNextPage;
                resultFragment.w = ((GlobalPageResponse) aVar.a).currentPage + 1;
                if (((GlobalPageResponse) aVar.a).easterEgg != null && !TextUtils.isEmpty(((GlobalPageResponse) aVar.a).easterEgg.b) && ((GlobalPageResponse) aVar.a).easterEgg.a && ((GlobalPageResponse) aVar.a).easterEgg.c == 1) {
                    b.a aVar2 = new b.a() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.11
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr11 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "c6f7d9cab637b25447ef32bb55a5d586", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "c6f7d9cab637b25447ef32bb55a5d586");
                            } else if (ResultFragment.this.getContext() != null) {
                                EasterEggLayout easterEggLayout = ResultFragment.this.ak;
                                Context context = ResultFragment.this.getContext();
                                Object[] objArr12 = {context};
                                ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.search.common.util.l.a;
                                int intValue = PatchProxy.isSupport(objArr12, null, changeQuickRedirect12, true, "dc38168dcfac46f0c3840ccdb2b80290", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr12, null, changeQuickRedirect12, true, "dc38168dcfac46f0c3840ccdb2b80290")).intValue() : context.getResources().getDisplayMetrics().widthPixels;
                                int a5 = com.sankuai.waimai.business.search.common.util.l.a(ResultFragment.this.getContext());
                                Object[] objArr13 = {bitmap, Integer.valueOf(intValue), Integer.valueOf(a5)};
                                ChangeQuickRedirect changeQuickRedirect13 = EasterEggLayout.a;
                                if (PatchProxy.isSupport(objArr13, easterEggLayout, changeQuickRedirect13, false, "1e7def6abfed637c765ffb2478ccfc8d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr13, easterEggLayout, changeQuickRedirect13, false, "1e7def6abfed637c765ffb2478ccfc8d");
                                    return;
                                }
                                easterEggLayout.b = intValue;
                                easterEggLayout.c = a5;
                                easterEggLayout.f = bitmap;
                                easterEggLayout.removeAllViews();
                                easterEggLayout.d.removeCallbacks(easterEggLayout.e);
                                easterEggLayout.a(easterEggLayout.f, 5);
                                easterEggLayout.d.postDelayed(easterEggLayout.e, 1100L);
                            }
                        }
                    };
                    resultFragment.ak.setTag(aVar2);
                    b.C0608b a5 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a5.b = resultFragment;
                    a5.c = ((GlobalPageResponse) aVar.a).easterEgg.b;
                    a5.a(aVar2);
                }
                resultFragment.a("module_custom_handle", false);
                resultFragment.av = new com.sankuai.waimai.business.search.common.data.b(resultFragment.F, resultFragment, ((GlobalPageResponse) aVar.a).moduleList, ((GlobalPageResponse) aVar.a).topModuleList, ((GlobalPageResponse) aVar.a).floatModuleList, ((GlobalPageResponse) aVar.a).totalPageModuleList, ((GlobalPageResponse) aVar.a).searchMode, resultFragment.c);
                com.sankuai.waimai.launcher.util.aop.b.a(resultFragment.av, com.sankuai.android.jarvis.c.a(), new Void[0]);
                if (((GlobalPageResponse) aVar.a).moduleList != null) {
                    final ArrayList arrayList = new ArrayList(((GlobalPageResponse) aVar.a).moduleList);
                    Object[] objArr11 = {arrayList};
                    ChangeQuickRedirect changeQuickRedirect11 = k.a;
                    if (PatchProxy.isSupport(objArr11, null, changeQuickRedirect11, true, "2fb14cd681cb34558ef1a028663ff431", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, null, changeQuickRedirect11, true, "2fb14cd681cb34558ef1a028663ff431");
                    } else {
                        com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.waimai.platform.mach.monitor.d.b, new Runnable() { // from class: com.sankuai.waimai.business.search.common.util.k.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                List<HashMap> list;
                                Map map3;
                                Object[] objArr12 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "19e3eb67da0e1ac0adc5fdcd6804d015", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "19e3eb67da0e1ac0adc5fdcd6804d015");
                                    return;
                                }
                                try {
                                    if (arrayList == null || arrayList.isEmpty()) {
                                        return;
                                    }
                                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                                    SparseIntArray sparseIntArray = new SparseIntArray();
                                    for (OasisModule oasisModule : arrayList) {
                                        Map<String, Object> a6 = com.sankuai.waimai.mach.utils.b.a(oasisModule.stringData);
                                        if (TextUtils.isEmpty(oasisModule.unionId) || !concurrentHashMap.containsKey(oasisModule.unionId)) {
                                            concurrentHashMap.put(oasisModule.unionId, "");
                                            if (a6 != null) {
                                                if (a6.containsKey("ad_type")) {
                                                    int intValue = ((Long) a6.get("ad_type")).intValue();
                                                    sparseIntArray.put(intValue, sparseIntArray.get(intValue) + 1);
                                                } else if (a6.containsKey("template_data")) {
                                                    Map map4 = (Map) a6.get("template_data");
                                                    if (map4 != null && map4.containsKey(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST) && (list = (List) map4.get(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST)) != null && !list.isEmpty()) {
                                                        for (HashMap hashMap3 : list) {
                                                            Object obj = hashMap3.get("adType");
                                                            if (obj != null) {
                                                                int intValue2 = ((Long) obj).intValue();
                                                                sparseIntArray.put(intValue2, sparseIntArray.get(intValue2) + 1);
                                                            }
                                                        }
                                                    }
                                                } else if (a6.containsKey("poi") && (map3 = (Map) a6.get("poi")) != null && map3.containsKey("ad_type")) {
                                                    int intValue3 = ((Long) map3.get("ad_type")).intValue();
                                                    sparseIntArray.put(intValue3, sparseIntArray.get(intValue3) + 1);
                                                }
                                            }
                                        }
                                    }
                                    if (sparseIntArray.size() > 0) {
                                        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                                            int keyAt = sparseIntArray.keyAt(i4);
                                            com.sankuai.waimai.platform.mach.monitor.d.a(sparseIntArray.get(keyAt), keyAt, "search", "search/globalpage");
                                        }
                                    }
                                } catch (Throwable th) {
                                    com.sankuai.waimai.foundation.utils.log.a.a(th);
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public static /* synthetic */ void a(ResultFragment resultFragment, boolean z, MetricsSpeedMeterTask metricsSpeedMeterTask, Throwable th) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask, th};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "ba363b6fa1ee30bbbead3af3722d9d97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "ba363b6fa1ee30bbbead3af3722d9d97");
            return;
        }
        resultFragment.y = false;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), th};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, resultFragment, changeQuickRedirect2, false, "55dc31a80a20a8d44fc975569a876e55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, resultFragment, changeQuickRedirect2, false, "55dc31a80a20a8d44fc975569a876e55");
        } else {
            if (z) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = d;
                if (PatchProxy.isSupport(objArr3, resultFragment, changeQuickRedirect3, false, "a11e7e3ca94e506e306dbec09701dcd4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, resultFragment, changeQuickRedirect3, false, "a11e7e3ca94e506e306dbec09701dcd4");
                } else {
                    resultFragment.ah.setVisibility(0);
                    resultFragment.ai.setVisibility(8);
                    resultFragment.aj.setVisibility(0);
                    resultFragment.aj.setText(R.string.wm_nox_search_footer_load_more);
                }
                if (resultFragment.F != null) {
                    ae.a(resultFragment.F, (int) R.string.wm_nox_search_loading_fail_try_afterwhile);
                }
            } else {
                resultFragment.G();
                resultFragment.a(th);
                resultFragment.u();
                resultFragment.v();
                resultFragment.I();
                Object[] objArr4 = {(byte) 0};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, resultFragment, changeQuickRedirect4, false, "4fe238b6c64f39be97b56d10e888e389", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, resultFragment, changeQuickRedirect4, false, "4fe238b6c64f39be97b56d10e888e389");
                } else if (!resultFragment.e.f) {
                    resultFragment.e.b(false);
                    resultFragment.c(false);
                }
                resultFragment.F();
                resultFragment.aF.setVisibility(8);
            }
            resultFragment.g().a();
        }
        metricsSpeedMeterTask.disable();
    }

    public static /* synthetic */ boolean a(ResultFragment resultFragment, boolean z) {
        resultFragment.aU = false;
        return false;
    }

    public static /* synthetic */ void c(ResultFragment resultFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "fe956fac2bb40e5d2d1dc585e1eb0447", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "fe956fac2bb40e5d2d1dc585e1eb0447");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("template_type", Integer.valueOf(resultFragment.c.y));
        hashMap.put("search_log_id", resultFragment.c.l);
        hashMap.put("stid", resultFragment.c.d);
        hashMap.put("icon_type", Integer.valueOf(i));
        h.a(resultFragment.getActivity(), 1, "c_nfqbfvw", "b_waimai_xh6hk3h5_mc", AppUtil.generatePageInfoKey(resultFragment.getActivity()), hashMap);
    }

    public static /* synthetic */ void g(ResultFragment resultFragment, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "5b402438fd67492d446c2114cfad1e22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "5b402438fd67492d446c2114cfad1e22");
        } else if (resultFragment.c.B) {
            Activity activity = resultFragment.F;
            if (activity instanceof BaseActivity) {
                resultFragment.c.B = false;
                if (z) {
                    com.sankuai.meituan.takeoutnew.util.aop.h.a(((BaseActivity) activity).s().recordStep("activity_data_ready"));
                } else {
                    ((BaseActivity) activity).s().disable();
                }
            }
        }
    }

    public static ResultFragment d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca23af0e91ee1d377d1316fe8461fbc6", RobustBitConfig.DEFAULT_VALUE) ? (ResultFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca23af0e91ee1d377d1316fe8461fbc6") : new ResultFragment();
    }

    @Override // com.sankuai.waimai.business.search.ui.BaseSearchFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfdd29edf178bbd84a8308d84374d0e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfdd29edf178bbd84a8308d84374d0e7");
            return;
        }
        super.onCreate(bundle);
        com.meituan.android.bus.a.a().a(this);
        this.ap = this.c.o;
        this.I = c();
        this.T = g.b(getContext());
        com.sankuai.waimai.foundation.location.v2.g.a().a(this, "WMSearchResultFragment");
        this.c.ai = new d();
        this.c.n = q();
        this.aQ = new e();
        getContext().registerReceiver(this.aQ, new IntentFilter("action_search_remove_card"));
        this.aS = new a();
        getContext().registerReceiver(this.aS, new IntentFilter("action_search_show_float_card"));
        this.aR = new FloatCardRemoveCastReceiver();
        getContext().registerReceiver(this.aR, new IntentFilter("action_search_remove_float_card"));
        this.aV = (PouchViewModel) android.arch.lifecycle.q.a(getActivity()).a(PouchViewModel.class);
        this.aT = new b();
        getContext().registerReceiver(this.aT, new IntentFilter("isomorphism_action_notification"));
        this.aW = new com.sankuai.waimai.business.search.alita.a(this.c);
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7ac17c899668f8cd3d43f5838c44d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7ac17c899668f8cd3d43f5838c44d9e");
            return;
        }
        super.onResume();
        l();
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5539a4d3dde2d4680e6102f297c569ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5539a4d3dde2d4680e6102f297c569ae");
            return;
        }
        if (this.am != null) {
            this.am.a(true, c.a.PAGE);
            if (this.j != null) {
                this.am.a(this.j.getState() == DragTopLayout.b.EXPANDED, c.a.CONTAINER);
            }
        }
        if (this.al != null) {
            this.al.a(true, c.a.PAGE);
            if (this.j != null) {
                this.al.a(this.j.getState() == DragTopLayout.b.EXPANDED, c.a.CONTAINER);
            }
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547d30c485e49fee80b548f5e7f0a7ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547d30c485e49fee80b548f5e7f0a7ed");
            return;
        }
        super.onPause();
        m();
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9446eccf0f4d34ed53916f6ad4fbaf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9446eccf0f4d34ed53916f6ad4fbaf");
            return;
        }
        if (this.am != null) {
            this.am.a(false, c.a.PAGE);
            this.am.a(false, c.a.CONTAINER);
        }
        if (this.al != null) {
            this.al.a(false, c.a.PAGE);
            this.al.a(false, c.a.CONTAINER);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d31b7b53f20135bd3e7752d9cf8e5f47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d31b7b53f20135bd3e7752d9cf8e5f47");
            return;
        }
        super.onHiddenChanged(z);
        if (z) {
            m();
        } else {
            l();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98efac219bb673b0b3729db35788b01a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98efac219bb673b0b3729db35788b01a");
            return;
        }
        com.meituan.android.bus.a.a().b(this);
        getContext().unregisterReceiver(this.aQ);
        getContext().unregisterReceiver(this.aS);
        getContext().unregisterReceiver(this.aR);
        getContext().unregisterReceiver(this.aT);
        com.sankuai.waimai.business.search.ui.result.im.b bVar = this.O;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.ui.result.im.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7c0bde54c6fd5e45796aaf9abd62ef01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7c0bde54c6fd5e45796aaf9abd62ef01");
        } else {
            com.sankuai.waimai.business.search.ui.result.im.c cVar = bVar.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.ui.result.im.c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "d03f1befc9df97e63bd40ec6bb272920", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "d03f1befc9df97e63bd40ec6bb272920");
            } else {
                com.sankuai.waimai.imbase.manager.b.a().b((short) 1024, cVar);
                com.sankuai.waimai.imbase.manager.b.a().b((short) 1052, cVar);
            }
        }
        if (this.aW != null) {
            com.sankuai.waimai.business.search.alita.a aVar = this.aW;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.search.alita.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "284270eab95c7b5504f9248a6b7d89e6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "284270eab95c7b5504f9248a6b7d89e6");
            } else if (aVar.c != null) {
                aVar.c.a();
            }
        }
        com.sankuai.waimai.foundation.location.v2.g.a().b(this, "WMSearchResultFragment");
        t();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a7f170436b1459f0998931165fc9f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a7f170436b1459f0998931165fc9f1");
            return;
        }
        super.onActivityCreated(bundle);
        if (this.I == null) {
            this.I = c();
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d0d7dc8d72c83d04407be470a8cb533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d0d7dc8d72c83d04407be470a8cb533");
        } else {
            super.a(z);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f66dac2d636967b27178fd59564bc5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f66dac2d636967b27178fd59564bc5f");
            return;
        }
        super.onStop();
        EasterEggLayout easterEggLayout = this.ak;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = EasterEggLayout.a;
        if (PatchProxy.isSupport(objArr2, easterEggLayout, changeQuickRedirect2, false, "904dad7a4193f8d0a87bfd721ac15cc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, easterEggLayout, changeQuickRedirect2, false, "904dad7a4193f8d0a87bfd721ac15cc4");
            return;
        }
        easterEggLayout.removeAllViews();
        easterEggLayout.d.removeCallbacks(easterEggLayout.e);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d02dc846d564b36bafcd993a39d637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d02dc846d564b36bafcd993a39d637");
            return;
        }
        super.onDestroyView();
        com.sankuai.waimai.search.common.mach.b.a();
        com.sankuai.waimai.business.search.ui.result.pouch.b.a();
        this.D.clear();
        this.c.u.clear();
        s();
        StickyContainerFrameLayout stickyContainerFrameLayout = this.as;
        com.sankuai.waimai.business.search.ui.result.c cVar = this.C;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = StickyContainerFrameLayout.a;
        if (PatchProxy.isSupport(objArr2, stickyContainerFrameLayout, changeQuickRedirect2, false, "afc70b0a9e7f1368224cbc8619e5fd0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, stickyContainerFrameLayout, changeQuickRedirect2, false, "afc70b0a9e7f1368224cbc8619e5fd0b");
        } else if (cVar != null && stickyContainerFrameLayout.b != null) {
            cVar.unregisterAdapterDataObserver(stickyContainerFrameLayout.b);
        }
        t();
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c1b387a307ba25fbb4f98587cfa233d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c1b387a307ba25fbb4f98587cfa233d");
        } else if (this.av != null) {
            this.av.cancel(true);
        }
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "104d025bcfb2fdc5775dc2d8d05397a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "104d025bcfb2fdc5775dc2d8d05397a0");
            return;
        }
        if (this.ao != null) {
            this.ao.b.f();
            this.ao = null;
        }
        if (this.K != null) {
            this.K.removeAllViews();
            this.K.setVisibility(8);
        }
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbeb417b001d8de066d7af4d7db08557", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbeb417b001d8de066d7af4d7db08557");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_nox_search_result, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a06d51f78a6d4e7686ede046d8234482", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a06d51f78a6d4e7686ede046d8234482");
        } else {
            this.az = inflate;
            this.J = (ViewGroup) inflate.findViewById(R.id.layout_search_result);
            this.L = (StatisticsRecyclerView) inflate.findViewById(R.id.list_poiSearch_poiList);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
            this.aF = (LinearLayout) inflate.findViewById(R.id.guide_query_container);
            this.aG = (LinearLayout) inflate.findViewById(R.id.guide_query_container_content);
            this.aH = inflate.findViewById(R.id.guide_query_container_indicator);
            this.aI = (RecyclerView) inflate.findViewById(R.id.wm_nox_guide_query);
            this.aC = (RecyclerView) inflate.findViewById(R.id.wm_nox_guide_query_tab);
            this.aE = (LinearLayout) inflate.findViewById(R.id.recyclerview_behavior_container);
            ViewGroup.LayoutParams layoutParams = this.aE.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.c) {
                CoordinatorLayout.a aVar = ((CoordinatorLayout.c) layoutParams).a;
                if (aVar instanceof SearchStickyContainerBehavior) {
                    ((SearchStickyContainerBehavior) aVar).b = new SearchStickyContainerBehavior.a() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.17
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.search.ui.result.behavior.SearchStickyContainerBehavior.a
                        public final void a(float f) {
                            Object[] objArr3 = {Float.valueOf(f)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "62a1f14ad7527dea39e2c22fede89278", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "62a1f14ad7527dea39e2c22fede89278");
                                return;
                            }
                            ResultFragment.this.e();
                            if (ResultFragment.this.aV != null) {
                                ResultFragment.this.aV.d().a((android.arch.lifecycle.k<Void>) null);
                            }
                        }
                    };
                }
            }
            this.aI.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.aJ = new com.sankuai.waimai.business.search.ui.result.guideQuery.d(this.aI, this.c);
            this.aJ.e = new d.a() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.18
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.search.ui.result.guideQuery.d.a
                public final void a(GuideQueryCard.GuideQuery guideQuery, int i) {
                    Object[] objArr3 = {guideQuery, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a3318cc221e20941f05c05ad20433ea9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a3318cc221e20941f05c05ad20433ea9");
                    } else if (TextUtils.isEmpty(guideQuery.searchQuery) || ResultFragment.this.I == null) {
                    } else {
                        ResultFragment.this.I.a(guideQuery.showQuery, guideQuery.searchQuery, ResultFragment.this.n);
                    }
                }
            };
            this.aI.setAdapter(this.aJ);
            this.aC.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.aD = new com.sankuai.waimai.business.search.ui.result.guideQuery.e(this.c, this.aC);
            this.aD.d = new e.b() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.19
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.search.ui.result.guideQuery.e.b
                public final void a(GuideQueryCard.TabGuideQuery tabGuideQuery, int i) {
                    Object[] objArr3 = {tabGuideQuery, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5193c08e750c6c1d38179d0e2f7d664", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5193c08e750c6c1d38179d0e2f7d664");
                        return;
                    }
                    ResultFragment.this.a(tabGuideQuery.tabSecondSearchQueryList);
                    ResultFragment.this.aD.e = i;
                    ResultFragment.this.c.au = i;
                    if (!TextUtils.isEmpty(tabGuideQuery.tab)) {
                        ResultFragment.this.c.at = tabGuideQuery.tab;
                    } else {
                        ResultFragment.this.c.at = "";
                    }
                    ResultFragment.this.aD.notifyDataSetChanged();
                }
            };
            this.aC.setAdapter(this.aD);
            this.L.setLayoutManager(staggeredGridLayoutManager);
            this.M = (LinearLayout) inflate.findViewById(R.id.bottom_btn_container);
            this.f = (LinearLayout) inflate.findViewById(R.id.bottom_normal_btn_container);
            this.N = (ImageView) inflate.findViewById(R.id.btn_global_cart);
            this.g = (LinearLayout) inflate.findViewById(R.id.drug_im_entrance);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2d5dd9addfac33cc001b39df5faf00a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2d5dd9addfac33cc001b39df5faf00a");
            } else {
                this.O = new com.sankuai.waimai.business.search.ui.result.im.b(this.b);
                com.sankuai.waimai.business.search.ui.result.im.b bVar = this.O;
                LinearLayout linearLayout = this.g;
                Object[] objArr4 = {linearLayout};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.search.ui.result.im.b.a;
                if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "e7264073213e5131b3e6f0dccca36a7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "e7264073213e5131b3e6f0dccca36a7d");
                } else {
                    com.sankuai.waimai.business.search.ui.result.im.c cVar = bVar.b;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.search.ui.result.im.c.a;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "f92df799ff37788ae77fe64c2dcd9d91", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "f92df799ff37788ae77fe64c2dcd9d91");
                    } else {
                        com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, (d.InterfaceC0965d) cVar);
                        com.sankuai.waimai.imbase.manager.b.a().a((short) 1052, (d.InterfaceC0965d) cVar);
                    }
                    com.sankuai.waimai.business.search.ui.result.im.a aVar2 = bVar.c;
                    Object[] objArr6 = {linearLayout};
                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.search.ui.result.im.a.a;
                    if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "dfc3f2db94379dcbe931ac83e186e34f", RobustBitConfig.DEFAULT_VALUE)) {
                        View view = (View) PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "dfc3f2db94379dcbe931ac83e186e34f");
                    } else {
                        aVar2.a(linearLayout);
                    }
                }
            }
            this.N.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.20
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr7 = {view2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "4eb471024dce079dbb508dd5ddb18291", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "4eb471024dce079dbb508dd5ddb18291");
                        return;
                    }
                    ResultFragment.c(ResultFragment.this, 2);
                    GlobalCartManager.toGlobalCartActivity(ResultFragment.this.F);
                }
            });
            this.Q = (ImageView) inflate.findViewById(R.id.to_top_img_poiList);
            this.Q.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.21
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr7 = {view2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "696805e67895db529410c5a5d8f017df", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "696805e67895db529410c5a5d8f017df");
                        return;
                    }
                    ResultFragment.c(ResultFragment.this, 1);
                    ResultFragment.this.as.a();
                    ResultFragment.this.L.scrollToPosition(0);
                    ResultFragment.this.K();
                    ResultFragment.this.M.setTranslationY(ResultFragment.this.X);
                    ResultFragment.z(ResultFragment.this);
                    ResultFragment.this.ar = 0;
                    if (ResultFragment.this.h) {
                        if (ResultFragment.this.am != null) {
                            ResultFragment.this.b(ResultFragment.this.am.b);
                        } else if (ResultFragment.this.al != null) {
                            ResultFragment.this.a(ResultFragment.this.al.b);
                        }
                        ResultFragment.this.I.a(ResultFragment.this.I.u() ? 0 : -657930, ResultFragment.this.I.v() ? 872415231 : -1, 0.0f);
                    }
                    ResultFragment.D(ResultFragment.this);
                }
            });
            this.R = (TextView) inflate.findViewById(R.id.tv_feedback_tips);
            this.S = (ImageView) inflate.findViewById(R.id.btn_feedback);
            this.S.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.22
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr7 = {view2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0c1ca88397a5dc501c5615d5399ace85", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0c1ca88397a5dc501c5615d5399ace85");
                        return;
                    }
                    ResultFragment.c(ResultFragment.this, 3);
                    HashMap hashMap = new HashMap();
                    hashMap.put("template_type", String.valueOf(ResultFragment.this.c.y));
                    hashMap.put("stid", ResultFragment.this.c.d);
                    com.sankuai.waimai.foundation.router.a.a(ResultFragment.this.getContext(), ResultFragment.this.Z, hashMap);
                }
            });
            this.V = false;
            View inflate2 = LayoutInflater.from(getContext()).inflate(R.layout.wm_nox_search_result_list_footer, (ViewGroup) this.L, false);
            this.ac = inflate.findViewById(R.id.takeout_list_dynamic_progress_bar_global);
            this.ac.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.23
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Object[] objArr7 = {view2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "1fb57f3e29daa236a1d44f96f876694d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "1fb57f3e29daa236a1d44f96f876694d")).booleanValue();
                    }
                    if (ResultFragment.this.aU) {
                        ResultFragment.this.C();
                        ResultFragment.a(ResultFragment.this, false);
                        ResultFragment.this.ac.removeCallbacks(ResultFragment.this.aY);
                    }
                    return false;
                }
            });
            this.ad = this.ac.findViewById(R.id.search_common_loading);
            this.ae = this.ac.findViewById(R.id.search_kangaroo_loading);
            this.af = (TextView) this.ac.findViewById(R.id.kangaroo_loading_text);
            this.ac.setVisibility(8);
            this.ag = new com.sankuai.waimai.business.search.ui.result.view.a(inflate, R.id.search_abnormal_view);
            this.ag.a(R.color.wm_nox_search_light_gray);
            this.aN = (LinearLayout) inflate.findViewById(R.id.search_float_coupon_card_container);
            this.ah = inflate2.findViewById(R.id.search_list_loading_layout);
            this.ah.setVisibility(8);
            this.ai = inflate2.findViewById(R.id.pull_to_load_progress);
            this.aj = (TextView) inflate2.findViewById(R.id.search_list_loading_txt_tv);
            this.ak = (EasterEggLayout) inflate.findViewById(R.id.search_easter_egg_layout);
            this.as = (StickyContainerFrameLayout) inflate.findViewById(R.id.layout_container);
            this.j = (DragTopLayout) inflate.findViewById(R.id.result_drag_top_layout);
            this.k = (ViewGroup) inflate.findViewById(R.id.result_top_block);
            this.l = (CoordinatorLayout) inflate.findViewById(R.id.result_content_block);
            final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            this.j.b = new DragTopLayout.c() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final boolean c() {
                    return true;
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final void a() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8ab108717cc8fcaa880a606b4502ad46", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8ab108717cc8fcaa880a606b4502ad46");
                        return;
                    }
                    if (ResultFragment.this.am != null) {
                        ResultFragment.this.am.a();
                    }
                    if (ResultFragment.this.al != null) {
                        ResultFragment.this.al.d();
                    }
                    if (ResultFragment.this.aO != null) {
                        ResultFragment.this.aO.d();
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final void a(int i) {
                    Object[] objArr7 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "cda1630df4d4bdc3d72abf57f7036e14", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "cda1630df4d4bdc3d72abf57f7036e14");
                    } else {
                        ResultFragment.this.e();
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final boolean b() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "22ab6e3affa65577ea401899effaa449", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "22ab6e3affa65577ea401899effaa449")).booleanValue();
                    }
                    if (ResultFragment.this.h) {
                        if ((ResultFragment.this.e == null || !ResultFragment.this.e.d()) && !ResultFragment.this.g().j) {
                            return ResultFragment.this.h;
                        }
                        return false;
                    }
                    return false;
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final boolean d() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c6e3f72b506c33fd84dc3fc493955d99", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c6e3f72b506c33fd84dc3fc493955d99")).booleanValue();
                    }
                    return ResultFragment.this.l.getTop() > 0 || (!ResultFragment.this.L.canScrollVertically(-1) && (ResultFragment.this.aF.getVisibility() == 8 || (ResultFragment.this.aF.getVisibility() == 0 && (ResultFragment.this.aF.getY() > 0.0f ? 1 : (ResultFragment.this.aF.getY() == 0.0f ? 0 : -1)) == 0)));
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final void a(float f) {
                    Object[] objArr7 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "0f8133bb9e0f440c30d4ac81ebef8ca6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "0f8133bb9e0f440c30d4ac81ebef8ca6");
                        return;
                    }
                    super.a(f);
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                    float f2 = 1.0f - f;
                    ResultFragment.this.I.a(((Integer) argbEvaluator.evaluate(f2, Integer.valueOf(ResultFragment.this.I.u() ? 0 : -657930), -657930)).intValue(), ((Integer) argbEvaluator.evaluate(f2, Integer.valueOf(ResultFragment.this.I.v() ? 872415231 : -1), -1)).intValue(), f2);
                }

                @Override // com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.c, com.sankuai.waimai.business.search.ui.result.dragtop.DragTopLayout.a
                public final void a(DragTopLayout.b bVar2) {
                    Object[] objArr7 = {bVar2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2120c04c5d9e3bf6f553a674231e6492", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2120c04c5d9e3bf6f553a674231e6492");
                        return;
                    }
                    super.a(bVar2);
                    ResultFragment.this.a(bVar2);
                }
            };
            this.C = new com.sankuai.waimai.business.search.ui.result.c(this, this.b, this.D, new com.sankuai.waimai.business.search.ui.result.b() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final String a() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "a2d16d647aeb3b47aed9cd1160234221", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "a2d16d647aeb3b47aed9cd1160234221") : ResultFragment.this.I.k;
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final String b() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "5d6b47bfb5dd384e561dc8437b2cbe88", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "5d6b47bfb5dd384e561dc8437b2cbe88") : ResultFragment.this.i();
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(String str, String str2) {
                    Object[] objArr7 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "dee979ce29316c8ffdb3b0f3ed8b7d31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "dee979ce29316c8ffdb3b0f3ed8b7d31");
                    } else if (TextUtils.isEmpty(str2) || ResultFragment.this.I == null) {
                    } else {
                        ResultFragment.this.I.a(str, str2, ResultFragment.this.n);
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(QueryCorrect queryCorrect) {
                    Object[] objArr7 = {queryCorrect};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b7094d08ba326a9c1cd5a0dc79388223", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b7094d08ba326a9c1cd5a0dc79388223");
                    } else if (queryCorrect != null) {
                        ResultFragment.this.b(queryCorrect.sOriginKey, 5, 0);
                        if (ResultFragment.this.I != null) {
                            ResultFragment.this.I.o();
                        }
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(String str, String str2, String str3) {
                    Object[] objArr7 = {str, str2, str3};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "304b64b9ade9dda0cf9d4eb3a72043ef", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "304b64b9ade9dda0cf9d4eb3a72043ef");
                        return;
                    }
                    ResultFragment.this.au = str3;
                    ResultFragment.this.a(str2, 9, 0, ResultFragment.this.z);
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(String str, int i, int i2) {
                    Object[] objArr7 = {str, 10, 0};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7ff1993aa8985087d99cce81084e28f5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7ff1993aa8985087d99cce81084e28f5");
                    } else {
                        ResultFragment.this.a(str, 10, 0, ResultFragment.this.z);
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(String str, String str2, boolean z) {
                    Object[] objArr7 = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2d0bb66971a1bb8231268760882912df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2d0bb66971a1bb8231268760882912df");
                        return;
                    }
                    ResultFragment.this.aB = z;
                    ResultFragment.this.e.a(!TextUtils.isEmpty(str) ? str.split(CommonConstant.Symbol.COMMA) : null, TextUtils.isEmpty(str2) ? null : str2.split(CommonConstant.Symbol.COMMA));
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void a(String str) {
                    Object[] objArr7 = {str};
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f80c13c12c03f74e6218c3b84204f7b6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f80c13c12c03f74e6218c3b84204f7b6");
                    } else {
                        ResultFragment.this.at = str;
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final String c() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "e8833dae7060474568c55a841ee625fe", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "e8833dae7060474568c55a841ee625fe") : ResultFragment.this.at;
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final boolean d() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b95729f78e673cb03eb47af8b9155e67", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b95729f78e673cb03eb47af8b9155e67")).booleanValue() : ResultFragment.this.aB;
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void e() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "8cef2fbd05d1a3f873ec6caac83d4c1d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "8cef2fbd05d1a3f873ec6caac83d4c1d");
                    } else {
                        ResultFragment.this.aB = false;
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void f() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "41ed93eb348fff0dc5f4e47bf18266d3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "41ed93eb348fff0dc5f4e47bf18266d3");
                    } else if (ResultFragment.this.j != null) {
                        ResultFragment.this.j.a();
                    }
                }

                @Override // com.sankuai.waimai.business.search.ui.result.b
                public final void g() {
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = a;
                    if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b31c183079275f4892b3d0e5d4ed1417", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b31c183079275f4892b3d0e5d4ed1417");
                    } else {
                        ResultFragment.this.e.o.k();
                    }
                }
            }, q());
            StickyContainerFrameLayout stickyContainerFrameLayout = this.as;
            com.sankuai.waimai.business.search.ui.result.c cVar2 = this.C;
            Object[] objArr7 = {cVar2};
            ChangeQuickRedirect changeQuickRedirect7 = StickyContainerFrameLayout.a;
            if (PatchProxy.isSupport(objArr7, stickyContainerFrameLayout, changeQuickRedirect7, false, "dbd08fdd70cb22c10c0171b368915505", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, stickyContainerFrameLayout, changeQuickRedirect7, false, "dbd08fdd70cb22c10c0171b368915505");
            } else if (cVar2 != null && stickyContainerFrameLayout.b != null) {
                cVar2.registerAdapterDataObserver(stickyContainerFrameLayout.b);
            }
            com.sankuai.waimai.business.search.ui.result.c cVar3 = this.C;
            Object[] objArr8 = {inflate2};
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.business.search.adapterdelegates.e.a;
            if (PatchProxy.isSupport(objArr8, cVar3, changeQuickRedirect8, false, "9aefdeb3a74693749d662d3d37026d9c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, cVar3, changeQuickRedirect8, false, "9aefdeb3a74693749d662d3d37026d9c");
            } else {
                Object[] objArr9 = {inflate2, (byte) 0};
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.business.search.adapterdelegates.e.a;
                if (PatchProxy.isSupport(objArr9, cVar3, changeQuickRedirect9, false, "1d39509da881efee8453abd0e21d2df8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, cVar3, changeQuickRedirect9, false, "1d39509da881efee8453abd0e21d2df8");
                } else if (inflate2 == null) {
                    throw new IllegalArgumentException("the view to add must not be null!");
                } else {
                    e.a aVar3 = new e.a();
                    aVar3.a = inflate2;
                    aVar3.b = cVar3.d.size() - 2048;
                    cVar3.d.add(aVar3);
                    cVar3.notifyDataSetChanged();
                }
            }
            final com.sankuai.waimai.business.search.ui.result.c cVar4 = this.C;
            StatisticsRecyclerView statisticsRecyclerView = this.L;
            Object[] objArr10 = {statisticsRecyclerView};
            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.search.adapterdelegates.e.a;
            if (PatchProxy.isSupport(objArr10, cVar4, changeQuickRedirect10, false, "1fd9c2dc1cb1bd7a3921922b632d6403", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, cVar4, changeQuickRedirect10, false, "1fd9c2dc1cb1bd7a3921922b632d6403");
            } else {
                if (statisticsRecyclerView.getLayoutManager() instanceof GridLayoutManager) {
                    final GridLayoutManager gridLayoutManager = (GridLayoutManager) statisticsRecyclerView.getLayoutManager();
                    gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.business.search.adapterdelegates.e.1
                        public static ChangeQuickRedirect b;

                        @Override // android.support.v7.widget.GridLayoutManager.c
                        public final int a(int i) {
                            boolean z = false;
                            Object[] objArr11 = {Integer.valueOf(i)};
                            ChangeQuickRedirect changeQuickRedirect11 = b;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "8f6566a6dfa3655bf513569a15867dfb", RobustBitConfig.DEFAULT_VALUE)) {
                                return ((Integer) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "8f6566a6dfa3655bf513569a15867dfb")).intValue();
                            }
                            if ((cVar4.a(i) || cVar4.b(i)) ? true : true) {
                                return gridLayoutManager.b;
                            }
                            return 1;
                        }
                    };
                }
                if (statisticsRecyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                    cVar4.b = true;
                }
            }
            this.L.setAdapter(this.C);
            this.L.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.4
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr11 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "24edcce934b6a641bc6bbb178d973abb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "24edcce934b6a641bc6bbb178d973abb");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    ResultFragment.this.ar += i2;
                    int i3 = ResultFragment.this.ar - ResultFragment.this.T;
                    if (i3 <= 0) {
                        ResultFragment.this.M.setTranslationY(ResultFragment.this.X);
                        ResultFragment.z(ResultFragment.this);
                    } else if (i3 >= ResultFragment.this.X) {
                        ResultFragment.this.M.setTranslationY(0.0f);
                        ResultFragment.this.W = true;
                        ResultFragment.this.b(false);
                    } else {
                        ResultFragment.this.M.setTranslationY(ResultFragment.this.X - i3);
                        if (ResultFragment.this.U) {
                            if (!ah.b(ResultFragment.this.S)) {
                                ResultFragment.this.U = false;
                            }
                        } else if (ah.b(ResultFragment.this.S)) {
                            ResultFragment.this.U = true;
                            ResultFragment.this.b(3);
                        }
                        if (ResultFragment.this.V) {
                            if (!ah.b(ResultFragment.this.Q)) {
                                ResultFragment.this.V = false;
                            }
                        } else if (ah.b(ResultFragment.this.Q)) {
                            ResultFragment.this.V = true;
                            ResultFragment.this.b(1);
                        }
                        ResultFragment.this.W = false;
                    }
                    ResultFragment.this.B = com.sankuai.waimai.business.search.ui.result.utils.a.a(recyclerView.getLayoutManager());
                    if (ResultFragment.this.aV != null) {
                        ResultFragment.this.aV.d().a((android.arch.lifecycle.k<Void>) null);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    String obj;
                    boolean z;
                    String obj2;
                    Object[] objArr11 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "d2bafd1836e1376796a95f3a253ec3ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "d2bafd1836e1376796a95f3a253ec3ad");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    int i2 = ResultFragment.this.B;
                    com.sankuai.waimai.business.search.ui.result.c cVar5 = ResultFragment.this.C;
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.business.search.adapterdelegates.e.a;
                    int intValue = i2 - (PatchProxy.isSupport(objArr12, cVar5, changeQuickRedirect12, false, "c60aa89ff14baa3395dc90675a69a752", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr12, cVar5, changeQuickRedirect12, false, "c60aa89ff14baa3395dc90675a69a752")).intValue() : cVar5.c.size());
                    if (i == 0) {
                        Object[] objArr13 = {Integer.valueOf(intValue)};
                        ChangeQuickRedirect changeQuickRedirect13 = a;
                        if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "139fff9a01f5bee96f634134d20587a4", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "139fff9a01f5bee96f634134d20587a4")).booleanValue();
                        } else {
                            z = intValue >= ResultFragment.this.C.getItemCount() - ResultFragment.this.C.a();
                        }
                        if (z && ResultFragment.this.x && !ResultFragment.this.y) {
                            ResultFragment.this.y = true;
                            ResultFragment.this.y();
                            if (TextUtils.isEmpty(ResultFragment.this.I.k)) {
                                obj2 = ResultFragment.this.b.j.getText().toString();
                            } else {
                                obj2 = ResultFragment.this.I.k;
                            }
                            ResultFragment.this.a(obj2, 6, ResultFragment.this.c.j, ResultFragment.this.z);
                        }
                    }
                    if (ResultFragment.this.x && !ResultFragment.this.y && intValue >= (ResultFragment.this.C.getItemCount() - ResultFragment.this.C.a()) - 4) {
                        ResultFragment.this.y = true;
                        ResultFragment.this.y();
                        if (TextUtils.isEmpty(ResultFragment.this.I.k)) {
                            obj = ResultFragment.this.b.j.getText().toString();
                        } else {
                            obj = ResultFragment.this.I.k;
                        }
                        ResultFragment.this.a(obj, 6, ResultFragment.this.c.j, ResultFragment.this.z);
                    }
                    if (i == 0) {
                        final ResultFragment resultFragment = ResultFragment.this;
                        Object[] objArr14 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect14 = ResultFragment.d;
                        if (PatchProxy.isSupport(objArr14, resultFragment, changeQuickRedirect14, false, "661afda85cc8da2b987fb04d7653dedc", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr14, resultFragment, changeQuickRedirect14, false, "661afda85cc8da2b987fb04d7653dedc");
                        } else if (resultFragment.q != null && resultFragment.f.getAnimation() == resultFragment.q && resultFragment.r != null && resultFragment.g.getAnimation() == resultFragment.r) {
                            resultFragment.f.removeCallbacks(resultFragment.o);
                            resultFragment.g.removeCallbacks(resultFragment.p);
                            if (resultFragment.o == null) {
                                resultFragment.o = new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.6
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr15 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect15 = a;
                                        if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "d0e13b00f1c5e492298366a4aa6c84eb", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "d0e13b00f1c5e492298366a4aa6c84eb");
                                        } else if (ResultFragment.this.getActivity() == null || ResultFragment.this.getActivity().isFinishing()) {
                                        } else {
                                            ResultFragment.this.f.startAnimation(com.sankuai.waimai.business.search.common.util.b.b(500, 0.5f, g.a(ResultFragment.this.getActivity(), 10.0f) + (ResultFragment.this.S.getWidth() / 2.0f)));
                                        }
                                    }
                                };
                            }
                            if (resultFragment.p == null) {
                                resultFragment.p = new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.7
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr15 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect15 = a;
                                        if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "694c8a5b8cacfae6212846b6a4317262", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "694c8a5b8cacfae6212846b6a4317262");
                                        } else if (ResultFragment.this.getActivity() == null || ResultFragment.this.getActivity().isFinishing()) {
                                        } else {
                                            ResultFragment.this.g.startAnimation(com.sankuai.waimai.business.search.common.util.b.b(500, 0.35f, g.a(ResultFragment.this.getActivity(), 67.0f)));
                                        }
                                    }
                                };
                            }
                            resultFragment.f.postDelayed(resultFragment.o, 750L);
                            resultFragment.g.postDelayed(resultFragment.p, 750L);
                        }
                    } else if (i == 1) {
                        ResultFragment.this.b(true);
                    }
                    if (i == 0 && (ResultFragment.this.L.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) ResultFragment.this.L.getLayoutManager();
                        int[] findFirstVisibleItemPositions = staggeredGridLayoutManager2.findFirstVisibleItemPositions(null);
                        int[] findLastVisibleItemPositions = staggeredGridLayoutManager2.findLastVisibleItemPositions(null);
                        for (int b2 = com.sankuai.waimai.business.search.common.util.c.b(findFirstVisibleItemPositions); b2 <= com.sankuai.waimai.business.search.common.util.c.a(findLastVisibleItemPositions); b2++) {
                            Serializable serializable = ResultFragment.this.D.get(b2);
                            if (serializable instanceof CommonMachData) {
                                CommonMachData commonMachData = (CommonMachData) serializable;
                                if (commonMachData.mItem != null && commonMachData.mItem.b() != null) {
                                    commonMachData.mItem.b().f.onExpose();
                                }
                            }
                            if (serializable instanceof PouchDynamicAd) {
                                com.sankuai.waimai.business.search.ui.result.pouch.b.a((PouchDynamicAd) serializable);
                            }
                        }
                    }
                }
            });
            this.L.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    Object[] objArr11 = {view2, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect11 = a;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "ceee82fb139f5bc4196478b84144b236", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "ceee82fb139f5bc4196478b84144b236")).booleanValue();
                    }
                    ResultFragment.this.b();
                    return false;
                }
            });
        }
        this.K = GlobalSearchActivity.h();
        return inflate;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b682f377214f912bb93299767f2215a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b682f377214f912bb93299767f2215a9");
            return;
        }
        super.onViewCreated(view, bundle);
        this.e = new com.sankuai.waimai.business.search.global.filterbar.b(this.b, this.b, this, new com.sankuai.waimai.business.search.global.filterbar.a() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.12
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.search.global.filterbar.a
            public final void a() {
                String obj;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "163cb3ebba9f4848295c5c806f629d0d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "163cb3ebba9f4848295c5c806f629d0d");
                    return;
                }
                ResultFragment.a(ResultFragment.this, 0);
                if (TextUtils.isEmpty(ResultFragment.this.I.k)) {
                    obj = ResultFragment.this.b.j.getText().toString();
                } else {
                    obj = ResultFragment.this.I.k;
                }
                ResultFragment.this.a(obj, 7, ResultFragment.this.c.j, ResultFragment.this.z);
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7501b5c32bb243d530f2b2862a0929db", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7501b5c32bb243d530f2b2862a0929db");
                    return;
                }
                ResultFragment.this.b();
                if (ResultFragment.this.an != null) {
                    ResultFragment.this.aN.clearAnimation();
                    ResultFragment.this.aN.setVisibility(8);
                }
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "175c1a54b116eafe09eaf4dd982acade", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "175c1a54b116eafe09eaf4dd982acade");
                } else if (ResultFragment.this.an == null || ResultFragment.this.an.c != c.a.SHOW) {
                } else {
                    ResultFragment.this.aN.setVisibility(0);
                    ResultFragment.this.an.a();
                }
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.a
            public final void a(int i) {
                String obj;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d597f3fc1dc124d0763b096d6d1e984f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d597f3fc1dc124d0763b096d6d1e984f");
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("cat_id", Integer.valueOf(ResultFragment.this.c.w));
                hashMap.put("template_type", Integer.valueOf(ResultFragment.this.c.y));
                hashMap.put("choice_type", Integer.valueOf(ResultFragment.this.c.O == 200 ? 100 : 200));
                hashMap.put("search_log_id", ResultFragment.this.c.l);
                h.a(ResultFragment.this.getActivity(), 1, "c_nfqbfvw", "b_waimai_7d43r4wm_mc", AppUtil.generatePageInfoKey(ResultFragment.this.getActivity()), hashMap);
                ResultFragment.this.z = i;
                if (TextUtils.isEmpty(ResultFragment.this.I.k)) {
                    obj = ResultFragment.this.b.j.getText().toString();
                } else {
                    obj = ResultFragment.this.I.k;
                }
                ResultFragment.this.a(obj, 11, ResultFragment.this.c.j, ResultFragment.this.z);
            }

            @Override // com.sankuai.waimai.business.search.global.filterbar.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cd6815e5c826acd7f1347865895ebe96", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cd6815e5c826acd7f1347865895ebe96");
                } else if (ResultFragment.this.j != null) {
                    ResultFragment.this.j.a();
                }
            }
        }, getFragmentManager());
        final com.sankuai.waimai.business.search.global.filterbar.b bVar = this.e;
        String q = q();
        Object[] objArr2 = {view, q};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.global.filterbar.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9428d8e9a5acb5162fa06e9333643226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9428d8e9a5acb5162fa06e9333643226");
        } else {
            bVar.j = com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(bVar.m, com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.SEARCH_GLOBAL_POI, q);
            bVar.k = com.sankuai.waimai.platform.widget.filterbar.implement.injection.a.a(bVar.m, com.sankuai.waimai.platform.widget.filterbar.domain.repository.c.SEARCH_GLOBAL_PRODUCT, q);
            bVar.l = bVar.j;
            com.sankuai.waimai.business.search.global.filterbar.d dVar = new com.sankuai.waimai.business.search.global.filterbar.d() { // from class: com.sankuai.waimai.business.search.global.filterbar.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.b
                public final void a() {
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.b
                public final void a(@NonNull com.sankuai.waimai.platform.widget.filterbar.domain.model.c cVar) {
                    boolean z = false;
                    Object[] objArr3 = {cVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ace2a4c38dd2e4c6c1e0f1088787e531", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ace2a4c38dd2e4c6c1e0f1088787e531");
                        return;
                    }
                    b bVar2 = bVar;
                    if ((cVar.b != null && !cVar.b.isEmpty()) || ((cVar.c != null && !cVar.c.isEmpty()) || (cVar.a != null && cVar.a.longValue() != 0))) {
                        z = true;
                    }
                    bVar2.f = z;
                    bVar.e = cVar.a != null ? cVar.a.longValue() : 0L;
                    StringBuilder sb = new StringBuilder();
                    if (cVar.b != null) {
                        bVar.c = "";
                        for (String str : cVar.b) {
                            if (!TextUtils.isEmpty(bVar.c)) {
                                b bVar3 = bVar;
                                bVar3.c = bVar.c + CommonConstant.Symbol.COMMA;
                            }
                            b bVar4 = bVar;
                            bVar4.c = bVar.c + str;
                            sb.append(str);
                            sb.append(CommonConstant.Symbol.COMMA);
                        }
                    }
                    bVar.d = "";
                    if (cVar.c != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry<String, com.sankuai.waimai.platform.widget.filterbar.domain.model.g> entry : cVar.c.entrySet()) {
                            if (entry != null && !TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                                sb.append(entry.getKey());
                                sb.append(CommonConstant.Symbol.COMMA);
                                SliderSelectData sliderSelectData = new SliderSelectData();
                                sliderSelectData.b = entry.getKey();
                                sliderSelectData.d = entry.getValue().b;
                                sliderSelectData.c = entry.getValue().c;
                                JSONObject a2 = sliderSelectData.a();
                                if (a2.length() > 0) {
                                    jSONArray.put(a2);
                                }
                            }
                        }
                        if (jSONArray.length() > 0) {
                            bVar.d = jSONArray.toString();
                        }
                    }
                    if (sb.length() > 0) {
                        bVar.g = sb.deleteCharAt(sb.length() - 1).toString();
                    } else {
                        bVar.g = "";
                    }
                    if (bVar.n != null) {
                        bVar.n.a();
                    }
                }

                @Override // com.sankuai.waimai.business.search.global.filterbar.d
                public final void a(Object obj) {
                    Object[] objArr3 = {obj};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "27d0ba6489313250ff62660ebec05b85", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "27d0ba6489313250ff62660ebec05b85");
                    } else if (obj instanceof Integer) {
                        bVar.n.a(((Integer) obj).intValue());
                    }
                }

                @Override // com.sankuai.waimai.business.search.global.filterbar.d
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ee96ce88afb29e686c0aeaa6b2bf9b5c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ee96ce88afb29e686c0aeaa6b2bf9b5c");
                    } else if (bVar.n != null) {
                        bVar.n.d();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9a8b595005eedbcc2a7d06b6f1723b56", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9a8b595005eedbcc2a7d06b6f1723b56");
                    } else if (bVar.n != null) {
                        bVar.n.b();
                    }
                }

                @Override // com.sankuai.waimai.platform.widget.filterbar.view.controller.FilterBarViewController.a
                public final void b(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2f3080bb1573e432f98fc17eb460ff4f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2f3080bb1573e432f98fc17eb460ff4f");
                    } else if (bVar.n != null) {
                        bVar.n.c();
                    }
                }
            };
            bVar.o = new com.sankuai.waimai.business.search.global.filterbar.c(bVar.b, bVar.p, 2, bVar.i, (ViewGroup) view.findViewById(R.id.layout_float_filter_bar), dVar);
            bVar.h = new FilterBarViewController(bVar.o, bVar.l, 2, 3, dVar, bVar.m);
            bVar.h.a();
        }
        this.e.b(false);
        c(false);
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd4899c3d22b90e2eefcc0dbe144de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd4899c3d22b90e2eefcc0dbe144de8");
        } else if (getContext() != null) {
            ((ViewGroup.MarginLayoutParams) this.as.getLayoutParams()).topMargin = z ? getResources().getDimensionPixelSize(R.dimen.wm_nox_search_filter_bar_height_new_style) : 0;
            this.as.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DragTopLayout.b bVar) {
        boolean z;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f6f0d32cebdcfd33a06690ced0ddd51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f6f0d32cebdcfd33a06690ced0ddd51");
            return;
        }
        Iterator<c> it = this.t.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        if (this.am != null) {
            this.am.a(bVar == DragTopLayout.b.EXPANDED, c.a.CONTAINER);
        }
        if (this.al != null) {
            this.al.a(bVar == DragTopLayout.b.EXPANDED, c.a.CONTAINER);
        }
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ccc5179888d394d49e13da9c84f73995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ccc5179888d394d49e13da9c84f73995");
        } else if (this.g != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = d;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79fef9c43c29067a21f94f8d1294b300", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79fef9c43c29067a21f94f8d1294b300")).booleanValue();
            } else {
                if (this.n != null && this.n.a != null && this.n.a.topModuleList != null) {
                    for (OasisModule oasisModule : this.n.a.topModuleList) {
                        if (oasisModule != null && "mach-waimai-search-medicine-im-entrance".equals(oasisModule.machTemplateId)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4573432819d25640ea078837acde1f45", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4573432819d25640ea078837acde1f45");
                } else {
                    Animation animation = this.g.getAnimation();
                    this.g.removeCallbacks(this.p);
                    if (animation != null) {
                        animation.cancel();
                        this.g.clearAnimation();
                    }
                }
                if (bVar == DragTopLayout.b.COLLAPSED) {
                    this.g.setVisibility(0);
                    this.aX = true;
                    this.O.a(this.P);
                    return;
                }
                this.g.setVisibility(8);
                this.aX = false;
            }
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7fb06ac18cfd0683d9b43a7fddc511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7fb06ac18cfd0683d9b43a7fddc511");
        } else if (g().j) {
            g().c();
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0edc4699e36a34c0d526432eae8cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0edc4699e36a34c0d526432eae8cdb");
            return;
        }
        if (z) {
            this.f.removeCallbacks(this.o);
            this.g.removeCallbacks(this.p);
        }
        if (this.W && this.L.getScrollState() == 1) {
            if (this.q == null && getActivity() != null) {
                this.q = com.sankuai.waimai.business.search.common.util.b.a(500, 0.5f, g.a(getActivity(), 10.0f) + (this.S.getWidth() / 2.0f));
            }
            if (this.r == null && getActivity() != null) {
                this.r = com.sankuai.waimai.business.search.common.util.b.a(500, 0.35f, g.a(getActivity(), 67.0f));
            }
            if (this.f.getAnimation() == this.q || this.g.getAnimation() == this.r) {
                return;
            }
            this.f.startAnimation(this.q);
            this.g.startAnimation(this.r);
        }
    }

    private void a(NoResultRemindInfoData noResultRemindInfoData) {
        boolean z = true;
        Object[] objArr = {noResultRemindInfoData};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d23bf9e535a591476717d1b85cc071", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d23bf9e535a591476717d1b85cc071");
            return;
        }
        this.ab = 1;
        if (this.h) {
            this.l.setVisibility(8);
        } else {
            u();
            this.ag.a(noResultRemindInfoData, this.e.f);
            com.sankuai.waimai.business.search.ui.a a2 = com.sankuai.waimai.business.search.ui.a.a();
            if ((a2.b == 0 || a2.c == 0) && ((a2.d == 0.0d || a2.e == 0.0d) && (a2.f == 0.0d || a2.g == 0.0d))) {
                z = false;
            }
            if (!z) {
                ae.a(this.F, (int) R.string.wm_nox_search_location_error_text);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ca65303ae38f62c33bc2b192ec20fea5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ca65303ae38f62c33bc2b192ec20fea5");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("keyword", this.c.g);
                        jSONObject.put("search_log_id", this.c.l);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    i.d(new m().a("search_location_error").c("location_param_error").d(jSONObject.toString()).b());
                }
            }
        }
        J();
    }

    private void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3a30d20d959e0ff94e8839e755525ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3a30d20d959e0ff94e8839e755525ee");
            return;
        }
        this.ab = 3;
        this.ag.a(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.8
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44894bf3560f56e63892794767d63279", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44894bf3560f56e63892794767d63279");
                } else {
                    ResultFragment.this.b(ResultFragment.this.c.g, ResultFragment.this.c.J, ResultFragment.this.c.j);
                }
            }
        }, th);
        J();
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcac59119af428ef2f4c127ed05fc2da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcac59119af428ef2f4c127ed05fc2da");
        } else {
            this.L.setVisibility(8);
        }
    }

    private void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46d129ce0b2a92e8010276932023e65f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46d129ce0b2a92e8010276932023e65f");
            return;
        }
        this.h = false;
        this.k.setVisibility(8);
        this.j.setPanelState(DragTopLayout.b.COLLAPSED);
        a(DragTopLayout.b.COLLAPSED);
        this.I.a(this.h);
        this.j.a(0, true);
        this.j.requestLayout();
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddcb7a4bef2cd5c1bb86e83e6fe35409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddcb7a4bef2cd5c1bb86e83e6fe35409");
            return;
        }
        this.ah.setVisibility(8);
        this.ai.setVisibility(8);
        this.aj.setVisibility(8);
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4eeb79d4e66d98970c03932c331abd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4eeb79d4e66d98970c03932c331abd4");
        } else {
            a((com.sankuai.waimai.business.search.model.a) null);
        }
    }

    private void a(com.sankuai.waimai.business.search.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd4d03b8191cb5d4a074e42f04a88251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd4d03b8191cb5d4a074e42f04a88251");
        } else if (this.e.f) {
        } else {
            if (b(aVar)) {
                this.e.b(true);
                c(true);
                SearchStatisticsData searchStatisticsData = new SearchStatisticsData();
                searchStatisticsData.templateType = this.c.y;
                if (this.ap != null) {
                    searchStatisticsData.searchWordType = this.ap.type;
                    searchStatisticsData.searchKeyword = this.ap.searchKeyword;
                    searchStatisticsData.viewKeyword = this.ap.viewKeyword;
                }
                this.e.a(searchStatisticsData);
                return;
            }
            this.e.b(false);
            c(false);
        }
    }

    private boolean b(com.sankuai.waimai.business.search.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ceff7ad35ecfc6513452697210923b4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ceff7ad35ecfc6513452697210923b4")).booleanValue();
        }
        if (aVar != null && (aVar.a instanceof GlobalPageResponse)) {
            this.e.a(((GlobalPageResponse) aVar.a).showAllFilter);
            return ((GlobalPageResponse) aVar.a).showFilter;
        } else if (this.n == null || !(this.n.a instanceof GlobalPageResponse)) {
            return false;
        } else {
            this.e.a(this.n.a.showAllFilter);
            return this.n.a.showFilter;
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc8289754d8395eda8d3152ee05a5db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc8289754d8395eda8d3152ee05a5db0");
        } else if (this.e != null) {
            this.e.c();
        }
    }

    public final com.sankuai.waimai.business.search.ui.result.guideQuery.b g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aac5c8aa0a893841ca47cf85ad67de3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.search.ui.result.guideQuery.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aac5c8aa0a893841ca47cf85ad67de3");
        }
        if (this.aA == null) {
            this.aA = new com.sankuai.waimai.business.search.ui.result.guideQuery.b(getContext(), this.az);
        }
        return this.aA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fa0d3f9f37b4ebcc54a996e7f2a075b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fa0d3f9f37b4ebcc54a996e7f2a075b");
            return;
        }
        this.ah.setVisibility(0);
        this.ai.setVisibility(0);
        this.aj.setVisibility(0);
        this.aj.setText(R.string.wm_nox_search_footer_loading);
    }

    public static String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2705b2be3a2993a086b67ea542878792", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2705b2be3a2993a086b67ea542878792");
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (valueOf.length() > 4) {
            valueOf = valueOf.substring(4);
        }
        String c2 = com.sankuai.waimai.platform.b.A().c();
        if (c2 == null) {
            long d2 = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            c2 = d2 > 0 ? String.valueOf(d2) : "";
        }
        return valueOf + Math.abs(c2.hashCode());
    }

    public final void b(String str, int i, int i2) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25ff83f8caba86430a4a3a6829b2c608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25ff83f8caba86430a4a3a6829b2c608");
        } else {
            a(0L, "", str, "", i, i2);
        }
    }

    public final void a(long j, String str, String str2, String str3, int i, int i2) {
        Object[] objArr = {new Long(j), str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a906003db2c18a24291b6f2b8bf33d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a906003db2c18a24291b6f2b8bf33d3");
            return;
        }
        if (i == 4) {
            if (this.A == -1) {
                this.A = this.z;
            }
            this.z = 0;
        } else if (i == 12) {
            if (this.A != -1) {
                this.z = this.A;
            }
            this.A = -1;
        } else if (i == 14) {
            this.A = -1;
            this.z = this.c.G;
        } else if (i == 0 || i == 3) {
            this.A = -1;
            this.z = 0;
        } else {
            this.A = -1;
            this.z = 0;
        }
        a(j, str, str2, str3, i, i2, this.z);
    }

    public final void a(String str, int i, int i2, int i3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7773deb35de4e7808eafcabcacb502ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7773deb35de4e7808eafcabcacb502ba");
        } else {
            a(0L, "", str, "", i, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x027e  */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [com.sankuai.waimai.business.search.model.OasisModule, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(long r23, java.lang.String r25, java.lang.String r26, java.lang.String r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.search.ui.result.ResultFragment.a(long, java.lang.String, java.lang.String, java.lang.String, int, int, int):void");
    }

    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d37695f4f4374dd6b480141e21ced0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d37695f4f4374dd6b480141e21ced0");
            return;
        }
        this.ad.setVisibility(0);
        this.ae.setVisibility(8);
    }

    private void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e567c90202da631d7cd7cac1e774ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e567c90202da631d7cd7cac1e774ba");
            return;
        }
        this.ad.setVisibility(8);
        this.ae.setVisibility(0);
    }

    private void B() {
        this.V = false;
        this.ar = 0;
    }

    public static Integer a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d7a56306849cad681ee11affadde7ee", RobustBitConfig.DEFAULT_VALUE)) {
            return (Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d7a56306849cad681ee11affadde7ee");
        }
        if (i == 100 || i == 200) {
            return Integer.valueOf(i);
        }
        return null;
    }

    private void a(final boolean z, final String str, final boolean z2, final int i, final boolean z3, final String str2, final String str3, final int i2, String str4, String str5) {
        String str6;
        int i3;
        String sb;
        final String str7;
        String str8 = str4;
        String str9 = str5;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, str3, Integer.valueOf(i2), str8, str9};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baadfc5a55ae42c01027ecbb0bc7640c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baadfc5a55ae42c01027ecbb0bc7640c");
            return;
        }
        com.sankuai.waimai.business.search.common.util.f.a(z, str, z2, i, z3, str2, str3, i2, str4, str5);
        if (!z && !z2) {
            com.sankuai.waimai.business.search.monitor.horn.a.a().b();
        }
        String str10 = "";
        if (!z) {
            this.c.j = i;
            str6 = "";
            i3 = 0;
        } else {
            str10 = this.e.c;
            str6 = this.e.d;
            i3 = (int) this.e.e;
        }
        final Activity activity = this.F;
        boolean z4 = activity instanceof BaseActivity;
        if (z4 && this.c.B) {
            ((BaseActivity) activity).s().recordStep("mach_trace");
        }
        com.sankuai.waimai.platform.mach.monitor.b.a().e();
        if (z4 && this.c.B) {
            ((BaseActivity) activity).s().recordStep("request_start");
        }
        final MetricsSpeedMeterTask createCustomSpeedMeterTask = MetricsSpeedMeterTask.createCustomSpeedMeterTask(getClass().getName(), true);
        createCustomSpeedMeterTask.recordStep("request_start");
        this.aU = false;
        this.ac.removeCallbacks(this.aY);
        com.sankuai.waimai.ai.uat.b.a().a("query_key", str);
        final b.AbstractC1042b<com.sankuai.waimai.business.search.model.a<GlobalPageResponse>> abstractC1042b = new b.AbstractC1042b<com.sankuai.waimai.business.search.model.a<GlobalPageResponse>>() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.9
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                com.sankuai.waimai.business.search.model.a aVar = (com.sankuai.waimai.business.search.model.a) obj;
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9784698e2374dd0abbad2dae23af37f3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9784698e2374dd0abbad2dae23af37f3");
                    return;
                }
                ResultFragment.this.ag.i();
                ResultFragment.this.y = false;
                ResultFragment.g(ResultFragment.this, true);
                createCustomSpeedMeterTask.recordStep("response_start");
                ResultFragment.a(ResultFragment.this, aVar, z2, z);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.util.f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1fe88b52e6f5914d43a851ccd45c89b2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1fe88b52e6f5914d43a851ccd45c89b2");
                } else {
                    com.sankuai.waimai.platform.capacity.log.b.a(new m().a("main_search_process").b("main_search_result_success").b());
                }
                com.sankuai.waimai.business.search.monitor.horn.a a2 = com.sankuai.waimai.business.search.monitor.horn.a.a();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.search.monitor.horn.a.a;
                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "3538dd42d8b779097f97c11739527f37", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "3538dd42d8b779097f97c11739527f37");
                } else if (a2.e && a2.c) {
                    a2.c = false;
                    a2.b("search_request_net_success_qv");
                }
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1515bc86541026fe34af6d65028e6350", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1515bc86541026fe34af6d65028e6350");
                    return;
                }
                Object[] objArr3 = {th};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.util.f.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "2dce4b0c75d143ebc5c868b910462de8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "2dce4b0c75d143ebc5c868b910462de8");
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (th != null) {
                            jSONObject.put("msg", th.getMessage());
                        }
                        com.sankuai.waimai.platform.capacity.log.b.b(new m().a("main_search_process").b("main_search_result_fail").d(jSONObject.toString()).b());
                    } catch (JSONException unused) {
                    }
                }
                ResultFragment.g(ResultFragment.this, false);
                ResultFragment.a(ResultFragment.this, z2, createCustomSpeedMeterTask, th);
                DovePageMonitor.a(ResultFragment.this.getActivity(), (int) IjkMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
            }
        };
        if (!TextUtils.isEmpty(str10) && !TextUtils.isEmpty(str4)) {
            sb = str10 + CommonConstant.Symbol.COMMA + str8;
        } else if (TextUtils.isEmpty(str10) && TextUtils.isEmpty(str4)) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            if (TextUtils.isEmpty(str10)) {
                str10 = "";
            }
            sb2.append(str10);
            if (TextUtils.isEmpty(str4)) {
                str8 = "";
            }
            sb2.append(str8);
            sb = sb2.toString();
        }
        if (TextUtils.isEmpty(str5)) {
            str7 = sb;
        } else {
            if (!TextUtils.isEmpty(sb)) {
                str9 = sb + CommonConstant.Symbol.COMMA + str9;
            }
            str7 = str9;
        }
        com.sankuai.waimai.business.search.ui.a a2 = com.sankuai.waimai.business.search.ui.a.a();
        a2.c = this.c.E;
        a2.b = this.c.F;
        WMLocation i4 = com.sankuai.waimai.foundation.location.v2.g.a().i();
        if (i4 != null) {
            a2.d = i4.getLatitude();
            a2.e = i4.getLongitude();
        }
        WMLocation p = com.sankuai.waimai.foundation.location.v2.g.a().p();
        if (p != null) {
            a2.f = p.getLatitude();
            a2.g = p.getLongitude();
        }
        this.c.V = !TextUtils.isEmpty(this.I.l);
        final String str11 = str6;
        final int i5 = i3;
        com.sankuai.waimai.platform.preload.e.a().a(getActivity(), new com.sankuai.waimai.platform.preload.c<com.sankuai.waimai.business.search.model.a<GlobalPageResponse>>() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.preload.c
            public final void a(com.sankuai.waimai.platform.preload.f<com.sankuai.waimai.business.search.model.a<GlobalPageResponse>> fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3584d1bfe4381bafd2d2d432b594ba56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3584d1bfe4381bafd2d2d432b594ba56");
                } else if (com.sankuai.waimai.foundation.utils.f.a(ResultFragment.this.getActivity())) {
                } else {
                    switch (AnonymousClass16.a[fVar.b.ordinal()]) {
                        case 1:
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.util.f.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "7d449889d0ef026778b8dcb649336beb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "7d449889d0ef026778b8dcb649336beb");
                            } else {
                                com.sankuai.waimai.platform.capacity.log.b.a(new m().a("main_search_process").b("main_search_hit_preload").b());
                            }
                            com.sankuai.waimai.business.search.model.a<GlobalPageResponse> aVar = fVar.c;
                            if (aVar == null) {
                                abstractC1042b.onError(new com.sankuai.waimai.platform.modular.network.error.a(-999, "preload result null"));
                                return;
                            } else if (aVar.a != null && aVar.a.mError != null) {
                                abstractC1042b.onError(aVar.a.mError);
                                return;
                            } else {
                                if (aVar.a != null && aVar.a._recommendSearchGlobalId != null) {
                                    ResultFragment.this.aq = aVar.a._recommendSearchGlobalId;
                                }
                                if (activity instanceof BaseActivity) {
                                    ((BaseActivity) activity).s().recordStep("hit_preload");
                                }
                                abstractC1042b.onNext(aVar);
                                return;
                            }
                        case 2:
                            return;
                        case 3:
                            com.sankuai.waimai.platform.mach.monitor.d.a("search/globalpage", "search");
                            String a3 = ListIDHelper.a.a.a("nox", "search_global_block");
                            if (ResultFragment.this.w == 0) {
                                a3 = ListIDHelper.a.a.a();
                                ListIDHelper.a.a.a("nox", "search_global_block", a3);
                            }
                            String str12 = a3;
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiSearchService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiSearchService.class)).searchGlobalPage(ResultFragment.this.c.v, ResultFragment.this.c.w, ResultFragment.this.c.x, str, (!ResultFragment.this.c.V || TextUtils.isEmpty(ResultFragment.this.c.f)) ? "" : ResultFragment.this.c.f, (!ResultFragment.this.c.V || TextUtils.isEmpty(ResultFragment.this.I.l)) ? "" : ResultFragment.this.I.l, i, ResultFragment.this.w, 10, str7, str11, i5, z3, str2, str3, ResultFragment.a(i2), ResultFragment.this.m, 0, "", ResultFragment.this.ax, ResultFragment.this.ay, ResultFragment.this.c.E, ResultFragment.this.c.F, ResultFragment.this.c.H, ResultFragment.this.c.M, ResultFragment.this.c.L, ResultFragment.this.c.N, ResultFragment.this.b.b() ? 1 : 0, ResultFragment.this.c.am, "", str12, com.sankuai.waimai.business.search.common.util.a.a()), abstractC1042b, ResultFragment.this.q());
                            return;
                        default:
                            return;
                    }
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.search.ui.result.ResultFragment$16  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass16 {
        public static final /* synthetic */ int[] a = new int[f.a.valuesCustom().length];

        static {
            try {
                a[f.a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.a.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90686890358c6032c61ab0d7a5a92e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90686890358c6032c61ab0d7a5a92e63");
        } else if (MetricsSpeedMeterTask.getCustomSpeedMeterTask(getClass().getName()) != null) {
            MetricsSpeedMeterTask customSpeedMeterTask = MetricsSpeedMeterTask.getCustomSpeedMeterTask(getClass().getName());
            customSpeedMeterTask.recordStep(str);
            if (z) {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(customSpeedMeterTask);
                MetricsSpeedMeterTask.removeCustomSpeedMeterTask(getClass().getName());
                DovePageMonitor.a(getActivity(), 200);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa42199781b58d959dd66e3216ed5f40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa42199781b58d959dd66e3216ed5f40");
            return;
        }
        this.ac.setVisibility(8);
        this.af.setVisibility(4);
    }

    private void c(com.sankuai.waimai.business.search.model.a<GlobalPageResponse> aVar) {
        int i;
        OasisModule remove;
        boolean z;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f65e680e5517ceab11b7e17ff13a9cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f65e680e5517ceab11b7e17ff13a9cbc");
            return;
        }
        List<OasisModule> list = aVar.a.moduleList;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "08c9c130a1951534606b719e9ba527f9", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "08c9c130a1951534606b719e9ba527f9")).intValue();
        } else {
            if (list != null) {
                i = 0;
                while (i < list.size()) {
                    if (list.get(i) != null) {
                        if (TextUtils.equals(list.get(i).nativeTemplateId, this.b.b() ? "wm_search_fast_filter_elderly_template" : "wm_search_fast_filter_template")) {
                            break;
                        }
                    }
                    i++;
                }
            }
            i = -1;
        }
        if (i == -1 || (remove = aVar.a.moduleList.remove(i)) == null || TextUtils.isEmpty(remove.stringData)) {
            return;
        }
        try {
            JSONArray optJSONArray = new JSONObject(remove.stringData).optJSONArray("sort_criterion_list");
            JSONArray jSONArray = new JSONArray();
            int i2 = (int) this.e.e;
            if (optJSONArray == null || optJSONArray.length() <= 0) {
                z = false;
            } else {
                z = false;
                for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i3);
                    if (optJSONObject != null) {
                        JSONObject jSONObject = new JSONObject();
                        int optInt = optJSONObject.optInt("code", 0);
                        jSONObject.put("code", optInt);
                        jSONObject.put("name", optJSONObject.optString("name", ""));
                        jSONObject.put("short_name", optJSONObject.optString("shortName", ""));
                        jSONObject.put("icon_url", optJSONObject.optString("iconUrl", ""));
                        jSONObject.put("icon_url_click", optJSONObject.optString("iconUrlClick", ""));
                        jSONObject.put("icon_url_reverse", optJSONObject.optString("iconUrlReverse", ""));
                        jSONObject.put("position", optJSONObject.optInt("position", 0));
                        int optInt2 = optJSONObject.optInt("reverseCode", 0);
                        jSONObject.put("reverse_code", optInt2);
                        if (i2 == optInt || (optInt2 != 0 && optInt2 == i2)) {
                            z = true;
                        }
                        jSONObject.put("text_click", optJSONObject.optString("textClick", ""));
                        jSONObject.put("text_reverse", optJSONObject.optString("textReverse", ""));
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("bubbleInfo");
                        if (optJSONObject2 != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("is_show", optJSONObject2.optBoolean(IsShow.LOWER_CASE_NAME, false));
                            jSONObject2.put("bubble_version", optJSONObject2.optInt("bubbleVersion", 0));
                            jSONObject.put("bubble_info", jSONObject2);
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("SEARCH_PRODUCT", jSONArray);
            jSONObject4.put("SEARCH_POI", jSONArray);
            jSONObject3.put("sortby_search", jSONObject4);
            com.sankuai.waimai.business.search.global.filterbar.k kVar = new com.sankuai.waimai.business.search.global.filterbar.k(getContext());
            Object[] objArr3 = {jSONObject3};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.global.filterbar.k.a;
            if (PatchProxy.isSupport(objArr3, kVar, changeQuickRedirect3, false, "494a6f4bb4268d209f2231dcff9b2e39", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, kVar, changeQuickRedirect3, false, "494a6f4bb4268d209f2231dcff9b2e39");
            } else {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.search.global.filterbar.k.a;
                if (PatchProxy.isSupport(objArr4, kVar, changeQuickRedirect4, false, "af481faeeb80d01a7618c0e543fb1356", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, kVar, changeQuickRedirect4, false, "af481faeeb80d01a7618c0e543fb1356");
                } else if (kVar.b == null) {
                    kVar.b = new SearchLoadConfig();
                }
                kVar.b.loadConfig(kVar.c, jSONObject3);
            }
            if (a(this.aL) != null && this.aL != aVar.a.searchMode) {
                this.I.a(aVar.a.switchButton);
                this.e.a(aVar.a.searchMode);
                this.c.R = (int) this.e.e;
            } else if (!z) {
                this.c.R = 0;
            }
            com.sankuai.waimai.business.search.global.filterbar.b bVar = this.e;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.search.global.filterbar.b.a;
            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "c100461b8d49e5fd5432f09391349282", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "c100461b8d49e5fd5432f09391349282");
            } else if (bVar.o != null) {
                com.sankuai.waimai.business.search.global.filterbar.c cVar = bVar.o;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.search.global.filterbar.c.a;
                if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "e57f564ee31db0e0a68caa7fc5ec28c1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "e57f564ee31db0e0a68caa7fc5ec28c1");
                } else if (cVar.b != null) {
                    cVar.b.a();
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void b(List<OasisModule> list) {
        int i;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc3a7f6ca42d91e2956f3161ade16f84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc3a7f6ca42d91e2956f3161ade16f84");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            i = -1;
        } else {
            i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                OasisModule oasisModule = list.get(i2);
                if (oasisModule != null && TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_guide_query")) {
                    i = i2;
                }
            }
        }
        if (i != -1 && com.sankuai.waimai.foundation.utils.d.a(this.u)) {
            Serializable a2 = com.sankuai.waimai.business.search.common.data.a.a(list.get(i));
            if (a2 instanceof GuideQueryData) {
                GuideQueryData guideQueryData = (GuideQueryData) a2;
                if (com.sankuai.waimai.foundation.utils.d.a(guideQueryData.guidedQueryWordsNew)) {
                    return;
                }
                for (int i3 = 0; i3 < guideQueryData.guidedQueryWordsNew.size(); i3++) {
                    GuideQueryData.GuidedQueryWordNew guidedQueryWordNew = guideQueryData.guidedQueryWordsNew.get(i3);
                    if (guidedQueryWordNew.isAmbiguousWord() || guidedQueryWordNew.isFilterGroup() || guidedQueryWordNew.isFilterItem()) {
                        this.u.add(guidedQueryWordNew);
                    }
                }
            }
        } else if (i == -1 && !com.sankuai.waimai.foundation.utils.d.a(this.u)) {
            OasisModule oasisModule2 = new OasisModule();
            oasisModule2.moduleId = "guide_query_module";
            oasisModule2.nativeTemplateId = "wm_search_guide_query";
            oasisModule2.unionId = "guide_query_module";
            oasisModule2.templateType = 0;
            GuideQueryData guideQueryData2 = new GuideQueryData();
            guideQueryData2.guidedQueryWordsNew = a(this.u, new ArrayList());
            oasisModule2.stringData = new Gson().toJson(guideQueryData2);
            list.add(0, oasisModule2);
        } else if (i != -1 && !com.sankuai.waimai.foundation.utils.d.a(this.u)) {
            OasisModule oasisModule3 = list.get(i);
            Serializable a3 = com.sankuai.waimai.business.search.common.data.a.a(oasisModule3);
            if (a3 instanceof GuideQueryData) {
                GuideQueryData guideQueryData3 = (GuideQueryData) a3;
                guideQueryData3.guidedQueryWordsNew = a(this.u, guideQueryData3.guidedQueryWordsNew);
            }
            oasisModule3.stringData = new Gson().toJson(a3);
        }
    }

    private void c(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2414f940e4a58694aaaedb394112ad3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2414f940e4a58694aaaedb394112ad3d");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            for (int i = 0; i < list.size(); i++) {
                OasisModule oasisModule = list.get(i);
                if (oasisModule != null && TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_fullpage_no_result") && list.size() >= 2) {
                    oasisModule.nativeTemplateId = "wm_search_filter_no_result";
                }
            }
        }
    }

    private List<GuideQueryData.GuidedQueryWordNew> a(@NonNull List<GuideQueryData.GuidedQueryWordNew> list, List<GuideQueryData.GuidedQueryWordNew> list2) {
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b32667bacb315d4ffa96b9441eadabe", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b32667bacb315d4ffa96b9441eadabe");
        }
        String str = this.e.c;
        List asList = Arrays.asList(!TextUtils.isEmpty(str) ? str.split(CommonConstant.Symbol.COMMA) : new String[0]);
        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            for (int i = 0; i < list.size(); i++) {
                GuideQueryData.GuidedQueryWordNew guidedQueryWordNew = list.get(i);
                if (guidedQueryWordNew.isFilterGroup() && guidedQueryWordNew.wmFilterGroup != null) {
                    if (!com.sankuai.waimai.foundation.utils.d.a(guidedQueryWordNew.wmFilterGroup.items)) {
                        int i2 = 0;
                        for (int i3 = 0; i3 < guidedQueryWordNew.wmFilterGroup.items.size(); i3++) {
                            GuideQueryData.WmFilterItem wmFilterItem = guidedQueryWordNew.wmFilterGroup.items.get(i3);
                            wmFilterItem.isHit = asList.contains(wmFilterItem.code);
                            i2 += wmFilterItem.isHit ? 1 : 0;
                        }
                        guidedQueryWordNew.wmFilterGroup.isHit = i2 > 0;
                    }
                } else if (guidedQueryWordNew.isFilterItem() && guidedQueryWordNew.wmFilterItem != null) {
                    guidedQueryWordNew.wmFilterItem.isHit = asList.contains(guidedQueryWordNew.wmFilterItem.code);
                }
            }
        }
        if (!com.sankuai.waimai.foundation.utils.d.a(list2)) {
            for (int size = list2.size() - 1; size >= 0; size--) {
                GuideQueryData.GuidedQueryWordNew guidedQueryWordNew2 = list2.get(size);
                if (guidedQueryWordNew2.isAmbiguousWord() || guidedQueryWordNew2.isFilterGroup() || guidedQueryWordNew2.isFilterItem()) {
                    list2.remove(size);
                }
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private void d(List<OasisModule> list) {
        int i;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "493d540a5e12710643c350987bf745cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "493d540a5e12710643c350987bf745cd");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list)) {
            i = -1;
        } else {
            i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                OasisModule oasisModule = list.get(i2);
                if (oasisModule != null && TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_coupon_card")) {
                    i = i2;
                }
            }
        }
        if (i != -1) {
            this.aP = list.remove(i);
        }
    }

    private void b(List<OasisModule> list, List<OasisModule> list2) {
        int i;
        int i2;
        int i3;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a11cfa6f4094e2d33b56aa647f78c86c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a11cfa6f4094e2d33b56aa647f78c86c");
        } else if (list != null) {
            if (com.sankuai.waimai.foundation.utils.d.a(list)) {
                i = -1;
                i2 = -1;
            } else {
                i = -1;
                i2 = -1;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    OasisModule oasisModule = list.get(i4);
                    if (oasisModule != null && TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_guide_query_template")) {
                        i2 = i4;
                    }
                    if (oasisModule != null && TextUtils.equals(oasisModule.nativeTemplateId, "wm_search_category2_filter_template")) {
                        i = i4;
                    }
                }
            }
            if (!com.sankuai.waimai.foundation.utils.d.a(list2)) {
                this.c.ar = true;
            } else {
                this.c.ar = false;
            }
            if (i != -1) {
                OasisModule remove = list.remove(i);
                if (this.aM != null) {
                    remove = this.aM;
                }
                this.aM = remove;
            }
            OasisModule oasisModule2 = null;
            if (i2 != -1) {
                if (i != -1 && i <= i2) {
                    i2--;
                }
                oasisModule2 = list.remove(i2);
            }
            OasisModule oasisModule3 = oasisModule2;
            if (this.aM != null) {
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7da6b1f829fcefa1cb7c427fcd90d649", RobustBitConfig.DEFAULT_VALUE)) {
                    i3 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7da6b1f829fcefa1cb7c427fcd90d649")).intValue();
                } else {
                    if (list != null) {
                        i3 = 0;
                        while (i3 < list.size()) {
                            if (list.get(i3) != null && TextUtils.equals(list.get(i3).nativeTemplateId, "wm_search_guide_query")) {
                                break;
                            }
                            i3++;
                        }
                    }
                    i3 = -1;
                }
                if (i3 != -1) {
                    list.add(i3 + 1, this.aM);
                } else {
                    list.add(0, this.aM);
                }
            }
            if (oasisModule3 != null) {
                Serializable a2 = com.sankuai.waimai.business.search.common.data.a.a(oasisModule3);
                if (a2 instanceof GuideQueryCard) {
                    GuideQueryCard guideQueryCard = (GuideQueryCard) a2;
                    if (!com.sankuai.waimai.foundation.utils.d.a(guideQueryCard.guidedQueryV2List)) {
                        a(guideQueryCard.guidedQueryV2List);
                        return;
                    } else if (com.sankuai.waimai.foundation.utils.d.a(guideQueryCard.guidedQueryV2TabList)) {
                        this.aF.setVisibility(8);
                        return;
                    } else {
                        this.aD.e = 0;
                        if (guideQueryCard.guidedQueryV2TabList.size() > 1) {
                            this.aC.setVisibility(0);
                            this.c.as = true;
                            if (!TextUtils.isEmpty(guideQueryCard.guidedQueryV2TabList.get(0).tab)) {
                                this.c.at = guideQueryCard.guidedQueryV2TabList.get(0).tab;
                            } else {
                                this.c.at = "";
                            }
                            com.sankuai.waimai.business.search.ui.result.guideQuery.e eVar = this.aD;
                            List<GuideQueryCard.TabGuideQuery> list3 = guideQueryCard.guidedQueryV2TabList;
                            Object[] objArr3 = {list3};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.ui.result.guideQuery.e.a;
                            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "cfe48eeb868dc97ba369becac79194a9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "cfe48eeb868dc97ba369becac79194a9");
                            } else {
                                eVar.b.clear();
                                eVar.b.addAll(list3);
                            }
                            this.aD.notifyDataSetChanged();
                        } else {
                            this.aC.setVisibility(8);
                            this.c.as = false;
                            this.c.at = "";
                        }
                        boolean z = this.c.ar;
                        boolean z2 = this.c.as;
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = d;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00d8e63ce01385c3ea9854d058ab99b7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00d8e63ce01385c3ea9854d058ab99b7");
                        } else {
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.aG.getLayoutParams();
                            if (z) {
                                gradientDrawable.setCornerRadius(g.a(this.aG.getContext(), 0.0f));
                                gradientDrawable.setColor(this.aG.getContext().getResources().getColor(R.color.wm_nox_search_F5F5F6));
                                marginLayoutParams.topMargin = g.a(this.aG.getContext(), 0.0f);
                                marginLayoutParams.bottomMargin = g.a(this.aG.getContext(), 0.0f);
                                if (z2) {
                                    this.aH.setVisibility(0);
                                } else {
                                    this.aH.setVisibility(8);
                                }
                            } else {
                                this.aH.setVisibility(8);
                                if (z2) {
                                    gradientDrawable.setCornerRadius(g.a(this.aG.getContext(), 12.0f));
                                    gradientDrawable.setColor(this.aG.getContext().getResources().getColor(R.color.wm_nox_search_FFFDFDFD));
                                    marginLayoutParams.topMargin = g.a(this.aG.getContext(), 8.0f);
                                    marginLayoutParams.bottomMargin = g.a(this.aG.getContext(), 13.0f);
                                } else {
                                    gradientDrawable.setCornerRadius(g.a(this.aG.getContext(), 0.0f));
                                    gradientDrawable.setColor(this.aG.getContext().getResources().getColor(R.color.transparent));
                                    marginLayoutParams.topMargin = g.a(this.aG.getContext(), 0.0f);
                                    marginLayoutParams.bottomMargin = g.a(this.aG.getContext(), 0.0f);
                                }
                            }
                            this.aG.setBackground(gradientDrawable);
                            this.aG.setLayoutParams(marginLayoutParams);
                        }
                        a(guideQueryCard.guidedQueryV2TabList.get(0).tabSecondSearchQueryList);
                        return;
                    }
                }
                this.aF.setVisibility(8);
                return;
            }
            this.aF.setVisibility(8);
        }
    }

    public final void a(List<GuideQueryCard.GuideQuery> list) {
        CommonPageStyleConfig commonPageStyleConfig;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdc661525dc9a3bc0f2bcd60482d6497", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdc661525dc9a3bc0f2bcd60482d6497");
            return;
        }
        this.aF.setVisibility(0);
        this.aJ.f = true ^ TextUtils.isEmpty(list.get(0).queryPic);
        this.aJ.a(list);
        this.aJ.notifyDataSetChanged();
        if (this.n == null || this.n.a == null || (commonPageStyleConfig = this.n.a.commonPageStyleConfig) == null) {
            return;
        }
        this.I.a(commonPageStyleConfig, (View) null);
    }

    public final void a(CategoryFilterData.a aVar, int i) {
        String obj;
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4dd770a6c669ef4b3ebbcd57f93c06a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4dd770a6c669ef4b3ebbcd57f93c06a7");
            return;
        }
        this.w = 0;
        this.s = aVar.a;
        if (TextUtils.isEmpty(this.I.k)) {
            obj = this.b.j.getText().toString();
        } else {
            obj = this.I.k;
        }
        a(obj, 16, this.c.j, this.z);
    }

    private String a(Map<String, String> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ad56c11c0f2da4145a0149c9e79290", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ad56c11c0f2da4145a0149c9e79290");
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map.get(str);
    }

    private static NoResultRemindInfoData e(@NonNull List<Serializable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00e458db83a735a9dea6ae802cdf2317", RobustBitConfig.DEFAULT_VALUE)) {
            return (NoResultRemindInfoData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00e458db83a735a9dea6ae802cdf2317");
        }
        for (Serializable serializable : list) {
            if ((serializable instanceof NoResultRemindInfoData) && !(serializable instanceof FilterNoResultRemindInfoData)) {
                return (NoResultRemindInfoData) serializable;
            }
        }
        return null;
    }

    private Map<String, Object> D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b566f7dd7a2786137d74d6a41dcc26c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b566f7dd7a2786137d74d6a41dcc26c4");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qw_type_id", this.c.e);
        hashMap.put("stid", this.c.d);
        hashMap.put("keyword", this.c.g);
        hashMap.put("label_word", this.c.h);
        hashMap.put("search_log_id", this.c.l);
        hashMap.put("template_type", Integer.valueOf(this.c.y));
        hashMap.put("picture_pattern", 0);
        hashMap.put("cat_id", Integer.valueOf(this.c.w));
        hashMap.put("is_filter_result", k.a(this.c));
        hashMap.put("filter_type", TextUtils.isEmpty(this.c.S) ? "0" : this.c.S);
        hashMap.put("rank_type", Integer.valueOf(this.c.R));
        hashMap.put("keyword_log_id", this.c.I);
        hashMap.put("no_result_scene", com.sankuai.waimai.business.search.statistics.c.a(this.c));
        hashMap.put("no_delivery_scene", com.sankuai.waimai.business.search.statistics.c.b(this.c));
        SearchShareData searchShareData = this.c;
        Object[] objArr2 = {searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.statistics.c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "30541fc887cb0362a804869af1c0f5b4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "30541fc887cb0362a804869af1c0f5b4")).booleanValue() : TextUtils.equals(com.sankuai.waimai.business.search.statistics.c.a(searchShareData, 7), "1")) {
            hashMap.put("no_high_match_result", com.sankuai.waimai.business.search.statistics.c.a(this.c, 3));
            hashMap.put("no_match_result", com.sankuai.waimai.business.search.statistics.c.a(this.c, 4));
            hashMap.put("no_high_match_delivery_result", com.sankuai.waimai.business.search.statistics.c.a(this.c, 5));
            hashMap.put("no_match_delivery_result", com.sankuai.waimai.business.search.statistics.c.a(this.c, 6));
            hashMap.put("mixed_mode", "1");
        } else {
            hashMap.put("mixed_mode", "0");
        }
        if (this.c.aj != null && this.c.aj.d != null && this.c.aj.d.size() > 0) {
            hashMap.putAll(this.c.aj.d);
        }
        try {
            hashMap.putAll(com.sankuai.waimai.mach.utils.b.a(this.c.o.logData));
        } catch (Exception unused) {
        }
        hashMap.put("search_type", Integer.valueOf(this.c.V ? 2 : 1));
        hashMap.put("first_keyword", (!this.c.V || TextUtils.isEmpty(this.c.f)) ? "" : this.c.f);
        return hashMap;
    }

    private void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d457b896078181004d61b19f7e2f431", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d457b896078181004d61b19f7e2f431");
            return;
        }
        h.a(getActivity(), 2, "c_nfqbfvw", "b_oLsKJ", AppUtil.generatePageInfoKey(getActivity()), D());
    }

    public final String i() {
        return (this.n == null || this.n.a == null || !(this.n.a instanceof GlobalPageResponse) || this.n.a.globalSearchExtraInfo == null) ? "" : this.n.a.globalSearchExtraInfo.searchLogId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316ea838e1052afaf4dbfc1a3a45ede6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316ea838e1052afaf4dbfc1a3a45ede6");
            return;
        }
        this.as.a();
        this.L.scrollToPosition(0);
        K();
    }

    private void G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2388d44e4e197240ac74e0a0317474a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2388d44e4e197240ac74e0a0317474a5");
            return;
        }
        this.J.setVisibility(0);
        this.ac.setVisibility(8);
        this.af.setVisibility(4);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void handleTotalPageCloseEvent(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c3450a465922a5feeff61529e47bba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c3450a465922a5feeff61529e47bba3");
        } else if (bVar == null) {
        } else {
            t();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSearchByKeyword(a.C0861a c0861a) {
        Object[] objArr = {c0861a};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c552c2e9c827f22f3e6305cbc341dfbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c552c2e9c827f22f3e6305cbc341dfbe");
        } else if (c0861a == null) {
        } else {
            a(c0861a.a, c0861a.b, c0861a.c);
        }
    }

    @Override // com.sankuai.waimai.business.search.common.data.b.a
    public final void a(@NonNull List<Serializable> list, @NonNull List<Serializable> list2, @NonNull List<CommonMachData> list3, @Nullable List<Serializable> list4, @Nullable GuideQueryData guideQueryData) {
        int i;
        byte b2;
        NoResultRemindInfoData noResultRemindInfoData;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        Object[] objArr = {list, list2, list3, list4, guideQueryData};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29b270d8cf94179a22309dbc4fec8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29b270d8cf94179a22309dbc4fec8d5");
            return;
        }
        if (guideQueryData == null || com.sankuai.waimai.foundation.utils.d.a(guideQueryData.guidedQueryWordsNew)) {
            i = 1;
            b2 = 1;
        } else {
            i = 1;
            b2 = 0;
        }
        Object[] objArr2 = new Object[i];
        objArr2[0] = Byte.valueOf(b2);
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a13058f4daeafe6de17ecd0b21c61231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a13058f4daeafe6de17ecd0b21c61231");
        } else {
            int i2 = b2 ^ 1;
            int i3 = this.c.b() ? this.c.P : this.c.y == 2 ? 1 : 0;
            if (this.I != null && !TextUtils.isEmpty(this.I.k)) {
                HashMap hashMap = new HashMap();
                hashMap.put("keyword", this.I.k);
                hashMap.put("search_log_id", this.c.l);
                hashMap.put("template_type", Integer.valueOf(i3));
                hashMap.put("stid", this.c.d);
                hashMap.put("is_more_search", Integer.valueOf(i2 != 0 ? 1 : 0));
                hashMap.put("input_word", this.c.g + StringUtil.SPACE + this.I.k);
                h.a(getActivity(), 2, "c_nfqbfvw", "b_fya22c17", AppUtil.generatePageInfoKey(getActivity()), hashMap);
            }
            if (this.I != null && this.I.m) {
                HashMap hashMap2 = new HashMap();
                com.sankuai.waimai.business.search.ui.actionbar.b bVar = this.I;
                hashMap2.put("keyword", bVar.n == null ? "" : bVar.n);
                hashMap2.put("search_log_id", this.c.l);
                hashMap2.put("template_type", Integer.valueOf(i3));
                hashMap2.put("stid", this.c.d);
                hashMap2.put("is_more_search", Integer.valueOf(i2 != 0 ? 1 : 0));
                com.sankuai.waimai.business.search.ui.actionbar.b bVar2 = this.I;
                hashMap2.put("input_word", bVar2.o == null ? "" : bVar2.o);
                h.a(getActivity(), 1, "c_nfqbfvw", "b_n5z88oqd", AppUtil.generatePageInfoKey(getActivity()), hashMap2);
            }
        }
        this.J.setVisibility(0);
        Object[] objArr3 = {list3};
        ChangeQuickRedirect changeQuickRedirect3 = d;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0dfc22d74d9fa649e8a8d52a8c8d43b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0dfc22d74d9fa649e8a8d52a8c8d43b2");
        } else if (list3.size() > 0) {
            if (this.an != null) {
                this.an.b.f();
                this.an = null;
            }
            this.aN.removeAllViews();
            this.aN.setVisibility(8);
            CommonMachData commonMachData = list3.get(0);
            if (commonMachData.mItem != null && commonMachData.mItem.b() != null) {
                this.an = new com.sankuai.waimai.business.search.ui.result.mach.prerender.c(getContext());
                this.an.a((ViewGroup) this.aN, true);
                this.an.a(-1, commonMachData.mItem);
            }
        }
        if (isVisible() && this.aw && !this.c.A) {
            Object[] objArr4 = {list4};
            ChangeQuickRedirect changeQuickRedirect4 = d;
            noResultRemindInfoData = null;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fd2f4e307b38b81c5d77eb32194305b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fd2f4e307b38b81c5d77eb32194305b4");
            } else if (list4.size() > 0) {
                if (this.ao != null) {
                    this.ao.b.f();
                    this.ao = null;
                }
                if (this.K != null) {
                    this.K.removeAllViews();
                    this.K.setVisibility(8);
                }
                Serializable serializable = list4.get(0);
                if (serializable instanceof CommonMachData) {
                    CommonMachData commonMachData2 = (CommonMachData) serializable;
                    if (commonMachData2.mItem != null && commonMachData2.mItem.b() != null && this.K != null) {
                        this.K.setVisibility(0);
                        this.ao = new com.sankuai.waimai.business.search.ui.result.mach.prerender.c(getContext());
                        this.ao.a(this.K, true);
                        this.ao.a(-1, commonMachData2.mItem);
                        this.ao.a();
                    }
                }
            }
        } else {
            noResultRemindInfoData = null;
        }
        if (this.aw && list.size() == 0) {
            C();
            f(list2);
            a(noResultRemindInfoData);
            DovePageMonitor.a(getActivity(), (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
            return;
        }
        if (this.aw) {
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = d;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7796fb358891d7159fef1863e150ceb6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7796fb358891d7159fef1863e150ceb6");
            } else {
                PrescriptionRemindInfo prescriptionRemindInfo = this.c.ao;
                if (this.c.ap && prescriptionRemindInfo != null && prescriptionRemindInfo.isPrescription == 1) {
                    if (prescriptionRemindInfo.loadingWaitTime > 0) {
                        this.af.setText(!TextUtils.isEmpty(prescriptionRemindInfo.remindText) ? prescriptionRemindInfo.remindText.replace("\\n", "\n") : "您搜索的结果可能包含处方药\n请您在药师指导下购买");
                        this.af.setVisibility(0);
                        this.aU = true;
                        this.ac.postDelayed(this.aY, prescriptionRemindInfo.loadingWaitTime);
                    } else {
                        C();
                    }
                } else {
                    C();
                }
            }
        } else {
            C();
        }
        if (!this.aw && list.size() == 0) {
            w();
            DovePageMonitor.a(getActivity(), (int) UserCenter.TYPE_LOGOUT_NEGATIVE);
            return;
        }
        NoResultRemindInfoData e2 = e(list);
        if (e2 != null) {
            f(list2);
            a(e2);
            if (this.aw) {
                x();
                return;
            }
            return;
        }
        this.l.setVisibility(0);
        Object[] objArr6 = {list, list2};
        ChangeQuickRedirect changeQuickRedirect6 = d;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9386cd3656981eb65cf630afd584de6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9386cd3656981eb65cf630afd584de6b");
            return;
        }
        this.L.setVisibility(0);
        this.ag.h();
        if (this.aw) {
            x();
            SearchShareData searchShareData = this.c;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = SearchShareData.a;
            if (PatchProxy.isSupport(objArr7, searchShareData, changeQuickRedirect7, false, "a81eb609a9ed345c29711b1ec3339aa7", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr7, searchShareData, changeQuickRedirect7, false, "a81eb609a9ed345c29711b1ec3339aa7")).booleanValue();
            } else {
                if (!(searchShareData.O == 200 && searchShareData.P == 7)) {
                    if (!(searchShareData.O == 100 && searchShareData.Q == 2)) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
                staggeredGridLayoutManager.setGapStrategy(0);
            } else {
                staggeredGridLayoutManager = new StaggeredGridLayoutManager(1, 1);
            }
            this.L.setLayoutManager(staggeredGridLayoutManager);
            F();
            this.D.clear();
            this.D.addAll(list);
            this.C.c();
            f(list2);
            try {
                this.C.notifyDataSetChanged();
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = d;
                if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "5a0a1183119e924733c9490dfa4f1a2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "5a0a1183119e924733c9490dfa4f1a2b");
                } else {
                    this.L.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.13
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "cfb84368a442458db95a24c4b27274f9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "cfb84368a442458db95a24c4b27274f9");
                            } else if (ResultFragment.this.L.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                                StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) ResultFragment.this.L.getLayoutManager();
                                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager2.findFirstVisibleItemPositions(null);
                                int[] findLastVisibleItemPositions = staggeredGridLayoutManager2.findLastVisibleItemPositions(null);
                                int b3 = com.sankuai.waimai.business.search.common.util.c.b(findFirstVisibleItemPositions);
                                int a2 = com.sankuai.waimai.business.search.common.util.c.a(findLastVisibleItemPositions);
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("search_mode", com.sankuai.waimai.business.search.common.data.b.a(ResultFragment.this.c.O));
                                Babel.log(new Log.Builder("").value(a2 - b3).tag("searchListFirstScreenItems").optional(hashMap3).generalChannelStatus(true).build());
                            }
                        }
                    }, 300L);
                }
            } catch (Exception unused) {
                i.d(new m().a("notify_error").b("notifyDataSetChanged-preRenderMachItem").c("notifyDataSetChanged exception").b());
            }
            this.ab = 0;
            J();
        } else {
            int size = this.D.size();
            this.D.addAll(list);
            this.C.c();
            try {
                this.C.notifyItemRangeInserted(size, list.size());
            } catch (Exception unused2) {
                i.d(new m().a("insert_error").b("notifyItemRangeInserted-preRenderMachItem").c("notifyItemRangeInserted exception").b());
            }
        }
        if (this.x) {
            y();
        } else {
            w();
        }
        if (this.ab == 0) {
            if (this.Y && !TextUtils.isEmpty(this.Z)) {
                Object[] objArr9 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect9 = d;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "dfcc639409c7480a7dc7cc8194404726", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "dfcc639409c7480a7dc7cc8194404726");
                } else if (!TextUtils.isEmpty(this.aa) && !j().equals(NoxSp.a())) {
                    this.R.setText(this.aa);
                    this.R.setVisibility(0);
                    this.R.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.15
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "58769d5418e01a3af4b3c1f133d28fb1", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "58769d5418e01a3af4b3c1f133d28fb1");
                            } else if (ResultFragment.this.getActivity() == null || ResultFragment.this.getActivity().isFinishing() || ResultFragment.this.R == null) {
                            } else {
                                NoxSp.a(ResultFragment.this.j());
                                ResultFragment.this.R.setVisibility(8);
                            }
                        }
                    }, ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE);
                }
            }
            com.sankuai.waimai.business.search.ui.result.im.b bVar3 = this.O;
            DrugImEntranceEntity drugImEntranceEntity = this.P;
            SearchShareData searchShareData2 = this.c;
            Object[] objArr10 = {drugImEntranceEntity, searchShareData2};
            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.business.search.ui.result.im.b.a;
            if (PatchProxy.isSupport(objArr10, bVar3, changeQuickRedirect10, false, "dcd8e5c668c59e031e9cdf846af6bc09", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, bVar3, changeQuickRedirect10, false, "dcd8e5c668c59e031e9cdf846af6bc09");
            } else if (drugImEntranceEntity == null) {
                bVar3.c.j();
            } else {
                bVar3.c.a(drugImEntranceEntity, searchShareData2);
            }
            if (this.g != null && this.g.getVisibility() == 0) {
                this.O.a(this.P);
            }
        }
        a("data_ready", true);
        com.sankuai.waimai.business.search.monitor.horn.a a2 = com.sankuai.waimai.business.search.monitor.horn.a.a();
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.business.search.monitor.horn.a.a;
        if (PatchProxy.isSupport(objArr11, a2, changeQuickRedirect11, false, "ed53631da9a93275164df4fbf3b2919b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, a2, changeQuickRedirect11, false, "ed53631da9a93275164df4fbf3b2919b");
        } else if (a2.e && a2.d) {
            a2.d = false;
            a2.b("search_data_handle_success_qv");
        }
    }

    private void f(List<Serializable> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d5bde62ca3b66d29af5fea18edf80c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d5bde62ca3b66d29af5fea18edf80c");
            return;
        }
        this.k.removeAllViews();
        if (list.size() > 0) {
            Serializable serializable = list.get(0);
            if (serializable instanceof CommonMachData) {
                CommonMachData commonMachData = (CommonMachData) serializable;
                if (commonMachData.mItem != null && commonMachData.mItem.b() != null) {
                    this.k.setVisibility(0);
                    this.h = true;
                    a(commonMachData.mItem);
                    if (this.v) {
                        b(commonMachData.mItem);
                    } else {
                        this.j.a(commonMachData.mItem.b().t());
                    }
                    I();
                    a(this.k);
                } else {
                    v();
                    I();
                    a((View) null);
                }
            }
            if (serializable instanceof PouchDynamicAd) {
                PouchDynamicAd pouchDynamicAd = (PouchDynamicAd) serializable;
                if (pouchDynamicAd.getPouchAds() != null && pouchDynamicAd.getPouchAds().b() != null && pouchDynamicAd.getPouchAds().b().getRootNode() != null) {
                    this.k.setVisibility(0);
                    this.h = true;
                    b(pouchDynamicAd);
                    if (this.v) {
                        a(pouchDynamicAd);
                    } else {
                        this.j.a(pouchDynamicAd.getPouchAds().b().getRootNode().t());
                    }
                    I();
                    a(this.k);
                    return;
                }
                v();
                I();
                a((View) null);
            }
        } else if (this.aP != null) {
            this.k.setVisibility(0);
            this.h = true;
            H();
            if (this.v) {
                this.j.setPanelState(DragTopLayout.b.EXPANDED);
                a(DragTopLayout.b.EXPANDED);
                this.I.a(this.h);
                this.j.requestLayout();
                this.aO.d();
            }
            I();
            a(this.k);
        } else {
            v();
            I();
            a((View) null);
        }
    }

    private void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00906b25d0d77508e69a397c794aac9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00906b25d0d77508e69a397c794aac9f");
        } else if (this.n == null || this.n.a == null || this.I == null) {
        } else {
            CommonPageStyleConfig commonPageStyleConfig = this.n.a.commonPageStyleConfig;
            if (commonPageStyleConfig != null) {
                this.I.a(commonPageStyleConfig, view);
            } else {
                this.I.w();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d127eeb038dd440289cd054638558414", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d127eeb038dd440289cd054638558414");
        } else if (pouchDynamicAd == null || this.al == null) {
        } else {
            this.j.setPanelState(DragTopLayout.b.EXPANDED);
            a(DragTopLayout.b.EXPANDED);
            this.I.a(this.h);
            int e2 = this.al.e();
            if (e2 > 0) {
                this.j.a(e2, true);
            }
            this.j.requestLayout();
            this.al.d();
        }
    }

    private void a(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6c115f0c8a06373d78fd8c60be26eb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6c115f0c8a06373d78fd8c60be26eb7");
            return;
        }
        this.i = true;
        if (this.am == null) {
            this.am = new com.sankuai.waimai.business.search.ui.result.mach.prerender.c(getContext());
        }
        this.am.a(this.k, true);
        this.am.a(-1, cVar);
    }

    private void H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ef3bcd38a43e6ab0ff7387384de04d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ef3bcd38a43e6ab0ff7387384de04d");
            return;
        }
        this.i = true;
        if (this.aO == null) {
            this.aO = new com.sankuai.waimai.business.search.ui.result.coupon.a(this.b);
        }
        this.k.addView(this.aO.a(this.k));
        Serializable a2 = com.sankuai.waimai.business.search.common.data.a.a(this.aP);
        if (a2 instanceof GlobalSearchCouponCard) {
            this.aO.a(((GlobalSearchCouponCard) a2).a());
        }
    }

    private void b(PouchDynamicAd pouchDynamicAd) {
        Object[] objArr = {pouchDynamicAd};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6624633eff868eec7c313121ad1c42c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6624633eff868eec7c313121ad1c42c8");
            return;
        }
        this.i = true;
        if (this.al == null) {
            this.al = new com.sankuai.waimai.business.search.ui.result.pouch.a(this.b);
        }
        this.al.a(this.k);
        this.al.a(pouchDynamicAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.sankuai.waimai.mach.recycler.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "abb9b1e79e920daf16ad01f5bf9ee682", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "abb9b1e79e920daf16ad01f5bf9ee682");
            return;
        }
        this.j.setPanelState(DragTopLayout.b.EXPANDED);
        a(DragTopLayout.b.EXPANDED);
        this.I.a(this.h);
        this.j.a(cVar.b().t(), true);
        this.j.requestLayout();
        this.am.a();
    }

    private void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8853b6008339d39deed859dc7e54719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8853b6008339d39deed859dc7e54719");
        } else {
            this.aF.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.14
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7c829ef6937629358df375eaf69103db", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7c829ef6937629358df375eaf69103db");
                    } else {
                        ResultFragment.this.F();
                    }
                }
            });
        }
    }

    private void J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bd5d59bf4194118e06386eedb2e44e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bd5d59bf4194118e06386eedb2e44e");
        } else if (getContext() != null) {
            if (this.b.b()) {
                this.N.setVisibility(8);
                this.Q.setVisibility(8);
                this.V = false;
                this.g.setVisibility(8);
                this.S.setVisibility(8);
                this.U = false;
                return;
            }
            int a2 = g.a(getContext(), 10.0f);
            int a3 = g.a(getContext(), 54.0f);
            if (this.ab == 0) {
                this.N.setVisibility(0);
                this.g.setVisibility(this.aX ? 0 : 8);
                b(2);
                this.Q.setVisibility(0);
                if (TextUtils.isEmpty(this.Z)) {
                    this.S.setVisibility(8);
                    this.X = a2 + a3;
                    this.U = false;
                } else {
                    this.S.setVisibility(0);
                    if (this.Y) {
                        this.X = a2 + a3;
                        this.U = true;
                        b(3);
                    } else {
                        this.X = (a2 + a3) * 2;
                        this.U = false;
                    }
                }
                this.V = false;
                this.M.setTranslationY(this.X);
                return;
            }
            this.N.setVisibility(8);
            this.Q.setVisibility(8);
            this.g.setVisibility(8);
            this.V = false;
            if (this.ab == 3 || TextUtils.isEmpty(this.Z) || !this.Y) {
                this.S.setVisibility(8);
                this.U = false;
                return;
            }
            this.S.setVisibility(0);
            b(3);
            this.M.setTranslationY(0.0f);
            this.U = true;
        }
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2efbade4923c139f271a4127504835d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2efbade4923c139f271a4127504835d9");
        }
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24eeaf939424c00cd9cfe229fdd6d905", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24eeaf939424c00cd9cfe229fdd6d905");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("template_type", Integer.valueOf(this.c.y));
        hashMap.put("search_log_id", this.c.l);
        hashMap.put("stid", this.c.d);
        hashMap.put("icon_type", Integer.valueOf(i));
        h.a(getActivity(), 2, "c_nfqbfvw", "b_waimai_xh6hk3h5_mv", AppUtil.generatePageInfoKey(getActivity()), hashMap);
    }

    @Override // com.sankuai.waimai.business.search.global.filterbar.f
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8a1658c32b8be003c2d14cec25de69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8a1658c32b8be003c2d14cec25de69");
        } else {
            g().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32984b3c9a1aa8b3b8e327ef5a960be0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32984b3c9a1aa8b3b8e327ef5a960be0");
        } else if (this.aF.getVisibility() == 0) {
            int height = this.aF.getHeight();
            this.aF.setY(0.0f);
            this.aE.setY(height);
        } else {
            this.aE.setY(0.0f);
        }
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4651d8b569a4b9bc27992e57d2ab2ce", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4651d8b569a4b9bc27992e57d2ab2ce")).booleanValue() : this.aF.getVisibility() == 0 && this.aF.getY() + ((float) this.aF.getHeight()) > 0.0f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {ResultFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed97d8c91cad4b6c0deacede1c6ffd2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed97d8c91cad4b6c0deacede1c6ffd2");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4464ff64d7c572fadbaf1e5bb905a0e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4464ff64d7c572fadbaf1e5bb905a0e0");
            } else {
                ResultFragment.this.aN.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cff1bc9984bf92044d50e743f551b774", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cff1bc9984bf92044d50e743f551b774");
                        } else if (ResultFragment.this.an != null) {
                            ResultFragment.this.an.c = c.a.SHOW;
                            if (ResultFragment.this.e.d()) {
                                return;
                            }
                            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
                            translateAnimation.setDuration(280L);
                            translateAnimation.setFillAfter(true);
                            ResultFragment.this.aN.setVisibility(0);
                            ResultFragment.this.aN.startAnimation(translateAnimation);
                            ResultFragment.this.an.a();
                        }
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class FloatCardRemoveCastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public FloatCardRemoveCastReceiver() {
            Object[] objArr = {ResultFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe032d3bde32573058f42899587a2c65", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe032d3bde32573058f42899587a2c65");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490a53026064a353e5302414795f1521", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490a53026064a353e5302414795f1521");
            } else {
                ResultFragment.this.aN.post(new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.FloatCardRemoveCastReceiver.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb22903c4d2886d50892b0d87ec8e078", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb22903c4d2886d50892b0d87ec8e078");
                            return;
                        }
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(200L);
                        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.sankuai.waimai.business.search.ui.result.ResultFragment.FloatCardRemoveCastReceiver.1.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                Object[] objArr3 = {animation};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ba98de0e0473ef919605dc7ffb330058", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ba98de0e0473ef919605dc7ffb330058");
                                    return;
                                }
                                if (ResultFragment.this.an != null) {
                                    ResultFragment.this.an.b.f();
                                    ResultFragment.this.an.c = c.a.HIDE;
                                    ResultFragment.a(ResultFragment.this, (com.sankuai.waimai.business.search.ui.result.mach.prerender.c) null);
                                }
                                ResultFragment.this.aN.clearAnimation();
                                ResultFragment.this.aN.removeAllViews();
                                ResultFragment.this.aN.setVisibility(8);
                            }
                        });
                        ResultFragment.this.aN.startAnimation(alphaAnimation);
                    }
                });
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class e extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public e() {
            Object[] objArr = {ResultFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10836843c1b8b025d4cb8872760309e4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10836843c1b8b025d4cb8872760309e4");
            }
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            CommonMachData commonMachData;
            int i;
            int i2 = 0;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "509e0f5e7b73c343daeffa6b282b9793", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "509e0f5e7b73c343daeffa6b282b9793");
                return;
            }
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.platform.utils.f.a(intent, "data"));
            String valueOf = String.valueOf(a2.get(Constants.Environment.KEY_UNION_ID));
            String valueOf2 = String.valueOf(a2.get("survey_id"));
            com.sankuai.waimai.business.search.common.data.d dVar = ResultFragment.this.D;
            Object[] objArr2 = {valueOf};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.common.data.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "9c4e72296d206882eb72860fb1378022", RobustBitConfig.DEFAULT_VALUE)) {
                commonMachData = (CommonMachData) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "9c4e72296d206882eb72860fb1378022");
            } else {
                if (!TextUtils.isEmpty(valueOf) && dVar.b != null) {
                    for (Serializable serializable : dVar.b) {
                        if (serializable instanceof CommonMachData) {
                            CommonMachData commonMachData2 = (CommonMachData) serializable;
                            if (commonMachData2.mItem != null) {
                                String str = commonMachData2.unionId;
                                if (!TextUtils.isEmpty(valueOf) && !TextUtils.isEmpty(str) && valueOf.equals(str)) {
                                    commonMachData = commonMachData2;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                commonMachData = null;
            }
            if (commonMachData != null) {
                commonMachData.state = CommonMachData.a.HIDE;
                com.sankuai.waimai.business.search.common.data.d dVar2 = ResultFragment.this.D;
                Object[] objArr3 = {commonMachData};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.common.data.d.a;
                if (!PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "3c162dd15599ba48ba4ad012ae99fcd1", RobustBitConfig.DEFAULT_VALUE)) {
                    while (true) {
                        if (i2 >= dVar2.size()) {
                            i = -1;
                            break;
                        } else if (dVar2.get(i2) == commonMachData) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else {
                    i = ((Integer) PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "3c162dd15599ba48ba4ad012ae99fcd1")).intValue();
                }
                if (i != -1) {
                    ResultFragment.this.C.notifyItemChanged(i);
                }
            }
            if (TextUtils.isEmpty(valueOf2)) {
                return;
            }
            NoxSp.a(System.currentTimeMillis());
            NoxSp.b(valueOf2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03c434f1408e02d323229bb92f355027", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03c434f1408e02d323229bb92f355027");
                return;
            }
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "data");
            if (TextUtils.isEmpty(a2)) {
                return;
            }
            Map<String, Object> a3 = com.sankuai.waimai.mach.utils.b.a(a2);
            String valueOf = String.valueOf(a3.get("event"));
            char c = 65535;
            if (valueOf.hashCode() == 283405865 && valueOf.equals("store_recommend_search")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            String valueOf2 = String.valueOf(a3.get("keyword"));
            com.sankuai.waimai.business.search.ui.actionbar.b bVar = ResultFragment.this.I;
            Object[] objArr2 = {valueOf2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.ui.actionbar.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6f3fd2f27ca167d0815cbab0bbde317a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6f3fd2f27ca167d0815cbab0bbde317a");
            } else {
                bVar.p.a(true);
                bVar.f.setText(valueOf2);
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.search.ui.actionbar.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "9711a567da0f67215e52d07393a3f1c2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "9711a567da0f67215e52d07393a3f1c2");
                } else {
                    bVar.o();
                    if (bVar.i != null) {
                        bVar.i.a("");
                    }
                    if (bVar.j != null) {
                        bVar.j.a("");
                    }
                    bVar.k = "";
                    bVar.l = "";
                }
            }
            ResultFragment.this.a(valueOf2, 0, ResultFragment.this.c.j, ResultFragment.this.z);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class d implements com.sankuai.waimai.business.search.ui.result.mach.i {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.sankuai.waimai.business.search.ui.result.mach.i
        public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
            Pair pair;
            int i = 0;
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9abf219ca8fda458986dae850a63ebe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9abf219ca8fda458986dae850a63ebe");
            } else if (cVar == null) {
            } else {
                com.sankuai.waimai.business.search.common.data.d dVar = ResultFragment.this.D;
                Object[] objArr2 = {cVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.search.common.data.d.a;
                if (!PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "a433a2604071735733ee55f7f9c0a670", RobustBitConfig.DEFAULT_VALUE)) {
                    while (true) {
                        if (i >= dVar.size()) {
                            pair = null;
                            break;
                        } else if ((dVar.get(i) instanceof CommonMachData) && ((CommonMachData) dVar.get(i)).mItem == cVar) {
                            pair = new Pair(Integer.valueOf(i), (CommonMachData) dVar.get(i));
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    pair = (Pair) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "a433a2604071735733ee55f7f9c0a670");
                }
                if (pair != null) {
                    ResultFragment.this.C.notifyItemChanged(((Integer) pair.first).intValue(), pair.second);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.location.v2.listener.c
    public void onPoiChange(@Nullable WmAddress wmAddress, boolean z) {
        String obj;
        Object[] objArr = {wmAddress, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261913bf2c24335245f86c0d0acfb422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261913bf2c24335245f86c0d0acfb422");
        } else if (this.F == null || com.sankuai.waimai.foundation.utils.f.a(this.F)) {
        } else {
            if (TextUtils.isEmpty(this.I.k)) {
                obj = this.b.j.getText().toString();
            } else {
                obj = this.I.k;
            }
            a(obj, 13, this.c.j, 0);
        }
    }

    public static /* synthetic */ void z(ResultFragment resultFragment) {
        resultFragment.V = false;
        resultFragment.W = false;
        resultFragment.U = resultFragment.Y;
    }
}
