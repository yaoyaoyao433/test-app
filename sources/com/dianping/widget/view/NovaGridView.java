package com.dianping.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.dianping.judas.interfaces.c;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NovaGridView extends GridView implements com.dianping.judas.interfaces.c {
    public static ChangeQuickRedirect a;
    public d b;
    private String c;
    private com.dianping.judas.b d;

    public NovaGridView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ac05718bba417fce83b898dc6b8ddf6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ac05718bba417fce83b898dc6b8ddf6");
            return;
        }
        this.b = new d();
        this.d = new com.dianping.judas.b(this, this.b);
    }

    public NovaGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e2be5a23e786c4cea3c422e38d8cc6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e2be5a23e786c4cea3c422e38d8cc6e");
            return;
        }
        this.b = new d();
        this.d = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    public NovaGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882dde7ee4eedcbdcb3587024ee5f447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882dde7ee4eedcbdcb3587024ee5f447");
            return;
        }
        this.b = new d();
        this.d = new com.dianping.judas.b(this, this.b);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2727c9833d5892642c5dd4b8d62982", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2727c9833d5892642c5dd4b8d62982");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.exposeBlockId});
        this.c = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView
    public boolean performItemClick(View view, int i, long j) {
        Object[] objArr = {view, Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "caa0acc034722918651c159e16a9e316", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "caa0acc034722918651c159e16a9e316")).booleanValue();
        }
        if (super.performItemClick(view, i, j)) {
            if (view instanceof com.dianping.judas.interfaces.c) {
                com.dianping.judas.interfaces.c cVar = (com.dianping.judas.interfaces.c) view;
                if (cVar.b(c.a.CLICK) == null && b(c.a.CLICK) != null) {
                    cVar.a(b(c.a.CLICK), c.a.CLICK);
                }
                if (cVar.a(c.a.CLICK) == null && a(c.a.CLICK) != null) {
                    cVar.a(a(c.a.CLICK), c.a.CLICK);
                }
            }
            if (com.dianping.judas.util.b.a(view) == Integer.MAX_VALUE) {
                a.a().a(view, i, "click", EventName.MGE);
            } else {
                a.a().a(view, "click", EventName.MGE);
            }
            return true;
        }
        return false;
    }

    public void setGAString(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5748903d4099a650527964e40332a06f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5748903d4099a650527964e40332a06f");
        } else {
            this.d.b = str;
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public String getGAString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c069176007066c4a814e0feae3eb723", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c069176007066c4a814e0feae3eb723") : this.d.getGAString();
    }

    @Override // com.dianping.judas.interfaces.c
    public d getGAUserInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9da5a9483498f72dec016be1097ae10e", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9da5a9483498f72dec016be1097ae10e") : this.d.getGAUserInfo();
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(String str, c.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61160c5dba975fcdf9488f713e440176", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61160c5dba975fcdf9488f713e440176");
        } else {
            this.d.a(str, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final String a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3260e409ec2bbfdd4eaedc41615697d5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3260e409ec2bbfdd4eaedc41615697d5") : this.d.a(aVar);
    }

    @Override // com.dianping.judas.interfaces.c
    public final void a(EventInfo eventInfo, c.a aVar) {
        Object[] objArr = {eventInfo, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82ce386c8e20b245474f9783b5beb68e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82ce386c8e20b245474f9783b5beb68e");
        } else {
            this.d.a(eventInfo, aVar);
        }
    }

    @Override // com.dianping.judas.interfaces.c
    public final EventInfo b(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a591b501fe437687c3e1d92b368d7c6f", RobustBitConfig.DEFAULT_VALUE) ? (EventInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a591b501fe437687c3e1d92b368d7c6f") : this.d.b(aVar);
    }

    public void setExposeBlockId(String str) {
        this.c = str;
    }
}
