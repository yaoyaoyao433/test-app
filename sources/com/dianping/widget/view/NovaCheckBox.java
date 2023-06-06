package com.dianping.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaCheckBox extends CheckBox implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private View.OnClickListener c;
    private String d;
    private com.dianping.judas.b e;

    public NovaCheckBox(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63bcfc082f0be929452159f704f7d9cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63bcfc082f0be929452159f704f7d9cb");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
    }

    public NovaCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dda519f4df9239a08ab62734efd27505", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dda519f4df9239a08ab62734efd27505");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    public NovaCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "271122b615e3a6a4c333b0b08ee6b2ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "271122b615e3a6a4c333b0b08ee6b2ee");
            return;
        }
        this.b = new d();
        this.e = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694cede24bb3f906ae3a918c20894e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694cede24bb3f906ae3a918c20894e6b");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.d = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db622b2f6845a9f66bb5da312f673b86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db622b2f6845a9f66bb5da312f673b86");
            return;
        }
        super.setOnClickListener(onClickListener);
        this.c = onClickListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a536fd6829995ca4789c50878aa0ca1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a536fd6829995ca4789c50878aa0ca1a")).booleanValue();
        }
        if (this.c != null) {
            a.a().a(this, "click", EventName.MGE);
        }
        return super.performClick();
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d28648bbbb4280585f50b2fff57b8b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d28648bbbb4280585f50b2fff57b8b0");
        } else {
            this.e.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17bac341496bc151c0af4c926284152c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17bac341496bc151c0af4c926284152c") : this.e.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fab927195d3e8ba0cd8e710f3ad93c7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fab927195d3e8ba0cd8e710f3ad93c7") : this.e.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5259a3dbcfed5ebb40844eb91271a13f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5259a3dbcfed5ebb40844eb91271a13f");
        } else {
            this.e.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "014f189e81e62824488cfeddb84d3de4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "014f189e81e62824488cfeddb84d3de4") : this.e.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91d419146d113faea5afc628198c4e03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91d419146d113faea5afc628198c4e03");
        } else {
            this.e.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e219f81c18d57c93cc12d422039add", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e219f81c18d57c93cc12d422039add") : this.e.b(aVar);
    }

    public void setExposeBlockId(String str) {
        this.d = str;
    }
}
