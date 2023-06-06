package com.sankuai.waimai.store.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.SCSuperMarketSubActivity;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.util.OnScrollTopManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    View b;
    @NonNull
    final e c;
    private boolean d;

    public d(@NonNull Context context, @NonNull e eVar, boolean z) {
        super(context);
        Object[] objArr = {context, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e965849fe039dc1859f9d22755be8b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e965849fe039dc1859f9d22755be8b3");
            return;
        }
        this.c = eVar;
        this.d = z;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11e93f7a67ba8ed830320c0f0060cfe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11e93f7a67ba8ed830320c0f0060cfe1");
            return;
        }
        super.onViewCreated();
        this.b = findView(R.id.shop_content_back_to_top);
        this.b.setOnClickListener(new a());
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e7ad08d66d48ebe78b6a003eaac9c16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e7ad08d66d48ebe78b6a003eaac9c16");
        } else if (this.mContext instanceof SCSuperMarketSubActivity) {
        } else {
            if (this.b.getVisibility() == ((z && this.d) ? 0 : 8)) {
                return;
            }
            this.b.setVisibility(z ? 0 : 8);
            if (z) {
                this.c.D().b(this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c80e14a27af2f02ec656781f8584693c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c80e14a27af2f02ec656781f8584693c");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a78d10a58d483b731e37959018ff492", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a78d10a58d483b731e37959018ff492");
                return;
            }
            d.this.c.b(true);
            d.this.c.D().d();
            d.this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.templet.newmarket.d.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d82192a886ac9c66be842f8d6542b7c9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d82192a886ac9c66be842f8d6542b7c9");
                        return;
                    }
                    OnScrollTopManager.onScrollTop();
                    d.this.c.E();
                }
            }, d.this.c.B() == 0 ? 0L : 200L);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class b extends m {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87cf98af13a8a81dafc29c0700e5ed7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87cf98af13a8a81dafc29c0700e5ed7c");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366358aba805604498834c89721de8ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366358aba805604498834c89721de8ce");
            } else {
                d.this.a(true);
            }
        }
    }
}
