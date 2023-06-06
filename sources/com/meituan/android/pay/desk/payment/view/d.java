package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.paybase.utils.aj;
import com.meituan.android.paycommon.lib.utils.w;
import com.meituan.android.paycommon.lib.widgets.PayLabelContainer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends LinearLayout implements com.meituan.android.pay.common.render.a, com.meituan.android.pay.desk.payment.b {
    public static ChangeQuickRedirect b;
    private boolean a;
    protected ImageView c;
    protected TextView d;
    protected LinearLayout e;
    protected PayLabelContainer f;
    protected PayLabelContainer g;
    protected com.meituan.android.pay.common.payment.data.d h;
    protected CheckBox i;
    protected TextView j;
    protected ImageView k;
    protected TextView l;
    private View m;

    public boolean a() {
        return true;
    }

    public View d() {
        return null;
    }

    public int getLayoutResource() {
        return R.layout.mpay__base_payment_view;
    }

    @Override // com.meituan.android.pay.common.render.a
    public View getView() {
        return this;
    }

    public d(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bd4fb30fc694a39aec39ca6c9426f8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bd4fb30fc694a39aec39ca6c9426f8c");
        } else {
            this.a = false;
        }
    }

    public void b(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34ea187e64c3b175df119fdeeefeee8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34ea187e64c3b175df119fdeeefeee8d");
            return;
        }
        this.h = dVar;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b33a11850e820ba8ea2a9f5fd825006", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b33a11850e820ba8ea2a9f5fd825006");
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(getLayoutResource(), this);
            this.c = (ImageView) inflate.findViewById(R.id.cashier_pay_icon);
            this.j = (TextView) inflate.findViewById(R.id.txt_cashier_pay_name);
            this.d = (TextView) inflate.findViewById(R.id.txt_cashier_pay_desc);
            this.f = (PayLabelContainer) inflate.findViewById(R.id.right_label_layout);
            this.g = (PayLabelContainer) inflate.findViewById(R.id.bottom_label_layout);
            this.e = (LinearLayout) inflate.findViewById(R.id.name_and_label_layout);
            this.k = (ImageView) inflate.findViewById(R.id.attach_icon);
            this.i = (CheckBox) inflate.findViewById(R.id.ckb_cashier_pay_check);
            this.l = (TextView) inflate.findViewById(R.id.attach_content);
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "361af3cba67f18071be2b052913195b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "361af3cba67f18071be2b052913195b3");
            } else {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.payment_view_container);
                if (linearLayout != null) {
                    linearLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.mpay__common_payment_add_icon_padding_left_revision), 0, aj.a(getContext(), 20.0f), 0);
                }
            }
            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.payment_view_root);
            if (d() != null) {
                linearLayout2.addView(d());
            }
            if (a()) {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = b;
                this.m = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "98ba9e3095a29a500d404088b382d200", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "98ba9e3095a29a500d404088b382d200") : LayoutInflater.from(getContext()).inflate(R.layout.mpay__payment_divider_line, (ViewGroup) null);
                a(44, ContextCompat.getColor(getContext(), R.color.mpay__payment_divider_color));
                linearLayout2.addView(this.m);
            }
        }
        g();
    }

    private String getPhotoViewSource() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "277a746a1138bf9b99503a8930bc4200", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "277a746a1138bf9b99503a8930bc4200");
        }
        if (this.h.getIcon() == null) {
            return null;
        }
        if (j()) {
            return this.h.getIcon().getEnable();
        }
        return this.h.getIcon().getDisable();
    }

    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69995918968728b0befac50aa70e036b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69995918968728b0befac50aa70e036b");
            return;
        }
        this.c.setVisibility(this.h.isShowIcon() ? 0 : 4);
        if (!this.h.isShowIcon() || TextUtils.isEmpty(getPhotoViewSource())) {
            return;
        }
        w.a(getPhotoViewSource(), this.c, R.drawable.mpay__payment_default_pic, R.drawable.mpay__payment_default_pic);
    }

    public String getNameText() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcde0ba66f1c0e990e762d0d440131fe", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcde0ba66f1c0e990e762d0d440131fe");
        }
        String name = this.h.getName();
        if (TextUtils.isEmpty(this.h.getNameSuffix())) {
            return name;
        }
        return name + this.h.getNameSuffix();
    }

    public void a(@Nullable String str, @ColorRes int i, boolean z) {
        Object[] objArr = {str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e44ab79d35563637dafaffd3cca859c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e44ab79d35563637dafaffd3cca859c0");
        } else if (z) {
            this.d.setVisibility(0);
            this.d.setText(str);
            this.d.setTextColor(ContextCompat.getColor(getContext(), i));
        } else {
            this.d.setVisibility(8);
        }
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c05216834ab3ca0d2e7e6b63434cdad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c05216834ab3ca0d2e7e6b63434cdad");
        } else if (j()) {
            this.f.b(getRightLabels(), 3);
            this.f.setVisibility(0);
        } else {
            this.f.removeAllViews();
            this.f.setVisibility(8);
        }
    }

    public List<CombineLabel> getRightLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65925a37859bd412ea95972dde1df194", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65925a37859bd412ea95972dde1df194") : this.h.getRightLabels();
    }

    public List<CombineLabel> getBottomLabels() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f455fc20e0e1c61c6598c565f15e0b53", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f455fc20e0e1c61c6598c565f15e0b53") : this.h.getBottomLabels();
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b80167c1ebba89c035dce367427606", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b80167c1ebba89c035dce367427606");
        } else if (j()) {
            this.g.b(getBottomLabels(), 3);
            this.g.setVisibility(0);
        } else {
            this.g.removeAllViews();
            this.g.setVisibility(8);
        }
    }

    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "909f4a334f76dd687fa18c7dbf05dd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "909f4a334f76dd687fa18c7dbf05dd22");
        } else if (TextUtils.isEmpty(this.h.getAttachIcon())) {
            this.k.setVisibility(8);
        } else {
            w.a(this.h.getAttachIcon(), this.k);
            this.k.setVisibility(0);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc372549b28e4eacad6d3d3581df4998", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc372549b28e4eacad6d3d3581df4998");
        } else {
            this.l.setVisibility(8);
        }
    }

    public boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59615b0e51a8c92b3be49d40078437c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59615b0e51a8c92b3be49d40078437c4")).booleanValue();
        }
        int status = this.h.getStatus();
        return status == 0 || status == 2;
    }

    public View getDividerLineParent() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bb, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.pay.desk.payment.view.d.g():void");
    }

    public void a(com.meituan.android.pay.common.payment.data.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5696ec2227c4edec6c71329dc62e99be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5696ec2227c4edec6c71329dc62e99be");
            return;
        }
        this.a = this.h == dVar;
        g();
    }

    @Override // com.meituan.android.pay.desk.payment.b
    public final boolean c() {
        return this.a;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8f8c1d7a877386253f7a7abaa402fb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8f8c1d7a877386253f7a7abaa402fb2");
        } else if (this.m != null) {
            this.m.setPadding(aj.a(getContext(), i), 0, 0, 0);
            this.m.findViewById(R.id.mpay__payment_divider).setBackgroundColor(i2);
        }
    }
}
