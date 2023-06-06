package com.sankuai.waimai.business.restaurant.base.widget;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.g;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class FunctionSheetDialogFragment extends BottomSheetDialogFragment {
    public static ChangeQuickRedirect a;
    public String b;
    public a c;
    private SparseArray<String> d;
    private final int e;
    private final int f;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(int i, String str);
    }

    public FunctionSheetDialogFragment() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7712293a6a0405bf12af1b3ecba22f66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7712293a6a0405bf12af1b3ecba22f66");
            return;
        }
        this.d = new SparseArray<>();
        this.e = g.a(com.meituan.android.singleton.b.a, 54.0f);
        this.f = g.a(com.meituan.android.singleton.b.a, 45.0f);
    }

    @Override // android.support.design.widget.BottomSheetDialogFragment, android.support.v7.app.AppCompatDialogFragment, android.support.v4.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(Bundle bundle) {
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout;
        char c = 0;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07afa7cc82c69ef23a43e303126d345a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dialog) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07afa7cc82c69ef23a43e303126d345a");
        }
        com.sankuai.waimai.foundation.utils.log.a.b("MoreFunctionDialogFragment", "onCreateDialog", new Object[0]);
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) super.onCreateDialog(bundle);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.wm_restaurant_function_sheet_dialog, (ViewGroup) null);
        Object[] objArr2 = {inflate};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0139f96d7781b533aa8621c1d93a2c36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0139f96d7781b533aa8621c1d93a2c36");
        } else {
            ((TextView) inflate.findViewById(R.id.tv_cancel_btn)).setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.FunctionSheetDialogFragment.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c1965e34d9eb192a29af6d61b2c91eda", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c1965e34d9eb192a29af6d61b2c91eda");
                    } else {
                        FunctionSheetDialogFragment.this.dismiss();
                    }
                }
            });
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_function_item_container);
            linearLayout.removeAllViews();
            if (!aa.a(this.b)) {
                String str = this.b;
                Object[] objArr3 = {str};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7a5b9f3137e2c0d8387df25875ede8ed", RobustBitConfig.DEFAULT_VALUE)) {
                    textView2 = (TextView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7a5b9f3137e2c0d8387df25875ede8ed");
                } else {
                    textView2 = new TextView(getContext());
                    textView2.setText(str);
                    textView2.setGravity(17);
                    textView2.setTextSize(13.0f);
                    textView2.setTextColor(-7369068);
                    textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f));
                }
                linearLayout.addView(textView2);
            }
            if (this.d != null && this.d.size() > 0) {
                int i = 0;
                while (i < this.d.size()) {
                    final int keyAt = this.d.keyAt(i);
                    final String str2 = this.d.get(keyAt);
                    Object[] objArr4 = new Object[2];
                    objArr4[c] = Integer.valueOf(keyAt);
                    objArr4[1] = str2;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "57677d1c2e3a5d3909d1025c1bfedbd5", RobustBitConfig.DEFAULT_VALUE)) {
                        textView = (TextView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "57677d1c2e3a5d3909d1025c1bfedbd5");
                    } else {
                        textView = new TextView(getContext());
                        textView.setText(str2);
                        textView.setGravity(17);
                        textView.setTextSize(20.0f);
                        textView.setTextColor(-16745729);
                        textView.setEllipsize(TextUtils.TruncateAt.END);
                        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, this.e));
                        textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.restaurant.base.widget.FunctionSheetDialogFragment.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8e3936c0e0a58edc6c280d1982e6ff02", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8e3936c0e0a58edc6c280d1982e6ff02");
                                } else if (FunctionSheetDialogFragment.this.c != null) {
                                    FunctionSheetDialogFragment.this.c.a(keyAt, str2);
                                }
                            }
                        });
                    }
                    linearLayout.addView(textView);
                    i++;
                    c = 0;
                }
            }
        }
        bottomSheetDialog.setContentView(inflate);
        Window window = bottomSheetDialog.getWindow();
        if (window != null && (frameLayout = (FrameLayout) window.findViewById(R.id.design_bottom_sheet)) != null) {
            frameLayout.setBackground(new ColorDrawable(0));
            BottomSheetBehavior a2 = BottomSheetBehavior.a(frameLayout);
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            a2.a(PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "29555fda4e3a1bf7aa0a91c00b837226", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "29555fda4e3a1bf7aa0a91c00b837226")).intValue() : g.c(com.meituan.android.singleton.b.a));
            a2.d = true;
        }
        return bottomSheetDialog;
    }

    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d00403aa1af8702a1d5eec4be55540", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d00403aa1af8702a1d5eec4be55540");
            return;
        }
        if (this.d == null) {
            this.d = new SparseArray<>();
        }
        this.d.append(i, str);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efec0cc7d194f22c14127adb4e61d1f8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efec0cc7d194f22c14127adb4e61d1f8");
        } else if (this.d != null) {
            this.d.clear();
        }
    }
}
