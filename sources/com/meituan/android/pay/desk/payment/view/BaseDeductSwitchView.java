package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.payment.bean.DeductSwitchDiscount;
import com.meituan.android.paybase.utils.ag;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BaseDeductSwitchView extends LinearLayout implements com.meituan.android.pay.desk.payment.a {
    public static ChangeQuickRedirect b;
    protected CheckBox c;
    protected ViewGroup d;
    protected TextView e;
    protected TextView f;
    protected com.meituan.android.pay.common.payment.data.b g;

    public BaseDeductSwitchView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d528041501bb4629bf4cd85a3fa6a3a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d528041501bb4629bf4cd85a3fa6a3a");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public BaseDeductSwitchView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd1f61e63e38f63a9bd0943c41131799", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd1f61e63e38f63a9bd0943c41131799");
            return;
        }
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void a(com.meituan.android.pay.common.payment.data.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c2f22d95dd8df104be20620e1f9f45a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c2f22d95dd8df104be20620e1f9f45a");
            return;
        }
        this.g = bVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e08266e327d117a98e2ff5df9b429a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e08266e327d117a98e2ff5df9b429a2");
        } else if (this.d == null) {
            setOrientation(1);
            this.d = (ViewGroup) inflate(getContext(), R.layout.mpay__deduct_switch_view, this);
            this.e = (TextView) this.d.findViewById(R.id.mpay__deduct_name);
            this.f = (TextView) this.d.findViewById(R.id.mpay__deduct_reduce);
            this.c = (CheckBox) this.d.findViewById(R.id.mpay__deduct_switch);
            this.c.setButtonDrawable(getResources().getDrawable(R.color.transparent));
            if (this.g != null) {
                this.e.setText(this.g.getDeductName());
                this.c.setChecked(this.g.isSwitchOn());
                this.f.setVisibility(this.c.isChecked() ? 0 : 8);
            }
        }
    }

    public void a(DeductSwitchDiscount deductSwitchDiscount) {
        Object[] objArr = {deductSwitchDiscount};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2f4fceae8f97941991984b9d048fc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2f4fceae8f97941991984b9d048fc5");
        } else if (this.g == null) {
        } else {
            if (deductSwitchDiscount != null) {
                TextView textView = this.f;
                textView.setText(CommonConstant.Symbol.MINUS + getContext().getString(R.string.mpay__money_prefix) + ag.a(deductSwitchDiscount.getReduce()));
                this.e.setTextColor(ContextCompat.getColor(getContext(), R.color.mpay__payment_speed_bonus_text_color_normal));
                this.c.setChecked(this.g.isSwitchOn());
                this.c.setEnabled(true);
                this.f.setVisibility(this.c.isChecked() ? 0 : 8);
                return;
            }
            this.e.setTextColor(ContextCompat.getColor(getContext(), R.color.mpay__payment_speed_bonus_text_color_abnormal));
            this.c.setChecked(false);
            this.c.setEnabled(false);
            this.f.setVisibility(8);
        }
    }

    public void setOnCheckedListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Object[] objArr = {onCheckedChangeListener};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9080235a0ec679bb2eb0286eb14ac48c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9080235a0ec679bb2eb0286eb14ac48c");
        } else {
            this.c.setOnCheckedChangeListener(c.a(this, onCheckedChangeListener));
        }
    }

    public static /* synthetic */ void a(BaseDeductSwitchView baseDeductSwitchView, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, CompoundButton compoundButton, boolean z) {
        Object[] objArr = {baseDeductSwitchView, onCheckedChangeListener, compoundButton, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b84db99ce8a8cfa31eeacd1e363b4a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b84db99ce8a8cfa31eeacd1e363b4a56");
            return;
        }
        baseDeductSwitchView.f.setVisibility(z ? 0 : 8);
        onCheckedChangeListener.onCheckedChanged(compoundButton, z);
    }
}
