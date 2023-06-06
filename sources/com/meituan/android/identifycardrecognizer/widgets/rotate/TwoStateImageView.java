package com.meituan.android.identifycardrecognizer.widgets.rotate;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class TwoStateImageView extends AppCompatImageView {
    public static ChangeQuickRedirect b;
    private boolean a;

    public TwoStateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf61fd5a9aee5eaf3723e30ec24a175", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf61fd5a9aee5eaf3723e30ec24a175");
        } else {
            this.a = true;
        }
    }

    public TwoStateImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7710e9ed71d7934e95e9a005d813ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7710e9ed71d7934e95e9a005d813ab");
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb608c7c5f06149e1f54c6c8a99886d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb608c7c5f06149e1f54c6c8a99886d");
            return;
        }
        super.setEnabled(z);
        if (this.a) {
            if (z) {
                setAlpha(255);
            } else {
                setAlpha(102);
            }
        }
    }
}
