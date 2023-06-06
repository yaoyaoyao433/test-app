package com.meituan.android.mrn.component.list.turbo;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k implements j {
    public static ChangeQuickRedirect a;
    public l b;
    public ao c;
    public View d;
    public SparseArray<View> e;
    public com.meituan.android.mrn.component.list.event.f f;

    public k(ao aoVar, l lVar, com.meituan.android.mrn.component.list.event.f fVar) {
        Object[] objArr = {aoVar, lVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95b7de08462624c48404fe434c6c72e1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95b7de08462624c48404fe434c6c72e1");
            return;
        }
        this.e = new SparseArray<>();
        this.c = aoVar;
        this.b = lVar;
        this.f = fVar;
    }

    private View b(TurboNode turboNode) {
        Object[] objArr = {turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba3e59eff2fef258ea6d65944693946", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba3e59eff2fef258ea6d65944693946");
        }
        if (turboNode == null) {
            return null;
        }
        if (MListExpressionManager.COMPONENT_NAME.equals(turboNode.mModuleName) && turboNode.mProps != null && turboNode.mProps.hasKey("lfor")) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        ArrayList<View> arrayList = new ArrayList<>();
        for (int i = 0; i < turboNode.mChildren.size(); i++) {
            TurboNode turboNode2 = turboNode.mChildren.get(i);
            View b = b(turboNode2);
            if (b != null) {
                arrayList.add(b);
            }
            if (!(MListExpressionManager.COMPONENT_NAME.equals(turboNode2.mModuleName) && turboNode2.mProps != null && turboNode2.mProps.hasKey("lfor"))) {
                javaOnlyArray.pushInt(turboNode2.mReactTag);
            }
        }
        this.b.a(turboNode.mReactTag, turboNode.mModuleName, turboNode.mRootTag, turboNode.mProps);
        af a2 = this.b.a(turboNode.mReactTag);
        if (a2 != null) {
            a2.setIsLayoutOnly(false);
        }
        View a3 = this.b.a(this.c, turboNode.mReactTag, turboNode.mModuleName);
        if (a3 != null) {
            this.e.put(turboNode.mReactTag, a3);
        }
        this.b.a(turboNode.mReactTag, turboNode.mModuleName, turboNode.mProps, a3);
        if ((a3 instanceof com.meituan.android.mrn.component.Touchable.b) && this.f != null) {
            com.meituan.android.mrn.component.Touchable.b bVar = (com.meituan.android.mrn.component.Touchable.b) a3;
            this.f.a((com.meituan.android.mrn.component.list.event.h) bVar);
            bVar.setEventId(turboNode.mEventId);
            bVar.b = true;
            a3.setTag(R.id.native_component_turbo_event_id, Integer.valueOf(turboNode.mEventId));
        }
        if (a3 != null && javaOnlyArray.size() > 0) {
            this.b.a(turboNode.mReactTag, javaOnlyArray);
        }
        if (turboNode != null && a3 != null && arrayList.size() > 0) {
            this.b.a(turboNode.mModuleName, a3, arrayList);
        }
        return a3;
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final void a(@NonNull TurboNode turboNode, boolean z) {
        Object[] objArr = {turboNode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55f1f5a9a07842a7ae447aa1af98fc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55f1f5a9a07842a7ae447aa1af98fc4");
        } else if (this.d != null) {
            throw new IllegalStateException("TurboNode树根View已经创建了");
        } else {
            this.d = b(turboNode);
            if (this.d == null || !z) {
                return;
            }
            this.d.setTag(R.id.native_component_turbo_node_tag, turboNode);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final View a() {
        return this.d;
    }

    private View a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "393d9042e3be7ed5111e5b2cd3b2277e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "393d9042e3be7ed5111e5b2cd3b2277e") : this.e.get(i);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final void a(@NonNull TurboNode turboNode) {
        Object[] objArr = {turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aacfa8e83fb267dfde7131dd32df03e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aacfa8e83fb267dfde7131dd32df03e");
            return;
        }
        View a2 = a(turboNode.mReactTag);
        try {
            this.b.a(turboNode.mReactTag, turboNode.mModuleName, turboNode.mProps, a2);
        } catch (Exception e) {
            com.facebook.common.logging.a.d("[TurboTreeViewHierarchyHelper@updateViewProps]", a2 + ",node:" + turboNode + ",error = " + e);
        }
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final void a(@NonNull TurboNode turboNode, @NonNull TurboNode turboNode2, int i) {
        Object[] objArr = {turboNode, turboNode2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edc74510bc471464e3944ef8a2a03df1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edc74510bc471464e3944ef8a2a03df1");
            return;
        }
        ArrayList<TurboNode> arrayList = turboNode.mChildren;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            turboNode.mChildren = arrayList;
        }
        if (i > arrayList.size()) {
            throw new IndexOutOfBoundsException("[TurboTreeViewHierarchyHelperImpl@addChildAt]: index=" + i + ",size=" + arrayList.size());
        }
        arrayList.add(i, turboNode2);
        this.b.a(turboNode.mReactTag, turboNode2.mReactTag, i);
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final TurboNode a(@NonNull TurboNode turboNode, TurboNode turboNode2) {
        Object[] objArr = {turboNode, turboNode2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c047d21a806958fb6834bb910474c587", RobustBitConfig.DEFAULT_VALUE)) {
            return (TurboNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c047d21a806958fb6834bb910474c587");
        }
        if (turboNode.mChildren != null) {
            turboNode.mChildren.remove(turboNode2);
        }
        this.b.a(turboNode.mReactTag, turboNode2.mReactTag);
        return turboNode2;
    }

    @Override // com.meituan.android.mrn.component.list.turbo.j
    public final void a(@NonNull TurboNode turboNode, float f, float f2) {
        Object[] objArr = {turboNode, Float.valueOf(f), Float.valueOf(Float.NaN)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f40073ee279177e018789e17541af716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f40073ee279177e018789e17541af716");
        } else if (turboNode == null) {
            com.facebook.common.logging.a.b("lpc", "[TurboTreeViewHierarchyHelperImpl@updateLayoutSync] node null!");
        } else {
            af a2 = this.b.a(turboNode.mReactTag);
            if (a2 == null) {
                com.facebook.common.logging.a.b("lpc", "[TurboTreeViewHierarchyHelperImpl@updateLayoutSync] rsn null,tag:" + turboNode.mReactTag);
                return;
            }
            this.b.a(turboNode.mReactTag, f, Float.NaN, new com.facebook.react.uimanager.c() { // from class: com.meituan.android.mrn.component.list.turbo.k.1
                @Override // com.facebook.react.uimanager.c
                public final void a(float f3, float f4) {
                }
            });
            float layoutWidth = a2.getLayoutWidth();
            float layoutHeight = a2.getLayoutHeight();
            View a3 = a(turboNode.mReactTag);
            ViewGroup.LayoutParams layoutParams = a3.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams((int) layoutWidth, (int) layoutHeight);
            } else {
                layoutParams.width = (int) layoutWidth;
                layoutParams.height = (int) layoutHeight;
            }
            a3.setLayoutParams(layoutParams);
            this.b.a(turboNode.mReactTag, (View) null, false, 0);
        }
    }
}
