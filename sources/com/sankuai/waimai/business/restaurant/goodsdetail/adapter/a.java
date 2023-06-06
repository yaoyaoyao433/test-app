package com.sankuai.waimai.business.restaurant.goodsdetail.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.repository.model.RecommendPackage;
import com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a;
import com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView;
import com.sankuai.waimai.restaurant.shopcart.ui.ab;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a extends RecyclerView.a<RecyclerView.s> {
    public static ChangeQuickRedirect a;
    protected Activity b;
    public g c;
    public ab d;
    public ArrayList<RecommendPackage.a> e;
    public String f;
    public int g;
    public boolean h;
    public a.InterfaceC0833a i;

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80238f13ced694c2f612a985af6396f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80238f13ced694c2f612a985af6396f3");
        }
    }

    public a(Activity activity, g gVar, ab abVar, ArrayList<RecommendPackage.a> arrayList, String str, int i, boolean z) {
        Object[] objArr = {activity, gVar, abVar, arrayList, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96652c0cc4b7af1494ef7c2912aa3692", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96652c0cc4b7af1494ef7c2912aa3692");
            return;
        }
        this.b = activity;
        this.c = gVar;
        this.d = abVar;
        this.f = str;
        this.g = i;
        this.h = z;
        this.e = arrayList;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemViewType(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35d52b9d49264d8bbf322344b9e2edd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35d52b9d49264d8bbf322344b9e2edd")).intValue();
        }
        RecommendPackage.a aVar = this.e.get(i);
        return (aVar.i == null || aVar.i.size() <= 1) ? -1 : 0;
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public void onBindViewHolder(@NonNull RecyclerView.s sVar, int i) {
        Object[] objArr = {sVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "160c2c57ff8d50a9a7add3ec735340f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "160c2c57ff8d50a9a7add3ec735340f7");
        } else if (this.e == null || this.e.size() <= i || !(sVar instanceof com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a)) {
        } else {
            com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a aVar = (com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a) sVar;
            RecommendPackage.a aVar2 = this.e.get(i);
            Object[] objArr2 = {aVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.goodsdetail.adapter.viewholder.a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "99113a3ec798528ea1e5c74c283640ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "99113a3ec798528ea1e5c74c283640ed");
            } else {
                aVar.a(aVar2, i, true);
            }
        }
    }

    @Override // android.support.v7.widget.RecyclerView.a
    public int getItemCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cdae453e0779c1f0c878e3cb3923f3b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cdae453e0779c1f0c878e3cb3923f3b")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.b(this.e)) {
            return 0;
        }
        return this.e.size();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.restaurant.goodsdetail.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0832a implements AutoGridView.c {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.business.restaurant.goodsdetail.widget.AutoGridView.c
        public final int[] a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f09a48975c1749fa612f6f14610ab2b", RobustBitConfig.DEFAULT_VALUE)) {
                return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f09a48975c1749fa612f6f14610ab2b");
            }
            switch (i) {
                case 1:
                case 2:
                    return new int[]{2};
                default:
                    int[] iArr = new int[(int) Math.ceil(i / 3.0d)];
                    Arrays.fill(iArr, 3);
                    return iArr;
            }
        }
    }
}
