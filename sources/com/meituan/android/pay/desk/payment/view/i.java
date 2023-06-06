package com.meituan.android.pay.desk.payment.view;

import android.content.Context;
import android.support.constraint.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i extends RelativeLayout {
    public static ChangeQuickRedirect a;
    public ImageView b;
    public TextView c;
    public ImageView d;
    public a e;
    public View f;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public String a;
        public String b;
        public boolean c;
        public String d;
        public boolean e;
    }

    public i(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25af2c7181733f46433bd10f0f70f702", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25af2c7181733f46433bd10f0f70f702");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c86eb7be2e019bddb9209c0bb8d35ff4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c86eb7be2e019bddb9209c0bb8d35ff4");
            return;
        }
        inflate(getContext(), R.layout.mpay__brand_view, this);
        this.b = (ImageView) findViewById(R.id.mpay_brand_icon);
        this.c = (TextView) findViewById(R.id.mpay_brand_name);
        this.d = (ImageView) findViewById(R.id.mpay_brand_marketing);
        this.f = findViewById(R.id.mpay__payment_divider);
    }

    public final void setMtBrandViewData(a aVar) {
        this.e = aVar;
    }
}
