package com.meituan.android.edfu.mbar.netservice.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class CodeResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private CodeReaderCards codeReaderCards;

    public CodeReaderCards getCodeReaderCards() {
        return this.codeReaderCards;
    }

    public void setCodeReaderCards(CodeReaderCards codeReaderCards) {
        this.codeReaderCards = codeReaderCards;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class CodeReaderCards {
        public static ChangeQuickRedirect changeQuickRedirect;
        private int code;
        private String message;
        private Result result;

        public void setCode(int i) {
            this.code = i;
        }

        public int getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public Result getResult() {
            return this.result;
        }

        public void setResult(Result result) {
            this.result = result;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Result {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<Res> res;

        public List<Res> getRes() {
            return this.res;
        }

        public void setRes(List<Res> list) {
            this.res = list;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Res {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<Integer> __isset_bit_vector;
        private String codeType;
        private float confidence;
        private String decodeRes;
        private int x0;
        private int x1;
        private int y0;
        private int y1;

        public String getDecodeRes() {
            return this.decodeRes;
        }

        public void setDecodeRes(String str) {
            this.decodeRes = str;
        }

        public String getCodeType() {
            return this.codeType;
        }

        public void setCodeType(String str) {
            this.codeType = str;
        }
    }
}
