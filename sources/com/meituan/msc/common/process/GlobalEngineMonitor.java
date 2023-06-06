package com.meituan.msc.common.process;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.msc.common.process.b;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class GlobalEngineMonitor {
    public static ChangeQuickRedirect a;
    private static final GlobalEngineMonitor b = new GlobalEngineMonitor();
    private final a c;
    private final Map<String, AppEngineRecord> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(AppEngineRecord appEngineRecord);

        void a(String str);
    }

    public static GlobalEngineMonitor a() {
        return b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AppEngineRecord implements Parcelable {
        public static final Parcelable.Creator<AppEngineRecord> CREATOR = new Parcelable.Creator<AppEngineRecord>() { // from class: com.meituan.msc.common.process.GlobalEngineMonitor.AppEngineRecord.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AppEngineRecord createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f55ac7c2f14a7d6f6bc2408d5a25594", RobustBitConfig.DEFAULT_VALUE) ? (AppEngineRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f55ac7c2f14a7d6f6bc2408d5a25594") : new AppEngineRecord(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AppEngineRecord[] newArray(int i) {
                return new AppEngineRecord[i];
            }
        };
        public static ChangeQuickRedirect a;
        public final int b;
        public final String c;
        public final com.meituan.msc.common.process.a d;
        public boolean e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public AppEngineRecord(int i, String str, com.meituan.msc.common.process.a aVar, boolean z) {
            Object[] objArr = {Integer.valueOf(i), str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0085a6c59b866722f22461642a3fd6aa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0085a6c59b866722f22461642a3fd6aa");
                return;
            }
            this.b = i;
            this.c = str;
            this.d = aVar;
            this.e = z;
        }

        public AppEngineRecord(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c050097d621fbbadf0a2908d6c264529", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c050097d621fbbadf0a2908d6c264529");
                return;
            }
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.d = (com.meituan.msc.common.process.a) Enum.valueOf(com.meituan.msc.common.process.a.class, parcel.readString());
            this.e = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "643de7f6667fb0bfe8f917bc981e438c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "643de7f6667fb0bfe8f917bc981e438c");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d.name());
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        }
    }

    public GlobalEngineMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7688c133873907aa2193b56b6ea07b69", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7688c133873907aa2193b56b6ea07b69");
            return;
        }
        this.c = (a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.MAIN);
        this.d = new ConcurrentHashMap();
        if (com.meituan.msc.common.process.a.f()) {
            com.meituan.msc.common.process.b.a(new b.a() { // from class: com.meituan.msc.common.process.GlobalEngineMonitor.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.common.process.b.a
                public final void a(com.meituan.msc.common.process.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "462aaa8d37af976844a7834804fbe82a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "462aaa8d37af976844a7834804fbe82a");
                        return;
                    }
                    for (AppEngineRecord appEngineRecord : new ArrayList(GlobalEngineMonitor.this.d.values())) {
                        if (appEngineRecord.d == aVar) {
                            g.d("GlobalEngineMonitor", "record engine destroy by process die");
                            GlobalEngineMonitor.this.a(com.meituan.msc.common.process.a.a());
                        }
                    }
                }
            });
        }
    }

    public final void a(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11dd4e6007d42fdcbad5d19d93864086", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11dd4e6007d42fdcbad5d19d93864086");
        } else {
            b(hVar, z);
        }
    }

    public void b(h hVar, boolean z) {
        Object[] objArr = {hVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56faca25f43d654932e3a7f18038b2a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56faca25f43d654932e3a7f18038b2a3");
        } else {
            a(new AppEngineRecord(hVar.c, hVar.a(), com.meituan.msc.common.process.a.e(), z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppEngineRecord appEngineRecord) {
        Object[] objArr = {appEngineRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ac620dc2031e012b1d2893a87560538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ac620dc2031e012b1d2893a87560538");
            return;
        }
        g.d("GlobalEngineMonitor", "recordEngineUpdate: ", Integer.valueOf(appEngineRecord.b), ", appId: ", appEngineRecord.c, ", ", appEngineRecord.d);
        if (!com.meituan.msc.common.process.a.f()) {
            this.c.a(appEngineRecord);
        } else {
            this.d.put(com.meituan.msc.common.process.a.a(), appEngineRecord);
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6497cc1383bf05207294417b7ff8d20b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6497cc1383bf05207294417b7ff8d20b");
        } else if (!com.meituan.msc.common.process.a.f()) {
            this.c.a(str);
        } else {
            g.d("GlobalEngineMonitor", "recordEngineDestroy: ", str);
            if (this.d.remove(str) == null) {
                g.a("GlobalEngineMonitor", "recordEngineDestroy: engine id " + str + " not found");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.common.process.GlobalEngineMonitor.a
        public final void a(AppEngineRecord appEngineRecord) {
            Object[] objArr = {appEngineRecord};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce9d6ade7dc12e525e2c1d5948cd6361", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce9d6ade7dc12e525e2c1d5948cd6361");
            } else {
                GlobalEngineMonitor.a().a(appEngineRecord);
            }
        }

        @Override // com.meituan.msc.common.process.GlobalEngineMonitor.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "553cd9ce11cb9d7a98cc0346ec71b604", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "553cd9ce11cb9d7a98cc0346ec71b604");
            } else {
                GlobalEngineMonitor.a().a(str);
            }
        }
    }
}
