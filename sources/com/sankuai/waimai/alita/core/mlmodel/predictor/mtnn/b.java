package com.sankuai.waimai.alita.core.mlmodel.predictor.mtnn;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.itc.android.mtnn.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.f;
import com.sankuai.waimai.alita.platform.init.c;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements f {
    public static ChangeQuickRedirect a;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a94cd70d5d67454d914c7498b23954", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a94cd70d5d67454d914c7498b23954");
        } else {
            d.a(c.a().e(), context.getApplicationContext());
        }
    }

    static {
        System.out.println(a.c);
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f
    @Nullable
    public final List<String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d246eb1b9c7f995c4d39dffd3fd28b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d246eb1b9c7f995c4d39dffd3fd28b");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("mtnn");
        return arrayList;
    }

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.f
    public final void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar, @Nullable f.a aVar2) {
        Exception bVar;
        boolean z = false;
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109cb25647ed0eb026bc36c8ea1fd12a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109cb25647ed0eb026bc36c8ea1fd12a");
            return;
        }
        boolean z2 = (aVar.e == null || !aVar.e.a() || TextUtils.isEmpty(aVar.e.j)) ? false : true;
        if (aVar.i != null && "mtnn".equals(aVar.i.getModelFileType())) {
            z = true;
        }
        String str = StringUtil.NULL;
        if (aVar.e != null) {
            str = aVar.e.j;
        }
        String str2 = StringUtil.NULL;
        if (aVar.i != null) {
            str2 = aVar.i.getModelFileType();
        }
        a aVar3 = null;
        if (z2 && z) {
            try {
                a aVar4 = new a(aVar.e.j, aVar.c, aVar.d);
                bVar = null;
                aVar3 = aVar4;
            } catch (Throwable th) {
                bVar = new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.c(str2, "predictor create failed, e = " + th.toString());
            }
        } else if (!z2) {
            bVar = new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.a(str, "model file is not valid");
        } else {
            bVar = new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.b(str2, "mtnn", "model type is not matched");
        }
        if (aVar3 != null) {
            aVar2.a(aVar3);
        } else if (bVar != null) {
            aVar2.a(bVar);
        } else {
            aVar2.a(new Exception("create tflite predictor failed, isModelFileValid = " + z2 + ", isModelTypeMatched = " + z));
        }
    }
}
