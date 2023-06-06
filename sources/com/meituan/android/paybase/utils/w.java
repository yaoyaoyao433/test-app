package com.meituan.android.paybase.utils;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.paybase.dialog.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class w extends com.sankuai.meituan.android.ui.widget.a {
    public static ChangeQuickRedirect a;
    public String b;
    public e.a c;
    private String f;

    @Override // com.sankuai.meituan.android.ui.widget.a
    public final /* synthetic */ com.sankuai.meituan.android.ui.widget.a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96fa69c75ad2c61ab56f71a0f74bfa03", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96fa69c75ad2c61ab56f71a0f74bfa03");
        }
        this.f = str;
        super.a(str);
        return this;
    }

    private w(@NonNull View view, CharSequence charSequence, int i) {
        super(view, charSequence, i);
        Object[] objArr = {view, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b527c39e9b0446c619040b1588384dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b527c39e9b0446c619040b1588384dc");
        } else {
            this.f = charSequence.toString();
        }
    }

    public static w a(@NonNull Dialog dialog, CharSequence charSequence, int i) {
        Object[] objArr = {dialog, charSequence, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ef6dab1e5ee43b4f5d918b14f0228fc2", RobustBitConfig.DEFAULT_VALUE)) {
            return (w) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ef6dab1e5ee43b4f5d918b14f0228fc2");
        }
        Window window = dialog.getWindow();
        if (window == null || window.getDecorView() == null || charSequence == null) {
            return null;
        }
        return new w(window.getDecorView(), charSequence, i);
    }

    @Override // com.sankuai.meituan.android.ui.widget.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a692893f9ad0edb42ab53e8cf1a96b3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a692893f9ad0edb42ab53e8cf1a96b3c");
            return;
        }
        View c = c();
        if (c == null) {
            return;
        }
        b(c().getContext().getResources().getColor(R.color.paybase__toast_background_color)).a(c.getContext().getResources().getDimensionPixelSize(R.dimen.paybase__toast_radius));
        if (c instanceof LinearLayout) {
            Object[] objArr2 = {Float.valueOf(16.0f)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "189c526c40491f2f2e7ad31c7ae56fca", RobustBitConfig.DEFAULT_VALUE)) {
                w wVar = (w) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "189c526c40491f2f2e7ad31c7ae56fca");
            } else {
                TextView textView = (TextView) c().findViewById(R.id.snackbar_text);
                if (textView != null) {
                    textView.setTextSize(16.0f);
                }
            }
            TextView textView2 = (TextView) c.findViewById(R.id.snackbar_text);
            if (textView2 != null && !TextUtils.isEmpty(this.b)) {
                textView2.setText(com.meituan.android.paybase.dialog.e.a(this.f, this.b, c.getContext().getResources().getColor(R.color.paybase__black3)));
            }
            View view = null;
            if (e.a.TOAST_TYPE_SUCCESS == this.c) {
                view = View.inflate(c.getContext(), R.layout.paybase__toast_icon_right, null);
            } else if (e.a.TOAST_TYPE_EXCEPTION == this.c) {
                view = View.inflate(c.getContext(), R.layout.paybase__toast_icon_error, null);
            }
            if (view != null) {
                a(view);
            }
        }
        super.a();
    }
}
