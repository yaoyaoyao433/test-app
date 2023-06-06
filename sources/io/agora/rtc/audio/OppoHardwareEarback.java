package io.agora.rtc.audio;

import android.content.Context;
import com.coloros.ocs.base.common.api.f;
import com.coloros.ocs.mediaunit.c;
import com.coloros.ocs.mediaunit.d;
import io.agora.rtc.internal.Logging;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class OppoHardwareEarback implements IHardwareEarback {
    private static String TAG = "AG-OPPO";
    private boolean isConnected = false;
    private Context mContext;

    @Override // io.agora.rtc.audio.IHardwareEarback
    public int setHardwareEarbackVolume(int i) {
        return 0;
    }

    public OppoHardwareEarback(Context context) {
        this.mContext = null;
        this.mContext = context;
        initialize();
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void initialize() {
        try {
            if (this.mContext != null) {
                c.a(this.mContext).a(new f() { // from class: io.agora.rtc.audio.OppoHardwareEarback.1
                    @Override // com.coloros.ocs.base.common.api.f
                    public void onConnectionSucceed() {
                        OppoHardwareEarback.this.isConnected = true;
                    }
                });
            }
        } catch (Exception e) {
            Logging.e(e.getMessage());
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public boolean isHardwareEarbackSupported() {
        return this.isConnected;
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public int enableEarbackFeature(boolean z) {
        try {
            if (this.mContext == null || !this.isConnected) {
                return -1;
            }
            if (z) {
                c.a(this.mContext).a(new f() { // from class: io.agora.rtc.audio.OppoHardwareEarback.2
                    @Override // com.coloros.ocs.base.common.api.f
                    public void onConnectionSucceed() {
                        if (OppoHardwareEarback.this.mContext != null) {
                            c.a(OppoHardwareEarback.this.mContext).a();
                        }
                    }
                });
                return 0;
            }
            c.a(this.mContext).a(new f() { // from class: io.agora.rtc.audio.OppoHardwareEarback.3
                @Override // com.coloros.ocs.base.common.api.f
                public void onConnectionSucceed() {
                    if (OppoHardwareEarback.this.mContext != null) {
                        c.a(OppoHardwareEarback.this.mContext).b();
                    }
                }
            });
            return 0;
        } catch (Exception e) {
            Logging.e(e.getMessage());
            return -1;
        }
    }

    @Override // io.agora.rtc.audio.IHardwareEarback
    public void destroy() {
        try {
            if (this.mContext != null) {
                c.a(this.mContext);
                d.c();
            }
        } catch (Exception e) {
            Logging.e(e.getMessage());
        }
    }
}
