package com.sankuai.waimai.alita.core.mlmodel.predictor.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.AlitaTensor;
import com.sankuai.waimai.alita.core.mlmodel.predictor.bean.TensorConfig;
import com.sankuai.waimai.alita.core.mlmodel.predictor.d;
import com.sankuai.waimai.alita.core.mlmodel.predictor.h;
import com.sankuai.waimai.alita.core.utils.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements b {
    public static ChangeQuickRedirect a;

    public abstract void a(TensorConfig tensorConfig, @NonNull List<AlitaTensor> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable h hVar);

    @Override // com.sankuai.waimai.alita.core.mlmodel.predictor.base.b
    public final void a(@NonNull com.sankuai.waimai.alita.bundle.model.a aVar, @NonNull Map<String, List<Number>> map, @NonNull List<TensorConfig.TensorConfigItem> list, @Nullable List<TensorConfig.TensorConfigItem> list2, @Nullable h hVar) {
        List<AlitaTensor> arrayList;
        Object[] objArr = {aVar, map, list, list2, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdce03c763dc0d97d12eb31f2e3f6c52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdce03c763dc0d97d12eb31f2e3f6c52");
            return;
        }
        try {
            Object[] objArr2 = {map, list};
            ChangeQuickRedirect changeQuickRedirect2 = d.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0e707e960b154d94389a2d7257b513fc", RobustBitConfig.DEFAULT_VALUE)) {
                arrayList = (List) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0e707e960b154d94389a2d7257b513fc");
            } else {
                d.a(map);
                if (CollectionUtils.isEmpty(list)) {
                    throw new com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d("AlitaTensorParser tensorConfig input is empty");
                }
                arrayList = new ArrayList<>();
                for (TensorConfig.TensorConfigItem tensorConfigItem : list) {
                    arrayList.add(d.a(tensorConfigItem, map));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("ml_id", aVar.c);
            hashMap.put("version", aVar.e.c);
            hashMap.put("value", arrayList);
            c.b("alita_predict", (String) null, "input_feature", (Map<String, Object>) hashMap);
            a(aVar.k, arrayList, list2, hVar);
        } catch (com.sankuai.waimai.alita.core.mlmodel.predictor.exception.d e) {
            a(hVar, (Exception) e);
        }
    }

    public final void a(@Nullable h hVar, Object obj) {
        Object[] objArr = {hVar, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "169d7b1c64da6512ad7de28074c8116b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "169d7b1c64da6512ad7de28074c8116b");
        } else if (hVar != null) {
            hVar.a(obj);
        }
    }

    public final void a(@Nullable h hVar, Exception exc) {
        Object[] objArr = {hVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9648b92db6aa3e80647884dd47bbafc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9648b92db6aa3e80647884dd47bbafc");
        } else if (hVar != null) {
            hVar.a(exc);
        }
    }
}
