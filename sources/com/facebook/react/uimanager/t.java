package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class t {
    final UIViewOperationQueue a;
    final SparseBooleanArray b = new SparseBooleanArray();
    private final al c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public final af a;
        public final int b;

        a(af afVar, int i) {
            this.a = afVar;
            this.b = i;
        }
    }

    public t(UIViewOperationQueue uIViewOperationQueue, al alVar) {
        this.a = uIViewOperationQueue;
        this.c = alVar;
    }

    public static void a(af afVar) {
        afVar.removeAllNativeChildren();
    }

    public final void a(af afVar, int[] iArr, int[] iArr2, ay[] ayVarArr, int[] iArr3) {
        boolean z;
        for (int i : iArr2) {
            int i2 = 0;
            while (true) {
                if (i2 >= iArr3.length) {
                    z = false;
                    break;
                } else if (iArr3[i2] == i) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            a(this.c.e(i), z);
        }
        for (ay ayVar : ayVarArr) {
            a(afVar, this.c.e(ayVar.b), ayVar.c);
        }
    }

    public final void a(af afVar, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            a(afVar, this.c.e(readableArray.getInt(i)), i);
        }
    }

    public final void b(af afVar) {
        if (afVar.isLayoutOnly()) {
            a(afVar, (ag) null);
        }
    }

    private static a a(af afVar, int i) {
        while (afVar.getNativeKind() != s.PARENT) {
            af parent = afVar.getParent();
            if (parent == null) {
                return null;
            }
            i = i + (afVar.getNativeKind() == s.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(afVar);
            afVar = parent;
        }
        return new a(afVar, i);
    }

    private void a(af afVar, af afVar2, int i) {
        int nativeOffsetForChild = afVar.getNativeOffsetForChild(afVar.getChildAt(i));
        if (afVar.getNativeKind() != s.PARENT) {
            a a2 = a(afVar, nativeOffsetForChild);
            if (a2 == null) {
                return;
            }
            af afVar3 = a2.a;
            nativeOffsetForChild = a2.b;
            afVar = afVar3;
        }
        if (afVar2.getNativeKind() != s.NONE) {
            b(afVar, afVar2, nativeOffsetForChild);
        } else {
            c(afVar, afVar2, nativeOffsetForChild);
        }
    }

    private void a(af afVar, boolean z) {
        if (afVar.getNativeKind() != s.PARENT) {
            for (int childCount = afVar.getChildCount() - 1; childCount >= 0; childCount--) {
                a(afVar.getChildAt(childCount), z);
            }
        }
        af nativeParent = afVar.getNativeParent();
        if (nativeParent != null) {
            int indexOfNativeChild = nativeParent.indexOfNativeChild(afVar);
            nativeParent.removeNativeChildAt(indexOfNativeChild);
            this.a.a(nativeParent.getReactTag(), new int[]{indexOfNativeChild}, (ay[]) null, z ? new int[]{afVar.getReactTag()} : null);
        }
    }

    private void b(af afVar, af afVar2, int i) {
        afVar.addNativeChildAt(afVar2, i);
        this.a.a(afVar.getReactTag(), (int[]) null, new ay[]{new ay(afVar2.getReactTag(), i)}, (int[]) null);
        if (afVar2.getNativeKind() != s.PARENT) {
            c(afVar, afVar2, i + 1);
        }
    }

    private void c(af afVar, af afVar2, int i) {
        com.facebook.infer.annotation.a.a(afVar2.getNativeKind() != s.PARENT);
        int i2 = i;
        for (int i3 = 0; i3 < afVar2.getChildCount(); i3++) {
            af childAt = afVar2.getChildAt(i3);
            com.facebook.infer.annotation.a.a(childAt.getNativeParent() == null);
            int nativeChildCount = afVar.getNativeChildCount();
            if (childAt.getNativeKind() != s.NONE) {
                b(afVar, childAt, i2);
            } else {
                c(afVar, childAt, i2);
            }
            i2 += afVar.getNativeChildCount() - nativeChildCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(af afVar) {
        int reactTag = afVar.getReactTag();
        if (this.b.get(reactTag)) {
            return;
        }
        this.b.put(reactTag, true);
        int screenX = afVar.getScreenX();
        int screenY = afVar.getScreenY();
        for (af parent = afVar.getParent(); parent != null && parent.getNativeKind() != s.PARENT; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        a(afVar, screenX, screenY);
    }

    private void a(af afVar, int i, int i2) {
        if (afVar.getNativeKind() != s.NONE && afVar.getNativeParent() != null) {
            this.a.a(afVar.getRootTag(), afVar.getLayoutParent().getReactTag(), afVar.getReactTag(), i, i2, afVar.getScreenWidth(), afVar.getScreenHeight());
            return;
        }
        for (int i3 = 0; i3 < afVar.getChildCount(); i3++) {
            af childAt = afVar.getChildAt(i3);
            int reactTag = childAt.getReactTag();
            if (!this.b.get(reactTag)) {
                this.b.put(reactTag, true);
                a(childAt, childAt.getScreenX() + i, childAt.getScreenY() + i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(af afVar, @Nullable ag agVar) {
        af parent = afVar.getParent();
        if (parent == null) {
            afVar.setIsLayoutOnly(false);
            return;
        }
        int indexOf = parent.indexOf(afVar);
        parent.removeChildAt(indexOf);
        a(afVar, false);
        afVar.setIsLayoutOnly(false);
        this.a.a(afVar.getThemedContext(), afVar.getReactTag(), afVar.getViewClass(), agVar);
        parent.addChildAt(afVar, indexOf);
        a(parent, afVar, indexOf);
        for (int i = 0; i < afVar.getChildCount(); i++) {
            a(afVar, afVar.getChildAt(i), i);
        }
        if (com.facebook.react.config.a.h) {
            StringBuilder sb = new StringBuilder("Transitioning LayoutOnlyView - tag: ");
            sb.append(afVar.getReactTag());
            sb.append(" - rootTag: ");
            sb.append(afVar.getRootTag());
            sb.append(" - hasProps: ");
            sb.append(agVar != null);
            sb.append(" - tagsWithLayout.size: ");
            sb.append(this.b.size());
            com.facebook.common.logging.a.b("NativeViewHierarchyOptimizer", sb.toString());
        }
        com.facebook.infer.annotation.a.a(this.b.size() == 0);
        c(afVar);
        for (int i2 = 0; i2 < afVar.getChildCount(); i2++) {
            c(afVar.getChildAt(i2));
        }
        this.b.clear();
    }

    public static boolean a(@Nullable ag agVar) {
        if (agVar == null) {
            return true;
        }
        if (!agVar.a("collapsable") || agVar.a("collapsable", true)) {
            ReadableMapKeySetIterator keySetIterator = agVar.a.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                if (!bf.a(agVar.a, keySetIterator.nextKey())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
