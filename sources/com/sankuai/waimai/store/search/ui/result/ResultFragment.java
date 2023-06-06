package com.sankuai.waimai.store.search.ui.result;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.search.common.view.EasterEggLayout;
import com.sankuai.waimai.store.search.common.view.c;
import com.sankuai.waimai.store.search.data.f;
import com.sankuai.waimai.store.search.model.CardInfo;
import com.sankuai.waimai.store.search.model.CardTitle;
import com.sankuai.waimai.store.search.model.CommonMachData;
import com.sankuai.waimai.store.search.model.ExpAbInfo;
import com.sankuai.waimai.store.search.model.ForbiddenInfo;
import com.sankuai.waimai.store.search.model.GlobalPageResponse;
import com.sankuai.waimai.store.search.model.GlobalSearchExtraInfo;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.OasisModule;
import com.sankuai.waimai.store.search.model.PrescriptionRemindInfo;
import com.sankuai.waimai.store.search.ui.BaseSearchFragment;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import com.sankuai.waimai.store.search.ui.result.c;
import com.sankuai.waimai.store.search.ui.result.item.sortFilter.SGBaseSortFilterFragment;
import com.sankuai.waimai.store.search.ui.result.locate.a;
import com.sankuai.waimai.store.search.ui.result.mach.MachFeedStatisticsBroadcastReceiver;
import com.sankuai.waimai.store.search.ui.result.mach.SearchMachQaSp;
import com.sankuai.waimai.store.search.ui.result.mach.b;
import com.sankuai.waimai.store.search.ui.result.mach.h;
import com.sankuai.waimai.store.search.ui.result.monitor.SearchMachMonitor;
import com.sankuai.waimai.store.search.ui.result.monitor.drugSearchMonitor.MEDSearchResultMonitor;
import com.sankuai.waimai.store.search.ui.result.nestedheader.DropDownBehavior;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.util.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.GlobalSearch;
import com.sankuai.waimai.store.util.monitor.monitor.SGSearchGlobal;
import com.sankuai.waimai.store.util.p;
import com.sankuai.waimai.store.view.FloatCardOutInAnimation;
import com.sankuai.waimai.store.view.StickyContainerFrameLayout;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class ResultFragment extends BaseSearchFragment implements com.sankuai.waimai.store.i.locate.b, com.sankuai.waimai.store.poi.subscribe.e, com.sankuai.waimai.store.search.ui.result.a, c.b {
    public static ChangeQuickRedirect e;
    private ImageView A;
    private int B;
    private boolean C;
    private boolean D;
    private View I;
    private View J;
    private ViewGroup K;
    private com.sankuai.waimai.store.search.common.view.c L;
    private View M;
    private TextView N;
    private TextView O;
    private TextView P;
    private ImageView Q;
    private com.sankuai.waimai.store.search.common.view.f R;
    private View S;
    private TextView T;
    private TextView U;
    private View V;
    private View W;
    private View X;
    private View Y;
    private TextView Z;
    private BroadcastReceiver aA;
    private long aB;
    private Handler aC;
    private int aD;
    private Runnable aE;
    private Animation aF;
    private int aG;
    private int aH;
    private boolean aI;
    private com.sankuai.waimai.store.search.model.g aJ;
    private CardInfo aK;
    private CardInfo aL;
    private EasterEggLayout aa;
    private String ab;
    private int ac;
    private StickyContainerFrameLayout ad;
    private String ae;
    private com.sankuai.waimai.store.search.common.view.b af;
    private boolean ag;
    private long ah;
    private int ai;
    private GlobalPageResponse aj;
    private BroadcastReceiver ak;
    private com.sankuai.waimai.store.manager.marketing.a al;
    private com.sankuai.waimai.store.manager.marketing.e am;
    private Runnable an;
    private com.sankuai.waimai.store.search.ui.result.locate.a ao;
    private boolean ap;
    private boolean aq;
    private boolean ar;
    private View as;
    private View at;
    private View au;
    private View av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    private c.a f;
    private g g;
    private String h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private com.sankuai.waimai.store.search.common.view.a o;
    private int p;
    private com.sankuai.waimai.store.search.adapterdelegates.a q;
    private com.sankuai.waimai.store.search.ui.result.b r;
    private List<OasisModule> s;
    private List<OasisModule> t;
    private com.sankuai.waimai.store.search.ui.result.nestedheader.a u;
    private com.sankuai.waimai.store.search.ui.actionbar.b v;
    private ViewGroup w;
    private StatisticsRecyclerView x;
    private RecyclerView.LayoutManager y;
    private LinearLayout z;

    public ResultFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38aac65974db635efac108ef277b8e06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38aac65974db635efac108ef277b8e06");
            return;
        }
        this.i = 0;
        this.j = true;
        this.l = true;
        this.m = 0;
        this.p = 0;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.C = false;
        this.D = false;
        this.ac = 0;
        this.ah = 0L;
        this.ai = 0;
        this.ap = false;
        this.ay = -2;
        this.az = -2;
        this.aG = -1;
        this.aH = -1;
        this.aI = false;
    }

    public static /* synthetic */ void I(ResultFragment resultFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "d7a72c160b162297985a1db5e4ff80b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "d7a72c160b162297985a1db5e4ff80b4");
        } else if (resultFragment.d.m() && resultFragment.aF != null && resultFragment.z.getAnimation() == resultFragment.aF) {
            resultFragment.z.removeCallbacks(resultFragment.aE);
            if (resultFragment.aE == null) {
                resultFragment.aE = new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.13
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Animation animation;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bbad77599e2b7f8ddf62ed840976f3e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bbad77599e2b7f8ddf62ed840976f3e");
                        } else if (ResultFragment.this.getActivity() == null || ResultFragment.this.getActivity().isFinishing()) {
                        } else {
                            LinearLayout linearLayout = ResultFragment.this.z;
                            float a2 = com.sankuai.waimai.foundation.utils.g.a(ResultFragment.this.getActivity(), 10.0f) + (ResultFragment.this.A.getWidth() / 2.0f);
                            Object[] objArr3 = {500, Float.valueOf(0.5f), Float.valueOf(a2)};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.util.a.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "772a556d5ac4b627170c4adf8ed93169", RobustBitConfig.DEFAULT_VALUE)) {
                                animation = (Animation) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "772a556d5ac4b627170c4adf8ed93169");
                            } else {
                                AnimationSet animationSet = new AnimationSet(true);
                                animationSet.setDuration(500L);
                                animationSet.addAnimation(new AlphaAnimation(0.5f, 1.0f));
                                animationSet.addAnimation(new TranslateAnimation(a2, 0.0f, 0.0f, 0.0f));
                                animationSet.setFillAfter(true);
                                animation = animationSet;
                            }
                            linearLayout.startAnimation(animation);
                        }
                    }
                };
            }
            resultFragment.z.postDelayed(resultFragment.aE, 150L);
        }
    }

    public static /* synthetic */ void N(ResultFragment resultFragment) {
        int intValue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "e30e1577d04a99d4283bffcf3b71091e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "e30e1577d04a99d4283bffcf3b71091e");
            return;
        }
        int b2 = p.b(resultFragment.x.getLayoutManager());
        com.sankuai.waimai.store.search.common.view.a aVar = resultFragment.o;
        GlobalPageResponse globalPageResponse = resultFragment.aj;
        Object[] objArr2 = {globalPageResponse, Integer.valueOf(b2)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.view.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "9e319e27c7140b55198647f3b2b9d572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "9e319e27c7140b55198647f3b2b9d572");
        } else if (globalPageResponse == null || aVar.a(globalPageResponse.globalSearchExtraInfo)) {
            aVar.setVisible(false);
        } else {
            aVar.c = globalPageResponse.globalSearchExtraInfo;
            GlobalSearchExtraInfo.Config questionnaireConfig = aVar.c.getQuestionnaireConfig();
            GlobalSearchExtraInfo.Scene questionnaireScene = aVar.c.getQuestionnaireScene();
            int i = questionnaireConfig.slideToThreshold;
            if (i >= 0 && b2 + 1 >= i) {
                aVar.a(1, questionnaireScene.slideToId);
                aVar.a();
            }
        }
        if (resultFragment.am != null) {
            com.sankuai.waimai.store.manager.marketing.e eVar = resultFragment.am;
            Object[] objArr3 = {Integer.valueOf(b2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.marketing.e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "e6d7c717af79410bc974a407f4ac6929", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "e6d7c717af79410bc974a407f4ac6929");
            } else if (eVar.i == null || (intValue = eVar.i.exposurePos.intValue()) < 0 || b2 + 1 < intValue) {
            } else {
                eVar.a(1, intValue);
                eVar.a(eVar.c);
                eVar.a().b(true);
            }
        }
    }

    public static /* synthetic */ int a(ResultFragment resultFragment, List list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "3267afe528bbe34f419aefc3f405e989", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "3267afe528bbe34f419aefc3f405e989")).intValue();
        }
        if (TextUtils.isEmpty(str) || list == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            OasisModule oasisModule = (OasisModule) list.get(i);
            if (oasisModule != null && oasisModule.data != null && (oasisModule.data instanceof CommonMachData) && ((CommonMachData) oasisModule.data).mItem != null) {
                String str2 = ((CommonMachData) oasisModule.data).unionId;
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && str.equals(str2)) {
                    ((CommonMachData) oasisModule.data).state = CommonMachData.a.HIDE;
                    return i;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ Serializable a(ResultFragment resultFragment, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "1c23049a8a7634b0f9fecd1dcfefe1c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Serializable) PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "1c23049a8a7634b0f9fecd1dcfefe1c7");
        }
        OasisModule oasisModule = (OasisModule) com.sankuai.waimai.foundation.utils.b.a(resultFragment.s, i);
        if (oasisModule == null) {
            return null;
        }
        return oasisModule.data;
    }

    public static /* synthetic */ Runnable a(ResultFragment resultFragment, Runnable runnable) {
        resultFragment.an = null;
        return null;
    }

    public static /* synthetic */ void a(ResultFragment resultFragment, int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "9b77aa9e37f6c99df8977a7a155423b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "9b77aa9e37f6c99df8977a7a155423b4");
        } else if (resultFragment.as == null || resultFragment.av == null || resultFragment.at == null) {
        } else {
            resultFragment.av.setY(-i);
            if (i < i2) {
                View view = resultFragment.as;
                View view2 = resultFragment.av;
                View view3 = resultFragment.at;
                View view4 = resultFragment.au;
                Object[] objArr2 = {view, view2, view3, view4};
                ChangeQuickRedirect changeQuickRedirect2 = e;
                if (PatchProxy.isSupport(objArr2, resultFragment, changeQuickRedirect2, false, "b1d93331d730bbac6e89bf4961e0d74e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, resultFragment, changeQuickRedirect2, false, "b1d93331d730bbac6e89bf4961e0d74e");
                    return;
                }
                float c = (((com.sankuai.waimai.foundation.utils.g.c(resultFragment.getActivity(), Math.abs((int) view2.getY())) * 1.0f) / com.sankuai.waimai.foundation.utils.g.c(resultFragment.getActivity(), view2.getHeight())) * 1.0f) - 0.2f;
                float f = 2.0f * (Float.compare(c, 0.0f) < 0 ? 0.0f : c);
                if (Float.compare(1.0f, f) < 0) {
                    f = 1.0f;
                }
                view.setAlpha(f);
                view2.setAlpha(f);
                if (view3.getVisibility() == 0) {
                    view3.setAlpha(1.0f - f);
                }
                int i3 = (f > 0.3d ? 1 : (f == 0.3d ? 0 : -1));
                resultFragment.d(i3 < 0);
                if (view4 != null && view4.getVisibility() == 0) {
                    view4.setAlpha(1.0f - f);
                }
                if (view4 != null) {
                    resultFragment.v.e(f == 1.0f);
                }
                if (!resultFragment.ar || TextUtils.isEmpty(resultFragment.aJ.c)) {
                    return;
                }
                if (i3 < 0) {
                    resultFragment.a(true, resultFragment.aJ.c);
                    return;
                } else {
                    resultFragment.a(false, "");
                    return;
                }
            }
            resultFragment.at.setAlpha(0.0f);
            resultFragment.as.setAlpha(1.0f);
            resultFragment.av.setAlpha(1.0f);
            if (resultFragment.au != null) {
                resultFragment.au.setAlpha(0.0f);
                resultFragment.v.e(true);
            }
            resultFragment.d(false);
            resultFragment.a(false, "");
        }
    }

    public static /* synthetic */ void a(ResultFragment resultFragment, RecyclerView.LayoutManager layoutManager) {
        View findViewByPosition;
        Object[] objArr = {layoutManager};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "2a1ee398e71643670ddf196ebfbf80aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "2a1ee398e71643670ddf196ebfbf80aa");
        } else if (!resultFragment.d.bg || (findViewByPosition = layoutManager.findViewByPosition(resultFragment.l())) == null) {
        } else {
            if (resultFragment.ac > resultFragment.aD + com.sankuai.waimai.foundation.utils.g.a(resultFragment.c, 60.0f)) {
                if (findViewByPosition instanceof com.sankuai.waimai.store.view.f) {
                    RecyclerView.s viewHolder = ((com.sankuai.waimai.store.view.f) findViewByPosition).getViewHolder();
                    if (viewHolder instanceof f) {
                        ((f) viewHolder).a(true);
                    }
                }
            } else if (findViewByPosition instanceof com.sankuai.waimai.store.view.f) {
                RecyclerView.s viewHolder2 = ((com.sankuai.waimai.store.view.f) findViewByPosition).getViewHolder();
                if (viewHolder2 instanceof f) {
                    ((f) viewHolder2).a(false);
                }
            }
        }
    }

    public static /* synthetic */ void ac(ResultFragment resultFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "814f0c266f6c7a923d083c9eb4401e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "814f0c266f6c7a923d083c9eb4401e87");
        } else if (resultFragment.x == null || !(resultFragment.x.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
        } else {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) resultFragment.x.getLayoutManager();
            Object[] objArr2 = {staggeredGridLayoutManager};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, resultFragment, changeQuickRedirect2, false, "f2d2b932087627b24b699882f2f905c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, resultFragment, changeQuickRedirect2, false, "f2d2b932087627b24b699882f2f905c5");
            } else if (resultFragment.d.bg) {
                View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(0);
                b.a a2 = com.sankuai.waimai.store.util.monitor.b.a().a(DataConstants.CATEGORY_ID, String.valueOf(resultFragment.d.z));
                if (findViewByPosition == null) {
                    a2.a(new MEDSearchResultMonitor("MEDSearchResultRenderFail")).a("error_type", "3");
                } else {
                    a2.a(new MEDSearchResultMonitor("MEDSearchResultRenderSuccess"));
                }
                a2.a();
            }
            View findViewByPosition2 = staggeredGridLayoutManager.findViewByPosition(resultFragment.l());
            if (findViewByPosition2 != null) {
                resultFragment.aD = findViewByPosition2.getTop();
            }
        }
    }

    public static /* synthetic */ int c(ResultFragment resultFragment, int i) {
        resultFragment.i = 0;
        return 0;
    }

    public static /* synthetic */ void c(ResultFragment resultFragment) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "eee6a154c3957a9ea378aca3a2d526c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "eee6a154c3957a9ea378aca3a2d526c1");
            return;
        }
        b.C0608b a2 = m.a("http://p0.meituan.net/scarlett/b82182f7ea3a7c4d385b45559153c13d16491.png");
        a2.i = R.drawable.wm_sc_nox_search_nonresult_icon;
        a2.a(resultFragment.Q);
        resultFragment.M.setVisibility(0);
        u.a(resultFragment.N, (int) R.string.wm_sc_nox_search_loading_fail_without_locate);
        resultFragment.P.setVisibility(8);
        resultFragment.S.setVisibility(0);
        resultFragment.O.setVisibility(8);
    }

    public static /* synthetic */ void c(ResultFragment resultFragment, boolean z) {
        Animation animation;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "dc8120bc15b6a8b11047957248e8ada8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "dc8120bc15b6a8b11047957248e8ada8");
        } else if (resultFragment.d.m()) {
            if (z) {
                resultFragment.z.removeCallbacks(resultFragment.aE);
            }
            if (resultFragment.D && resultFragment.x.getScrollState() == 1) {
                if (resultFragment.aF == null && resultFragment.getActivity() != null) {
                    float a2 = com.sankuai.waimai.foundation.utils.g.a(resultFragment.getActivity(), 10.0f) + (resultFragment.A.getWidth() / 2.0f);
                    Object[] objArr2 = {500, Float.valueOf(0.5f), Float.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.util.a.a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "702c8d3841b27b63ac1b83d3c30c8afb", RobustBitConfig.DEFAULT_VALUE)) {
                        animation = (Animation) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "702c8d3841b27b63ac1b83d3c30c8afb");
                    } else {
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.setDuration(500L);
                        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.5f));
                        animationSet.addAnimation(new TranslateAnimation(0.0f, a2, 0.0f, 0.0f));
                        animationSet.setFillAfter(true);
                        animation = animationSet;
                    }
                    resultFragment.aF = animation;
                }
                if (resultFragment.z.getAnimation() != resultFragment.aF) {
                    resultFragment.z.startAnimation(resultFragment.aF);
                }
            }
        }
    }

    public static /* synthetic */ void d(ResultFragment resultFragment, int i) {
        OasisModule oasisModule;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, resultFragment, changeQuickRedirect, false, "fc47d3a62d39e9bbdc26f9dd4d3c7fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, resultFragment, changeQuickRedirect, false, "fc47d3a62d39e9bbdc26f9dd4d3c7fb7");
        } else if (resultFragment.y instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) resultFragment.y;
            int c = com.sankuai.waimai.foundation.utils.b.c(resultFragment.s);
            for (int i2 = 0; i2 < c; i2++) {
                View findViewByPosition = staggeredGridLayoutManager.findViewByPosition(i2);
                if (u.a(findViewByPosition) && (oasisModule = (OasisModule) com.sankuai.waimai.foundation.utils.b.a(resultFragment.s, i2)) != null && (oasisModule.data instanceof CommonMachData)) {
                    HashMap hashMap = new HashMap();
                    if (i > 0 && findViewByPosition.getTop() * 2 < resultFragment.B) {
                        hashMap.put("type", 1);
                        ((CommonMachData) oasisModule.data).mItem.l().sendJsEvent("product_image_play_gif_event", hashMap);
                    }
                    if (i < 0 && findViewByPosition.getTop() * 2 > resultFragment.B) {
                        hashMap.put("type", 0);
                        ((CommonMachData) oasisModule.data).mItem.l().sendJsEvent("product_image_play_gif_event", hashMap);
                    }
                }
            }
        }
    }

    public static /* synthetic */ boolean d(ResultFragment resultFragment, boolean z) {
        resultFragment.l = false;
        return false;
    }

    public static /* synthetic */ boolean e(ResultFragment resultFragment, boolean z) {
        resultFragment.k = true;
        return true;
    }

    public static ResultFragment g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "087006330eee0d418c75379336622564", RobustBitConfig.DEFAULT_VALUE) ? (ResultFragment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "087006330eee0d418c75379336622564") : new ResultFragment();
    }

    @Override // com.sankuai.waimai.store.search.ui.BaseSearchFragment, com.sankuai.waimai.store.base.SCBaseFragment, com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def146da59357842e718cd5ff63fb3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def146da59357842e718cd5ff63fb3c4");
            return;
        }
        this.aB = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        Activity activity = this.F;
        if (this.d != null) {
            this.d.bw.a(this);
            if (this.d.aX != null) {
                this.d.aX.recordStep("fragment_create_begin");
            }
            if ((activity instanceof BaseActivity) && this.d.F) {
                ((BaseActivity) activity).s().recordStep("fragment_create_begin");
            }
        }
        this.v = e();
        this.B = com.sankuai.waimai.foundation.utils.g.b(this.F);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba8d199efd42d2ea47551500f33ac6ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba8d199efd42d2ea47551500f33ac6ad");
        } else if (getContext() instanceof SCBaseActivity) {
            this.ao = new com.sankuai.waimai.store.search.ui.result.locate.a((SCBaseActivity) getContext());
            this.ao.b = new a.b() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.search.ui.result.locate.a.b
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0d0e5f1f870179148f271141ca114290", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0d0e5f1f870179148f271141ca114290");
                        return;
                    }
                    if (ResultFragment.this.L != null) {
                        ResultFragment.this.L.a();
                    }
                    ResultFragment.this.D();
                    ResultFragment.c(ResultFragment.this);
                }
            };
        }
        this.ak = new MachFeedStatisticsBroadcastReceiver(this.d);
        LocalBroadcastManager.getInstance(this.F).registerReceiver(this.ak, MachFeedStatisticsBroadcastReceiver.a());
        com.sankuai.waimai.store.locate.a.a(this);
        this.d.aO = new a();
        this.d.aY = q();
        this.aA = new b();
        getContext().registerReceiver(this.aA, new IntentFilter("action_search_remove_card"));
        this.f = new d(this, this.d);
        this.f.a(this.v);
        this.g = new g();
        this.aC = new Handler();
        if (this.d != null) {
            if (this.d.aX != null) {
                this.d.aX.recordStep("fragment_create_end");
            }
            if ((activity instanceof BaseActivity) && this.d.F) {
                ((BaseActivity) activity).s().recordStep("fragment_create_end");
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e375797d7365770b1eeb0a9beeb91227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e375797d7365770b1eeb0a9beeb91227");
            return;
        }
        if (this.ao != null) {
            com.sankuai.waimai.store.search.ui.result.locate.a aVar = this.ao;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.result.locate.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "4b295786b34e780ea26fcb8317f9904d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "4b295786b34e780ea26fcb8317f9904d");
            } else {
                aVar.a();
                aVar.b = null;
            }
        }
        if (this.d != null && this.d.bw != null) {
            this.d.bw.b(this);
        }
        if (this.aC != null) {
            this.aC.removeCallbacksAndMessages(null);
        }
        getContext().unregisterReceiver(this.aA);
        LocalBroadcastManager.getInstance(this.F).unregisterReceiver(this.ak);
        com.sankuai.waimai.store.locate.a.b(this);
        com.sankuai.waimai.store.poi.subscribe.a.a().b(this);
        com.sankuai.waimai.store.search.common.view.f fVar = this.R;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.view.f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "967594b3ff6b55178bd9b61aad3e0c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "967594b3ff6b55178bd9b61aad3e0c1e");
        } else if (fVar.f != null) {
            FloatCardOutInAnimation floatCardOutInAnimation = fVar.f;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = FloatCardOutInAnimation.a;
            if (PatchProxy.isSupport(objArr4, floatCardOutInAnimation, changeQuickRedirect4, false, "dfe070381718e4a7d7023a01a03465a0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, floatCardOutInAnimation, changeQuickRedirect4, false, "dfe070381718e4a7d7023a01a03465a0");
            } else {
                if (floatCardOutInAnimation.g != null) {
                    floatCardOutInAnimation.g.cancel();
                    floatCardOutInAnimation.g.removeAllListeners();
                }
                if (floatCardOutInAnimation.h != null) {
                    floatCardOutInAnimation.h.cancel();
                    floatCardOutInAnimation.h.removeAllListeners();
                }
                if (floatCardOutInAnimation.i != null) {
                    floatCardOutInAnimation.i.removeCallbacks(floatCardOutInAnimation.j);
                    floatCardOutInAnimation.i.removeCallbacksAndMessages(null);
                }
            }
        }
        al.cancel(bH_());
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02bf994c696fb9927491f564828e084", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02bf994c696fb9927491f564828e084");
            return;
        }
        super.onActivityCreated(bundle);
        if (this.v == null) {
            this.v = e();
            this.f.a(this.v);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a114b144cbf1719a747c1e35c7d09401", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a114b144cbf1719a747c1e35c7d09401");
            return;
        }
        super.onStop();
        EasterEggLayout easterEggLayout = this.aa;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = EasterEggLayout.a;
        if (PatchProxy.isSupport(objArr2, easterEggLayout, changeQuickRedirect2, false, "076e73ed05045bc1fbaa05261ef7ba94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, easterEggLayout, changeQuickRedirect2, false, "076e73ed05045bc1fbaa05261ef7ba94");
            return;
        }
        easterEggLayout.removeAllViews();
        easterEggLayout.d.removeCallbacks(easterEggLayout.e);
    }

    @Override // com.sankuai.waimai.store.base.SCBaseFragment, android.support.v4.app.Fragment
    public void onDestroyView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2505c167c5ca4b278513acd26daed9ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2505c167c5ca4b278513acd26daed9ac");
            return;
        }
        super.onDestroyView();
        h.a();
        this.d.u.clear();
        if (this.f != null) {
            this.f.c();
        }
        StickyContainerFrameLayout stickyContainerFrameLayout = this.ad;
        com.sankuai.waimai.store.search.adapterdelegates.a aVar = this.q;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = StickyContainerFrameLayout.a;
        if (PatchProxy.isSupport(objArr2, stickyContainerFrameLayout, changeQuickRedirect2, false, "399e4750c738ff6eecbbfa458c50f913", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, stickyContainerFrameLayout, changeQuickRedirect2, false, "399e4750c738ff6eecbbfa458c50f913");
        } else if (aVar != null && stickyContainerFrameLayout.c != null) {
            aVar.unregisterAdapterDataObserver(stickyContainerFrameLayout.c);
        }
        if (this.al != null) {
            this.al.j();
        }
        if (this.am != null) {
            com.sankuai.waimai.store.manager.marketing.e eVar = this.am;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.marketing.e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "1b842a1880daa964ffe32fbed04c604f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "1b842a1880daa964ffe32fbed04c604f");
                return;
            }
            com.sankuai.waimai.store.manager.sequence.b bVar = eVar.e;
            Object[] objArr4 = {bVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.manager.marketing.e.a;
            if (PatchProxy.isSupport(objArr4, eVar, changeQuickRedirect4, false, "f99c71a3a9391d8cb8411c9914ff3ca0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, eVar, changeQuickRedirect4, false, "f99c71a3a9391d8cb8411c9914ff3ca0");
            } else if (bVar != null) {
                bVar.f();
            }
            al.cancel(eVar.c);
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c59c82266a1d5223286206441f9871e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c59c82266a1d5223286206441f9871e");
            return;
        }
        super.onConfigurationChanged(configuration);
        a(this.h, 32, this.d.n, 0);
    }

    @Override // android.support.v4.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Object[] objArr = {layoutInflater, viewGroup, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5afbe7461d75bf5acf376ee746bafa4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5afbe7461d75bf5acf376ee746bafa4");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_nox_search_result, viewGroup, false);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0b9794224be8aff80ae0450e23fb161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0b9794224be8aff80ae0450e23fb161");
        } else {
            this.w = (ViewGroup) inflate.findViewById(R.id.layout_search_result);
            this.x = (StatisticsRecyclerView) inflate.findViewById(R.id.list_poiSearch_poiList);
            this.y = new StaggeredGridLayoutManager(2, 1) { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.2
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.StaggeredGridLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
                public boolean canScrollVertically() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ce3ee39bb8dcc3baae535516d886a54", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ce3ee39bb8dcc3baae535516d886a54")).booleanValue() : ResultFragment.this.d.J <= 0;
                }
            };
            if (this.y instanceof GridLayoutManager) {
                ((GridLayoutManager) this.y).g = new GridLayoutManager.c() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.14
                    public static ChangeQuickRedirect b;

                    @Override // android.support.v7.widget.GridLayoutManager.c
                    public final int a(int i) {
                        Object[] objArr3 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = b;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "55fd8f885755af872677c9ead3e14b80", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "55fd8f885755af872677c9ead3e14b80")).intValue();
                        }
                        if (ResultFragment.this.d.aH == 200 && ResultFragment.this.d.aK == 7 && i < ResultFragment.this.s.size()) {
                            return ((ResultFragment.a(ResultFragment.this, i) instanceof com.sankuai.waimai.store.search.model.f) || (ResultFragment.a(ResultFragment.this, i) instanceof CommonMachData)) ? 1 : 2;
                        }
                        return 2;
                    }
                };
            }
            this.x.setLayoutManager(this.y);
            StatisticsRecyclerView statisticsRecyclerView = this.x;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e;
            statisticsRecyclerView.addItemDecoration(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e535725052d507d49d77d6feb3f10ccb", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView.f) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e535725052d507d49d77d6feb3f10ccb") : new RecyclerView.f() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.12
                public static ChangeQuickRedirect a;
                public int b;

                {
                    this.b = ResultFragment.this.getActivity().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_4);
                }

                @Override // android.support.v7.widget.RecyclerView.f
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    Object[] objArr4 = {rect, view, recyclerView, state};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4bdda6e77778f8ca8ba3787a46957d98", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4bdda6e77778f8ca8ba3787a46957d98");
                    } else if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view.getLayoutParams();
                        if (bVar.b) {
                            rect.left = 0;
                            rect.right = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            return;
                        }
                        if (bVar.b() % 2 == 0) {
                            rect.left = this.b * 3;
                            rect.right = this.b;
                        } else {
                            rect.left = this.b;
                            rect.right = this.b * 3;
                        }
                        rect.bottom = 0;
                        rect.top = 0;
                    }
                }
            });
            this.z = (LinearLayout) inflate.findViewById(R.id.left_bottom_btn_container);
            this.A = (ImageView) inflate.findViewById(R.id.to_top_img_poiList);
            this.A.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.15
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "ae37fd4aec55f065ec7adfd9f13a3bed", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "ae37fd4aec55f065ec7adfd9f13a3bed");
                        return;
                    }
                    JudasManualManager.a("b_waimai_zvohtgci_mc").a("c_nfqbfvw").a("template_type", ResultFragment.this.d.D).a("search_log_id", ResultFragment.this.d.q).a("cat_id", ResultFragment.this.d.z).a();
                    ResultFragment.this.ad.a(ResultFragment.this.d.bg);
                    ResultFragment.this.x.scrollToPosition(0);
                    ResultFragment.this.A.setVisibility(8);
                    ResultFragment.this.C = false;
                    ResultFragment.this.D = false;
                    ResultFragment.this.ac = 0;
                    if (ResultFragment.this.d.n()) {
                        com.sankuai.waimai.store.search.ui.result.nestedheader.a aVar = ResultFragment.this.u;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.search.ui.result.nestedheader.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "1f7a6b36d9ba100a31ed41ecd4c713c8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "1f7a6b36d9ba100a31ed41ecd4c713c8");
                            return;
                        }
                        aVar.c.a(true, false, true);
                        aVar.d.a(true, false, true);
                        if (aVar.e != null) {
                            aVar.e.setAlpha(0.0f);
                            aVar.e.setVisibility(8);
                        }
                    }
                }
            });
            this.A.setVisibility(8);
            this.C = false;
            this.D = false;
            this.V = LayoutInflater.from(getContext()).inflate(R.layout.wm_sc_nox_search_result_list_footer, (ViewGroup) this.x, false);
            this.K = (ViewGroup) inflate.findViewById(R.id.white_bg_dynamic_progress_bar);
            this.L = new com.sankuai.waimai.store.search.common.view.c(getContext());
            this.L.createAndReplaceView(this.K);
            this.I = inflate.findViewById(R.id.takeout_list_dynamic_progress_bar_global);
            this.J = inflate.findViewById(R.id.takeout_list_dynamic_progress_bar_bg);
            this.J.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.16
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b47c003321b3f215f35b493049b90ecd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b47c003321b3f215f35b493049b90ecd");
                    }
                }
            });
            this.I.setVisibility(8);
            this.J.setVisibility(8);
            this.M = inflate.findViewById(R.id.takeout_refresh_empty_global);
            this.M.setVisibility(0);
            this.M.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.17
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "aa547605e62b95f2a94176ffcd38d8b7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "aa547605e62b95f2a94176ffcd38d8b7");
                    }
                }
            });
            this.O = (TextView) inflate.findViewById(R.id.tv_login);
            this.N = (TextView) inflate.findViewById(R.id.txt_empty_message);
            this.P = (TextView) inflate.findViewById(R.id.txt_empty_message_forbidden);
            this.Q = (ImageView) inflate.findViewById(R.id.img_no_content_icon);
            m.a("http://p0.meituan.net/scarlett/c2ef18d7ff5ac5640351578b301d695d12076.png").a(this.Q);
            this.S = inflate.findViewById(R.id.ll_location_fail_container);
            this.T = (TextView) inflate.findViewById(R.id.tv_manual_locate);
            this.U = (TextView) inflate.findViewById(R.id.tv_reload);
            this.T.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.18
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "83139a8e89e63a2cae66b7726149d758", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "83139a8e89e63a2cae66b7726149d758");
                    } else {
                        com.sankuai.waimai.store.router.d.a(ResultFragment.this.getActivity(), com.sankuai.waimai.store.router.c.j);
                    }
                }
            });
            this.U.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.19
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "531da1844e76a380f0e293a2f2a8f478", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "531da1844e76a380f0e293a2f2a8f478");
                        return;
                    }
                    if (ResultFragment.this.ao != null) {
                        ResultFragment.this.ao.a();
                    }
                    ResultFragment.this.a(ResultFragment.this.h, 29, ResultFragment.this.d.n, 0);
                }
            });
            this.X = this.V.findViewById(R.id.search_list_loading_layout);
            this.X.setVisibility(8);
            this.Y = this.V.findViewById(R.id.pull_to_load_progress);
            this.Z = (TextView) this.V.findViewById(R.id.search_list_loading_txt_tv);
            this.aa = (EasterEggLayout) inflate.findViewById(R.id.search_easter_egg_layout);
            this.ad = (StickyContainerFrameLayout) inflate.findViewById(R.id.layout_container);
            this.r = new com.sankuai.waimai.store.search.ui.result.b() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.20
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.search.ui.result.b
                public final void a(String str, String str2) {
                    Object[] objArr4 = {str, str2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3bbb3848e596dde3b6742c0fe83d1a29", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3bbb3848e596dde3b6742c0fe83d1a29");
                    } else if (TextUtils.isEmpty(str) || ResultFragment.this.v == null) {
                    } else {
                        ResultFragment.this.v.e();
                        if ("_search_brand_filter".equals(str2)) {
                            ResultFragment.this.d.g = "11002";
                            ResultFragment.this.a(0L, null, str, 7, ResultFragment.this.d.n, ResultFragment.this.m);
                            ResultFragment.this.h = str;
                        } else if ("_search_choose_guide".equals(str2) || "_search_rec_product_click_more".equals(str2)) {
                            com.sankuai.waimai.store.search.ui.actionbar.b bVar = ResultFragment.this.v;
                            Object[] objArr5 = {str, str2};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.search.ui.actionbar.b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "546c02038d56cee44b5c457dfec968df", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "546c02038d56cee44b5c457dfec968df");
                                return;
                            }
                            if (bVar.d != null) {
                                bVar.d.setText(str);
                            }
                            if (bVar.i != null) {
                                bVar.i.a("11002");
                                bVar.i.a(false, str2, 0);
                            }
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.result.b
                public final void a() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a874377c2106ac1755d7bece95d19bce", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a874377c2106ac1755d7bece95d19bce");
                        return;
                    }
                    ResultFragment.c(ResultFragment.this, 0);
                    ResultFragment.this.a(0L, null, ResultFragment.this.h, 7, ResultFragment.this.d.n, ResultFragment.this.m);
                }

                @Override // com.sankuai.waimai.store.search.ui.result.b
                public final void b() {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1b56bca147d5c9022a09965f0da872f9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1b56bca147d5c9022a09965f0da872f9");
                    } else {
                        ResultFragment.this.a(ResultFragment.this.h, 16, ResultFragment.this.d.n, ResultFragment.this.m);
                    }
                }

                @Override // com.sankuai.waimai.store.search.ui.result.b
                public final void a(int i, String str) {
                    Object[] objArr4 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3f8ee885825a1a5387b51b64e92efb07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3f8ee885825a1a5387b51b64e92efb07");
                        return;
                    }
                    ResultFragment.c(ResultFragment.this, 0);
                    ResultFragment.this.a(ResultFragment.this.h, i, ResultFragment.this.d.n, ResultFragment.this.m);
                }

                @Override // com.sankuai.waimai.store.search.ui.result.b
                public final void a(int i) {
                    Object[] objArr4 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b72ec4866b28ca999435cd5a142d43c5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b72ec4866b28ca999435cd5a142d43c5");
                        return;
                    }
                    int a2 = p.a(ResultFragment.this.x.getLayoutManager());
                    if (ResultFragment.this.l) {
                        ResultFragment.this.R.a(false, a2);
                    }
                }
            };
            this.q = new e(this, this.c, this.s, this.r, q());
            StickyContainerFrameLayout stickyContainerFrameLayout = this.ad;
            com.sankuai.waimai.store.search.adapterdelegates.a aVar = this.q;
            Object[] objArr4 = {aVar};
            ChangeQuickRedirect changeQuickRedirect4 = StickyContainerFrameLayout.a;
            if (PatchProxy.isSupport(objArr4, stickyContainerFrameLayout, changeQuickRedirect4, false, "f54cfb07fc2b62b7f3798939128e48af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, stickyContainerFrameLayout, changeQuickRedirect4, false, "f54cfb07fc2b62b7f3798939128e48af");
            } else if (aVar != null && stickyContainerFrameLayout.c != null) {
                aVar.registerAdapterDataObserver(stickyContainerFrameLayout.c);
            }
            this.q.a(this.V);
            this.W = new View(this.F);
            this.W.setLayoutParams(new ViewGroup.LayoutParams(-1, 0));
            this.q.a(this.W);
            this.x.setAdapter(this.q);
            com.sankuai.waimai.store.search.ui.actionbar.b bVar = this.v;
            Object[] objArr5 = {bVar};
            ChangeQuickRedirect changeQuickRedirect5 = e;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7d94401b3da4487fc47ee23ddcec4b3b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7d94401b3da4487fc47ee23ddcec4b3b");
            } else if (bVar != null) {
                if (bVar.p != null) {
                    this.as = bVar.p;
                }
                if (bVar.q != null) {
                    this.av = bVar.q;
                }
                if (bVar.r != null) {
                    this.at = bVar.r;
                }
                if (bVar.g != null) {
                    this.au = bVar.g;
                }
            }
            AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.nested_header_container);
            AppBarLayout appBarLayout2 = (AppBarLayout) inflate.findViewById(R.id.outer_header_container);
            this.u = new com.sankuai.waimai.store.search.ui.result.nestedheader.a(this.c, q(), appBarLayout, appBarLayout2, (CoordinatorLayout) inflate.findViewById(R.id.outer_coordinator_layout));
            appBarLayout2.a(new AppBarLayout.a() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.3
                public static ChangeQuickRedirect a;

                @Override // android.support.design.widget.AppBarLayout.a
                public final void a(AppBarLayout appBarLayout3, int i) {
                    Object[] objArr6 = {appBarLayout3, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3beea7c887389df457f49f0e9a4ec5ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3beea7c887389df457f49f0e9a4ec5ba");
                    } else if ((ResultFragment.this.aq || ResultFragment.this.ar) && ResultFragment.this.u.b() != 0 && ResultFragment.this.d.n()) {
                        ResultFragment.a(ResultFragment.this, -i, ResultFragment.this.u.b());
                    }
                }
            });
            this.x.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.4
                public static ChangeQuickRedirect a;
                private int c;

                {
                    this.c = com.sankuai.waimai.foundation.utils.g.a(ResultFragment.this.F, 10.0f);
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr6 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "ea68cc1c90a4dcf83fbdf5d5e0326c0b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "ea68cc1c90a4dcf83fbdf5d5e0326c0b");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    ResultFragment.this.ac += i2;
                    ResultFragment.d(ResultFragment.this, i2);
                    if ((ResultFragment.this.aq || ResultFragment.this.ar) && ResultFragment.this.aw != 0 && !ResultFragment.this.d.n()) {
                        ResultFragment.a(ResultFragment.this, ResultFragment.this.ac, ResultFragment.this.aw);
                    }
                    ResultFragment.this.A.setVisibility(0);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ResultFragment.this.A.getLayoutParams();
                    int i3 = marginLayoutParams.width;
                    if (ResultFragment.this.ac >= this.c) {
                        if (ResultFragment.this.ac > (this.c * 2) + i3) {
                            if (marginLayoutParams.bottomMargin != this.c) {
                                marginLayoutParams.bottomMargin = this.c;
                                ResultFragment.this.A.setLayoutParams(marginLayoutParams);
                            }
                            ResultFragment.this.D = true;
                            ResultFragment.c(ResultFragment.this, false);
                        } else {
                            marginLayoutParams.bottomMargin += i2;
                            ResultFragment.this.A.setLayoutParams(marginLayoutParams);
                            ResultFragment.this.D = false;
                            if (!ResultFragment.this.C) {
                                ResultFragment.this.C = true;
                                JudasManualManager.b("b_waimai_zvohtgci_mv").a("c_nfqbfvw").a("template_type", ResultFragment.this.d.D).a("search_log_id", ResultFragment.this.d.q).a("cat_id", ResultFragment.this.d.z).a();
                            }
                        }
                    } else {
                        if (marginLayoutParams.bottomMargin != (-marginLayoutParams.width)) {
                            marginLayoutParams.bottomMargin = -marginLayoutParams.width;
                            ResultFragment.this.A.setLayoutParams(marginLayoutParams);
                        }
                        ResultFragment.this.C = false;
                        ResultFragment.this.D = false;
                        ResultFragment.I(ResultFragment.this);
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    ResultFragment.this.n = p.a(layoutManager);
                    ResultFragment.N(ResultFragment.this);
                    ResultFragment.a(ResultFragment.this, layoutManager);
                    View findViewByPosition = layoutManager.findViewByPosition(p.b(layoutManager));
                    if (findViewByPosition != null && (findViewByPosition.getTag() instanceof CardTitle)) {
                        CardTitle cardTitle = (CardTitle) findViewByPosition.getTag();
                        if (cardTitle.type == 5) {
                            ResultFragment.this.ay = ResultFragment.this.ac;
                        } else if (cardTitle.type == 6) {
                            ResultFragment.this.az = ResultFragment.this.ac;
                        }
                    }
                    if (ResultFragment.this.d.ao) {
                        ResultFragment.this.v();
                        ResultFragment.this.d.ao = false;
                    }
                    int a2 = p.a(layoutManager);
                    ResultFragment.d(ResultFragment.this, false);
                    ResultFragment.this.R.a(true, a2);
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr6 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "153052d2580d1f17383ae9323fadec01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "153052d2580d1f17383ae9323fadec01");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        ResultFragment.I(ResultFragment.this);
                    } else if (i == 1) {
                        ResultFragment.c(ResultFragment.this, true);
                    }
                    if (i == 0 && ResultFragment.this.an != null) {
                        ResultFragment.this.an.run();
                        ResultFragment.a(ResultFragment.this, (Runnable) null);
                    }
                    int itemCount = ResultFragment.this.q.getItemCount();
                    com.sankuai.waimai.store.search.adapterdelegates.a aVar2 = ResultFragment.this.q;
                    Object[] objArr7 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.search.adapterdelegates.a.a;
                    int intValue = itemCount - (PatchProxy.isSupport(objArr7, aVar2, changeQuickRedirect7, false, "9941373085837301386400aaff24d6f8", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr7, aVar2, changeQuickRedirect7, false, "9941373085837301386400aaff24d6f8")).intValue() : aVar2.b.size());
                    if (i == 0 && ResultFragment.this.n >= intValue - 1 && ResultFragment.this.j && !ResultFragment.this.k) {
                        ResultFragment.e(ResultFragment.this, true);
                        ResultFragment.this.w();
                        ResultFragment.this.a(0L, null, ResultFragment.this.h, 6, ResultFragment.this.d.n, ResultFragment.this.m);
                    }
                    if ((ResultFragment.this.d.aH == 200) && ResultFragment.this.n >= intValue - 4 && ResultFragment.this.j && !ResultFragment.this.k) {
                        ResultFragment.e(ResultFragment.this, true);
                        ResultFragment.this.w();
                        ResultFragment.this.a(0L, null, ResultFragment.this.h, 6, ResultFragment.this.d.n, ResultFragment.this.m);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            ResultFragment.this.R.a();
                            return;
                        }
                        return;
                    }
                    com.sankuai.waimai.store.search.common.view.f fVar = ResultFragment.this.R;
                    Object[] objArr8 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.search.common.view.f.a;
                    if (PatchProxy.isSupport(objArr8, fVar, changeQuickRedirect8, false, "31d508f5c4bf74756a809236d37ac8eb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, fVar, changeQuickRedirect8, false, "31d508f5c4bf74756a809236d37ac8eb");
                    } else if (!fVar.g || fVar.f == null) {
                    } else {
                        fVar.g = false;
                        FloatCardOutInAnimation floatCardOutInAnimation = fVar.f;
                        Object[] objArr9 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect9 = FloatCardOutInAnimation.a;
                        if (PatchProxy.isSupport(objArr9, floatCardOutInAnimation, changeQuickRedirect9, false, "4b18d3a504ff5897f9a70bed6f62a351", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr9, floatCardOutInAnimation, changeQuickRedirect9, false, "4b18d3a504ff5897f9a70bed6f62a351");
                        } else if (floatCardOutInAnimation.i != null) {
                            floatCardOutInAnimation.i.postDelayed(floatCardOutInAnimation.j, 750L);
                        }
                    }
                }
            });
            this.x.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    Object[] objArr6 = {view, motionEvent};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "542bacb2bf70ef5196c943ffea0deff4", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "542bacb2bf70ef5196c943ffea0deff4")).booleanValue();
                    }
                    ResultFragment.this.a();
                    return false;
                }
            });
        }
        com.sankuai.waimai.store.poi.subscribe.a.a().a(this);
        return inflate;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b1b7f52d832882f85b6fb587223910", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b1b7f52d832882f85b6fb587223910");
        } else if (j.h().a("marketing_remind/page_flashbuy_global_search_result_request", false)) {
            if (this.al == null) {
                this.al = new com.sankuai.waimai.store.manager.marketing.a(this.F, getView(), 6);
            } else {
                this.al.j();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("page_type", "6");
            hashMap.put("key_word", this.h);
            hashMap.put("category_type", String.valueOf(this.d.z));
            hashMap.put("second_category_type", String.valueOf(this.d.B));
            this.al.a(hashMap, q());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0c69df6ca65ed2c4e1e6be370816a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0c69df6ca65ed2c4e1e6be370816a76");
            return;
        }
        super.onViewCreated(view, bundle);
        final com.sankuai.waimai.store.search.common.view.b bVar = new com.sankuai.waimai.store.search.common.view.b(this.c, this.d);
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.view.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c9d33cae1b47efee2d1af4384d03e376", RobustBitConfig.DEFAULT_VALUE)) {
            bVar = (com.sankuai.waimai.store.search.common.view.b) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c9d33cae1b47efee2d1af4384d03e376");
        } else {
            bVar.b = view.findViewById(R.id.btn_global_cart);
            bVar.b.setVisibility(0);
            bVar.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.common.view.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8c3b9274091f7bec26734efe8cc4e4f7", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8c3b9274091f7bec26734efe8cc4e4f7");
                        return;
                    }
                    GlobalCartManager.toGlobalCartActivity(bVar.c);
                    JudasManualManager.a("b_waimai_xh6hk3h5_mc").a("search_log_id", bVar.d.q).a("template_type", bVar.d.D).a("stid", bVar.d.e).a("cat_id", bVar.d.z).a("search_source", bVar.d.aw).a();
                }
            });
        }
        this.af = bVar;
        this.R = new com.sankuai.waimai.store.search.common.view.f(this.c, this.d, this.af);
        final com.sankuai.waimai.store.search.common.view.f fVar = this.R;
        Object[] objArr3 = {view};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.view.f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "31216da6d59d61e1faf6282fadaf49a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "31216da6d59d61e1faf6282fadaf49a7");
        } else {
            fVar.d = (ImageView) view.findViewById(R.id.iv_use_drug_im);
            fVar.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.common.view.f.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr4 = {view2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "858c2f9fa58097d52eff333d30306f9a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "858c2f9fa58097d52eff333d30306f9a");
                    } else if (fVar.c.au == null || TextUtils.isEmpty(fVar.c.au.scheme)) {
                    } else {
                        com.sankuai.waimai.store.manager.judas.b.a("c_nfqbfvw", "b_waimai_1f89fno0_mc").b(fVar.e).a();
                        com.sankuai.waimai.store.router.d.a(fVar.b, fVar.c.au.scheme);
                    }
                }
            });
            fVar.f = new FloatCardOutInAnimation(fVar.d, fVar.b, com.sankuai.shangou.stone.util.h.a(fVar.b, 34.0f));
        }
        this.o = new com.sankuai.waimai.store.search.common.view.a(getContext());
        this.o.bindView(view.findViewById(R.id.layout_feedback_parent));
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4132a147f1c87ca8266669b072b99fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4132a147f1c87ca8266669b072b99fec");
            return;
        }
        super.a(z);
        if (this.al != null) {
            if (z) {
                this.al.h();
            } else {
                this.al.i();
            }
        }
        if (this.am != null) {
            if (z) {
                com.sankuai.waimai.store.manager.marketing.e eVar = this.am;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.manager.marketing.e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "75cbe4b04a90a9722fee968e8452cbf0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "75cbe4b04a90a9722fee968e8452cbf0");
                    return;
                } else {
                    eVar.a().c(true);
                    return;
                }
            }
            com.sankuai.waimai.store.manager.marketing.e eVar2 = this.am;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.marketing.e.a;
            if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "4339f69fbbfa661f78fb93c1e69c1e77", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "4339f69fbbfa661f78fb93c1e69c1e77");
            } else {
                eVar2.a().c(false);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17a9979221d0c2ccaf6d08963c429a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17a9979221d0c2ccaf6d08963c429a89");
        } else {
            super.onResume();
        }
    }

    private int l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393a7c04f6d22835ddd975ba16477fa8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393a7c04f6d22835ddd975ba16477fa8")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.s)) {
            return -1;
        }
        for (int i = 0; i < this.s.size(); i++) {
            OasisModule oasisModule = this.s.get(i);
            if (oasisModule != null && "wm_shangou_drug_merge_sort_quick_filter_v2".equals(oasisModule.nativeTemplateId)) {
                return i;
            }
        }
        return -1;
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28c37a484dfcd829c8ca2441bf8cc07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28c37a484dfcd829c8ca2441bf8cc07");
        } else if (this.d.bg) {
            if (!TextUtils.isEmpty(this.d.h) && this.d.h.equals(str)) {
                this.g.d = true;
            } else {
                this.g.d = false;
            }
        }
    }

    private void a(GlobalPageResponse globalPageResponse) {
        GlobalSearchExtraInfo.FloatingInfo a2;
        Object[] objArr = {globalPageResponse};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c186fb05fe39780e7cfc04880deab04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c186fb05fe39780e7cfc04880deab04");
            return;
        }
        if (globalPageResponse == null || com.sankuai.waimai.foundation.utils.b.b(globalPageResponse.moduleList) || globalPageResponse.globalSearchExtraInfo == null || !globalPageResponse.globalSearchExtraInfo.hasResult) {
            com.sankuai.waimai.store.search.common.view.a aVar = this.o;
            Object[] objArr2 = {globalPageResponse};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.view.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "b4bab8471bd4d3fc5f0f7522db99dfe5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "b4bab8471bd4d3fc5f0f7522db99dfe5");
            } else {
                if (globalPageResponse != null && globalPageResponse.globalSearchExtraInfo != null && globalPageResponse.globalSearchExtraInfo.questionnaire != null) {
                    aVar.c = globalPageResponse.globalSearchExtraInfo;
                }
                if (aVar.a(aVar.c)) {
                    aVar.setVisible(false);
                } else {
                    aVar.c.getQuestionnaireConfig();
                    aVar.a(3, aVar.c.getQuestionnaireScene().noresultId);
                    aVar.a();
                }
            }
            if (this.am != null) {
                com.sankuai.waimai.store.manager.marketing.e eVar = this.am;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.manager.marketing.e.a;
                if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "0a6ece0d8a3a076b55becd48296122bc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "0a6ece0d8a3a076b55becd48296122bc");
                } else if (eVar.i == null || (a2 = eVar.a(eVar.h.globalSearchExtraInfo)) == null || a2.cardMsg == null) {
                } else {
                    eVar.a(3, 0);
                    eVar.a(eVar.c);
                    eVar.a().b(true);
                }
            }
        }
    }

    private void a(boolean z, ForbiddenInfo forbiddenInfo) {
        Object[] objArr = {(byte) 1, forbiddenInfo};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68324fac8c0d2b3fda04b0599d32b363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68324fac8c0d2b3fda04b0599d32b363");
            return;
        }
        this.M.setVisibility(0);
        if (forbiddenInfo == null || TextUtils.isEmpty(forbiddenInfo.forbiddenIcon)) {
            b.C0608b a2 = m.a("http://p0.meituan.net/scarlett/cc18301defc1a95713b3813469745d2e12814.png");
            a2.j = R.drawable.wm_sc_nox_search_nonresult_icon;
            a2.a(this.Q);
        } else {
            b.C0608b a3 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a3.b = this.Q.getContext();
            a3.c = forbiddenInfo.forbiddenIcon;
            b.C0608b b2 = a3.b(this.Q.getLayoutParams().width);
            b2.f = ImageQualityUtil.b();
            b2.i = R.drawable.wm_sc_nox_search_nonresult_icon;
            b2.j = R.drawable.wm_sc_nox_search_nonresult_icon;
            b2.a(this.Q);
        }
        if (forbiddenInfo != null && !TextUtils.isEmpty(forbiddenInfo.forbiddenRemindContext)) {
            this.P.setText(forbiddenInfo.forbiddenRemindContext);
            this.P.setVisibility(0);
        }
        if (forbiddenInfo != null && !TextUtils.isEmpty(forbiddenInfo.forbiddenAdditionalContext)) {
            this.N.setText(forbiddenInfo.forbiddenAdditionalContext);
        } else {
            this.N.setText("");
        }
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        this.S.setVisibility(8);
        this.O.setVisibility(8);
        m();
    }

    private void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8d038bb27b49440074d0dd0daac768f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8d038bb27b49440074d0dd0daac768f");
            return;
        }
        b.C0608b a2 = m.a("http://p0.meituan.net/scarlett/c2ef18d7ff5ac5640351578b301d695d12076.png");
        a2.j = R.drawable.wm_sc_nox_search_no_result;
        a2.a(this.Q);
        this.M.setVisibility(0);
        if (TextUtils.isEmpty(str)) {
            this.N.setText(R.string.wm_sc_nox_search_loading_fail_try_afterwhile);
        } else {
            this.N.setText(str);
        }
        this.P.setVisibility(8);
        this.S.setVisibility(8);
        this.O.setVisibility(8);
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0df995b3a49f618553ac5c7c85bb0cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0df995b3a49f618553ac5c7c85bb0cb6");
            return;
        }
        b.C0608b a2 = m.a(z ? "https://p0.meituan.net/travelcube/cfb35a05c4ccdbff18404ab3ea4fe7b353241.png" : "http://p0.meituan.net/scarlett/cc18301defc1a95713b3813469745d2e12814.png");
        a2.j = R.drawable.wm_sc_nox_search_nonresult_icon;
        a2.a(this.Q);
        this.M.setVisibility(0);
        this.S.setVisibility(8);
        if (z) {
            this.N.setText("");
            this.P.setVisibility(8);
            this.O.setVisibility(8);
            return;
        }
        u.a(this.P, (int) R.string.wm_sc_nox_search_no_login_text);
        this.N.setText("");
        this.O.setVisibility(0);
        this.O.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ceeed0faedd156fc95804ec11b7bc36", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ceeed0faedd156fc95804ec11b7bc36");
                } else {
                    com.sankuai.waimai.store.manager.user.a.a(ResultFragment.this.getContext(), new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.7.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52fbc8fd24699963e183503eca97dba3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52fbc8fd24699963e183503eca97dba3");
                            } else {
                                ResultFragment.this.a(ResultFragment.this.h, 0, ResultFragment.this.d.n, 0);
                            }
                        }
                    });
                }
            }
        });
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc2cbdb1e5823372b6c69b4b18974b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc2cbdb1e5823372b6c69b4b18974b0");
            return;
        }
        this.x.setVisibility(8);
        this.A.setVisibility(8);
        this.C = false;
        this.D = false;
    }

    private void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40d77be1f749fddb74f9748ee6ee1c63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40d77be1f749fddb74f9748ee6ee1c63");
            return;
        }
        if (!this.j && this.ac >= 90) {
            t();
        }
        u();
    }

    private void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d93be4dcd8bb585d151e2a731e2d54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d93be4dcd8bb585d151e2a731e2d54f");
            return;
        }
        this.ac -= this.V.getMeasuredHeight();
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52c558b6bd2cd6dd887572c2dbedbb92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52c558b6bd2cd6dd887572c2dbedbb92");
            return;
        }
        this.X.setVisibility(8);
        this.Y.setVisibility(8);
        this.Z.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c03affd8446e029e9c226776531a28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c03affd8446e029e9c226776531a28");
        } else if (getFragmentManager() != null) {
            for (Fragment fragment : getFragmentManager().getFragments()) {
                if (fragment instanceof SGBaseSortFilterFragment) {
                    ((SGBaseSortFilterFragment) fragment).u();
                }
            }
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa12ec27d9525c868204c882d9d5ea99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa12ec27d9525c868204c882d9d5ea99");
        } else {
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59cfd7e37d1c4b3be0b86c467d0c9c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59cfd7e37d1c4b3be0b86c467d0c9c2");
            return;
        }
        this.X.setVisibility(0);
        this.Y.setVisibility(0);
        this.Z.setVisibility(0);
        this.Z.setText(R.string.wm_sc_nox_search_footer_loading);
    }

    public static String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e2ca979d71758ce5b76a80884f55dfc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e2ca979d71758ce5b76a80884f55dfc");
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (valueOf.length() > 4) {
            valueOf = valueOf.substring(4);
        }
        String c = com.sankuai.waimai.platform.b.A().c();
        if (c == null) {
            long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
            c = d > 0 ? String.valueOf(d) : "";
        }
        return valueOf + Math.abs(c.hashCode());
    }

    public final void a(long j, String str, String str2, int i, int i2) {
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5a291524f2c11f34640b411d1332291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5a291524f2c11f34640b411d1332291");
            return;
        }
        if (i != 14 && i != 15 && i != 17 && i != 19) {
            this.m = 0;
        }
        if (i != 31 && this.d != null) {
            this.d.i = "";
            this.d.j = "";
            this.d.k = 0L;
        }
        a(j, str, str2, i, i2, this.m);
    }

    public final void a(String str, int i, int i2, int i3) {
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef33e8df10d1ef38995deb8cf9ba278", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef33e8df10d1ef38995deb8cf9ba278");
        } else {
            a(0L, null, str, i, i2, i3);
        }
    }

    public final void a(long j, String str, String str2, int i, int i2, int i3) {
        String str3;
        int i4;
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d5efa205b6d51cbd17943ecaee07cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d5efa205b6d51cbd17943ecaee07cf1");
            return;
        }
        this.d.x = i;
        this.f.a(i, this.g);
        if (this.d != null && this.d.aX != null) {
            this.d.aX.recordStep("perform_search_action");
        }
        Activity activity = this.F;
        boolean z = activity instanceof BaseActivity;
        if (z && this.d.F) {
            ((BaseActivity) activity).s().recordStep("perform_search_action");
        }
        if (this.g.k) {
            this.ae = null;
        }
        int i5 = i2 < 0 ? this.d.n : i2;
        a(str2);
        if (this.g.d) {
            if (z && this.d.F) {
                ((BaseActivity) activity).s().recordStep("save_word_to_history");
            }
            if (this.d.aX != null) {
                this.d.aX.recordStep("save_word_to_history");
            }
            a(str2, j, str);
        }
        v();
        if (this.g.e) {
            x();
        }
        F();
        if (this.g.f) {
            this.d.M = 0L;
        }
        if (this.g.g) {
            this.d.an = null;
            this.d.al = "";
        }
        if (this.g.h) {
            this.d.V = null;
            this.d.am = "";
        }
        if (this.g.n) {
            this.l = true;
            u.c(this.R.d);
            this.d.au = null;
        }
        if (this.g.i && this.v != null) {
            this.v.e();
        }
        if (this.g.o && this.d.aw == 4004 && i != 26) {
            this.d.aw = 0;
        }
        if (this.g.q) {
            this.d.ai = "";
            this.d.ah = "";
        }
        if (this.g.r) {
            this.d.K = null;
            str3 = this.d.h;
        } else {
            str3 = str2;
        }
        long j2 = (this.d == null || TextUtils.isEmpty(this.d.i) || this.d.k == 0) ? 0L : this.d.k;
        if (!this.g.b) {
            y();
            if (i == 0 || i == 3 || i == 2 || i == 1 || i == 18 || i == 13 || i == 28 || i == 35 || i == 5) {
                this.I.setVisibility(8);
                this.L.a(this.d.bg);
            } else {
                this.L.a();
                this.I.setVisibility(0);
            }
            this.J.setVisibility(0);
            if (i != 7 && i != 21 && i != 22 && i != 15) {
                this.w.setVisibility(8);
                if (this.v != null && i != 11) {
                    this.v.i();
                }
            }
            this.M.setVisibility(8);
            this.i = 0;
            this.ai = 0;
            this.ah = 0L;
            this.p++;
        }
        this.d.aN = this.ae;
        if (TextUtils.isEmpty(str3)) {
            ae.a(this.F, (int) R.string.wm_sc_nox_search_global_hint);
            return;
        }
        if (this.g.j) {
            this.ab = i();
        }
        if (TextUtils.isEmpty(this.ab)) {
            com.sankuai.waimai.store.util.monitor.c.a(GlobalSearch.EmptyGlobalId, "search_global_id is empty! ", "search_global_id is empty, from : " + i);
        }
        if (this.g.l) {
            this.f.a();
        }
        if (!this.g.m) {
            i4 = i3;
        } else if (this.d.aJ == 100) {
            i4 = 200;
        } else {
            i4 = this.d.aJ == 200 ? 100 : 0;
        }
        if (this.g.p) {
            this.d.o = "";
        }
        if (z && this.d.F) {
            ((BaseActivity) activity).s().recordStep("do_search_request_start");
        }
        if (this.d.aX != null) {
            this.d.aX.recordStep("do_search_request_start");
        }
        a(this.d.c(), str3, this.g.b, i5, this.g.c, this.ab, this.ae, i4, this.d.o, i, j2);
    }

    private void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5a2687f862a1341e2c4c2326f74588c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5a2687f862a1341e2c4c2326f74588c");
        } else if (this.d == null) {
        } else {
            this.d.R = null;
            this.d.W = null;
            this.d.S.clear();
            this.d.T.clear();
            this.d.Y.clear();
            this.d.aa = 0;
            this.d.U.clear();
            this.d.aq.clear();
            this.d.ab = 0;
            this.d.N.clear();
            this.d.P.clear();
            this.d.Q.clear();
            this.d.ac.clear();
            this.d.ap = "";
            this.d.ae = "";
            this.d.J = 0;
            this.d.ad = "";
            this.d.ar.clear();
            this.d.at.clear();
            if (this.v != null) {
                this.v.b(false);
            }
        }
    }

    private void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57c733fdb4cf24bcc7703e780ffd970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57c733fdb4cf24bcc7703e780ffd970");
            return;
        }
        this.C = false;
        this.D = false;
        this.A.setVisibility(8);
    }

    private void a(boolean z, String str, boolean z2, int i, boolean z3, String str2, String str3, int i2, String str4, int i3, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, str3, Integer.valueOf(i2), str4, Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6efdcebc5c3304f99eea4c9de7af080f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6efdcebc5c3304f99eea4c9de7af080f");
            return;
        }
        if (!z) {
            a(str, i);
        }
        if (z() && !com.sankuai.waimai.store.locate.a.g()) {
            if (this.ao != null) {
                this.ap = true;
                this.ao.a("dj-0e1ca99fc191a803");
                return;
            }
            return;
        }
        b(z, str, z2, i, z3, str2, str3, i2, str4, i3, j);
    }

    private boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418809ebdb79145c0601960ca6e4f7a7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418809ebdb79145c0601960ca6e4f7a7")).booleanValue() : com.sankuai.waimai.store.search.common.api.config.a.a();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final String bH_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32e79df978318ba3fb64e6761e9d5f5b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32e79df978318ba3fb64e6761e9d5f5b") : super.q();
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final void a(GlobalPageResponse globalPageResponse, boolean z, boolean z2, MetricsSpeedMeterTask metricsSpeedMeterTask) {
        int intValue;
        Object[] objArr = {globalPageResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bce00aeef9dcc47bee15c75cdebb397", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bce00aeef9dcc47bee15c75cdebb397");
            return;
        }
        boolean z3 = !this.k;
        com.sankuai.waimai.store.fsp.a.a().a(getActivity(), 300);
        this.k = false;
        a(true, globalPageResponse != null ? globalPageResponse.searchIntent : -1);
        b(true, globalPageResponse != null ? globalPageResponse.searchIntent : -1);
        this.ap = false;
        metricsSpeedMeterTask.recordStep("response_start");
        Object[] objArr2 = {globalPageResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e819e676393b650dd231218d71d28619", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e819e676393b650dd231218d71d28619");
        } else {
            this.f.b();
            this.ag = !z ? 1 : 0;
            if (TextUtils.isEmpty(this.d.h)) {
                this.L.a();
                D();
            } else if (globalPageResponse == null) {
                if (z) {
                    if (this.d.bg && this.ac >= 90) {
                        t();
                        u();
                    } else {
                        s();
                    }
                    D();
                } else {
                    if (this.d.bg) {
                        com.sankuai.waimai.store.util.monitor.b.a().a(new MEDSearchResultMonitor("MEDSearchResultRenderFail")).a(DataConstants.CATEGORY_ID, String.valueOf(this.d.z)).a("error_type", "2").a();
                    }
                    this.L.a();
                    b("");
                    m();
                    D();
                }
            } else if (z && this.d.aH != globalPageResponse.searchMode) {
                if (this.d.bg && this.ac >= 90) {
                    t();
                    u();
                } else {
                    s();
                }
                this.L.a();
                D();
            } else {
                com.sankuai.waimai.store.search.common.view.c cVar = this.L;
                PrescriptionRemindInfo prescriptionRemindInfo = globalPageResponse.mPrescriptionRemindInfo;
                boolean z4 = this.d.bg;
                Object[] objArr3 = {prescriptionRemindInfo, Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.search.common.view.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "f3eca196acaeb82e09cf32a7ce995a43", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "f3eca196acaeb82e09cf32a7ce995a43");
                } else {
                    cVar.b = prescriptionRemindInfo;
                    cVar.d = System.currentTimeMillis();
                    if (!z4 && cVar.b != null && !TextUtils.isEmpty(cVar.b.mRemindText)) {
                        if (cVar.b.mRemindText.contains("\\n")) {
                            cVar.a(cVar.b.mRemindText.replace("\\n", "\n"));
                        } else {
                            cVar.a(cVar.b.mRemindText);
                        }
                    }
                }
                this.aj = globalPageResponse;
                this.ah = globalPageResponse.searchCursor;
                this.ai = globalPageResponse.nextSearchPageType;
                this.d.r = this.ab;
                this.d.E = z2;
                this.d.m = globalPageResponse.highLightList;
                if (globalPageResponse.globalSearchExtraInfo != null) {
                    this.d.be = globalPageResponse.globalSearchExtraInfo.expAbInfoMap == null ? null : globalPageResponse.globalSearchExtraInfo.expAbInfoMap;
                    com.sankuai.waimai.store.fsp.a.a().b(getActivity(), "exp_ab", i.a(this.d.be));
                    globalPageResponse.globalSearchExtraInfo.expAbInfo = (ExpAbInfo) i.a(i.a(this.d.be), ExpAbInfo.class);
                    this.d.bd = globalPageResponse.globalSearchExtraInfo.expAbInfo;
                    this.d.e = globalPageResponse.globalSearchExtraInfo.tgt_stids;
                    this.d.q = globalPageResponse.globalSearchExtraInfo.searchLogId;
                    this.d.aZ = globalPageResponse.globalSearchExtraInfo.searchTraceInfo;
                    this.d.bu = globalPageResponse.globalSearchExtraInfo.maiCaiSupportLevel;
                    this.d.bv = globalPageResponse.globalSearchExtraInfo.maiCaiSupportClassify;
                    this.d.bj = globalPageResponse.globalSearchExtraInfo.expAbInfoMap == null ? null : globalPageResponse.globalSearchExtraInfo.expAbInfoMap.get("SgRecommendTagLayerB");
                    this.d.bk = globalPageResponse.globalSearchExtraInfo.expAbInfoMap == null ? null : globalPageResponse.globalSearchExtraInfo.expAbInfoMap.get("search_new_poi_mode_exp");
                    this.d.bp = globalPageResponse.globalSearchExtraInfo.paotuiChannel;
                    this.d.bq = globalPageResponse.globalSearchExtraInfo.moreParam;
                    if (!z) {
                        this.d.bl = globalPageResponse.globalSearchExtraInfo.expAbInfoMap == null ? null : globalPageResponse.globalSearchExtraInfo.expAbInfoMap.get("drug_search_filter_v3");
                    }
                    this.d.bn = globalPageResponse.globalSearchExtraInfo.expAbInfoMap != null ? globalPageResponse.globalSearchExtraInfo.expAbInfoMap.get("search_interact_optimization_790_3") : null;
                }
                if (globalPageResponse.apiResponseExtraInfo != null) {
                    this.d.f = globalPageResponse.apiResponseExtraInfo.apiStids;
                }
                if (!z) {
                    com.sankuai.waimai.store.search.data.g.a = -1;
                    this.d.p = globalPageResponse.template;
                    this.d.D = globalPageResponse.templateDetail;
                    this.d.aH = globalPageResponse.searchMode;
                    this.d.bo = globalPageResponse.drugBgUrl;
                    this.d.aJ = globalPageResponse.switchButton;
                    this.d.aK = globalPageResponse.spuMode;
                    this.d.ba = globalPageResponse.userPreferType;
                    this.d.bf = globalPageResponse.searchIntent;
                    h.a();
                    this.d.u.clear();
                    this.d.H.clear();
                    this.d.I.clear();
                    B();
                    SearchShareData searchShareData = this.d;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = SearchShareData.a;
                    if (PatchProxy.isSupport(objArr4, searchShareData, changeQuickRedirect4, false, "15f3ef323eea14efd38740a3e6755e8d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, searchShareData, changeQuickRedirect4, false, "15f3ef323eea14efd38740a3e6755e8d");
                    } else {
                        searchShareData.X.clear();
                    }
                }
                this.j = globalPageResponse.hasNextPage;
                this.i = globalPageResponse.currentPage + 1;
                if (this.d != null && this.d.aX != null) {
                    this.d.aX.recordStep("response_easter_egg");
                }
                if (globalPageResponse.easterEgg != null && !TextUtils.isEmpty(globalPageResponse.easterEgg.b) && globalPageResponse.easterEgg.a && globalPageResponse.easterEgg.c == 1) {
                    b.a aVar = new b.a() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.8
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr5 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "dcdb9a463fb749738493e18650b1f40b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "dcdb9a463fb749738493e18650b1f40b");
                            } else if (ResultFragment.this.getContext() != null) {
                                EasterEggLayout easterEggLayout = ResultFragment.this.aa;
                                int a2 = com.sankuai.waimai.foundation.utils.g.a(ResultFragment.this.getContext());
                                int b2 = com.sankuai.waimai.foundation.utils.g.b(ResultFragment.this.getContext());
                                Object[] objArr6 = {bitmap, Integer.valueOf(a2), Integer.valueOf(b2)};
                                ChangeQuickRedirect changeQuickRedirect6 = EasterEggLayout.a;
                                if (PatchProxy.isSupport(objArr6, easterEggLayout, changeQuickRedirect6, false, "ac9e5cf4fc32f31fb3fa5c40338cf09c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, easterEggLayout, changeQuickRedirect6, false, "ac9e5cf4fc32f31fb3fa5c40338cf09c");
                                    return;
                                }
                                easterEggLayout.b = a2;
                                easterEggLayout.c = b2;
                                easterEggLayout.f = bitmap;
                                easterEggLayout.removeAllViews();
                                easterEggLayout.d.removeCallbacks(easterEggLayout.e);
                                easterEggLayout.a(easterEggLayout.f, 5);
                                easterEggLayout.d.postDelayed(easterEggLayout.e, 1100L);
                            }
                        }
                    };
                    this.aa.setTag(aVar);
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = this;
                    a2.c = globalPageResponse.easterEgg.b;
                    a2.a(aVar);
                }
                this.f.a(globalPageResponse, metricsSpeedMeterTask, z);
                if (this.al != null && !z) {
                    this.al.f();
                    this.al.a(true);
                }
                if (this.am == null) {
                    this.am = new com.sankuai.waimai.store.manager.marketing.e(this.F, getView(), 6, globalPageResponse);
                }
            }
        }
        if (z3) {
            Object[] objArr5 = {globalPageResponse};
            ChangeQuickRedirect changeQuickRedirect5 = e;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "145d83ab804469883bb3767af74af3df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "145d83ab804469883bb3767af74af3df");
            } else {
                com.sankuai.waimai.store.search.common.view.a aVar2 = this.o;
                int i = this.p;
                Object[] objArr6 = {globalPageResponse, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.search.common.view.a.a;
                if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "4835a5c8c630f6e3e72ca7fb3c0d9d15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "4835a5c8c630f6e3e72ca7fb3c0d9d15");
                } else if (globalPageResponse == null || aVar2.a(globalPageResponse.globalSearchExtraInfo)) {
                    aVar2.setVisible(false);
                } else {
                    aVar2.c = globalPageResponse.globalSearchExtraInfo;
                    GlobalSearchExtraInfo.Config questionnaireConfig = aVar2.c.getQuestionnaireConfig();
                    GlobalSearchExtraInfo.Scene questionnaireScene = aVar2.c.getQuestionnaireScene();
                    int i2 = questionnaireConfig.searchTimesThreshold;
                    if (i2 >= 0 && i >= i2) {
                        aVar2.a(2, questionnaireScene.searchTimesId);
                        aVar2.a();
                    }
                }
                if (this.am != null) {
                    com.sankuai.waimai.store.manager.marketing.e eVar = this.am;
                    int i3 = this.p;
                    Object[] objArr7 = {Integer.valueOf(i3)};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.manager.marketing.e.a;
                    if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "a77ab5b567443e69e2a71c13bbd97ab6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "a77ab5b567443e69e2a71c13bbd97ab6");
                    } else if (eVar.i != null && (intValue = eVar.i.queryChangeCnt.intValue()) >= 0 && i3 >= intValue) {
                        eVar.a(2, intValue);
                        eVar.a(eVar.c);
                        eVar.a().b(true);
                    }
                }
            }
            a(globalPageResponse);
            this.R.a(globalPageResponse);
        }
        if (globalPageResponse == null || globalPageResponse.globalSearchExtraInfo == null || TextUtils.isEmpty(globalPageResponse.globalSearchExtraInfo.searchQuery)) {
            return;
        }
        this.h = globalPageResponse.globalSearchExtraInfo.searchQuery;
        if (this.d.s != null) {
            this.d.s.searchKeyword = this.h;
        }
        this.d.h = this.h;
        this.v.a(this.h);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final void a(com.sankuai.waimai.store.repository.net.b bVar, boolean z, MetricsSpeedMeterTask metricsSpeedMeterTask) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62699ad3bb2771f5ad017f959c1fd9f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62699ad3bb2771f5ad017f959c1fd9f2");
            return;
        }
        if (!z) {
            a((GlobalPageResponse) null);
        }
        a(false, -1);
        b(false, -1);
        this.ap = false;
        Object[] objArr2 = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), metricsSpeedMeterTask};
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22307a27afc7ef98e84b5a922cb0350f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22307a27afc7ef98e84b5a922cb0350f");
        } else {
            this.k = false;
            metricsSpeedMeterTask.disable();
            Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3f485742c6ba6f9b8c97487a75fe9f0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3f485742c6ba6f9b8c97487a75fe9f0c");
            } else if (z) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6b09cad21747bc36ca5c6979f19409f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6b09cad21747bc36ca5c6979f19409f9");
                } else {
                    this.X.setVisibility(0);
                    this.Y.setVisibility(8);
                    this.Z.setVisibility(0);
                    this.Z.setText(R.string.wm_sc_nox_search_footer_load_more);
                }
                if (this.F != null) {
                    ae.a(this.F, (int) R.string.wm_sc_nox_search_loading_fail_try_afterwhile);
                }
            } else {
                this.L.a();
                D();
                b("");
                m();
                C();
            }
            if (z) {
                s();
                D();
            } else {
                GlobalPageResponse globalPageResponse = bVar.e instanceof GlobalPageResponse ? (GlobalPageResponse) bVar.e : null;
                if (bVar.c == 100) {
                    this.d.u.clear();
                    h.a();
                    this.d.H.clear();
                    this.d.I.clear();
                    ForbiddenInfo a2 = com.sankuai.waimai.store.search.data.c.a(globalPageResponse);
                    if (a2 != null) {
                        a(true, a2);
                    } else {
                        a(true, (ForbiddenInfo) null);
                    }
                    C();
                    this.d.q = "";
                    if (globalPageResponse != null && globalPageResponse.globalSearchExtraInfo != null) {
                        this.d.q = globalPageResponse.globalSearchExtraInfo.searchLogId;
                    }
                    a(4);
                    B();
                } else if (bVar.c == 410 || bVar.c == 411) {
                    c(false);
                } else if (bVar.c == 401 || bVar.c == 402 || bVar.c == 403 || bVar.c == 404 || bVar.c == 405) {
                    c(true);
                } else {
                    if (bVar.a()) {
                        a(6);
                    } else if (bVar.b() || bVar.e == null) {
                        a(5);
                    }
                    b("");
                }
                m();
                D();
                a(this.s);
                b(this.t);
                this.q.notifyDataSetChanged();
            }
        }
        com.sankuai.waimai.store.util.monitor.c.a(SGSearchGlobal.RequestAPIError, bVar.b, String.valueOf(bVar.c));
        this.R.a(null);
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0a19073cbd668b30abcd9157374242", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0a19073cbd668b30abcd9157374242");
            return;
        }
        boolean A = A();
        if (!A && (this.F instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.b.a().f((com.sankuai.waimai.store.expose.v2.a) this.F);
        }
        if (z) {
            return;
        }
        if (A && (this.F instanceof com.sankuai.waimai.store.expose.v2.a)) {
            com.sankuai.waimai.store.expose.v2.b.a().f((com.sankuai.waimai.store.expose.v2.a) this.F);
        }
        ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
        layoutParams.height = 0;
        this.W.setLayoutParams(layoutParams);
    }

    private void a(String str, int i) {
        this.h = str;
        this.d.n = i;
    }

    private void a(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cfcd0c32ee7aefc43903b78d758893d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cfcd0c32ee7aefc43903b78d758893d");
        } else if (this.d.F) {
            Activity activity = this.F;
            if (activity instanceof BaseActivity) {
                this.d.F = false;
                a(z, i, ((BaseActivity) activity).s(), true);
            }
        }
    }

    private void b(boolean z, int i) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c405371d12278726dcdaf587db971719", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c405371d12278726dcdaf587db971719");
        } else if (this.d.aX == null) {
        } else {
            a(z, i, this.d.aX, false);
        }
    }

    private void a(boolean z, int i, MetricsSpeedMeterTask metricsSpeedMeterTask, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), metricsSpeedMeterTask, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cfebdac529c69f3f3b18282ffb06d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cfebdac529c69f3f3b18282ffb06d0e");
        } else if (z) {
            if (i == 1) {
                metricsSpeedMeterTask.recordStep("drug_search_ready");
            } else {
                metricsSpeedMeterTask.recordStep("store_search_ready");
                if (this.ap) {
                    metricsSpeedMeterTask.recordStep("search_with_reposition");
                } else {
                    metricsSpeedMeterTask.recordStep("search_without_reposition");
                }
            }
            metricsSpeedMeterTask.recordStep("activity_data_ready");
            if (z2) {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(metricsSpeedMeterTask);
            }
        } else {
            metricsSpeedMeterTask.disable();
        }
    }

    private boolean A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b536b80eb0986b5b07a6461478b90423", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b536b80eb0986b5b07a6461478b90423")).booleanValue() : this.d != null && this.d.bg && com.sankuai.waimai.store.config.d.h().a("search_result_lx_expose_bugfix_enable", true);
    }

    private void a(List<OasisModule> list) {
        com.sankuai.waimai.store.expose.v2.c cVar;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f117b0181edd43359a0326d0c43ee83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f117b0181edd43359a0326d0c43ee83");
        } else if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                OasisModule oasisModule = list.get(i);
                if (oasisModule != null && (oasisModule.data instanceof CommonMachData) && ((CommonMachData) oasisModule.data).mItem != null) {
                    ((CommonMachData) oasisModule.data).mItem.f();
                }
            }
            list.clear();
            if (A() || !(this.F instanceof com.sankuai.waimai.store.expose.v2.a)) {
                return;
            }
            com.sankuai.waimai.store.expose.v2.b a2 = com.sankuai.waimai.store.expose.v2.b.a();
            com.sankuai.waimai.store.expose.v2.a aVar = (com.sankuai.waimai.store.expose.v2.a) this.F;
            Object[] objArr2 = {aVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.expose.v2.b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "67bfb477e300525c95e231b95be9d62b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "67bfb477e300525c95e231b95be9d62b");
            } else if (aVar != null && (cVar = a2.b.get(aVar)) != null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.expose.v2.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "7498372b202e76003e04d9c83f37a9f0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "7498372b202e76003e04d9c83f37a9f0");
                    return;
                }
                cVar.f.clear();
                cVar.g.clear();
                cVar.h.clear();
            }
        }
    }

    private void b(List<OasisModule> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ab722fb111e85a41c75b05331572ee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ab722fb111e85a41c75b05331572ee5");
            return;
        }
        a(list);
        if (this.u != null) {
            this.u.a();
        }
    }

    private void B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4c00292b9a47a68907e36ca96bc613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4c00292b9a47a68907e36ca96bc613");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("qw_type_id", this.d.g);
        hashMap.put("stid", this.d.e);
        hashMap.put("keyword", this.d.h);
        hashMap.put("label_word", this.d.l);
        hashMap.put("search_log_id", this.d.q);
        hashMap.put("template_type", Integer.valueOf(this.d.D));
        hashMap.put("picture_pattern", Integer.valueOf(this.d.D == 2 ? 1 : 0));
        hashMap.put("cat_id", Integer.valueOf(this.d.z));
        hashMap.put("is_filter_result", com.sankuai.waimai.store.search.statistics.g.b(this.d));
        hashMap.put("is_second_result", com.sankuai.waimai.store.search.statistics.g.a(this.d));
        hashMap.put("filter_type", com.sankuai.waimai.store.search.statistics.g.d(this.d));
        hashMap.put("rank_type", Long.valueOf(com.sankuai.waimai.store.search.statistics.g.c(this.d)));
        hashMap.put("search_source", Integer.valueOf(this.d.aw));
        hashMap.put("search_global_id", this.d.r);
        hashMap.put("suggest_global_id", this.d.v);
        hashMap.put("suggest_log_id", this.d.w);
        if (this.d.bg) {
            hashMap.put("if_med_poi", 0);
            hashMap.put("sec_cat_id", Integer.valueOf(this.d.C > 0 ? this.d.C : this.d.B));
        }
        if (this.d.av != 0) {
            if (this.d.av == 2 && this.d.be != null && TextUtils.equals(this.d.be.get("search_result_page_related_words_recommendation"), "EXP")) {
                this.d.av = 4;
            }
            hashMap.put("second_search_source", Integer.valueOf(this.d.av));
        }
        com.sankuai.waimai.store.manager.judas.b.b(this.F, "b_oLsKJ").a(hashMap).a();
        if (this.af != null) {
            this.af.a();
        }
    }

    public final String j() {
        return (this.aj == null || this.aj.globalSearchExtraInfo == null) ? "" : this.aj.globalSearchExtraInfo.searchLogId;
    }

    private void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a4e0bc0cef85f9c934f7a1ec0d87af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a4e0bc0cef85f9c934f7a1ec0d87af");
            return;
        }
        this.ad.a(this.d.bg);
        this.ad.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.9
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e76aca1f52cc7ee2c9f5016a2e628868", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e76aca1f52cc7ee2c9f5016a2e628868");
                    return;
                }
                ResultFragment.this.ad.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ResultFragment.this.ad.getLayoutParams();
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    ResultFragment.this.ad.setLayoutParams(marginLayoutParams);
                }
            }
        });
        this.x.scrollToPosition(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a86e2330771ad2cfd249ce1e79c29e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a86e2330771ad2cfd249ce1e79c29e");
            return;
        }
        this.w.setVisibility(0);
        this.I.setVisibility(8);
        this.J.setVisibility(8);
        if (this.v != null) {
            this.v.j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @com.meituan.android.bus.annotation.Subscribe(threadMode = com.meituan.android.bus.annotation.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFilterEvent(com.sankuai.waimai.store.search.data.f.c r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.search.ui.result.ResultFragment.onFilterEvent(com.sankuai.waimai.store.search.data.f$c):void");
    }

    private static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c20f9aff6b3120ba80f45d86fe50fb79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c20f9aff6b3120ba80f45d86fe50fb79");
        }
        if (obj == null) {
            return "";
        }
        try {
            String a2 = obj instanceof String ? (String) obj : i.a(obj);
            return a2 != null ? URLEncoder.encode(a2, "utf-8") : "";
        } catch (Exception e2) {
            com.sankuai.waimai.store.base.log.a.a(e2);
            return "";
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRedPointDisappearEvent(com.sankuai.waimai.store.search.ui.result.item.sortFilter.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1eb487c3c4d1478ee7a743735701d47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1eb487c3c4d1478ee7a743735701d47");
        } else if (this.q != null) {
            this.q.notifyDataSetChanged();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRemoveTagEvent(f.d dVar) {
        int childCount;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b489ecbbe973932f0aa53328c656840f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b489ecbbe973932f0aa53328c656840f");
        } else if (dVar != null && !TextUtils.isEmpty(dVar.a) && this.v != null) {
            com.sankuai.waimai.store.search.ui.actionbar.b bVar = this.v;
            String str = dVar.a;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.actionbar.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "44ebf4b8ce52eee7efac061794c2bca2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "44ebf4b8ce52eee7efac061794c2bca2");
            } else if (bVar.k != null && (childCount = bVar.k.getChildCount()) > 0) {
                for (int i = 0; i < childCount; i++) {
                    View childAt = bVar.k.getChildAt(i);
                    if (childAt != null && (childAt.getTag() instanceof GuidedItem)) {
                        GuidedItem guidedItem = (GuidedItem) childAt.getTag();
                        if (TextUtils.equals(str, guidedItem.code)) {
                            bVar.a(childAt, guidedItem);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCardMoreClick(f.a aVar) {
        boolean z;
        OasisModule oasisModule;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dbe656ff16f5b5f3ba36e97107c05d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dbe656ff16f5b5f3ba36e97107c05d8");
        } else if (aVar == null) {
        } else {
            CardInfo cardInfo = null;
            if (aVar.a == 5 && this.aK != null) {
                cardInfo = this.aK;
            } else if (aVar.a == 6 && this.aL != null) {
                cardInfo = this.aL;
            }
            if (cardInfo != null) {
                boolean canShowMore = cardInfo.canShowMore();
                cardInfo.onMoreClick(this.s, aVar.b, this.d);
                if (!canShowMore) {
                    int i = aVar.a;
                    int i2 = aVar.b;
                    Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = e;
                    if (!PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c22c597bd6162f0c4e6ca3ffcdca2063", RobustBitConfig.DEFAULT_VALUE)) {
                        while (true) {
                            if (i2 < 0) {
                                break;
                            }
                            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect3 = e;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a165b235c24626311f87f5ac0fd9e84", RobustBitConfig.DEFAULT_VALUE)) {
                                z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a165b235c24626311f87f5ac0fd9e84")).booleanValue();
                            } else {
                                if (i2 >= 0 && i2 < this.s.size() && (oasisModule = this.s.get(i2)) != null) {
                                    Serializable serializable = oasisModule.data;
                                    if ((serializable instanceof CardTitle) && ((CardTitle) serializable).type == i) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                RecyclerView.LayoutManager layoutManager = this.x.getLayoutManager();
                                if (i2 < p.b(layoutManager)) {
                                    int currentStickyHeaderHeight = this.ad.getCurrentStickyHeaderHeight();
                                    if (layoutManager instanceof GridLayoutManager) {
                                        if (i == 5 && this.ay > 0) {
                                            this.ac = this.ay;
                                        } else if (i == 6 && this.az > 0) {
                                            this.ac = this.az;
                                        }
                                        if (layoutManager instanceof StaggeredGridLayoutManager) {
                                            ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i2, currentStickyHeaderHeight);
                                        }
                                    }
                                }
                            } else {
                                i2--;
                            }
                        }
                    } else {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c22c597bd6162f0c4e6ca3ffcdca2063");
                    }
                }
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "efcbb13017bb890c11204f4f3f9c0a31", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "efcbb13017bb890c11204f4f3f9c0a31");
                } else {
                    this.ad.b = -1;
                }
                this.q.notifyDataSetChanged();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onScrollToIndex(f.e eVar) {
        int i;
        int i2;
        boolean z = false;
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9d09ea78aec411b4d365124d056b347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9d09ea78aec411b4d365124d056b347");
        } else if (eVar != null) {
            final int i3 = eVar.a;
            final Runnable runnable = eVar.b;
            Object[] objArr2 = {Integer.valueOf(i3), runnable};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5586016b3a6b07c84933407b2ce38953", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5586016b3a6b07c84933407b2ce38953");
                return;
            }
            View findViewByPosition = this.x.getLayoutManager().findViewByPosition(i3);
            if (findViewByPosition == null || findViewByPosition.getTop() <= 0) {
                if (findViewByPosition != null && Math.abs(findViewByPosition.getTop()) <= findViewByPosition.getHeight() && (this.x.getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                    ((StaggeredGridLayoutManager) this.x.getLayoutManager()).scrollToPositionWithOffset(i3, 0);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            }
            int top = findViewByPosition.getTop();
            int i4 = 0;
            for (int i5 = 0; i5 < this.x.getChildCount(); i5++) {
                View childAt = this.x.getChildAt(i5);
                RecyclerView.g gVar = (RecyclerView.g) childAt.getLayoutParams();
                i4 += childAt.getHeight() + gVar.topMargin + gVar.bottomMargin;
            }
            if (i4 - this.x.getHeight() >= top) {
                i = i4;
            } else {
                int itemCount = this.q.getItemCount();
                int i6 = i4;
                int a2 = p.a(this.y) + 1;
                while (true) {
                    if (a2 >= itemCount) {
                        i = i6;
                        z = true;
                        break;
                    }
                    RecyclerView.s createViewHolder = this.q.createViewHolder(this.x, this.q.getItemViewType(a2));
                    if (createViewHolder != null && createViewHolder.itemView != null) {
                        this.q.bindViewHolder(createViewHolder, a2);
                        try {
                            this.y.measureChildWithMargins(createViewHolder.itemView, 0, 0);
                            i2 = createViewHolder.itemView.getMeasuredHeight();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            i2 = 0;
                        }
                        i = i2 + i6;
                        if (i - this.x.getHeight() > top) {
                            break;
                        }
                        i6 = i;
                    }
                    a2++;
                }
            }
            ViewGroup.LayoutParams layoutParams = this.W.getLayoutParams();
            if (z) {
                layoutParams.height = ((layoutParams.height + top) - (i - this.x.getHeight())) + 1000;
            }
            this.W.setLayoutParams(layoutParams);
            this.x.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.6
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "623bdccf1ea389907f71e937dfdfa051", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "623bdccf1ea389907f71e937dfdfa051");
                        return;
                    }
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (ResultFragment.this.x.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                        ((StaggeredGridLayoutManager) ResultFragment.this.x.getLayoutManager()).scrollToPositionWithOffset(i3, 0);
                    }
                }
            });
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onScrollToShowUseDrugIm(f.C1297f c1297f) {
        Object[] objArr = {c1297f};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d706422ca290ed7787c88be9a5dae24c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d706422ca290ed7787c88be9a5dae24c");
        } else if (c1297f == null) {
        } else {
            int a2 = p.a(this.x.getLayoutManager());
            if (this.l) {
                this.R.a(false, a2);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSearchKey(f.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20efe9490416f6629d40e4f0e5b7623e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20efe9490416f6629d40e4f0e5b7623e");
        } else if (gVar == null || TextUtils.isEmpty(gVar.a) || this.v == null) {
        } else {
            this.v.e();
            com.sankuai.waimai.store.search.ui.actionbar.b bVar = this.v;
            String str = gVar.a;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.actionbar.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "8b79262c04670d5523f42d91c22c382c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "8b79262c04670d5523f42d91c22c382c");
                return;
            }
            if (bVar.d != null) {
                bVar.d.setText(str);
            }
            if (bVar.i != null) {
                bVar.i.a("11002");
                bVar.i.a(false, "from_no_result_hot_label", 0);
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onCommonSearch(f.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d97ad1cf28d47fc74696940c6df95f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d97ad1cf28d47fc74696940c6df95f7");
        } else if (bVar == null) {
        } else {
            if (bVar.h) {
                this.i = 0;
            }
            if (bVar.i) {
                this.m = bVar.g;
            }
            a(bVar.b, bVar.c, bVar.d != null ? bVar.d : this.h, bVar.e, bVar.f, bVar.g < 0 ? this.m : bVar.g);
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7fa2b03fe2fb0a64cbf0ac0a3ec14b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7fa2b03fe2fb0a64cbf0ac0a3ec14b9");
            return;
        }
        com.sankuai.waimai.store.fsp.a.a().a(getActivity(), "FirstBatchDataDeserializeComplete");
        this.ag = false;
    }

    @Override // com.sankuai.waimai.store.search.ui.result.c.b
    public final void a(List<OasisModule> list, int i) {
        long currentTimeMillis;
        boolean z = true;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82829f11f076bfe79e4636b8dd843b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82829f11f076bfe79e4636b8dd843b62");
            return;
        }
        if (i == 1) {
            com.sankuai.waimai.store.fsp.a.a().a(getActivity(), "onDeserializeTemplateDataComplete");
        }
        if (this.d != null && this.d.aX != null) {
            if (this.d.bf == 1) {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(this.d.aX.recordStep("drug_deserialize_complete"));
            } else {
                com.sankuai.meituan.takeoutnew.util.aop.h.a(this.d.aX.recordStep("sg_deserialize_complete"));
            }
            this.d.aX = null;
        }
        if (this.ag && this.d.ay && this.d.aA) {
            this.d.aA = false;
            com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.MachPreRenderEnd, "", this.d.az);
        }
        if (this.ag && this.d.aD && this.d.aF) {
            this.d.aF = false;
            com.sankuai.waimai.store.util.monitor.c.a(SearchMachMonitor.NativeProcessEnd, "", this.d.aE);
        }
        if (this.ag) {
            D();
            final com.sankuai.waimai.store.search.common.view.c cVar = this.L;
            boolean z2 = this.d.bg;
            String bH_ = bH_();
            Object[] objArr2 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0), bH_};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.common.view.c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "f4f1571abbb913c6bb1c42af631a3018", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "f4f1571abbb913c6bb1c42af631a3018");
            } else if (cVar.c <= 0) {
                cVar.a();
            } else if (cVar.b == null) {
                cVar.a();
            } else {
                if (z2) {
                    currentTimeMillis = System.currentTimeMillis() - cVar.c;
                } else {
                    currentTimeMillis = System.currentTimeMillis() - cVar.d;
                }
                if (currentTimeMillis >= cVar.b.mLoadingTime) {
                    cVar.a();
                } else {
                    cVar.mView.setOnClickListener(new c.a());
                    al.a(new Runnable() { // from class: com.sankuai.waimai.store.search.common.view.c.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2d56e2e9427ca496850690bc78fdc69c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2d56e2e9427ca496850690bc78fdc69c");
                            } else {
                                cVar.a();
                            }
                        }
                    }, (int) (cVar.b.mLoadingTime - currentTimeMillis), bH_);
                }
            }
        }
        if (this.ag && list.size() == 0) {
            if (this.d.bg) {
                com.sankuai.waimai.store.util.monitor.b.a().a(new MEDSearchResultMonitor("MEDSearchResultRenderFail")).a(DataConstants.CATEGORY_ID, String.valueOf(this.d.z)).a("error_type", "4").a();
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0b671db8c486aea7812912a3d1a365e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0b671db8c486aea7812912a3d1a365e");
                return;
            }
            b(getResources().getString(R.string.wm_sc_nox_search_no_result));
            m();
        } else if (!this.ag && list.size() == 0) {
            s();
        } else {
            this.x.setVisibility(0);
            this.M.setVisibility(8);
            if (this.ag) {
                C();
                a(this.s);
                b(this.t);
                Object[] objArr4 = {list};
                ChangeQuickRedirect changeQuickRedirect4 = e;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b4916a0dce54104597bd78b3f61e0589", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b4916a0dce54104597bd78b3f61e0589");
                } else {
                    this.aJ = null;
                    F();
                    if (list != null && list.get(0) != null) {
                        OasisModule oasisModule = list.get(0);
                        if (TextUtils.equals(oasisModule.nativeTemplateId, "wm_shangou_search_hot_label_rank")) {
                            this.aq = true;
                            E();
                        } else if (TextUtils.equals(oasisModule.nativeTemplateId, "sg_brand_sale_business_direct")) {
                            this.ar = true;
                            this.aJ = com.sankuai.waimai.store.search.model.g.a(oasisModule.stringData);
                            E();
                        } else {
                            this.aq = false;
                            this.ar = false;
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = e;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "beab7d4aaf80b482781d6b8bae95c774", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "beab7d4aaf80b482781d6b8bae95c774");
                            } else {
                                this.as.setAlpha(1.0f);
                                this.av.setAlpha(0.0f);
                                this.v.c(false);
                                this.v.d(false);
                                this.aI = false;
                                this.aH = -1;
                                this.aG = -1;
                                d(false);
                                a(false, "");
                            }
                        }
                    }
                }
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = e;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "885b899422a7b3e17b3cd53c47d468e0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "885b899422a7b3e17b3cd53c47d468e0");
                } else if (this.v != null) {
                    this.v.h();
                }
                if (i == 1) {
                    com.sankuai.waimai.store.fsp.a.a().a(getActivity(), "before_process_data");
                }
                a(list, true);
                if (i == 1) {
                    com.sankuai.waimai.store.fsp.a.a().a(getActivity(), "end_process_data");
                }
                this.q.a(this.k);
                this.q.a();
                this.q.notifyDataSetChanged();
                if (i == 1) {
                    com.sankuai.waimai.store.fsp.a.a().a(getActivity(), "notifyDataSetChanged");
                }
                if (this.d.n() && this.u != null) {
                    final com.sankuai.waimai.store.search.ui.result.nestedheader.a aVar = this.u;
                    g gVar = this.g;
                    Object[] objArr7 = {gVar};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.search.ui.result.nestedheader.a.a;
                    if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "32087899b4dad9fb280240cf189d0e6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "32087899b4dad9fb280240cf189d0e6b");
                    } else {
                        aVar.c.a(true, false, true);
                        Object[] objArr8 = {gVar};
                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.search.ui.result.nestedheader.a.a;
                        if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "4b7e6864b40503f589256e5f19aabb9b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "4b7e6864b40503f589256e5f19aabb9b");
                        } else if (!gVar.f && !gVar.e) {
                            if (aVar.f != null || aVar.g != null) {
                                aVar.d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.search.ui.result.nestedheader.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                    public final void onGlobalLayout() {
                                        Object[] objArr9 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "501da579f8158466acbb65f86f8bb1f0", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "501da579f8158466acbb65f86f8bb1f0");
                                            return;
                                        }
                                        aVar.d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                        int height = aVar.f != null ? aVar.f.getHeight() + 0 : 0;
                                        if (aVar.g != null) {
                                            height += aVar.g.getHeight();
                                        }
                                        a aVar2 = aVar;
                                        AppBarLayout appBarLayout = aVar.d;
                                        int i2 = -height;
                                        Object[] objArr10 = {appBarLayout, Integer.valueOf(i2)};
                                        ChangeQuickRedirect changeQuickRedirect10 = a.a;
                                        if (PatchProxy.isSupport(objArr10, aVar2, changeQuickRedirect10, false, "c050b714d46524a9d8f607b06a501a54", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, aVar2, changeQuickRedirect10, false, "c050b714d46524a9d8f607b06a501a54");
                                            return;
                                        }
                                        CoordinatorLayout.a aVar3 = ((CoordinatorLayout.c) appBarLayout.getLayoutParams()).a;
                                        if (aVar3 instanceof AppBarLayout.Behavior) {
                                            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) aVar3;
                                            if (behavior.b() != i2) {
                                                behavior.a(i2);
                                            }
                                        }
                                    }
                                });
                            } else {
                                aVar.d.a(true, false, true);
                            }
                        } else {
                            aVar.d.a(true, false, true);
                        }
                    }
                }
                StatisticsRecyclerView statisticsRecyclerView = this.x;
                Object[] objArr9 = {statisticsRecyclerView};
                ChangeQuickRedirect changeQuickRedirect9 = e;
                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e5ef489a7138dc64ceb1780faaf5c53f", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e5ef489a7138dc64ceb1780faaf5c53f")).booleanValue();
                } else if (statisticsRecyclerView.getScrollState() != 0 || statisticsRecyclerView.isComputingLayout()) {
                    z = false;
                }
                if (z) {
                    this.x.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.10
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = a;
                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "6e8bf06e12c03f212adbc4f28a66288c", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "6e8bf06e12c03f212adbc4f28a66288c");
                                return;
                            }
                            ResultFragment.ac(ResultFragment.this);
                            StickyContainerFrameLayout stickyContainerFrameLayout = ResultFragment.this.ad;
                            StatisticsRecyclerView statisticsRecyclerView2 = ResultFragment.this.x;
                            Object[] objArr11 = {statisticsRecyclerView2};
                            ChangeQuickRedirect changeQuickRedirect11 = StickyContainerFrameLayout.a;
                            if (PatchProxy.isSupport(objArr11, stickyContainerFrameLayout, changeQuickRedirect11, false, "6a59b78e4e2f13d6cdf50b2d9a80b3af", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, stickyContainerFrameLayout, changeQuickRedirect11, false, "6a59b78e4e2f13d6cdf50b2d9a80b3af");
                            } else {
                                stickyContainerFrameLayout.a(statisticsRecyclerView2.getLayoutManager(), 0, p.a(statisticsRecyclerView2.getLayoutManager()));
                            }
                            ResultFragment.d(ResultFragment.this, 1);
                        }
                    });
                }
                this.ac = 0;
                this.ay = -2;
                this.az = -2;
                Object[] objArr10 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect10 = e;
                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "ae61dac4f445d7585c50c36ab83641f6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "ae61dac4f445d7585c50c36ab83641f6");
                } else {
                    this.x.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.11
                        public static ChangeQuickRedirect a;

                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            View childAt;
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = a;
                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "679c08a89d21817ac993f98a420be417", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "679c08a89d21817ac993f98a420be417");
                                return;
                            }
                            ResultFragment.this.x.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            if (ResultFragment.this.aq || ResultFragment.this.ar) {
                                if (!ResultFragment.this.d.n()) {
                                    childAt = ResultFragment.this.x.getChildAt(0);
                                } else {
                                    AppBarLayout appBarLayout = ResultFragment.this.u.d;
                                    if (appBarLayout == null) {
                                        return;
                                    }
                                    childAt = appBarLayout.getChildAt(0);
                                }
                                if (childAt != null) {
                                    ResultFragment.this.aw = childAt.getHeight() + ResultFragment.this.ax;
                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ResultFragment.this.av.getLayoutParams();
                                    layoutParams.width = -1;
                                    layoutParams.height = ResultFragment.this.aw;
                                    ResultFragment.this.av.setLayoutParams(layoutParams);
                                    com.sankuai.waimai.store.util.monitor.c.a(GlobalSearch.Normal);
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("key_word", ResultFragment.this.h);
                                com.sankuai.waimai.store.util.monitor.c.a(GlobalSearch.NullView, i.a(hashMap), "null view from HotRank");
                            }
                        }
                    });
                }
            } else {
                int size = this.s.size();
                a(list, false);
                this.q.a(this.k);
                this.q.a();
                this.q.notifyItemRangeInserted(size, list.size());
            }
            if (this.j) {
                w();
            } else {
                s();
            }
            if (this.aB != -1) {
                com.sankuai.waimai.store.manager.judas.b.b(getActivity(), "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.aB)).a();
                this.aB = -1L;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void a(List<OasisModule> list, boolean z) {
        int i;
        char c;
        boolean z2;
        Object[] objArr = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "319e9907d7d74622f0c28c5271a78069", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "319e9907d7d74622f0c28c5271a78069");
            return;
        }
        while (i < list.size()) {
            OasisModule oasisModule = list.get(i);
            Context context = getContext();
            if (context == null || this.F == null || !(context instanceof FragmentActivity)) {
                return;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.isFinishing() || fragmentActivity.getSupportFragmentManager() == null || fragmentActivity.getSupportFragmentManager().isDestroyed()) {
                return;
            }
            if (z && this.d.n()) {
                com.sankuai.waimai.store.search.ui.result.nestedheader.a aVar = this.u;
                List<OasisModule> list2 = this.t;
                int size = list.size();
                Object[] objArr2 = {oasisModule, Integer.valueOf(i), list2, Integer.valueOf(size)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.search.ui.result.nestedheader.a.a;
                if (!PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "3b5316294c8b0d8084e107d8a0115b30", RobustBitConfig.DEFAULT_VALUE)) {
                    String str = oasisModule.templateType == 0 ? oasisModule.nativeTemplateId : oasisModule.machTemplateId;
                    switch (str.hashCode()) {
                        case -1738796460:
                            if (str.equals("supermarket-search-drop-down-filter")) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1734817017:
                            if (str.equals("supermarket-search-second-search-banner")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1025062855:
                            if (str.equals("new_wm_search_direct_card")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -598256541:
                            if (str.equals("wm_shangou_search_hot_label_rank")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -207609641:
                            if (str.equals("waimai-search-business-aladdin-brand-carousel")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -129924081:
                            if (str.equals("wm_shangou_search_nonlbs_service_card")) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case 449893063:
                            if (str.equals("wm_shangou_card_more")) {
                                c = 17;
                                break;
                            }
                            c = 65535;
                            break;
                        case 466913459:
                            if (str.equals("wm_shangou_search_sort_filter_bar")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 837498835:
                            if (str.equals("sg_brand_sale_business_direct")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 983950091:
                            if (str.equals("sg_search_double_card_business_directcard")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 997783632:
                            if (str.equals("waimai-search-business-direct-style-1")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 997783633:
                            if (str.equals("waimai-search-business-direct-style-2")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 997783634:
                            if (str.equals("waimai-search-business-direct-style-3")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 1017073630:
                            if (str.equals("supermarket-search-second-text-search")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1068071206:
                            if (str.equals("wm_shangou_card_title")) {
                                c = 16;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1171410605:
                            if (str.equals("wm_shangou_search_nondelivery_paotui_card")) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1349218140:
                            if (str.equals("sg_search_carousel_card_business_directcard")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1723055698:
                            if (str.equals("supermarket-search-second-search")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                        case 1:
                            aVar.g = aVar.a(0, oasisModule, 1);
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            aVar.f = aVar.a(0, oasisModule, 1);
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        case '\t':
                            aVar.a(0, oasisModule, 3).setMinimumHeight(com.sankuai.waimai.foundation.utils.g.a(aVar.b, 37.0f));
                            aVar.h = true;
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        case '\n':
                            View a2 = aVar.a(2, oasisModule, 0);
                            aVar.e = a2;
                            CoordinatorLayout.c cVar = (CoordinatorLayout.c) a2.getLayoutParams();
                            cVar.a(new DropDownBehavior());
                            a2.setLayoutParams(cVar);
                            a2.setY(-com.sankuai.waimai.foundation.utils.g.a(aVar.b, 37.0f));
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        case 11:
                            aVar.a(0, oasisModule, 0);
                            aVar.h = true;
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        case '\f':
                        case '\r':
                            if (aVar.h) {
                                aVar.a(1, oasisModule, 5);
                            } else {
                                aVar.a(1, oasisModule, 0);
                            }
                            list2.add(oasisModule);
                            z2 = true;
                            break;
                        default:
                            if (aVar.f == null && i == 0 && size > 3) {
                                aVar.f = aVar.a(0, oasisModule, 1);
                                list2.add(oasisModule);
                                z2 = true;
                                break;
                            }
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                            z2 = false;
                            break;
                    }
                } else {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "3b5316294c8b0d8084e107d8a0115b30")).booleanValue();
                }
                i = z2 ? i + 1 : 0;
            }
            if (oasisModule.data instanceof CardInfo) {
                CardInfo cardInfo = (CardInfo) oasisModule.data;
                cardInfo.init(this.s, this.d.D, oasisModule.nativeTemplateId, this.d, j());
                if (oasisModule.nativeTemplateId.equals("wm_shangou_search_nondelivery_paotui_card")) {
                    this.aK = cardInfo;
                } else if (oasisModule.nativeTemplateId.equals("wm_shangou_search_nonlbs_service_card")) {
                    this.aL = cardInfo;
                }
            } else {
                this.s.add(oasisModule);
            }
        }
    }

    @Override // com.sankuai.waimai.store.i.locate.b
    public final void a(WMLocation wMLocation, String str, boolean z) {
        Object[] objArr = {wMLocation, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9fb6d03260335206ce6273f04dfc8d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9fb6d03260335206ce6273f04dfc8d1");
        } else if (com.sankuai.waimai.store.locate.a.g()) {
            if (this.ao != null) {
                this.ao.a();
            }
            a(this.h, 13, this.d.n, 0);
        }
    }

    @Override // com.sankuai.waimai.store.search.ui.result.a
    public final boolean bf_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8990a91faf9f164a697c2d447b097e5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8990a91faf9f164a697c2d447b097e5")).booleanValue() : (this.al == null || this.al.g()) ? false : true;
    }

    @Override // com.sankuai.waimai.store.poi.subscribe.e
    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4dad133106ca5a364a3fbc94537409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4dad133106ca5a364a3fbc94537409");
        } else if (this.q != null) {
            this.q.a(j, i);
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8536ca7ce4cf31f3f4b99a048c92e50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8536ca7ce4cf31f3f4b99a048c92e50b");
            return;
        }
        boolean z2 = !z ? 1 : 0;
        if (getActivity() != null) {
            if (this.aG < 0) {
                this.aG = z2 ? 1 : 2;
                com.sankuai.waimai.platform.capacity.immersed.a.b(getActivity(), z2);
                return;
            }
            int i = z2 ? 1 : 2;
            if (i != this.aG) {
                this.aG = i;
                com.sankuai.waimai.platform.capacity.immersed.a.b(getActivity(), z2);
            }
        }
    }

    private void a(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ef162ce8ec8480649be6dbf9bc85a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ef162ce8ec8480649be6dbf9bc85a5");
        } else if (z && !TextUtils.isEmpty(str)) {
            if (this.aH != 2) {
                this.aH = 2;
                this.v.b(com.sankuai.shangou.stone.util.d.a(str, com.sankuai.shangou.stone.util.d.a("#FFCC33").intValue()));
            }
        } else if (this.aH != 1) {
            this.aH = 1;
            this.v.b(com.sankuai.shangou.stone.util.d.a("#FFCC33").intValue());
        }
    }

    private void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd09d9c7befc729390025de0bc2d7172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd09d9c7befc729390025de0bc2d7172");
            return;
        }
        this.as.setAlpha(0.0f);
        this.av.setAlpha(0.0f);
        if (getActivity() != null && getActivity().getResources() != null) {
            this.ax = (int) getActivity().getResources().getDimension(R.dimen.wm_sc_common_dimen_89);
        }
        if (this.aq || TextUtils.equals(this.aJ.e, "1")) {
            this.v.c(true);
        }
        if (this.aq || TextUtils.equals(this.aJ.p, "1")) {
            this.v.d(true);
        }
        if (this.aq || TextUtils.equals(this.aJ.l, "1")) {
            this.aI = true;
            d(true);
        }
        if (!this.ar || TextUtils.isEmpty(this.aJ.c)) {
            return;
        }
        a(true, this.aJ.c);
    }

    private void F() {
        this.aI = false;
        this.aH = -1;
        this.aG = -1;
    }

    @Override // com.sankuai.waimai.foundation.core.base.fragment.BaseFragment, android.support.v4.app.Fragment
    public void onHiddenChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2d6d4b749245ddc2618a665a74e0b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2d6d4b749245ddc2618a665a74e0b5");
            return;
        }
        super.onHiddenChanged(z);
        if (this.aq || this.ar) {
            if (z) {
                this.v.c(false);
                this.v.d(false);
                d(false);
                this.v.b(com.sankuai.shangou.stone.util.d.a("#FFCC33").intValue());
                return;
            }
            if (this.aq || TextUtils.equals(this.aJ.e, "1")) {
                this.v.c(true);
            }
            if (this.aq || TextUtils.equals(this.aJ.p, "1")) {
                this.v.d(true);
            }
            if (this.aq || TextUtils.equals(this.aJ.l, "1")) {
                this.aI = true;
                d(true);
            }
            if (!this.ar || TextUtils.isEmpty(this.aJ.c)) {
                return;
            }
            a(true, this.aJ.c);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends BroadcastReceiver {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int a2;
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad3cf1db1cedeebca1affaf8b8437710", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad3cf1db1cedeebca1affaf8b8437710");
                return;
            }
            String a3 = com.sankuai.waimai.platform.utils.f.a(intent, "data");
            if (TextUtils.isEmpty(a3)) {
                return;
            }
            Map<String, Object> a4 = com.sankuai.waimai.mach.utils.b.a(a3);
            String valueOf = String.valueOf(a4.get(Constants.Environment.KEY_UNION_ID));
            String valueOf2 = String.valueOf(a4.get("survey_id"));
            if (!TextUtils.isEmpty(valueOf) && (a2 = ResultFragment.a(ResultFragment.this, ResultFragment.this.s, valueOf)) != -1) {
                ResultFragment.this.q.notifyItemChanged(a2);
            }
            if (TextUtils.isEmpty(valueOf2)) {
                return;
            }
            SearchMachQaSp.a(System.currentTimeMillis());
            SearchMachQaSp.a(valueOf2);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a implements b.a {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {ResultFragment.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa47f1483e56fcd65ccf9861799c252b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa47f1483e56fcd65ccf9861799c252b");
            }
        }

        @Override // com.sankuai.waimai.store.search.ui.result.mach.b.a
        public final void a(com.sankuai.waimai.mach.recycler.c cVar) {
            final Pair pair;
            int i = 0;
            Object[] objArr = {cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9824bcba5ab19fe8a715feab5d7e7760", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9824bcba5ab19fe8a715feab5d7e7760");
            } else if (cVar == null) {
            } else {
                ResultFragment resultFragment = ResultFragment.this;
                List list = ResultFragment.this.s;
                Object[] objArr2 = {list, cVar};
                ChangeQuickRedirect changeQuickRedirect2 = ResultFragment.e;
                if (!PatchProxy.isSupport(objArr2, resultFragment, changeQuickRedirect2, false, "60da9af8bdef9c5a94375c30e17765e3", RobustBitConfig.DEFAULT_VALUE)) {
                    while (true) {
                        if (i >= list.size()) {
                            pair = null;
                            break;
                        }
                        OasisModule oasisModule = (OasisModule) list.get(i);
                        if (oasisModule != null && oasisModule.data != null && (oasisModule.data instanceof CommonMachData) && ((CommonMachData) oasisModule.data) != null && ((CommonMachData) oasisModule.data).mItem == cVar) {
                            pair = new Pair(Integer.valueOf(i), (CommonMachData) oasisModule.data);
                            break;
                        }
                        i++;
                    }
                } else {
                    pair = (Pair) PatchProxy.accessDispatch(objArr2, resultFragment, changeQuickRedirect2, false, "60da9af8bdef9c5a94375c30e17765e3");
                }
                ResultFragment.this.x.setItemAnimator(null);
                if (pair == null) {
                    return;
                }
                if (ResultFragment.this.x.isComputingLayout()) {
                    if (ResultFragment.this.d.aV == 1) {
                        ResultFragment.this.x.post(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.a.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e388d7d0e0735a7e654c49814d58384", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e388d7d0e0735a7e654c49814d58384");
                                } else {
                                    ResultFragment.this.q.notifyItemChanged(((Integer) pair.first).intValue(), pair.second);
                                }
                            }
                        });
                        return;
                    } else if (ResultFragment.this.d.aV == 2) {
                        ResultFragment.this.aC.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.search.ui.result.ResultFragment.a.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "57d7ebd4d45af9664c99f387a18b27d9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "57d7ebd4d45af9664c99f387a18b27d9");
                                } else {
                                    ResultFragment.this.q.notifyItemChanged(((Integer) pair.first).intValue(), pair.second);
                                }
                            }
                        }, 100L);
                        return;
                    } else {
                        return;
                    }
                }
                ResultFragment.this.q.notifyItemChanged(((Integer) pair.first).intValue(), pair.second);
            }
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f70d8dccf4660ba5ddebd271ee65100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f70d8dccf4660ba5ddebd271ee65100");
        } else if (this.d == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("stid", "");
            hashMap.put("cat_id", Integer.valueOf(this.d.z));
            hashMap.put("keyword", this.d.h);
            hashMap.put("sec_cat_id", Integer.valueOf(this.d.C > 0 ? this.d.C : this.d.B));
            hashMap.put("type", Integer.valueOf(i));
            com.sankuai.waimai.store.manager.judas.b.b(this.F, "b_waimai_med_noresult_mv").b(hashMap).a();
        }
    }

    private void b(boolean z, String str, boolean z2, int i, boolean z3, String str2, String str3, int i2, String str4, int i3, long j) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, str3, Integer.valueOf(i2), str4, Integer.valueOf(i3), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dd0a94be043f048058a42814c7887f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dd0a94be043f048058a42814c7887f1");
            return;
        }
        Activity activity = this.F;
        boolean z4 = activity instanceof BaseActivity;
        if (z4 && this.d.F) {
            ((BaseActivity) activity).s().recordStep("mach_trace");
        }
        if (this.d != null && this.d.aX != null) {
            this.d.aX.recordStep("mach_trace");
        }
        com.sankuai.waimai.platform.mach.monitor.b.a().e();
        if (z4 && this.d.F) {
            ((BaseActivity) activity).s().recordStep("request_start");
        }
        if (this.d != null && this.d.aX != null) {
            this.d.aX.recordStep("request_start");
        }
        this.d.x = -1;
        MetricsSpeedMeterTask createPageSpeedMeterTask = MetricsSpeedMeterTask.createPageSpeedMeterTask(this);
        createPageSpeedMeterTask.recordStep("request_start");
        this.f.a(str, i, this.i, z, z3, str2, str3, i2, this.ah, this.ai, z2, str4, createPageSpeedMeterTask, i3, j);
        if (z2) {
            return;
        }
        k();
    }
}
