package org.simalliance.openmobileapi;

import android.os.RemoteException;
import java.io.IOException;
import org.simalliance.openmobileapi.service.ISmartcardServiceReader;
import org.simalliance.openmobileapi.service.ISmartcardServiceSession;
import org.simalliance.openmobileapi.service.SmartcardError;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class b {
    final c a;
    private final String d;
    final Object c = new Object();
    ISmartcardServiceReader b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(c cVar, String str) {
        this.d = str;
        this.a = cVar;
    }

    public final d a() throws IOException {
        d dVar;
        if (this.a == null || !this.a.a()) {
            throw new IllegalStateException("service is not connected");
        }
        if (this.b == null) {
            try {
                this.b = this.a.a(this.d);
            } catch (Exception unused) {
                throw new IOException("service reader cannot be accessed.");
            }
        }
        synchronized (this.c) {
            SmartcardError smartcardError = new SmartcardError();
            try {
                ISmartcardServiceSession openSession = this.b.openSession(smartcardError);
                c.a(smartcardError);
                if (openSession == null) {
                    throw new IOException("service session is null.");
                }
                dVar = new d(this.a, openSession, this);
            } catch (RemoteException e) {
                throw new IOException(e.getMessage());
            }
        }
        return dVar;
    }
}
