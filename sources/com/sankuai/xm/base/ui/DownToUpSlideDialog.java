package com.sankuai.xm.base.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.js.jshandler.SetStatusBarStyleJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.g;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class DownToUpSlideDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public b b;
    protected LinearLayout c;
    public ArrayList<a> d;
    public a e;
    public boolean[] f;
    protected View.OnClickListener g;
    private a h;
    private boolean i;
    private boolean j;
    private Activity k;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public CharSequence a;
        public int b;
        public int c;
        public int d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b {
        void a(int i);
    }

    public DownToUpSlideDialog(Activity activity) {
        super(activity, R.style.xm_sdk_imui_dialog_DownToUpSlideDialog);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c26e05370120f2bdf98640a6a7cca04f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c26e05370120f2bdf98640a6a7cca04f");
            return;
        }
        this.c = null;
        this.h = new a();
        this.d = new ArrayList<>();
        this.e = new a();
        this.i = true;
        this.j = false;
        this.g = new View.OnClickListener() { // from class: com.sankuai.xm.base.ui.DownToUpSlideDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a282a4a4da129605b2c4f7b3b6a53a21", 6917529027641081858L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a282a4a4da129605b2c4f7b3b6a53a21");
                    return;
                }
                if (DownToUpSlideDialog.this.b != null) {
                    DownToUpSlideDialog.this.b.a(((Integer) view.getTag()).intValue());
                }
                g.a((Dialog) DownToUpSlideDialog.this);
            }
        };
        this.k = activity;
        g.a(this, activity);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8bea42007412c611fd67d866968180b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8bea42007412c611fd67d866968180b");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.xm_sdk_imui_dialog_activity_profile_show_tips);
        this.c = (LinearLayout) findViewById(R.id.show_tips);
        if (this.j) {
            this.c.addView(a(-100, this.h, false));
        }
        Iterator<a> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            a next = it.next();
            if (!TextUtils.isEmpty(next.a)) {
                this.c.addView(a(i, next, true));
            }
            i++;
        }
        if (this.i) {
            TextView textView = new TextView(new ContextThemeWrapper(getContext(), this.e.b));
            textView.setText(this.e.a);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.base.ui.DownToUpSlideDialog.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7aede279fc174bc0cae431aa6886cd7", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7aede279fc174bc0cae431aa6886cd7");
                    } else {
                        g.a((Dialog) DownToUpSlideDialog.this);
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_company_item_height));
            layoutParams.bottomMargin = this.e.d;
            layoutParams.topMargin = 0;
            this.c.addView(textView, layoutParams);
        }
        Window window = getWindow();
        window.getAttributes().width = -1;
        window.setGravity(81);
        setCanceledOnTouchOutside(true);
    }

    private View a(int i, a aVar, boolean z) {
        Object[] objArr = {Integer.valueOf(i), aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8740eb9388c26d656a4b7c4fae51f7", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8740eb9388c26d656a4b7c4fae51f7");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(new ContextThemeWrapper(getContext(), aVar.b));
        textView.setTag(Integer.valueOf(i));
        textView.setText(aVar.a);
        if (z) {
            textView.setOnClickListener(this.g);
        }
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        textView.setMinHeight(getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_company_item_height));
        textView.setPadding(0, getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_slide_dialog_default_spacing_height), 0, getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_slide_dialog_default_spacing_height));
        linearLayout.addView(textView, layoutParams);
        View view = new View(getContext());
        view.setBackgroundColor(SetStatusBarStyleJsHandler.COLOR_APPROACH_WHITE);
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 2));
        return linearLayout;
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee074e81834103a050a614580787c569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee074e81834103a050a614580787c569");
        } else if (this.k != null && !this.k.isFinishing()) {
            super.show();
            boolean z = this.j;
            for (int i = 0; i < this.d.size(); i++) {
                this.c.getChildAt(i + (z ? 1 : 0)).setVisibility(this.f[i] ? 0 : 8);
            }
        }
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab87e6058681309ebc90125cd4467aed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab87e6058681309ebc90125cd4467aed");
        } else if (TextUtils.isEmpty(charSequence)) {
            this.j = false;
            this.h.a = "";
        } else {
            this.j = true;
            this.h.a = charSequence;
            this.h.c = getContext().getResources().getDimensionPixelSize(R.dimen.xm_sdk_imui_dialog_slide_dialog_default_spacing_height);
            this.h.b = R.style.xm_sdk_imui_dialog_title;
        }
    }
}
