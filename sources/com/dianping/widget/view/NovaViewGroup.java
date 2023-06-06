package com.dianping.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class NovaViewGroup extends ViewGroup implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    protected View.OnClickListener b;
    protected String c;
    public d d;
    protected com.dianping.judas.b e;

    public NovaViewGroup(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "080508fc32da82a2b5b712152cce1386", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "080508fc32da82a2b5b712152cce1386");
            return;
        }
        this.d = new d();
        this.e = new com.dianping.judas.b(this, this.d);
    }

    public NovaViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9df6057b27e82b6d989d2ec2a19174", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9df6057b27e82b6d989d2ec2a19174");
            return;
        }
        this.d = new d();
        this.e = new com.dianping.judas.b(this, this.d);
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2a587d3074fe2cdfeabc595bb2dd2a24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2a587d3074fe2cdfeabc595bb2dd2a24");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.c = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c9c37a311ff1773c1bc752ed9355809", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c9c37a311ff1773c1bc752ed9355809");
            return;
        }
        super.setOnClickListener(onClickListener);
        this.b = onClickListener;
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47917fa9560e919a7953c75fc0222fae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47917fa9560e919a7953c75fc0222fae");
        } else {
            this.e.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79418401f2c7da6a32f3776480b59953", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79418401f2c7da6a32f3776480b59953") : this.e.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "274c0f1a7c52c1b39d9bf04ce8cbd275", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "274c0f1a7c52c1b39d9bf04ce8cbd275") : this.e.getGAUserInfo();
    }

    public void setExposeBlockId(String str) {
        this.c = str;
    }
}
