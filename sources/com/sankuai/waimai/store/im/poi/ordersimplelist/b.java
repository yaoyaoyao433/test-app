package com.sankuai.waimai.store.im.poi.ordersimplelist;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import com.sankuai.waimai.store.im.poi.adapter.d;
import com.sankuai.waimai.store.im.poi.model.ImOrderInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements View.OnClickListener, com.sankuai.waimai.store.im.poi.listener.b {
    public static ChangeQuickRedirect a;
    public CustomDialog b;
    public d c;
    private a d;
    private View e;
    private TextView f;

    public b(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96e1bae95cf87791fb4e5f2e5c899478", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96e1bae95cf87791fb4e5f2e5c899478");
            return;
        }
        this.d = aVar;
        this.c = new d(this.d.a(), this);
        d dVar = this.c;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cf9731a10200441fd4bdd96acad367d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cf9731a10200441fd4bdd96acad367d6");
            return;
        }
        this.e = LayoutInflater.from(this.d.a()).inflate(R.layout.wm_sc_simple_list_dialog, (ViewGroup) null, false);
        this.b = new CustomDialog.a(this.d.a()).b(true).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.b.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr3 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e8570023facf5b2cabd9510425df2634", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e8570023facf5b2cabd9510425df2634");
                } else {
                    b.this.b();
                }
            }
        }).a(h.a((Context) this.d.a()), -2).a(new DialogInterface.OnKeyListener() { // from class: com.sankuai.waimai.store.im.poi.ordersimplelist.b.1
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                Object[] objArr3 = {dialogInterface, Integer.valueOf(i), keyEvent};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0e307d5db75a42d2971ec4759ca02fb8", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0e307d5db75a42d2971ec4759ca02fb8")).booleanValue();
                }
                if (i == 4) {
                    b.this.b();
                }
                return false;
            }
        }).a();
        this.b.setContentView(this.e);
        this.f = (TextView) this.e.findViewById(R.id.tv_send_prompt);
        if (this.d.b() == 2) {
            this.f.setText(R.string.wm_sc_send_remind_order);
        }
        this.e.setOnClickListener(this);
        this.e.findViewById(R.id.iv_close).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) this.e.findViewById(R.id.rv_goods_list);
        recyclerView.setAdapter(dVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.d.a());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3696dfbe10fc92abbb78ae3bdee89bf6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3696dfbe10fc92abbb78ae3bdee89bf6");
        } else if (view.getId() == R.id.iv_close || view.getId() == R.id.rl_root) {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eac1fec2885703efd796a79a10b6454", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eac1fec2885703efd796a79a10b6454");
        } else {
            com.sankuai.waimai.store.util.d.a(this.b);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.b
    public final void a(ImOrderInfo imOrderInfo) {
        Object[] objArr = {imOrderInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47ad06b5fcf30abac2c2d8608dc12f43", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47ad06b5fcf30abac2c2d8608dc12f43");
            return;
        }
        b();
        if (this.d == null || this.d.c() == null) {
            return;
        }
        JudasManualManager.a("b_waimai_n4jnb36y_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", this.d.c().G()).a("order_flow_bridge_id", imOrderInfo.orderViewID).a("order_status", imOrderInfo.status).a("type", this.d.b()).a();
        if (this.d.b() == 2) {
            this.d.c().a(imOrderInfo, null);
        } else if (this.d.b() == 1) {
            this.d.c().b(imOrderInfo, null);
        }
    }

    @Override // com.sankuai.waimai.store.im.poi.listener.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba396be690f7e603614e83112883b239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba396be690f7e603614e83112883b239");
            return;
        }
        b();
        if (this.d == null || this.d.c() == null) {
            return;
        }
        JudasManualManager.a("b_waimai_lfc6qg7j_mc").a(com.sankuai.waimai.business.im.utils.d.a).a("poi_id", this.d.c().G()).a("type", this.d.b()).a();
    }
}
