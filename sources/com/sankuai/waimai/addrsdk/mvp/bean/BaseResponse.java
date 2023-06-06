package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializer;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BaseResponse<T> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    protected int code;
    @SerializedName("data")
    protected T data;
    @SerializedName("msg")
    protected String msg;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class Deserializer implements JsonDeserializer<BaseResponse> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0064 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:7:0x0026, B:10:0x002e, B:12:0x003d, B:18:0x0059, B:19:0x005b, B:21:0x0064, B:25:0x0084, B:27:0x008c, B:29:0x009b, B:30:0x00aa, B:32:0x00b3, B:34:0x00c9, B:22:0x0070, B:24:0x0079, B:13:0x0044, B:15:0x004d), top: B:40:0x0026 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:7:0x0026, B:10:0x002e, B:12:0x003d, B:18:0x0059, B:19:0x005b, B:21:0x0064, B:25:0x0084, B:27:0x008c, B:29:0x009b, B:30:0x00aa, B:32:0x00b3, B:34:0x00c9, B:22:0x0070, B:24:0x0079, B:13:0x0044, B:15:0x004d), top: B:40:0x0026 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:7:0x0026, B:10:0x002e, B:12:0x003d, B:18:0x0059, B:19:0x005b, B:21:0x0064, B:25:0x0084, B:27:0x008c, B:29:0x009b, B:30:0x00aa, B:32:0x00b3, B:34:0x00c9, B:22:0x0070, B:24:0x0079, B:13:0x0044, B:15:0x004d), top: B:40:0x0026 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[Catch: Exception -> 0x00d8, TryCatch #0 {Exception -> 0x00d8, blocks: (B:7:0x0026, B:10:0x002e, B:12:0x003d, B:18:0x0059, B:19:0x005b, B:21:0x0064, B:25:0x0084, B:27:0x008c, B:29:0x009b, B:30:0x00aa, B:32:0x00b3, B:34:0x00c9, B:22:0x0070, B:24:0x0079, B:13:0x0044, B:15:0x004d), top: B:40:0x0026 }] */
        @Override // com.google.gson.JsonDeserializer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse deserialize(com.google.gson.JsonElement r12, java.lang.reflect.Type r13, com.google.gson.JsonDeserializationContext r14) throws com.google.gson.JsonParseException {
            /*
                r11 = this;
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r8 = 0
                r0[r8] = r12
                r1 = 1
                r0[r1] = r13
                r1 = 2
                r0[r1] = r14
                com.meituan.robust.ChangeQuickRedirect r9 = com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse.Deserializer.changeQuickRedirect
                java.lang.String r10 = "c91de8b03f8dbc1b9c6780ed370539ef"
                r4 = 0
                r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                r1 = r0
                r2 = r11
                r3 = r9
                r5 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                if (r1 == 0) goto L24
                java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
                com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse r12 = (com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse) r12
                return r12
            L24:
                if (r12 == 0) goto Lda
                boolean r0 = r12.isJsonObject()     // Catch: java.lang.Exception -> Ld8
                if (r0 != 0) goto L2e
                goto Lda
            L2e:
                com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse r0 = new com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse     // Catch: java.lang.Exception -> Ld8
                r0.<init>()     // Catch: java.lang.Exception -> Ld8
                com.google.gson.JsonObject r12 = (com.google.gson.JsonObject) r12     // Catch: java.lang.Exception -> Ld8
                java.lang.String r1 = "code"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto L44
                java.lang.String r1 = "code"
                int r1 = com.sankuai.waimai.addrsdk.retrofit.a.a(r12, r1, r8)     // Catch: java.lang.Exception -> Ld8
                goto L59
            L44:
                java.lang.String r1 = "resultCode"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto L5b
                java.lang.String r1 = "resultCode"
                int r1 = com.sankuai.waimai.addrsdk.retrofit.a.a(r12, r1, r8)     // Catch: java.lang.Exception -> Ld8
                r2 = 200(0xc8, float:2.8E-43)
                if (r1 != r2) goto L59
                r1 = 0
            L59:
                r0.code = r1     // Catch: java.lang.Exception -> Ld8
            L5b:
                java.lang.String r1 = "msg"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto L70
                java.lang.String r1 = "msg"
                java.lang.String r2 = ""
                java.lang.String r1 = com.sankuai.waimai.addrsdk.retrofit.a.a(r12, r1, r2)     // Catch: java.lang.Exception -> Ld8
                r0.msg = r1     // Catch: java.lang.Exception -> Ld8
                goto L84
            L70:
                java.lang.String r1 = "resultMsg"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto L84
                java.lang.String r1 = "resultMsg"
                java.lang.String r2 = ""
                java.lang.String r1 = com.sankuai.waimai.addrsdk.retrofit.a.a(r12, r1, r2)     // Catch: java.lang.Exception -> Ld8
                r0.msg = r1     // Catch: java.lang.Exception -> Ld8
            L84:
                java.lang.String r1 = "data"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto Laa
                java.lang.String r1 = "data"
                com.google.gson.JsonObject r2 = new com.google.gson.JsonObject     // Catch: java.lang.Exception -> Ld8
                r2.<init>()     // Catch: java.lang.Exception -> Ld8
                com.google.gson.JsonObject r12 = com.sankuai.waimai.addrsdk.retrofit.a.a(r12, r1, r2)     // Catch: java.lang.Exception -> Ld8
                boolean r1 = r13 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto Ld7
                java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13     // Catch: java.lang.Exception -> Ld8
                java.lang.reflect.Type[] r13 = r13.getActualTypeArguments()     // Catch: java.lang.Exception -> Ld8
                r13 = r13[r8]     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r12 = r14.deserialize(r12, r13)     // Catch: java.lang.Exception -> Ld8
                r0.data = r12     // Catch: java.lang.Exception -> Ld8
                goto Ld7
            Laa:
                java.lang.String r1 = "results"
                boolean r1 = r12.has(r1)     // Catch: java.lang.Exception -> Ld8
                if (r1 == 0) goto Ld7
                com.google.gson.JsonObject r1 = new com.google.gson.JsonObject     // Catch: java.lang.Exception -> Ld8
                r1.<init>()     // Catch: java.lang.Exception -> Ld8
                java.lang.String r2 = "results"
                java.lang.String r3 = "results"
                com.google.gson.JsonElement r12 = r12.get(r3)     // Catch: java.lang.Exception -> Ld8
                r1.add(r2, r12)     // Catch: java.lang.Exception -> Ld8
                boolean r12 = r13 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Exception -> Ld8
                if (r12 == 0) goto Ld7
                java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13     // Catch: java.lang.Exception -> Ld8
                java.lang.reflect.Type[] r12 = r13.getActualTypeArguments()     // Catch: java.lang.Exception -> Ld8
                r12 = r12[r8]     // Catch: java.lang.Exception -> Ld8
                java.lang.Object r12 = r14.deserialize(r1, r12)     // Catch: java.lang.Exception -> Ld8
                r0.data = r12     // Catch: java.lang.Exception -> Ld8
            Ld7:
                return r0
            Ld8:
                r12 = move-exception
                throw r12
            Lda:
                r12 = 0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse.Deserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse");
        }
    }
}
