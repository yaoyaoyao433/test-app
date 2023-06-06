package com.meituan.android.edfu.mvex.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TitleView extends FrameLayout {
    public static ChangeQuickRedirect a;
    private View b;
    private ImageView c;
    private TextView d;
    private ImageView e;
    private a f;
    private View.OnClickListener g;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void c();
    }

    public TitleView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2176661632de34618ddcf8e6ac0b78f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2176661632de34618ddcf8e6ac0b78f");
            return;
        }
        this.g = new View.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.TitleView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a41efaa176274db6d2a04a17f13eef00", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a41efaa176274db6d2a04a17f13eef00");
                } else if (view.getId() == R.id.image_help) {
                    if (TitleView.this.f != null) {
                        TitleView.this.f.a();
                    }
                } else if (view.getId() != R.id.image_return || TitleView.this.f == null) {
                } else {
                    TitleView.this.f.c();
                }
            }
        };
        a(context);
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7cb23606ef259696a3219c9c405052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7cb23606ef259696a3219c9c405052");
            return;
        }
        this.g = new View.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.TitleView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a41efaa176274db6d2a04a17f13eef00", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a41efaa176274db6d2a04a17f13eef00");
                } else if (view.getId() == R.id.image_help) {
                    if (TitleView.this.f != null) {
                        TitleView.this.f.a();
                    }
                } else if (view.getId() != R.id.image_return || TitleView.this.f == null) {
                } else {
                    TitleView.this.f.c();
                }
            }
        };
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51dae484977b25c117f6a7d2301179c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51dae484977b25c117f6a7d2301179c5");
            return;
        }
        this.b = LayoutInflater.from(context).inflate(R.layout.layout_titlebar, this);
        this.c = (ImageView) this.b.findViewById(R.id.image_return);
        this.e = (ImageView) this.b.findViewById(R.id.image_help);
        this.d = (TextView) this.b.findViewById(R.id.text_pagetitle);
        this.c.setOnClickListener(this.g);
        this.e.setOnClickListener(this.g);
    }

    public void setTitleBarListener(a aVar) {
        this.f = aVar;
    }
}
