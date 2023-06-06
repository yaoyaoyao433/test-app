package com.sankuai.waimai.store.poilist.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    private final LayoutInflater A;
    public final Drawable a;
    public final Drawable b;
    public final Drawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    private final Context z;

    public e(Context context) {
        this.z = context;
        this.A = LayoutInflater.from(this.z);
        this.e = g.a(this.z, 3.0f);
        this.f = g.a(this.z, 4.0f);
        this.g = g.a(this.z, 6.0f);
        this.h = g.a(this.z, 8.0f);
        this.k = g.a(this.z, 10.0f);
        this.j = g.a(this.z, 14.0f);
        this.i = g.a(this.z, 22.0f);
        this.l = g.a(this.z, 30.0f);
        this.m = g.a(context, 41.0f);
        this.n = g.a(this.z, 50.0f);
        Resources resources = this.z.getResources();
        this.p = (int) resources.getDimension(R.dimen.wm_sc_common_dimen_76);
        this.q = (int) resources.getDimension(R.dimen.wm_sc_common_dimen_100);
        this.o = (int) resources.getDimension(R.dimen.wm_sc_common_dimen_15);
        this.r = resources.getColor(R.color.wm_st_common_F4A26);
        this.s = resources.getColor(R.color.wm_sg_color_0DFB4E44);
        this.t = resources.getColor(R.color.wm_sg_color_D3D3D4);
        this.u = resources.getColor(R.color.wm_st_common_text_time);
        this.v = resources.getColor(R.color.wm_st_common_orange_1);
        this.w = resources.getColor(R.color.wm_sg_color_12B536);
        this.x = resources.getColor(R.color.wm_sg_color_17AB36);
        this.y = resources.getColor(R.color.wm_sg_color_17AC36);
        this.c = resources.getDrawable(R.drawable.wm_st_poi_status_pre_order_only_tip_bg);
        this.b = resources.getDrawable(R.drawable.wm_sc_sugoo_common_poi_status_pre_order_only_tip_bg);
        this.a = resources.getDrawable(R.drawable.wm_st_poi_status_pre_order_tip_bg);
        this.d = resources.getDrawable(R.drawable.wm_st_poi_status_pre_order_desc_bg);
    }
}
