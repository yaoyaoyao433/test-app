package com.sankuai.waimai.rocks.page.block;

import com.meituan.android.cube.pga.type.a;
import com.meituan.android.cube.pga.viewmodel.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class e<ViewModelType extends com.meituan.android.cube.pga.viewmodel.a, ContextType extends com.meituan.android.cube.pga.type.a> extends com.meituan.android.cube.pga.block.b<ViewModelType, ContextType> {
    public static ChangeQuickRedirect h;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(RocksServerModel rocksServerModel);

        void a(String str, String str2);
    }

    public void a(String str, String str2, a aVar) {
    }

    public e(ContextType contexttype) {
        super(contexttype);
        Object[] objArr = {contexttype};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e9048c214d741200a20f76f4623dcab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e9048c214d741200a20f76f4623dcab");
        }
    }
}
