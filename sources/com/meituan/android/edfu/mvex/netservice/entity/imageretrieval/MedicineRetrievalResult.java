package com.meituan.android.edfu.mvex.netservice.entity.imageretrieval;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class MedicineRetrievalResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextItem[] baoZhuang;
    private TextItem[] changShang;
    private TextItem[] qiTa;
    private String sessionId;
    private TextItem[] shangPinMing;
    private TextItem[] tongYongMing;
    private String traceId;
    private TextItem[] wenHao;

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public TextItem[] getTongYongMing() {
        return this.tongYongMing;
    }

    public void setTongYongMing(TextItem[] textItemArr) {
        this.tongYongMing = textItemArr;
    }

    public TextItem[] getShangPinMing() {
        return this.shangPinMing;
    }

    public void setShangPinMing(TextItem[] textItemArr) {
        this.shangPinMing = textItemArr;
    }

    public TextItem[] getBaoZhuang() {
        return this.baoZhuang;
    }

    public void setBaoZhuang(TextItem[] textItemArr) {
        this.baoZhuang = textItemArr;
    }

    public TextItem[] getWenHao() {
        return this.wenHao;
    }

    public void setWenHao(TextItem[] textItemArr) {
        this.wenHao = textItemArr;
    }

    public TextItem[] getChangShang() {
        return this.changShang;
    }

    public void setChangShang(TextItem[] textItemArr) {
        this.changShang = textItemArr;
    }

    public TextItem[] getQiTa() {
        return this.qiTa;
    }

    public void setQiTa(TextItem[] textItemArr) {
        this.qiTa = textItemArr;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes2.dex */
    public static class TextItem {
        public static ChangeQuickRedirect changeQuickRedirect;
        private float score;
        private String text;

        public String getText() {
            return this.text;
        }

        public void setText(String str) {
            this.text = str;
        }

        public float getScore() {
            return this.score;
        }

        public void setScore(float f) {
            this.score = f;
        }
    }
}
