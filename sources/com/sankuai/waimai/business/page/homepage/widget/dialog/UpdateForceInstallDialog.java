package com.sankuai.waimai.business.page.homepage.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.foundation.utils.ImageQualityUtil;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UpdateForceInstallDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public String b;
    public a c;
    private Button d;
    private ImageView e;
    private TextView f;
    private TextView g;
    private String h;
    private ImageView i;
    private String j;
    private b k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a();
    }

    public final void a(String str, b bVar) {
        if (str != null) {
            this.j = str;
        }
        this.k = bVar;
    }

    public UpdateForceInstallDialog(Context context) {
        super(context, R.style.upgrade_info_dialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "020a6d4e517bc966686277feaff79378", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "020a6d4e517bc966686277feaff79378");
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1fae7961ebd6d724320a6592234bfb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1fae7961ebd6d724320a6592234bfb6");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_page_dialog_force_install);
        setCanceledOnTouchOutside(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fcf882684531f1da7e3b97d30fcda57b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fcf882684531f1da7e3b97d30fcda57b");
        } else {
            this.d = (Button) findViewById(R.id.wm_upgrade_force_install);
            this.e = (ImageView) findViewById(R.id.wm_upgrade_force_cancel);
            this.f = (TextView) findViewById(R.id.title);
            this.g = (TextView) findViewById(R.id.message);
            this.i = (ImageView) findViewById(R.id.wm_upgrade_icon);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b63271d27c613ceb939ccfe52e0f092", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b63271d27c613ceb939ccfe52e0f092");
        } else {
            if (this.h != null) {
                this.f.setText(this.h);
            }
            if (this.b != null) {
                this.g.setText(this.b);
            }
            if (this.j != null) {
                this.d.setText(this.j);
            }
            int a2 = g.a(getContext(), 320.0f);
            int a3 = g.a(getContext(), 175.0f);
            b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
            a4.c = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "upgrade_image_url", "");
            b.C0608b a5 = a4.a(a2, a3);
            a5.f = ImageQualityUtil.b();
            a5.i = R.drawable.wm_page_upgrade_head;
            a5.j = R.drawable.wm_page_upgrade_head;
            a5.a(this.i);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "22187bf62e98bf38389809105b1a64e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "22187bf62e98bf38389809105b1a64e9");
            return;
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e105c65ef1b62a767139751b734485b4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e105c65ef1b62a767139751b734485b4");
                } else if (UpdateForceInstallDialog.this.k != null) {
                    UpdateForceInstallDialog.this.k.a();
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.widget.dialog.UpdateForceInstallDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "687aef27e2dd81e837710a354b1b52ad", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "687aef27e2dd81e837710a354b1b52ad");
                } else if (UpdateForceInstallDialog.this.c != null) {
                    UpdateForceInstallDialog.this.c.a();
                }
            }
        });
    }
}
