package com.meituan.ai.speech.sdk.net.a;

import android.content.Context;
import com.meituan.ai.speech.base.log.CatMonitor;
import com.meituan.ai.speech.base.net.base.BaseWebSocketRequest;
import com.meituan.ai.speech.base.net.base.IWebSocketCallback;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.net.data.ServerVadInfo;
import com.meituan.ai.speech.base.net.data.WebSocketRecogResult;
import com.meituan.android.pike.bean.proto.ProtoConstant;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.k;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0018\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0016J \u00102\u001a\u00020)2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u00162\u0006\u00105\u001a\u00020\u0016H\u0014J2\u00106\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00162\u0006\u00108\u001a\u0002092\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010:\u001a\u00020\rH\u0016J\u0018\u0010;\u001a\u00020)2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0082\u000e¢\u0006\u0004\n\u0002\u0010'¨\u0006<"}, d2 = {"Lcom/meituan/ai/speech/sdk/net/request/WebSocketRequest;", "Lcom/meituan/ai/speech/base/net/base/BaseWebSocketRequest;", "Lcom/meituan/ai/speech/base/net/data/RecogResult;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "data", "", "getData", "()[B", "setData", "([B)V", "endTipTime", "", "endVadTime", "packetIndex", "getPacketIndex", "()Ljava/lang/Integer;", "setPacketIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "params", "", "getParams", "()Ljava/lang/String;", "setParams", "(Ljava/lang/String;)V", "sessionId", "getSessionId", "setSessionId", "startRecogTime", "", "startTipTime", "startVadTime", "tempSessionText", "tempStatusText", "vad_info", "", "Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "[Lcom/meituan/ai/speech/base/net/data/ServerVadInfo;", "callRequest", "", TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, ProtoConstant.COMMAND, "handleMessageData", "appKey", "result", "Lcom/meituan/ai/speech/base/net/data/WebSocketRecogResult;", "handleVadSendData", "initService", "postPrivateMonitor", "requestTime", "secretKey", "receiveSessionId", "setRecogParams", "asrParams", "isVad", "", "pktIndex", "setVadParams", "speech-asr_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class e extends BaseWebSocketRequest<RecogResult> {
    public static ChangeQuickRedirect a;
    @NotNull
    public String b;
    @NotNull
    private String c;
    @Nullable
    private byte[] d;
    @Nullable
    private Integer e;
    private long f;
    private int g;
    private int h;
    private ServerVadInfo[] i;
    private int j;
    private int k;
    private String l;
    private String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        super(context);
        h.b(context, "context");
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7206f1ded320bbb18d393755286ab04b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7206f1ded320bbb18d393755286ab04b");
            return;
        }
        this.c = "";
        this.f = -1L;
        this.g = -1;
        this.h = -1;
        this.j = -1;
        this.k = -1;
        this.l = "";
        this.m = "";
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void initService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d887d50271558f17a41039ee2c77893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d887d50271558f17a41039ee2c77893");
        } else {
            createService();
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void setRecogParams(@NotNull String str, @NotNull String str2, boolean z, @Nullable byte[] bArr, int i) {
        Object[] objArr = {str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), bArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36c23a497013d9c3b8d9f724819677d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36c23a497013d9c3b8d9f724819677d");
            return;
        }
        h.b(str, "sessionId");
        h.b(str2, "asrParams");
        this.b = str2;
        this.d = bArr;
        setVad(z);
        this.c = str;
        this.e = Integer.valueOf(i);
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void setVadParams(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void callRequest(@NotNull String str, @NotNull String str2) {
        int i;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe134d4ebabc78f29db857b4546ed2ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe134d4ebabc78f29db857b4546ed2ab");
            return;
        }
        h.b(str, TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER);
        h.b(str2, ProtoConstant.COMMAND);
        int length = str2.length();
        int length2 = this.c.length();
        int length3 = str.length();
        String str3 = this.b;
        if (str3 == null) {
            h.a("params");
        }
        int length4 = str3.length();
        if (this.d != null) {
            byte[] bArr = this.d;
            if (bArr == null) {
                h.a();
            }
            i = bArr.length;
        } else {
            i = 0;
        }
        int i2 = length + 2;
        byte[] bArr2 = new byte[i2 + 1 + length2 + 2 + length3 + 2 + length4 + 4 + i];
        bArr2[0] = 10;
        bArr2[1] = (byte) length;
        byte[] bytes = str2.getBytes(kotlin.text.d.a);
        h.a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        System.arraycopy(bytes, 0, bArr2, 2, length);
        bArr2[i2] = (byte) length2;
        String str4 = this.c;
        Charset charset = kotlin.text.d.a;
        if (str4 == null) {
            throw new o("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes2 = str4.getBytes(charset);
        h.a((Object) bytes2, "(this as java.lang.String).getBytes(charset)");
        int i3 = length + 3;
        System.arraycopy(bytes2, 0, bArr2, i3, length2);
        System.arraycopy(ByteBuffer.allocate(2).putShort((short) length3).array(), 0, bArr2, i3 + length2, 2);
        byte[] bytes3 = str.getBytes(kotlin.text.d.a);
        h.a((Object) bytes3, "(this as java.lang.String).getBytes(charset)");
        int i4 = length + 5 + length2;
        System.arraycopy(bytes3, 0, bArr2, i4, length3);
        System.arraycopy(ByteBuffer.allocate(2).putShort((short) length4).array(), 0, bArr2, i4 + length3, 2);
        String str5 = this.b;
        if (str5 == null) {
            h.a("params");
        }
        Charset charset2 = kotlin.text.d.a;
        if (str5 == null) {
            throw new o("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes4 = str5.getBytes(charset2);
        h.a((Object) bytes4, "(this as java.lang.String).getBytes(charset)");
        int i5 = length + 7 + length2 + length3;
        System.arraycopy(bytes4, 0, bArr2, i5, length4);
        System.arraycopy(ByteBuffer.allocate(4).putInt(i).array(), 0, bArr2, i5 + length4, 4);
        if (i > 0) {
            byte[] bArr3 = this.d;
            if (bArr3 == null) {
                h.a();
            }
            System.arraycopy(bArr3, 0, bArr2, length + 11 + length2 + length3 + length4, i);
        }
        sendPikeMessage(bArr2);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eeb314202c9ea86d358ee40fcee6a833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eeb314202c9ea86d358ee40fcee6a833");
            return;
        }
        Integer num = this.e;
        if (num != null && num.intValue() == 0) {
            this.f = System.currentTimeMillis();
            this.g = 0;
            this.h = 0;
            this.l = "";
            this.m = "";
            this.i = null;
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.f);
        IWebSocketCallback<RecogResult> callback = getCallback();
        if (callback != null) {
            callback.onSendServerVad(getAppKey(), currentTimeMillis, this.i);
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void handleMessageData(@NotNull String str, @NotNull WebSocketRecogResult webSocketRecogResult) {
        Object[] objArr = {str, webSocketRecogResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "507ba69c5a9db8ec62a0f54fe0dfadb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "507ba69c5a9db8ec62a0f54fe0dfadb8");
            return;
        }
        h.b(str, "appKey");
        h.b(webSocketRecogResult, "result");
        if ((!h.a((Object) this.c, (Object) webSocketRecogResult.getSession_id())) || webSocketRecogResult.getRes_index() == 0) {
            this.l = "";
            this.m = "";
        }
        if (webSocketRecogResult.getStart_time() != this.g) {
            ServerVadInfo serverVadInfo = new ServerVadInfo();
            serverVadInfo.setStart(webSocketRecogResult.getStart_time());
            serverVadInfo.setEnd(webSocketRecogResult.getEnd_time());
            if (this.i == null) {
                this.i = new ServerVadInfo[0];
            }
            ServerVadInfo[] serverVadInfoArr = this.i;
            if (serverVadInfoArr == null) {
                h.a();
            }
            h.b(serverVadInfoArr, "$this$plus");
            int length = serverVadInfoArr.length;
            Object[] copyOf = Arrays.copyOf(serverVadInfoArr, length + 1);
            copyOf[length] = serverVadInfo;
            h.a((Object) copyOf, "result");
            this.i = (ServerVadInfo[]) copyOf;
        } else if (this.i != null) {
            ServerVadInfo[] serverVadInfoArr2 = this.i;
            if (serverVadInfoArr2 == null) {
                h.a();
            }
            if (!(serverVadInfoArr2.length == 0)) {
                ServerVadInfo[] serverVadInfoArr3 = this.i;
                if (serverVadInfoArr3 == null) {
                    h.a();
                }
                int length2 = serverVadInfoArr3.length;
                ServerVadInfo[] serverVadInfoArr4 = this.i;
                if (serverVadInfoArr4 == null) {
                    h.a();
                }
                serverVadInfoArr4[length2 - 1].setEnd(webSocketRecogResult.getEnd_time());
            }
        }
        this.g = webSocketRecogResult.getStart_time();
        this.h = webSocketRecogResult.getEnd_time();
        RecogResult recogResult = new RecogResult();
        recogResult.setVad_info(this.i);
        recogResult.setBiz_data(webSocketRecogResult.getBiz_data());
        recogResult.setFile_url(webSocketRecogResult.getFile_url());
        recogResult.setRes_index(webSocketRecogResult.getRes_index());
        recogResult.setSession_id(webSocketRecogResult.getSession_id());
        recogResult.setSpeech_time(webSocketRecogResult.getSpeech_time());
        recogResult.setSentences(webSocketRecogResult.getSentences());
        if (webSocketRecogResult.getStatus() == 1 || webSocketRecogResult.getStatus() == 2 || webSocketRecogResult.getStatus() == 3) {
            String text = webSocketRecogResult.getText();
            if (text == null) {
                text = "";
            }
            this.m = text;
        }
        recogResult.setText(this.l + this.m);
        if (webSocketRecogResult.getStatus() == 3) {
            String str2 = this.l;
            this.l = str2 + this.m;
            this.m = "";
        }
        IWebSocketCallback<RecogResult> callback = getCallback();
        if (callback != null) {
            callback.onSuccess(str, this.g, this.h, recogResult);
        }
    }

    @Override // com.meituan.ai.speech.base.net.base.BaseWebSocketRequest
    public final void postPrivateMonitor(long j, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e5da3a46b1ad8eabd5ab924deb27df", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e5da3a46b1ad8eabd5ab924deb27df");
            return;
        }
        h.b(str, "secretKey");
        h.b(str2, "receiveSessionId");
        if (this.e != null) {
            Integer num = this.e;
            if (num == null) {
                h.a();
            }
            if (num.intValue() >= 0 || !h.a((Object) this.c, (Object) str2)) {
                return;
            }
            CatMonitor.INSTANCE.uploadCustomIndicator(getContext(), kotlin.collections.h.a(new k("last-response-time", kotlin.collections.h.a(Float.valueOf((float) (System.currentTimeMillis() - j))))), kotlin.collections.h.a((Object[]) new k[]{new k("requestName", getRequestName()), new k("secretKey", str), new k("networkType", "webSocket")}));
        }
    }
}
