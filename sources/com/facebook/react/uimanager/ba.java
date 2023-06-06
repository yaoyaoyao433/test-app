package com.facebook.react.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ba {
    private final ViewGroup a;
    private int b = 0;
    @Nullable
    private int[] c;

    public ba(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.b++;
        }
        this.c = null;
    }

    public final void b(View view) {
        if (ViewGroupManager.getViewZIndex(view) != null) {
            this.b--;
        }
        this.c = null;
    }

    public final boolean a() {
        return this.b > 0;
    }

    public final int a(int i, int i2) {
        if (this.c == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.a.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() { // from class: com.facebook.react.uimanager.ba.1
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(View view, View view2) {
                    View view3 = view2;
                    Integer viewZIndex = ViewGroupManager.getViewZIndex(view);
                    if (viewZIndex == null) {
                        viewZIndex = 0;
                    }
                    Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view3);
                    if (viewZIndex2 == null) {
                        viewZIndex2 = 0;
                    }
                    return viewZIndex.intValue() - viewZIndex2.intValue();
                }
            });
            this.c = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.c[i4] = this.a.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.c[i2];
    }

    public final void b() {
        this.b = 0;
        for (int i = 0; i < this.a.getChildCount(); i++) {
            if (ViewGroupManager.getViewZIndex(this.a.getChildAt(i)) != null) {
                this.b++;
            }
        }
        this.c = null;
    }
}
