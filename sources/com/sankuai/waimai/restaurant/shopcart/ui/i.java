package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.support.constraint.R;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.d;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.poi.PoiShoppingCart;
import com.sankuai.waimai.restaurant.shopcart.a;
import com.sankuai.waimai.restaurant.shopcart.adapter.TryLuckyFoodAdapter;
import com.sankuai.waimai.restaurant.shopcart.net.ShopcartApi;
import com.sankuai.waimai.restaurant.shopcart.widget.tryLucky.TryLuckyTipsLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class i {
    public static ChangeQuickRedirect a;
    ImageView A;
    TextView B;
    String C;
    List<String> D;
    public boolean E;
    private com.sankuai.waimai.restaurant.shopcart.a F;
    private boolean G;
    View b;
    ListView c;
    TryLuckyFoodAdapter d;
    List<GoodsSpu> e;
    boolean f;
    View g;
    int h;
    View i;
    boolean j;
    TextView k;
    TryLuckyTipsLayout l;
    TextView m;
    TryLuckyTipsLayout n;
    boolean o;
    boolean p;
    ViewStub q;
    boolean r;
    String s;
    int t;
    TextView u;
    Activity v;
    com.sankuai.waimai.business.restaurant.base.manager.order.g w;
    com.sankuai.waimai.restaurant.shopcart.config.a x;
    public com.sankuai.waimai.business.restaurant.rn.bridge.d y;
    View z;

    public abstract void g();

    public abstract void h();

    public i(Activity activity, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, com.sankuai.waimai.restaurant.shopcart.config.a aVar, String str) {
        Object[] objArr = {activity, gVar, aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bd8d2b714ba982d0ff24d3cb4d37c39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bd8d2b714ba982d0ff24d3cb4d37c39");
            return;
        }
        this.f = false;
        this.j = false;
        this.o = false;
        this.p = false;
        this.G = true;
        this.D = new ArrayList();
        this.v = activity;
        this.w = gVar;
        this.x = aVar;
        this.F = new com.sankuai.waimai.restaurant.shopcart.a(str);
        this.C = a(aVar);
    }

    String a(com.sankuai.waimai.restaurant.shopcart.config.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72752dafcbc789b148ad8bf9759c1aed", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72752dafcbc789b148ad8bf9759c1aed") : aVar.a() ? "c_CijEL" : aVar.b() ? "c_u4fk4kw" : aVar.e() ? "c_1b9anm4" : aVar.d() ? "c_5y4tc0m" : "";
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5c5d3de5d1ac755fe24d80755896d3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5c5d3de5d1ac755fe24d80755896d3f");
        } else {
            this.g.setPadding(this.g.getPaddingLeft(), this.g.getPaddingTop(), this.h + (this.z.isShown() ? this.z.getWidth() : 0), this.g.getPaddingBottom());
        }
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9644fb989f2c2042ba7f96a387cbb868", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9644fb989f2c2042ba7f96a387cbb868");
            return;
        }
        int i = z ? 0 : 8;
        this.j = z;
        if (this.g != null) {
            this.g.setVisibility(i);
            if (this.y != null) {
                this.y.uponTipShopCartStatus(z);
            }
        }
        if (this.i != null) {
            this.i.setVisibility(i);
        }
    }

    private void a(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e760880f08c8adde8f25265b6f39c03d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e760880f08c8adde8f25265b6f39c03d");
            return;
        }
        this.n.a(charSequence, TextView.BufferType.SPANNABLE);
        this.l.a(charSequence, TextView.BufferType.SPANNABLE);
    }

    private void i() {
        com.sankuai.waimai.business.restaurant.base.shopcart.tip.c i;
        com.sankuai.waimai.business.restaurant.base.shopcart.tip.d dVar;
        com.sankuai.waimai.business.restaurant.base.shopcart.tip.d dVar2;
        String str;
        int i2;
        boolean z;
        List<GoodsSpu> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff6f491f4a786c4790b5c96b97d402d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff6f491f4a786c4790b5c96b97d402d");
            return;
        }
        a(false);
        this.p = false;
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.w.f());
        if (n == null || (i = n.i()) == null) {
            return;
        }
        Object[] objArr2 = {i};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "29ec54a2154473f6091837b7a5f1413c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "29ec54a2154473f6091837b7a5f1413c");
        } else if (i != null) {
            String str2 = i.c;
            if (!TextUtils.isEmpty(str2) && !i.d) {
                ae.b(com.meituan.android.singleton.b.a, str2);
                i.d = true;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.tip.c.a;
        if (PatchProxy.isSupport(objArr3, i, changeQuickRedirect3, false, "10c3d797d262995ace429279609637b1", RobustBitConfig.DEFAULT_VALUE)) {
            dVar = (com.sankuai.waimai.business.restaurant.base.shopcart.tip.d) PatchProxy.accessDispatch(objArr3, i, changeQuickRedirect3, false, "10c3d797d262995ace429279609637b1");
        } else {
            if (i.f == null) {
                i.f = new com.sankuai.waimai.business.restaurant.base.shopcart.tip.d();
            }
            dVar = i.f;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.tip.d dVar3 = dVar;
        if (dVar3 == null) {
            d(false);
            return;
        }
        String str3 = dVar3.b;
        Object[] objArr4 = {str3};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8c272fe3fb72eb64cac2a685d0d6afc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8c272fe3fb72eb64cac2a685d0d6afc");
        } else {
            this.D.clear();
            Pattern compile = Pattern.compile("<highlight>(.+?)</highlight>");
            if (str3 != null && str3.contains("highlight")) {
                Matcher matcher = compile.matcher(str3);
                while (matcher.find()) {
                    this.D.add(matcher.group(1));
                }
            }
            if (this.D.isEmpty()) {
                this.D.add("-1");
            }
        }
        String c = c(str3);
        b(c);
        com.sankuai.waimai.business.restaurant.base.shopcart.tip.b bVar = dVar3.c;
        this.s = c;
        this.r = dVar3.d;
        if (bVar == null) {
            a(c);
            return;
        }
        final int i3 = bVar.c;
        if (!com.sankuai.waimai.foundation.utils.aa.a(bVar.d) && !this.f) {
            this.p = true;
            Spanned fromHtml = Html.fromHtml(bVar.d);
            Object[] objArr5 = {fromHtml};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "170b24a62f4d5a2704f51e56567c0eb5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "170b24a62f4d5a2704f51e56567c0eb5");
            } else {
                this.k.setText(fromHtml, TextView.BufferType.SPANNABLE);
                this.m.setText(fromHtml, TextView.BufferType.SPANNABLE);
            }
            if (bVar.b == 1) {
                double d = n.e.mTotalAndBoxPrice;
                double d2 = bVar.e;
                Object[] objArr6 = {Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (!PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7bccdd9d3c902f8112d1db5b9a89ea1d", RobustBitConfig.DEFAULT_VALUE)) {
                    double d3 = d + d2;
                    final com.sankuai.waimai.restaurant.shopcart.a aVar = this.F;
                    String f = this.w.f();
                    final a.InterfaceC1124a interfaceC1124a = new a.InterfaceC1124a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.i.5
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.restaurant.shopcart.a.InterfaceC1124a
                        public final void a(int i4, List<GoodsSpu> list2) {
                            Object[] objArr7 = {Integer.valueOf(i4), list2};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "fa887c70962a0acb74d7861e794badbc", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "fa887c70962a0acb74d7861e794badbc");
                            } else if (com.sankuai.waimai.foundation.utils.b.b(list2)) {
                                i.this.a(false);
                            } else {
                                if (i.this.e == null) {
                                    i.this.e = new ArrayList();
                                }
                                i.this.t = i3;
                                i.this.e.clear();
                                i.this.e.addAll(list2);
                                i.this.a(i.this.p);
                                if (i.this.E) {
                                    JudasManualManager.b("b_waimai_nn2brd5s_mv", i.this.a(i.this.x), AppUtil.generatePageInfoKey(i.this.v)).a("poi_id", i.this.w.f()).a("status", i.this.w.g.min_price > com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(i.this.w.f()).e.mTotalAndBoxPrice ? 0 : 1).a("tag", String.valueOf(i.this.D)).a();
                                }
                            }
                        }
                    };
                    Object[] objArr7 = {f, Double.valueOf(d), Double.valueOf(d3), interfaceC1124a};
                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.restaurant.shopcart.a.a;
                    str = c;
                    if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "14fa47f371a377dbb2626e01f72283df", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "14fa47f371a377dbb2626e01f72283df");
                        dVar2 = dVar3;
                    } else {
                        final int abs = (int) (Math.abs(d3 - d) * 100.0d);
                        Object[] objArr8 = {Integer.valueOf(abs), 2};
                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.restaurant.shopcart.a.a;
                        dVar2 = dVar3;
                        if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "67b22e85a67e3674812d7dfeb2ba4c9a", RobustBitConfig.DEFAULT_VALUE)) {
                            z = ((Boolean) PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "67b22e85a67e3674812d7dfeb2ba4c9a")).booleanValue();
                            i2 = 1;
                        } else {
                            if (aVar.c != null) {
                                i2 = 1;
                                if (aVar.c.get(abs, 1) == 2) {
                                    z = true;
                                }
                            } else {
                                i2 = 1;
                            }
                            z = false;
                        }
                        if (!z) {
                            Object[] objArr9 = new Object[i2];
                            objArr9[0] = Integer.valueOf(abs);
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.restaurant.shopcart.a.a;
                            if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "0bd3c4fc53002bf228dff76c886f7d73", RobustBitConfig.DEFAULT_VALUE)) {
                                list = (List) PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "0bd3c4fc53002bf228dff76c886f7d73");
                            } else {
                                list = aVar.b != null ? aVar.b.get(abs) : null;
                            }
                            if (list != null) {
                                aVar.a(interfaceC1124a, abs, list);
                            } else {
                                aVar.a(abs, 2);
                                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((ShopcartApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) ShopcartApi.class)).getTryLuckyFood(com.sankuai.waimai.platform.domain.core.poi.b.a(f), f, d, d3), new b.AbstractC1042b<BaseResponse<List<GoodsSpu>>>() { // from class: com.sankuai.waimai.restaurant.shopcart.a.1
                                    public static ChangeQuickRedirect a;

                                    @Override // rx.e
                                    public final /* synthetic */ void onNext(Object obj) {
                                        BaseResponse baseResponse = (BaseResponse) obj;
                                        Object[] objArr10 = {baseResponse};
                                        ChangeQuickRedirect changeQuickRedirect10 = a;
                                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "a7623649965e8c8ca312ec5c8821c122", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "a7623649965e8c8ca312ec5c8821c122");
                                            return;
                                        }
                                        aVar.a(abs, 1);
                                        if (baseResponse != null && baseResponse.code == 0 && baseResponse.data != 0) {
                                            ArrayList arrayList = new ArrayList();
                                            if (!d.a((List) baseResponse.data)) {
                                                for (GoodsSpu goodsSpu : (List) baseResponse.data) {
                                                    if (!d.a(goodsSpu.skus)) {
                                                        arrayList.add(goodsSpu);
                                                    }
                                                }
                                            }
                                            a aVar2 = aVar;
                                            int i4 = abs;
                                            Object[] objArr11 = {Integer.valueOf(i4), arrayList};
                                            ChangeQuickRedirect changeQuickRedirect11 = a.a;
                                            if (PatchProxy.isSupport(objArr11, aVar2, changeQuickRedirect11, false, "948a3e3fbca3df9880ba0235b0885bfe", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr11, aVar2, changeQuickRedirect11, false, "948a3e3fbca3df9880ba0235b0885bfe");
                                            } else if (aVar2.b != null) {
                                                aVar2.b.put(i4, arrayList);
                                            }
                                            aVar.a(interfaceC1124a, abs, arrayList);
                                            return;
                                        }
                                        aVar.a(interfaceC1124a, abs, null);
                                    }

                                    @Override // rx.e
                                    public final void onError(Throwable th) {
                                        Object[] objArr10 = {th};
                                        ChangeQuickRedirect changeQuickRedirect10 = a;
                                        if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "c89b542dcc33cbed2370ea55bf99d4e3", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "c89b542dcc33cbed2370ea55bf99d4e3");
                                        } else {
                                            aVar.a(abs, 1);
                                        }
                                    }
                                }, aVar.d);
                            }
                        }
                    }
                    if (this.b == null && this.b.getVisibility() == 0 && dVar2.d && this.b.getTag() != null && ((Integer) this.b.getTag()).intValue() == 2) {
                        a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_reach_min_price));
                        return;
                    } else {
                        a(str);
                    }
                }
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7bccdd9d3c902f8112d1db5b9a89ea1d");
            }
        }
        dVar2 = dVar3;
        str = c;
        if (this.b == null) {
        }
        a(str);
    }

    private String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bba1eca935cbd9ad372568b79ff7f3e6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bba1eca935cbd9ad372568b79ff7f3e6") : !TextUtils.isEmpty(str) ? str.replace("<highlight>", "<font color=\"#FF8000\">").replace("</highlight>", "</font>") : str;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50902b7586511d29ebe6c1f899ad8147", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50902b7586511d29ebe6c1f899ad8147");
        } else if (this.b == null || this.b.getVisibility() != 0) {
        } else {
            this.b.setVisibility(8);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc4e00a1bbe6eae5155a5f1b9698c1e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc4e00a1bbe6eae5155a5f1b9698c1e2");
        } else if (this.w.u() && !this.w.a()) {
            d();
        } else {
            b();
            b("");
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a811da6368acabe1c25c1f5ce30e07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a811da6368acabe1c25c1f5ce30e07");
            return;
        }
        if (this.b != null && this.b.getVisibility() == 0) {
            this.d.notifyDataSetChanged();
        }
        if (this.w.u()) {
            i();
        }
        j();
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06755d7dbf44028d609abe7033313d5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06755d7dbf44028d609abe7033313d5a");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.w.f());
        ShopCartMemberInfo shopCartMemberInfo = n.v;
        if (n.l()) {
            this.z.setVisibility(0);
            this.z.setBackgroundResource(n.m() ? R.drawable.wm_shopcart_bg_vp_tip2 : R.drawable.wm_shopcart_bg_vp_tip);
            b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a2.b = this.v;
            boolean m = n.m();
            int i = R.drawable.cart_member_tip_icon;
            a2.j = m ? R.drawable.cart_member_tip_icon_new : R.drawable.cart_member_tip_icon;
            if (n.m()) {
                i = R.drawable.cart_member_tip_icon_new;
            }
            a2.i = i;
            a2.c = shopCartMemberInfo.getTipText().bizIcon;
            a2.a(this.A);
            this.B.setText(com.sankuai.waimai.business.restaurant.base.util.e.a(shopCartMemberInfo.getTipText().bizTTitle, "#FF4A26"));
            if (this.G) {
                JudasManualManager.c(n.m() ? "b_waimai_q13f9sf6_mv" : "b_waimai_ynereba2_mv", this.C, this.v).a();
                this.G = false;
                return;
            }
            return;
        }
        this.z.setVisibility(8);
        this.G = true;
        a();
    }

    void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ede7d713870c70cf798478dd2b9a8a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ede7d713870c70cf798478dd2b9a8a5");
        } else if (com.sankuai.waimai.foundation.utils.aa.a(str)) {
            if (this.u != null) {
                this.u.setVisibility(8);
            }
        } else {
            a(Html.fromHtml(str));
            if (this.u != null) {
                this.u.setVisibility(0);
            }
        }
    }

    private void a(Spanned spanned) {
        Object[] objArr = {spanned};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7e101ec86d182015e3adc57a5b8106", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7e101ec86d182015e3adc57a5b8106");
        } else if (this.u != null) {
            this.u.setText(spanned, TextView.BufferType.SPANNABLE);
        }
    }

    void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d83d7be22967f0d3b8600dea77ad86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d83d7be22967f0d3b8600dea77ad86");
            return;
        }
        if (com.sankuai.waimai.business.restaurant.composeorder.a.b) {
            z = false;
        }
        c(z);
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f1f343c2d304a06afde5177796991d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f1f343c2d304a06afde5177796991d4");
        } else {
            this.E = true;
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2713b03a16de85d44711cbf9bfe284f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2713b03a16de85d44711cbf9bfe284f6");
        } else {
            this.E = false;
        }
    }

    private boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed67f521d72ceb17091292d2c61ceb1f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed67f521d72ceb17091292d2c61ceb1f")).booleanValue() : this.x.c == 2;
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63d9c9280a13548ae49d13825c7715d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63d9c9280a13548ae49d13825c7715d5");
            return;
        }
        this.o = z;
        this.k.setVisibility(z ? 0 : 8);
        this.m.setVisibility(z ? 0 : 8);
    }

    private boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0723c91f0c37dd128a303d81cb90d973", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0723c91f0c37dd128a303d81cb90d973")).booleanValue();
        }
        if (TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.w.m())) {
            com.sankuai.waimai.business.restaurant.base.shopcart.b n = com.sankuai.waimai.business.restaurant.base.manager.order.k.a().n(this.w.f());
            return !((n.i + n.k) + n.j > 0);
        }
        return false;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c6f606db1893dd0099fa37851e03eca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c6f606db1893dd0099fa37851e03eca");
            return;
        }
        if (d(str)) {
            str = c(this.w.m());
            this.f = true;
        } else {
            this.f = false;
        }
        if (TextUtils.isEmpty(str)) {
            d(false);
            return;
        }
        a((CharSequence) Html.fromHtml(str));
        d(true);
        if (k()) {
            PoiShoppingCart.ActivityInfo n = this.w.n();
            int i = n != null ? n.type : 0;
            JudasManualManager.a a2 = JudasManualManager.b("b_Ottru").a("c_u4fk4kw");
            a2.b = AppUtil.generatePageInfoKey(this.v);
            a2.a("poi_id", this.w.f()).a("spu_id", com.sankuai.waimai.platform.domain.manager.goods.a.a().b()).a("activity_type_id", String.valueOf(i)).a();
        }
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6083fa02f911ad881bae54f890ee153", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6083fa02f911ad881bae54f890ee153");
            return;
        }
        if (this.w.t()) {
            z = false;
        }
        b(z);
    }
}
