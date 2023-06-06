package com.meituan.android.legwork.ui.component;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextPaint;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.meituan.android.legwork.common.util.PmUtil;
import com.meituan.android.legwork.utils.h;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public TextView b;
    public TextView c;
    public b d;
    public a e;
    private View f;
    private Context g;
    private TextView h;
    private TextView i;
    private View j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    public CommonDialog(Context context) {
        this(context, R.style.EstateDialog);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df876beb725a3944f80679c0c2741324", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df876beb725a3944f80679c0c2741324");
        }
    }

    private CommonDialog(Context context, int i) {
        super(context, R.style.EstateDialog);
        Object[] objArr = {context, Integer.valueOf((int) R.style.EstateDialog)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a025ecd0286cad4e6a2e04f0109ca77c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a025ecd0286cad4e6a2e04f0109ca77c");
            return;
        }
        this.g = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "941a3f566b14ff796cfc0ec1d6a0332c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "941a3f566b14ff796cfc0ec1d6a0332c");
            return;
        }
        this.f = LayoutInflater.from(this.g).inflate(R.layout.legwork_common_dialog_layout, (ViewGroup) null);
        this.b = (TextView) this.f.findViewById(R.id.legwork_dialog_title);
        this.c = (TextView) this.f.findViewById(R.id.legwork_dialog_body);
        this.h = (TextView) this.f.findViewById(R.id.legwork_dialog_ok);
        this.i = (TextView) this.f.findViewById(R.id.legwork_dialog_cancel);
        this.j = this.f.findViewById(R.id.legwork_btn_line);
        PmUtil.a(new PmUtil.b() { // from class: com.meituan.android.legwork.ui.component.CommonDialog.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void a() {
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void b() {
            }

            @Override // com.meituan.android.legwork.common.util.PmUtil.b
            public final void c() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "73c4f47b89e88b02623c5b0dee44a06d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "73c4f47b89e88b02623c5b0dee44a06d");
                } else {
                    CommonDialog.this.i.setTypeface(Typeface.defaultFromStyle(1));
                }
            }
        });
        this.e = new a() { // from class: com.meituan.android.legwork.ui.component.CommonDialog.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.legwork.ui.component.CommonDialog.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4aab9c6874fe1b068cf2aa02c319157e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4aab9c6874fe1b068cf2aa02c319157e");
                } else {
                    CommonDialog.this.dismiss();
                }
            }
        };
        this.h.setOnClickListener(com.meituan.android.legwork.ui.component.a.a(this));
        this.i.setOnClickListener(com.meituan.android.legwork.ui.component.b.a(this));
    }

    public static /* synthetic */ void b(CommonDialog commonDialog, View view) {
        Object[] objArr = {commonDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e973bc03ca2f23b640ab9390d2370c04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e973bc03ca2f23b640ab9390d2370c04");
            return;
        }
        commonDialog.dismiss();
        if (commonDialog.d != null) {
            commonDialog.d.a();
        }
    }

    public static /* synthetic */ void a(CommonDialog commonDialog, View view) {
        Object[] objArr = {commonDialog, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "584ecf6d184c17fe07c92f00c215e700", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "584ecf6d184c17fe07c92f00c215e700");
            return;
        }
        commonDialog.dismiss();
        if (commonDialog.e != null) {
            commonDialog.e.a();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c0819f5bc07df8769bb4bbe92347664", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c0819f5bc07df8769bb4bbe92347664");
            return;
        }
        super.onCreate(bundle);
        setContentView(this.f, new WindowManager.LayoutParams(-2, -2));
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "560e4b1a093aeaf8cab81cffa3691c76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "560e4b1a093aeaf8cab81cffa3691c76");
            return;
        }
        try {
            if (!(this.g instanceof Activity) || ((Activity) this.g).isFinishing()) {
                return;
            }
            super.show();
            Window window = getWindow();
            window.setGravity(17);
            Display defaultDisplay = window.getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ((int) (defaultDisplay.getWidth() * 1.0d)) - h.a(95);
            window.setAttributes(attributes);
        } catch (Exception e) {
            x.e("CommonDialog.show()", "CommonDialog show error,exception msg:", e);
            x.a(e);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2ca8f04e91ba47e248ff74274755115", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2ca8f04e91ba47e248ff74274755115");
        } else if (!(this.g instanceof Activity) || ((Activity) this.g).isFinishing()) {
        } else {
            super.dismiss();
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ae8a2d2f50be3e03a96d1c421b26ad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ae8a2d2f50be3e03a96d1c421b26ad0");
        } else {
            this.b.setText(str);
        }
    }

    public final void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "057051faffe7c65c37f5cda12fc973a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "057051faffe7c65c37f5cda12fc973a3");
            return;
        }
        TextPaint paint = this.b.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc3865e23aac898cdc3d1e012d78d580", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc3865e23aac898cdc3d1e012d78d580");
        } else {
            this.b.setText(this.g.getString(i));
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1961419a8beea3638ef9ac65ad97dd79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1961419a8beea3638ef9ac65ad97dd79");
        } else {
            this.c.setText(str);
        }
    }

    public final void b(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5385bae510b3097bdc5eda7a3c2a13a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5385bae510b3097bdc5eda7a3c2a13a");
        } else if (this.c != null) {
            this.c.setGravity(3);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8318da10f1df33c5bd2501be98a547d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8318da10f1df33c5bd2501be98a547d");
        } else {
            this.h.setText(str);
        }
    }

    public final void c(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39a80fba05b5c0100bd27bbfefbf1e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39a80fba05b5c0100bd27bbfefbf1e23");
            return;
        }
        TextPaint paint = this.i.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fdcdbd653b25bab4865bac90fbb2802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fdcdbd653b25bab4865bac90fbb2802");
        } else if (this.i != null) {
            this.i.setTextColor(i);
        }
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8b4b4f49ab3bc31aecd634b1aa3a2a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8b4b4f49ab3bc31aecd634b1aa3a2a2");
            return;
        }
        d(false);
        this.i.setText(str);
    }

    private void d(boolean z) {
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d27e2aa4948f0fe5524f762d9237d39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d27e2aa4948f0fe5524f762d9237d39");
            return;
        }
        this.j.setVisibility(0);
        this.i.setVisibility(0);
    }
}
