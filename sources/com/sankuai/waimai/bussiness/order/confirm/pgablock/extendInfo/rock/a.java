package com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CodeDesc;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public Context b;
    public int c;
    public ArrayList<com.sankuai.waimai.bussiness.order.confirm.remark.a> d;
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c e;
    public long f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    String l;
    Dialog m;
    List<CodeDesc> n;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.b o;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c p;
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a q;
    public String r;
    private com.sankuai.waimai.bussiness.order.confirm.a s;
    private int t;

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3525de726a40c9ccf59f2b7dab9894e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3525de726a40c9ccf59f2b7dab9894e3");
        } else if (aVar.b == null || !(aVar.b instanceof BaseActivity)) {
        } else {
            ((BaseActivity) aVar.b).v();
        }
    }

    public a(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, c cVar) {
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f4793e2c70f3dfed6d3da668ade2cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f4793e2c70f3dfed6d3da668ade2cc");
            return;
        }
        this.c = 0;
        this.f = 0L;
        this.g = "";
        this.i = false;
        this.j = true;
        this.k = "";
        this.t = -1;
        d.b(false, false, "supply_code", Integer.valueOf(this.t));
        this.b = context;
        this.s = aVar;
        this.o = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.b((Activity) this.b);
        this.p = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.c((Activity) this.b, cVar);
        d.b(false, false, "mt_invoice", 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r25, java.lang.String r27, int r28, double r29, com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo r31, com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a(long, java.lang.String, int, double, com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo, com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a, java.lang.String):void");
    }

    public String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fbdb361ccb282c4dea87f1f793afc9d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fbdb361ccb282c4dea87f1f793afc9d");
        }
        long d = com.sankuai.waimai.platform.domain.manager.user.a.i().d();
        String a2 = com.sankuai.waimai.bussiness.order.confirm.helper.c.a();
        return "bubble-" + d + CommonConstant.Symbol.MINUS + a2;
    }

    public void a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23a16e8c8989184eefcc28518bc48852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23a16e8c8989184eefcc28518bc48852");
            return;
        }
        try {
            if (map.containsKey("data")) {
                this.n = (List) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(((HashMap) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(map.get("data")), (Class<Object>) HashMap.class)).get("no_product_reminds")), new TypeToken<List<CodeDesc>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.2
                }.getType());
            }
        } catch (Exception unused) {
        }
        if ((this.m != null && this.m.isShowing()) || this.n == null || this.n.isEmpty()) {
            return;
        }
        String[] strArr = new String[this.n.size()];
        int i = -1;
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            CodeDesc codeDesc = this.n.get(i2);
            strArr[i2] = codeDesc.desc;
            if (this.t == codeDesc.code) {
                i = i2;
            }
        }
        View inflate = ((Activity) this.b).getLayoutInflater().inflate(R.layout.wm_order_confirm_adapter_short_supply_item, (ViewGroup) null);
        MaxHeightListView maxHeightListView = (MaxHeightListView) inflate.findViewById(R.id.lv_order_confirm_tableware_count);
        com.sankuai.waimai.bussiness.order.base.adapter.a aVar = new com.sankuai.waimai.bussiness.order.base.adapter.a(this.b, strArr);
        aVar.a(i);
        maxHeightListView.setAdapter((ListAdapter) aVar);
        maxHeightListView.setMaxHeight(g.a(this.b, 225.0f));
        maxHeightListView.setSelection(i);
        this.m = new CustomDialog.a(this.b).a(inflate).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.3
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e8268a9af89c8a0d8fe3d29e3f6acd5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e8268a9af89c8a0d8fe3d29e3f6acd5");
                } else {
                    a.this.m = null;
                }
            }
        }).c();
        maxHeightListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.4
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i3, long j) {
                Object[] objArr2 = {adapterView, view, Integer.valueOf(i3), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a31763259bb18ff5ba584ddb06241ae0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a31763259bb18ff5ba584ddb06241ae0");
                    return;
                }
                if (a.this.m != null) {
                    a.this.m.dismiss();
                }
                CodeDesc codeDesc2 = a.this.n.get(i3);
                if (codeDesc2 != null) {
                    a.this.a(codeDesc2.desc, codeDesc2.code);
                    a.this.a("no_product_reminds_update_event", a.this.l, "desc");
                }
            }
        });
    }

    public void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6f75476ad60cc10bf3dfda6a0a6a195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6f75476ad60cc10bf3dfda6a0a6a195");
            return;
        }
        this.l = str;
        this.t = i;
        d.b(false, false, "no_product_reminds_selected", Integer.valueOf(i));
    }

    public void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbcf3b6ffcdcc52224cfec96bffd76e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbcf3b6ffcdcc52224cfec96bffd76e6");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(str3, str2);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.b.a().a(str, hashMap);
    }
}
