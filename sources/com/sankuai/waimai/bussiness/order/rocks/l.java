package com.sankuai.waimai.bussiness.order.rocks;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.modular.blockimpl.empty.EmptyView;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    EmptyView e;
    Dialog f;
    ImageView g;
    NestedRecyclerView h;
    CustomDragExpandLayout i;
    ViewStub j;
    View k;
    TextView l;
    com.sankuai.waimai.business.order.api.detail.block.a m;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_detail_rocks_root;
    }

    public l(Context context, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac3a37f845c3d9bf9849047348e91c71", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac3a37f845c3d9bf9849047348e91c71");
        } else {
            this.m = aVar;
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3a35d69cc725bc308765d219c39b187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3a35d69cc725bc308765d219c39b187");
            return;
        }
        super.b();
        this.e = (EmptyView) this.b.findViewById(R.id.wm_order_detail_empty_view);
        this.k = this.b.findViewById(R.id.order_detail_bg);
        this.l = (TextView) this.b.findViewById(R.id.order_detail_title);
        this.i = (CustomDragExpandLayout) this.b.findViewById(R.id.order_detail_layout);
        this.j = (ViewStub) this.b.findViewById(R.id.wm_order_detail_flow_guide);
        this.h = (NestedRecyclerView) this.b.findViewById(R.id.nest_rcy_order_status);
        this.g = (ImageView) this.b.findViewById(R.id.wm_order_detail_to_top_img);
        this.g.setOnClickListener(new com.sankuai.waimai.bussiness.order.detailnew.widget.a() { // from class: com.sankuai.waimai.bussiness.order.rocks.l.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.a
            public final void a(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "206ec0de12f59d4136abeb4d4e0b0ffe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "206ec0de12f59d4136abeb4d4e0b0ffe");
                    return;
                }
                if (l.this.m != null) {
                    l.this.m.b();
                }
                l.this.h.smoothScrollToPosition(0);
                l.this.g.setVisibility(8);
            }
        });
        this.e.setPageCid("c_hgowsqb");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8cf830fdebca58d9930d9be25078aa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8cf830fdebca58d9930d9be25078aa4");
        } else if (Build.VERSION.SDK_INT < 23 || this.l == null) {
        } else {
            int e = com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
            ah.a(this.l, Integer.MIN_VALUE, com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 60.0f) + e, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48a990e5d611cca05f40bacd55039b9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48a990e5d611cca05f40bacd55039b9b");
        } else {
            this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        }
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d51b027417cd2968b13e3a446de7363", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d51b027417cd2968b13e3a446de7363");
        } else {
            com.sankuai.waimai.platform.widget.dialog.a.b(this.f);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cce4481f81af1b3832b9aa229ee63302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cce4481f81af1b3832b9aa229ee63302");
        } else if (z) {
            this.f = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        } else {
            this.e.b();
            this.e.a(R.string.wm_common_loading);
        }
    }

    public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15e68954fa9bcc565cbbeb5ce8029eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15e68954fa9bcc565cbbeb5ce8029eb1");
            return;
        }
        String string = this.c.getResources().getString(R.string.takeout_loading_fail_try_afterwhile);
        String a = com.sankuai.waimai.platform.utils.h.a(this.c, aVar);
        if (aVar != null && !TextUtils.isEmpty(aVar.a())) {
            string = aVar.a();
        }
        String str = !TextUtils.isEmpty(a) ? a : string;
        if (z) {
            com.sankuai.waimai.platform.utils.m.b(this.c, str);
        } else {
            Object[] objArr2 = {str, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71a76a32c7096b231c7a4fe03988243b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71a76a32c7096b231c7a4fe03988243b");
            } else {
                EmptyView emptyView = this.e;
                String string2 = this.c.getString(R.string.wm_order_base_reload);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.rocks.l.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr3 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "137430319e3937e35382c663afa24f3c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "137430319e3937e35382c663afa24f3c");
                        } else if (l.this.m != null) {
                            l.this.m.b(true);
                        }
                    }
                };
                Object[] objArr3 = {Integer.valueOf((int) R.drawable.wm_common_default_net_error_icon), str, aVar, string2, onClickListener};
                ChangeQuickRedirect changeQuickRedirect3 = EmptyView.a;
                if (PatchProxy.isSupport(objArr3, emptyView, changeQuickRedirect3, false, "97343adcf2c432e9794036151eca0219", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, emptyView, changeQuickRedirect3, false, "97343adcf2c432e9794036151eca0219");
                } else {
                    ErrorCode errorCode = com.sankuai.waimai.monitor.a.a(com.meituan.android.singleton.b.a, aVar).b;
                    String buildErrorCodeStr = errorCode.buildErrorCodeStr();
                    com.sankuai.waimai.platform.widget.emptylayout.c.a(emptyView.getPageName(), buildErrorCodeStr, errorCode.getRandomPageId(), emptyView.N);
                    emptyView.a(EmptyView.a.NET_ERROR, R.drawable.wm_common_default_net_error_icon, str, buildErrorCodeStr, string2, onClickListener);
                }
            }
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.f);
    }
}
