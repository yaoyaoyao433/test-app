package com.meituan.android.customerservice.channel.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DownToUpSlideDialog extends Dialog {
    public static ChangeQuickRedirect a;
    public c b;
    protected LinearLayout c;
    public Activity d;
    public ArrayList<a> e;
    public b f;
    public boolean[] g;
    protected View.OnClickListener h;
    private a i;
    private boolean j;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class a {
        public CharSequence a;
        public int b;
        public int c;
        public int d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);
    }

    public DownToUpSlideDialog(Activity activity) {
        super(activity, R.style.cs_dialog_DownToUpSlideDialog);
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedeaa48e4c612d118f51e1aa17aeb85", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedeaa48e4c612d118f51e1aa17aeb85");
            return;
        }
        this.c = null;
        this.i = new a();
        this.e = new ArrayList<>();
        this.j = false;
        this.h = new View.OnClickListener() { // from class: com.meituan.android.customerservice.channel.widget.DownToUpSlideDialog.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f839a5348ff18a2b913c12fbe7bf6e5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f839a5348ff18a2b913c12fbe7bf6e5");
                    return;
                }
                if (DownToUpSlideDialog.this.b != null) {
                    DownToUpSlideDialog.this.b.a(((Integer) view.getTag()).intValue());
                }
                DownToUpSlideDialog.this.dismiss();
            }
        };
        this.d = activity;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51c551dd07d65e2ea2319161fd4de500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51c551dd07d65e2ea2319161fd4de500");
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.cs_dialog_show_tips);
        this.c = (LinearLayout) findViewById(R.id.show_tips);
        if (this.j) {
            this.c.addView(a(-100, this.i, false, false));
        }
        Iterator<a> it = this.e.iterator();
        int i = 0;
        while (it.hasNext()) {
            a next = it.next();
            if (!TextUtils.isEmpty(next.a)) {
                if (i == this.e.size() - 2) {
                    this.c.addView(a(i, next, true, true));
                } else {
                    this.c.addView(a(i, next, true, false));
                }
            }
            i++;
        }
        Window window = getWindow();
        window.getAttributes().width = -1;
        window.setGravity(81);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.android.customerservice.channel.widget.DownToUpSlideDialog.2
            public static ChangeQuickRedirect a;

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Object[] objArr2 = {dialogInterface};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a6bb89372e6870886aa299010e22a4c3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a6bb89372e6870886aa299010e22a4c3");
                } else if (DownToUpSlideDialog.this.f != null) {
                    DownToUpSlideDialog.this.f.a();
                }
            }
        });
    }

    private View a(int i, a aVar, boolean z, boolean z2) {
        Object[] objArr = {Integer.valueOf(i), aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628726cad8496d653c8572697c51b604", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628726cad8496d653c8572697c51b604");
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.color.cs_white);
        TextView textView = new TextView(new ContextThemeWrapper(getContext(), aVar.b));
        textView.setTag(Integer.valueOf(i));
        textView.setText(aVar.a);
        textView.setPadding(0, aVar.c, 0, aVar.d);
        if (z) {
            textView.setOnClickListener(this.h);
        }
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(getContext());
        view.setBackgroundResource(R.color.cs_divider_color);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, com.meituan.android.customerservice.kit.utils.c.a(getContext(), 0.5f));
        if (!z2) {
            layoutParams.setMargins(com.meituan.android.customerservice.kit.utils.c.a(getContext(), 15.0f), 0, com.meituan.android.customerservice.kit.utils.c.a(getContext(), 15.0f), 0);
        }
        linearLayout.addView(view, layoutParams);
        return linearLayout;
    }

    @Override // android.app.Dialog
    public void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "361722cdc9edba598979e889e2918895", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "361722cdc9edba598979e889e2918895");
        } else if (this.d != null && !this.d.isFinishing()) {
            super.show();
            boolean z = this.j;
            for (int i = 0; i < this.e.size(); i++) {
                this.c.getChildAt(i + (z ? 1 : 0)).setVisibility(this.g[i] ? 0 : 8);
            }
        }
    }

    @Override // android.app.Dialog
    public boolean isShowing() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e04f1ce1845704980722cee7537c126", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e04f1ce1845704980722cee7537c126")).booleanValue();
        }
        if (this.d == null || this.d.isFinishing()) {
            return false;
        }
        return super.isShowing();
    }
}
