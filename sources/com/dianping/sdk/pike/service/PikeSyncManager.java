package com.dianping.sdk.pike.service;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.dianping.sdk.pike.f;
import com.dianping.sdk.pike.packet.am;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class PikeSyncManager {
    public static ChangeQuickRedirect a;
    final Context b;
    final String c;
    final Map<String, Map<Integer, am>> d;
    private final q e;
    private final Map<String, com.dianping.nvtunnelkit.core.a<String, Integer>> f;

    public PikeSyncManager(Context context, q qVar, String str) {
        Object[] objArr = {context, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e394374adca376210e8ca2a59465f8d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e394374adca376210e8ca2a59465f8d0");
            return;
        }
        this.b = context;
        this.e = qVar;
        this.c = "bfe_pike_sync_" + str;
        this.f = new HashMap();
        this.d = new HashMap();
    }

    public final i a(@NonNull j jVar, @NonNull com.dianping.sdk.pike.message.e eVar) {
        int i;
        Object[] objArr = {jVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83c45f1f5e5f6739f5c82cc5d43d0982", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83c45f1f5e5f6739f5c82cc5d43d0982");
        }
        a();
        try {
            String str = jVar.d;
            if (eVar.d != null && eVar.d.length != 0) {
                if (com.dianping.nvtunnelkit.utils.f.a(str)) {
                    com.dianping.sdk.pike.i.a("PikeSyncManager", "sync push is invalid, bizId is empty");
                    return i.Invalid;
                }
                if (jVar.g > 0) {
                    jVar.f = a(str).b(Integer.valueOf(jVar.g));
                    if (com.dianping.nvtunnelkit.utils.f.a(jVar.f)) {
                        com.dianping.sdk.pike.i.a("PikeSyncManager", "sync push is invalid, topicInt: " + jVar.g);
                        return i.Invalid;
                    }
                    eVar.f = jVar.f;
                    if (b(str).containsKey(Integer.valueOf(jVar.g)) && jVar.h <= (i = b(str).get(Integer.valueOf(jVar.g)).c)) {
                        com.dianping.sdk.pike.i.a("PikeSyncManager", "sync push is repeat, current offset: " + i + ", push offset: " + jVar.h);
                        return i.Repeat;
                    }
                }
                return i.OK;
            }
            com.dianping.sdk.pike.i.a("PikeSyncManager", "sync  push is invalid, message is empty");
            return i.Message_NULL;
        } catch (Exception e) {
            com.dianping.sdk.pike.i.a("PikeSyncManager", "sync push is invalid", e);
            return i.Invalid;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public am a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c3a8e902afc9e7afb2af619289584c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (am) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c3a8e902afc9e7afb2af619289584c7");
        }
        am amVar = new am();
        amVar.b = i;
        amVar.c = i2;
        return amVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, TopicRecord topicRecord) {
        Object[] objArr = {str, str2, topicRecord};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1b519cb616d341ee5745b9fff81bda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1b519cb616d341ee5745b9fff81bda");
            return;
        }
        String str3 = "";
        if (com.dianping.sdk.pike.f.j == f.a.Beta) {
            str3 = "beta/";
        } else if (com.dianping.sdk.pike.f.j == f.a.Stage) {
            str3 = "stage/";
        }
        com.meituan.android.cipstorage.q.a(this.b, this.c, 2).a(str3 + str + "/" + str2, topicRecord);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec25baa2a321fe4697060a074fcf115d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec25baa2a321fe4697060a074fcf115d");
        } else {
            this.e.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.dianping.nvtunnelkit.core.a<String, Integer> a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659bcefc6b0c23a310658f9da746d882", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.nvtunnelkit.core.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659bcefc6b0c23a310658f9da746d882");
        }
        com.dianping.nvtunnelkit.core.a<String, Integer> aVar = this.f.get(str);
        if (aVar == null) {
            com.dianping.nvtunnelkit.core.a<String, Integer> aVar2 = new com.dianping.nvtunnelkit.core.a<>();
            this.f.put(str, aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<Integer, am> b(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dbd3c88c4db14a9a337a0db17995035", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dbd3c88c4db14a9a337a0db17995035");
        }
        Map<Integer, am> map = this.d.get(str);
        if (map == null) {
            HashMap hashMap = new HashMap();
            this.d.put(str, hashMap);
            return hashMap;
        }
        return map;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class TopicRecord implements Parcelable {
        public static final Parcelable.Creator<TopicRecord> CREATOR = new Parcelable.Creator<TopicRecord>() { // from class: com.dianping.sdk.pike.service.PikeSyncManager.TopicRecord.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ TopicRecord createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a0df9e52282cb54b07b9d94e3fd4556", RobustBitConfig.DEFAULT_VALUE)) {
                    return (TopicRecord) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a0df9e52282cb54b07b9d94e3fd4556");
                }
                TopicRecord topicRecord = new TopicRecord();
                topicRecord.b = parcel.readInt();
                topicRecord.c = parcel.readInt();
                return topicRecord;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ TopicRecord[] newArray(int i) {
                return new TopicRecord[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;
        public int c;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public TopicRecord() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2af5791c381ec4c4c47c6d807dd6215", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2af5791c381ec4c4c47c6d807dd6215");
                return;
            }
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
        }
    }
}
