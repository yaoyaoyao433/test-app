package com.meituan.android.yoda.widget.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaToolbar extends Toolbar {
    public static ChangeQuickRedirect p;
    public com.meituan.android.yoda.interfaces.d<TextView> q;

    public YodaToolbar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e764636acca720c9369e5643fc34630", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e764636acca720c9369e5643fc34630");
        }
    }

    public YodaToolbar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c34a81f89ec69d93559db857f032a071", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c34a81f89ec69d93559db857f032a071");
        }
    }

    public YodaToolbar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c52de366da66c8d9365fb13fb7f9e37b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c52de366da66c8d9365fb13fb7f9e37b");
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
        Object[] objArr = {charSequence};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc7557a46085d3a67f943f8563c6fb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc7557a46085d3a67f943f8563c6fb6");
        } else if (this.q != null) {
            this.q.c().setText(charSequence.toString());
        } else {
            super.setTitle(charSequence);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public CharSequence getTitle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "979210d1ebd6f5cb0ccdff7f945f24d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (CharSequence) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "979210d1ebd6f5cb0ccdff7f945f24d1");
        }
        if (this.q != null) {
            return this.q.c().getText();
        }
        return super.getTitle();
    }
}
