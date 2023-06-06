package com.dianping.picassocontroller.widget;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.dianping.picasso.PicassoUtils;
import com.dianping.picassocontroller.module.ModalModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ActionSheetDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public final LinearLayout b;
    public DialogInterface.OnClickListener c;
    private boolean d;
    private int e;

    public ActionSheetDialog(Context context, int i) {
        super(context, 3);
        Object[] objArr = {context, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a82ade6f32bb8bb67dc85615d2e46e43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a82ade6f32bb8bb67dc85615d2e46e43");
            return;
        }
        this.d = true;
        this.e = 1;
        this.b = new LinearLayout(context);
        this.b.setOrientation(1);
        this.b.setBackgroundColor(Color.parseColor("#66000000"));
        this.b.setGravity(80);
        int dp2px = PicassoUtils.dp2px(getContext(), 15.0f);
        this.b.setPadding(dp2px, dp2px, dp2px, dp2px);
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setAlpha(0);
        getWindow().setBackgroundDrawable(colorDrawable);
        setContentView(this.b, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382222d05c6fffaa2f839d68edca9df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382222d05c6fffaa2f839d68edca9df6");
            return;
        }
        super.setCanceledOnTouchOutside(z);
        this.d = z;
    }

    public View a(ModalModule.ActionSheetArgument actionSheetArgument) {
        Object[] objArr = {actionSheetArgument};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "963fe2b9b7481690488d667d99c25170", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "963fe2b9b7481690488d667d99c25170");
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#eeffffff"));
        gradientDrawable.setCornerRadius(PicassoUtils.dp2px(getContext(), 10.0f));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        View view = new View(getContext());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.ActionSheetDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c97abedf136eab691a2def411e2a767", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c97abedf136eab691a2def411e2a767");
                } else if (ActionSheetDialog.this.isShowing() && ActionSheetDialog.this.d) {
                    ActionSheetDialog.this.cancel();
                }
            }
        });
        linearLayout.addView(view, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        linearLayout2.setBackground(gradientDrawable);
        if (!TextUtils.isEmpty(actionSheetArgument.title)) {
            linearLayout2.addView(a(actionSheetArgument.title));
            linearLayout2.addView(a());
        }
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (actionSheetArgument.actionItems != null && actionSheetArgument.actionItems.length > 0) {
            for (final int i = 0; i < actionSheetArgument.actionItems.length; i++) {
                TextView a2 = a(actionSheetArgument.actionItems[i].title, "destructive".equals(actionSheetArgument.actionItems[i].style));
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.dianping.picassocontroller.widget.ActionSheetDialog.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr2 = {view2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5b35ae25ed083dc86cee1b9e77c2f1c", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5b35ae25ed083dc86cee1b9e77c2f1c");
                        } else if (ActionSheetDialog.this.c != null) {
                            ActionSheetDialog.this.c.onClick(ActionSheetDialog.this, i);
                        }
                    }
                });
                linearLayout3.addView(a2);
                if (i != actionSheetArgument.actionItems.length - 1) {
                    linearLayout3.addView(a());
                }
            }
        }
        scrollView.addView(linearLayout3, layoutParams2);
        linearLayout2.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.weight = 1.0f;
        layoutParams3.bottomMargin = PicassoUtils.dp2px(getContext(), 15.0f);
        linearLayout.setLayoutParams(layoutParams3);
        return linearLayout;
    }

    private View a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d00d9326053fa579ff724af195ee3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d00d9326053fa579ff724af195ee3c");
        }
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(Color.parseColor("#999999"));
        return view;
    }

    private TextView a(String str, boolean z) {
        int parseColor;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dea0a94ef6bb8dbd0bee1b2602711663", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dea0a94ef6bb8dbd0bee1b2602711663");
        }
        AppCompatTextView a2 = a(PicassoUtils.dp2px(getContext(), 60.0f));
        if (z) {
            parseColor = Color.parseColor("#f73f38");
        } else {
            parseColor = Color.parseColor("#327afd");
        }
        a2.setTextColor(parseColor);
        a2.setText(str);
        a2.setTextSize(0, getContext().getResources().getDimension(R.dimen.action_sheet_text_size));
        return a2;
    }

    @SuppressLint({"RestrictedApi"})
    private TextView a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b97945b28ecf5d571680d8fd42bf5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b97945b28ecf5d571680d8fd42bf5a");
        }
        AppCompatTextView a2 = a(PicassoUtils.dp2px(getContext(), 50.0f));
        a2.setTextColor(Color.parseColor("#939393"));
        a2.setText(str);
        a2.setTextSize(0, getContext().getResources().getDimension(R.dimen.action_sheet_text_size));
        a2.setAutoSizeTextTypeWithDefaults(1);
        a2.setAutoSizeTextTypeUniformWithConfiguration(9, 20, 2, 2);
        a2.setMaxLines(this.e);
        return a2;
    }

    public AppCompatTextView a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e462a57d0d73c11e6b1f5db01ab4c65a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppCompatTextView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e462a57d0d73c11e6b1f5db01ab4c65a");
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setPadding(PicassoUtils.dp2px(getContext(), 25.0f), appCompatTextView.getPaddingTop(), PicassoUtils.dp2px(getContext(), 25.0f), appCompatTextView.getPaddingBottom());
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        return appCompatTextView;
    }
}
