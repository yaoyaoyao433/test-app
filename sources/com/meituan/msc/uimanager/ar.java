package com.meituan.msc.uimanager;

import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ar {
    public static ChangeQuickRedirect a;
    private final ViewGroup b;
    private int c;
    @Nullable
    private int[] d;

    public ar(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27faa4dd4fcd0d6260d2026fca62118b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27faa4dd4fcd0d6260d2026fca62118b");
            return;
        }
        this.c = 0;
        this.b = viewGroup;
    }

    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94194d5833afb1c56ba5835dbe54e63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94194d5833afb1c56ba5835dbe54e63");
            return;
        }
        if (RNViewGroupManager.c(view) != null) {
            this.c++;
        }
        this.d = null;
    }

    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6852a606c2df0b7be475f0a17ac69765", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6852a606c2df0b7be475f0a17ac69765");
            return;
        }
        if (RNViewGroupManager.c(view) != null) {
            this.c--;
        }
        this.d = null;
    }

    public final boolean a() {
        return this.c > 0;
    }

    public final int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9cdabaf70a66f40430161899227e05f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9cdabaf70a66f40430161899227e05f")).intValue();
        }
        if (this.d == null) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(this.b.getChildAt(i3));
            }
            Collections.sort(arrayList, new Comparator<View>() { // from class: com.meituan.msc.uimanager.ar.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(View view, View view2) {
                    View view3 = view;
                    View view4 = view2;
                    Object[] objArr2 = {view3, view4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c77525f850d2cb58d11f8bcb5eec9e3d", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c77525f850d2cb58d11f8bcb5eec9e3d")).intValue();
                    }
                    Integer c = RNViewGroupManager.c(view3);
                    if (c == null) {
                        c = 0;
                    }
                    Integer c2 = RNViewGroupManager.c(view4);
                    if (c2 == null) {
                        c2 = 0;
                    }
                    return c.intValue() - c2.intValue();
                }
            });
            this.d = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                this.d[i4] = this.b.indexOfChild((View) arrayList.get(i4));
            }
        }
        return this.d[i2];
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4647d5ae4d0e66fa5337eb16cdff6ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4647d5ae4d0e66fa5337eb16cdff6ce");
            return;
        }
        this.c = 0;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            if (RNViewGroupManager.c(this.b.getChildAt(i)) != null) {
                this.c++;
            }
        }
        this.d = null;
    }
}
