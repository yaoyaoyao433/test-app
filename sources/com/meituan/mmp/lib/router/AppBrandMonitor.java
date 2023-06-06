package com.meituan.mmp.lib.router;

import android.annotation.SuppressLint;
import android.arch.lifecycle.d;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.meituan.mmp.lib.AppBrandHeraActivity;
import com.meituan.mmp.lib.HeraActivity;
import com.meituan.mmp.lib.MMPWidgetFragment;
import com.meituan.mmp.lib.mp.ipc.IPCInvoke;
import com.meituan.mmp.lib.utils.ar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: ProGuard */
@UiThread
/* loaded from: classes3.dex */
public final class AppBrandMonitor {
    public static ChangeQuickRedirect a;
    public static AppBrandMonitor e = new AppBrandMonitor();
    public final List<ActivityRecord> b;
    public final List<ActivityRecord> c;
    public final List<c> d;
    public a f;

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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12189688a71dc1981838eef54b1af5f9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12189688a71dc1981838eef54b1af5f9");
            return;
        }
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.f = (a) IPCInvoke.a(b.class, com.meituan.mmp.lib.mp.a.MAIN);
    }

    public static /* synthetic */ void a(AppBrandMonitor appBrandMonitor, int i, d.b bVar, boolean z) {
        Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, appBrandMonitor, changeQuickRedirect, false, "1a70e884e97143eae20a4d07c02de6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, appBrandMonitor, changeQuickRedirect, false, "1a70e884e97143eae20a4d07c02de6eb");
            return;
        }
        a(appBrandMonitor.b, i, bVar, z);
        appBrandMonitor.a(i, bVar, z);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        public String b;
        public int c;

        public c(String str, MMPWidgetFragment mMPWidgetFragment) {
            Object[] objArr = {str, mMPWidgetFragment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35127e1eea59d7debe631ddabf4e3b4b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35127e1eea59d7debe631ddabf4e3b4b");
                return;
            }
            this.b = str;
            this.c = mMPWidgetFragment.getId();
        }

        public final boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586eb5a700d42542ca38e8c45002f047", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586eb5a700d42542ca38e8c45002f047")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.c == cVar.c && Objects.equals(this.b, cVar.b);
        }

        public final int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8482e5ca32094ba591d18f2c4ebbffc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8482e5ca32094ba591d18f2c4ebbffc")).intValue() : Objects.hash(this.b, Integer.valueOf(this.c));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ActivityRecord implements Parcelable {
        public static final Parcelable.Creator<ActivityRecord> CREATOR = new Parcelable.Creator<ActivityRecord>() { // from class: com.meituan.mmp.lib.router.AppBrandMonitor.ActivityRecord.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ActivityRecord createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eb36f4a52690ebfcf2acc459e4677ab", RobustBitConfig.DEFAULT_VALUE) ? (ActivityRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eb36f4a52690ebfcf2acc459e4677ab") : new ActivityRecord(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ActivityRecord[] newArray(int i) {
                return new ActivityRecord[i];
            }
        };
        public static ChangeQuickRedirect a;
        public String b;
        public int c;
        public Class<? extends HeraActivity> d;
        public com.meituan.mmp.lib.router.a e;
        public d.b f;
        public boolean g;
        @Nullable
        public WeakReference<HeraActivity> h;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public ActivityRecord(String str, HeraActivity heraActivity) {
            Object[] objArr = {str, heraActivity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da2990b8e3b79ec5786bb0c81c7de147", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da2990b8e3b79ec5786bb0c81c7de147");
                return;
            }
            this.f = d.b.CREATED;
            this.b = str;
            this.c = heraActivity.i();
            this.d = heraActivity.getClass();
            this.e = AppBrandRouterCenter.a(heraActivity);
            this.h = new WeakReference<>(heraActivity);
        }

        public ActivityRecord(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "033ba035f470ed64a33581c40ed634a2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "033ba035f470ed64a33581c40ed634a2");
                return;
            }
            this.f = d.b.CREATED;
            this.b = parcel.readString();
            this.c = parcel.readInt();
            this.d = (Class) ar.a(parcel.readString());
            this.e = (com.meituan.mmp.lib.router.a) Enum.valueOf(com.meituan.mmp.lib.router.a.class, parcel.readString());
            this.f = (d.b) Enum.valueOf(d.b.class, parcel.readString());
            this.g = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e3ff3def7de873f90081830ac5431eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e3ff3def7de873f90081830ac5431eb");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d2cd6204b17b242481e669d4eb14009", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d2cd6204b17b242481e669d4eb14009")).booleanValue();
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
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8229b2544a5ac3704922eb7e98becf7c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8229b2544a5ac3704922eb7e98becf7c")).intValue() : Objects.hash(this.b, Integer.valueOf(this.c));
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3572f9c8c6d2d1e70d8f1ea32845ea46", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3572f9c8c6d2d1e70d8f1ea32845ea46")).booleanValue();
            }
            if (this.f.a(d.b.CREATED) || this.g) {
                HeraActivity heraActivity = this.h != null ? this.h.get() : null;
                return heraActivity == null || !heraActivity.isFinishing();
            }
            return false;
        }

        public final com.meituan.mmp.lib.mp.a b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35f14efaf4a339b2cc2fd37ecd8065b4", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.mmp.lib.mp.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35f14efaf4a339b2cc2fd37ecd8065b4") : com.meituan.mmp.lib.router.a.a(this.d);
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57af40f7fa5528dd1b7ad08c803f2d54", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57af40f7fa5528dd1b7ad08c803f2d54");
            }
            return "ActivityRecord{appId='" + this.b + "', activityId=" + this.c + ", activityClass=" + this.d + ", task=" + this.e + ", state=" + this.f + ", willRecreate=" + this.g + ", activityRef=" + this.h + '}';
        }
    }

    public void a(ActivityRecord activityRecord) {
        Object[] objArr = {activityRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8b1ab4b67e5a671584189726b12df2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8b1ab4b67e5a671584189726b12df2");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("AppBrandMonitor", "recordLastUsedActivity: " + activityRecord.d.getSimpleName() + ", activityId: " + activityRecord.c + ", appId: " + activityRecord.b);
        this.b.remove(activityRecord);
        this.b.add(activityRecord);
        b(activityRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ActivityRecord activityRecord) {
        Object[] objArr = {activityRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91f59b27911273652cb9639ecaa90489", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91f59b27911273652cb9639ecaa90489");
        } else if (com.meituan.mmp.lib.mp.a.f()) {
            this.c.remove(activityRecord);
            this.c.add(activityRecord);
        } else {
            this.f.a(activityRecord);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, d.b bVar, boolean z) {
        Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0beb853b96248e3b14908e14aba376c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0beb853b96248e3b14908e14aba376c9");
        } else if (com.meituan.mmp.lib.mp.a.f()) {
            a(this.c, i, bVar, z);
        } else {
            this.f.a(i, bVar, z);
        }
    }

    private static void a(Collection<ActivityRecord> collection, int i, d.b bVar, boolean z) {
        Object[] objArr = {collection, Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82eb8c9db82657dd8a423156d324e3c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82eb8c9db82657dd8a423156d324e3c5");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6683643d6159d963d660250074695fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6683643d6159d963d660250074695fd");
            return;
        }
        for (ActivityRecord activityRecord : collection) {
            if (activityRecord.c == i) {
                collection.remove(activityRecord);
            }
        }
    }

    private static ActivityRecord a(List<ActivityRecord> list, String str) {
        Object[] objArr = {list, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6073ccceabad77a7f85b53b668197ffe", RobustBitConfig.DEFAULT_VALUE)) {
            return (ActivityRecord) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6073ccceabad77a7f85b53b668197ffe");
        }
        ListIterator<ActivityRecord> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            com.meituan.mmp.lib.trace.b.a("AppBrandMonitor", "getLastRecordByAppId", listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            ActivityRecord previous = listIterator.previous();
            if (TextUtils.equals(previous.b, str)) {
                return previous;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d246dd7d1cbfcaa3298ea0ee4b0714", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d246dd7d1cbfcaa3298ea0ee4b0714");
        } else if (com.meituan.mmp.lib.mp.a.f()) {
            a(this.c, i);
        } else {
            this.f.a(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class b implements a {
        public static ChangeQuickRedirect a;

        @Override // com.meituan.mmp.lib.router.AppBrandMonitor.a
        public final void a(ActivityRecord activityRecord) {
            Object[] objArr = {activityRecord};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40934722aacaf7cc11eb0f0c67ddcbc2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40934722aacaf7cc11eb0f0c67ddcbc2");
            } else {
                AppBrandMonitor.e.b(activityRecord);
            }
        }

        @Override // com.meituan.mmp.lib.router.AppBrandMonitor.a
        public final void a(int i, d.b bVar, boolean z) {
            Object[] objArr = {Integer.valueOf(i), bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1b554293354b03150460d0daab049d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1b554293354b03150460d0daab049d");
            } else {
                AppBrandMonitor.e.a(i, bVar, z);
            }
        }

        @Override // com.meituan.mmp.lib.router.AppBrandMonitor.a
        public final void a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca03b94a53fbe561136b5000f0bbda13", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca03b94a53fbe561136b5000f0bbda13");
            } else {
                AppBrandMonitor.e.a(i);
            }
        }

        @Override // com.meituan.mmp.lib.router.AppBrandMonitor.a
        public final void a(List<ActivityRecord> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86570306217d6580d7d191b1ea8b96a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86570306217d6580d7d191b1ea8b96a9");
            } else {
                AppBrandMonitor.e.c.addAll(0, list);
            }
        }
    }

    @NonNull
    public final List<com.meituan.mmp.lib.router.a> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b7e5edf7c78b6e8dff395d39da6584", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b7e5edf7c78b6e8dff395d39da6584");
        }
        LinkedList linkedList = new LinkedList();
        for (ActivityRecord activityRecord : this.c) {
            if (activityRecord.a()) {
                com.meituan.mmp.lib.router.a aVar = activityRecord.e;
                linkedList.remove(aVar);
                linkedList.add(linkedList.size(), aVar);
            }
        }
        return linkedList;
    }

    @Nullable
    public final com.meituan.mmp.lib.router.a b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69dfcb578cd1e656897f362dfe47976c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.mmp.lib.router.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69dfcb578cd1e656897f362dfe47976c");
        }
        for (ActivityRecord activityRecord : this.c) {
            if (AppBrandHeraActivity.class.isAssignableFrom(activityRecord.d)) {
                return activityRecord.e;
            }
        }
        return null;
    }

    public final HeraActivity a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "03df8e792abcb4c4ece947bb092e8215", RobustBitConfig.DEFAULT_VALUE) ? (HeraActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "03df8e792abcb4c4ece947bb092e8215") : c(a(this.b, str));
    }

    @Nullable
    private static HeraActivity c(@Nullable ActivityRecord activityRecord) {
        Object[] objArr = {activityRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2dfa694d1c4765238a023c6dc3b402b", RobustBitConfig.DEFAULT_VALUE)) {
            return (HeraActivity) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2dfa694d1c4765238a023c6dc3b402b");
        }
        if (activityRecord == null) {
            return null;
        }
        HeraActivity heraActivity = activityRecord.h != null ? activityRecord.h.get() : null;
        if (heraActivity == null || !activityRecord.a() || heraActivity.isDestroyed()) {
            return null;
        }
        return heraActivity;
    }

    @Nullable
    public final ActivityRecord b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "feeb05c4e233dd56c23461946478c353", RobustBitConfig.DEFAULT_VALUE) ? (ActivityRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "feeb05c4e233dd56c23461946478c353") : a(this.c, str);
    }

    @Nullable
    public final c c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cba6e18ea05caeedea8632f61e220934", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cba6e18ea05caeedea8632f61e220934");
        }
        List<c> list = this.d;
        Object[] objArr2 = {list, str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6ca5c65b2bb64311ecf87d2707241904", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6ca5c65b2bb64311ecf87d2707241904");
        }
        ListIterator<c> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            com.meituan.mmp.lib.trace.b.a("AppBrandMonitor", "getLastWidgetRecordByAppId", listIterator.next());
        }
        while (listIterator.hasPrevious()) {
            c previous = listIterator.previous();
            if (TextUtils.equals(previous.b, str)) {
                return previous;
            }
        }
        return null;
    }

    public final Class<? extends AppBrandHeraActivity> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0f0f119683411c331786e0dff4f0c42", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0f0f119683411c331786e0dff4f0c42");
        }
        ActivityRecord a2 = a(this.c, str);
        if (a2 == null || !AppBrandHeraActivity.class.isAssignableFrom(a2.d)) {
            return null;
        }
        return a2.d;
    }

    @NonNull
    public final List<com.meituan.mmp.lib.router.a> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1dd92e69d23d1ca272c60c59e6fb62", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1dd92e69d23d1ca272c60c59e6fb62");
        }
        List<com.meituan.mmp.lib.router.a> a2 = com.meituan.mmp.lib.router.a.a();
        a2.removeAll(a());
        return a2;
    }

    @Nullable
    public final Class<? extends AppBrandHeraActivity> a(Class<? extends d> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed75704dbb547300a2cdaa71c19eb9a5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed75704dbb547300a2cdaa71c19eb9a5");
        }
        if (AppBrandHeraActivity.class.isAssignableFrom(cls)) {
            return com.meituan.mmp.lib.router.a.b(cls).a(false);
        }
        try {
            return cls.newInstance().a();
        } catch (Exception e2) {
            com.meituan.mmp.lib.trace.b.a(e2);
            return null;
        }
    }
}
