package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit;

import android.app.Activity;
import android.app.Dialog;
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
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.widget.MaxHeightListView;
import com.sankuai.waimai.platform.widget.dialog.CustomDialog;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    Object b;
    Dialog c;
    View d;
    Activity e;
    long f;
    List<DinersOption> g;
    int h;
    InterfaceC0920a i;
    private TextView j;
    private MaxHeightListView k;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0920a {
        void a(DinersOption dinersOption);
    }

    public a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e369e39ceef605f9acc49cea1f291398", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e369e39ceef605f9acc49cea1f291398");
            return;
        }
        this.h = 0;
        this.b = obj;
    }

    public final void a(Activity activity, long j, List<DinersOption> list, int i, String str) {
        Object[] objArr = {activity, new Long(j), list, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3329ae5526589f3ff699585465f116a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3329ae5526589f3ff699585465f116a");
            return;
        }
        if (this.e != activity) {
            this.e = activity;
            this.c = null;
        }
        this.f = j;
        this.g = list;
        this.h = i;
        if (list.isEmpty() || a()) {
            return;
        }
        String[] strArr = new String[list.size()];
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            DinersOption dinersOption = list.get(i3);
            strArr[i3] = dinersOption.description;
            if (i == dinersOption.count) {
                i2 = i3;
            }
        }
        if (this.c == null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd6b8006330c0507cf71e5dc423fb43a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd6b8006330c0507cf71e5dc423fb43a");
            } else {
                this.d = this.e.getLayoutInflater().inflate(R.layout.wm_order_confirm_view_list_diners_count, (ViewGroup) null);
                this.j = (TextView) this.d.findViewById(R.id.txt_order_confirm_tableware_advocate_title);
                this.k = (MaxHeightListView) this.d.findViewById(R.id.lv_order_confirm_tableware_count);
                this.k.setMaxHeight(g.a(this.e, 225.0f));
                this.k.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view, int i4, long j2) {
                        Object[] objArr3 = {adapterView, view, Integer.valueOf(i4), new Long(j2)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6b6939d50f0eb4e9d62f3e1d2cdc5c8c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6b6939d50f0eb4e9d62f3e1d2cdc5c8c");
                            return;
                        }
                        final a aVar = a.this;
                        final DinersOption dinersOption2 = a.this.g.get(i4);
                        Object[] objArr4 = {dinersOption2};
                        ChangeQuickRedirect changeQuickRedirect4 = a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "6d8317ec0732e2ec6ec7ab9f59affc2e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "6d8317ec0732e2ec6ec7ab9f59affc2e");
                        } else if (aVar.h != dinersOption2.count) {
                            final Dialog a2 = com.sankuai.waimai.platform.widget.dialog.a.a(aVar.e);
                            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).submitExtraOrderInfo(aVar.f, 4, null, null, 0, null, dinersOption2.count, null), new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a.3
                                public static ChangeQuickRedirect a;

                                @Override // rx.e
                                public final /* synthetic */ void onNext(Object obj) {
                                    BaseResponse baseResponse = (BaseResponse) obj;
                                    Object[] objArr5 = {baseResponse};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "91a8ec2aa2d200f4f592a18a19093d30", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "91a8ec2aa2d200f4f592a18a19093d30");
                                        return;
                                    }
                                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                                    if (baseResponse != null) {
                                        if (baseResponse.code == 0) {
                                            a.this.h = dinersOption2.count;
                                            a aVar2 = a.this;
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a.a;
                                            if (PatchProxy.isSupport(objArr6, aVar2, changeQuickRedirect6, false, "21eca3539de7d6035837afd236d6dfcd", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, aVar2, changeQuickRedirect6, false, "21eca3539de7d6035837afd236d6dfcd");
                                            } else if (aVar2.a()) {
                                                aVar2.c.dismiss();
                                            }
                                            if (a.this.i != null) {
                                                a.this.i.a(dinersOption2);
                                                return;
                                            }
                                            return;
                                        } else if (a.this.d == null || !a.this.c.isShowing()) {
                                            return;
                                        } else {
                                            ae.a(a.this.d, baseResponse.msg);
                                            return;
                                        }
                                    }
                                    ae.a(a.this.d, a.this.e.getResources().getString(R.string.wm_order_detail_modify_order_info_edit_error_default));
                                }

                                @Override // rx.e
                                public final void onError(Throwable th) {
                                    Object[] objArr5 = {th};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9a4ec2dd02f7f4fae72ad3e1e2c266db", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9a4ec2dd02f7f4fae72ad3e1e2c266db");
                                        return;
                                    }
                                    com.sankuai.waimai.platform.widget.dialog.a.b(a2);
                                    ae.a(a.this.d, a.this.e.getResources().getString(R.string.wm_order_detail_modify_order_info_edit_error_default));
                                }
                            }, aVar.b);
                        }
                    }
                });
                this.c = new CustomDialog.a(this.e).a(this.d).b(R.string.cancel, (DialogInterface.OnClickListener) null).a(new DialogInterface.OnDismissListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.a.2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                    }
                }).b(CustomDialog.d.BOTTOM).a();
            }
        }
        if (!TextUtils.isEmpty(str)) {
            this.j.setText(str);
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        CustomDialog.b bVar = new CustomDialog.b(this.e, strArr);
        bVar.a(i2);
        this.k.setAdapter((ListAdapter) bVar);
        this.k.setSelection(i2);
        if (this.e.isDestroyed() || this.e.isFinishing()) {
            return;
        }
        this.c.show();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c5b1d9303c60dac321f22fd1646bf30", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c5b1d9303c60dac321f22fd1646bf30")).booleanValue() : this.c != null && this.c.isShowing();
    }
}
