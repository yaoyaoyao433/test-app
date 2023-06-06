package com.meituan.mmp.lib.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.main.Logger;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AboutDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    public f b;
    private Context c;
    private com.meituan.mmp.lib.config.a d;
    private String e;
    private String f;
    private TextView g;
    private TextView h;
    private View i;
    private View j;
    private int k;

    public AboutDialog(Context context, com.meituan.mmp.lib.config.a aVar) {
        super(context, R.style.MMPDialogLikePage);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "847f1520a3e9c869f9f140a45b6994fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "847f1520a3e9c869f9f140a45b6994fb");
            return;
        }
        this.b = d.a();
        this.c = context;
        this.d = aVar;
        setContentView(R.layout.mmp_dialog_about);
        findViewById(R.id.mmp_about_back).setOnClickListener(this);
        findViewById(R.id.mmp_about_more_data).setOnClickListener(this);
        findViewById(R.id.mmp_about_icon).setOnClickListener(this);
        this.i = findViewById(R.id.mmp_about_setting);
        if (!aVar.a() && this.b != null) {
            this.i.setOnClickListener(this);
        } else {
            this.i.setVisibility(8);
        }
        this.j = findViewById(R.id.mmp_about_phone);
        ((TextView) findViewById(R.id.mmp_about_name)).setText(aVar.d());
        this.g = (TextView) findViewById(R.id.mmp_about_desc);
        this.h = (TextView) findViewById(R.id.mmp_about_phone_num);
        ImageView imageView = (ImageView) findViewById(R.id.mmp_about_icon);
        RequestCreator c = s.c(getContext(), aVar.f(), aVar);
        if (c != null) {
            c.a(imageView);
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Rect rect = new Rect();
            ((Activity) this.c).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            attributes.width = rect.right - rect.left;
            attributes.height = rect.bottom - rect.top;
            window.setAttributes(attributes);
        }
        MMPAppProp mMPAppProp = this.d.l;
        Object[] objArr2 = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5950254684116b73b85f8b0d13315ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5950254684116b73b85f8b0d13315ed");
        } else if (mMPAppProp != null) {
            this.e = mMPAppProp.extraConfig.hotline;
            this.f = mMPAppProp.extraConfig.moreInfoUrl;
            if (!TextUtils.isEmpty(this.e)) {
                this.j.setOnClickListener(this);
                this.h.setText(this.e);
            } else {
                this.j.setVisibility(8);
            }
            this.g.setText(mMPAppProp.extraConfig.introduction);
        } else {
            this.j.setVisibility(8);
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a850867e564878bb9a499028f3a830a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a850867e564878bb9a499028f3a830a");
            return;
        }
        super.onCreate(bundle);
        MMPEnvHelper.getLogger().mgePageView(this.d.c(), "c_group_zs2vnmiv", new Logger.a().a("title", this.d.d()).b);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3204d9bdbde343ac61190731b9c2af", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3204d9bdbde343ac61190731b9c2af");
            return;
        }
        int id = view.getId();
        if (id == R.id.mmp_about_back) {
            dismiss();
        } else if (id == R.id.mmp_about_more_data) {
            new MoreInfoDialog(this.c, this.f).show();
            MMPEnvHelper.getLogger().mgeClick(this.d.c(), "c_group_zs2vnmiv", "b_group_vmjxcpt9_mc", new Logger.a().a("title", this.d.d()).a("button_name", "更多资料").b);
        } else if (id == R.id.mmp_about_setting && this.b != null) {
            this.b.a(this.c, this.d).show();
            MMPEnvHelper.getLogger().mgeClick(this.d.c(), "c_group_zs2vnmiv", "b_group_vmjxcpt9_mc", new Logger.a().a("title", this.d.d()).a("button_name", "授权设置").b);
        } else if (id == R.id.mmp_about_phone) {
            getContext().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.e.trim())));
            MMPEnvHelper.getLogger().mgeClick(this.d.c(), "c_group_zs2vnmiv", "b_group_vmjxcpt9_mc", new Logger.a().a("title", this.d.d()).a("button_name", "客服电话").b);
        } else if (id == R.id.mmp_about_icon) {
            int i = this.k + 1;
            this.k = i;
            if (i == 5) {
                this.k = 0;
                bb.a("小程序版本号:" + this.d.g() + "\n 基础库版本号：" + this.d.l.mmpSdk.d, new Object[0]);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc54510f64afccaaebc7d0939f22e100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc54510f64afccaaebc7d0939f22e100");
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34276c9b6bdd8222d313d41a4e5b1236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34276c9b6bdd8222d313d41a4e5b1236");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "21c04bcddc1002c04d306b3607ca8f2b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "21c04bcddc1002c04d306b3607ca8f2b")).booleanValue();
            } else if (this.c != null && (this.c instanceof Activity) && !((Activity) this.c).isFinishing()) {
                z = true;
            }
            if (z) {
                super.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bdd1bf7f5c14cc0f5d974174662ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bdd1bf7f5c14cc0f5d974174662ccd");
            return;
        }
        try {
            super.dismiss();
            MMPEnvHelper.getLogger().mgeClick(this.d.c(), "c_group_zs2vnmiv", "b_group_vmjxcpt9_mc", new Logger.a().a("title", this.d.d()).a("button_name", "返回").b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
