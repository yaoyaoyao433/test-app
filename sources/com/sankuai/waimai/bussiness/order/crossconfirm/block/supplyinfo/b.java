package com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CodeDesc;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    String f;
    List<CodeDesc> g;
    int h;
    Dialog i;
    private ViewGroup j;
    private c k;
    private Activity l;
    private boolean m;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_supply_info;
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "50dd98d90b1abd37c2aea27cee45c530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "50dd98d90b1abd37c2aea27cee45c530");
            return;
        }
        if (!bVar.m) {
            bVar.m = true;
            JudasManualManager.a("b_7tqn72q0").a("c_ykhs39e").a(bVar.c).a();
        }
        if ((bVar.i != null && bVar.i.isShowing()) || bVar.k == null || bVar.k.a == null || bVar.k.a.isEmpty()) {
            return;
        }
        List<CodeDesc> list = bVar.k.a;
        String[] strArr = new String[list.size()];
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            CodeDesc codeDesc = list.get(i2);
            strArr[i2] = codeDesc.desc;
            if (bVar.h == codeDesc.code) {
                i = i2;
            }
        }
        View inflate = bVar.l.getLayoutInflater().inflate(R.layout.wm_order_confirm_adapter_short_supply_item, (ViewGroup) null);
        MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.lv_order_confirm_tableware_count);
        com.sankuai.waimai.bussiness.order.base.adapter.a aVar = new com.sankuai.waimai.bussiness.order.base.adapter.a(bVar.l, strArr);
        aVar.a(i);
        maxHeightListView.setAdapter((ListAdapter) aVar);
        maxHeightListView.setMaxHeight(g.a(bVar.l, 225.0f));
        maxHeightListView.setSelection(i);
        bVar.i = new CustomDialog.a(bVar.l).a(inflate).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo.b.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4693a5a14d695f0dbeb667bd40d320d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4693a5a14d695f0dbeb667bd40d320d");
                } else {
                    b.this.i = null;
                }
            }
        }).c();
        maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo.b.3
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i3), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb18ce0556882cb00ce6691b410798c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb18ce0556882cb00ce6691b410798c4");
                    return;
                }
                if (b.this.i != null) {
                    b.this.i.dismiss();
                }
                CodeDesc codeDesc2 = b.this.g.get(i3);
                if (codeDesc2 != null) {
                    b.this.a(codeDesc2);
                    ah.a(b.this.e, b.this.f);
                }
            }
        });
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8327fb10bfb7438c5d315adc7139ee9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8327fb10bfb7438c5d315adc7139ee9e");
            return;
        }
        this.h = -1;
        this.l = (Activity) context;
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d51159505e6242029a9f9f7fb702e20f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d51159505e6242029a9f9f7fb702e20f");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "34c698526f7e3628f1c93dd566c41045", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "34c698526f7e3628f1c93dd566c41045");
            return;
        }
        this.j = (ViewGroup) this.b.findViewById(R.id.layout_short_supply);
        this.e = (TextView) this.b.findViewById(R.id.txt_order_short_supply_info);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.supplyinfo.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a5867387c24077930a63640a259c5cc0", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a5867387c24077930a63640a259c5cc0");
                } else {
                    b.a(b.this);
                }
            }
        });
    }

    private void b(c cVar) {
        CodeDesc codeDesc;
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "167ae79a9c1572aa591a88e9dffba978", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "167ae79a9c1572aa591a88e9dffba978");
            return;
        }
        this.k = cVar;
        this.g = cVar.a;
        if (this.g != null && !com.sankuai.waimai.foundation.utils.b.b(this.g)) {
            this.j.setVisibility(0);
            if (TextUtils.isEmpty(this.f) && (codeDesc = this.g.get(0)) != null) {
                a(codeDesc);
            }
            ah.a(this.e, this.f);
            JudasManualManager.b("b_bc9da3yj").a("c_ykhs39e").a(this.l).a();
            return;
        }
        this.j.setVisibility(8);
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "384bcbcc335666fd5c029ddcb289571b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "384bcbcc335666fd5c029ddcb289571b");
        } else {
            b(cVar);
        }
    }

    void a(CodeDesc codeDesc) {
        if (codeDesc != null) {
            this.f = codeDesc.desc;
            this.h = codeDesc.code;
        }
    }
}
