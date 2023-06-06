package com.sankuai.waimai.business.im.group.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMPoiCouponViewDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public a h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private Button o;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public WMPoiCouponViewDialog(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93a5c9bbd87ba63266553839c5e6bc0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93a5c9bbd87ba63266553839c5e6bc0");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d7e77539c1f90f4feb6755b1a570e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d7e77539c1f90f4feb6755b1a570e0");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_im_coupon_view_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1314f66c85a4416be2e9120909e80edb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1314f66c85a4416be2e9120909e80edb");
        } else {
            this.i = (TextView) findViewById(R.id.coupon_title);
            this.j = (TextView) findViewById(R.id.coupon_name);
            this.k = (TextView) findViewById(R.id.coupon_label);
            this.l = (TextView) findViewById(R.id.coupon_desc);
            this.m = (TextView) findViewById(R.id.price_count);
            this.n = (TextView) findViewById(R.id.count_tip);
            this.o = (Button) findViewById(R.id.coupon_button);
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.group.view.WMPoiCouponViewDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36da34ba03857b295b43d731aede359f", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36da34ba03857b295b43d731aede359f");
                    } else if (WMPoiCouponViewDialog.this.h != null) {
                        WMPoiCouponViewDialog.this.h.a();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4c492f6edfef51cf72e6f7365ef7b66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4c492f6edfef51cf72e6f7365ef7b66a");
            return;
        }
        if (!TextUtils.isEmpty(this.b)) {
            this.i.setText(this.b);
        }
        if (!TextUtils.isEmpty(this.c)) {
            this.j.setText(this.c);
        }
        if (!TextUtils.isEmpty(this.d)) {
            this.k.setText(this.d);
        }
        if (!TextUtils.isEmpty(this.e)) {
            this.l.setText(this.e);
        }
        if (!TextUtils.isEmpty(this.f)) {
            this.m.setText(this.f);
        }
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        this.n.setText(this.g);
    }
}
