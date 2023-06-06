package com.meituan.ai.speech.sdk.knb.a;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.titans.js.DelegatedJsHandler;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.base.utils.AppUtilsKt;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.ai.speech.sdk.knb.JsAsrSettings;
import com.meituan.ai.speech.sdk.knb.JsResult;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a implements Runnable {
    public static ChangeQuickRedirect a;
    public int b;
    public boolean c;
    public boolean d;
    public AsrConfig e;
    final DelegatedJsHandler f;
    final Context g;
    private ScheduledExecutorService h;

    public a(DelegatedJsHandler delegatedJsHandler, Context context) {
        Object[] objArr = {delegatedJsHandler, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63f1ac50a86aac0cc91daf1fe2325f43", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63f1ac50a86aac0cc91daf1fe2325f43");
            return;
        }
        this.b = 0;
        this.f = delegatedJsHandler;
        this.g = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0131cdc503b67f7864161916c00e86f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0131cdc503b67f7864161916c00e86f6");
            return;
        }
        try {
            if (JsAsrSettings.instance.startRecord(this.f)) {
                SpeechRecognizer.instance.start(this.g, JsAsrSettings.instance.appKey, JsAsrSettings.instance.audioId, this.e, new RecogCallback() { // from class: com.meituan.ai.speech.sdk.knb.a.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void start(@NotNull String str) {
                    }

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void tempResult(@NotNull String str, @NotNull RecogResult recogResult) {
                        Object[] objArr2 = {str, recogResult};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a66422f5e05929ebd958d806b7856bd8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a66422f5e05929ebd958d806b7856bd8");
                            return;
                        }
                        try {
                            JsResult jsResult = new JsResult();
                            jsResult.errorCode = 3;
                            jsResult.errorMsg = "success";
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(KnbConstants.PARAMS_INDEX, recogResult.getRes_index());
                            jSONObject.put("text", recogResult.getText());
                            jSONObject.put("session_id", recogResult.getSession_id());
                            jsResult.setData(jSONObject);
                            a.this.f.actionCallback(jsResult);
                        } catch (Exception e) {
                            a.this.f.jsCallbackError(-1, e.getMessage());
                        }
                        if (recogResult.getRes_index() == 0) {
                            JsAsrSettings.instance.receiveResultEvent(recogResult);
                        }
                    }

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void onOvertimeClose(@NotNull String str) {
                        Object[] objArr2 = {str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b542fc1e15ace24cf0da588057bc728a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b542fc1e15ace24cf0da588057bc728a");
                            return;
                        }
                        JsAsrSettings.instance.recordOvertimeEvent(a.this.f);
                        if (a.this.c) {
                            JsAsrSettings.instance.stopRecordAndAsr(a.this.f, false, true);
                            if (a.this.d) {
                                a.this.a();
                            }
                        }
                    }

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void success(@NotNull String str, @NotNull RecogResult recogResult) {
                        List<Short> list;
                        Object[] objArr2 = {str, recogResult};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d244fc6af3c64f35605a4055f0d312f0", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d244fc6af3c64f35605a4055f0d312f0");
                            return;
                        }
                        try {
                            JsResult jsResult = new JsResult();
                            jsResult.errorCode = 1;
                            jsResult.errorMsg = "success";
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(KnbConstants.PARAMS_INDEX, recogResult.getRes_index());
                            jSONObject.put("text", recogResult.getText());
                            jSONObject.put("session_id", recogResult.getSession_id());
                            if (a.this.b == 1 && (list = JsAsrSettings.instance.audioDatas.get(str)) != null && list.size() > 0) {
                                JSONArray jSONArray = new JSONArray();
                                for (int i = 0; i < list.size(); i++) {
                                    jSONArray.put((int) list.get(i).shortValue());
                                }
                                jSONObject.put(KnbConstants.PARAMS_PCM_DATA, jSONArray);
                            }
                            if (!TextUtils.isEmpty(recogResult.getBiz_data())) {
                                jSONObject.put(KnbConstants.PARAMS_BIZ_DATA, recogResult.getBiz_data());
                            }
                            if (recogResult.getSentences() != null && recogResult.getSentences().size() > 0) {
                                JSONArray jSONArray2 = new JSONArray();
                                for (int i2 = 0; i2 < recogResult.getSentences().size(); i2++) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("content", recogResult.getSentences().get(i2).getContent());
                                    jSONObject2.put("confidence", recogResult.getSentences().get(i2).getConfidence());
                                    jSONArray2.put(jSONObject2);
                                }
                                jSONObject.put("nbest", jSONArray2);
                            }
                            jsResult.setData(jSONObject);
                            a.this.f.actionCallback(jsResult);
                            JsAsrSettings.instance.receiveResultEvent(recogResult);
                        } catch (Exception e) {
                            a.this.f.jsCallbackError(-1, e.getMessage());
                        }
                    }

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void failed(@NotNull String str, int i, @NotNull String str2) {
                        Object[] objArr2 = {str, Integer.valueOf(i), str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "611ec2e89d58c4f634e825d35188abf5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "611ec2e89d58c4f634e825d35188abf5");
                        } else {
                            JsAsrSettings.instance.asrFailEvent(a.this.f, i, str2);
                        }
                    }

                    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
                    public final void onVoiceDBSize(double d) {
                        Object[] objArr2 = {Double.valueOf(d)};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ae73c59ef24f33538644a823ee8f1bb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ae73c59ef24f33538644a823ee8f1bb");
                            return;
                        }
                        JsResult jsResult = new JsResult();
                        jsResult.errorCode = 2;
                        jsResult.errorMsg = "success";
                        jsResult.setData(Double.valueOf(d));
                        a.this.f.actionCallback(jsResult);
                    }
                });
                if (this.d) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "199ef97160a94d288244f7e8cf1e2878", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "199ef97160a94d288244f7e8cf1e2878");
                    } else {
                        a();
                        this.h = c.c("SpeechAsr-knbRecogStop");
                        this.h.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.ai.speech.sdk.knb.a.a.2
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b76221bde900d129783aa6abaff365d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b76221bde900d129783aa6abaff365d");
                                } else if (a.this.d) {
                                    if (JsAsrSettings.instance.isRecording.get()) {
                                        if (AppUtilsKt.isAppForeground(a.this.g)) {
                                            return;
                                        }
                                        JsAsrSettings.instance.stopRecordAndAsr(a.this.f, false, false);
                                    }
                                    a.this.a();
                                }
                            }
                        }, 1L, 2L, TimeUnit.SECONDS);
                    }
                }
                JsAsrSettings.instance.readRecordData(this.g, this.b);
            }
        } catch (Exception e) {
            this.f.jsCallbackError(-1, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cecb68e6a204c02e18be1d3c9e3dc65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cecb68e6a204c02e18be1d3c9e3dc65");
            return;
        }
        if (this.h != null) {
            this.h.shutdownNow();
        }
        this.h = null;
    }
}
