package com.meituan.android.elderly.view.revision;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.android.elderly.bean.Cashier;
import com.meituan.android.paybase.common.activity.PayBaseActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ag;
import com.meituan.android.paybase.utils.m;
import com.meituan.android.paycommon.lib.widgets.AutoChangeNumberView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.utils.p;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends LinearLayout implements g {
    public static ChangeQuickRedirect a;
    private Cashier b;
    private AutoChangeNumberView c;
    private LinearLayout d;

    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        Object[] objArr = {view, motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d4c9179477fc3f8fb16ce4446dcc48ca", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d4c9179477fc3f8fb16ce4446dcc48ca")).booleanValue();
        }
        return true;
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b38bf0a9a9454688236fea4e10c9f090", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b38bf0a9a9454688236fea4e10c9f090");
        }
    }

    public final void a(Cashier cashier) {
        Object[] objArr = {cashier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59eb1d3685e9d9b711eea630ae9a14ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59eb1d3685e9d9b711eea630ae9a14ce");
            return;
        }
        this.b = cashier;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed32850ddd7e61c60d5148675a6b1c31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed32850ddd7e61c60d5148675a6b1c31");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.cashier_elderly__order_info_view, this);
        this.c = (AutoChangeNumberView) findViewById(R.id.business_info_money);
        this.d = (LinearLayout) findViewById(R.id.order_info_layout);
        Typeface a2 = m.a(getContext());
        if (a2 != null) {
            this.c.setTypeface(a2);
            ((TextView) findViewById(R.id.business_money_symbol)).setTypeface(a2);
        }
        TextView textView = (TextView) findViewById(R.id.order_name);
        View findViewById = findViewById(R.id.order_name_detail);
        if (this.b != null) {
            String orderName = this.b.getOrderName();
            if (!TextUtils.isEmpty(orderName)) {
                textView.setVisibility(0);
                textView.setText(orderName);
            } else {
                textView.setVisibility(8);
            }
            if (this.b.getOrderInfo() != null) {
                findViewById.setVisibility(0);
                com.meituan.android.paybase.common.analyse.a.a("b_m32qv34l", "收银台首页展示", new a.c().a("IS_TRUE", Boolean.TRUE).b, a.EnumC0329a.VIEW, -1);
                this.d.setOnClickListener(b.a(this));
                return;
            }
            findViewById.setVisibility(8);
        }
    }

    public static /* synthetic */ void a(a aVar, View view) {
        Object[] objArr = {aVar, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "78c7bdd6cb3164dfd8a0d44803f9f302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "78c7bdd6cb3164dfd8a0d44803f9f302");
        } else if (aVar.getContext() instanceof PayBaseActivity) {
            PayBaseActivity payBaseActivity = (PayBaseActivity) aVar.getContext();
            Object[] objArr2 = {payBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0cdb6bfbf96d62d1097bcbd4d445fb05", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0cdb6bfbf96d62d1097bcbd4d445fb05");
            } else if (payBaseActivity == null || payBaseActivity.isFinishing() || payBaseActivity.m()) {
            } else {
                View inflate = LayoutInflater.from(payBaseActivity).inflate(R.layout.cashier_elderly__order_info, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(inflate, -1, -1, true);
                popupWindow.setBackgroundDrawable(new ColorDrawable(184549376));
                p.a(popupWindow, payBaseActivity.getWindow().getDecorView(), 17, 0, 0);
                com.meituan.android.elderly.utils.b.a(payBaseActivity, inflate, aVar.b.getOrderInfo());
                ((RelativeLayout) inflate.findViewById(R.id.cahiser_elderly_popup_window)).setOnClickListener(c.a(popupWindow));
                View.OnTouchListener a2 = d.a();
                ((TextView) inflate.findViewById(R.id.cahiser_elderly_title_text_view)).setOnTouchListener(a2);
                ((ImageView) inflate.findViewById(R.id.cahiser_elderly_divider_image_view)).setOnTouchListener(a2);
            }
        }
    }

    public static /* synthetic */ void a(PopupWindow popupWindow, View view) {
        Object[] objArr = {popupWindow, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c1960198965b563896fde6e79a431915", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c1960198965b563896fde6e79a431915");
        } else {
            p.b(popupWindow);
        }
    }

    @Override // com.meituan.android.elderly.view.revision.g
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99ffa9b1b8fd1e121e3477ccc6d0e347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99ffa9b1b8fd1e121e3477ccc6d0e347");
        } else {
            setBusinessInfoMoney(f);
        }
    }

    private void setBusinessInfoMoney(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a67b2432040e067121c8653b5e033888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a67b2432040e067121c8653b5e033888");
        } else if (this.c != null) {
            this.c.setText(ag.a(Double.valueOf(String.valueOf(f)).doubleValue()));
        }
    }
}
