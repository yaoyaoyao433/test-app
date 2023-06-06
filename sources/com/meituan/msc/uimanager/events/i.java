package com.meituan.msc.uimanager.events;

import android.view.View;
import com.meituan.msc.uimanager.events.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class i<T extends a> extends a<T> {
    public static ChangeQuickRedirect b;
    private WeakReference<View> a;

    public i(int i, View view) {
        super(i);
        Object[] objArr = {Integer.valueOf(i), view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2afd03c075f8bc115a5a8f2f2a15adc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2afd03c075f8bc115a5a8f2f2a15adc");
        } else {
            this.a = new WeakReference<>(view);
        }
    }

    public final View e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e4dd0bc2cc8f02f57a78fc1006b6c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e4dd0bc2cc8f02f57a78fc1006b6c2");
        }
        if (this.a == null) {
            return null;
        }
        return this.a.get();
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1233ca5bead7276fb2394acd8ad5374d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1233ca5bead7276fb2394acd8ad5374d");
        } else {
            this.a = new WeakReference<>(view);
        }
    }

    public final short g() {
        View view;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d36cdab9f85c786f03e037b7c17319", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Short) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d36cdab9f85c786f03e037b7c17319")).shortValue();
        }
        if (this.a == null || (view = this.a.get()) == null) {
            return (short) 0;
        }
        return (short) view.hashCode();
    }
}
