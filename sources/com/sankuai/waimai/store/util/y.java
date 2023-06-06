package com.sankuai.waimai.store.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodTopLabel;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class y {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a();

        void a(@NonNull GoodTopLabel goodTopLabel);

        void a(@NonNull String str);
    }

    private static boolean a(int i) {
        return i == 1 || i == 7;
    }

    public static void a(List<GoodTopLabel> list, String str, @NonNull a aVar) {
        GoodTopLabel goodTopLabel;
        Object[] objArr = {list, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0037a66b1246593afe6af4600ea75458", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0037a66b1246593afe6af4600ea75458");
            return;
        }
        if (list != null) {
            Iterator<GoodTopLabel> it = list.iterator();
            while (it.hasNext()) {
                goodTopLabel = it.next();
                if (goodTopLabel != null && a(goodTopLabel.type)) {
                    break;
                }
            }
        }
        goodTopLabel = null;
        a(goodTopLabel, str, aVar);
    }

    private static void a(GoodTopLabel goodTopLabel, String str, @NonNull a aVar) {
        boolean z = false;
        Object[] objArr = {goodTopLabel, str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e60190e88dc4d19cc8d53c0c19a1c1bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e60190e88dc4d19cc8d53c0c19a1c1bd");
            return;
        }
        if (goodTopLabel != null && a(goodTopLabel.type)) {
            z = true;
        }
        boolean z2 = !com.sankuai.shangou.stone.util.t.a(str);
        if (!z && !z2) {
            aVar.a();
        } else if (z) {
            aVar.a(goodTopLabel);
        } else {
            aVar.a(str);
        }
    }
}
