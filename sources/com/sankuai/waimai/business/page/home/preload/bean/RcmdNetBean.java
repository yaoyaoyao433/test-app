package com.sankuai.waimai.business.page.home.preload.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RcmdNetBean extends NetBean {
    public static final String SOURCE_FROM_DEFAULT = "source_from_default";
    public static final String SOURCE_FROM_MT_HOMEPAGE_PRE_REQUEST = "source_from_mt_homepage_pre_request";
    public static final String SOURCE_FROM_PRE_REQUEST = "source_from_pre_request";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mRankListId;
    private String mSourceTag;

    public RcmdNetBean(Throwable th) {
        super(th);
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9f5d5c47fa6831721985515053c5c06", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9f5d5c47fa6831721985515053c5c06");
        } else {
            this.mSourceTag = SOURCE_FROM_DEFAULT;
        }
    }

    public RcmdNetBean(BaseResponse<?> baseResponse) {
        super(baseResponse);
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60c54c4df392a3e07132dd979e8e1322", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60c54c4df392a3e07132dd979e8e1322");
        } else {
            this.mSourceTag = SOURCE_FROM_DEFAULT;
        }
    }

    public String getRankListId() {
        return this.mRankListId;
    }

    public void setRankListId(String str) {
        this.mRankListId = str;
    }

    public String getSourceTag() {
        return this.mSourceTag;
    }

    public void setSourceTag(String str) {
        this.mSourceTag = str;
    }
}
