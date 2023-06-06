package com.sankuai.waimai.store.drug.goods.list.templet.newmarket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.util.OnScrollTopManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    View b;
    @NonNull
    final h c;
    private boolean d;
    private com.sankuai.waimai.store.drug.goods.list.delegate.c e;

    public g(@NonNull Context context, @NonNull h hVar, boolean z, com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(context);
        Object[] objArr = {context, hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14b09492fbf4f0439d715d03e59c31ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14b09492fbf4f0439d715d03e59c31ae");
            return;
        }
        this.c = hVar;
        this.d = z;
        this.e = cVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c67a5f86ae0a4981b38588989d528b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c67a5f86ae0a4981b38588989d528b");
            return;
        }
        super.onViewCreated();
        this.b = findView(R.id.shop_content_back_to_top);
        this.b.setOnClickListener(new a());
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b2e832f9c224a48d13538899b00de93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b2e832f9c224a48d13538899b00de93");
        } else if (this.e.n()) {
        } else {
            if (this.b.getVisibility() == ((z && this.d) ? 0 : 8)) {
                return;
            }
            this.b.setVisibility(z ? 0 : 8);
            if (z) {
                this.c.w().b(this.b);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a implements View.OnClickListener {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27d90abae4a5b4e2b366176a39f2aea9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27d90abae4a5b4e2b366176a39f2aea9");
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "321118444e7001de10c619d457aed46c", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "321118444e7001de10c619d457aed46c");
                return;
            }
            g.this.c.c(true);
            g.this.c.w().b();
            g.this.b.postDelayed(new Runnable() { // from class: com.sankuai.waimai.store.drug.goods.list.templet.newmarket.g.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d495088b062be76b7b47850c724a5dc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d495088b062be76b7b47850c724a5dc");
                        return;
                    }
                    OnScrollTopManager.onScrollTop();
                    g.this.c.x();
                }
            }, g.this.c.u() == 0 ? 0L : 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b extends m {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {g.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "702c48f39cc2efcdb7d68f5261affb6d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "702c48f39cc2efcdb7d68f5261affb6d");
            }
        }

        @Override // com.sankuai.waimai.store.newwidgets.list.m
        public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef8c792476895a0ff2664b3ecb7d3daa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef8c792476895a0ff2664b3ecb7d3daa");
            } else {
                g.this.a(true);
            }
        }
    }
}
