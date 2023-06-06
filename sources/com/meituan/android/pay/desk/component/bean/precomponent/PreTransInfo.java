package com.meituan.android.pay.desk.component.bean.precomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PreTransInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3950861504062521318L;
    @SerializedName("current_time")
    private long currentTime;
    @SerializedName("expire_time")
    private long expireTime;
    @SerializedName("last_outmoney")
    private float lastOutMoney;
    @SerializedName("order_money")
    private float orderMoney;
    @SerializedName("order_subject")
    private String orderSubject;
    @SerializedName("outmoney")
    private float outMoney;

    public float getOrderMoney() {
        return this.orderMoney;
    }

    public void setOrderMoney(float f) {
        this.orderMoney = f;
    }

    public long getCurrentTime() {
        return this.currentTime;
    }

    public void setCurrentTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ae84b530fb781915637128765177f4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ae84b530fb781915637128765177f4d");
        } else {
            this.currentTime = j;
        }
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44e030c4719cb5900705e1b59d5454f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44e030c4719cb5900705e1b59d5454f5");
        } else {
            this.expireTime = j;
        }
    }

    public String getOrderSubject() {
        return this.orderSubject;
    }

    public void setOrderSubject(String str) {
        this.orderSubject = str;
    }

    public float getOutMoney() {
        return this.outMoney;
    }

    public void setOutMoney(float f) {
        this.outMoney = f;
    }

    public float getLastOutMoney() {
        return this.lastOutMoney;
    }

    public void setLastOutMoney(float f) {
        this.lastOutMoney = f;
    }
}
