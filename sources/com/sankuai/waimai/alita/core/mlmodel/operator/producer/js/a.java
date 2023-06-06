package com.sankuai.waimai.alita.core.mlmodel.operator.producer.js;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.operator.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements f {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.alita.bundle.model.a b;

    public a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73cb0abd81fe5e2eb9f639b8151a86e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73cb0abd81fe5e2eb9f639b8151a86e");
        } else {
            this.b = aVar;
        }
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.f
    @Nullable
    public final List<String> a() {
        String[] split;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "445f5834585b1dc50153544d9513638b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "445f5834585b1dc50153544d9513638b");
        }
        ArrayList arrayList = null;
        if (this.b != null && this.b.g != null) {
            String str = this.b.g.c;
            if (!TextUtils.isEmpty(str)) {
                arrayList = new ArrayList();
                for (String str2 : str.split(CommonConstant.Symbol.COMMA)) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    @Override // com.sankuai.waimai.alita.core.mlmodel.operator.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull java.lang.Object r13, @android.support.annotation.NonNull com.sankuai.waimai.alita.core.mlmodel.operator.a r14, @android.support.annotation.Nullable final com.sankuai.waimai.alita.core.mlmodel.operator.d r15) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.alita.core.mlmodel.operator.producer.js.a.a(java.lang.Object, com.sankuai.waimai.alita.core.mlmodel.operator.a, com.sankuai.waimai.alita.core.mlmodel.operator.d):void");
    }
}
