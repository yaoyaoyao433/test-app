package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.addrsdk.manager.AddressApiManager;
import com.sankuai.waimai.addrsdk.mvp.bean.AddressBean;
import com.sankuai.waimai.bussiness.order.confirm.model.AddressBackInfo;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.log.judas.StatisticsRecyclerView;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.manager.location.geo.UserAddressAPI;
import com.sankuai.waimai.platform.domain.manager.location.model.NewHistoryAddressResponse;
import com.sankuai.waimai.platform.widget.common.f;
import com.sankuai.waimai.platform.widget.common.h;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.platform.widget.emptylayout.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private String A;
    Activity b;
    long c;
    public String d;
    public String e;
    public String f;
    public int g;
    public List<Long> h;
    public List<String> i;
    StatisticsRecyclerView j;
    Dialog k;
    d l;
    public com.sankuai.waimai.platform.widget.common.c<AddressItem> m;
    long n;
    public LinearLayout o;
    View p;
    AddressItem q;
    ArrayList<AddressItem> r;
    public AddressItem s;
    public String t;
    Drawable u;
    public boolean v;
    public boolean w;
    public a x;
    private View y;
    private final String z;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(AddressItem addressItem);
    }

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "9b468d873f546c44b9479b8aac4a0b5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "9b468d873f546c44b9479b8aac4a0b5f");
        } else if (cVar.k == null || cVar.k.getWindow() == null) {
        } else {
            cVar.k.getWindow().setWindowAnimations(R.style.wm_order_confirm_address_dialog_no_animation_style);
        }
    }

    public static /* synthetic */ void a(c cVar, View view, AddressItem addressItem) {
        Object[] objArr = {view, addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "e83061f03e27020e7622da271582c3de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "e83061f03e27020e7622da271582c3de");
        } else if (addressItem.addressType != 1 && (addressItem.bindType < 11 || addressItem.lat == 0 || addressItem.lng == 0 || !addressItem.canShipping())) {
            String simpleName = cVar.getClass().getSimpleName();
            com.sankuai.waimai.foundation.utils.log.a.b(simpleName, "handler-lat or lng == 0, need to bind in map page. " + addressItem, new Object[0]);
            com.sankuai.waimai.bussiness.order.base.a.a(cVar.b, AddressScene.DEFAULT_SCENE, addressItem, cVar.c, cVar.d, cVar.h);
        } else {
            com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.b, addressItem);
            ImageView imageView = (ImageView) view.findViewById(R.id.select);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.wm_order_confirm_address_select);
            }
            cVar.q = addressItem;
            cVar.k.dismiss();
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "adb8fdd13f04ee798a863929c3f24a2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "adb8fdd13f04ee798a863929c3f24a2b");
        } else if (cVar.k != null && cVar.k.isShowing()) {
            ae.a(cVar.k.getWindow().getDecorView(), str);
        } else {
            ae.a(cVar.b, str);
        }
    }

    public c(Activity activity, long j, String str, String str2) {
        Object[] objArr = {activity, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "835e75e2449944c896995e229bf3f447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "835e75e2449944c896995e229bf3f447");
            return;
        }
        this.g = 0;
        this.n = -1L;
        this.w = false;
        this.b = activity;
        this.c = j;
        this.d = str;
        this.z = str2;
        com.meituan.roodesign.resfetcher.runtime.c.a(this.b, "waimai_c_order_confirm_address_invalid", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.roodesign.resfetcher.runtime.b
            public final void a(Drawable drawable, boolean z) {
                Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b2769743718acc7465c0fa91fc849948", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b2769743718acc7465c0fa91fc849948");
                } else {
                    c.this.u = drawable;
                }
            }
        });
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7825e93504c3860bf4e7b3c465140893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7825e93504c3860bf4e7b3c465140893");
        } else {
            this.n = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adbc5ed04fda05b9687a4850935af267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adbc5ed04fda05b9687a4850935af267");
        } else {
            this.c = j;
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c6eb3a9c72457ef7ef0a65dcce6538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c6eb3a9c72457ef7ef0a65dcce6538");
            return;
        }
        this.k = new Dialog(this.b, R.style.wm_order_confirm_address_dialog_style);
        this.y = LayoutInflater.from(this.b).inflate(R.layout.wm_order_confirm_address_dialog_bottom_sheet, (ViewGroup) null);
        Window window = this.k.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = g.a(this.b, 450.0f);
            window.setAttributes(attributes);
        }
        View view = this.y;
        Object[] objArr2 = {view};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "266d3828f081c5729c383e69f6ef951b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "266d3828f081c5729c383e69f6ef951b");
        } else {
            this.l = new d(view);
            this.l.a("c_ykhs39e");
            this.l.a(R.drawable.wm_order_confirm_address_no_address, R.string.wm_order_confirm_address_no_address_list, 0, 0, (View.OnClickListener) null);
            this.l.c(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.6
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bec14c43a287da95942e3fa52f4ce40a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bec14c43a287da95942e3fa52f4ce40a");
                    } else {
                        c.this.a(false, false);
                    }
                }
            });
        }
        View view2 = this.y;
        Object[] objArr3 = {view2};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d807b5834b88ed544262cbd2526b5b7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d807b5834b88ed544262cbd2526b5b7c");
        } else {
            view2.findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.9
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Object[] objArr4 = {view3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c36d4b4f12652f979aeff815267a0dd8", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c36d4b4f12652f979aeff815267a0dd8");
                    } else if (c.this.k != null) {
                        c.this.k.dismiss();
                    }
                }
            });
            view2.findViewById(R.id.layout_info).setBackgroundResource(R.drawable.wm_order_base_dialog_title_bg);
            this.p = view2.findViewById(R.id.add_address_layout);
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.10
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Object[] objArr4 = {view3};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dc6ffd7dbf69c052d0ea6598e1641f4b", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dc6ffd7dbf69c052d0ea6598e1641f4b");
                    } else {
                        com.sankuai.waimai.bussiness.order.base.a.a(c.this.b, c.this.c, c.this.d, c.this.h);
                    }
                }
            });
            this.p.setVisibility(8);
            this.j = (StatisticsRecyclerView) view2.findViewById(R.id.list_address);
            this.j.setLayoutManager(new LinearLayoutManager(this.b, 1, false));
            h<AddressItem> hVar = new h<AddressItem>(this.b, R.layout.wm_order_confirm_address_list_item_layout, null) { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.widget.common.h
                public final /* synthetic */ void a(com.sankuai.waimai.platform.widget.common.b bVar, AddressItem addressItem, int i) {
                    final AddressItem addressItem2 = addressItem;
                    Object[] objArr4 = {bVar, addressItem2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02585dbbab2e4533fcbbbdefb8e4d29e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02585dbbab2e4533fcbbbdefb8e4d29e");
                        return;
                    }
                    final c cVar = c.this;
                    Object[] objArr5 = {bVar, addressItem2, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect5 = c.a;
                    if (PatchProxy.isSupport(objArr5, cVar, changeQuickRedirect5, false, "d06085e5143b2134c98342d43728d779", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, cVar, changeQuickRedirect5, false, "d06085e5143b2134c98342d43728d779");
                    } else if (addressItem2 != null) {
                        TextView textView = (TextView) bVar.a(R.id.incomplete_tip);
                        boolean z = !addressItem2.canShipping();
                        LinearLayout linearLayout = (LinearLayout) bVar.a(R.id.user_info);
                        TextView textView2 = (TextView) bVar.a(R.id.abnormal_address_tips);
                        final TextView textView3 = (TextView) bVar.a(R.id.detail_address);
                        ImageView imageView = (ImageView) bVar.a(R.id.select);
                        if (!z && addressItem2.extraDetail != null && !TextUtils.isEmpty(addressItem2.extraDetail.d)) {
                            linearLayout.setVisibility(8);
                            textView2.setVisibility(0);
                            textView2.setText(addressItem2.extraDetail.d);
                        } else {
                            linearLayout.setVisibility(0);
                            textView2.setVisibility(8);
                            Object[] objArr6 = {linearLayout, addressItem2};
                            ChangeQuickRedirect changeQuickRedirect6 = c.a;
                            if (PatchProxy.isSupport(objArr6, cVar, changeQuickRedirect6, false, "2d72d04d5efe8210b9c46c41a3959db3", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, cVar, changeQuickRedirect6, false, "2d72d04d5efe8210b9c46c41a3959db3");
                            } else {
                                TextView textView4 = (TextView) linearLayout.findViewById(R.id.txt_name);
                                TextView textView5 = (TextView) linearLayout.findViewById(R.id.txt_gender);
                                if (!TextUtils.isEmpty(addressItem2.userName)) {
                                    textView4.setText(addressItem2.userName);
                                    if (!TextUtils.isEmpty(addressItem2.gender)) {
                                        textView5.setText(addressItem2.gender);
                                    } else {
                                        textView5.setText("");
                                    }
                                    textView4.setVisibility(0);
                                    textView5.setVisibility(0);
                                } else {
                                    textView4.setVisibility(8);
                                    textView5.setVisibility(8);
                                }
                                TextView textView6 = (TextView) linearLayout.findViewById(R.id.txt_phone);
                                String str = addressItem2.phone;
                                Object[] objArr7 = {str};
                                ChangeQuickRedirect changeQuickRedirect7 = c.a;
                                if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect7, false, "1fc1b7bfef232dd52bea7a365822b95f", RobustBitConfig.DEFAULT_VALUE)) {
                                    str = (String) PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect7, false, "1fc1b7bfef232dd52bea7a365822b95f");
                                } else if (!TextUtils.isEmpty(str) && str.contains(CommonConstant.Symbol.UNDERLINE)) {
                                    str = "+" + str.replaceAll(CommonConstant.Symbol.UNDERLINE, StringUtil.SPACE);
                                }
                                ah.a(textView6, str);
                            }
                        }
                        if (!TextUtils.isEmpty(addressItem2.addrBrief)) {
                            final String str2 = addressItem2.addrBrief + StringUtil.SPACE + addressItem2.addrBuildingNum;
                            if (!TextUtils.isEmpty(addressItem2.categoryIcon)) {
                                String str3 = addressItem2.categoryIcon;
                                Object[] objArr8 = {textView3, str2, str3};
                                ChangeQuickRedirect changeQuickRedirect8 = c.a;
                                if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "cc30c4177d0411b686d685f816c45d3e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "cc30c4177d0411b686d685f816c45d3e");
                                } else if (!TextUtils.isEmpty(str3)) {
                                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                                    a2.b = cVar.b;
                                    a2.c = str3;
                                    a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.4
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                        public final void a(Bitmap bitmap) {
                                            Object[] objArr9 = {bitmap};
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "e40ea573e706e83274fd25e38d137048", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "e40ea573e706e83274fd25e38d137048");
                                                return;
                                            }
                                            try {
                                                if (textView3 == null || TextUtils.isEmpty(str2)) {
                                                    return;
                                                }
                                                BitmapDrawable bitmapDrawable = new BitmapDrawable(c.this.b.getResources(), bitmap);
                                                int a3 = g.a(c.this.b, 18.0f);
                                                bitmapDrawable.setBounds(0, 0, (int) (a3 * (bitmapDrawable.getIntrinsicWidth() / bitmapDrawable.getIntrinsicHeight())), a3);
                                                com.sankuai.waimai.addrsdk.view.a aVar = new com.sankuai.waimai.addrsdk.view.a(bitmapDrawable);
                                                SpannableString spannableString = new SpannableString("     " + str2);
                                                spannableString.setSpan(aVar, 0, 4, 33);
                                                textView3.setText(spannableString);
                                            } catch (Throwable unused) {
                                                textView3.setText(str2);
                                            }
                                        }

                                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                                        public final void a() {
                                            Object[] objArr9 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect9 = a;
                                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "debf38aea8165446673929a327819c90", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "debf38aea8165446673929a327819c90");
                                            } else {
                                                textView3.setText(str2);
                                            }
                                        }
                                    });
                                }
                            } else {
                                textView3.setText(str2);
                            }
                            textView3.setVisibility(0);
                        } else {
                            textView3.setVisibility(8);
                        }
                        ((ImageView) bVar.a(R.id.edit)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.3
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                Object[] objArr9 = {view3};
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "05a0e0864d97bcf7bc018c5cf523178b", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "05a0e0864d97bcf7bc018c5cf523178b");
                                    return;
                                }
                                int a3 = c.this.a(addressItem2);
                                if (a3 != -1) {
                                    JudasManualManager.a a4 = JudasManualManager.a("b_waimai_09gjnqkt_mc");
                                    JudasManualManager.a a5 = a4.a(GearsLocator.ADDRESS, addressItem2.addrBrief + addressItem2.addrBuildingNum);
                                    a5.a("add_poi", addressItem2.lng + CommonConstant.Symbol.COMMA + addressItem2.lat).a("abnormal_type", a3).a("c_ykhs39e").a(c.this.b).a();
                                } else {
                                    JudasManualManager.a a6 = JudasManualManager.a("b_waimai_09gjnqkt_mc");
                                    JudasManualManager.a a7 = a6.a(GearsLocator.ADDRESS, addressItem2.addrBrief + addressItem2.addrBuildingNum);
                                    a7.a("add_poi", addressItem2.lng + CommonConstant.Symbol.COMMA + addressItem2.lat).a("c_ykhs39e").a(c.this.b).a();
                                }
                                com.sankuai.waimai.bussiness.order.base.a.a(c.this.b, AddressScene.DEFAULT_SCENE, addressItem2, c.this.c, c.this.d, c.this.h);
                            }
                        });
                        boolean z2 = addressItem2.addressType != 1 && (addressItem2.bindType < 11 || addressItem2.lat == 0 || addressItem2.lng == 0);
                        if (z2) {
                            textView.setVisibility(0);
                        } else {
                            textView.setVisibility(8);
                        }
                        boolean z3 = (z || addressItem2.extraDetail == null || addressItem2.extraDetail.c != 7103) ? false : true;
                        if ((z2 || z || z3) ? false : true) {
                            textView3.setTextColor(cVar.b.getResources().getColor(R.color.wm_common_text_title));
                            imageView.setVisibility(0);
                        } else if (z3) {
                            textView3.setTextColor(cVar.b.getResources().getColor(R.color.wm_common_text_hint_invalid));
                            imageView.setVisibility(0);
                            if (cVar.u != null) {
                                imageView.setImageDrawable(cVar.u);
                            } else {
                                imageView.setImageResource(R.drawable.wm_order_confirm_address_unselected);
                                imageView.setContentDescription("");
                            }
                        } else {
                            imageView.setVisibility(4);
                            textView3.setTextColor(cVar.b.getResources().getColor(R.color.wm_common_text_hint));
                        }
                        if (addressItem2.id == cVar.n) {
                            if (!addressItem2.canShipping()) {
                                com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.b);
                                imageView.setImageResource(R.drawable.wm_order_confirm_address_unselected);
                                imageView.setContentDescription("");
                            } else if (z3) {
                                com.sankuai.waimai.platform.domain.manager.location.a.b(cVar.b);
                            } else {
                                cVar.q = addressItem2;
                                imageView.setImageResource(R.drawable.wm_order_confirm_address_select);
                                imageView.setContentDescription(cVar.b.getResources().getString(R.string.wm_order_confirm_address_dialog_chooseed_status));
                            }
                        } else if (!z3) {
                            imageView.setImageResource(R.drawable.wm_order_confirm_address_unselected);
                            imageView.setContentDescription("");
                        }
                        TextView textView7 = (TextView) bVar.a(R.id.out_of_range);
                        if (addressItem2.mFlagNotInRang == 1) {
                            textView7.setVisibility(0);
                        } else {
                            textView7.setVisibility(8);
                        }
                        TextView textView8 = (TextView) bVar.a(R.id.txt_not_in_range_detail);
                        if (!z2 && z && !TextUtils.isEmpty(addressItem2.addressRangeTip)) {
                            textView8.setText(addressItem2.addressRangeTip);
                            textView8.setVisibility(0);
                            return;
                        }
                        textView8.setVisibility(8);
                    }
                }
            };
            this.m = new com.sankuai.waimai.platform.widget.common.c<>(hVar);
            this.j.setAdapter(this.m);
            hVar.a(new AnonymousClass12());
        }
        this.k.setContentView(this.y);
        this.k.show();
        a(false, false);
        this.k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.5
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr4 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "02e88d3c6d47619f21fea4b55fc848b8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "02e88d3c6d47619f21fea4b55fc848b8");
                    return;
                }
                c.this.c();
                c.this.v = false;
            }
        });
    }

    void a(final boolean z, final boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c2d031b6b3697abff2b402134e1ba8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c2d031b6b3697abff2b402134e1ba8d");
            return;
        }
        if (this.l != null) {
            this.l.a(true).b("");
        }
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        if (b != null) {
            String k = b.k();
            String l = b.l();
            if (!TextUtils.isEmpty(k) && !TextUtils.isEmpty(l)) {
                this.A = k + CommonConstant.Symbol.MINUS + l + "-1";
            }
        }
        int i = this.s != null ? this.s.addressBizId : 0;
        int i2 = this.s != null ? this.s.addressMode : 0;
        int i3 = this.s != null ? this.s.addressUsingType : 0;
        WmAddress k2 = com.sankuai.waimai.foundation.location.v2.g.a().k();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((UserAddressAPI) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) UserAddressAPI.class)).fetchNewHistoryAddressNew("2", String.valueOf(this.c), this.d, this.e, this.f, this.A, i, i2, i3, this.g, k2 != null ? k2.getAddress() : null, 1, this.t), new b.AbstractC1042b<NewHistoryAddressResponse>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.7
            public static ChangeQuickRedirect a;

            /* JADX WARN: Removed duplicated region for block: B:83:0x022e  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0242  */
            @Override // rx.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void onNext(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 832
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.AnonymousClass7.onNext(java.lang.Object):void");
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "089af8ceb4dfa123d213834c03cef86d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "089af8ceb4dfa123d213834c03cef86d");
                } else if (c.this.b == null || c.this.b.isFinishing() || c.this.k == null || !c.this.k.isShowing()) {
                } else {
                    c.a(c.this);
                    if ((c.this.m == null || c.this.m.getItemCount() <= 0) && c.this.l != null) {
                        c.this.l.g();
                    } else if (c.this.p != null) {
                        c.this.p.setVisibility(0);
                    }
                    c.a(c.this, c.this.b.getResources().getString(R.string.wm_order_confirm_data_error_try_afterwhile));
                }
            }
        }, this.z);
    }

    long a(List<AddressItem> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e08ef949734a7c31b3674c9d7157dcf5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e08ef949734a7c31b3674c9d7157dcf5")).longValue();
        }
        if (j <= -1 || com.sankuai.waimai.foundation.utils.d.a(list)) {
            return -1L;
        }
        for (AddressItem addressItem : list) {
            if (addressItem.id == j) {
                if (addressItem.canShipping() && addressItem.mFlagNeedComplate <= 0) {
                    list.remove(addressItem);
                    list.add(0, addressItem);
                    return 0L;
                }
                return addressItem.id;
            }
        }
        return -1L;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c$12  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass12 implements f.a<AddressItem> {
        public static ChangeQuickRedirect a;

        public AnonymousClass12() {
        }

        @Override // com.sankuai.waimai.platform.widget.common.f.a
        public final /* synthetic */ boolean a(View view, AddressItem addressItem, final int i) {
            Object[] objArr = {view, addressItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2bbd0a114af6fd23684fc853363058d", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2bbd0a114af6fd23684fc853363058d")).booleanValue();
            }
            new CustomDialog.a(c.this.b).d(R.string.wm_order_confirm_list_delete_address_msg).a(R.string.wm_order_base_delete, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.12.4
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    int c;
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57890214f3942b2c7f99733b6e954991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57890214f3942b2c7f99733b6e954991");
                    } else if (c.this.m != null && i >= (c = c.this.m.c()) && i - c < c.this.m.getItemCount()) {
                        AddressItem addressItem2 = c.this.m.a().get(i - c);
                        if (c.this.l != null) {
                            c.this.l.a(true).b("");
                        }
                        AddressApiManager addressApiManager = AddressApiManager.getInstance();
                        StringBuilder sb = new StringBuilder();
                        sb.append(addressItem2.id);
                        addressApiManager.delect(sb.toString(), new com.sankuai.waimai.addrsdk.mvp.model.d() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.12.4.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                            public final void a(Object obj) {
                                Object[] objArr3 = {obj};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bb509737aed8afcb83c084c0a2fe60ca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bb509737aed8afcb83c084c0a2fe60ca");
                                } else if (c.this.b == null || c.this.b.isFinishing() || c.this.l == null) {
                                } else {
                                    c.this.l.h();
                                }
                            }

                            @Override // com.sankuai.waimai.addrsdk.mvp.model.d
                            public final void b(Object obj) {
                                Object[] objArr3 = {obj};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1fdb30984faef474b9a49849be50ae35", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1fdb30984faef474b9a49849be50ae35");
                                } else if (c.this.b == null || c.this.b.isFinishing()) {
                                } else {
                                    if (c.this.l != null) {
                                        c.this.l.h();
                                    }
                                    c.this.a(false, false);
                                }
                            }
                        });
                    }
                }
            }).b(R.string.wm_order_base_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.12.3
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    Object[] objArr2 = {dialogInterface, Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "206b5e4906a884f489fce43cc34b0a01", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "206b5e4906a884f489fce43cc34b0a01");
                    } else {
                        dialogInterface.dismiss();
                    }
                }
            }).a(false).b();
            return true;
        }

        @Override // com.sankuai.waimai.platform.widget.common.f.a
        public final /* synthetic */ void b(final View view, AddressItem addressItem, int i) {
            int c;
            int i2;
            boolean z = false;
            Object[] objArr = {view, addressItem, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8982270e1c5650e330a2dbb8080fe5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8982270e1c5650e330a2dbb8080fe5");
            } else if (c.this.m == null || i < (c = c.this.m.c()) || (i2 = i - c) >= c.this.m.getItemCount()) {
            } else {
                final AddressItem addressItem2 = c.this.m.a().get(i2);
                if (addressItem2 != null) {
                    int a2 = c.this.a(addressItem2);
                    if (a2 != -1) {
                        JudasManualManager.a a3 = JudasManualManager.a("b_waimai_zfo7ciwm_mc");
                        JudasManualManager.a a4 = a3.a(GearsLocator.ADDRESS, addressItem2.addrBrief + addressItem2.addrBuildingNum);
                        a4.a("add_poi", addressItem2.lng + CommonConstant.Symbol.COMMA + addressItem2.lat).a("abnormal_type", a2).a("c_ykhs39e").a(c.this.b).a();
                    } else {
                        JudasManualManager.a a5 = JudasManualManager.a("b_waimai_zfo7ciwm_mc");
                        JudasManualManager.a a6 = a5.a(GearsLocator.ADDRESS, addressItem2.addrBrief + addressItem2.addrBuildingNum);
                        a6.a("add_poi", addressItem2.lng + CommonConstant.Symbol.COMMA + addressItem2.lat).a("c_ykhs39e").a(c.this.b).a();
                    }
                }
                if (addressItem2 != null) {
                    if (addressItem2.extraDetail != null && addressItem2.extraDetail.c == 7103) {
                        z = true;
                    }
                    if (!addressItem2.canShipping() && addressItem2.bindType >= 11 && addressItem2.lat != 0 && addressItem2.lng != 0) {
                        new CustomDialog.a(c.this.b).c(R.string.wm_order_confirm_address_main_title_2).d(R.string.wm_order_confirm_address_sub_title_2).b(R.drawable.wm_order_confirm_address_not_in_range_2).a(R.string.wm_order_confirm_address_go_to_map, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.12.2
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1eb1076009e8356b48e01c15b9656af6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1eb1076009e8356b48e01c15b9656af6");
                                } else {
                                    c.a(c.this, view, addressItem2);
                                }
                            }
                        }).b(R.string.wm_order_confirm_address_dialog_btn_cancel, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.controller.c.12.1
                            public static ChangeQuickRedirect a;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                Object[] objArr2 = {dialogInterface, Integer.valueOf(i3)};
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "da7d65a1c28d2124a9f28794b7206674", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "da7d65a1c28d2124a9f28794b7206674");
                                }
                            }
                        }).a(true).b();
                    } else if (z) {
                    } else {
                        c.a(c.this, view, addressItem2);
                    }
                }
            }
        }
    }

    public final void a(int i, int i2, Intent intent) {
        boolean a2;
        AddressBean addressBean;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3e3fe029ef0f71aacc8f9ff8ee6381d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3e3fe029ef0f71aacc8f9ff8ee6381d");
        } else if (i == 1002) {
            int i3 = -1;
            if (i2 == -1) {
                String str = "";
                String str2 = "";
                if (intent != null) {
                    str = com.sankuai.waimai.platform.utils.f.a(intent, "resultData");
                    str2 = com.sankuai.waimai.platform.utils.f.a(intent, "appId");
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && "be7dcad4cf774fed".equals(str2)) {
                    try {
                        AddressBackInfo addressBackInfo = (AddressBackInfo) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(str, (Class<Object>) AddressBackInfo.class);
                        if (addressBackInfo != null) {
                            i3 = addressBackInfo.addressOperateType;
                            a2 = addressBackInfo.forceSave;
                            addressBean = addressBackInfo.address;
                        } else {
                            addressBean = null;
                            a2 = false;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                } else {
                    i3 = com.sankuai.waimai.platform.utils.f.a(intent, "waimai_addrsdk_address_operate_type", -1);
                    a2 = com.sankuai.waimai.platform.utils.f.a(intent, "waimai_addrsdk_force_save", false);
                    Serializable c = com.sankuai.waimai.platform.utils.f.c(intent, "waimai_addrsdk_address");
                    if (!(c instanceof AddressBean)) {
                        return;
                    }
                    addressBean = (AddressBean) c;
                }
                if (!a2 && (i3 == 202 || i3 == 203)) {
                    try {
                        this.n = Long.parseLong(addressBean.getAddressViewId());
                    } catch (Exception unused) {
                    }
                    this.q = com.sankuai.waimai.platform.domain.manager.location.a.a(addressBean);
                    this.w = true;
                    if (b()) {
                        this.k.dismiss();
                        return;
                    } else {
                        c();
                        return;
                    }
                }
                if (i3 != 204) {
                    a(i3 != 201, a2);
                }
                this.w = false;
            }
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4edcc1030112f8051795df1247444980", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4edcc1030112f8051795df1247444980")).booleanValue() : this.k != null && this.k.isShowing();
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00458668768e7514830c177d12eba80e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00458668768e7514830c177d12eba80e");
            return;
        }
        if (this.q != null) {
            com.sankuai.waimai.platform.domain.manager.location.a.b(this.b, this.q);
        }
        if (this.x != null) {
            this.x.a(this.q);
        }
        this.o = null;
        this.j = null;
        this.m = null;
        this.l = null;
        this.k = null;
        this.q = null;
        this.n = -1L;
    }

    public final int a(AddressItem addressItem) {
        Object[] objArr = {addressItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c8dc49d7a430a04bb0a51f1ab6aea2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c8dc49d7a430a04bb0a51f1ab6aea2")).intValue();
        }
        if (addressItem == null || addressItem.extraDetail == null) {
            return -1;
        }
        if (addressItem.extraDetail.b == -1 && addressItem.extraDetail.b == 0) {
            switch (addressItem.extraDetail.c) {
                case AddressBean.POI_ERROR_ADDRESS /* 7101 */:
                    return 1;
                case AddressBean.ABNORMAL_HOUSE_ADDRESS /* 7102 */:
                    return 2;
                case AddressBean.INVALID_CABINET_ADDRESS /* 7103 */:
                    return 0;
                default:
                    return -1;
            }
        }
        return addressItem.extraDetail.b;
    }
}
