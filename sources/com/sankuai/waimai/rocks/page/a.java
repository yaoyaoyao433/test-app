package com.sankuai.waimai.rocks.page;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.android.cube.pga.common.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.tablist.rocklist.e;
import com.sankuai.waimai.rocks.view.block.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends c implements b {
    public static ChangeQuickRedirect bq;
    public com.meituan.android.cube.pga.common.b<Boolean> bA;
    public com.meituan.android.cube.pga.common.b<RecyclerView> bB;
    public com.meituan.android.cube.pga.common.b<RecyclerView> bC;
    public com.meituan.android.cube.pga.common.b<RecyclerView> bD;
    public g<PagerAdapter> bE;
    public g<ViewPager> bF;
    public g<RecyclerView> bG;
    public com.meituan.android.cube.pga.common.b<Void> bH;
    public com.meituan.android.cube.pga.common.b<View> bI;
    public com.meituan.android.cube.pga.common.b<Integer> bJ;
    public com.meituan.android.cube.pga.common.b<com.sankuai.waimai.rocks.view.recyclerview.b> bK;
    public com.meituan.android.cube.pga.common.b<Integer> br;
    public g<com.sankuai.waimai.rocks.page.block.a> bs;
    public g<Integer> bt;
    public g<com.sankuai.waimai.rocks.page.tablist.tab.a> bu;
    public com.meituan.android.cube.pga.common.b<Integer> bv;
    public g<Integer> bw;
    public g<RocksServerModel> bx;
    public com.meituan.android.cube.pga.common.a<String, e> by;
    public com.meituan.android.cube.pga.common.b<Void> bz;
    private g<com.meituan.android.cube.pga.block.a> s;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = bq;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b125e31e148bf7ac8b3a07080aae1a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b125e31e148bf7ac8b3a07080aae1a1");
            return;
        }
        this.br = new com.meituan.android.cube.pga.common.b<>();
        this.bs = new g<>();
        this.bt = new g<>();
        this.s = new g<>();
        this.bu = new g<>();
        this.bv = new com.meituan.android.cube.pga.common.b<>();
        this.bw = new g<>();
        this.bx = new g<>();
        this.by = new com.meituan.android.cube.pga.common.a<>();
        this.bz = new com.meituan.android.cube.pga.common.b<>();
        this.bA = new com.meituan.android.cube.pga.common.b<>();
        this.bB = new com.meituan.android.cube.pga.common.b<>();
        this.bC = new com.meituan.android.cube.pga.common.b<>();
        this.bD = new com.meituan.android.cube.pga.common.b<>();
        this.bE = new g<>();
        this.bF = new g<>();
        this.bG = new g<>();
        this.bH = new com.meituan.android.cube.pga.common.b<>();
        this.bI = new com.meituan.android.cube.pga.common.b<>();
        this.bJ = new com.meituan.android.cube.pga.common.b<>();
        this.bK = new com.meituan.android.cube.pga.common.b<>();
    }
}
