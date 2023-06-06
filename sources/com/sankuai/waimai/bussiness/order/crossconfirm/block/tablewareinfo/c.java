package com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    private TextView A;
    private long B;
    private boolean C;
    Dialog e;
    com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a f;
    int g;
    boolean h;
    int i;
    LinearLayout j;
    String k;
    AddressItem l;
    int m;
    TablewareSettingsInfo n;
    long o;
    boolean p;
    TablewareSettingsInfo.SettingsOption q;
    TablewareSettingsInfo.SettingsOption r;
    int s;
    boolean t;
    int u;
    d v;
    Activity w;
    private String x;
    private String y;
    private TextView z;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_order_confirm_layout_table_ware_info;
    }

    public static /* synthetic */ void a(c cVar) {
        View inflate;
        View findViewById;
        boolean z;
        boolean z2;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a cVar2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "84bee0084cae880d2733883ddfba7079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "84bee0084cae880d2733883ddfba7079");
        } else if (cVar.e == null || !cVar.e.isShowing()) {
            if (cVar.f()) {
                if (cVar.n != null && cVar.n.settingsOptions == null) {
                    return;
                }
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = d;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "b2b9b233f317564c61d0ff353c390cd7", RobustBitConfig.DEFAULT_VALUE)) {
                    cVar2 = (com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "b2b9b233f317564c61d0ff353c390cd7");
                } else {
                    cVar.t = false;
                    if (cVar.u != 0) {
                        z = cVar.u == 1;
                    } else {
                        z = cVar.p;
                    }
                    if (cVar.f() && com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) cVar.w, "TableWareConfirm", false)) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = d;
                        int intValue = PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "73adfdb6a0025185da2e1754e1102969", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "73adfdb6a0025185da2e1754e1102969")).intValue() : com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) cVar.w, "commonTablewareSettingSelected", -1);
                        boolean b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b((Context) cVar.w, "TableWareAutoSettingCheckStatus", false);
                        if (cVar.s == intValue && b) {
                            cVar.u = 1;
                            z2 = true;
                        } else {
                            cVar.u = 2;
                            z2 = false;
                        }
                    } else {
                        z2 = z;
                    }
                    int e = cVar.e();
                    int i = e == 88 ? 0 : e;
                    if (cVar.n.settingForAddress == 0) {
                        cVar2 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b(cVar.c, cVar.v.b, cVar.v.c, cVar.v.j, cVar.k, cVar.n, z2, i, false, cVar.s, cVar.l, 0L, new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.c.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f600add7118cb8b2f053226265292ad1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f600add7118cb8b2f053226265292ad1");
                                } else if (c.this.e == null || !c.this.e.isShowing()) {
                                } else {
                                    c.this.t = false;
                                    c.this.e.dismiss();
                                }
                            }

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.a
                            public final void a(int i2, int i3, boolean z3) {
                                Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "af2ad9cbfb7275d4842bc9fd769aa84c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "af2ad9cbfb7275d4842bc9fd769aa84c");
                                    return;
                                }
                                c.this.t = true;
                                c.this.s = i2;
                                if (i2 != 101) {
                                    c.this.g = 99;
                                    ae.a(c.this.w, c.this.r.confirm_tip);
                                } else if (i3 == 0) {
                                    c.this.g = 88;
                                } else if (i3 > 0 && i3 <= 15) {
                                    c.this.g = i3;
                                } else {
                                    c.this.g = 0;
                                }
                                c.this.u = z3 ? 1 : 2;
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(c.this.w, "TableWareAutoSettingCheckStatus", z3);
                                c.a(c.this, i2);
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) c.this.w, "TableWareConfirm", true);
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) c.this.w, "TableWareSettingId", c.this.o);
                                c.c(c.this);
                            }
                        });
                    } else {
                        cVar2 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c(cVar.c, cVar.v.b, cVar.v.c, cVar.v.j, cVar.k, cVar.n, z2, i, false, cVar.s, cVar.l, cVar.m, 0L, new c.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.c.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3a01525aaed94a4c82c13a8f371f3229", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3a01525aaed94a4c82c13a8f371f3229");
                                } else if (c.this.e == null || !c.this.e.isShowing()) {
                                } else {
                                    c.this.t = false;
                                    c.this.e.dismiss();
                                }
                            }

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.a
                            public final void a(int i2, int i3, boolean z3) {
                                Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "025001d8d29d25a7e8718e8f17934f0f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "025001d8d29d25a7e8718e8f17934f0f");
                                    return;
                                }
                                c.this.t = true;
                                c.this.s = i2;
                                if (i2 != 101) {
                                    c.this.g = 99;
                                    ae.a(c.this.w, c.this.r.confirm_tip);
                                } else if (i3 == 0) {
                                    c.this.g = 88;
                                } else if (i3 > 0 && i3 <= 15) {
                                    c.this.g = i3;
                                } else {
                                    c.this.g = 0;
                                }
                                c.this.u = z3 ? 1 : 2;
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(c.this.w, "TableWareAutoSettingCheckStatus", z3);
                                c.a(c.this, i2);
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) c.this.w, "TableWareConfirm", true);
                                com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) c.this.w, "TableWareSettingId", c.this.o);
                                c.c(c.this);
                            }
                        });
                    }
                }
                cVar.f = cVar2;
                inflate = cVar.f.a();
            } else if (cVar.v == null || cVar.v.g == null || cVar.v.g.isEmpty()) {
                return;
            } else {
                final List<DinersOption> list = cVar.v.g;
                String[] strArr = new String[list.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    DinersOption dinersOption = list.get(i3);
                    strArr[i3] = dinersOption.description;
                    if (cVar.g == dinersOption.count) {
                        i2 = i3;
                    }
                }
                Object[] objArr4 = {Integer.valueOf(i2), list, strArr};
                ChangeQuickRedirect changeQuickRedirect4 = d;
                if (PatchProxy.isSupport(objArr4, cVar, changeQuickRedirect4, false, "22c011013702eb411a716e8d496e7a06", RobustBitConfig.DEFAULT_VALUE)) {
                    inflate = (View) PatchProxy.accessDispatch(objArr4, cVar, changeQuickRedirect4, false, "22c011013702eb411a716e8d496e7a06");
                } else {
                    inflate = cVar.w.getLayoutInflater().inflate(R.layout.wm_order_confirm_view_list_diners_count, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.txt_order_confirm_tableware_advocate_title);
                    if (!TextUtils.isEmpty(cVar.y)) {
                        textView.setVisibility(0);
                        textView.setText(cVar.y);
                    }
                    MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.lv_order_confirm_tableware_count);
                    CustomDialog.b bVar = new CustomDialog.b(cVar.w, strArr);
                    bVar.a(i2);
                    maxHeightListView.setAdapter((ListAdapter) bVar);
                    maxHeightListView.setMaxHeight(g.a(cVar.w, 225.0f));
                    maxHeightListView.setSelection(i2);
                    maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.c.3
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j) {
                            Object[] objArr5 = {adapterView, view, Integer.valueOf(i4), new Long(j)};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4265613a83afaf00a057f39a8d1d3aad", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4265613a83afaf00a057f39a8d1d3aad");
                                return;
                            }
                            if (c.this.e != null) {
                                c.this.e.dismiss();
                            }
                            DinersOption dinersOption2 = (DinersOption) list.get(i4);
                            if (dinersOption2 != null && dinersOption2.count == 99 && !TextUtils.isEmpty(dinersOption2.greenLifeTip)) {
                                ae.a(c.this.w, dinersOption2.greenLifeTip);
                            }
                            c.this.a(dinersOption2);
                            HashMap hashMap = new HashMap();
                            StringBuilder sb = new StringBuilder();
                            sb.append(i4 + 1);
                            hashMap.put("dinner_usercount", sb.toString());
                            JudasManualManager.a("b_uWU2j").a("index", i4).b(hashMap).a("c_ykhs39e").a(c.this.c).a();
                        }
                    });
                }
            }
            CustomDialog.a a = new CustomDialog.a(cVar.w).a(inflate).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.c.2
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr5 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "956c4f202acd32b2345d7e96fc1c40e7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "956c4f202acd32b2345d7e96fc1c40e7");
                        return;
                    }
                    if (c.this.f != null) {
                        c.this.f.e();
                        c.this.f = null;
                    }
                    c.this.e = null;
                }
            });
            if (!cVar.f()) {
                a.b(R.string.cancel, (DialogInterface.OnClickListener) null);
            }
            if (cVar.f() && cVar.f != null) {
                a.a(cVar.f);
            }
            cVar.e = a.c();
            if (!cVar.f() || cVar.e == null || (findViewById = cVar.e.findViewById(R.id.dialog_root_panel)) == null) {
                return;
            }
            findViewById.setBackgroundColor(0);
        }
    }

    public static /* synthetic */ void a(c cVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "a87bab89833090d83a4992cc9b401810", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "a87bab89833090d83a4992cc9b401810");
        } else {
            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) cVar.w, "commonTablewareSettingSelected", i);
        }
    }

    public static /* synthetic */ void c(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "c6c0d46af03a85c74419552d2f930689", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "c6c0d46af03a85c74419552d2f930689");
            return;
        }
        if (cVar.e != null && cVar.e.isShowing()) {
            cVar.e.dismiss();
        }
        cVar.a((DinersOption) null);
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71f6bb4e2d66dc064fcfbf5b1e9f6a27", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71f6bb4e2d66dc064fcfbf5b1e9f6a27");
            return;
        }
        this.g = Integer.MIN_VALUE;
        this.h = false;
        this.i = 0;
        this.C = false;
        this.o = 0L;
        this.p = false;
        this.q = null;
        this.r = null;
        this.s = Integer.MIN_VALUE;
        this.t = false;
        this.u = 0;
        this.w = (Activity) context;
        com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) this.w, "TableWareConfirm", false);
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2942f139289920c9fbe5e8d858a19e29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2942f139289920c9fbe5e8d858a19e29");
            return;
        }
        super.b();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad3bc613e087593d25b399db1d34c31f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad3bc613e087593d25b399db1d34c31f");
            return;
        }
        this.j = (LinearLayout) this.b.findViewById(R.id.layout_tableware);
        this.z = (TextView) this.b.findViewById(R.id.txt_order_invoice_tableware_hint);
        this.A = (TextView) this.b.findViewById(R.id.txt_order_invoice_tableware_value);
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.c.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr3 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b2cb3ebc22d9d5217edd2dc10fc90b89", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b2cb3ebc22d9d5217edd2dc10fc90b89");
                } else {
                    c.a(c.this);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3a09f58e043f55b56fb6808abc4c70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3a09f58e043f55b56fb6808abc4c70c");
            return;
        }
        if (TextUtils.isEmpty(this.x)) {
            this.x = dVar.h;
        }
        if (TextUtils.isEmpty(this.y)) {
            this.y = dVar.i;
        }
        if (!TextUtils.isEmpty(this.x)) {
            this.z.setVisibility(0);
            this.z.setText(this.x);
        }
        if (this.n != null && this.n.settingForAddress == 1) {
            long j = (this.l == null || this.m != 1) ? -1L : this.l.id;
            if (j != this.B) {
                this.s = Integer.MIN_VALUE;
                this.g = Integer.MIN_VALUE;
            }
            this.B = j;
        }
        if (f()) {
            this.C = false;
            if (this.n == null || com.sankuai.waimai.foundation.utils.b.b(this.n.settingsOptions)) {
                return;
            }
            String string = this.c.getResources().getString(R.string.wm_order_confirm_tableware_must_choose_tips);
            this.A.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_table_ware_info_view_sure_select_color));
            Iterator<TablewareSettingsInfo.SettingsOption> it = this.n.settingsOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TablewareSettingsInfo.SettingsOption next = it.next();
                if (next.isSelected == 1) {
                    this.C = true;
                    string = next.selected_tip;
                    this.A.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_table_ware_info_view_select_color));
                    this.z.setVisibility(8);
                    if (this.s == Integer.MIN_VALUE) {
                        this.s = next.code;
                    }
                }
            }
            this.A.setCompoundDrawablePadding(0);
            this.A.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.A.setText(string);
            this.A.setHint("");
        }
    }

    public final int e() {
        if (this.g == Integer.MIN_VALUE) {
            return 0;
        }
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(DinersOption dinersOption) {
        String str;
        Object[] objArr = {dinersOption};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea002685af44c3e43bedc347591643e1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea002685af44c3e43bedc347591643e1");
            return;
        }
        int i = R.drawable.wm_order_confirm_tableware_icon_neat;
        if (dinersOption == null) {
            if (this.s == Integer.MIN_VALUE) {
                return;
            }
            if (this.s == 102) {
                str = this.r.selected_tip;
            } else {
                int e = e();
                if (e == 88) {
                    str = this.q.selected_tip;
                } else {
                    str = e + "份";
                }
                i = 0;
            }
        } else {
            this.g = dinersOption.count;
            if (dinersOption.count != 99) {
                i = 0;
            }
            str = dinersOption.description;
        }
        this.A.setCompoundDrawablePadding(i == 0 ? 0 : g.a(this.c, 5.0f));
        this.A.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        this.A.setText(str);
        this.A.setTextColor(this.c.getResources().getColor(R.color.wm_order_confirm_table_ware_info_view_select_color));
        if (TextUtils.isEmpty(str)) {
            this.A.setHint("未选择");
        } else {
            this.A.setHint("");
        }
        if (this.z.getVisibility() == 0) {
            this.z.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        return this.n != null;
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "881166e0fffe3bb61459bb13800953f6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "881166e0fffe3bb61459bb13800953f6")).booleanValue() : f() && this.A != null && this.A.getVisibility() != 8 && this.A.getText().equals(this.c.getResources().getString(R.string.wm_order_confirm_tableware_must_choose_tips));
    }
}
