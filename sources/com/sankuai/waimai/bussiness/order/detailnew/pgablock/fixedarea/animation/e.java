package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.OrderFixAreaInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.a e;
    boolean f;
    View g;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_status_layout_map_animation;
    }

    public e(Context context, ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac80d6e3b8b3a0a4763b332b2d523e7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac80d6e3b8b3a0a4763b332b2d523e7e");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31acefe20e2057d28ff4d56a75e06cab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31acefe20e2057d28ff4d56a75e06cab");
            return;
        }
        super.b();
        this.g = this.b.findViewById(R.id.wm_order_status_layout_map_animation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(@NonNull OrderFixAreaInfo orderFixAreaInfo) {
        Object[] objArr = {orderFixAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bf2619cd99587d2076941894f0ed3f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bf2619cd99587d2076941894f0ed3f")).booleanValue();
        }
        if (b(orderFixAreaInfo) && !this.f) {
            int i = orderFixAreaInfo.animationInfo.type;
            if (this.e == null && this.g != null && i == 1) {
                this.e = new a(this.g, this.c);
                this.e.a(i);
                this.e.b(1);
                this.e.a(orderFixAreaInfo.animationInfo.animationUrl);
                return true;
            }
        } else {
            this.e = null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(OrderFixAreaInfo orderFixAreaInfo) {
        Object[] objArr = {orderFixAreaInfo};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31329fb4497932ae4bbd70d8204ab203", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31329fb4497932ae4bbd70d8204ab203")).booleanValue() : (orderFixAreaInfo == null || orderFixAreaInfo.animationInfo == null || TextUtils.isEmpty(orderFixAreaInfo.animationInfo.animationUrl)) ? false : true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.a {
        public static ChangeQuickRedirect f;
        private ImageView h;

        public a(View view, Context context) {
            super(context);
            Object[] objArr = {e.this, view, context};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9902a612bddb06ca11b1d23804ca0084", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9902a612bddb06ca11b1d23804ca0084");
            } else {
                this.h = (ImageView) view.findViewById(R.id.animation_view);
            }
        }

        @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8dae4a36b0f4c26732c165da68440f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8dae4a36b0f4c26732c165da68440f");
            } else if (this.h != null) {
                try {
                    RequestCreator d = Picasso.g(this.b).d(this.c);
                    d.u = true;
                    d.a(this.h, this.d);
                } catch (Throwable th) {
                    com.sankuai.waimai.foundation.utils.log.a.b(th);
                }
            }
        }
    }
}
