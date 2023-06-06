package com.sankuai.waimai.business.page.kingkong.future.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ResponseMsgBean {
    public static final int AREA_SOURCE = -1;
    public static final int ERROR_TYPE = -1;
    public static final int MAIN_SOURCE = 0;
    public static final int SUCCESS_TYPE = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int loadType;
    public BaseResponse<RocksServerModel> response;
    public int responseSource;
    public int responseType;

    public ResponseMsgBean(BaseResponse<RocksServerModel> baseResponse, int i, int i2) {
        Object[] objArr = {baseResponse, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c15c6ea91e79420768034e30e7bec98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c15c6ea91e79420768034e30e7bec98");
            return;
        }
        this.response = baseResponse;
        this.responseType = i;
        this.responseSource = i2;
    }

    public int getLoadType() {
        return this.loadType;
    }

    public void setLoadType(int i) {
        this.loadType = i;
    }
}
