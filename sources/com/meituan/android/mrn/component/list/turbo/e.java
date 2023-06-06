package com.meituan.android.mrn.component.list.turbo;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.meituan.android.mrn.component.list.item.MListExpressionManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static TurboNode a(b bVar, ReadableMap readableMap, TurboNode turboNode) {
        ReadableMap readableMap2;
        int i;
        Object[] objArr = {bVar, readableMap, turboNode};
        ChangeQuickRedirect changeQuickRedirect = a;
        TurboNode turboNode2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7cf5e842e96f1b98f028811877e1e27a", RobustBitConfig.DEFAULT_VALUE)) {
            return (TurboNode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7cf5e842e96f1b98f028811877e1e27a");
        }
        int a2 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "reactTag", -1);
        int a3 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "rootTag", -1);
        int a4 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "parentTag", -1);
        int a5 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "tagId", -1);
        String a6 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "className", "");
        ReadableArray a7 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "children", (ReadableArray) null);
        ReadableMap a8 = com.meituan.android.mrn.component.list.common.a.a(readableMap, "props", (ReadableMap) null);
        if (g.a(a8)) {
            readableMap2 = a8;
            a8 = null;
        } else {
            readableMap2 = null;
        }
        TurboNode turboNode3 = new TurboNode();
        turboNode3.mModuleName = a6;
        turboNode3.mReactTag = a2;
        turboNode3.mRootTag = a3;
        turboNode3.mParentTag = a4;
        turboNode3.mEventId = a5;
        turboNode3.mProps = a8;
        turboNode3.rawProps = readableMap2;
        turboNode3.mParentNode = turboNode;
        if (turboNode == null) {
            turboNode3.mTemplateId = bVar.a();
            Object[] objArr2 = {turboNode3};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            i = 1;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "77011e112d43788fec3ab2622a6f6dbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "77011e112d43788fec3ab2622a6f6dbe");
            } else {
                bVar.b.put(turboNode3.mTemplateId, turboNode3);
            }
        } else {
            i = 1;
        }
        if (a7 == null) {
            return turboNode3;
        }
        if (!(MListExpressionManager.COMPONENT_NAME.equals(turboNode3.mModuleName) && turboNode3.rawProps.hasKey("lfor"))) {
            turboNode2 = turboNode3;
        } else if (a7.size() != i) {
            throw new RuntimeException("For节点下必须只有一个子节点");
        } else {
            bVar.a(0);
            turboNode3.mTemplateId = bVar.a();
            bVar.b();
        }
        for (int i2 = 0; i2 < a7.size(); i2++) {
            bVar.a(i2);
            TurboNode a9 = a(bVar, a7.getMap(i2), turboNode2);
            bVar.b();
            a9.mParentNode = turboNode2;
            if (turboNode2 != null) {
                a9.mParentTag = turboNode2.mReactTag;
                turboNode2.mChildren.add(a9);
            }
        }
        return turboNode3;
    }
}
