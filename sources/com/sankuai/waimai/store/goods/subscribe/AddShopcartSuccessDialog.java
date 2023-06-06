package com.sankuai.waimai.store.goods.subscribe;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.abtest.d;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AddShopcartSuccessDialog extends SCBaseDialog {
    public static ChangeQuickRedirect a;

    public AddShopcartSuccessDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_common_add_shopcart_success_dialog, (ViewGroup) null), R.style.WmStBaseDialogTheme);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4ec5a8dd6c5f128243b908e5e2d0957", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4ec5a8dd6c5f128243b908e5e2d0957");
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c91b1363ac22fd0f5d429543c4de411d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c91b1363ac22fd0f5d429543c4de411d");
            return;
        }
        super.a(view);
        view.setBackground(e.b(view.getContext(), 17170443, (int) R.dimen.wm_sc_common_dimen_12));
        TextView textView = (TextView) view.findViewById(R.id.tv_go_cart_button);
        textView.setBackground(e.a(textView.getContext(), new int[]{R.color.wm_sg_color_FFE14D, R.color.wm_sg_color_FFC34D}, (int) R.dimen.wm_sc_common_dimen_6));
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.subscribe.AddShopcartSuccessDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9ac2582fc85b260aeee6dcd2c52631c4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9ac2582fc85b260aeee6dcd2c52631c4");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(AddShopcartSuccessDialog.this.bB_(), "b_waimai_mvqssvg0_mc").a("button_code", 1).a();
                AddShopcartSuccessDialog.this.dismiss();
                com.sankuai.waimai.store.manager.user.a.a(AddShopcartSuccessDialog.this.bB_(), new Runnable() { // from class: com.sankuai.waimai.store.goods.subscribe.AddShopcartSuccessDialog.1.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c897da298237e8259da16c8134ebb96", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c897da298237e8259da16c8134ebb96");
                        } else {
                            d.a(AddShopcartSuccessDialog.this.bB_());
                        }
                    }
                });
            }
        });
        TextView textView2 = (TextView) view.findViewById(R.id.tv_cancel_button);
        textView2.setBackground(e.a(textView2.getContext(), new int[]{R.color.wm_sg_color_F5F5F6}, (int) R.dimen.wm_sc_common_dimen_6));
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.subscribe.AddShopcartSuccessDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "31b421365795df2f307808df666d5f59", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "31b421365795df2f307808df666d5f59");
                    return;
                }
                com.sankuai.waimai.store.manager.judas.b.a(AddShopcartSuccessDialog.this.bB_(), "b_waimai_mvqssvg0_mc").a("button_code", 0).a();
                AddShopcartSuccessDialog.this.dismiss();
            }
        });
        com.sankuai.waimai.store.manager.judas.b.b(bB_(), "b_waimai_mkzyb5d1_mv").a();
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog, android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e8c3691499a46c2b364882e6b320888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e8c3691499a46c2b364882e6b320888");
            return;
        }
        super.show();
        setCanceledOnTouchOutside(true);
    }
}
