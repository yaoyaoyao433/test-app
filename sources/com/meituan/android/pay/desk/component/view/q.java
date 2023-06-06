package com.meituan.android.pay.desk.component.view;

import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.desk.component.data.DeskData;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class q implements com.meituan.android.pay.desk.component.a {
    public static ChangeQuickRedirect a;
    Fragment b;
    LinearLayout c;
    public com.meituan.android.pay.desk.pack.a d;
    private DeskData e;

    @Override // com.meituan.android.pay.desk.component.a
    public final void d() {
    }

    public q(Fragment fragment, LinearLayout linearLayout, DeskData deskData) {
        Object[] objArr = {fragment, linearLayout, deskData};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f66a11d448493243004d98430b74a04b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f66a11d448493243004d98430b74a04b");
            return;
        }
        this.b = fragment;
        this.c = linearLayout;
        this.e = deskData;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf8e0d9d0d43cf26be230cee7311bdba", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf8e0d9d0d43cf26be230cee7311bdba")).booleanValue() : (this.e == null || com.meituan.android.pay.desk.component.data.a.f(this.e.getDesk()) == null) ? false : true;
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ecfd30d75b69705ff0940ff2a1c7240c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ecfd30d75b69705ff0940ff2a1c7240c");
        } else {
            m.a(this.c, Integer.valueOf((int) R.id.mpay__desk_select_payment_view), (int) R.layout.paycommon__selected_bank_container);
        }
    }

    @Override // com.meituan.android.pay.desk.component.a
    public final void c() {
        String statusInfo;
        String statusInfo2;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0855009b59b59b85b47a8f63a24ba7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0855009b59b59b85b47a8f63a24ba7e0");
        } else if (this.b == null || this.c == null) {
        } else {
            ViewGroup viewGroup = (ViewGroup) this.c.findViewById(R.id.bank_container);
            com.meituan.android.pay.common.selectdialog.b f = com.meituan.android.pay.desk.component.data.a.f(this.e.getDesk());
            com.meituan.android.pay.common.payment.data.a selectPayment = this.e.getSelectPayment();
            Object[] objArr2 = {viewGroup, selectPayment};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a79c3ab1047fa7c890d56c650d430dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a79c3ab1047fa7c890d56c650d430dc");
            } else if (viewGroup != null) {
                if (selectPayment == null) {
                    viewGroup.setVisibility(8);
                } else {
                    viewGroup.setVisibility(0);
                    TextView textView = (TextView) viewGroup.findViewById(R.id.bank_name);
                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.bank_name_ext);
                    Object[] objArr3 = {selectPayment, textView, textView2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4953a310c9710f9c5e7fc6c62fe72373", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4953a310c9710f9c5e7fc6c62fe72373");
                    } else if (selectPayment != null) {
                        String name = selectPayment.getName();
                        String str = "";
                        if (selectPayment.getCardInfo() != null && !TextUtils.isEmpty(selectPayment.getCardInfo().getNameExt()) && !com.meituan.android.pay.common.payment.utils.c.a(selectPayment.getPayType())) {
                            str = selectPayment.getCardInfo().getNameExt();
                        }
                        if (!TextUtils.isEmpty(name)) {
                            textView.setText(name);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            textView2.setText(str);
                        } else {
                            textView2.setText("");
                        }
                    }
                    ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bank_icon);
                    TextView textView3 = (TextView) viewGroup.findViewById(R.id.bank_desc);
                    PayLabelContainer payLabelContainer = (PayLabelContainer) viewGroup.findViewById(R.id.label_container);
                    if (!com.meituan.android.pay.common.payment.utils.d.a(selectPayment)) {
                        textView.setTextColor(viewGroup.getResources().getColor(R.color.paycommon__text_normal));
                        textView2.setTextColor(viewGroup.getResources().getColor(R.color.paycommon__text_normal));
                        if (selectPayment.getStatus() == 2) {
                            if (com.meituan.android.pay.desk.component.data.a.a(selectPayment)) {
                                statusInfo2 = selectPayment.getExceedDesc();
                            } else {
                                statusInfo2 = selectPayment.getStatusInfo();
                            }
                            if (!TextUtils.isEmpty(statusInfo2)) {
                                textView3.setText(statusInfo2);
                                textView3.setVisibility(0);
                                i = 8;
                            } else {
                                i = 8;
                                textView3.setVisibility(8);
                            }
                            payLabelContainer.setVisibility(i);
                        } else {
                            if (!com.meituan.android.paybase.utils.i.a((Collection) selectPayment.getLabels())) {
                                payLabelContainer.removeAllViews();
                                payLabelContainer.setVisibility(0);
                                payLabelContainer.a(selectPayment.getLabels());
                            } else {
                                payLabelContainer.setVisibility(8);
                            }
                            textView3.setVisibility(8);
                        }
                        if (selectPayment.getIcon() != null && !TextUtils.isEmpty(selectPayment.getIcon().getEnable())) {
                            w.a(selectPayment.getIcon().getEnable(), imageView, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                        } else {
                            imageView.setImageResource(R.drawable.mpay__payment_default_pic);
                        }
                    } else {
                        textView.setTextColor(viewGroup.getResources().getColor(R.color.paycommon__text_disable));
                        textView2.setTextColor(viewGroup.getResources().getColor(R.color.paycommon__text_disable));
                        payLabelContainer.setVisibility(8);
                        if (com.meituan.android.pay.desk.component.data.a.a(selectPayment)) {
                            statusInfo = selectPayment.getExceedDesc();
                        } else {
                            statusInfo = selectPayment.getStatusInfo();
                        }
                        if (!TextUtils.isEmpty(statusInfo)) {
                            textView3.setText(statusInfo);
                            textView3.setVisibility(0);
                        } else {
                            textView3.setVisibility(8);
                        }
                        if (selectPayment.getIcon() != null && !TextUtils.isEmpty(selectPayment.getIcon().getDisable())) {
                            w.a(selectPayment.getIcon().getDisable(), imageView, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
                        } else {
                            imageView.setImageResource(R.drawable.mpay__payment_default_pic);
                        }
                    }
                }
            }
            viewGroup.setOnClickListener(r.a(this, f));
        }
    }
}
