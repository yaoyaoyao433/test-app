package com.sankuai.waimai.store.goods.detail.components.subroot.imagepager;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.domain.core.goods.e;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i, C1178b c1178b);

        void a(long j);

        void a(View view, e eVar, int i, boolean z);

        void a(e eVar, int i);

        void a(boolean z);

        void a(boolean z, boolean z2);
    }

    View a(ViewGroup viewGroup, e eVar, int i);

    void a(View view, e eVar, int i, @NonNull a aVar, GoodDetailResponse.PoiExtendAttr poiExtendAttr, c cVar);

    void a(boolean z);

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C1178b {
        public static ChangeQuickRedirect a;
        int b;
        int c;

        public C1178b(int i, int i2) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a230a18004abc5c36b6aade9230931", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a230a18004abc5c36b6aade9230931");
                return;
            }
            this.b = -1;
            this.c = -1;
            this.b = i;
            this.c = i2;
        }
    }
}
