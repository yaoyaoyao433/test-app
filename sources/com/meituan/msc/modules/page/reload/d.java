package com.meituan.msc.modules.page.reload;

import android.text.TextUtils;
import android.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public Stack<com.meituan.msc.modules.page.reload.a> b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(com.meituan.msc.modules.page.reload.a aVar);
    }

    public static d a(String str) {
        Pair<String, Stack<com.meituan.msc.modules.page.reload.a>> pair;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d698c2a8ddb78f8b302e1cf3eea70e0e", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d698c2a8ddb78f8b302e1cf3eea70e0e");
        }
        d dVar = new d();
        if (!TextUtils.isEmpty(str) && (pair = c.a().b.get(str)) != null) {
            dVar.b = (Stack) pair.second;
        }
        return dVar;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "379e89c3e47b19b4a886a4b3cb5ad029", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "379e89c3e47b19b4a886a4b3cb5ad029")).booleanValue() : (this.b == null || this.b.isEmpty()) ? false : true;
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bca26b525f8d2a17b80a7844733727ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bca26b525f8d2a17b80a7844733727ab");
        } else if (a()) {
            aVar.a(this.b.pop());
        }
    }
}
