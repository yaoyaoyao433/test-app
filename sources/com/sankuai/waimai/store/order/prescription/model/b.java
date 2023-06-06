package com.sankuai.waimai.store.order.prescription.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b implements Serializable {
    private static final long serialVersionUID = -8657429595140410531L;
    @SerializedName("bottom_module_info")
    public a a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 8710167429353119782L;
        @SerializedName("scheme_tips")
        public List<C1254b> a;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.order.prescription.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1254b implements Serializable {
        private static final long serialVersionUID = -5491199303215046430L;
        @SerializedName("tip")
        public String a;
        @SerializedName("scheme_list")
        public List<String> b;
    }
}
