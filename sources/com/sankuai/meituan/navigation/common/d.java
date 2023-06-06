package com.sankuai.meituan.navigation.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.Pair;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends c implements Iterable<c> {
    public static ChangeQuickRedirect e;
    public final SparseArrayCompat<c> f;
    public int g;

    public d(@NonNull Navigator<? extends d> navigator) {
        super(navigator);
        Object[] objArr = {navigator};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ca168f3954e9c96e416aa5bebdd7d3e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ca168f3954e9c96e416aa5bebdd7d3e");
        } else {
            this.f = new SparseArrayCompat<>();
        }
    }

    @Override // com.sankuai.meituan.navigation.common.c
    public final void a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a27461b56ed5f161b90e8e1c1ff5a10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a27461b56ed5f161b90e8e1c1ff5a10");
            return;
        }
        super.a(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{R.attr.startDestination});
        this.g = obtainAttributes.getResourceId(0, 0);
        obtainAttributes.recycle();
    }

    @Override // com.sankuai.meituan.navigation.common.c
    @Nullable
    public final Pair<c, Bundle> a(@NonNull Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbd8ac14376a5877d898275733d2a7f", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbd8ac14376a5877d898275733d2a7f");
        }
        Pair<c, Bundle> a = super.a(uri);
        if (a != null) {
            return a;
        }
        Iterator<c> it = iterator();
        while (it.hasNext()) {
            Pair<c, Bundle> a2 = it.next().a(uri);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final c b(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab0ba6ef433d6f70b798d992fe15fae2", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab0ba6ef433d6f70b798d992fe15fae2") : a(i, true);
    }

    public final c a(@IdRes int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ec66373230289471e340ac738dcba72", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ec66373230289471e340ac738dcba72");
        }
        c cVar = this.f.get(i);
        if (cVar != null) {
            return cVar;
        }
        if (!z || this.c == null) {
            return null;
        }
        return this.c.b(i);
    }

    @Override // java.lang.Iterable
    @NonNull
    public final Iterator<c> iterator() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b22635d3cb7514bcc7c22b575f3e88e", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b22635d3cb7514bcc7c22b575f3e88e") : new Iterator<c>() { // from class: com.sankuai.meituan.navigation.common.d.1
            public static ChangeQuickRedirect a;
            private int c = -1;
            private boolean d = false;

            @Override // java.util.Iterator
            public final /* synthetic */ c next() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02bac2d42e34895b1eb67cb309f09c1e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02bac2d42e34895b1eb67cb309f09c1e");
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.d = true;
                SparseArrayCompat<c> sparseArrayCompat = d.this.f;
                int i = this.c + 1;
                this.c = i;
                return sparseArrayCompat.valueAt(i);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1004225e84a1c450811fa7febac89beb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1004225e84a1c450811fa7febac89beb")).booleanValue() : this.c + 1 < d.this.f.size();
            }

            @Override // java.util.Iterator
            public final void remove() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9fca6980695dbf012c3ac9b870fc435", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9fca6980695dbf012c3ac9b870fc435");
                } else if (!this.d) {
                    throw new IllegalStateException("You must call next() before you can remove an element");
                } else {
                    d.this.f.valueAt(this.c).c = null;
                    d.this.f.removeAt(this.c);
                    this.c--;
                    this.d = false;
                }
            }
        };
    }
}
