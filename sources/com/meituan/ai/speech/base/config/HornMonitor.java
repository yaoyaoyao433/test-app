package com.meituan.ai.speech.base.config;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Log;
import com.google.gson.Gson;
import com.meituan.ai.speech.base.log.SPLog;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.NetCreator;
import com.meituan.ai.speech.base.net.b;
import com.meituan.ai.speech.base.net.data.AuthParams;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.horn.HornConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/meituan/ai/speech/base/config/HornMonitor;", "", "()V", "BASE_HORN_CONFIG", "", "handleHornConfigData", "", "appKey", "configData", "Lcom/meituan/ai/speech/base/config/HornConfigData;", "init", "context", "Landroid/content/Context;", "secretKey", "speech-base_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes2.dex */
public final class HornMonitor {
    private static final String BASE_HORN_CONFIG = "AiSpeechSdkConfig";
    public static final HornMonitor INSTANCE = new HornMonitor();
    public static ChangeQuickRedirect changeQuickRedirect;

    public final void init(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d560a83233fe345def0b40c47b44f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d560a83233fe345def0b40c47b44f7f");
            return;
        }
        h.b(context, "context");
        h.b(str, "appKey");
        h.b(str2, "secretKey");
        String concat = "AiSpeechSdkConfig_".concat(String.valueOf(str2));
        Horn.init(context, new HornConfiguration());
        b.a aVar = b.a;
        Horn.register(concat, new a(str));
    }

    /* compiled from: ProGuard */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/meituan/ai/speech/base/config/HornMonitor$init$1", "Lcom/meituan/android/common/horn/HornCallback;", "onChanged", "", "enable", "", "result", "", "speech-base_release"}, k = 1, mv = {1, 1, 13})
    /* loaded from: classes2.dex */
    public static final class a implements HornCallback {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3252e526ab435a44a6fd98072fc345c7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3252e526ab435a44a6fd98072fc345c7");
            }
        }

        @Override // com.meituan.android.common.horn.HornCallback
        public final void onChanged(boolean z, @Nullable String str) {
            Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3366244ee1fcd52a04a79cd3bfba8d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3366244ee1fcd52a04a79cd3bfba8d3");
                return;
            }
            try {
                HornConfigData hornConfigData = (HornConfigData) new Gson().fromJson(str, (Class<Object>) HornConfigData.class);
                HornMonitor hornMonitor = HornMonitor.INSTANCE;
                String str2 = this.b;
                h.a((Object) hornConfigData, "configData");
                hornMonitor.handleHornConfigData(str2, hornConfigData);
            } catch (Exception e) {
                String str3 = "[HornMonitor Failed] msg=" + e.getMessage();
                String simpleName = getClass().getSimpleName();
                if (SPLog.INSTANCE.getLogLevel().getValue() > SPLogLevel.NONE.getValue()) {
                    Log.e("[" + simpleName + ']', str3);
                }
            }
        }
    }

    public final void handleHornConfigData(@NotNull String str, @NotNull HornConfigData hornConfigData) {
        Object[] objArr = {str, hornConfigData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "810160afa867969e8942d31eddc0647a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "810160afa867969e8942d31eddc0647a");
            return;
        }
        h.b(str, "appKey");
        h.b(hornConfigData, "configData");
        AuthParams authParams = NetCreator.INSTANCE.getAuthParams().get(str);
        if (authParams != null) {
            authParams.setNetWebSocket(hornConfigData.isUseWebsocket());
        }
    }
}
