package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.foundation.utils.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a b;
    public View c;
    public View d;
    public Context e;
    public ViewGroup f;
    public Map<String, Object> g;
    public Map<String, Object> h;
    public com.sankuai.waimai.bussiness.order.rocks.d i;

    public d(Context context, com.sankuai.waimai.bussiness.order.rocks.d dVar, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        Object[] objArr = {context, dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4954e357b261e944f9e0e901ce05c8ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4954e357b261e944f9e0e901ce05c8ea");
            return;
        }
        this.e = context;
        this.i = dVar;
        this.b = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a(context, aVar);
        this.i.aP.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a8869caa3cd0520b307c2d1046a9eba", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a8869caa3cd0520b307c2d1046a9eba") : d.this.b;
            }
        };
    }

    public ButtonItem a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6089cbf934f479471a8a8ad6027d936", RobustBitConfig.DEFAULT_VALUE)) {
            return (ButtonItem) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6089cbf934f479471a8a8ad6027d936");
        }
        ButtonItem buttonItem = new ButtonItem();
        StringBuilder sb = new StringBuilder();
        sb.append(map.get("code"));
        buttonItem.code = r.a(sb.toString(), 0);
        if (map.containsKey("click_url")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(map.get("click_url"));
            buttonItem.clickUrl = sb2.toString();
        }
        if (map.containsKey("title")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(map.get("title"));
            buttonItem.title = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(map.get("highlight"));
        buttonItem.highLight = r.a(sb4.toString(), 0);
        if (map.containsKey("icon_url")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(map.get("icon_url"));
            buttonItem.iconUrl = sb5.toString();
        }
        if (map.containsKey("button_icon")) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(map.get("button_icon"));
            buttonItem.buttonIcon = sb6.toString();
        }
        if (map.containsKey("sub_title")) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(map.get("sub_title"));
            buttonItem.subTitle = sb7.toString();
        }
        if (map.containsKey("pop_up_info")) {
            buttonItem.mPopUpInfo = (Map) map.get("pop_up_info");
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(map.get("action"));
        buttonItem.action = r.a(sb8.toString(), 0);
        List<Map<String, Object>> list = (List) map.get("sub_label_list");
        if (!CollectionUtils.isEmpty(list)) {
            ArrayList arrayList = new ArrayList();
            for (Map<String, Object> map2 : list) {
                arrayList.add(b(map2));
            }
            buttonItem.mSubLabelList = arrayList;
        }
        return buttonItem;
    }

    private ButtonItem.a b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2da474b5de6be4916f197cdc05b1f4a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ButtonItem.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2da474b5de6be4916f197cdc05b1f4a");
        }
        ButtonItem.a aVar = new ButtonItem.a();
        StringBuilder sb = new StringBuilder();
        sb.append(map.get("code"));
        aVar.a = r.a(sb.toString(), 0);
        if (map.containsKey("click_url")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(map.get("click_url"));
            aVar.e = sb2.toString();
        }
        if (map.containsKey("title")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(map.get("title"));
            aVar.b = sb3.toString();
        }
        if (map.containsKey("desc")) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(map.get("desc"));
            aVar.c = sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(map.get("highlight"));
        aVar.d = r.a(sb5.toString(), 0);
        if (map.containsKey("icon_url")) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(map.get("icon_url"));
            aVar.f = sb6.toString();
        }
        return aVar;
    }

    public void a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aabe13c995ce2fd9e5a3ac5e4147375", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aabe13c995ce2fd9e5a3ac5e4147375");
        } else if (this.g == null || this.f == null) {
        } else {
            Map<String, Object> map = this.g;
            ViewGroup viewGroup = this.f;
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("desc"));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(map.get("btnRow"));
            int a2 = r.a(sb3.toString(), 0);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(map.get("btnCol"));
            int a3 = r.a(sb4.toString(), 0);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(map.get("btnRowCount"));
            int a4 = r.a(sb5.toString(), 0);
            StringBuilder sb6 = new StringBuilder();
            sb6.append(map.get("btnRows"));
            int a5 = r.a(sb6.toString(), 0);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(map.get("hasMoreBtn"));
            boolean parseBoolean = Boolean.parseBoolean(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(map.get("showTime"));
            int a6 = r.a(sb8.toString(), 0);
            this.c = viewGroup.findViewById(R.id.order_status_bubble_layout);
            this.c.setVisibility(0);
            TextView textView = (TextView) this.c.findViewById(R.id.tv_order_status_bubble_msg);
            ImageView imageView = (ImageView) this.c.findViewById(R.id.iv_bubble_arrow);
            textView.setText(sb2);
            int a7 = com.sankuai.waimai.foundation.utils.g.a(this.e);
            int a8 = com.sankuai.waimai.foundation.utils.g.a(this.e, 12.0f);
            int a9 = com.sankuai.waimai.foundation.utils.g.a(this.e, 6.0f);
            int a10 = com.sankuai.waimai.foundation.utils.g.a(this.e, 8.0f);
            int a11 = com.sankuai.waimai.foundation.utils.g.a(this.e, 55.0f);
            int a12 = com.sankuai.waimai.foundation.utils.g.a(this.e, 42.0f);
            int a13 = com.sankuai.waimai.foundation.utils.g.a(this.e, 10.0f);
            int a14 = com.sankuai.waimai.foundation.utils.g.a(this.e, 9.0f);
            int i6 = a7 - ((a8 + a9) * 2);
            if (a5 == 1 && parseBoolean) {
                i2 = i6 - a12;
                a4--;
                i = a9;
            } else {
                i = a9;
                i2 = i6;
            }
            double d = (i2 * 1.0d) / a4;
            int round = (int) Math.round((a3 * d) + (d / 2.0d));
            int min = Math.min(a(sb2, com.sankuai.waimai.foundation.utils.g.d(this.e, 14.0f)) + (com.sankuai.waimai.foundation.utils.g.a(this.e, 12.0f) * 2), i6);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            int i7 = round + i + a8;
            int i8 = a7 / 2;
            if (i7 < i8) {
                layoutParams.leftMargin = round - (a14 / 2);
                a(layoutParams, 9);
                a(layoutParams2, 9);
                i5 = 3;
                int i9 = min / 2;
                if (i9 > round) {
                    i3 = i;
                } else {
                    a(layoutParams, 14);
                    i3 = round - i9;
                }
                i4 = i;
            } else if (i7 > i8) {
                layoutParams.rightMargin = (i6 - round) - (a14 / 2);
                a(layoutParams, 11);
                a(layoutParams2, 11);
                i5 = 5;
                int i10 = min / 2;
                int i11 = i2 - round;
                if (i10 > i11) {
                    i4 = i;
                    i3 = i4;
                } else {
                    a(layoutParams, 14);
                    i4 = i11 - i10;
                    i3 = i;
                }
            } else {
                i3 = i;
                layoutParams.leftMargin = i3;
                layoutParams.rightMargin = i3;
                a(layoutParams, 14);
                a(layoutParams2, 14);
                i4 = i3;
                i5 = 1;
            }
            textView.setLayoutParams(layoutParams2);
            imageView.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams3.leftMargin = i3;
            layoutParams3.rightMargin = i4;
            layoutParams3.bottomMargin = ((a11 * (a5 - a2)) - a10) + a13 + c();
            layoutParams3.gravity = i5 | 80;
            this.c.setLayoutParams(layoutParams3);
            if (a6 > 0) {
                this.c.postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ded5b7d2ec5456689fdcb9b89a3ac628", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ded5b7d2ec5456689fdcb9b89a3ac628");
                        } else {
                            d.this.c.setVisibility(8);
                        }
                    }
                }, a6 * 1000);
            }
            this.g = null;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37fe5b090a182aaeb4159c1ca44c09ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37fe5b090a182aaeb4159c1ca44c09ca");
            return;
        }
        if (this.c != null && this.c.isShown()) {
            this.c.setVisibility(8);
        }
        if (this.d != null) {
            this.d.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87878fc265e2f917137ab281baa0ec3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87878fc265e2f917137ab281baa0ec3")).intValue();
        }
        if (this.i == null) {
            return 0;
        }
        return this.i.aO.a().c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(RelativeLayout.LayoutParams layoutParams, int i) {
        Object[] objArr = {layoutParams, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "044eb5c31ad9174c5112a418b172b2d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "044eb5c31ad9174c5112a418b172b2d6");
        } else if (i == 9) {
            layoutParams.addRule(9, -1);
            layoutParams.removeRule(14);
            layoutParams.removeRule(11);
        } else if (i == 11) {
            layoutParams.addRule(11, -1);
            layoutParams.removeRule(9);
            layoutParams.removeRule(14);
        } else if (i != 14) {
        } else {
            layoutParams.addRule(14, -1);
            layoutParams.removeRule(9);
            layoutParams.removeRule(11);
        }
    }

    private int a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1734360623f74cf2685731545fd7e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1734360623f74cf2685731545fd7e9a")).intValue();
        }
        Paint paint = new Paint();
        paint.setTextSize(i);
        paint.setTypeface(Typeface.DEFAULT);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.width();
    }
}
