package com.meituan.android.legwork.common.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CommonLoadingView extends FrameLayout {
    public static ChangeQuickRedirect a;
    public View b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public View f;

    public CommonLoadingView(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c6411044921362c4d053ce5014dce3f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c6411044921362c4d053ce5014dce3f");
        }
    }

    public CommonLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35d6d4896a18bc7a767358026a7d570", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35d6d4896a18bc7a767358026a7d570");
        }
    }

    public CommonLoadingView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10914c112e563775cee639269d895811", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10914c112e563775cee639269d895811");
        }
    }

    public void setOnRefreshListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb6abcf3099232003463c909fb0cee5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb6abcf3099232003463c909fb0cee5");
        } else if (this.e != null) {
            this.e.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01f9d9b7d75e3382348ebbf9da7eb8f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01f9d9b7d75e3382348ebbf9da7eb8f2");
            return;
        }
        super.onFinishInflate();
        this.b = findViewById(R.id.loading_finish_container);
        this.c = (ImageView) findViewById(R.id.loading_finish_img);
        this.d = (TextView) findViewById(R.id.loading_finish_text);
        this.e = (TextView) findViewById(R.id.loading_finish_refresh);
        this.f = findViewById(R.id.loading_container);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec1de627770d0137b3a0153c21d533f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec1de627770d0137b3a0153c21d533f2");
            return;
        }
        setVisibility(0);
        this.b.setVisibility(8);
        this.f.setVisibility(0);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64766a3cad326cdbce9d06623abdf9c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64766a3cad326cdbce9d06623abdf9c8");
        } else {
            setVisibility(8);
        }
    }

    public void setLoadingContainerPaddingTop(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0e5af81d210e50146b71710a64aa22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0e5af81d210e50146b71710a64aa22");
        } else if (this.f == null) {
        } else {
            this.f.setPadding(this.f.getPaddingLeft(), this.f.getPaddingTop() + i, this.f.getPaddingRight(), this.f.getPaddingBottom());
        }
    }
}
