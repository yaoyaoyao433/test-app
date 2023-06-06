package com.meituan.msc.modules.page.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LoadingIndicator extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private c b;
    private boolean c;

    public LoadingIndicator(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c58fa4511e22a0b1168f1fdaa09a514e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c58fa4511e22a0b1168f1fdaa09a514e");
        } else {
            a(context);
        }
    }

    public LoadingIndicator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f82af078d26f8450cea06e03ce0a3013", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f82af078d26f8450cea06e03ce0a3013");
        } else {
            a(context);
        }
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614cc5174405695c38893cc254cf196f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614cc5174405695c38893cc254cf196f");
            return;
        }
        this.b = new c();
        setImageDrawable(this.b);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feaf22a5616f4ba18fd44843e3164806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feaf22a5616f4ba18fd44843e3164806");
        } else if (i == 0) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1648bfc7daf885dfc41e865ad3bbb54e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1648bfc7daf885dfc41e865ad3bbb54e");
            } else if (this.c) {
            } else {
                setVisibility(0);
                this.b.start();
                this.c = true;
            }
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "360dcadc7b84a20ec40ee8872a1f2aef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "360dcadc7b84a20ec40ee8872a1f2aef");
            } else if (this.c) {
                this.c = false;
                setVisibility(8);
                this.b.stop();
            }
        }
    }
}
