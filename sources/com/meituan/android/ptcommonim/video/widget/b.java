package com.meituan.android.ptcommonim.video.widget;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    View.OnClickListener b;
    private final AlertDialog c;
    private final View d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3f254d4ca9456e51966213d4698e4737", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3f254d4ca9456e51966213d4698e4737");
        } else {
            bVar.c.dismiss();
        }
    }

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db5a5e0b795a753830ce778c39f66277", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db5a5e0b795a753830ce778c39f66277");
            return;
        }
        this.c = new AlertDialog.a(aVar.b).a();
        this.d = LayoutInflater.from(aVar.b).inflate(R.layout.ptim_commonbus_tip_with_two_button_dialog, (ViewGroup) null);
        this.g = (TextView) this.d.findViewById(R.id.tv_tip);
        this.e = (TextView) this.d.findViewById(R.id.tv_cancel);
        this.f = (TextView) this.d.findViewById(R.id.tv_confirm);
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.widget.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2935237bb04a66e0cf01fba9f49a065f", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2935237bb04a66e0cf01fba9f49a065f");
                    return;
                }
                b.a(b.this);
                if (b.this.b != null) {
                    b.this.b.onClick(view);
                }
            }
        });
        this.e.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.ptcommonim.video.widget.b.2
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afe68db9d4400f35ac6ece576c0eb87e", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afe68db9d4400f35ac6ece576c0eb87e");
                } else {
                    b.a(b.this);
                }
            }
        });
        this.b = aVar.f;
        this.g.setText(aVar.c);
        this.f.setText(aVar.d);
        this.e.setText(aVar.e);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5cfb545901021539c9fbdb2266be2d37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5cfb545901021539c9fbdb2266be2d37");
            return;
        }
        this.c.setCanceledOnTouchOutside(false);
        this.c.show();
        Window window = this.c.getWindow();
        if (window != null) {
            window.setContentView(this.d);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        Activity b;
        public String c;
        public String d;
        String e;
        public View.OnClickListener f;

        public a(Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e0898fb7267fd7f16d88e60234d85d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e0898fb7267fd7f16d88e60234d85d");
            } else {
                this.b = activity;
            }
        }

        public final a cancel(String str) {
            this.e = str;
            return this;
        }

        public final b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aed4b2667fa8f9a5e7d80650ea5d419", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aed4b2667fa8f9a5e7d80650ea5d419") : new b(this);
        }
    }
}
