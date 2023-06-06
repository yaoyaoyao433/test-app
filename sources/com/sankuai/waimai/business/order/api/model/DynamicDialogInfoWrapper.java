package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DynamicDialogInfoWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String code;
    public String native_id;
    @Keep
    public List<PosDatasBean> pos_datas;
    public String template_code;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class PosDatasBean {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String pos_code;
        @Keep
        public Object pos_data;
    }
}
