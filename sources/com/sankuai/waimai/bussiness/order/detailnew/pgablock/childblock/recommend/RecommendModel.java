package com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cube.pga.action.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RecommendModel {
    public static ChangeQuickRedirect a;
    a b;
    public boolean c;
    com.sankuai.waimai.bussiness.order.detailnew.a d;
    public k e;
    public final com.sankuai.waimai.bussiness.order.detailnew.pgablock.recommend.a f;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RecommendResponse implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("default_id")
        public String defaultId;
        @SerializedName("native_data")
        public String jsonData;
        @SerializedName("native_id")
        public String nativeId;
        @SerializedName("string_data")
        public String stringData;
        @SerializedName("template_id")
        public String templateId;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public String a;
        public com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.a b;
        public RecommendResponse c;
    }

    public RecommendModel(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c7af1361cc0c21abb983e66fc542d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c7af1361cc0c21abb983e66fc542d0");
            return;
        }
        this.d = aVar;
        this.d.ay.b = new d<a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dc736edc93248d76f4c9d3e20caeb80", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dc736edc93248d76f4c9d3e20caeb80") : RecommendModel.this.b;
            }
        };
        this.d.aj.b = new d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "16a94738c252d6faf725cd32a99a71e2", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "16a94738c252d6faf725cd32a99a71e2") : Boolean.valueOf(RecommendModel.this.c);
            }
        };
        this.f = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.recommend.a();
    }
}
