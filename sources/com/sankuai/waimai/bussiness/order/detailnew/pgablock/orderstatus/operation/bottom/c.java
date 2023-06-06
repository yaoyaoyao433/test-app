package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.utils.p;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.a implements a.InterfaceC0922a {
    public static ChangeQuickRedirect h;
    final com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a i;
    private View j;
    private LinearLayout k;
    private final a l;
    private final d m;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_status_bottom_operation_buttons_layout;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480a68ae415b138142cad79d8786f7b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480a68ae415b138142cad79d8786f7b5");
            return;
        }
        this.l = new a(context);
        this.i = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a(context);
        this.i.b = "c_hgowsqb";
        this.i.e = this;
        this.m = new d(context);
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f990f5568983f0ab68b1dc59705caf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f990f5568983f0ab68b1dc59705caf");
        } else {
            this.j.setVisibility(8);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224c82c68ba7855ce7481b762ea3fee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224c82c68ba7855ce7481b762ea3fee6");
            return;
        }
        this.j = this.b.findViewById(R.id.root_view);
        this.k = (LinearLayout) this.b.findViewById(R.id.button_list_view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
        if (r4 <= r0) goto L30;
     */
    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo r21) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.c.a(com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo):void");
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48ba94356d4fec5ebc1dfa3c0b69bc6d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48ba94356d4fec5ebc1dfa3c0b69bc6d");
            return;
        }
        i();
        j();
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60861bb06d6e9341776796153e79fc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60861bb06d6e9341776796153e79fc12");
            return;
        }
        List<ButtonItem> a2 = a.a(this.l);
        p.b(this.i);
        this.m.a();
        this.k.removeAllViews();
        if (com.sankuai.waimai.foundation.utils.b.b(a2)) {
            return;
        }
        int measuredWidth = ((this.k.getMeasuredWidth() - this.k.getPaddingLeft()) - this.k.getPaddingRight()) / a.b(this.l);
        int size = a2.size();
        if (measuredWidth <= 0 || size <= measuredWidth) {
            a(a2, size - 1);
            return;
        }
        int i = measuredWidth - 2;
        final ArrayList arrayList = new ArrayList();
        for (int i2 = i + 1; i2 < size; i2++) {
            arrayList.add(a2.get(i2));
        }
        View a3 = a.a(this.l, this.c);
        a3.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "463df4ff48680c08c00f0fbb45e52c64", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "463df4ff48680c08c00f0fbb45e52c64");
                } else if (c.this.i.isShowing()) {
                } else {
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a aVar = c.this.i;
                    long j = c.this.e.logicInfo.c;
                    Object[] objArr3 = {new Long(j)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "a5645ab1b8cebd9089ace49ce6d83ba6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "a5645ab1b8cebd9089ace49ce6d83ba6");
                    } else {
                        aVar.c = j;
                    }
                    c.this.i.d = c.this.e.logicInfo.d;
                    c.this.i.a(c.this.e.trackingInfo, view, arrayList);
                }
            }
        });
        this.k.addView(a3);
        a(a2, i);
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3d1b4095b1cde4105ba41c5a22b5e3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3d1b4095b1cde4105ba41c5a22b5e3a");
        } else {
            this.j.findViewById(R.id.top_divider).setVisibility(this.k.getChildCount() <= 0 ? 8 : 0);
        }
    }

    private void a(@NonNull List<ButtonItem> list, int i) {
        View a2;
        Object[] objArr = {list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "363b91a617f391ac0ea91f4896900ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "363b91a617f391ac0ea91f4896900ae6");
            return;
        }
        for (int i2 = 0; i2 <= i; i2++) {
            final ButtonItem buttonItem = list.get(i2);
            if (buttonItem != null && (a2 = this.l.a(this.k.getContext(), buttonItem, (View) null, this.k)) != null) {
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.c.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d47e3faf8d83776c61ef8f1e79609062", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d47e3faf8d83776c61ef8f1e79609062");
                        } else {
                            c.this.g.a(buttonItem, 1);
                        }
                    }
                });
                if (buttonItem.code == 2001 && !TextUtils.isEmpty(buttonItem.toast)) {
                    View a3 = a(a2);
                    this.k.addView(a3);
                    this.m.a(a3, buttonItem.toast);
                } else {
                    this.k.addView(a2);
                }
            }
        }
    }

    private View a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42ebef99ec3ebc1e4092fa96e2cb02e2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42ebef99ec3ebc1e4092fa96e2cb02e2");
        }
        LinearLayout linearLayout = new LinearLayout(this.c);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setLayoutDirection(0);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        final ImageView imageView = new ImageView(this.c);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(g.a(this.c, 6.0f), g.a(this.c, 3.0f));
        layoutParams2.bottomMargin = g.a(this.c, 4.0f);
        layoutParams2.gravity = 17;
        imageView.setLayoutParams(layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setAdjustViewBounds(true);
        linearLayout.addView(imageView);
        linearLayout.addView(view);
        com.meituan.roodesign.resfetcher.runtime.c.a(this.c, "waimai_c_restaurant_food_detail_arrow_down", new com.meituan.roodesign.resfetcher.runtime.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.roodesign.resfetcher.runtime.b
            public final void a(Drawable drawable, boolean z) {
                Object[] objArr2 = {drawable, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49aae79f8bcfe29a438208fdcfe1f31d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49aae79f8bcfe29a438208fdcfe1f31d");
                } else {
                    imageView.setBackground(drawable);
                }
            }
        });
        return linearLayout;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.a, com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.a.InterfaceC0921a
    public final void a(int i, boolean z) {
        boolean b;
        Object[] objArr = {2048, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb3b6d0cddd1e6fbc103d75e98e49d81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb3b6d0cddd1e6fbc103d75e98e49d81");
            return;
        }
        if (z) {
            b = a.a(this.l, 2048);
        } else {
            b = a.b(this.l, 2048);
        }
        if (b) {
            h();
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.a.InterfaceC0922a
    public final void a(View view, ButtonItem buttonItem) {
        Object[] objArr = {view, buttonItem};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c35bc445e7253f992bacef5fa3c3673", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c35bc445e7253f992bacef5fa3c3673");
        } else {
            this.g.a(buttonItem, 1);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "216828d4c7d0bae2423cc89b6b04e84f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "216828d4c7d0bae2423cc89b6b04e84f");
        } else {
            this.j.setVisibility(this.k.getChildCount() <= 0 ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.b {
        public static ChangeQuickRedirect f;
        private final List<ButtonItem> g;

        public static /* synthetic */ View a(a aVar, Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "281e2ecccac7b0f47e897d01e9c2a567", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "281e2ecccac7b0f47e897d01e9c2a567");
            }
            TextView a = aVar.a(context);
            a.setText(R.string.wm_order_detail_operation_button_more);
            a.setBackgroundResource(R.drawable.wm_order_list_button_disable_highlight_shape);
            return a;
        }

        public static /* synthetic */ List a(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a8664f7c4df5009e81c9d4e16b511fdf", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a8664f7c4df5009e81c9d4e16b511fdf");
            }
            ArrayList arrayList = new ArrayList();
            if (!com.sankuai.waimai.foundation.utils.b.b(aVar.c)) {
                for (ButtonItem buttonItem : aVar.c) {
                    if (!aVar.g.contains(buttonItem)) {
                        arrayList.add(buttonItem);
                    }
                }
            }
            return arrayList;
        }

        public static /* synthetic */ boolean a(a aVar, int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5087192629d778108b2632471e1e5ab0", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5087192629d778108b2632471e1e5ab0")).booleanValue();
            }
            if (!com.sankuai.waimai.foundation.utils.b.b(aVar.c)) {
                for (ButtonItem buttonItem : aVar.c) {
                    if (buttonItem != null && i == buttonItem.code && aVar.g.contains(buttonItem)) {
                        aVar.g.remove(buttonItem);
                        return true;
                    }
                }
            }
            return false;
        }

        public static /* synthetic */ int b(a aVar) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            return PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c21ce669987023445b06c4553b168614", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c21ce669987023445b06c4553b168614")).intValue() : aVar.a() + aVar.b();
        }

        public static /* synthetic */ boolean b(a aVar, int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "730ce5761dcd5403ba843a3fc71b6576", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "730ce5761dcd5403ba843a3fc71b6576")).booleanValue();
            }
            if (!com.sankuai.waimai.foundation.utils.b.b(aVar.c)) {
                for (ButtonItem buttonItem : aVar.c) {
                    if (buttonItem != null && i == buttonItem.code && !aVar.g.contains(buttonItem)) {
                        aVar.g.add(buttonItem);
                        return true;
                    }
                }
            }
            return false;
        }

        public a(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4193a96913d7a37fb27d9b380876b37e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4193a96913d7a37fb27d9b380876b37e");
            } else {
                this.g = new ArrayList();
            }
        }

        @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.b
        public final View b(Context context, ButtonItem buttonItem, View view, ViewGroup viewGroup) {
            Object[] objArr = {context, buttonItem, view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b98731509a67de021bde0418adcb036", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b98731509a67de021bde0418adcb036");
            }
            TextView a = a(context);
            a.setText(buttonItem.title);
            TextPaint paint = a.getPaint();
            if (buttonItem.isHighLight()) {
                a.setBackgroundResource(R.drawable.wm_order_list_button_enable_unselected_highlight_shape);
                paint.setFakeBoldText(true);
            } else {
                a.setBackgroundResource(R.drawable.wm_order_list_button_disable_highlight_shape);
                paint.setFakeBoldText(false);
            }
            return a;
        }

        private TextView a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69ddb372616156894645f9a10cb11005", RobustBitConfig.DEFAULT_VALUE)) {
                return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69ddb372616156894645f9a10cb11005");
            }
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a(), -2);
            int b = b() / 2;
            layoutParams.leftMargin = b;
            layoutParams.rightMargin = b;
            textView.setLayoutParams(layoutParams);
            textView.setTextSize(14.0f);
            textView.setMaxEms(4);
            int a = g.a(this.b, 6.0f);
            textView.setPadding(0, a, 0, a);
            textView.setEllipsize(TextUtils.TruncateAt.valueOf("END"));
            textView.setMaxLines(1);
            textView.setTextColor(-13421773);
            textView.setGravity(17);
            return textView;
        }

        @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.base.b
        public final void a(List<ButtonItem> list, OrderStatusButtonListInfo orderStatusButtonListInfo, String str, String str2, String str3, boolean z, int i, int i2, ViewGroup viewGroup) {
            Object[] objArr = {list, orderStatusButtonListInfo, str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), viewGroup};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537a7936c1c4bda145e50f44d263c678", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537a7936c1c4bda145e50f44d263c678");
                return;
            }
            super.a(list, orderStatusButtonListInfo, str, str2, str3, z, i, i2, viewGroup);
            this.g.clear();
        }

        private int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62d142cd819a0fc6cde46a5099f743eb", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62d142cd819a0fc6cde46a5099f743eb")).intValue() : g.a(this.b, 74.0f);
        }

        private int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47c975b58d13d7f70244487ae7a84509", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47c975b58d13d7f70244487ae7a84509")).intValue() : g.a(this.b, 10.0f);
        }
    }
}
