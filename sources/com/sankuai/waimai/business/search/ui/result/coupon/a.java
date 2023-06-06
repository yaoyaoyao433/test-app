package com.sankuai.waimai.business.search.ui.result.coupon;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.search.api.WaimaiSearchService;
import com.sankuai.waimai.business.search.common.util.h;
import com.sankuai.waimai.business.search.common.util.i;
import com.sankuai.waimai.business.search.common.util.j;
import com.sankuai.waimai.business.search.model.GlobalSearchCouponCard;
import com.sankuai.waimai.business.search.ui.SearchShareData;
import com.sankuai.waimai.platform.base.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    GlobalSearchCouponCard.CardContent b;
    boolean c;
    private View d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private SearchShareData l;

    public static /* synthetic */ void a(a aVar, int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5644ea3b673fbcb1da280d4713c6f62f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5644ea3b673fbcb1da280d4713c6f62f");
            return;
        }
        if (i == 0) {
            aVar.j.setText("已领取");
            aVar.j.setTextColor(ContextCompat.getColor(aVar.y, R.color.wm_nox_search_4D222426));
            aVar.c = true;
        } else if (str.equals(aVar.y.getString(R.string.wm_nox_search_coupon_new_receive))) {
            aVar.j.setText("仅限新人");
            aVar.j.setTextColor(ContextCompat.getColor(aVar.y, R.color.wm_nox_search_4D222426));
        } else if (str.equals(aVar.y.getString(R.string.wm_nox_search_coupon_has_receive))) {
            aVar.j.setText("已领取");
            aVar.j.setTextColor(ContextCompat.getColor(aVar.y, R.color.wm_nox_search_4D222426));
            aVar.c = true;
        }
        j.a((Activity) aVar.y, str);
    }

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "000eda855ed7ada29d55944f6a481008", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "000eda855ed7ada29d55944f6a481008");
            return;
        }
        this.c = false;
        this.l = SearchShareData.a(context);
    }

    @Override // com.sankuai.waimai.platform.base.b
    public final View a(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75b9b3e39ccbe689c2745431cad04ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75b9b3e39ccbe689c2745431cad04ba9");
        }
        this.d = this.z.inflate(R.layout.wm_nox_search_coupon_card_layout, viewGroup, false);
        this.e = (ImageView) this.d.findViewById(R.id.ic_coupon_medicine);
        this.f = (TextView) this.d.findViewById(R.id.tv_coupon_price);
        this.g = (TextView) this.d.findViewById(R.id.tv_coupon_limit);
        this.h = (TextView) this.d.findViewById(R.id.tv_coupon_name);
        this.i = (TextView) this.d.findViewById(R.id.tv_coupon_use_rule);
        this.j = (TextView) this.d.findViewById(R.id.tv_coupon_receive);
        this.k = (LinearLayout) this.d.findViewById(R.id.coupon_rule_layout);
        this.d.setVisibility(8);
        return this.d;
    }

    public final void a(final GlobalSearchCouponCard.CardContent cardContent) {
        Object[] objArr = {cardContent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc456c0e48668a2c793b7801132eda44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc456c0e48668a2c793b7801132eda44");
        } else if (cardContent == null) {
            this.d.setVisibility(8);
        } else {
            this.b = cardContent;
            this.c = false;
            this.d.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            Context context = this.y;
            Object[] objArr2 = {78};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            layoutParams.setMargins(com.meituan.roodesign.widgets.internal.a.a(context, PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4957927c5a67b04c112dbeb4396124f9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4957927c5a67b04c112dbeb4396124f9")).intValue() : Math.round((((2.0f / com.sankuai.waimai.platform.b.A().n()) * com.sankuai.waimai.platform.b.A().l()) / 750.0f) * 78.0f)), com.meituan.roodesign.widgets.internal.a.a(this.y, 11.0f), 0, 0);
            this.k.setLayoutParams(layoutParams);
            this.f.setText(String.valueOf(this.b.medicineCouponData.i));
            this.g.setText(this.b.medicineCouponData.m);
            this.h.setText(this.b.medicineCouponData.e);
            this.i.setText(this.b.medicineCouponData.k);
            int i = this.b.medicineCouponData.f;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a4e011a4851e2f36075f863c4a79898", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a4e011a4851e2f36075f863c4a79898");
            } else if (i == 0) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "28573deee34c7142b82e445c37ad087c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "28573deee34c7142b82e445c37ad087c");
                } else {
                    this.j.setText("立即领取");
                    this.j.setTextColor(ContextCompat.getColor(this.y, R.color.wm_nox_search_222426));
                }
            } else if (i == 2) {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "657e08ebc76bf564d707872c908181d2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "657e08ebc76bf564d707872c908181d2");
                } else {
                    this.j.setText("已领取");
                    this.j.setTextColor(ContextCompat.getColor(this.y, R.color.wm_nox_search_4D222426));
                }
            }
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.coupon.a.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6282ddcd4b64f72cbe4c16733b74eb3a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6282ddcd4b64f72cbe4c16733b74eb3a");
                        return;
                    }
                    h.a(a.this.y, 1, "c_nfqbfvw", "b_waimai_sg_bs55fe05_mc", AppUtil.generatePageInfoKey(a.this.y), a.this.a());
                    Activity activity = (Activity) a.this.y;
                    String str = cardContent.medicineScheme;
                    Object[] objArr7 = {activity, str};
                    ChangeQuickRedirect changeQuickRedirect7 = i.a;
                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "3f1e0110b7eaf2f9985856d4294b4208", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "3f1e0110b7eaf2f9985856d4294b4208");
                    } else if (TextUtils.isEmpty(str)) {
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, str);
                    }
                }
            });
            if (TextUtils.isEmpty(this.b.medicineIcon)) {
                this.e.setImageResource(R.drawable.wm_nox_search_coupon_medicine_default_bg);
            } else {
                h.a(this.y, 2, "c_nfqbfvw", "b_waimai_sg_bs55fe05_mv", AppUtil.generatePageInfoKey(this.y), a());
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.y;
                a2.i = R.drawable.wm_nox_search_coupon_medicine_default_bg;
                a2.j = R.drawable.wm_nox_search_coupon_medicine_default_bg;
                a2.c = this.b.medicineIcon;
                a2.a(this.e);
            }
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.search.ui.result.coupon.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr6 = {view};
                    ChangeQuickRedirect changeQuickRedirect6 = a;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "10a6c9f7a4064bcdef37a999a337c268", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "10a6c9f7a4064bcdef37a999a337c268");
                        return;
                    }
                    h.a(a.this.y, 1, "c_nfqbfvw", "b_waimai_sg_wi492k1q_mc", AppUtil.generatePageInfoKey(a.this.y), a.this.b());
                    com.sankuai.waimai.platform.domain.manager.user.a.a(a.this.y, new Runnable() { // from class: com.sankuai.waimai.business.search.ui.result.coupon.a.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr7 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "29a6d58a0b3e628260b341f93f1c727b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "29a6d58a0b3e628260b341f93f1c727b");
                                return;
                            }
                            final a aVar = a.this;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = a.a;
                            if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "9afe5bb5971bdae5bbdaa4b22a57bacd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "9afe5bb5971bdae5bbdaa4b22a57bacd");
                            } else if (aVar.b.medicineCouponData.f == 2 || aVar.c) {
                            } else {
                                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((WaimaiSearchService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) WaimaiSearchService.class)).receiveCoupon(aVar.b.medicineCouponData.c, aVar.b.medicineCouponData.b, aVar.c()), new b.AbstractC1042b<com.sankuai.waimai.business.search.model.a<Object>>() { // from class: com.sankuai.waimai.business.search.ui.result.coupon.a.3
                                    public static ChangeQuickRedirect a;

                                    @Override // rx.e
                                    public final /* synthetic */ void onNext(Object obj) {
                                        com.sankuai.waimai.business.search.model.a aVar2 = (com.sankuai.waimai.business.search.model.a) obj;
                                        Object[] objArr9 = {aVar2};
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "823e71626fca1e4b7e024c26a073641b", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "823e71626fca1e4b7e024c26a073641b");
                                        } else if (aVar2 == null) {
                                            a();
                                        } else {
                                            int i2 = aVar2.c;
                                            String str = aVar2.d;
                                            Object[] objArr10 = {Integer.valueOf(i2), str};
                                            ChangeQuickRedirect changeQuickRedirect10 = a;
                                            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "092fc83d831d7bc1ae4f2f18064a60cc", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "092fc83d831d7bc1ae4f2f18064a60cc");
                                            } else if (!(a.this.y instanceof Activity) || ((Activity) a.this.y).isFinishing() || ((Activity) a.this.y).isDestroyed()) {
                                            } else {
                                                a.a(a.this, i2, str);
                                            }
                                        }
                                    }

                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                        Object[] objArr9 = {th};
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "7b4cf5b4b6000c338a226c661c81c8db", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "7b4cf5b4b6000c338a226c661c81c8db");
                                        } else {
                                            a();
                                        }
                                    }

                                    private void a() {
                                        Object[] objArr9 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect9 = a;
                                        if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "33bec0af25413573f18f54c256c5af62", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "33bec0af25413573f18f54c256c5af62");
                                        } else if (!(a.this.y instanceof Activity) || ((Activity) a.this.y).isFinishing() || ((Activity) a.this.y).isDestroyed()) {
                                        } else {
                                            j.a((Activity) a.this.y, "网络好像超时了，请稍后再试");
                                        }
                                    }
                                }, "");
                            }
                        }
                    });
                }
            });
        }
    }

    public final Map<String, Object> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda7038b333b06fcee7c697486777a4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda7038b333b06fcee7c697486777a4c");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stid", this.l != null ? String.valueOf(this.l.d) : "");
        hashMap.put("cat_id", this.l != null ? String.valueOf(this.l.w) : "");
        hashMap.put("keyword", this.l != null ? String.valueOf(this.l.g) : "");
        hashMap.put("search_log_id", this.l != null ? String.valueOf(this.l.l) : "");
        hashMap.put("search_global_id", this.l != null ? String.valueOf(this.l.m) : "");
        hashMap.put("search_source", this.l != null ? String.valueOf(this.l.K) : "");
        return hashMap;
    }

    public final Map<String, Object> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb58d75a7d10239c774c1884ea69ba24", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb58d75a7d10239c774c1884ea69ba24");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stid", this.l != null ? String.valueOf(this.l.d) : "");
        hashMap.put("cat_id", this.l != null ? String.valueOf(this.l.w) : "");
        hashMap.put("keyword", this.l != null ? String.valueOf(this.l.g) : "");
        hashMap.put("coupon_status", this.b.medicineCouponData != null ? String.valueOf(this.b.medicineCouponData.f) : "");
        hashMap.put("search_log_id", this.l != null ? String.valueOf(this.l.l) : "");
        hashMap.put("search_global_id", this.l != null ? String.valueOf(this.l.m) : "");
        hashMap.put("search_source", this.l != null ? String.valueOf(this.l.K) : "");
        return hashMap;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c9578794159de78aabfa0a0915173f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c9578794159de78aabfa0a0915173f7");
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("{\"PACKET_REQUIRE_DATA\":{\"channelUrlKey\":");
            stringBuffer.append(CommonConstant.Symbol.DOUBLE_QUOTES + this.b.medicineCouponData.a + CommonConstant.Symbol.DOUBLE_QUOTES);
            stringBuffer.append("}}");
            return URLEncoder.encode(stringBuffer.toString(), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a9bdbd30249a2120ba1d023feb9cd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a9bdbd30249a2120ba1d023feb9cd3");
        } else if (this.b.isCouponExposed) {
        } else {
            this.b.isCouponExposed = true;
            h.a(this.y, 2, "c_nfqbfvw", "b_waimai_sg_wi492k1q_mv", AppUtil.generatePageInfoKey(this.y), b());
        }
    }
}
