package com.meituan.android.cube.pga.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b extends a<RecyclerView> {
    public static ChangeQuickRedirect d;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d70ec8f9d4c650fe4d96be7fda1ec9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d70ec8f9d4c650fe4d96be7fda1ec9");
        }
    }

    public b(Context context, @Nullable ViewStub viewStub) {
        super(context, viewStub);
        Object[] objArr = {context, viewStub};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a9cd8d72ba01a34476ffb7a19bef73", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a9cd8d72ba01a34476ffb7a19bef73");
        }
    }

    @Override // com.meituan.android.cube.pga.view.a
    @Nullable
    /* renamed from: e */
    public RecyclerView c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a28c4df76478bec067c3c9539b4342bd", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a28c4df76478bec067c3c9539b4342bd") : new RecyclerView(this.c);
    }
}
