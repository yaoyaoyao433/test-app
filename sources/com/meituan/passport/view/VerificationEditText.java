package com.meituan.passport.view;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class VerificationEditText extends PassportEditText {
    public static ChangeQuickRedirect b;
    private long c;

    public VerificationEditText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f1d90ebd22cf7008119fadd1a4c86a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f1d90ebd22cf7008119fadd1a4c86a");
        } else {
            this.c = 0L;
        }
    }

    public VerificationEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9ba964c0579a3b8bda1b671e399b38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9ba964c0579a3b8bda1b671e399b38");
        } else {
            this.c = 0L;
        }
    }

    public VerificationEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7cfda88e1e9761b5aecc583802b5bef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7cfda88e1e9761b5aecc583802b5bef");
        } else {
            this.c = 0L;
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd28273b618932818a63df192735f745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd28273b618932818a63df192735f745");
            return;
        }
        super.onSelectionChanged(i, i2);
        setSelection(getText().length());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0a1b00df22645e1752771e0fd171d22", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0a1b00df22645e1752771e0fd171d22")).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.c < 500) {
                this.c = currentTimeMillis;
                return true;
            }
            this.c = currentTimeMillis;
        }
        return super.onTouchEvent(motionEvent);
    }
}
