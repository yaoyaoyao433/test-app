package com.meituan.mmp.lib.mp;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.mmp.lib.engine.j;
import com.meituan.mmp.lib.engine.m;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.lib.mp.b;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class GlobalEngineMonitor {
    public static ChangeQuickRedirect a;
    private static final GlobalEngineMonitor b = new GlobalEngineMonitor();
    private final a c;
    private final Map<Integer, AppEngineRecord> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i);

        void a(AppEngineRecord appEngineRecord);

        void a(String str);
    }

    public static GlobalEngineMonitor a() {
        return b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class AppEngineRecord implements Parcelable {
        public static final Parcelable.Creator<AppEngineRecord> CREATOR = new Parcelable.Creator<AppEngineRecord>() { // from class: com.meituan.mmp.lib.mp.GlobalEngineMonitor.AppEngineRecord.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AppEngineRecord createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d504cd6d9b934d974894466f4b5e1395", RobustBitConfig.DEFAULT_VALUE) ? (AppEngineRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d504cd6d9b934d974894466f4b5e1395") : new AppEngineRecord(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AppEngineRecord[] newArray(int i) {
                return new AppEngineRecord[i];
            }
        };
        public static ChangeQuickRedirect a;
        public final int b;
        public final String c;
        public final com.meituan.mmp.lib.mp.a d;
        public boolean e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public AppEngineRecord(int i, String str, com.meituan.mmp.lib.mp.a aVar, boolean z) {
            Object[] objArr = {Integer.valueOf(i), str, aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba8fddc7c0b49baaf727bdd19eae3ad1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba8fddc7c0b49baaf727bdd19eae3ad1");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2f99a068e67e3dc4b4071d8229ac3d3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2f99a068e67e3dc4b4071d8229ac3d3");
                return;
            }
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.d = (com.meituan.mmp.lib.mp.a) Enum.valueOf(com.meituan.mmp.lib.mp.a.class, parcel.readString());
            this.e = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c4341952f1dd8bbccd8e47845d8c8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c4341952f1dd8bbccd8e47845d8c8c");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d.name());
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95519a337a4984bbbf0eaf86a694a3b2", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95519a337a4984bbbf0eaf86a694a3b2");
            }
            return "AppEngineRecord{engineId=" + this.b + ", appId='" + this.c + "', process=" + this.d + ", isKeepAlive=" + this.e + '}';
        }
    }

    public GlobalEngineMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896641cbd6d691171f92cb0aa418dbf5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896641cbd6d691171f92cb0aa418dbf5");
            return;
        }
        this.c = (a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN);
        this.d = new ConcurrentHashMap();
        if (com.meituan.mmp.lib.mp.a.f()) {
            com.meituan.mmp.lib.mp.b.a(new b.a() { // from class: com.meituan.mmp.lib.mp.GlobalEngineMonitor.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.lib.mp.b.a
                public final void a(com.meituan.mmp.lib.mp.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8022e9dc34d402cf5a9d725baaa6e71b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8022e9dc34d402cf5a9d725baaa6e71b");
                        return;
                    }
                    for (AppEngineRecord appEngineRecord : new ArrayList(GlobalEngineMonitor.this.d.values())) {
                        if (appEngineRecord.d == aVar) {
                            com.meituan.mmp.lib.trace.b.b("GlobalEngineMonitor", "record engine destroy by process die");
                            GlobalEngineMonitor.this.a(appEngineRecord.b);
                        }
                    }
                }
            });
        }
    }

    @NonNull
    public final Collection<AppEngineRecord> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c05e6ae5d9ef3ed586eafac6d4d21c6", RobustBitConfig.DEFAULT_VALUE) ? (Collection) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c05e6ae5d9ef3ed586eafac6d4d21c6") : this.d.values();
    }

    @NonNull
    public final List<AppEngineRecord> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ce725c5a35e88cecc91ad0d58874b61", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ce725c5a35e88cecc91ad0d58874b61");
        }
        ArrayList arrayList = new ArrayList();
        for (AppEngineRecord appEngineRecord : this.d.values()) {
            if (str == null || TextUtils.equals(str, appEngineRecord.c)) {
                com.meituan.mmp.lib.trace.b.a("GlobalEngineMonitor", "getAppEngineRecordsByConditions", appEngineRecord);
                arrayList.add(appEngineRecord);
            }
        }
        return arrayList;
    }

    @Nullable
    public final AppEngineRecord a(List<AppEngineRecord> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d5923b1a3b7394d0ef6292b740abc7", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppEngineRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d5923b1a3b7394d0ef6292b740abc7");
        }
        for (AppEngineRecord appEngineRecord : list) {
            com.meituan.mmp.lib.trace.b.a("GlobalEngineMonitor", "hasMainProcessAppEngineRecords", appEngineRecord);
            if (appEngineRecord.d == com.meituan.mmp.lib.mp.a.MAIN) {
                return appEngineRecord;
            }
        }
        return null;
    }

    @Nullable
    public final AppEngineRecord b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940c56da7e38567535a35b410a5fbaa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AppEngineRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940c56da7e38567535a35b410a5fbaa0");
        }
        List<AppEngineRecord> a2 = a(str);
        if (a2.isEmpty()) {
            return null;
        }
        AppEngineRecord a3 = a(a2);
        return a3 == null ? a2.get(0) : a3;
    }

    public final void a(m mVar, boolean z) {
        Object[] objArr = {mVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "283c34c8188b41bd4392efbcaac86b8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "283c34c8188b41bd4392efbcaac86b8b");
        } else {
            b(mVar, z);
        }
    }

    public void b(m mVar, boolean z) {
        Object[] objArr = {mVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05e83a54d0a3d09a2253b1c054b2acf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05e83a54d0a3d09a2253b1c054b2acf3");
        } else {
            a(new AppEngineRecord(mVar.c, mVar.b, com.meituan.mmp.lib.mp.a.e(), z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppEngineRecord appEngineRecord) {
        Object[] objArr = {appEngineRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01369318497a9732c2cfa81aa91df83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01369318497a9732c2cfa81aa91df83a");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("GlobalEngineMonitor", "recordEngineUpdate: " + appEngineRecord.b + ", appId: " + appEngineRecord.c + ", " + appEngineRecord.d);
        if (!com.meituan.mmp.lib.mp.a.f()) {
            this.c.a(appEngineRecord);
        } else {
            this.d.put(Integer.valueOf(appEngineRecord.b), appEngineRecord);
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fe0d4c99ae7c18c69e1e69a993bcb39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fe0d4c99ae7c18c69e1e69a993bcb39");
        } else if (!com.meituan.mmp.lib.mp.a.f()) {
            this.c.a(i);
        } else {
            com.meituan.mmp.lib.trace.b.b("GlobalEngineMonitor", "recordEngineDestroy: " + i);
            if (this.d.remove(Integer.valueOf(i)) == null) {
                com.meituan.mmp.lib.trace.b.d("GlobalEngineMonitor", "recordEngineDestroy: engine id " + i + " not found");
            }
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e096bf554ff9be482509bf3c73c9545", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e096bf554ff9be482509bf3c73c9545");
            return;
        }
        for (m mVar : j.b().values()) {
            if (TextUtils.equals(mVar.b, str)) {
                j.c(mVar);
            }
        }
        o.a(str);
        for (AppEngineRecord appEngineRecord : a(str)) {
            if (!appEngineRecord.d.c()) {
                ((a) IPCInvoke.a(b.class, appEngineRecord.d)).a(appEngineRecord.c);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.mp.GlobalEngineMonitor.a
        public final void a(AppEngineRecord appEngineRecord) {
            Object[] objArr = {appEngineRecord};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8c6cee029391892dddaad747d6a2816", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8c6cee029391892dddaad747d6a2816");
            } else {
                GlobalEngineMonitor.a().a(appEngineRecord);
            }
        }

        @Override // com.meituan.mmp.lib.mp.GlobalEngineMonitor.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f1a1282b01ede9ce81e421bbed55d84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f1a1282b01ede9ce81e421bbed55d84");
            } else {
                GlobalEngineMonitor.a().a(i);
            }
        }

        @Override // com.meituan.mmp.lib.mp.GlobalEngineMonitor.a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7feca7ce63411ce42593f5c0897aa9bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7feca7ce63411ce42593f5c0897aa9bb");
            } else {
                GlobalEngineMonitor.a().c(str);
            }
        }
    }
}
