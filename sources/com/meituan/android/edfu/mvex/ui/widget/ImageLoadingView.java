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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ImageLoadingView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public ImageView b;
    private View c;
    private View d;
    private a e;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public ImageLoadingView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d939a2168460672454ce650159199871", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d939a2168460672454ce650159199871");
        } else {
            a(context);
        }
    }

    public ImageLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e5cb13d2986d8eb8cadd53be1ba17f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e5cb13d2986d8eb8cadd53be1ba17f2");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54356b2b2840c855e7238c7bbdc089f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54356b2b2840c855e7238c7bbdc089f0");
            return;
        }
        this.c = LayoutInflater.from(context).inflate(R.layout.layout_mvex_loading, this);
        this.b = (ImageView) this.c.findViewById(R.id.bg_img);
        this.d = this.c.findViewById(R.id.text_cancel);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.android.edfu.mvex.ui.widget.ImageLoadingView.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c6ad8ecaf50f3d68c9ba0416d25f94d", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c6ad8ecaf50f3d68c9ba0416d25f94d");
                    return;
                }
                ImageLoadingView.this.setVisibility(8);
                if (ImageLoadingView.this.e != null) {
                    ImageLoadingView.this.e.a();
                }
            }
        });
        setVisibility(8);
    }

    public void setListener(a aVar) {
        this.e = aVar;
    }
}
