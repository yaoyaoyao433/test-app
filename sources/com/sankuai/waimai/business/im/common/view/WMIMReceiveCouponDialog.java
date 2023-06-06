package com.sankuai.waimai.business.im.common.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.im.model.l;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMIMReceiveCouponDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public String b;
    public l c;
    public a d;
    private final Context e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private TextView l;
    private Button m;
    private ImageView n;
    private ImageView o;
    private TextView p;
    private TextView q;
    private ViewGroup r;
    private ViewGroup s;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    public WMIMReceiveCouponDialog(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2585d46fe3d2ef1f4e9e97fbe3e9ffa0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2585d46fe3d2ef1f4e9e97fbe3e9ffa0");
        } else {
            this.e = context;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "759711d47f5d65ef9779d50ece5aa33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "759711d47f5d65ef9779d50ece5aa33f");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_im_receive_coupon_dialog_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3da5742afaa7dc26cf3672a38ccb7102", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3da5742afaa7dc26cf3672a38ccb7102");
        } else {
            this.f = (TextView) findViewById(R.id.coupon_title);
            this.g = (TextView) findViewById(R.id.coupon_name);
            this.h = (TextView) findViewById(R.id.im_coupon_tag1);
            this.i = (TextView) findViewById(R.id.im_coupon_tag2);
            this.j = (TextView) findViewById(R.id.coupon_desc);
            this.r = (ViewGroup) findViewById(R.id.price_count_category1);
            this.s = (ViewGroup) findViewById(R.id.price_count_category2);
            this.k = (TextView) findViewById(R.id.price_count2);
            this.p = (TextView) findViewById(R.id.price_count3);
            this.q = (TextView) findViewById(R.id.price_count4);
            this.l = (TextView) findViewById(R.id.count_tip);
            this.n = (ImageView) findViewById(R.id.iv_poi_image);
            this.m = (Button) findViewById(R.id.coupon_button);
            this.m.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.view.WMIMReceiveCouponDialog.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c0177e6799d0c56a486834e2ee6e6cb9", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c0177e6799d0c56a486834e2ee6e6cb9");
                    } else if (WMIMReceiveCouponDialog.this.d != null) {
                        WMIMReceiveCouponDialog.this.d.a();
                    }
                }
            });
            this.o = (ImageView) findViewById(R.id.close_dialog);
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.view.WMIMReceiveCouponDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9c5209353a5139d961b81363c58aa784", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9c5209353a5139d961b81363c58aa784");
                    } else {
                        WMIMReceiveCouponDialog.this.dismiss();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "30911fc2d6f2974af5b2c997fbe2e104", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "30911fc2d6f2974af5b2c997fbe2e104");
        } else if (this.c != null) {
            try {
                if (!TextUtils.isEmpty(this.b)) {
                    this.f.setText(this.b);
                }
                if (!TextUtils.isEmpty(this.c.a)) {
                    this.g.setText(this.c.a);
                }
                if (this.c.b > 0) {
                    this.j.setText(this.e.getString(R.string.wm_im_poi_coupon_valid_time, Integer.valueOf((int) (this.c.b / TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC))));
                }
                if (this.c.n != null && !this.c.n.isEmpty()) {
                    this.h.setText(this.c.n.get(0));
                    if (this.c.n.size() > 1) {
                        this.i.setText(this.c.n.get(1));
                    }
                }
                if (this.c.c == 2) {
                    this.r.setVisibility(8);
                    this.s.setVisibility(0);
                    double d = this.c.d / 10.0d;
                    Object[] objArr4 = {Double.valueOf(d)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    String plainString = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c20952b8e22a307dd736436033892fa8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c20952b8e22a307dd736436033892fa8") : BigDecimal.valueOf(d).setScale(1, 4).stripTrailingZeros().toPlainString();
                    if (!TextUtils.isEmpty(plainString)) {
                        int indexOf = plainString.indexOf(CommonConstant.Symbol.DOT);
                        if (indexOf > 0) {
                            this.p.setText(plainString.substring(0, indexOf));
                            TextView textView = this.q;
                            textView.setText(plainString.substring(indexOf) + "折");
                        } else {
                            this.p.setText(plainString);
                            this.q.setText("折");
                        }
                    }
                } else if (this.c.c == 1) {
                    this.r.setVisibility(0);
                    this.s.setVisibility(8);
                    TextView textView2 = this.k;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c.d);
                    textView2.setText(sb.toString());
                }
                String str = "";
                if (this.c.c == 2) {
                    str = this.c.f;
                } else if (this.c.c == 1) {
                    str = this.c.h;
                    this.l.setText(this.e.getString(R.string.wm_im_poi_coupon_limit, Integer.valueOf(this.c.e)));
                }
                b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a2.b = this.e;
                a2.c = str;
                a2.i = R.drawable.wm_im_poi_default_avatar;
                a2.j = R.drawable.wm_im_poi_default_avatar;
                a2.a(this.n);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b0514ec9f68c05baf3be86076c21ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b0514ec9f68c05baf3be86076c21ab");
        } else if (this.e == null || !(this.e instanceof Activity) || ((Activity) this.e).isFinishing()) {
        } else {
            super.show();
        }
    }
}
