package com.sankuai.meituan.navigation.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v4.util.SparseArrayCompat;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c {
    public static ChangeQuickRedirect a;
    public final Navigator b;
    public d c;
    public int d;
    private CharSequence e;
    private Bundle f;
    private ArrayList<b> g;
    private SparseArrayCompat<a> h;

    @NonNull
    public static String a(@NonNull Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04aefd7c2f5c09359ae1073a5ee7f3e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04aefd7c2f5c09359ae1073a5ee7f3e4");
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public c(@NonNull Navigator<? extends c> navigator) {
        Object[] objArr = {navigator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbccbc42d43e0585eedc2c27921af8ad", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbccbc42d43e0585eedc2c27921af8ad");
        } else {
            this.b = navigator;
        }
    }

    @CallSuper
    public void a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da47da31876ac07ba19316313060e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da47da31876ac07ba19316313060e18");
            return;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, new int[]{16842753, 16842960});
        this.d = obtainAttributes.getResourceId(1, 0);
        this.e = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    @Nullable
    public final CharSequence a() {
        return this.e;
    }

    @NonNull
    private Bundle c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20eb6cabca11f3b774c9653ee742a220", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20eb6cabca11f3b774c9653ee742a220");
        }
        if (this.f == null) {
            this.f = new Bundle();
        }
        return this.f;
    }

    @Nullable
    public Pair<c, Bundle> a(@NonNull Uri uri) {
        Bundle bundle;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52a163b893021c79942b9f2e6e2e9ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (Pair) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52a163b893021c79942b9f2e6e2e9ac");
        }
        if (this.g == null) {
            return null;
        }
        Iterator<b> it = this.g.iterator();
        while (it.hasNext()) {
            b next = it.next();
            Object[] objArr2 = {uri};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect2, false, "facd50a22448f17ec57f9e164e6d1d92", RobustBitConfig.DEFAULT_VALUE)) {
                bundle = (Bundle) PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, "facd50a22448f17ec57f9e164e6d1d92");
                continue;
            } else {
                Matcher matcher = next.c.matcher(uri.toString());
                if (matcher.matches()) {
                    Bundle bundle2 = new Bundle();
                    int size = next.b.size();
                    int i = 0;
                    while (i < size) {
                        i++;
                        bundle2.putString(next.b.get(i), Uri.decode(matcher.group(i)));
                    }
                    bundle = bundle2;
                    continue;
                } else {
                    bundle = null;
                    continue;
                }
            }
            if (bundle != null) {
                return Pair.create(this, bundle);
            }
        }
        return null;
    }

    @NonNull
    public final int[] b() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "125e567c531e9a6bdd4bb12c73ce2a5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "125e567c531e9a6bdd4bb12c73ce2a5f");
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        d dVar = this;
        while (true) {
            d dVar2 = dVar.c;
            if (dVar2 == null || dVar2.g != dVar.d) {
                arrayDeque.addFirst(dVar);
            }
            if (dVar2 == null) {
                break;
            }
            dVar = dVar2;
        }
        int[] iArr = new int[arrayDeque.size()];
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((c) it.next()).d;
            i++;
        }
        return iArr;
    }

    @Nullable
    public final a a(@IdRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "945683476a503d4da4677d741d033a64", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "945683476a503d4da4677d741d033a64");
        }
        a aVar = this.h == null ? null : this.h.get(i);
        if (aVar != null) {
            return aVar;
        }
        if (this.c != null) {
            return this.c.a(i);
        }
        return null;
    }

    public final void a(@Nullable Bundle bundle, @Nullable f fVar) {
        Object[] objArr = {bundle, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "563c849ff0d4032c7e238c0be91c6dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "563c849ff0d4032c7e238c0be91c6dd1");
            return;
        }
        Bundle c = c();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(c);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        this.b.a(this, bundle2, fVar);
    }
}
