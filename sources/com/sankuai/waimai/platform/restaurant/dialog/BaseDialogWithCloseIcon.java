package com.sankuai.waimai.platform.restaurant.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class BaseDialogWithCloseIcon extends AppCompatDialog implements DialogInterface {
    public static ChangeQuickRedirect b;
    private TextView a;
    public CharSequence c;
    private TextView d;
    private TextView e;
    private CharSequence f;
    private CharSequence g;
    private a h;
    private a i;
    private FrameLayout j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(View view);
    }

    public BaseDialogWithCloseIcon(Context context) {
        super(context, R.style.BaseDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9ad9192c39c4f8f9a0488fd03035b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9ad9192c39c4f8f9a0488fd03035b3");
        }
    }

    @Override // android.support.v7.app.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a7ab01d8530899b616fbbc39ed6db4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a7ab01d8530899b616fbbc39ed6db4a");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.wm_restaurant_orderagain_soldout_dialog_new);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "110ba504858f1dd94bed0b42af36976f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "110ba504858f1dd94bed0b42af36976f");
        } else {
            Window window = getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                attributes.height = -2;
                attributes.width = -1;
                window.setAttributes(attributes);
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7040ed2e80cd7cef6ad8ae0b506cfb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7040ed2e80cd7cef6ad8ae0b506cfb0");
        } else {
            this.j = (FrameLayout) findViewById(R.id.fl_content);
            this.a = (TextView) findViewById(R.id.tv_sold_out);
            this.e = (TextView) findViewById(R.id.tv_negative_btn);
            this.d = (TextView) findViewById(R.id.tv_positive_btn);
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bd01034f5bdb23630230d16f763ad452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bd01034f5bdb23630230d16f763ad452");
            return;
        }
        findViewById(R.id.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr5 = {view};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "0721217908f6bc37cf01c8cfa9cf5ee1", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "0721217908f6bc37cf01c8cfa9cf5ee1");
                } else {
                    BaseDialogWithCloseIcon.this.dismiss();
                }
            }
        });
        this.a.setText(this.c);
        if (!TextUtils.isEmpty(this.f)) {
            this.d.setVisibility(0);
            this.d.setText(this.f);
            if (this.h != null) {
                this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "ff0a5a4f3f86dce1cf217a24de7f82ab", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "ff0a5a4f3f86dce1cf217a24de7f82ab");
                            return;
                        }
                        BaseDialogWithCloseIcon.this.h.a(view);
                        BaseDialogWithCloseIcon.this.dismiss();
                    }
                });
            }
        } else {
            this.d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.g)) {
            this.e.setVisibility(0);
            this.e.setText(this.g);
            if (this.i != null) {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.platform.restaurant.dialog.BaseDialogWithCloseIcon.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr5 = {view};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "76e0c777c892f200d8eaefb0137f47d8", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "76e0c777c892f200d8eaefb0137f47d8");
                            return;
                        }
                        BaseDialogWithCloseIcon.this.dismiss();
                        BaseDialogWithCloseIcon.this.i.a(view);
                    }
                });
                return;
            }
            return;
        }
        this.e.setVisibility(8);
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        Object[] objArr = {view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a552bae659db03097e2238a90ab72462", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a552bae659db03097e2238a90ab72462");
        } else if (this.j == null || view == null) {
        } else {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.j.removeAllViews();
            this.j.addView(view, layoutParams);
        }
    }

    public final BaseDialogWithCloseIcon a(CharSequence charSequence, a aVar) {
        this.f = charSequence;
        this.h = aVar;
        return this;
    }

    public final BaseDialogWithCloseIcon b(CharSequence charSequence, a aVar) {
        this.g = charSequence;
        this.i = aVar;
        return this;
    }
}
