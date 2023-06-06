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
public class UpgradeInfoDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public String b;
    private Button c;
    private Button d;
    private TextView e;
    private TextView f;
    private String g;
    private ImageView h;
    private String i;
    private String j;
    private a k;
    private b l;
    private int m;

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

    public final void a(String str, a aVar) {
        if (str != null) {
            this.j = str;
        }
        this.k = aVar;
    }

    public final void a(String str, b bVar) {
        if (str != null) {
            this.i = str;
        }
        this.l = bVar;
    }

    public UpgradeInfoDialog(Context context, int i) {
        super(context, R.style.upgrade_info_dialog);
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e513c3f446957442185de64a91229895", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e513c3f446957442185de64a91229895");
        } else {
            this.m = i;
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3edc36c5442c1d3f00761cffe3f7b8ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3edc36c5442c1d3f00761cffe3f7b8ef");
            return;
        }
        super.onCreate(bundle);
        setContentView(this.m);
        setCanceledOnTouchOutside(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a12938271238d7cf0f9c2cbf6d37209e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a12938271238d7cf0f9c2cbf6d37209e");
        } else {
            this.c = (Button) findViewById(R.id.wm_upgrade_force_install);
            this.d = (Button) findViewById(R.id.wm_upgrade_force_cancel);
            this.e = (TextView) findViewById(R.id.title);
            this.f = (TextView) findViewById(R.id.message);
            this.h = (ImageView) findViewById(R.id.wm_upgrade_icon);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b894ebba99c505a828af75ea913c9406", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b894ebba99c505a828af75ea913c9406");
        } else {
            if (this.g != null) {
                this.e.setText(this.g);
            }
            if (this.b != null) {
                this.f.setText(this.b);
            }
            if (this.i != null) {
                this.c.setText(this.i);
            }
            if (this.j != null) {
                this.d.setText(this.j);
            }
            int a2 = g.a(getContext(), 320.0f);
            int a3 = g.a(getContext(), 175.0f);
            if (this.h != null) {
                b.C0608b a4 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                a4.c = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "upgrade_image_url", "");
                b.C0608b a5 = a4.a(a2, a3);
                a5.f = ImageQualityUtil.b();
                a5.i = R.drawable.wm_page_upgrade_head;
                a5.j = R.drawable.wm_page_upgrade_head;
                a5.a(this.h);
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0c70fc88ef74d86a4f1bf88b8b498bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0c70fc88ef74d86a4f1bf88b8b498bf5");
            return;
        }
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "62f7f5c96a5a1892dd2f541648408d34", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "62f7f5c96a5a1892dd2f541648408d34");
                } else if (UpgradeInfoDialog.this.l != null) {
                    UpgradeInfoDialog.this.l.a();
                }
            }
        });
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.page.homepage.widget.dialog.UpgradeInfoDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "443aa49497bef8a16d3e0cdcfeecb3b8", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "443aa49497bef8a16d3e0cdcfeecb3b8");
                } else if (UpgradeInfoDialog.this.k != null) {
                    UpgradeInfoDialog.this.k.a();
                }
            }
        });
    }
}
