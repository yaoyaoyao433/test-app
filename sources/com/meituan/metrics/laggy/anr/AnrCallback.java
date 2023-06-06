package com.meituan.metrics.laggy.anr;

import com.meituan.metrics.laggy.ThreadStackEntity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface AnrCallback {
    void onAnrEvent(long j, String str, List<ThreadStackEntity> list, ANR_DETECT_TYPE anr_detect_type, JSONObject jSONObject);

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum ANR_DETECT_TYPE {
        FILE(0),
        VSYNC(1),
        SIGNAL(2),
        EXIT_INFO(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int value;

        public static ANR_DETECT_TYPE valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83fed2fb5762851c33ef9b31bd0cde34", RobustBitConfig.DEFAULT_VALUE) ? (ANR_DETECT_TYPE) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83fed2fb5762851c33ef9b31bd0cde34") : (ANR_DETECT_TYPE) Enum.valueOf(ANR_DETECT_TYPE.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ANR_DETECT_TYPE[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "17765ebddf4197761bb35d7c1d807d70", RobustBitConfig.DEFAULT_VALUE) ? (ANR_DETECT_TYPE[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "17765ebddf4197761bb35d7c1d807d70") : (ANR_DETECT_TYPE[]) values().clone();
        }

        ANR_DETECT_TYPE(int i) {
            Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df024b3903490068a9218ccd5f0a06dd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df024b3903490068a9218ccd5f0a06dd");
            } else {
                this.value = i;
            }
        }
    }
}
