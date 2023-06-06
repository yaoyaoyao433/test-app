package com.sankuai.waimai.store.goods.list.viewblocks.pagenotfound;

import android.net.Uri;
import com.dianping.judas.util.a;
import com.meituan.msc.lib.interfaces.PageNotFoundCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.goods.list.viewblocks.o;
import com.sankuai.waimai.store.util.monitor.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class PageNotFoundManager implements PageNotFoundCallback {
    public static ChangeQuickRedirect a;
    private static final Map<String, WeakReference<o>> b = new HashMap();

    public static void a(String str, WeakReference<o> weakReference) {
        Object[] objArr = {str, weakReference};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88fd8b069a31a935534d5720a9615d4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88fd8b069a31a935534d5720a9615d4a");
        } else if (t.a(str)) {
        } else {
            b.put(str, weakReference);
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9ba21950d516d67dc38c28f77da2f47e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9ba21950d516d67dc38c28f77da2f47e");
        } else if (t.a(str)) {
        } else {
            b.remove(str);
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3ddac0ce420ebb6bfe34a7aee85c53c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3ddac0ce420ebb6bfe34a7aee85c53c");
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("targetPath");
        return parse.getQueryParameter("appId") + CommonConstant.Symbol.UNDERLINE + queryParameter;
    }

    @Override // com.meituan.msc.lib.interfaces.PageNotFoundCallback
    public final boolean a(String str, String str2, boolean z, boolean z2) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "814355b8d54f8004e058dc90fd8b3a3c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "814355b8d54f8004e058dc90fd8b3a3c")).booleanValue();
        }
        String str3 = str + CommonConstant.Symbol.UNDERLINE + str2;
        WeakReference<o> remove = b.remove(str3);
        if (remove != null && remove.get() != null) {
            try {
                b.a().a(CommentWidgetFailed.Fail).a(false).b(str3).a();
                return remove.get().a(str3, z, z2);
            } catch (Exception e) {
                a.a(e);
            }
        }
        return false;
    }
}
