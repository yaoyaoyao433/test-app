package com.meituan.msi.api.component.input;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class MSIEdiText extends EditText {
    public static ChangeQuickRedirect y;

    public MSIEdiText() {
        super(com.meituan.msi.a.f());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8492ccd63a33b4ef3b8c25412dc4f9ff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8492ccd63a33b4ef3b8c25412dc4f9ff");
        }
    }

    public MSIEdiText(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "853d29bad0d5749ee6a2517429e97249", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "853d29bad0d5749ee6a2517429e97249");
        }
    }

    public MSIEdiText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = y;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ee2cd478a43e6f947f7606d3cabe905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ee2cd478a43e6f947f7606d3cabe905");
        }
    }
}
