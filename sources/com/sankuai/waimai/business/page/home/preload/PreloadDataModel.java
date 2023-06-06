package com.sankuai.waimai.business.page.home.preload;

import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.model.HomeSecondFloorResponse;
import com.sankuai.waimai.business.page.home.preload.bean.NetBean;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.business.page.home.widget.twolevel.report.a;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.net.main.IMainActivityLoadedPlatform;
import com.sankuai.waimai.router.annotation.RouterProvider;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class PreloadDataModel implements IMainActivityLoadedPlatform {
    public static ChangeQuickRedirect changeQuickRedirect;
    private d<Boolean> isCacheRender;
    public volatile boolean isCacheRendering;
    private d<WmAddress> mAddress;
    private volatile WMLocation mCurrentLocation;
    private d<NetBean> mHomeFutureTabsResponse;
    private d<com.sankuai.waimai.business.page.home.model.e> mHomeHeaderFloatResponse;
    private d<com.sankuai.waimai.business.page.home.model.e> mHomeSideBarResponse;
    private volatile boolean mIsColdStartMainLoaded;
    private d<Boolean> mIsSecondFloorApiError;
    private d<WMLocation> mLocation;
    private d<Boolean> mLocationTimeoutState;
    private d<NetBean> mPoiListResponse;
    private d<RcmdNetBean> mPreRequestRcmdResponse;
    private volatile long mPreRequestSuccessTime;
    private d<RcmdNetBean> mRcmdResponse;
    private volatile WMLocation mRecommendedLocation;
    private d<Integer> mResetAppModel;
    private a.C0793a mResourceDownLoadState;
    private d<HomeSecondFloorResponse> mSecondFloorResponse;

    public PreloadDataModel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ae2c756b02f5f654331faf9f9722902", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ae2c756b02f5f654331faf9f9722902");
            return;
        }
        this.mLocationTimeoutState = new d<>();
        this.mLocation = new d<>();
        this.mResetAppModel = new d<>();
        this.mAddress = new d<>();
        this.mRcmdResponse = new d<>();
        this.mPoiListResponse = new d<>();
        this.mHomeFutureTabsResponse = new d<>();
        this.mIsColdStartMainLoaded = true;
        this.mPreRequestRcmdResponse = new d<>();
        this.mPreRequestSuccessTime = -1L;
        this.mSecondFloorResponse = new d<>();
        this.mIsSecondFloorApiError = new d<>();
        this.mResourceDownLoadState = new a.C0793a();
        this.mHomeHeaderFloatResponse = new d<>();
        this.mHomeSideBarResponse = new d<>();
        this.isCacheRender = new d<>();
    }

    @RouterProvider
    public static PreloadDataModel get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f43be5199f08330c5243c8ade5213235", RobustBitConfig.DEFAULT_VALUE) ? (PreloadDataModel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f43be5199f08330c5243c8ade5213235") : a.a;
    }

    public d<WMLocation> getLocation() {
        return this.mLocation;
    }

    public void setLocation(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf301f57f2e3301ed5c33e1d9bce6a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf301f57f2e3301ed5c33e1d9bce6a7b");
            return;
        }
        if (wMLocation == null) {
            wMLocation = new WMLocation("locate failed null");
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", "得到了定位结果：" + wMLocation.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getLocation").b());
        this.mCurrentLocation = wMLocation;
        if (ad.b()) {
            this.mLocation.b((d<WMLocation>) wMLocation);
        } else {
            this.mLocation.a((d<WMLocation>) wMLocation);
        }
    }

    public d<Integer> isResetAppModel() {
        return this.mResetAppModel;
    }

    public void resetAppModel(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2eb562f745dc2891d0f7e292f889b17c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2eb562f745dc2891d0f7e292f889b17c");
        } else if (ad.b()) {
            this.mResetAppModel.b((d<Integer>) Integer.valueOf(i));
        } else {
            this.mResetAppModel.a((d<Integer>) Integer.valueOf(i));
        }
    }

    public d<Boolean> isCacheRender() {
        return this.isCacheRender;
    }

    public void setIsCacheRender(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29a8d53b88e9c2f8f4ef600976afe4c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29a8d53b88e9c2f8f4ef600976afe4c2");
        } else if (ad.b()) {
            this.isCacheRender.b((d<Boolean>) Boolean.valueOf(z));
        } else {
            this.isCacheRender.a((d<Boolean>) Boolean.valueOf(z));
        }
    }

    public d<WmAddress> getAddress() {
        return this.mAddress;
    }

    public void setAddress(WmAddress wmAddress) {
        Object[] objArr = {wmAddress};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be48eb7c356cbddc2b09c814843f1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be48eb7c356cbddc2b09c814843f1be");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了地址结果：");
            sb.append(wmAddress != null ? wmAddress.toString() : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getAddress").b());
        this.mAddress.b((d<WmAddress>) wmAddress);
    }

    public WMLocation getRecommendedLocation() {
        return this.mRecommendedLocation;
    }

    public void setRecommendedLocation(WMLocation wMLocation) {
        Object[] objArr = {wMLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe81dabeb49f1b40aa90e3b944b08108", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe81dabeb49f1b40aa90e3b944b08108");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了定位推荐策略推荐的定位缓存：");
            sb.append(wMLocation != null ? wMLocation.toString() : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getRecommendLocation").b());
        this.mRecommendedLocation = wMLocation;
    }

    public d<RcmdNetBean> getPreRequestRcmdResponse() {
        return this.mPreRequestRcmdResponse;
    }

    public void setPreRequestRcmdResponse(RcmdNetBean rcmdNetBean) {
        Object[] objArr = {rcmdNetBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45b87ccc8a78a595682974934a469e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45b87ccc8a78a595682974934a469e5e");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了预加载的rcmd数据：");
            sb.append(rcmdNetBean != null ? k.a().toJson(rcmdNetBean) : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getPreRequestRcmd").b());
        if (ad.b()) {
            this.mPreRequestRcmdResponse.b((d<RcmdNetBean>) rcmdNetBean);
        } else {
            this.mPreRequestRcmdResponse.a((d<RcmdNetBean>) rcmdNetBean);
        }
    }

    public d<RcmdNetBean> getRcmdResponse() {
        return this.mRcmdResponse;
    }

    public void setRcmdResponse(RcmdNetBean rcmdNetBean) {
        Object[] objArr = {rcmdNetBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "792edf972dbf4df9ffdfea55090677f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "792edf972dbf4df9ffdfea55090677f3");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了最终的rcmd数据");
            sb.append(rcmdNetBean != null ? k.a().toJson(rcmdNetBean) : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load");
        StringBuilder sb2 = new StringBuilder("getRcmd:");
        sb2.append(rcmdNetBean != null ? rcmdNetBean.getSourceTag() : "");
        i.b(a2.d(sb2.toString()).b());
        if (ad.b()) {
            this.mRcmdResponse.b((d<RcmdNetBean>) rcmdNetBean);
        } else {
            this.mRcmdResponse.a((d<RcmdNetBean>) rcmdNetBean);
        }
    }

    public d<NetBean> getPoiListResponse() {
        return this.mPoiListResponse;
    }

    public void setPoiListResponse(NetBean netBean) {
        Object[] objArr = {netBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "93a580269bbe8b5a8f4c13e17c375f23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "93a580269bbe8b5a8f4c13e17c375f23");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了商家列表数据");
            sb.append(netBean != null ? new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(netBean) : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getPoiList").b());
        if (ad.b()) {
            this.mPoiListResponse.b((d<NetBean>) netBean);
        } else {
            this.mPoiListResponse.a((d<NetBean>) netBean);
        }
    }

    public d<NetBean> getHomeFutureTabsResponse() {
        return this.mHomeFutureTabsResponse;
    }

    public synchronized void setHomeFutureTabsResponse(NetBean netBean) {
        Object[] objArr = {netBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e75c88c7ff7646b9291865b363f7d95b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e75c88c7ff7646b9291865b363f7d95b");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("renderList111", "setHomeFutureTabsResponse22 :   " + Thread.currentThread().getName(), new Object[0]);
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            StringBuilder sb = new StringBuilder("得到了新首页数据");
            sb.append(netBean != null ? k.a().toJson(netBean) : StringUtil.NULL);
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", sb.toString(), new Object[0]);
        }
        i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("getFutureTabs").b());
        if (ad.b()) {
            this.mHomeFutureTabsResponse.b((d<NetBean>) netBean);
        } else {
            this.mHomeFutureTabsResponse.a((d<NetBean>) netBean);
        }
    }

    public d<Boolean> getLocationTimeoutState() {
        return this.mLocationTimeoutState;
    }

    public boolean isLocateFailedOrTimeout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8c197503ff1d52b254282d65e3eaaa2a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8c197503ff1d52b254282d65e3eaaa2a")).booleanValue() : (isLocateSuccess() || this.mLocationTimeoutState.a() == null || !this.mLocationTimeoutState.a().booleanValue()) ? false : true;
    }

    public boolean isLocateSuccess() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dfd53575ee8bffff1626104ab66c80c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dfd53575ee8bffff1626104ab66c80c1")).booleanValue() : this.mCurrentLocation != null && h.d(Double.valueOf(this.mCurrentLocation.getLatitude()), Double.valueOf(0.0d)) && h.d(Double.valueOf(this.mCurrentLocation.getLongitude()), Double.valueOf(0.0d));
    }

    public void setLocationTimeoutState(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d603898d13f54c2e8b3dc1330ae291f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d603898d13f54c2e8b3dc1330ae291f3");
        } else if (ad.b()) {
            this.mLocationTimeoutState.b((d<Boolean>) Boolean.valueOf(z));
        } else {
            this.mLocationTimeoutState.a((d<Boolean>) Boolean.valueOf(z));
        }
    }

    @Override // com.sankuai.waimai.platform.net.main.IMainActivityLoadedPlatform
    public boolean getMainActivityLoaded() {
        return this.mIsColdStartMainLoaded;
    }

    public void setMainLoaded(boolean z) {
        this.mIsColdStartMainLoaded = z;
    }

    public long getPreRequestSuccessTime() {
        return this.mPreRequestSuccessTime;
    }

    public void setPreRequestSuccessTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dab2f110e057be354d12062549fbe70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dab2f110e057be354d12062549fbe70");
        } else {
            this.mPreRequestSuccessTime = j;
        }
    }

    public WMLocation getCurrentLocation() {
        return this.mCurrentLocation;
    }

    public void release() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b107af11fc012533d674282a51ffe7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b107af11fc012533d674282a51ffe7fb");
            return;
        }
        this.mCurrentLocation = null;
        this.mLocationTimeoutState.b();
        this.mLocation.b();
        this.mAddress.b();
        this.mRcmdResponse.b();
        this.mPoiListResponse.b();
        this.mHomeFutureTabsResponse.b();
        this.mRecommendedLocation = null;
        this.mPreRequestRcmdResponse.b();
        this.mPreRequestSuccessTime = -1L;
        this.mSecondFloorResponse.b();
        this.mHomeHeaderFloatResponse.b();
        this.mHomeSideBarResponse.b();
        this.mResourceDownLoadState = null;
        this.isCacheRender.b();
        this.isCacheRendering = false;
        this.mResetAppModel.b();
    }

    public a.C0793a getSecondRecourceState() {
        return this.mResourceDownLoadState;
    }

    public void setSecondRecourceState(a.C0793a c0793a) {
        this.mResourceDownLoadState = c0793a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final PreloadDataModel a = new PreloadDataModel();
    }

    public d<HomeSecondFloorResponse> getHomeSecondFloorResponse() {
        return this.mSecondFloorResponse;
    }

    public void setHomeSecondFloorResponse(HomeSecondFloorResponse homeSecondFloorResponse) {
        Object[] objArr = {homeSecondFloorResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d482f17b281579bc50cba4fca9328691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d482f17b281579bc50cba4fca9328691");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("SecondFloor__TASK", "PreloadDataModel 设置数据： " + homeSecondFloorResponse, new Object[0]);
        if (ad.b()) {
            this.mSecondFloorResponse.b((d<HomeSecondFloorResponse>) homeSecondFloorResponse);
        } else {
            this.mSecondFloorResponse.a((d<HomeSecondFloorResponse>) homeSecondFloorResponse);
        }
    }

    public d<Boolean> isSecondFloorApiError() {
        return this.mIsSecondFloorApiError;
    }

    public void setIsSecondFloorApiError(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3086a81fd53d47052d30c5508874b5e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3086a81fd53d47052d30c5508874b5e5");
        } else if (ad.b()) {
            this.mIsSecondFloorApiError.b((d<Boolean>) bool);
        } else {
            this.mIsSecondFloorApiError.a((d<Boolean>) bool);
        }
    }

    public d<com.sankuai.waimai.business.page.home.model.e> getHomeHeaderFloatResponse() {
        return this.mHomeHeaderFloatResponse;
    }

    public d<com.sankuai.waimai.business.page.home.model.e> getHomeSideBarResponse() {
        return this.mHomeSideBarResponse;
    }

    public void setHomeHeaderFloatResponse(com.sankuai.waimai.business.page.home.model.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d940ce82665123cb03e6a518364bb029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d940ce82665123cb03e6a518364bb029");
        } else if (ad.b()) {
            this.mHomeHeaderFloatResponse.b((d<com.sankuai.waimai.business.page.home.model.e>) eVar);
        } else {
            this.mHomeHeaderFloatResponse.a((d<com.sankuai.waimai.business.page.home.model.e>) eVar);
        }
    }

    public void setHomeSideBarResponse(com.sankuai.waimai.business.page.home.model.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0e69e093c7b33cb8689d8651b7c2cfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0e69e093c7b33cb8689d8651b7c2cfe");
        } else if (ad.b()) {
            this.mHomeSideBarResponse.b((d<com.sankuai.waimai.business.page.home.model.e>) eVar);
        } else {
            this.mHomeSideBarResponse.a((d<com.sankuai.waimai.business.page.home.model.e>) eVar);
        }
    }
}
