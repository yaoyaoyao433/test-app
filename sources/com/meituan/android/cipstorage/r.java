package com.meituan.android.cipstorage;

import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class r implements q.a {
    public static ChangeQuickRedirect a;
    private final q b;

    public r(q qVar) {
        Object[] objArr = {qVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c009c10215f1f1041aba9ceba73e7bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c009c10215f1f1041aba9ceba73e7bb");
        } else {
            this.b = qVar;
        }
    }

    @Override // com.meituan.android.cipstorage.q.a
    public final q.a a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e00715c7f9efdfff8afffb3dbc64008c", RobustBitConfig.DEFAULT_VALUE)) {
            return (q.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e00715c7f9efdfff8afffb3dbc64008c");
        }
        this.b.a(str, z);
        return this;
    }

    @Override // com.meituan.android.cipstorage.q.a
    public final q.a a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d54a00acd246382301c99017aa24a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (q.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d54a00acd246382301c99017aa24a5");
        }
        this.b.a(str, i);
        return this;
    }
}
