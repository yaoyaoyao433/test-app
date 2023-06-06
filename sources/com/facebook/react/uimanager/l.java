package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l {
    public final o a;
    private final m b;

    /* JADX INFO: Access modifiers changed from: protected */
    public l(o oVar, m mVar) {
        this.a = oVar;
        this.b = mVar;
    }

    public final void a(af afVar, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            d(afVar, this.b.a(readableArray.getInt(i)), i);
        }
    }

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(af afVar, af afVar2, int i) {
        a aVar;
        int nativeOffsetForChild = afVar.getNativeOffsetForChild(afVar.getChildAt(i));
        if (afVar.getNativeKind() != s.PARENT) {
            while (true) {
                if (afVar.getNativeKind() != s.PARENT) {
                    af parent = afVar.getParent();
                    if (parent == null) {
                        aVar = null;
                        break;
                    } else {
                        nativeOffsetForChild = nativeOffsetForChild + (afVar.getNativeKind() == s.LEAF ? 1 : 0) + parent.getNativeOffsetForChild(afVar);
                        afVar = parent;
                    }
                } else {
                    aVar = new a(afVar, nativeOffsetForChild);
                    break;
                }
            }
            if (aVar == null) {
                return;
            }
            af afVar3 = aVar.a;
            nativeOffsetForChild = aVar.b;
            afVar = afVar3;
        }
        if (afVar2.getNativeKind() != s.NONE) {
            b(afVar, afVar2, nativeOffsetForChild);
        } else {
            c(afVar, afVar2, nativeOffsetForChild);
        }
    }

    private void b(af afVar, af afVar2, int i) {
        afVar.addNativeChildAt(afVar2, i);
        this.a.a(afVar.getReactTag(), (int[]) null, new ay[]{new ay(afVar2.getReactTag(), i)});
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

    private static void d(af afVar, af afVar2, int i) {
        try {
            afVar.addNativeChildAt(afVar2, i);
        } catch (Throwable th) {
            com.facebook.common.logging.a.b("[MListNativeViewHierarchyOptimizer@addNativeChildNodeSync] ", "e: " + th);
        }
    }
}
