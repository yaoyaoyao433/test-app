package com.heytap.mcssdk.e;

import android.content.Context;
import com.heytap.mcssdk.f.d;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
/* loaded from: classes2.dex */
public final class b implements c {
    @Override // com.heytap.mcssdk.e.c
    public final void a(final Context context, BaseMode baseMode, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            final DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                d.b(new Runnable() { // from class: com.heytap.mcssdk.e.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        iDataMessageCallBackService.processMessage(context, dataMessage);
                    }
                });
            }
        }
    }
}
