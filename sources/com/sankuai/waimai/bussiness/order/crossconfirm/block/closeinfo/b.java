package com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.capacity.imageloader.image.FixedSizeTransform;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.view.a {
    public static ChangeQuickRedirect d;
    TextView e;
    TextView f;
    ViewGroup g;
    com.sankuai.waimai.platform.utils.time.a h;

    @Override // com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_cross_order_confirm_close;
    }

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06bc46d10f2b9f56e72641928f37915a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06bc46d10f2b9f56e72641928f37915a");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66c11b2084a57ee3d12fc770645cabd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66c11b2084a57ee3d12fc770645cabd");
            return;
        }
        super.b();
        this.g = (ViewGroup) this.b.findViewById(R.id.cross_order_confirm_close_layout);
        this.f = (TextView) this.b.findViewById(R.id.cross_order_confirm_close_time);
        this.e = (TextView) this.b.findViewById(R.id.cross_order_confirm_close_content);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams.width = -2;
        this.b.setLayoutParams(layoutParams);
        this.g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34321e233e9d8d5dc8c28c591ad9c232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34321e233e9d8d5dc8c28c591ad9c232");
            return;
        }
        this.e.setVisibility(0);
        if (TextUtils.isEmpty(cVar.a.a)) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            final int a = g.a(this.c, 16.0f);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = this.c;
            c.c = cVar.a.a;
            c.a(a, a).a(new FixedSizeTransform(a, a)).a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo.b.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "149da9b90dd817f6611124c39e605fbf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "149da9b90dd817f6611124c39e605fbf");
                        return;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(b.this.c.getResources(), bitmap);
                    bitmapDrawable.setBounds(0, 0, a, a);
                    b.this.e.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a98b726392dadbcaf2cd87a8e8955b9e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a98b726392dadbcaf2cd87a8e8955b9e");
                    } else {
                        b.this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            });
        }
        this.e.setText(cVar.a.b);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b7c365cd6425bff6fc701a9ddcbf56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b7c365cd6425bff6fc701a9ddcbf56");
            return;
        }
        this.e.setVisibility(0);
        if (TextUtils.isEmpty(cVar.a.a)) {
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            final int a = g.a(this.c, 16.0f);
            b.C0608b c = com.sankuai.meituan.mtimageloader.loader.a.c();
            c.b = this.c;
            c.c = cVar.a.a;
            c.a(a, a).a(new FixedSizeTransform(a, a)).a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.closeinfo.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a(Bitmap bitmap) {
                    Object[] objArr2 = {bitmap};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "396b05e9ab2fb0e91296552fae2e497f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "396b05e9ab2fb0e91296552fae2e497f");
                        return;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(b.this.c.getResources(), bitmap);
                    bitmapDrawable.setBounds(0, 0, a, a);
                    b.this.e.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
                }

                @Override // com.sankuai.meituan.mtimageloader.config.b.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f28d621557676f290655c74fa0ac0769", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f28d621557676f290655c74fa0ac0769");
                    } else {
                        b.this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            });
        }
        this.e.setText(cVar.a.b);
        this.f.setVisibility(8);
        this.g.setVisibility(0);
    }
}
