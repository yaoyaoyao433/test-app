package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
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
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.d;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final Activity b;
    Dialog c;
    com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a d;
    boolean e;
    public String f;
    int g;
    int h;
    TablewareSettingsInfo.SettingsOption i;
    int j;
    com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.c k;
    protected com.sankuai.waimai.bussiness.order.base.mach.b l;
    private TablewareSettingsInfo m;
    private List<DinersOption> n;
    private ExtendInfoModel o;
    private boolean p;
    private int q;
    private long r;
    private String s;
    private String t;
    private boolean u;
    private boolean v;
    private TablewareSettingsInfo.SettingsOption w;

    public static /* synthetic */ void a(c cVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "5bfa6dd7cf0bf58c78ad4671ffcf2780", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "5bfa6dd7cf0bf58c78ad4671ffcf2780");
            return;
        }
        if (cVar.c != null && cVar.c.isShowing()) {
            cVar.c.dismiss();
        }
        cVar.a((DinersOption) null, false);
    }

    public c(Activity activity, com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.c cVar) {
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5d511e599f53eb516c64e86b108e3dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5d511e599f53eb516c64e86b108e3dc");
            return;
        }
        this.d = null;
        this.p = false;
        this.q = 0;
        this.e = false;
        this.r = 0L;
        this.s = "";
        this.g = Integer.MIN_VALUE;
        this.h = 0;
        this.u = false;
        this.v = false;
        this.w = null;
        this.i = null;
        this.j = Integer.MIN_VALUE;
        this.b = activity;
        this.k = cVar;
    }

    public final void a(d dVar) {
        DinersOption b;
        DinersOption dinersOption;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8cb8ae4791829a199c4042ca66608f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8cb8ae4791829a199c4042ca66608f3");
            return;
        }
        if (dVar != null) {
            this.m = dVar.f;
            this.n = dVar.g;
            this.r = dVar.b.longValue();
            this.s = dVar.c;
            this.p = dVar.d;
            this.q = dVar.e;
            this.t = dVar.j;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0812e84db4dcba2f0727ed169b661f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0812e84db4dcba2f0727ed169b661f8");
            } else {
                if (this.m != null && this.m.settingsOptions != null && this.m.settingsOptions.size() >= 2) {
                    Iterator<TablewareSettingsInfo.SettingsOption> it = this.m.settingsOptions.iterator();
                    while (it.hasNext()) {
                        TablewareSettingsInfo.SettingsOption next = it.next();
                        if (next.code == 101) {
                            this.w = next;
                        } else if (next.code == 102) {
                            this.i = next;
                        }
                    }
                    this.v = (this.w.isSelected == 1 && this.m.userTablewareConfigValue == 101) || (this.i.isSelected == 1 && this.m.userTablewareConfigValue == 102);
                }
                if (e()) {
                    this.u = false;
                    if (!com.sankuai.waimai.foundation.utils.b.b(this.m.settingsOptions)) {
                        Iterator<TablewareSettingsInfo.SettingsOption> it2 = this.m.settingsOptions.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TablewareSettingsInfo.SettingsOption next2 = it2.next();
                            if (next2 != null && next2.isSelected == 1) {
                                this.u = true;
                                if (this.j == Integer.MIN_VALUE) {
                                    this.j = next2.code;
                                }
                            }
                        }
                    }
                }
                b();
            }
        } catch (Exception unused) {
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1c29bdab6623993e5efc9000c404b667", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1c29bdab6623993e5efc9000c404b667");
            return;
        }
        boolean z = (this.n == null || this.n.isEmpty()) ? false : true;
        com.sankuai.waimai.bussiness.order.confirm.cache.a a2 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a();
        String str = this.s;
        Object[] objArr4 = {str};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.cache.a.a;
        DinersOption dinersOption2 = null;
        if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "2d5e1f0f4dd1a04be9af6dcfd0357886", RobustBitConfig.DEFAULT_VALUE)) {
            b = (DinersOption) PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "2d5e1f0f4dd1a04be9af6dcfd0357886");
        } else {
            b = !a2.c ? null : a2.b.c.b(str);
        }
        if (e()) {
            if (this.g == Integer.MIN_VALUE) {
                if (this.j == 102) {
                    this.g = 99;
                } else if (this.j == 101) {
                    this.g = 88;
                }
            }
            b();
            a((DinersOption) null, false);
        } else if (z) {
            Iterator<DinersOption> it3 = this.n.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    dinersOption = null;
                    break;
                }
                dinersOption = it3.next();
                if (this.p && this.q < 11 && this.g == Integer.MIN_VALUE) {
                    if (dinersOption.count == this.q) {
                        dinersOption2 = dinersOption;
                        dinersOption = null;
                        break;
                    }
                } else if (this.g != Integer.MIN_VALUE && dinersOption.count == this.g) {
                    break;
                }
            }
            if (this.g != Integer.MIN_VALUE) {
                if (dinersOption != null) {
                    a(dinersOption, false);
                }
            } else if (dinersOption2 != null) {
                a(dinersOption2, false);
            } else if (b != null) {
                a(b, false);
            }
        }
    }

    private int c() {
        if (this.g == Integer.MIN_VALUE) {
            return 0;
        }
        return this.g;
    }

    private int d() {
        if (this.j == Integer.MIN_VALUE) {
            return 0;
        }
        return this.j;
    }

    public final boolean a() {
        return (this.e || this.m == null || !this.m.useDefaultTablewareTip) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b78e36b93f965b47a66140e19c14a0a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b78e36b93f965b47a66140e19c14a0a1");
        } else if (this.l != null) {
            this.l.b(str, map);
        } else {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(str, map);
        }
    }

    public final void a(final boolean z, @Nullable Map<String, Object> map, ExtendInfoModel extendInfoModel) {
        int i;
        DialogInterface.OnClickListener onClickListener;
        View inflate;
        boolean z2;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a bVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), map, extendInfoModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f30831e8ff82c4b96ddacb34d9e634e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f30831e8ff82c4b96ddacb34d9e634e0");
        } else if (this.c == null || !this.c.isShowing()) {
            if ((map == null || !map.containsKey("data")) && extendInfoModel == null) {
                return;
            }
            if (!z) {
                try {
                    this.o = (ExtendInfoModel) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(map.get("data")), (Class<Object>) ExtendInfoModel.class);
                } catch (Exception unused) {
                }
            } else {
                this.o = extendInfoModel;
            }
            this.m = this.o.tablewareSettingsInfo;
            if (e()) {
                if (this.m != null && this.m.settingsOptions == null) {
                    return;
                }
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbb8fb240f8ffdea7578f09774e6607e", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbb8fb240f8ffdea7578f09774e6607e");
                } else {
                    this.e = false;
                    if (this.h != 0) {
                        z2 = this.h == 1;
                    } else {
                        z2 = this.v;
                    }
                    int c = c();
                    int i2 = c == 88 ? 0 : c;
                    if (this.o.experimentType == 1) {
                        bVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c(this.b, Long.valueOf(this.r), this.s, this.t, this.f, this.m, z2, i2, z, this.j, this.o.addressItem, this.o.addressType, this.o.businessType, new c.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2c78e1b083e1837b99c2bce8b4d02f3a", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2c78e1b083e1837b99c2bce8b4d02f3a");
                                } else if (c.this.c == null || !c.this.c.isShowing()) {
                                } else {
                                    c.this.e = false;
                                    c.this.c.dismiss();
                                }
                            }

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.c.a
                            public final void a(int i3, int i4, boolean z3) {
                                Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "caeaf56ed9ba7ba2c4f85449982abca1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "caeaf56ed9ba7ba2c4f85449982abca1");
                                    return;
                                }
                                c.this.e = true;
                                c.this.j = i3;
                                if (i3 != 101) {
                                    c.this.g = 99;
                                    if (c.this.c != null && !z) {
                                        ae.a(c.this.b, c.this.i.confirm_tip);
                                    }
                                } else if (i4 == 0) {
                                    c.this.g = 88;
                                } else if (i4 > 0 && i4 <= 15) {
                                    c.this.g = i4;
                                } else {
                                    c.this.g = 0;
                                }
                                c.this.b();
                                c.this.h = z3 ? 1 : 2;
                                c.a(c.this);
                                HashMap hashMap = new HashMap();
                                hashMap.put("select_dinner_code", Integer.valueOf(c.this.j));
                                hashMap.put("select_dinner_count", Integer.valueOf(c.this.g));
                                hashMap.put("use_default_tableware_tip", Boolean.valueOf(c.this.a()));
                                c.this.a("dinners_update_event", hashMap);
                                if (!z || c.this.k == null) {
                                    return;
                                }
                                c.this.k.a();
                            }
                        });
                    } else {
                        bVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b(this.b, Long.valueOf(this.r), this.s, this.t, this.f, this.m, z2, i2, z, this.j, this.o.addressItem, this.o.businessType, new b.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.a
                            public final void a() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "048bdcfe9a3698415ee19005a78b4456", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "048bdcfe9a3698415ee19005a78b4456");
                                } else if (c.this.c == null || !c.this.c.isShowing()) {
                                } else {
                                    c.this.e = false;
                                    c.this.c.dismiss();
                                }
                            }

                            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.tablewareinfo.b.a
                            public final void a(int i3, int i4, boolean z3) {
                                Object[] objArr3 = {Integer.valueOf(i3), Integer.valueOf(i4), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c298f83e73f148c43f3622841af24a07", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c298f83e73f148c43f3622841af24a07");
                                    return;
                                }
                                c.this.e = true;
                                c.this.j = i3;
                                if (i3 != 101) {
                                    c.this.g = 99;
                                    if (c.this.c != null && !z) {
                                        ae.a(c.this.b, c.this.i.confirm_tip);
                                    }
                                } else if (i4 == 0) {
                                    c.this.g = 88;
                                } else if (i4 > 0 && i4 <= 15) {
                                    c.this.g = i4;
                                } else {
                                    c.this.g = 0;
                                }
                                c.this.b();
                                c.this.h = z3 ? 1 : 2;
                                c.a(c.this);
                                HashMap hashMap = new HashMap();
                                hashMap.put("select_dinner_code", Integer.valueOf(c.this.j));
                                hashMap.put("select_dinner_count", Integer.valueOf(c.this.g));
                                hashMap.put("use_default_tableware_tip", Boolean.valueOf(c.this.a()));
                                c.this.a("dinners_update_event", hashMap);
                                if (!z || c.this.k == null) {
                                    return;
                                }
                                c.this.k.a();
                            }
                        });
                    }
                }
                this.d = bVar;
                inflate = this.d.a();
                onClickListener = null;
                i = 0;
            } else if (this.o == null || this.o.dinersOptionList == null || this.o.dinersOptionList.isEmpty()) {
                return;
            } else {
                final List<DinersOption> list = this.o.dinersOptionList;
                String[] strArr = new String[list.size()];
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    DinersOption dinersOption = list.get(i4);
                    strArr[i4] = dinersOption.description;
                    if (this.g == dinersOption.count) {
                        i3 = i4;
                    }
                }
                Object[] objArr3 = {Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0), list, strArr};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                i = 0;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "07b3cd862987c301b3d8f14d99907109", RobustBitConfig.DEFAULT_VALUE)) {
                    inflate = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "07b3cd862987c301b3d8f14d99907109");
                    onClickListener = null;
                } else {
                    onClickListener = null;
                    inflate = this.b.getLayoutInflater().inflate(R.layout.wm_order_confirm_view_list_diners_count, (ViewGroup) null);
                    TextView textView = (TextView) inflate.findViewById(R.id.txt_order_confirm_tableware_advocate_title);
                    if (!TextUtils.isEmpty(this.o.tablewareAdvocateTip)) {
                        textView.setVisibility(0);
                        textView.setText(this.o.tablewareAdvocateTip);
                    }
                    MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.lv_order_confirm_tableware_count);
                    CustomDialog.b bVar2 = new CustomDialog.b(this.b, strArr);
                    bVar2.a(i3);
                    maxHeightListView.setAdapter((ListAdapter) bVar2);
                    maxHeightListView.setMaxHeight(g.a(this.b, 225.0f));
                    maxHeightListView.setSelection(i3);
                    maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c.2
                        public static ChangeQuickRedirect a;

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view, int i5, long j) {
                            Object[] objArr4 = {adapterView, view, Integer.valueOf(i5), new Long(j)};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f1fa574c87b998495419f3edc4931439", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f1fa574c87b998495419f3edc4931439");
                                return;
                            }
                            if (c.this.c != null) {
                                c.this.c.dismiss();
                            }
                            DinersOption dinersOption2 = (DinersOption) list.get(i5);
                            if (dinersOption2 != null && dinersOption2.count == 99 && !TextUtils.isEmpty(dinersOption2.greenLifeTip)) {
                                ae.a(c.this.b, dinersOption2.greenLifeTip);
                            }
                            c.this.a(dinersOption2, true);
                            HashMap hashMap = new HashMap();
                            StringBuilder sb = new StringBuilder();
                            sb.append(i5 + 1);
                            hashMap.put("dinner_usercount", sb.toString());
                            JudasManualManager.a("b_uWU2j").a("index", i5).b(hashMap).a("c_ykhs39e").a(c.this.b).a();
                        }
                    });
                }
            }
            CustomDialog.a a2 = new CustomDialog.a(this.b).a(inflate).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c.1
                public static ChangeQuickRedirect a;

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    Object[] objArr4 = {dialogInterface};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "70e60f9e63324b0d78e1ff417f670a28", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "70e60f9e63324b0d78e1ff417f670a28");
                        return;
                    }
                    if (c.this.d != null) {
                        c.this.d.e();
                        c.this.d = null;
                    }
                    c.this.c = null;
                }
            });
            if (!e()) {
                a2.b(R.string.cancel, onClickListener);
            }
            if (e() && this.d != null) {
                a2.a(this.d);
            }
            this.c = a2.c();
            if (!e() || this.c == null) {
                return;
            }
            if (this.d != null) {
                this.d.f();
            }
            View findViewById = this.c.findViewById(R.id.dialog_root_panel);
            if (findViewById != null) {
                findViewById.setBackgroundColor(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DinersOption dinersOption, boolean z) {
        Object[] objArr = {dinersOption, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "435bd924a29752eaa934e612020936bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "435bd924a29752eaa934e612020936bc");
            return;
        }
        if (dinersOption != null) {
            com.sankuai.waimai.bussiness.order.confirm.cache.a.a().a(this.s, dinersOption);
        } else {
            com.sankuai.waimai.bussiness.order.confirm.cache.a.a().c();
        }
        if (dinersOption != null) {
            this.g = dinersOption.count;
            b();
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("select_dinner_code", Integer.valueOf(this.j));
                hashMap.put("select_dinner_count", Integer.valueOf(this.g));
                hashMap.put("use_default_tableware_tip", Boolean.valueOf(a()));
                a("dinners_update_event", hashMap);
            }
        }
    }

    private boolean e() {
        return this.m != null;
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41858190fc9f624bffcf53fbbe9c26c0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41858190fc9f624bffcf53fbbe9c26c0")).booleanValue() : (e() && !this.u && this.g == Integer.MIN_VALUE) ? false : true;
    }

    void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6297b79d80a1800aa8d62000e195d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6297b79d80a1800aa8d62000e195d2");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.b(false, false, "diners_count", Integer.valueOf(c()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("choose_diners_count", Integer.valueOf(c()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("choose_diners_code", Integer.valueOf(d()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("use_default_tableware_tip", Boolean.valueOf(a()));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.a("need_choose_tableware", Boolean.valueOf(!f()));
    }
}
