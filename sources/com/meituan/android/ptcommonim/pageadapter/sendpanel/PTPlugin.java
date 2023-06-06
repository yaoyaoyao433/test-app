package com.meituan.android.ptcommonim.pageadapter.sendpanel;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.imui.common.panel.plugin.Plugin;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class PTPlugin extends Plugin {
    public static ChangeQuickRedirect a;

    public PTPlugin(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec8c20f7f265358b933d8eea1cccffd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec8c20f7f265358b933d8eea1cccffd4");
        }
    }

    public PTPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cc5dee42729c2f4418f5bd25244c443", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cc5dee42729c2f4418f5bd25244c443");
        }
    }
}
