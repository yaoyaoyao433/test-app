package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final d b;
    private final LinearLayout c;
    private final Map d;
    private final ImageView e;

    private g(d dVar, LinearLayout linearLayout, Map map, ImageView imageView) {
        this.b = dVar;
        this.c = linearLayout;
        this.d = map;
        this.e = imageView;
    }

    public static Runnable a(d dVar, LinearLayout linearLayout, Map map, ImageView imageView) {
        Object[] objArr = {dVar, linearLayout, map, imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96a1205103fa04d692e0a8a8e7961f49", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96a1205103fa04d692e0a8a8e7961f49") : new g(dVar, linearLayout, map, imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca21a0e555c08f0631dfb6add83d4de7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca21a0e555c08f0631dfb6add83d4de7");
            return;
        }
        d dVar = this.b;
        LinearLayout linearLayout = this.c;
        Map map = this.d;
        ImageView imageView = this.e;
        Object[] objArr2 = {dVar, linearLayout, map, imageView};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0bbd271310a10525e3f8c1b435dd2981", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0bbd271310a10525e3f8c1b435dd2981");
            return;
        }
        int width = linearLayout.getWidth();
        StringBuilder sb = new StringBuilder();
        sb.append(map.get("btnRow"));
        int a2 = r.a(sb.toString(), 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(map.get("btnCol"));
        int a3 = r.a(sb2.toString(), 0);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(map.get("btnRowCount"));
        int a4 = r.a(sb3.toString(), 0);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(map.get("btnRows"));
        int a5 = r.a(sb4.toString(), 0);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(map.get("hasMoreBtn"));
        boolean parseBoolean = Boolean.parseBoolean(sb5.toString());
        int a6 = com.sankuai.waimai.foundation.utils.g.a(dVar.e);
        int a7 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 12.0f);
        int a8 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 6.0f);
        int a9 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 42.0f);
        int a10 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 55.0f);
        int a11 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 8.0f);
        int a12 = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 10.0f);
        com.sankuai.waimai.foundation.utils.g.a(dVar.e, 9.0f);
        int i = a6 - ((a7 + a8) * 2);
        if (a5 == 1 && parseBoolean) {
            i -= a9;
            a4--;
        }
        double d = (i * 1.0d) / a4;
        int round = (int) Math.round((a3 * d) + (d / 2.0d));
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.leftMargin = com.sankuai.waimai.foundation.utils.g.a(dVar.e, 1.0f) + round;
        dVar.a(layoutParams, 9);
        if ((a6 - width) / 2 > round - 30) {
            layoutParams2.leftMargin = round - (width / 2);
            dVar.a(layoutParams2, 9);
        } else {
            dVar.a(layoutParams2, 14);
        }
        imageView.setLayoutParams(layoutParams);
        linearLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dVar.d.getLayoutParams();
        layoutParams3.bottomMargin = ((a10 * (a5 - a2)) - a11) + a12 + dVar.c();
        dVar.d.setLayoutParams(layoutParams3);
        dVar.d.setVisibility(0);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "895bdb9e3dabe38b523a9d5a876ce640", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "895bdb9e3dabe38b523a9d5a876ce640");
        } else {
            JudasManualManager.b("b_waimai_r0nm2k3v_mv", "c_hgowsqb", AppUtil.generatePageInfoKey(dVar.e)).a();
        }
    }
}
