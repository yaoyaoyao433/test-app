package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FullScreenMediaPagerAdapter extends BaseMediaPagerAdapter {
    public static ChangeQuickRedirect d;
    public int e;
    private g k;
    private b l;
    private int m;
    private int n;
    private boolean o;
    private String p;
    private int q;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0255  */
    @Override // com.sankuai.waimai.platform.widget.pager.BasePagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ android.view.View a(android.view.ViewGroup r26, com.sankuai.waimai.platform.domain.core.goods.e r27, int r28) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.FullScreenMediaPagerAdapter.a(android.view.ViewGroup, java.lang.Object, int):android.view.View");
    }

    public FullScreenMediaPagerAdapter(@NonNull Context context, List<com.sankuai.waimai.platform.domain.core.goods.e> list, g gVar, int i, int i2, boolean z, String str, int i3) {
        super(context, list);
        Object[] objArr = {context, list, gVar, Integer.valueOf(i), Integer.valueOf(i2), (byte) 1, str, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1926107f224b9eea774ae42ea256f855", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1926107f224b9eea774ae42ea256f855");
            return;
        }
        this.e = -1;
        this.k = gVar;
        this.l = new b(this.j);
        this.m = i;
        this.n = i2;
        this.b = true;
        this.p = str;
        this.q = i3;
    }
}
