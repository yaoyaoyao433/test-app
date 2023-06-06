package com.meituan.android.cube.pga.core;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.meituan.android.cube.pga.common.h;
import com.meituan.android.cube.pga.common.j;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a extends com.meituan.android.cube.core.b implements com.meituan.android.cube.pga.type.a {
    public static ChangeQuickRedirect f;
    @NonNull
    public com.meituan.android.cube.pga.block.a g;
    public j<Bundle> h;
    public j<Boolean> i;
    public j<Boolean> j;
    public j<Boolean> k;
    public j<Boolean> l;
    public h m;
    public com.meituan.android.cube.pga.common.b<Intent> n;
    public com.meituan.android.cube.pga.common.b<b.a> o;
    com.meituan.android.cube.pga.common.b<Bundle> p;
    com.meituan.android.cube.pga.common.b<Bundle> q;
    public Fragment r;

    public a(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "652ec2aa4b43479e8e9e772f47c5327e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "652ec2aa4b43479e8e9e772f47c5327e");
            return;
        }
        this.h = new j<>(null);
        this.i = new j<>(Boolean.FALSE);
        this.j = new j<>(Boolean.FALSE);
        this.k = new j<>(Boolean.FALSE);
        this.l = new j<>(Boolean.FALSE);
        this.m = new h();
        this.n = new com.meituan.android.cube.pga.common.b<>();
        this.o = new com.meituan.android.cube.pga.common.b<>();
        this.p = new com.meituan.android.cube.pga.common.b<>();
        this.q = new com.meituan.android.cube.pga.common.b<>();
    }

    @Override // com.meituan.android.cube.core.b, com.meituan.android.cube.pga.type.a
    @NonNull
    public final Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c253407a0c5a4097db611f078f2e1e", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c253407a0c5a4097db611f078f2e1e") : super.a();
    }

    @Override // com.meituan.android.cube.core.b, com.meituan.android.cube.pga.type.a
    public final FragmentActivity b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13036cdf535846efcec08adac9d400f9", RobustBitConfig.DEFAULT_VALUE) ? (FragmentActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13036cdf535846efcec08adac9d400f9") : super.b();
    }

    @Override // com.meituan.android.cube.pga.type.b
    public final j<Boolean> c() {
        return this.j;
    }

    @Override // com.meituan.android.cube.pga.type.b
    public final j<Boolean> d() {
        return this.k;
    }

    @Override // com.meituan.android.cube.pga.type.b
    public final j<Boolean> e() {
        return this.l;
    }

    @Override // com.meituan.android.cube.pga.type.b
    public final h f() {
        return this.m;
    }

    @Override // com.meituan.android.cube.pga.type.b
    public final com.meituan.android.cube.pga.common.b<b.a> g() {
        return this.o;
    }

    @Override // com.meituan.android.cube.pga.type.a
    public final Fragment h() {
        return this.r;
    }
}
