package com.sankuai.waimai.kit.share.bean;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WeixinBean extends ShareBean {
    public static final int TYPE_WEIXIN_CIRCLE = 1;
    public static final int TYPE_WEIXIN_FRIENDS = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private byte[] imageData;
    private byte[] thumbData;
    private int type;
    private String userName;

    public boolean isImage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "557c4e0c5f0e69e2f075d9ad5b9e58de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "557c4e0c5f0e69e2f075d9ad5b9e58de")).booleanValue() : (TextUtils.isEmpty(getImagePath()) && this.imageData == null) ? false : true;
    }

    public void setImageData(byte[] bArr, byte[] bArr2) {
        this.imageData = bArr;
        this.thumbData = bArr2;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public byte[] getThumbData() {
        return this.thumbData;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean isMiniProgram() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a2479899ae9e2eb32a651bf6cdfdbb4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a2479899ae9e2eb32a651bf6cdfdbb4")).booleanValue() : !TextUtils.isEmpty(getMiniProgramPath());
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public static WeixinBean getWeixinBean(ShareBean shareBean) {
        Object[] objArr = {shareBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "34da9d47482a01156adcf2368beba986", RobustBitConfig.DEFAULT_VALUE)) {
            return (WeixinBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "34da9d47482a01156adcf2368beba986");
        }
        WeixinBean weixinBean = new WeixinBean();
        if (shareBean == null) {
            return weixinBean;
        }
        weixinBean.setTitle(shareBean.getTitle());
        weixinBean.setContent(shareBean.getContent());
        weixinBean.setImgUrl(shareBean.getImgUrl());
        weixinBean.setUrl(shareBean.getUrl());
        weixinBean.setDimType(shareBean.getDimType());
        weixinBean.setSourceId(shareBean.getSourceId());
        weixinBean.setOrderId(shareBean.getOrderId());
        weixinBean.setShortUrl(shareBean.getShortUrl());
        weixinBean.setChannel(shareBean.getChannel());
        weixinBean.setWxTimeLineTitle(shareBean.getWxTimeLineTitle());
        weixinBean.setPackageName(shareBean.getPackageName());
        weixinBean.setActivityName(shareBean.getActivityName());
        weixinBean.setMiniProgramLocalImage(shareBean.isMiniProgramLocalImage());
        weixinBean.setMiniProgramPath(shareBean.getMiniProgramPath());
        weixinBean.setMiniProgramId(shareBean.getMiniProgramId());
        weixinBean.setImagePath(shareBean.getImagePath());
        weixinBean.setMiniProgramWithShareTicket(shareBean.miniProgramWithShareTicket());
        return weixinBean;
    }
}
