package com.meituan.msc.modules.container.router;

import android.annotation.SuppressLint;
import android.arch.lifecycle.OnLifecycleEvent;
import android.arch.lifecycle.d;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.UiThread;
import com.meituan.msc.common.process.ipc.IPCInvoke;
import com.meituan.msc.common.utils.ao;
import com.meituan.msc.modules.container.LifecycleActivity;
import com.meituan.msc.modules.container.MSCActivity;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes3.dex */
public final class AppBrandMonitor {
    public static ChangeQuickRedirect a;
    public static AppBrandMonitor d = new AppBrandMonitor();
    public final List<ActivityRecord> b;
    public final List<ActivityRecord> c;
    public a e;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(int i);

        void a(int i, d.b bVar, boolean z);

        void a(ActivityRecord activityRecord);

        void a(List<ActivityRecord> list);
    }

    public AppBrandMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aedaf9f3d515a1b65b0402332d5bb20a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aedaf9f3d515a1b65b0402332d5bb20a");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.e = (a) IPCInvoke.a(b.class, com.meituan.msc.common.process.a.MAIN);
    }

    public static /* synthetic */ void a(AppBrandMonitor appBrandMonitor, int i, d.b bVar, boolean z) {
        Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, appBrandMonitor, changeQuickRedirect, false, "e3a6690fdb32e0ef9d4f10c5af7353c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, appBrandMonitor, changeQuickRedirect, false, "e3a6690fdb32e0ef9d4f10c5af7353c9");
            return;
        }
        a(appBrandMonitor.b, i, bVar, z);
        appBrandMonitor.a(i, bVar, z);
    }

    public static /* synthetic */ void a(AppBrandMonitor appBrandMonitor, ActivityRecord activityRecord) {
        Object[] objArr = {activityRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, appBrandMonitor, changeQuickRedirect, false, "731b2063b456e944d9b4344eda6541db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, appBrandMonitor, changeQuickRedirect, false, "731b2063b456e944d9b4344eda6541db");
            return;
        }
        g.d("AppBrandMonitor", "recordLastUsedActivity: ", activityRecord.d.getSimpleName() + ", activityId: " + activityRecord.c + ", appId: " + activityRecord.b);
        appBrandMonitor.b.remove(activityRecord);
        appBrandMonitor.b.add(activityRecord);
        appBrandMonitor.a(activityRecord);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ActivityRecord implements Parcelable {
        public static final Parcelable.Creator<ActivityRecord> CREATOR = new Parcelable.Creator<ActivityRecord>() { // from class: com.meituan.msc.modules.container.router.AppBrandMonitor.ActivityRecord.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ActivityRecord createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d1fef1020234e651932e329b30b3939", RobustBitConfig.DEFAULT_VALUE) ? (ActivityRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d1fef1020234e651932e329b30b3939") : new ActivityRecord(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ActivityRecord[] newArray(int i) {
                return new ActivityRecord[i];
            }
        };
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public Class<? extends MSCActivity> d;
        public com.meituan.msc.modules.container.router.a e;
        public d.b f;
        public boolean g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActivityRecord(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7495ee5f675fced01196a9df5bbeb1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7495ee5f675fced01196a9df5bbeb1");
                return;
            }
            this.f = d.b.CREATED;
            this.b = parcel.readString();
            this.c = parcel.readInt();
            this.d = (Class) ao.a(parcel.readString());
            this.e = (com.meituan.msc.modules.container.router.a) Enum.valueOf(com.meituan.msc.modules.container.router.a.class, parcel.readString());
            this.f = (d.b) Enum.valueOf(d.b.class, parcel.readString());
            this.g = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbe563738f6fadd48b56240fb31d0963", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbe563738f6fadd48b56240fb31d0963");
                return;
            }
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d.getName());
            parcel.writeString(this.e.name());
            parcel.writeString(this.f.name());
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04a60907677829ce06991dfdd28f376", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04a60907677829ce06991dfdd28f376")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ActivityRecord activityRecord = (ActivityRecord) obj;
            return this.c == activityRecord.c && this.b.equals(activityRecord.b);
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ae09c949f8a8979a06fcbd770ad7ed", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ae09c949f8a8979a06fcbd770ad7ed")).intValue() : Objects.hash(this.b, Integer.valueOf(this.c));
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.container.router.AppBrandMonitor$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements e {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ MSCActivity b;
        public final /* synthetic */ ActivityRecord c;
        public final /* synthetic */ AppBrandMonitor d;

        @OnLifecycleEvent(d.a.ON_ANY)
        public void onEvent(f fVar, d.a aVar) {
            Object[] objArr = {fVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e12d10e921a0e81fb5d2ca82d460358d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e12d10e921a0e81fb5d2ca82d460358d");
                return;
            }
            AppBrandMonitor.a(this.d, this.b.p(), LifecycleActivity.a(aVar), aVar == d.a.ON_DESTROY && !this.b.isFinishing());
            if (aVar == d.a.ON_RESUME) {
                AppBrandMonitor.a(this.d, this.c);
            }
            if (aVar == d.a.ON_DESTROY && this.b.isFinishing()) {
                AppBrandMonitor appBrandMonitor = this.d;
                MSCActivity mSCActivity = this.b;
                Object[] objArr2 = {mSCActivity};
                ChangeQuickRedirect changeQuickRedirect2 = AppBrandMonitor.a;
                if (PatchProxy.isSupport(objArr2, appBrandMonitor, changeQuickRedirect2, false, "51ea43a64664cc8cc8fbf514a2cfeaf5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, appBrandMonitor, changeQuickRedirect2, false, "51ea43a64664cc8cc8fbf514a2cfeaf5");
                    return;
                }
                g.d("AppBrandMonitor", "removeFinishingActivity: appId: ", mSCActivity.m().v());
                AppBrandMonitor.a(appBrandMonitor.b, mSCActivity.p());
                appBrandMonitor.a(mSCActivity.p());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ActivityRecord activityRecord) {
        Object[] objArr = {activityRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def6a9583de3db8eff8d172b4d6f4ffd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def6a9583de3db8eff8d172b4d6f4ffd");
        } else if (com.meituan.msc.common.process.a.f()) {
            this.c.remove(activityRecord);
            this.c.add(activityRecord);
        } else {
            this.e.a(activityRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, d.b bVar, boolean z) {
        Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b212cbda0cb57b1e614ac2ac419bb6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b212cbda0cb57b1e614ac2ac419bb6c");
        } else if (com.meituan.msc.common.process.a.f()) {
            a(this.c, i, bVar, z);
        } else {
            this.e.a(i, bVar, z);
        }
    }

    private static void a(Collection<ActivityRecord> collection, int i, d.b bVar, boolean z) {
        Object[] objArr = {collection, Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7317b5405e38b4b4f90d544fc8b85c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7317b5405e38b4b4f90d544fc8b85c4");
            return;
        }
        for (ActivityRecord activityRecord : collection) {
            if (activityRecord.c == i) {
                activityRecord.f = bVar;
                activityRecord.g = z;
                return;
            }
        }
    }

    @SuppressLint({"Iterator"})
    static void a(Collection<ActivityRecord> collection, int i) {
        Object[] objArr = {collection, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "117676bcba38cbbbbac568ceb7aa10a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "117676bcba38cbbbbac568ceb7aa10a4");
            return;
        }
        for (ActivityRecord activityRecord : collection) {
            if (activityRecord.c == i) {
                collection.remove(activityRecord);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca9d90143347fffb491e18cc900c429", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca9d90143347fffb491e18cc900c429");
        } else if (com.meituan.msc.common.process.a.f()) {
            a(this.c, i);
        } else {
            this.e.a(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.msc.modules.container.router.AppBrandMonitor.a
        public final void a(ActivityRecord activityRecord) {
            Object[] objArr = {activityRecord};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d382a59da38711e0692f4fc0d51657", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d382a59da38711e0692f4fc0d51657");
            } else {
                AppBrandMonitor.d.a(activityRecord);
            }
        }

        @Override // com.meituan.msc.modules.container.router.AppBrandMonitor.a
        public final void a(int i, d.b bVar, boolean z) {
            Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "897d64353049a7225671b897698b65bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "897d64353049a7225671b897698b65bb");
            } else {
                AppBrandMonitor.d.a(i, bVar, z);
            }
        }

        @Override // com.meituan.msc.modules.container.router.AppBrandMonitor.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88787fd2ee9c3dd15279ce9d0b874315", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88787fd2ee9c3dd15279ce9d0b874315");
            } else {
                AppBrandMonitor.d.a(i);
            }
        }

        @Override // com.meituan.msc.modules.container.router.AppBrandMonitor.a
        public final void a(List<ActivityRecord> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d003dc49258ba91095d72dfba46fc3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d003dc49258ba91095d72dfba46fc3");
            } else {
                AppBrandMonitor.d.c.addAll(0, list);
            }
        }
    }
}
