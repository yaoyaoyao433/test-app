package com.meituan.android.legwork.bean.monitor;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class DaBaiMetric implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, List<Integer>> kvs;
    public Map<String, Object> tags;
    public int ts;

    public DaBaiMetric() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "297cf1f2baf0ddf8eb26ea334768075f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "297cf1f2baf0ddf8eb26ea334768075f");
            return;
        }
        this.kvs = new HashMap();
        this.tags = new HashMap();
    }

    public void addKV(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd69cc2cb5ef0bf04cfeaf7572beac07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd69cc2cb5ef0bf04cfeaf7572beac07");
        } else if (this.kvs.containsKey(str)) {
            this.kvs.get(str).add(Integer.valueOf(i));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(i));
            this.kvs.put(str, arrayList);
        }
    }
}
