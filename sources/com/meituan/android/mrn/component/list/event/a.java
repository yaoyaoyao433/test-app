package com.meituan.android.mrn.component.list.event;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class a extends com.facebook.react.uimanager.j {
    public static ChangeQuickRedirect g;
    protected HashSet<h> h;

    public a(ViewGroup viewGroup) {
        super(viewGroup);
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8a8bfee8e0bf74e86adb71c6d54dd22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8a8bfee8e0bf74e86adb71c6d54dd22");
        } else {
            this.h = new HashSet<>();
        }
    }

    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f477d7c3ac0ef7856d9b6afe58d8e1dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f477d7c3ac0ef7856d9b6afe58d8e1dd");
        } else {
            this.h.add(hVar);
        }
    }
}
