package com.meituan.passport.clickaction;

import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements c<String> {
    public static ChangeQuickRedirect a;
    public WeakReference<EditText> b;

    @Override // com.meituan.passport.clickaction.c
    public final /* synthetic */ String getParam() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a82c003f39011b6dc4e7fd7125ef979", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a82c003f39011b6dc4e7fd7125ef979");
        }
        EditText editText = this.b.get();
        return editText != null ? editText.getText().toString() : "";
    }

    public b(EditText editText) {
        Object[] objArr = {editText};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1477f112ecb13eb628e6b1c6b11e8880", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1477f112ecb13eb628e6b1c6b11e8880");
        } else {
            this.b = new WeakReference<>(editText);
        }
    }
}
