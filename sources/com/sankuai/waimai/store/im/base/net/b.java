package com.sankuai.waimai.store.im.base.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.e;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.im.group.model.JoinGroupInfo;
import com.sankuai.waimai.store.im.group.model.SGGroupBriefInfo;
import com.sankuai.waimai.store.im.group.model.UserGroupImInfo;
import com.sankuai.waimai.store.im.poi.model.IMServiceEvaluationInfo;
import com.sankuai.waimai.store.im.poi.model.ImRecommendScriptInfo;
import com.sankuai.waimai.store.im.poi.model.QuickButtonInfo;
import com.sankuai.waimai.store.im.poi.model.SGModifyAddressAllowed;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends com.sankuai.waimai.store.base.net.d<SGIMApiService> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37e853d514acac86ac2eceb05cf4f2c3", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37e853d514acac86ac2eceb05cf4f2c3") : new e();
    }

    public static b a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b299c6b2f7df2f9c1ae8587251af6d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b299c6b2f7df2f9c1ae8587251af6d4");
        }
        b bVar = (b) com.sankuai.waimai.store.base.net.c.a(obj, b.class);
        if (bVar == null) {
            b bVar2 = new b();
            com.sankuai.waimai.store.base.net.c.a(obj, bVar2);
            return bVar2;
        }
        return bVar;
    }

    public final void a(long j, long j2, j<UserGroupImInfo> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33342a50e02b623af1fcbae20f9e2609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33342a50e02b623af1fcbae20f9e2609");
        } else {
            a(jVar, ((SGIMApiService) this.d).getUserGroupImInfo(j, j2));
        }
    }

    public final void a(int i, String str, long j, long j2, String str2, String str3, j<Object> jVar) {
        Object[] objArr = {12, str, new Long(j), new Long(j2), str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97dd53c943b15d50e65f8c9a57c32ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97dd53c943b15d50e65f8c9a57c32ce");
        } else {
            a(jVar, ((SGIMApiService) this.d).receiveGroupCoupon(12, str, j, j2, str2, str3));
        }
    }

    public final void a(long j, String str, j<JoinGroupInfo> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2e4c0eda56ca20730f9b3d9bdcd6ddd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2e4c0eda56ca20730f9b3d9bdcd6ddd");
        } else {
            a(jVar, ((SGIMApiService) this.d).joinUserGroupIM(j, str));
        }
    }

    public final void a(String str, long j, j<SGGroupBriefInfo> jVar) {
        Object[] objArr = {str, new Long(j), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cf5dea40256d1dd472b052fbe041af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cf5dea40256d1dd472b052fbe041af");
        } else {
            a(jVar, ((SGIMApiService) this.d).getSGGroupBriefInfo(str, j));
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, j<ImRecommendScriptInfo> jVar) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f10c08b598b9ec2056f3e8d742af690d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f10c08b598b9ec2056f3e8d742af690d");
        } else {
            a(jVar, ((SGIMApiService) this.d).getRecStatement(str, str2, str3, str4, str5, str6, str7));
        }
    }

    public final void a(String str, String str2, String str3, int i, j<SGModifyAddressAllowed> jVar) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d2bffc4d9c7e5f7cecf56e1c2d420d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d2bffc4d9c7e5f7cecf56e1c2d420d");
        } else {
            a(jVar, ((SGIMApiService) this.d).modifyAddressAllowed(str, str2, str3, i));
        }
    }

    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965f6d8d0005dcc54505464acefcf928", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965f6d8d0005dcc54505464acefcf928");
        } else {
            a(null, ((SGIMApiService) this.d).pushMessageToB(str, str2, str3));
        }
    }

    public final void a(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e11f09da67e179ae93dccad7dfd684b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e11f09da67e179ae93dccad7dfd684b");
        } else {
            a(null, ((SGIMApiService) this.d).uploadShopCartProduct(str, str2, str3, str4));
        }
    }

    public final void a(long j, String str, long j2, long j3, long j4, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), new Long(j4), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e9d97de2d87607a8272448a5e2163d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e9d97de2d87607a8272448a5e2163d58");
        } else {
            a(jVar, ((SGIMApiService) this.d).receiveSGIMCoupon(j, str, j2, j3, j4));
        }
    }

    public final void b(long j, String str, j<IMServiceEvaluationInfo> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c12141ddcc72ed0eae888f1103f2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c12141ddcc72ed0eae888f1103f2ea");
        } else {
            a(jVar, ((SGIMApiService) this.d).scIsSendMsg(j, str));
        }
    }

    public final void a(long j, String str, long j2, int i, j<Object> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a947e5a6ba6702db2a624a89faef17f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a947e5a6ba6702db2a624a89faef17f4");
        } else {
            a(jVar, ((SGIMApiService) this.d).praiseRobot(j, str, j2, i));
        }
    }

    public final void a(long j, String str, int i, j<QuickButtonInfo> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f895d7d3c4237f7de8233ddb315931", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f895d7d3c4237f7de8233ddb315931");
        } else {
            a(jVar, ((SGIMApiService) this.d).qucikButtonClick(j, str, i));
        }
    }

    public final void a(long j, long j2, long j3, int i, j<Object> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d510c2fb838118f73c43c8bc3161cf38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d510c2fb838118f73c43c8bc3161cf38");
        } else {
            a(jVar, ((SGIMApiService) this.d).qucikGroupButtonClick(j, j2, j3, i));
        }
    }
}
