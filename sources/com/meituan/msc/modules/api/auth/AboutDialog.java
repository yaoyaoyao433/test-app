package com.meituan.msc.modules.api.auth;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.constraint.R;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.update.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AboutDialog extends Dialog implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final f b;
    private Context c;
    private String d;
    private TextView e;
    private TextView f;
    private View g;
    private View h;
    private int i;

    public AboutDialog(Context context, f fVar) {
        super(context, R.style.MSCDialogLikePage);
        Object[] objArr = {context, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9426b02626f7ac1bbc1628470ec92d14", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9426b02626f7ac1bbc1628470ec92d14");
            return;
        }
        this.c = context;
        this.b = fVar;
        setContentView(R.layout.msc_dialog_about);
        findViewById(R.id.msc_about_back).setOnClickListener(this);
        findViewById(R.id.msc_about_more_data).setOnClickListener(this);
        findViewById(R.id.msc_about_icon).setOnClickListener(this);
        this.g = findViewById(R.id.msc_about_setting);
        if (!fVar.i()) {
            this.g.setOnClickListener(this);
        } else {
            this.g.setVisibility(8);
        }
        this.h = findViewById(R.id.msc_about_phone);
        ((TextView) findViewById(R.id.msc_about_name)).setText(fVar.k());
        this.e = (TextView) findViewById(R.id.msc_about_desc);
        this.f = (TextView) findViewById(R.id.msc_about_phone_num);
        ImageView imageView = (ImageView) findViewById(R.id.msc_about_icon);
        RequestCreator a2 = r.a(getContext(), fVar.l(), fVar.U_().d());
        if (a2 != null) {
            a2.a(imageView);
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
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75172c7e8364dd5073fc831d1575df34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75172c7e8364dd5073fc831d1575df34");
        } else {
            super.onCreate(bundle);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d4ea4ca3358917ab99ed4c96cf899a1", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d4ea4ca3358917ab99ed4c96cf899a1");
            return;
        }
        int id = view.getId();
        if (id == R.id.msc_about_back) {
            dismiss();
        } else if (id == R.id.msc_about_more_data) {
            new MoreInfoDialog(this.c, this.d).show();
        } else if (id == R.id.msc_about_setting) {
            new SettingDialog(this.c, this.b).show();
        } else if (id == R.id.msc_about_phone || id != R.id.msc_about_icon) {
        } else {
            int i = this.i + 1;
            this.i = i;
            if (i == 5) {
                this.i = 0;
                aw.a("小程序版本号:" + this.b.w() + "\n 基础库版本号：" + this.b.n(), new Object[0]);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70a728a03523f063a1681bfb33461aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70a728a03523f063a1681bfb33461aed");
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b453faa19d7dece3b29e4335744ed3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b453faa19d7dece3b29e4335744ed3e");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fb9bcda483843c67d0c3e8677527463e", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fb9bcda483843c67d0c3e8677527463e")).booleanValue();
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
}
