package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ResponseWithInnerData<T> {
    public static final String INSTANCE_ID = "instanceId";
    public static final String TASK_ID = "taskId";
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map innerData;
    public T response;

    public ResponseWithInnerData(T t, Map map) {
        Object[] objArr = {t, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6167ab834447b63c001947ab2df232e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6167ab834447b63c001947ab2df232e");
            return;
        }
        this.response = t;
        this.innerData = map;
    }

    public ResponseWithInnerData() {
    }

    public ResponseWithInnerData addInnerData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e988264f9012c7eba99b1e5af198394f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ResponseWithInnerData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e988264f9012c7eba99b1e5af198394f");
        }
        if (this.innerData == null) {
            this.innerData = new HashMap();
        }
        this.innerData.put(str, str2);
        return this;
    }
}
