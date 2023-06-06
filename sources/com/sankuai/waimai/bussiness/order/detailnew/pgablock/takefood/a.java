package com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.R;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.dialog.RooAlertDialog;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.utils.l;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public RooAlertDialog b;
    public Context c;
    Dialog d;

    public static /* synthetic */ void a(a aVar, Dialog dialog) {
        Object[] objArr = {dialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "d7dc6b0ffc106c47607a793bff245207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "d7dc6b0ffc106c47607a793bff245207");
        } else if (dialog == null || !dialog.isShowing()) {
        } else {
            com.sankuai.waimai.platform.widget.dialog.a.b(dialog);
        }
    }

    public static /* synthetic */ void a(a aVar, Bitmap bitmap, final RooAlertDialog rooAlertDialog) {
        Object[] objArr = {bitmap, rooAlertDialog};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1525f5de0eace7a7105cf650b36ec230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1525f5de0eace7a7105cf650b36ec230");
        } else if (f.a(aVar.c) || rooAlertDialog == null || rooAlertDialog.getWindow() == null) {
        } else {
            rooAlertDialog.show();
            rooAlertDialog.getWindow().getDecorView().setBackgroundColor(0);
            rooAlertDialog.getWindow().getDecorView().setPadding(0, 0, 0, 0);
            View findViewById = rooAlertDialog.findViewById(R.id.customPanel);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9953425d18ccc380a5fb170e7487248", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9953425d18ccc380a5fb170e7487248");
                        } else {
                            a.a(a.this, rooAlertDialog);
                        }
                    }
                });
                ((View) findViewById.getParent()).setPadding(0, 0, 0, 0);
                ImageView imageView = (ImageView) rooAlertDialog.findViewById(R.id.iv_qr_code);
                if (imageView != null) {
                    int a2 = g.a(b.a) - g.a(b.a, 114.0f);
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(a2, a2));
                    imageView.setClickable(true);
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    } else {
                        imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(R.drawable.wm_common_poi_good_icon));
                    }
                    JudasManualManager.b("b_waimai_lysqkth0_mc").a("c_hgowsqb").a(aVar.c).a();
                }
            }
        }
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ca18a94cae2d6323e0cd5c362c4d174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ca18a94cae2d6323e0cd5c362c4d174");
        } else {
            this.c = context;
        }
    }

    public void a(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed667189f85459f21b4d050bf96abdfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed667189f85459f21b4d050bf96abdfa");
            return;
        }
        if (this.d == null) {
            this.d = com.sankuai.waimai.platform.widget.dialog.a.a(this.c);
        }
        if (!this.d.isShowing()) {
            this.d.show();
        }
        b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
        a2.b = this.c;
        a2.c = str;
        a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a(Bitmap bitmap) {
                Object[] objArr2 = {bitmap};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15c0c7afabbdd9d9591269f800b1393b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15c0c7afabbdd9d9591269f800b1393b");
                    return;
                }
                a.a(a.this, a.this.d);
                a.a(a.this, bitmap, a.this.b);
            }

            @Override // com.sankuai.meituan.mtimageloader.config.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b8fdcff6d6e3ea20f5f407a1feea09bd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b8fdcff6d6e3ea20f5f407a1feea09bd");
                    return;
                }
                a.AbstractC1040a b = new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_cabinet_qr_code").b("0");
                i.d(b.c("取餐柜二维码下载失败，" + str).b(true).b());
                if (i > 0) {
                    l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood.a.1.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d71343065f70201866d479db7dfe8a4d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d71343065f70201866d479db7dfe8a4d");
                            } else {
                                a.this.a(str, i - 1);
                            }
                        }
                    }, 500, "load_qr_code_img");
                    return;
                }
                a.a(a.this, a.this.d);
                a.a(a.this, null, a.this.b);
            }
        });
    }
}
