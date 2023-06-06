package org.simalliance.openmobileapi;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;
import java.security.AccessControlException;
import java.util.Collection;
import java.util.HashMap;
import org.simalliance.openmobileapi.service.ISmartcardService;
import org.simalliance.openmobileapi.service.ISmartcardServiceCallback;
import org.simalliance.openmobileapi.service.ISmartcardServiceReader;
import org.simalliance.openmobileapi.service.SmartcardError;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class c {
    final ISmartcardServiceCallback a;
    private final Object b;
    private final Context c;
    private volatile ISmartcardService d;
    private ServiceConnection e;
    private final HashMap<String, b> f;

    public final boolean a() {
        return this.d != null;
    }

    public final b[] b() {
        if (this.d == null) {
            throw new IllegalStateException("service not connected to system");
        }
        try {
            String[] readers = this.d.getReaders(new SmartcardError());
            this.f.clear();
            for (String str : readers) {
                this.f.put(str, new b(this, str));
            }
            Collection<b> values = this.f.values();
            return (b[]) values.toArray(new b[values.size()]);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        synchronized (this.b) {
            if (this.d != null) {
                for (b bVar : this.f.values()) {
                    try {
                    } catch (Exception unused) {
                    }
                    if (bVar.a == null || !bVar.a.a()) {
                        throw new IllegalStateException("service is not connected");
                    }
                    if (bVar.b != null) {
                        synchronized (bVar.c) {
                            SmartcardError smartcardError = new SmartcardError();
                            try {
                                bVar.b.closeSessions(smartcardError);
                                a(smartcardError);
                            } catch (RemoteException e) {
                                throw new RuntimeException(e.getMessage());
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            try {
                this.c.unbindService(this.e);
            } catch (IllegalArgumentException unused2) {
            }
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ISmartcardServiceReader a(String str) {
        SmartcardError smartcardError = new SmartcardError();
        try {
            ISmartcardServiceReader reader = this.d.getReader(str, smartcardError);
            a(smartcardError);
            return reader;
        } catch (RemoteException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void a(SmartcardError smartcardError) {
        try {
            smartcardError.c();
        } catch (AccessControlException e) {
            throw new SecurityException(e.getMessage());
        } catch (org.simalliance.openmobileapi.service.a e2) {
            throw new IllegalStateException(e2.getMessage());
        }
    }
}
