package com.meituan.msc.uimanager.animate;

import android.support.annotation.Nullable;
import android.util.Pair;
import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.modules.core.c;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.uimanager.UIImplementation;
import com.meituan.msc.uimanager.UIManagerModule;
import com.meituan.msc.uimanager.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    public ArrayList<a> b;
    public ReactApplicationContext c;
    private final com.meituan.msc.uimanager.d d;
    private final com.meituan.msc.jse.modules.core.c e;
    @Nullable
    private e f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(e eVar);
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostDestroy() {
    }

    public static /* synthetic */ Pair a(f fVar, UIImplementation uIImplementation, int i, int i2, String str) {
        List<MSCListNode> a2;
        Object[] objArr = {uIImplementation, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "b3132beae34de9b7a4a6a29a292f32ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "b3132beae34de9b7a4a6a29a292f32ba");
        }
        View g = uIImplementation.g(i);
        if (!(g instanceof MSCListView) || (a2 = com.meituan.msc.mmpviews.list.common.b.a((MSCListView) g, i2, str)) == null || a2.size() == 0) {
            return null;
        }
        WritableArray createArray = Arguments.createArray();
        com.meituan.msc.uimanager.list.c cVar = a2.get(0).uiImplementation;
        for (MSCListNode mSCListNode : a2) {
            createArray.pushInt(mSCListNode.mReactTag);
        }
        return new Pair(cVar, createArray);
    }

    public static /* synthetic */ e a(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "aa3df72852b9cd8cce428973379bb728", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "aa3df72852b9cd8cce428973379bb728");
        }
        if (fVar.f == null) {
            fVar.f = new e();
        }
        return fVar.f;
    }

    public f(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d28824e5f12d808b6fb47d8d75fa2d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d28824e5f12d808b6fb47d8d75fa2d3");
            return;
        }
        this.b = new ArrayList<>();
        this.c = reactApplicationContext;
        this.e = com.meituan.msc.jse.modules.core.c.b();
        this.d = new com.meituan.msc.uimanager.d(this.c) { // from class: com.meituan.msc.uimanager.animate.f.1
            public static ChangeQuickRedirect c;

            @Override // com.meituan.msc.uimanager.d
            public final void b(long j) {
                Object[] objArr2 = {new Long(j)};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "77fde19891b322ca84bd62c728c2fd0c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "77fde19891b322ca84bd62c728c2fd0c");
                    return;
                }
                try {
                    f.a(f.this).a(j);
                    ((com.meituan.msc.jse.modules.core.c) com.facebook.infer.annotation.a.a(f.this.e)).a(c.a.NATIVE_ANIMATED_MODULE, f.this.d);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        reactApplicationContext.addLifecycleEventListener(this);
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a84f941017353b549bf0fdbc71e9d4cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a84f941017353b549bf0fdbc71e9d4cc");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8332bae07c9cefd3fd785348330d6ea1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8332bae07c9cefd3fd785348330d6ea1");
        } else {
            ((com.meituan.msc.jse.modules.core.c) com.facebook.infer.annotation.a.a(this.e)).a(c.a.NATIVE_ANIMATED_MODULE, this.d);
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public final void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5339bc6dc4007d7669c1f9c0e657204", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5339bc6dc4007d7669c1f9c0e657204");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68c5b8ac357b715687800dc78052468c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68c5b8ac357b715687800dc78052468c");
        } else {
            ((com.meituan.msc.jse.modules.core.c) com.facebook.infer.annotation.a.a(this.e)).b(c.a.NATIVE_ANIMATED_MODULE, this.d);
        }
    }

    public final void a(UIManagerModule uIManagerModule) {
        Object[] objArr = {uIManagerModule};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6eb6d6224b1a36ff7f7a78a3f7b973a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6eb6d6224b1a36ff7f7a78a3f7b973a");
        } else if (this.b.isEmpty()) {
        } else {
            final ArrayList<a> arrayList = this.b;
            this.b = new ArrayList<>();
            uIManagerModule.a(new am() { // from class: com.meituan.msc.uimanager.animate.f.4
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.uimanager.am
                public final void a(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    Object[] objArr2 = {nativeViewHierarchyManager};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7ff0693ffe05561b9e1fe4f9bcc1fe6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7ff0693ffe05561b9e1fe4f9bcc1fe6");
                        return;
                    }
                    e a2 = f.a(f.this);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a(a2);
                    }
                }
            });
        }
    }
}
