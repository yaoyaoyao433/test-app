package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayLaterPopDetailInfoBean implements Serializable {
    public static final int MIN_SCORE = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6561534117838257057L;
    @SerializedName("agreementList")
    private List<PayLaterAgreementBean> agreementList;
    @SerializedName("believeScoreBizLogo")
    private String believeScoreBizLogo;
    private String detail;
    @SerializedName("ext")
    private String ext;
    @SerializedName("marketingLink")
    private String guidePicture;
    @SerializedName("guideRequestNo")
    private String guideRequestNo;
    @SerializedName("lbtnText")
    private String lbtn;
    @SerializedName("needUserCheck")
    private boolean needUserCheck;
    @SerializedName("submitData")
    private PayLaterSubmitBean payLaterSubmitBean;
    @SerializedName("buttonStyleText")
    private String promoBubble;
    @SerializedName("rbtnText")
    private String rbtn;
    @SerializedName("beliveScore")
    private int score;
    @SerializedName("beliveName")
    private String scoreName;
    private String title;
    @SerializedName("utmSource")
    private String utmSource;

    public boolean isNeedUserCheck() {
        return this.needUserCheck;
    }

    public void setNeedUserCheck(boolean z) {
        this.needUserCheck = z;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getDetail() {
        return this.detail;
    }

    public void setDetail(String str) {
        this.detail = str;
    }

    public String getLbtn() {
        return this.lbtn;
    }

    public void setLbtn(String str) {
        this.lbtn = str;
    }

    public String getRbtn() {
        return this.rbtn;
    }

    public void setRbtn(String str) {
        this.rbtn = str;
    }

    public String getScoreName() {
        return this.scoreName;
    }

    public void setScoreName(String str) {
        this.scoreName = str;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public String getGuidePicture() {
        return this.guidePicture;
    }

    public void setGuidePicture(String str) {
        this.guidePicture = str;
    }

    public List<PayLaterAgreementBean> getAgreementList() {
        return this.agreementList;
    }

    public void setAgreementList(List<PayLaterAgreementBean> list) {
        this.agreementList = list;
    }

    public PayLaterSubmitBean getPayLaterSubmitBean() {
        return this.payLaterSubmitBean;
    }

    public void setPayLaterSubmitBean(PayLaterSubmitBean payLaterSubmitBean) {
        this.payLaterSubmitBean = payLaterSubmitBean;
    }

    public String getPromoBubble() {
        return this.promoBubble;
    }

    public void setPromoBubble(String str) {
        this.promoBubble = str;
    }

    public String getGuideRequestNo() {
        return this.guideRequestNo;
    }

    public void setGuideRequestNo(String str) {
        this.guideRequestNo = str;
    }

    public String getBelieveScoreBizLogo() {
        return this.believeScoreBizLogo;
    }

    public void setBelieveScoreBizLogo(String str) {
        this.believeScoreBizLogo = str;
    }

    public String getUtmSource() {
        return this.utmSource;
    }

    public void setUtmSource(String str) {
        this.utmSource = str;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String str) {
        this.ext = str;
    }
}
