package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d implements com.swmansion.gesturehandler.c {
    SparseArray<int[]> a = new SparseArray<>();
    SparseArray<int[]> b = new SparseArray<>();

    public final void a(int i) {
        this.a.remove(i);
        this.b.remove(i);
    }

    private static int[] a(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int[] iArr = new int[array.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    @Override // com.swmansion.gesturehandler.c
    public final boolean a(com.swmansion.gesturehandler.b bVar, com.swmansion.gesturehandler.b bVar2) {
        int[] iArr = this.a.get(bVar.e);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.e) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.swmansion.gesturehandler.c
    public final boolean b(com.swmansion.gesturehandler.b bVar, com.swmansion.gesturehandler.b bVar2) {
        int[] iArr = this.b.get(bVar.e);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == bVar2.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(com.swmansion.gesturehandler.b bVar, ReadableMap readableMap) {
        bVar.q = this;
        if (readableMap.hasKey("waitFor")) {
            this.a.put(bVar.e, a(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.b.put(bVar.e, a(readableMap, "simultaneousHandlers"));
        }
    }
}
