package com.sankuai.waimai.store.view.standard;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatEditText;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.ui.common.SCBaseDialog;
import com.sankuai.waimai.store.util.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class FlashDialog extends SCBaseDialog {
    public static ChangeQuickRedirect a;
    EditText b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Space f;
    private DialogInterface.OnClickListener g;
    private DialogInterface.OnClickListener h;

    public FlashDialog(@NonNull Context context) {
        super(context, LayoutInflater.from(context).inflate(R.layout.wm_sc_ui_dialog, (ViewGroup) null, false), R.style.SgFlashDialog);
        WindowManager.LayoutParams attributes;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58c26ba23f7dc6a9abf8857584f3a43b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58c26ba23f7dc6a9abf8857584f3a43b");
            return;
        }
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a082518fc48109a3f0d2ef295320e30e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a082518fc48109a3f0d2ef295320e30e");
            return;
        }
        Window window = getWindow();
        if (window == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        attributes.width = h.a(context) - (context.getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_33) * 2);
        window.setAttributes(attributes);
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf0a6439598f4c994923d525e9dc3ca3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf0a6439598f4c994923d525e9dc3ca3");
            return;
        }
        this.c = (TextView) c(R.id.flash_dialog_title);
        this.d = (TextView) c(R.id.flash_dialog_button_primary);
        this.e = (TextView) c(R.id.flash_dialog_button_secondary);
        this.f = (Space) c(R.id.flash_dialog_button_space);
        final int b2 = (int) (h.b(getContext()) * 0.45d);
        this.b = new AppCompatEditText(getContext()) { // from class: com.sankuai.waimai.store.view.standard.FlashDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.TextView, android.view.View
            public void onMeasure(int i, int i2) {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f035ed7010c746731eaef8cf259f2dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f035ed7010c746731eaef8cf259f2dc");
                } else {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(b2, Integer.MIN_VALUE));
                }
            }
        };
        this.b.setFocusable(false);
        this.b.setCursorVisible(false);
        this.b.setBackground(null);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_12);
        this.b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        this.b.setIncludeFontPadding(false);
        this.b.setGravity(1);
        this.b.setTextSize(0, getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_textsize_14));
        this.b.setTextColor(getContext().getResources().getColor(R.color.wm_sg_color_575859));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_22);
        this.b.setLayoutParams(layoutParams);
        ((LinearLayout) c(R.id.flash_dialog_container)).addView(this.b, 1);
        this.d.setBackground(new e.a().a(getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6)).a(GradientDrawable.Orientation.TL_BR, new int[]{getContext().getResources().getColor(R.color.wm_sg_color_FFE14D), getContext().getResources().getColor(R.color.wm_sg_color_FFC34D)}).a());
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.view.standard.FlashDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8a572c876ceb84829f5441332e2410ee", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8a572c876ceb84829f5441332e2410ee");
                } else if (FlashDialog.this.g != null) {
                    FlashDialog.this.g.onClick(FlashDialog.this, 0);
                } else {
                    FlashDialog.this.dismiss();
                }
            }
        });
        this.e.setBackground(new e.a().a(getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_6)).b(getContext().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_half)).a(getContext().getResources().getColor(R.color.wm_sg_color_F5F5F6)).c(getContext().getResources().getColor(R.color.wm_sg_color_F1F1F2)).a());
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.view.standard.FlashDialog.3
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "09131dd95b8162e12bead71aa614bf7f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "09131dd95b8162e12bead71aa614bf7f");
                } else if (FlashDialog.this.h != null) {
                    FlashDialog.this.h.onClick(FlashDialog.this, 1);
                } else {
                    FlashDialog.this.dismiss();
                }
            }
        });
        setCanceledOnTouchOutside(true);
        a((String) null);
        a(null, null);
        b(null, null);
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d6b63b82d38cb491bce6ab0bb0ab25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d6b63b82d38cb491bce6ab0bb0ab25");
        } else if (TextUtils.isEmpty(str)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText(str);
        }
    }

    public final void a(String str, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8f7b96f12fee1b8558b26581ace2ac8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8f7b96f12fee1b8558b26581ace2ac8");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.d.setText(getContext().getString(R.string.wm_sc_common_confirm));
        } else {
            this.d.setText(str);
        }
        this.g = onClickListener;
    }

    public final void b(String str, DialogInterface.OnClickListener onClickListener) {
        Object[] objArr = {str, onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f8205fa881655ba7d196515618f9b0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f8205fa881655ba7d196515618f9b0f");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        } else {
            this.e.setVisibility(0);
            this.f.setVisibility(0);
            this.e.setText(str);
        }
        this.h = onClickListener;
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(DialogInterface.OnShowListener onShowListener) {
        Object[] objArr = {onShowListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c83aa119d5f3eee2a3c6ab0f6322ef0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c83aa119d5f3eee2a3c6ab0f6322ef0d");
        } else if (onShowListener != null) {
            super.a(onShowListener);
        }
    }

    @Override // com.sankuai.waimai.store.ui.common.SCBaseDialog
    public final void a(DialogInterface.OnDismissListener onDismissListener) {
        Object[] objArr = {onDismissListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf7596e8fb828466eb40d98135392bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf7596e8fb828466eb40d98135392bf");
        } else if (onDismissListener != null) {
            super.a(onDismissListener);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        Context b;
        boolean c;
        public String d;
        String e;
        String f;
        String g;
        DialogInterface.OnClickListener h;
        DialogInterface.OnClickListener i;
        DialogInterface.OnShowListener j;
        DialogInterface.OnDismissListener k;
        public int l;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "238e02cc1e5ca0ec23cdb1a6e00da743", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "238e02cc1e5ca0ec23cdb1a6e00da743");
                return;
            }
            this.c = true;
            this.l = -1;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final b b;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c29afbb63ffdd9eda9104ecceb03046e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c29afbb63ffdd9eda9104ecceb03046e");
                return;
            }
            this.b = new b();
            this.b.b = context;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "153ad538d412b6fbcb01fb6833de2530", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "153ad538d412b6fbcb01fb6833de2530");
            }
            this.b.e = str;
            return this;
        }

        public final a a(String str, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {str, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed6bc95f370f352ce5215e78d9548ab", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed6bc95f370f352ce5215e78d9548ab");
            }
            this.b.f = str;
            this.b.h = onClickListener;
            return this;
        }

        public final a b(String str, DialogInterface.OnClickListener onClickListener) {
            Object[] objArr = {str, onClickListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd7c18cf1485121c1b8602f4c1704ef2", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd7c18cf1485121c1b8602f4c1704ef2");
            }
            this.b.g = str;
            this.b.i = onClickListener;
            return this;
        }

        public final a a(DialogInterface.OnShowListener onShowListener) {
            Object[] objArr = {onShowListener};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76cc98d073afd96aead758b3037412de", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76cc98d073afd96aead758b3037412de");
            }
            this.b.j = onShowListener;
            return this;
        }

        private FlashDialog b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b415df88b6e6cc6b9fb4c6c8e021f90", RobustBitConfig.DEFAULT_VALUE)) {
                return (FlashDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b415df88b6e6cc6b9fb4c6c8e021f90");
            }
            FlashDialog flashDialog = new FlashDialog(this.b.b);
            flashDialog.setCanceledOnTouchOutside(this.b.c);
            flashDialog.a(this.b.d);
            String str = this.b.e;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = FlashDialog.a;
            if (PatchProxy.isSupport(objArr2, flashDialog, changeQuickRedirect2, false, "9e0d3828bc0c81e2bbfa823fddc26b1d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, flashDialog, changeQuickRedirect2, false, "9e0d3828bc0c81e2bbfa823fddc26b1d");
            } else {
                flashDialog.b.setText(str);
            }
            int i = this.b.l;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = FlashDialog.a;
            if (PatchProxy.isSupport(objArr3, flashDialog, changeQuickRedirect3, false, "c58ce7a72ead7c6d5e05b8ae809c84d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, flashDialog, changeQuickRedirect3, false, "c58ce7a72ead7c6d5e05b8ae809c84d0");
            } else {
                try {
                    if (i != -1) {
                        flashDialog.b.setGravity(i);
                    } else {
                        flashDialog.b.setGravity(1);
                    }
                } catch (Throwable unused) {
                    flashDialog.b.setGravity(1);
                }
            }
            flashDialog.a(this.b.f, this.b.h);
            flashDialog.b(this.b.g, this.b.i);
            flashDialog.a(this.b.j);
            flashDialog.a(this.b.k);
            return flashDialog;
        }

        public final FlashDialog a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a9db6d33468ae4836af270e27fcd07", RobustBitConfig.DEFAULT_VALUE)) {
                return (FlashDialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a9db6d33468ae4836af270e27fcd07");
            }
            FlashDialog b = b();
            b.show();
            return b;
        }
    }
}
