package com.sankuai.waimai.store.goods.list.viewblocks.newuser;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface d {

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        SCBaseActivity a();

        void a(int i);

        void a(int i, @Nullable String str, @Nullable WMLocation wMLocation, String str2, WMLocation wMLocation2);

        void a(SGNewUserLandResponse.HotSaleProductTabs hotSaleProductTabs, int i);

        void a(@NotNull SGNewUserLandResponse sGNewUserLandResponse);

        void a(@NotNull SGNewUserLandResponse sGNewUserLandResponse, @Nullable SGNewUserLandResponse.SideBarEntry sideBarEntry);

        void a(String str);

        void a(@Nullable String str, @Nullable WMLocation wMLocation);

        void a(List<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b> list, int i);

        void a(List<com.sankuai.waimai.store.goods.list.viewblocks.newuser.b> list, int i, int i2);

        SGNewUserLandAdapter b();

        void b(int i);

        void b(@NotNull SGNewUserLandResponse sGNewUserLandResponse);

        void c(int i);

        void d();

        void e();

        void j();

        Map<String, Object> k();

        String l();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static abstract class a {
        public static ChangeQuickRedirect a;
        protected b b;

        public a(b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08a4e151145f51d52c8dc2265659809a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08a4e151145f51d52c8dc2265659809a");
            } else {
                this.b = bVar;
            }
        }
    }
}
