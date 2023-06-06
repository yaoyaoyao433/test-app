package com.meituan.android.picassohelper;

import com.meituan.dio.easy.DioFile;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Closeable;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.squareup.picasso.load.data.a<InputStream> {
    public static ChangeQuickRedirect a;
    protected DioFile b;
    protected InputStream c;

    @Override // com.squareup.picasso.load.data.a
    public final void cancel() {
    }

    @Override // com.squareup.picasso.load.data.a
    public final /* synthetic */ InputStream c() throws Exception {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83184951ba17ceed82306178556004ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83184951ba17ceed82306178556004ab");
        }
        this.c = this.b.b();
        return this.c;
    }

    public a(DioFile dioFile) {
        Object[] objArr = {dioFile};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "476556fa446e4962d9ad97b9be38489e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "476556fa446e4962d9ad97b9be38489e");
        } else {
            this.b = dioFile;
        }
    }

    @Override // com.squareup.picasso.load.data.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e023a27dfa89b167d33327535c2c0d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e023a27dfa89b167d33327535c2c0d6");
            return;
        }
        if (this.c != null) {
            com.meituan.dio.utils.c.a((Closeable) this.c);
        }
        this.b = null;
    }

    @Override // com.squareup.picasso.load.data.a
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0effc228b04b1de14c5a31bbc81371a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0effc228b04b1de14c5a31bbc81371a0");
        }
        if (this.b != null) {
            return this.b.g();
        }
        return null;
    }
}
