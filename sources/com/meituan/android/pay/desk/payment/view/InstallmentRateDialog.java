package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.installment.InstallmentDescTable;
import com.meituan.android.pay.common.payment.bean.installment.InstallmentRateDescBean;
import com.meituan.android.paybase.dialog.BaseDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InstallmentRateDialog extends BaseDialog {
    public static ChangeQuickRedirect a;
    private final InstallmentRateDescBean b;

    public InstallmentRateDialog(Context context, InstallmentRateDescBean installmentRateDescBean) {
        super(context);
        int i = 2;
        char c = 1;
        Object[] objArr = {context, installmentRateDescBean};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20432db92a9926d8d116e672e1fe55a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20432db92a9926d8d116e672e1fe55a");
            return;
        }
        this.b = installmentRateDescBean;
        if (this.b == null) {
            dismiss();
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37306a0d26964c93f8a7a656032f093a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37306a0d26964c93f8a7a656032f093a");
            return;
        }
        requestWindowFeature(1);
        setContentView(R.layout.mpay__show_installment_desc);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.desc_container);
        findViewById(R.id.btn_confirm).setOnClickListener(h.a(this));
        TextView textView = (TextView) findViewById(R.id.tab_title);
        TextView textView2 = (TextView) findViewById(R.id.tab_content);
        TextView textView3 = (TextView) findViewById(R.id.tab_title_first);
        TextView textView4 = (TextView) findViewById(R.id.tab_title_second);
        TextView textView5 = (TextView) findViewById(R.id.tab_title_third);
        if (this.b != null) {
            textView.setText(this.b.getTitle());
            textView2.setText(this.b.getContent());
            a(textView3, this.b.getTableTitle(), 0);
            a(textView4, this.b.getTableTitle(), 1);
            a(textView5, this.b.getTableTitle(), 2);
            if (com.meituan.android.paybase.utils.i.a((Collection) this.b.getTableList())) {
                return;
            }
            for (InstallmentDescTable installmentDescTable : this.b.getTableList()) {
                if (installmentDescTable != null) {
                    View inflate = LayoutInflater.from(getContext()).inflate(R.layout.mpay__show_installment_desc_item, (ViewGroup) null);
                    Object[] objArr3 = new Object[i];
                    objArr3[0] = inflate;
                    objArr3[c] = installmentDescTable;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "780d906141e027a8c8b9d88c6ebff97d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "780d906141e027a8c8b9d88c6ebff97d");
                    } else if (inflate != null) {
                        TextView textView6 = (TextView) inflate.findViewById(R.id.title_first);
                        TextView textView7 = (TextView) inflate.findViewById(R.id.title_second);
                        TextView textView8 = (TextView) inflate.findViewById(R.id.title_third);
                        if (installmentDescTable != null) {
                            textView6.setText(installmentDescTable.getPeriod());
                            textView7.setText(installmentDescTable.getFeeRate());
                            textView8.setText(installmentDescTable.getAnnualizedRate());
                        } else {
                            inflate.setVisibility(8);
                        }
                    }
                    if (viewGroup != null && inflate != null) {
                        viewGroup.addView(inflate);
                    }
                    i = 2;
                    c = 1;
                }
            }
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d7a57caa8c76f8a38cce49749a1fa9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d7a57caa8c76f8a38cce49749a1fa9");
        } else {
            super.onAttachedToWindow();
        }
    }

    public static /* synthetic */ void a(InstallmentRateDialog installmentRateDialog, View view) {
        Object[] objArr = {installmentRateDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14737b8c3bf854ac809b54dd446a5e74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14737b8c3bf854ac809b54dd446a5e74");
        } else {
            installmentRateDialog.dismiss();
        }
    }

    private void a(TextView textView, List<String> list, int i) {
        Object[] objArr = {textView, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28e85eaba3ca4cf544fe43db039a765f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28e85eaba3ca4cf544fe43db039a765f");
        } else if (textView == null || com.meituan.android.paybase.utils.i.a((Collection) list) || TextUtils.isEmpty(list.get(i))) {
        } else {
            textView.setText(list.get(i));
        }
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12620b726e856540e3fdbc785774336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12620b726e856540e3fdbc785774336");
            return;
        }
        super.onBackPressed();
        cancel();
    }
}
