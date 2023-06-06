package com.sankuai.waimai.business.page.home.actionbar;

import android.animation.ArgbEvaluator;
import android.app.Activity;
import android.arch.lifecycle.d;
import android.arch.lifecycle.k;
import android.arch.lifecycle.l;
import android.arch.lifecycle.q;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.Pair;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.xp.core.XPlayerConstants;
import com.sankuai.waimai.business.page.common.arch.PageFragment;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.HomePageViewModel;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.head.promotion.PromotionBgViewModel;
import com.sankuai.waimai.business.page.home.head.promotionbg.d;
import com.sankuai.waimai.business.page.home.head.promotionbg.e;
import com.sankuai.waimai.business.page.home.model.NavigationBarThemeBean;
import com.sankuai.waimai.business.page.home.view.TextSwitchView;
import com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.business.search.api.RollSearchKeyword;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.LocationUtils;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.widget.RayView;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.business.page.common.arch.a {
    public static ChangeQuickRedirect v;
    private View A;
    private RelativeLayout B;
    private LinearLayout C;
    private RelativeLayout D;
    private TextView E;
    private TextView F;
    private TextView G;
    private View H;
    private LinearLayout I;
    private int J;
    private TextSwitchView K;
    private RayView L;
    private FrameLayout M;
    private Button N;
    private int O;
    private int P;
    private float Q;
    private List<List<RecommendedSearchKeyword>> R;
    private RecommendedSearchKeyword S;
    private int T;
    private boolean U;
    private boolean V;
    private PageFragment W;
    private com.sankuai.waimai.business.page.home.weather.b X;
    private ArgbEvaluator Y;
    private HomeActionBarViewModel Z;
    private String aa;
    private final String ab;
    private com.sankuai.waimai.business.page.home.head.theme.a ac;
    private boolean ad;
    private String ae;
    private String af;
    private int ag;
    private int ah;
    private int ai;
    private float aj;
    private RefreshHeaderHelper ak;
    private boolean al;
    private com.sankuai.waimai.business.page.home.actionbar.market.a am;
    private View.OnClickListener an;
    private View.OnClickListener ao;
    public com.sankuai.waimai.business.page.home.im.a w;
    public com.sankuai.waimai.business.page.home.head.recommendwords.alita.a x;
    private final String y;
    private View z;

    public static /* synthetic */ void a(b bVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "d1e60578beaa744516ecb83172dda6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "d1e60578beaa744516ecb83172dda6eb");
        } else if (bVar.P != i) {
            bVar.P = i;
            bVar.Z.b = bVar.P;
        }
    }

    public static /* synthetic */ void a(b bVar, NavigationBarThemeBean navigationBarThemeBean) {
        GradientDrawable aVar;
        Object[] objArr = {navigationBarThemeBean};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "8992125aad14a18f61208a4252a546ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "8992125aad14a18f61208a4252a546ae");
            return;
        }
        com.sankuai.waimai.business.page.home.head.theme.a aVar2 = bVar.ac;
        boolean z = bVar.ad;
        Object[] objArr2 = {navigationBarThemeBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.head.theme.a.a;
        if (PatchProxy.isSupport(objArr2, aVar2, changeQuickRedirect2, false, "dd9cb341986f76782c37699c6ab4e9c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar2, changeQuickRedirect2, false, "dd9cb341986f76782c37699c6ab4e9c8");
        } else if (aVar2.e.getActivity() != null) {
            aVar2.d = z;
            int d = aVar2.f.d();
            if (com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) aVar2.e.getActivity())) {
                d += g.e(com.meituan.android.singleton.b.a);
            }
            if (z) {
                aVar2.b.setVisibility(0);
                if (navigationBarThemeBean != null && navigationBarThemeBean.navigationBarTheme != null && !TextUtils.isEmpty(navigationBarThemeBean.navigationBarTheme.b) && !TextUtils.isEmpty(navigationBarThemeBean.navigationBarTheme.c)) {
                    try {
                        ImageView imageView = aVar2.b;
                        int i = navigationBarThemeBean.navigationBarTheme.d;
                        String str = navigationBarThemeBean.navigationBarTheme.b;
                        String str2 = navigationBarThemeBean.navigationBarTheme.c;
                        Object[] objArr3 = {Integer.valueOf(i), str, str2};
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.head.theme.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "a670b78339c729f52311a776c904c2a3", RobustBitConfig.DEFAULT_VALUE)) {
                            aVar = (GradientDrawable) PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "a670b78339c729f52311a776c904c2a3");
                        } else {
                            aVar = new com.sankuai.waimai.business.page.home.widget.gradient.a(i == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(str), Color.parseColor(str2)}, 0.0f);
                        }
                        imageView.setBackground(aVar);
                    } catch (Exception unused) {
                    }
                } else {
                    aVar2.b.setBackgroundResource(R.drawable.wm_page_home_actionbar_new_style_bg);
                }
                aVar2.c = d;
            } else {
                aVar2.b.setVisibility(8);
                aVar2.c = d - g.a(com.meituan.android.singleton.b.a, 20.0f);
            }
            aVar2.a(aVar2.j);
            aVar2.a(-100, 0.0f);
        }
        bVar.a(bVar.B, bVar.Z.c());
        bVar.a(bVar.D, bVar.Z.b());
        if (navigationBarThemeBean != null && navigationBarThemeBean.navigationBarTheme != null) {
            bVar.ae = navigationBarThemeBean.navigationBarTheme.c;
            bVar.af = navigationBarThemeBean.navigationBarTheme.b;
            bVar.ag = navigationBarThemeBean.navigationBarTheme.e;
            bVar.ah = navigationBarThemeBean.navigationBarTheme.d;
            bVar.w.d = bVar.ag;
            bVar.X.z = bVar.ag;
            return;
        }
        bVar.ae = "";
        bVar.af = "";
        bVar.ag = 0;
        bVar.w.d = bVar.ag;
        bVar.X.z = bVar.ag;
    }

    public static /* synthetic */ void a(b bVar, RollSearchKeyword rollSearchKeyword, boolean z) {
        Object[] objArr = {rollSearchKeyword, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "530b15da32f6d64055e6182336317e1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "530b15da32f6d64055e6182336317e1b");
            return;
        }
        Object[] objArr2 = {rollSearchKeyword, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "273cdb87072fb7777b32d37beed8b0b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "273cdb87072fb7777b32d37beed8b0b3");
            return;
        }
        Object[] objArr3 = {rollSearchKeyword, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect3 = v;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "82052c825807348f8f0761e074102ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "82052c825807348f8f0761e074102ca9");
            return;
        }
        bVar.T = 0;
        bVar.U = z;
        bVar.aa = rollSearchKeyword.rcmdLogId == null ? "" : rollSearchKeyword.rcmdLogId;
        if (rollSearchKeyword == null) {
            bVar.S = null;
            bVar.U();
            return;
        }
        List<RecommendedSearchKeyword> list = rollSearchKeyword.rollKeywords;
        if (list == null || list.size() == 0) {
            bVar.S = null;
            bVar.U();
            return;
        }
        bVar.S = list.get(0);
        if (bVar.S != null) {
            bVar.S.tgt_stids = rollSearchKeyword.tgtStids;
            bVar.S.sceneType = rollSearchKeyword.sceneType;
        }
        bVar.Z.a(bVar.S);
        if (TextUtils.isEmpty(bVar.S.viewKeyword)) {
            bVar.U();
            return;
        }
        Object[] objArr4 = {rollSearchKeyword};
        ChangeQuickRedirect changeQuickRedirect4 = v;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "06455ee73eb96c16970063e41ef3ff97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "06455ee73eb96c16970063e41ef3ff97");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<RecommendedSearchKeyword> list2 = rollSearchKeyword.rollKeywords;
        int i = rollSearchKeyword.eachShowNum;
        String str = rollSearchKeyword.sceneType;
        String str2 = rollSearchKeyword.tgtStids;
        bVar.ai = rollSearchKeyword.searchClickStyle;
        bVar.R = new ArrayList();
        bVar.K.setInterval(rollSearchKeyword.showTimeInterval);
        bVar.K.post(new AnonymousClass5(list2, str, str2, i, arrayList));
    }

    public static /* synthetic */ void a(b bVar, String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "0b1ec6297d794202f7ddb1d1645437fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "0b1ec6297d794202f7ddb1d1645437fc");
        } else {
            bVar.E.setText(str);
        }
    }

    public static /* synthetic */ void b(b bVar, int i) {
        int a;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f55cad697dec32341c7e7d297de4a7d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f55cad697dec32341c7e7d297de4a7d5");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "66a9c1eecde22b196c9db64380e2b51c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "66a9c1eecde22b196c9db64380e2b51c");
            return;
        }
        int a2 = bVar.Z.a(i);
        if (bVar.O != a2) {
            bVar.O = a2;
            ViewGroup.LayoutParams layoutParams = bVar.B.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((View) bVar.A.getParent()).setY(Math.max(bVar.Z.b, 0));
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -a2;
                bVar.B.setLayoutParams(layoutParams);
            }
        }
        float b = bVar.Z.b(i);
        bVar.ac.a(i, b);
        if (bVar.Q != b) {
            bVar.Q = b;
            if (bVar.V || bVar.ad) {
                a = g.a(com.meituan.android.singleton.b.a, 7.0f);
                bVar.z.getBackground().mutate().setAlpha((int) (255.0f * b));
                if (bVar.I.getBackground() != null) {
                    ((GradientDrawable) bVar.I.getBackground()).setStroke(g.a(com.meituan.android.singleton.b.a, 1.0f), ((Integer) bVar.Y.evaluate(((double) b) > 0.95d ? 1.0f : b, -1, Integer.valueOf(Color.parseColor("#FED74D")))).intValue());
                }
                if (bVar.V && bVar.N.getVisibility() == 0) {
                    int i2 = (b > 0.95d ? 1 : (b == 0.95d ? 0 : -1));
                    ((GradientDrawable) bVar.N.getBackground()).setColor(((Integer) bVar.Y.evaluate(i2 > 0 ? 1.0f : b, Integer.valueOf(ColorUtils.a(bVar.P(), bVar.W.getActivity().getResources().getColor(R.color.wm_page_home_search_btn_default_bg))), Integer.valueOf(Color.parseColor("#FED74D")))).intValue());
                    if (d.a(com.meituan.android.singleton.b.a).a() == 2) {
                        bVar.N.setTextColor(((Integer) bVar.Y.evaluate(i2 > 0 ? 1.0f : b, -1, Integer.valueOf(Color.parseColor("#33312D")))).intValue());
                    }
                }
            } else {
                bVar.A.getBackground().mutate().setAlpha((int) ((1.0f - b) * 255.0f));
                a = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = bVar.I.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (int) (a + ((g.a(com.meituan.android.singleton.b.a, 7.0f) - a) * b));
            bVar.I.setLayoutParams(layoutParams2);
            float f = 1.0f - b;
            bVar.C.setAlpha(f);
            com.sankuai.waimai.business.page.home.weather.b bVar2 = bVar.X;
            Object[] objArr3 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.weather.b.v;
            if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "328840d5b2ea9356731c3631ac81d9a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "328840d5b2ea9356731c3631ac81d9a5");
            } else {
                bVar2.x.setAlpha(f);
                if (f == 0.0f) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.home.weather.b.v;
                    if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "fcab108015df5182a512ac7b438ecb8f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "fcab108015df5182a512ac7b438ecb8f");
                    } else {
                        Drawable drawable = bVar2.w.getDrawable();
                        if (drawable instanceof Animatable) {
                            ((Animatable) drawable).stop();
                        }
                    }
                } else {
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.home.weather.b.v;
                    if (PatchProxy.isSupport(objArr5, bVar2, changeQuickRedirect5, false, "062c11e84426db81e7d3702cb4d47a59", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, bVar2, changeQuickRedirect5, false, "062c11e84426db81e7d3702cb4d47a59");
                    } else {
                        Drawable drawable2 = bVar2.w.getDrawable();
                        if (drawable2 instanceof Animatable) {
                            ((Animatable) drawable2).start();
                        }
                    }
                }
            }
            com.sankuai.waimai.business.page.home.actionbar.market.a aVar = bVar.am;
            Object[] objArr6 = {Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.home.actionbar.market.a.v;
            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "9a79fedb9b63a8efa75989c309e9d828", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "9a79fedb9b63a8efa75989c309e9d828");
            } else if (aVar.w != null) {
                aVar.w.setAlpha(f);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static /* synthetic */ void b(b bVar, boolean z) {
        int parseColor;
        int i;
        ?? r1;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "04c6959ac3da4511617f9cdb5c356bc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "04c6959ac3da4511617f9cdb5c356bc2");
            return;
        }
        int a = d.a(com.meituan.android.singleton.b.a).a();
        if (z) {
            if (a != 2) {
                parseColor = Color.parseColor("#33312D");
                i = parseColor;
                r1 = 0;
            }
            r1 = 1;
            i = -1;
        } else {
            if (bVar.ag != 2) {
                parseColor = Color.parseColor("#33312D");
                i = parseColor;
                r1 = 0;
            }
            r1 = 1;
            i = -1;
        }
        PromotionBgViewModel promotionBgViewModel = (PromotionBgViewModel) q.a(bVar.W).a(PromotionBgViewModel.class);
        Object[] objArr2 = {Byte.valueOf((byte) r1)};
        ChangeQuickRedirect changeQuickRedirect2 = PromotionBgViewModel.a;
        if (PatchProxy.isSupport(objArr2, promotionBgViewModel, changeQuickRedirect2, false, "1cf4dfe31bb90c55dfff6483e6cf5c8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, promotionBgViewModel, changeQuickRedirect2, false, "1cf4dfe31bb90c55dfff6483e6cf5c8f");
        } else {
            promotionBgViewModel.f.b((k<Boolean>) Boolean.valueOf((boolean) r1));
        }
        bVar.E.setTextColor(i);
        bVar.N.setTextColor(i);
        TextView textView = bVar.F;
        int i2 = R.color.roo_default_color_gray_dim;
        com.meituan.roodesign.widgets.iconfont.b.a(textView, R.string.wm_c_iconfont_14dingwei, r1 != 0 ? R.color.roo_default_color_background : R.color.roo_default_color_gray_dim);
        TextView textView2 = bVar.G;
        if (r1 != 0) {
            i2 = R.color.roo_default_color_background;
        }
        com.meituan.roodesign.widgets.iconfont.b.a(textView2, R.string.wm_c_iconfont_arrow_right_small, i2);
        bVar.w.a(z, a);
        bVar.X.a(z);
    }

    public static /* synthetic */ void c(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "45d06ba7427fb38eed84c79fac53c31b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "45d06ba7427fb38eed84c79fac53c31b");
            return;
        }
        bVar.K.c();
        bVar.Z.d = true;
    }

    public static /* synthetic */ void d(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "2b51db11c47cbec9913cb6e710871641", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "2b51db11c47cbec9913cb6e710871641");
        } else if (bVar.K != null) {
            bVar.K.d();
        }
    }

    public static /* synthetic */ void e(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "613d6329cead9978f58bd694a0403072", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "613d6329cead9978f58bd694a0403072");
        } else if (bVar.X != null) {
            com.sankuai.waimai.business.page.home.weather.b bVar2 = bVar.X;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.home.weather.b.v;
            if (PatchProxy.isSupport(objArr2, bVar2, changeQuickRedirect2, false, "133530ceb1a9bed29079c6c69a351b22", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar2, changeQuickRedirect2, false, "133530ceb1a9bed29079c6c69a351b22");
            } else {
                LocalBroadcastManager.getInstance(bVar2.y.getActivity()).unregisterReceiver(bVar2.A);
            }
        }
    }

    public static /* synthetic */ void e(b bVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7c056117494d215d20498f4a348e080e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7c056117494d215d20498f4a348e080e");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("reportClickToStatistics", "1: " + bVar.U, new Object[0]);
        JudasManualManager.a(z ? "b_G73OZ" : "b_UDdde").a("c_m84bv26").a(bVar.W).b(bVar.a(true, z)).a();
        if (bVar.S == null || bVar.S.viewKeyword == null || !bVar.S.viewKeyword.equals(bVar.T())) {
            return;
        }
        JudasManualManager.a("b_Bq0iH").a("c_m84bv26").a(bVar.W).a();
    }

    public static /* synthetic */ void f(b bVar, boolean z) {
        boolean z2 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "ab01464cb22bc997e48105398eb4b605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "ab01464cb22bc997e48105398eb4b605");
        } else if (com.sankuai.waimai.foundation.location.g.e() == null) {
            ae.a((Activity) bVar.W.getActivity(), (int) R.string.wm_page_poiList_actionbar_search_unknown_location);
            WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
            if (k != null) {
                i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_jump_to_global_search").c(k.getAddress()).b());
            }
        } else {
            if (z && bVar.ai == 1) {
                z2 = true;
            }
            if (z2 && bVar.S != null && !TextUtils.isEmpty(bVar.S.scheme)) {
                if (bVar.Q()) {
                    com.sankuai.waimai.foundation.router.a.a(bVar.W.getActivity(), bVar.S.scheme);
                    return;
                }
                return;
            }
            com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-search");
            Bundle bundle = new Bundle();
            bundle.putInt("global_search_from", 1);
            bundle.putSerializable("recommended_search_keyword", bVar.S);
            if (bVar.R != null && bVar.R.size() != 0 && bVar.R.get(bVar.T) != null && bVar.R.get(bVar.T).size() == 2) {
                bundle.putSerializable("recommended_search_keywordroll_search_keyword", bVar.R.get(bVar.T).get(1));
            }
            bundle.putSerializable("search_entrance_style", Boolean.valueOf(bVar.Z.k));
            if (z2) {
                bundle.putBoolean("auto_search", true);
            }
            if (bVar.Q()) {
                HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(bVar.W).a(HomePageViewModel.class);
                bundle.putSerializable("recommended_search_word_list", com.sankuai.waimai.business.search.api.a.a(homePageViewModel.C.a(), homePageViewModel.D.a()));
                bundle.putInt("search_box_color", bVar.J);
                bundle.putString("rcmd_s_log_id", bVar.aa);
                bundle.putBoolean(RollSearchKeyword.IS_REQUEST_FRESH, bVar.al);
                bundle.putString(RollSearchKeyword.TRIGGER_POI_ID, bVar.Z.m);
                new com.sankuai.waimai.router.common.b(bVar.W.getActivity(), com.sankuai.waimai.foundation.router.interfaces.c.G).a(bundle).g();
                bVar.W.getActivity().overridePendingTransition(17432576, 17432577);
            }
        }
    }

    public b(PageFragment pageFragment, String str) {
        Object[] objArr = {pageFragment, str};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ecb7753586fc1fa794ed6441deeb94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ecb7753586fc1fa794ed6441deeb94");
            return;
        }
        this.J = 255;
        this.O = -1;
        this.P = -1;
        this.Q = -1.0f;
        this.T = 0;
        this.V = false;
        this.ab = com.sankuai.waimai.business.search.api.b.a(com.meituan.android.singleton.b.a);
        this.ag = 0;
        this.ah = 0;
        this.ai = 0;
        this.aj = -10000.0f;
        this.al = false;
        this.an = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.4
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "42239e76d971beb0f1a7a3501ca78f22", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "42239e76d971beb0f1a7a3501ca78f22");
                    return;
                }
                b.e(b.this, view.getId() == R.id.button_search);
                b.f(b.this, view.getId() == R.id.button_search);
                com.sankuai.waimai.mach.manager.load.c.a("waimai", "waimai-search");
            }
        };
        this.ao = new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.7
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f6cad0701fb8453aaa98be000707596", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f6cad0701fb8453aaa98be000707596");
                } else if (b.this.Z.d) {
                    HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(b.this.W).a(HomePageViewModel.class);
                    homePageViewModel.N = true;
                    if (com.sankuai.waimai.foundation.location.v2.g.a().p() == null) {
                        homePageViewModel.O = true;
                    } else {
                        homePageViewModel.O = false;
                    }
                    WmAddress k = com.sankuai.waimai.foundation.location.v2.g.a().k();
                    WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
                    String address = k != null ? k.getAddress() : "";
                    if (i != null) {
                        LocationUtils.TransformData a2 = LocationUtils.a(i.getLongitude(), i.getLatitude());
                        JudasManualManager.a("b_waimai_rwrrf4bo_mc").a("c_m84bv26").a(GearsLocator.ADDRESS, address).a("ji", a2.ji).a("jf", a2.jf).a("wi", a2.wi).a("wf", a2.wf).a(b.this.W).a();
                    }
                    b.this.Z.d = false;
                    if ((b.this.W instanceof HomePageFragment) && ((HomePageFragment) b.this.W).j != null && !((HomePageFragment) b.this.W).j.e) {
                        ((HomePageFragment) b.this.W).j.a();
                    }
                    b.this.Z.a(b.this.W.getActivity());
                }
            }
        };
        this.y = str;
        this.W = pageFragment;
        a(pageFragment);
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a
    public final void a(PageFragment pageFragment) {
        Object[] objArr = {pageFragment};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b647ae730f0cca6797a7c079f5e2e2bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b647ae730f0cca6797a7c079f5e2e2bd");
            return;
        }
        this.Z = (HomeActionBarViewModel) q.a(pageFragment).a(HomeActionBarViewModel.class);
        this.Z.e.a(pageFragment, new l<Pair<Integer, Integer>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.1
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<Integer, Integer> pair) {
                Pair<Integer, Integer> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1aaeadad1d804bbbb6a492fdaa02558", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1aaeadad1d804bbbb6a492fdaa02558");
                } else if (pair2 != null) {
                    b.a(b.this, pair2.second.intValue());
                }
            }
        });
        ((PromotionBgViewModel) q.a(this.W).a(PromotionBgViewModel.class)).e.a(this.W, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.8
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f99be854102af6a4d19eee467ce0f8e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f99be854102af6a4d19eee467ce0f8e1");
                    return;
                }
                b.this.a(bool2.booleanValue());
                b.b(b.this, bool2.booleanValue());
            }
        });
        this.Z.f.a(pageFragment, new l<Pair<RollSearchKeyword, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.9
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<RollSearchKeyword, Boolean> pair) {
                Pair<RollSearchKeyword, Boolean> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a81dad0e20012d5e5fad2973d8680da", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a81dad0e20012d5e5fad2973d8680da");
                } else if (pair2 != null) {
                    b.a(b.this, pair2.first, pair2.second.booleanValue());
                }
            }
        });
        this.Z.g.a(pageFragment, new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.10
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e84c1d606396d49943ca5085de250214", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e84c1d606396d49943ca5085de250214");
                } else {
                    b.this.al = bool2.booleanValue();
                }
            }
        });
        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(pageFragment).a(HomePageViewModel.class);
        homePageViewModel.b.a(this.W, new l<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.11
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable BaseResponse<String> baseResponse) {
                BaseResponse<String> baseResponse2 = baseResponse;
                Object[] objArr2 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d06802760b6324d0ab94c129de8829b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d06802760b6324d0ab94c129de8829b");
                } else if (baseResponse2 == null || baseResponse2.data == null) {
                } else {
                    NavigationBarThemeBean a2 = com.sankuai.waimai.business.page.home.helper.b.a().a(baseResponse2.data);
                    if (a2 == null || a2.navigationBarTheme == null) {
                        b.this.ad = false;
                    } else {
                        b.this.ad = a2.showWindowsStyle;
                    }
                    com.sankuai.waimai.business.page.home.helper.b.a().c = b.this.ad;
                    b.a(b.this, a2);
                    HomeActionBarViewModel homeActionBarViewModel = b.this.Z;
                    String str = baseResponse2.data;
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = HomeActionBarViewModel.a;
                    if (PatchProxy.isSupport(objArr3, homeActionBarViewModel, changeQuickRedirect3, false, "00a9d56d65f8edc2b2d726cdc5a5aa7c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, homeActionBarViewModel, changeQuickRedirect3, false, "00a9d56d65f8edc2b2d726cdc5a5aa7c");
                        return;
                    }
                    try {
                        JSONObject optJSONObject = new JSONObject(str).optJSONObject("home_rcmd_style");
                        if (optJSONObject.has("search_new_style")) {
                            homeActionBarViewModel.k = optJSONObject.optBoolean("search_new_style");
                        } else {
                            homeActionBarViewModel.k = true;
                        }
                        if (optJSONObject.has("resource_info")) {
                            homeActionBarViewModel.p = new JSONObject(optJSONObject.optString("resource_info")).optString("refresh_header_background_url");
                        }
                    } catch (Exception unused) {
                        homeActionBarViewModel.k = true;
                    }
                }
            }
        });
        homePageViewModel.i.a(this.W, new l<Integer>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.12
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Integer num) {
                Integer num2 = num;
                Object[] objArr2 = {num2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "030c2a9be00ce824afcd785319adc81a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "030c2a9be00ce824afcd785319adc81a");
                } else if (num2 != null) {
                    b.b(b.this, -num2.intValue());
                }
            }
        });
        homePageViewModel.m.a(pageFragment, new l<Pair<String, Boolean>>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.13
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable Pair<String, Boolean> pair) {
                Pair<String, Boolean> pair2 = pair;
                Object[] objArr2 = {pair2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d1b803a174b721f549f77a8fdef56dd1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d1b803a174b721f549f77a8fdef56dd1");
                } else if (pair2 != null) {
                    b.a(b.this, pair2.first, pair2.second.booleanValue());
                }
            }
        });
        homePageViewModel.f.a(new l<d.a>() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.14
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable d.a aVar) {
                d.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbd614932ae20c9cb954827eac7e90e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbd614932ae20c9cb954827eac7e90e7");
                } else if (aVar2 != null && aVar2.equals(d.a.ON_RESUME)) {
                    b.c(b.this);
                } else if (aVar2 != null && aVar2.equals(d.a.ON_STOP)) {
                    b.d(b.this);
                } else if (aVar2 == null || !aVar2.equals(d.a.ON_DESTROY)) {
                } else {
                    b.e(b.this);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.business.page.common.arch.a, com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10cca0ed82606ee055487a15fbc3f3bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10cca0ed82606ee055487a15fbc3f3bb");
        }
        this.z = viewGroup.findViewById(R.id.action_bar_background);
        HomeGrayManager.a().a(this.z, 4, 1, "", 0);
        this.A = viewGroup.findViewById(R.id.action_bar_root);
        this.H = viewGroup.findViewById(R.id.header_location_permission_layer);
        this.D = (RelativeLayout) this.A.findViewById(R.id.layout_location_box_container);
        this.C = (LinearLayout) this.A.findViewById(R.id.layout_location_box);
        this.E = (TextView) this.C.findViewById(R.id.txt_location);
        this.F = (TextView) this.C.findViewById(R.id.img_location);
        this.G = (TextView) this.C.findViewById(R.id.img_location_arrow);
        this.I = (LinearLayout) this.A.findViewById(R.id.layout_search_box_normal);
        this.K = (TextSwitchView) this.I.findViewById(R.id.txt_search_normal);
        this.M = (FrameLayout) this.I.findViewById(R.id.ray_animation_container);
        this.L = (RayView) this.I.findViewById(R.id.ray_animation_view);
        this.x = new com.sankuai.waimai.business.page.home.head.recommendwords.alita.a(this.W);
        this.K.setTextFlipListener(new TextSwitchView.b() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.15
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.view.TextSwitchView.b
            public final void a(String str, int i, int i2) {
                Object[] objArr2 = {str, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e0ba89d6b218c6b62b690b370abb44f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e0ba89d6b218c6b62b690b370abb44f");
                } else if (b.this.R != null && i >= 0 && i < b.this.R.size()) {
                    b.this.T = i;
                    b.this.S = (RecommendedSearchKeyword) ((List) b.this.R.get(i)).get(0);
                    b.this.Z.a(b.this.S);
                    if (i2 == 0) {
                        for (RecommendedSearchKeyword recommendedSearchKeyword : (List) b.this.R.get(i)) {
                            recommendedSearchKeyword.isExposed = true;
                        }
                        b.this.R();
                    }
                }
            }
        });
        this.N = (Button) this.I.findViewById(R.id.button_search);
        this.B = (RelativeLayout) viewGroup.findViewById(R.id.layout_search_box_container);
        if (this.W.getActivity() != null && com.sankuai.waimai.platform.capacity.immersed.a.a((Activity) this.W.getActivity())) {
            this.A.setPadding(0, g.e(com.meituan.android.singleton.b.a), 0, 0);
        }
        a(this.V);
        this.I.setOnClickListener(this.an);
        this.N.setOnClickListener(this.an);
        this.C.setOnClickListener(this.ao);
        this.X = new com.sankuai.waimai.business.page.home.weather.b(this.W, this.A.findViewById(R.id.weather_container), new com.sankuai.waimai.business.page.home.weather.c() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.weather.c
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c59c098ad9883944eaf17aa235c28d8c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c59c098ad9883944eaf17aa235c28d8c");
                } else {
                    com.sankuai.waimai.foundation.router.a.a(b.this.W.getActivity(), str);
                }
            }
        });
        this.w = new com.sankuai.waimai.business.page.home.im.a(this.W.getActivity(), AppUtil.generatePageInfoKey(this.W));
        this.w.a(this.A);
        this.Y = new ArgbEvaluator();
        this.ac = new com.sankuai.waimai.business.page.home.head.theme.a(this.W, viewGroup);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = v;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02afac585f34623896b800395049e720", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02afac585f34623896b800395049e720");
        } else {
            ViewCompat.setAccessibilityDelegate(this.E, new AccessibilityDelegateCompat() { // from class: com.sankuai.waimai.business.page.home.actionbar.HomeActionBarBlock$12
                public static ChangeQuickRedirect a;

                @Override // android.support.v4.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    TextView textView;
                    Object[] objArr3 = {view, accessibilityNodeInfoCompat};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d1742f88daf87836f8b223bfb94f6f6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d1742f88daf87836f8b223bfb94f6f6b");
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    StringBuilder sb = new StringBuilder();
                    textView = b.this.E;
                    sb.append((Object) textView.getText());
                    sb.append("，点击可选择地址");
                    accessibilityNodeInfoCompat.setText(sb.toString());
                }
            });
        }
        this.z.post(new Runnable() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1bbabdff4413a1a723347640df9cf237", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1bbabdff4413a1a723347640df9cf237");
                    return;
                }
                b.this.aj = b.this.H.getY();
            }
        });
        this.am = new com.sankuai.waimai.business.page.home.actionbar.market.a(this.W);
        this.am.a(viewGroup);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.home.utils.b.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b44a4dd7d7f0e22dd2030fc610fd4660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b44a4dd7d7f0e22dd2030fc610fd4660");
        } else {
            JudasManualManager.b("b_VjxJn").a("c_m84bv26").a("source", 1).a();
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "495519f9c16851a8f88020bcd206e015", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "495519f9c16851a8f88020bcd206e015");
            return;
        }
        this.V = z;
        this.Z.b(z);
        ViewGroup.LayoutParams layoutParams = this.I.getLayoutParams();
        if (z) {
            this.A.setBackgroundColor(this.W.getActivity().getResources().getColor(17170445));
            this.z.getBackground().mutate().setAlpha((int) (this.Q >= 0.0f ? this.Q * 255.0f : 0.0f));
            String P = P();
            if (this.Z.k) {
                this.N.setVisibility(0);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(ColorUtils.a(P, this.W.getActivity().getResources().getColor(R.color.wm_page_home_search_btn_default_bg)));
                gradientDrawable.setCornerRadius(g.a(com.meituan.android.singleton.b.a, 18.0f));
                gradientDrawable.setStroke(g.a(com.meituan.android.singleton.b.a, 6.0f), 0);
                this.N.setBackground(gradientDrawable);
            } else {
                this.N.setVisibility(8);
            }
            this.B.setBackgroundResource(17170445);
            this.I.setBackgroundResource(R.drawable.wm_page_main_search_bg_new_actionbar);
            ((GradientDrawable) this.I.getBackground()).setColor(-1);
            ((GradientDrawable) this.I.getBackground()).setStroke(g.a(com.meituan.android.singleton.b.a, 1.0f), -1);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = g.a(com.meituan.android.singleton.b.a, 7.0f);
            this.J = -1;
        } else if (this.ad) {
            this.A.setBackgroundColor(this.W.getActivity().getResources().getColor(17170445));
            this.z.getBackground().mutate().setAlpha((int) (this.Q >= 0.0f ? this.Q * 255.0f : 0.0f));
            this.N.setVisibility(0);
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{Color.parseColor("#FFD54D"), Color.parseColor("#FFC34D")});
            gradientDrawable2.setStroke(g.a(com.meituan.android.singleton.b.a, 5.0f), 0);
            gradientDrawable2.setCornerRadius(g.a(com.meituan.android.singleton.b.a, 18.0f));
            this.N.setBackground(gradientDrawable2);
            this.I.setBackgroundResource(R.drawable.wm_page_main_search_bg_new_actionbar);
            ((GradientDrawable) this.I.getBackground()).setColor(-1);
            ((GradientDrawable) this.I.getBackground()).setStroke(g.a(com.meituan.android.singleton.b.a, 1.0f), -1);
            this.B.setBackgroundResource(17170445);
            this.J = -1;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = g.a(com.meituan.android.singleton.b.a, 7.0f);
        } else {
            if (!TextUtils.isEmpty(this.af) && !TextUtils.isEmpty(this.ae)) {
                try {
                    this.A.setBackground(new com.sankuai.waimai.business.page.home.widget.gradient.a(this.ah == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(this.af), Color.parseColor(this.ae)}, 0.0f));
                } catch (Exception unused) {
                }
            } else {
                this.A.setBackground(this.W.getActivity().getResources().getDrawable(R.drawable.wm_page_home_actionbar_bg));
            }
            if (this.ak.e()) {
                this.z.getBackground().mutate().setAlpha(255);
                this.A.getBackground().mutate().setAlpha((int) (this.Q >= 0.0f ? (1.0f - this.Q) * 255.0f : 0.0f));
            } else {
                this.A.getBackground().mutate().setAlpha(0);
            }
            this.N.setVisibility(0);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(Color.parseColor("#ffcc33"));
            gradientDrawable3.setCornerRadius(g.a(com.meituan.android.singleton.b.a, 18.0f));
            this.N.setBackground(gradientDrawable3);
            this.J = this.W.getActivity().getResources().getColor(R.color.wm_page_home_search_box_bg_a);
            this.B.setBackgroundResource(R.drawable.wm_page_home_search_box_bg);
            this.I.setBackgroundResource(R.drawable.wm_page_main_search_bg_new_actionbar);
            ((GradientDrawable) this.I.getBackground()).setStroke(g.a(com.meituan.android.singleton.b.a, 1.0f), Color.parseColor("#FED74D"));
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        }
        a(this.B, this.Z.c());
        a(this.D, this.Z.b());
        this.I.setLayoutParams(layoutParams);
        this.Z.a(this.V, this.ad);
    }

    private void a(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b60a4400633e51a48fd582ab6539599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b60a4400633e51a48fd582ab6539599");
        } else if (view == null || i < 0 || (layoutParams = view.getLayoutParams()) == null) {
        } else {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ced8392929d38ab846194dc3deb8c22", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ced8392929d38ab846194dc3deb8c22")).booleanValue() : (this.W == null || this.W.F == null || !this.W.isAdded() || this.W.isDetached()) ? false : true;
    }

    private Map<String, Object> a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2c91e33b5d360b2715e55a58140c0d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2c91e33b5d360b2715e55a58140c0d8");
        }
        Map<String, Object> a = com.sankuai.waimai.business.page.common.util.a.a(this.S, T());
        a.put("index", Integer.valueOf(this.T));
        a.put(RaptorUploaderImpl.IS_CACHE, Integer.valueOf(this.U ? 1 : 0));
        a.put("rcmd_s_log_id", this.aa);
        a.put("stid", this.ab);
        if (this.R != null && this.T >= 0 && this.T < this.R.size() && this.R.get(this.T) != null && this.R.get(this.T).size() > 1) {
            RecommendedSearchKeyword recommendedSearchKeyword = this.R.get(this.T).get(1);
            a.put("keyword1", recommendedSearchKeyword.searchKeyword);
            a.put("label_word1", recommendedSearchKeyword.viewKeyword);
        }
        if (z) {
            a.put("spread", this.Z.c ? "1" : "0");
        }
        a.put("is_fresh_request", Integer.valueOf(this.al ? 1 : 0));
        if (this.al) {
            a.put(RollSearchKeyword.TRIGGER_POI_ID, this.Z.m);
        }
        if (z2) {
            a.put("location_page", 1);
            a.put("qw_type_id", Integer.valueOf((int) XPlayerConstants.FFP_MSG_RECEIVE_SEI_FRAME));
            a.put("click_type", 2);
            a.put("word_page_type", 1);
            a.put("is_activity", Integer.valueOf(this.V ? 1 : 0));
            if (this.S == null) {
                a.put("label_type", "");
            } else {
                a.put("label_type", Integer.valueOf(this.S.type));
            }
        }
        a.put("cat_id", 0);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f73ac64c34144e53e8205c4c3dd2f9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f73ac64c34144e53e8205c4c3dd2f9d");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("reportClickToStatistics", "2: " + this.U, new Object[0]);
        if (this.U) {
            return;
        }
        JudasManualManager.b("b_dmKcT").a("c_m84bv26").a(this.W).b(a(false, false)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6631f005eb220b9a24ae67c27fc59ae9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6631f005eb220b9a24ae67c27fc59ae9");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("reportClickToStatistics", "3: " + this.U, new Object[0]);
        if (this.U) {
            return;
        }
        JudasManualManager.b("b_waimai_ocn7sgla_mv").a("c_m84bv26").a(this.W).b(a(false, true)).a();
    }

    private String T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a5caefe8e9f27e36c2311d961cc748", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a5caefe8e9f27e36c2311d961cc748");
        }
        if (this.K.getVisibility() == 0) {
            return this.K.getShowingText();
        }
        return null;
    }

    private void U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b05e7b12d5f571753bd4a648857e5f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b05e7b12d5f571753bd4a648857e5f0");
            return;
        }
        this.K.a(this.W.getString(R.string.wm_page_hint_global_search));
        R();
        if (this.N.getVisibility() == 0) {
            S();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.actionbar.b$5  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 implements Runnable {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ List b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ List f;

        public AnonymousClass5(List list, String str, String str2, int i, List list2) {
            this.b = list;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = list2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f6b23bfb3946e4c983b0d6eaf6c0a1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f6b23bfb3946e4c983b0d6eaf6c0a1f");
                return;
            }
            b.this.K.setTextEnhance(b.this.Z.o);
            TextView textView = (TextView) b.this.K.getCurrentView();
            int i = 0;
            while (i < this.b.size()) {
                RecommendedSearchKeyword recommendedSearchKeyword = (RecommendedSearchKeyword) this.b.get(i);
                if (recommendedSearchKeyword != null) {
                    recommendedSearchKeyword.sceneType = this.c;
                    recommendedSearchKeyword.tgt_stids = this.d;
                    if (this.e > 1 && i < this.b.size() - 1) {
                        int i2 = i + 1;
                        if (this.b.get(i2) != null) {
                            TextPaint paint = textView.getPaint();
                            if (textView.getWidth() > paint.measureText(recommendedSearchKeyword.viewKeyword + "  |  " + ((RecommendedSearchKeyword) this.b.get(i2)).viewKeyword)) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(recommendedSearchKeyword);
                                RecommendedSearchKeyword recommendedSearchKeyword2 = (RecommendedSearchKeyword) this.b.get(i2);
                                recommendedSearchKeyword2.sceneType = this.c;
                                recommendedSearchKeyword2.tgt_stids = this.d;
                                arrayList.add(recommendedSearchKeyword2);
                                b.this.R.add(arrayList);
                                List list = this.f;
                                list.add(recommendedSearchKeyword.viewKeyword + "  |  " + recommendedSearchKeyword2.viewKeyword);
                                i = i2;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(recommendedSearchKeyword);
                    b.this.R.add(arrayList2);
                    this.f.add(recommendedSearchKeyword.viewKeyword);
                }
                i++;
            }
            if (!b.this.Z.n || TextUtils.equals(textView.getText(), (CharSequence) this.f.get(0))) {
                b.this.K.a(this.f);
                if (b.this.N.getVisibility() == 0) {
                    b.this.S();
                }
            } else {
                TextSwitchView textSwitchView = b.this.K;
                List<String> list2 = this.f;
                TextSwitchView.a aVar = new TextSwitchView.a() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.5.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.page.home.view.TextSwitchView.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e7e48049466cd851e64bf3032df4e8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e7e48049466cd851e64bf3032df4e8c");
                        } else {
                            b.this.K.postDelayed(new Runnable() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.5.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4aee59a721a8a08c2d885fed594ee8b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4aee59a721a8a08c2d885fed594ee8b");
                                        return;
                                    }
                                    int firstRollWordWidth = b.this.K.getFirstRollWordWidth();
                                    if (firstRollWordWidth > 0) {
                                        ((FrameLayout.LayoutParams) b.this.M.getLayoutParams()).width = firstRollWordWidth + 20;
                                        b.this.M.requestLayout();
                                    }
                                    b.this.M.setVisibility(0);
                                    b.this.L.a(b.this.b((g.c(com.meituan.android.singleton.b.a, firstRollWordWidth) / 13) * 100));
                                    b.this.L.a();
                                    b.this.L.a((com.sankuai.waimai.irmo.render.engine.g) null, (com.sankuai.waimai.irmo.render.a) null);
                                }
                            }, 500L);
                        }
                    }
                };
                Object[] objArr2 = {list2, aVar};
                ChangeQuickRedirect changeQuickRedirect2 = TextSwitchView.a;
                if (PatchProxy.isSupport(objArr2, textSwitchView, changeQuickRedirect2, false, "a834dea8e1b2d1d6a2b45493372731d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, textSwitchView, changeQuickRedirect2, false, "a834dea8e1b2d1d6a2b45493372731d3");
                } else if (list2 != null && list2.size() != 0) {
                    if (!com.sankuai.waimai.modular.utils.a.a(textSwitchView.c) && !TextUtils.isEmpty(textSwitchView.getShowingText())) {
                        textSwitchView.d();
                        textSwitchView.c = list2;
                        textSwitchView.f = -1;
                        textSwitchView.b = 0;
                        textSwitchView.b();
                        textSwitchView.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = TextSwitchView.a;
                        if (PatchProxy.isSupport(objArr3, textSwitchView, changeQuickRedirect3, false, "e28b0697c7c8b3031f2215de8ec0b303", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, textSwitchView, changeQuickRedirect3, false, "e28b0697c7c8b3031f2215de8ec0b303");
                        } else {
                            textSwitchView.d.removeCallbacksAndMessages(null);
                            textSwitchView.d.sendEmptyMessageDelayed(1, 200L);
                            textSwitchView.e = true;
                        }
                    } else {
                        textSwitchView.a(list2);
                    }
                    aVar.a();
                }
            }
            for (int i3 = 0; i3 < b.this.R.size(); i3++) {
                for (RecommendedSearchKeyword recommendedSearchKeyword3 : (List) b.this.R.get(i3)) {
                    recommendedSearchKeyword3.exposedIndex = i3;
                }
            }
            if (b.this.Q()) {
                HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(b.this.W).a(HomePageViewModel.class);
                List<List<RecommendedSearchKeyword>> list3 = b.this.R;
                Object[] objArr4 = {list3};
                ChangeQuickRedirect changeQuickRedirect4 = HomePageViewModel.a;
                if (PatchProxy.isSupport(objArr4, homePageViewModel, changeQuickRedirect4, false, "bebfa870269d91997fb1e3784d467f86", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, homePageViewModel, changeQuickRedirect4, false, "bebfa870269d91997fb1e3784d467f86");
                } else {
                    homePageViewModel.D.b((k<List<List<RecommendedSearchKeyword>>>) list3);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IrmoLayerInfo b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98b01705d82405c14c463fd0a776889e", RobustBitConfig.DEFAULT_VALUE)) {
            return (IrmoLayerInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98b01705d82405c14c463fd0a776889e");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", 1003);
            jSONObject.put(Constants.GestureData.KEY_START_TIME, 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("delay", 0);
            jSONObject2.put("play_count", 1);
            jSONObject2.put("ray_colors", new JSONArray().put("#00FFFFFF").put("#CCFFFFFF").put("#00FFFFFF"));
            jSONObject2.put("ray_color_position", new JSONArray().put(0).put(0.5d).put(1));
            jSONObject2.put("ray_width", 10);
            jSONObject2.put("ray_rotation_z", 45);
            jSONObject2.put("duration", i);
            jSONObject.put("effect_params", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        IrmoLayerInfo irmoLayerInfo = new IrmoLayerInfo();
        irmoLayerInfo.parse(jSONObject);
        return irmoLayerInfo;
    }

    public final void a(RefreshHeaderHelper refreshHeaderHelper) {
        Object[] objArr = {refreshHeaderHelper};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5015671a0b75ed37a87c08d1e4f07fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5015671a0b75ed37a87c08d1e4f07fa");
            return;
        }
        this.ak = refreshHeaderHelper;
        this.ak.a(new RefreshHeaderHelper.a() { // from class: com.sankuai.waimai.business.page.home.actionbar.b.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void a(int i, float f, int i2, int i3, boolean z) {
                Object[] objArr2 = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a49e81320f345d59bf2d13b355a2dad", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a49e81320f345d59bf2d13b355a2dad");
                    return;
                }
                super.a(i, f, i2, i3, z);
                if (b.this.z != null) {
                    b.this.z.setY(i);
                }
                if (b.this.D != null) {
                    float f2 = 1.0f - f;
                    b.this.D.setAlpha(f2);
                    b.this.D.setVisibility(f2 <= 0.0f ? 4 : 0);
                }
                if (b.this.aj != 0.0f && b.this.aj != -10000.0f && b.this.H != null) {
                    b.this.H.setY(b.this.aj + i);
                }
                if (b.this.V || b.this.ad) {
                    return;
                }
                if (b.this.A != null && b.this.A.getBackground() != null && b.this.A.getBackground().mutate() != null) {
                    b.this.A.getBackground().mutate().setAlpha((int) ((1.0f - f) * 255.0f));
                }
                if (b.this.z == null || b.this.z.getBackground() == null || b.this.z.getBackground().mutate() == null) {
                    return;
                }
                b.this.z.getBackground().mutate().setAlpha((int) ((1.0f - f) * 255.0f));
            }

            @Override // com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.a, com.sankuai.waimai.business.page.home.widget.twolevel.RefreshHeaderHelper.c
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "03a91e1ee3f8daa4fbccde17a131701a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "03a91e1ee3f8daa4fbccde17a131701a");
                    return;
                }
                super.c();
                if (b.this.z != null) {
                    b.this.z.setY(0.0f);
                }
                if (b.this.D != null) {
                    b.this.D.setAlpha(1.0f);
                }
                if (b.this.aj != 0.0f && b.this.H != null && b.this.aj != -10000.0f) {
                    b.this.H.setY(b.this.aj);
                }
                if (b.this.V || b.this.ad) {
                    return;
                }
                if (b.this.A != null && b.this.A.getBackground() != null && b.this.A.getBackground().mutate() != null) {
                    b.this.A.getBackground().mutate().setAlpha(255);
                }
                if (b.this.z == null || b.this.z.getBackground() == null || b.this.z.getBackground().mutate() == null) {
                    return;
                }
                b.this.z.getBackground().mutate().setAlpha(255);
            }
        });
    }

    private String P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cbcca5876f0a198c23ceafad6b4aef2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cbcca5876f0a198c23ceafad6b4aef2");
        }
        String a = e.a(com.meituan.android.singleton.b.a).a();
        return !TextUtils.isEmpty(a) ? a : "#FFCC33";
    }
}
