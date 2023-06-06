package com.meituan.passport.view;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.passport.utils.Utils;
import com.meituan.passport.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class TextButton extends AppCompatTextView {
    public static ChangeQuickRedirect a;
    private com.meituan.passport.clickaction.a b;
    private View.OnClickListener c;
    private View.OnClickListener d;
    private View.OnClickListener e;

    @Override // android.view.View
    @Deprecated
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
    }

    public TextButton(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d86f73faaa46dd928812dca352d8fc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d86f73faaa46dd928812dca352d8fc4");
        }
    }

    public TextButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bac7a5e1786022da4b0a7130cef814a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bac7a5e1786022da4b0a7130cef814a");
        }
    }

    public TextButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca91bd5f696d9b8a165db1fe428f8c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca91bd5f696d9b8a165db1fe428f8c3");
            return;
        }
        if (ab.a() == 1) {
            setTextColor(Color.parseColor(DiagnoseLog.COLOR_ERROR));
        } else {
            setTextColor(Utils.d(context, 16842907));
        }
        this.c = j.a(this);
        super.setOnClickListener(this.c);
    }

    public final void setBeforeClickActionListener(@Nullable View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void setAfterClickActionListener(@Nullable View.OnClickListener onClickListener) {
        this.e = onClickListener;
    }

    public final void setClickAction(com.meituan.passport.clickaction.a aVar) {
        this.b = aVar;
    }

    public static /* synthetic */ void a(TextButton textButton, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, textButton, changeQuickRedirect, false, "8ccdf6c390348d69d10ae6a9a4a6e3c5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, textButton, changeQuickRedirect, false, "8ccdf6c390348d69d10ae6a9a4a6e3c5");
        } else if (textButton.b != null) {
            if (textButton.d != null) {
                textButton.d.onClick(view);
            }
            textButton.b.onClick(view);
            if (textButton.e != null) {
                textButton.e.onClick(view);
            }
        }
    }
}
