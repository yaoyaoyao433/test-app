package com.sankuai.waimai.sa.voice;

import android.annotation.SuppressLint;
import android.content.Context;
import com.meituan.ai.speech.base.log.SPLogLevel;
import com.meituan.ai.speech.base.net.data.RecogResult;
import com.meituan.ai.speech.base.processor.callback.IVadCallback;
import com.meituan.ai.speech.base.sdk.AsrConfig;
import com.meituan.ai.speech.base.sdk.RecogCallback;
import com.meituan.ai.speech.sdk.AudioRecordHelper;
import com.meituan.ai.speech.sdk.SpeechRecognizer;
import com.meituan.ai.speech.sdk.record.RecordConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.kit.uuid.b;
import com.sankuai.waimai.sa.ui.assistant.voice.c;
import com.speech.vadsdk.processor.VadConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements RecogCallback, c {
    public static ChangeQuickRedirect a;
    private Context b;
    private SpeechRecognizer c;
    private AudioRecordHelper d;
    private VadConfig e;
    private AsrConfig f;
    private com.sankuai.waimai.sa.ui.assistant.voice.a g;
    private boolean h;

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void onOvertimeClose(@NotNull String str) {
    }

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void start(@NotNull String str) {
    }

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void tempResult(@Nullable String str, @NotNull RecogResult recogResult) {
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0f2013d9eecbb44636b99f7c4aa9a22", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0f2013d9eecbb44636b99f7c4aa9a22");
            return;
        }
        this.b = context;
        this.h = false;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.voice.c
    @SuppressLint({"MissingPermission"})
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d947b62f573a54fc23e36c3084603d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d947b62f573a54fc23e36c3084603d");
            return;
        }
        if (!this.h) {
            this.h = true;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74b532a795641028c628ad9408c28e69", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74b532a795641028c628ad9408c28e69");
            } else {
                String a2 = b.a(com.meituan.android.singleton.b.a);
                this.c = new SpeechRecognizer.Builder().setUUID(a2).setCatAppId(com.sankuai.waimai.config.a.a().d()).setLog(SPLogLevel.ERROR).build(com.meituan.android.singleton.b.a);
                this.c.appendAuthParams("UDmhmjQvWg5BLV6BDuKY/FDA2RWrAe0mpupuPdPElXg=", "8ce2881cb692480cb315403c05fc9f17");
                this.c.register(com.meituan.android.singleton.b.a, a2, "UDmhmjQvWg5BLV6BDuKY/FDA2RWrAe0mpupuPdPElXg=");
                this.e = new VadConfig();
                this.e.setStartTipTime(2000);
                this.e.setEndTipTime(2000);
                this.e.setCallback(new IVadCallback() { // from class: com.sankuai.waimai.sa.voice.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
                    public final void failed(int i, @NotNull String str) {
                    }

                    @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
                    public final void onStart(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7acb23f2853f479c8006ca0e02bdc8b1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7acb23f2853f479c8006ca0e02bdc8b1");
                        } else if (a.this.d != null) {
                            a.this.d.stop();
                        }
                    }

                    @Override // com.meituan.ai.speech.base.processor.callback.IVadCallback
                    public final void onEnd(boolean z) {
                        Object[] objArr3 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7ddf67408acde162c7ab93a46ba35a5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7ddf67408acde162c7ab93a46ba35a5");
                        } else if (a.this.d != null) {
                            a.this.d.stop();
                        }
                    }
                });
                this.e.register(com.meituan.android.singleton.b.a, "UDmhmjQvWg5BLV6BDuKY/FDA2RWrAe0mpupuPdPElXg=", this.c);
                this.f = new AsrConfig();
                this.f.setIgnoreTempResult(1);
                this.f.setSupportVad16(true);
                this.d = new AudioRecordHelper();
            }
        }
        if (this.g != null) {
            this.g.a(true);
        }
        RecordConfig recordConfig = new RecordConfig();
        recordConfig.setPrivacySceneToken("dj-3a597ac932e6c559");
        this.d.start(this.b, "UDmhmjQvWg5BLV6BDuKY/FDA2RWrAe0mpupuPdPElXg=", String.valueOf(System.currentTimeMillis()), this.f, recordConfig, this);
    }

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void success(@Nullable String str, @NotNull RecogResult recogResult) {
        Object[] objArr = {str, recogResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36206d7ac76b27c16728d627759d6b50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36206d7ac76b27c16728d627759d6b50");
        } else if (this.g != null) {
            this.g.a();
            this.g.a(recogResult.getText(), true);
        }
    }

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void failed(@Nullable String str, int i, @NotNull String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d5e18d6c9b6e6d40972502eab9b6cc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d5e18d6c9b6e6d40972502eab9b6cc6");
        } else if (this.g != null) {
            this.g.a();
            if (i == 9100) {
                this.g.b();
            } else {
                this.g.c();
            }
        }
    }

    @Override // com.meituan.ai.speech.base.sdk.RecogCallback
    public final void onVoiceDBSize(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19d9b72260af7bad9ec39ff881aa2a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19d9b72260af7bad9ec39ff881aa2a68");
        } else if (this.g != null) {
            this.g.a((int) ((d / 5.0d) + 0.5d), (byte[]) null);
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.voice.c
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89e27b1dd8e2799b140a416251a8e385", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89e27b1dd8e2799b140a416251a8e385");
        } else if (this.d != null) {
            this.d.stop();
        }
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.voice.c
    public final void a(com.sankuai.waimai.sa.ui.assistant.voice.a aVar) {
        this.g = aVar;
    }

    @Override // com.sankuai.waimai.sa.ui.assistant.voice.c
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b69ab88645e543bc0d6d77ec076ce1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b69ab88645e543bc0d6d77ec076ce1b");
            return;
        }
        if (this.e != null) {
            this.e.destroy("UDmhmjQvWg5BLV6BDuKY/FDA2RWrAe0mpupuPdPElXg=", this.c);
        }
        if (this.d != null) {
            this.d.destroy();
        }
    }
}
