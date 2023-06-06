package com.meituan.msc.uimanager.rlist;

import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.UIViewOperationQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends UIViewOperationQueue {
    public static ChangeQuickRedirect h;
    public int i;
    public final Map<Integer, NativeViewHierarchyManager> j;
    public ArrayList<UIViewOperationQueue.u> k;
    public boolean l;

    public d(ReactApplicationContext reactApplicationContext, c cVar, int i) {
        super(reactApplicationContext, cVar, 0);
        Object[] objArr = {reactApplicationContext, cVar, 0};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a927bff2c82f7ffa134fea7e9c54a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a927bff2c82f7ffa134fea7e9c54a4");
            return;
        }
        this.i = -1;
        this.j = new LinkedHashMap();
        this.k = new ArrayList<>();
        this.l = true;
    }

    @Override // com.meituan.msc.uimanager.UIViewOperationQueue
    public final NativeViewHierarchyManager a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ad6ffc9100c6abffb8cbab213d51ba4", RobustBitConfig.DEFAULT_VALUE)) {
            return (NativeViewHierarchyManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ad6ffc9100c6abffb8cbab213d51ba4");
        }
        if (this.i < 0) {
            return super.a();
        }
        return this.j.get(Integer.valueOf(this.i));
    }

    @Override // com.meituan.msc.uimanager.UIViewOperationQueue
    public final void b(UIViewOperationQueue.u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91df85d41ac8127c70910a00d04c4ec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91df85d41ac8127c70910a00d04c4ec0");
            return;
        }
        this.k.add(uVar);
        if (this.l) {
            super.b(uVar);
        }
    }

    @Override // com.meituan.msc.uimanager.UIViewOperationQueue
    public final void a(UIViewOperationQueue.u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a519c134271c94f054d68ceee9012119", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a519c134271c94f054d68ceee9012119");
            return;
        }
        this.k.add(uVar);
        if (this.l) {
            super.a(uVar);
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0409aedfd5d2b2d6f36079162ae75ca8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0409aedfd5d2b2d6f36079162ae75ca8");
        } else {
            this.k.clear();
        }
    }
}
